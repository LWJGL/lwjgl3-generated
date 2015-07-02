/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to stb_image.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <h3>Quick notes</h3>
 * 
 * <p>Primarily of interest to game developers and other people who can avoid problematic images and only need the trivial interface. Supported formats:
 * <ul>
 * <li>JPEG baseline & progressive (12 bpc/arithmetic not supported, same as stock IJG lib</li>
 * <li>PNG 1/2/4/8-bit-per-channel (16 bpc not supported)</li>
 * <li>TGA (not sure what subset, if a subset)</li>
 * <li>BMP non-1bpp, non-RLE</li>
 * <li>PSD (composited view only, no extra channels)</li>
 * <li>GIF (*comp always reports as 4-channel)</li>
 * <li>HDR (radiance rgbE format)</li>
 * <li>PIC (Softimage PIC)</li>
 * <li>PNM (PPM and PGM binary only)</li>
 * </ul>
 * Features:
 * <ul>
 * <li>decode from memory <s>or through FILE (define STBI_NO_STDIO to remove code)</s></li>
 * <li>decode from arbitrary I/O callbacks</li>
 * <li>SIMD acceleration on x86/x64 (SSE2) and ARM (NEON)</li>
 * </ul></p>
 * 
 * <p>Limitations:
 * <ul>
 * <li>no 16-bit-per-channel PNG</li>
 * <li>no 12-bit-per-channel JPEG</li>
 * <li>no JPEGs with arithmetic coding</li>
 * <li>no 1-bit BMP</li>
 * <li>GIF always returns *comp=4</li>
 * </ul></p>
 * 
 * <p>Basic usage (see HDR discussion below for HDR usage):
 * <pre><code style="font-family: monospace">
 * int x,y,n;
 * unsigned char *data = stbi_load(filename, &x, &y, &n, 0);
 * // ... process data if not NULL ...
 * // ... x = width, y = height, n = # 8-bit components per pixel ...
 * // ... replace '0' with '1'..'4' to force that many components per pixel
 * // ... but 'n' will always be the number that it would have been if you said 0
 * stbi_image_free(data)</code></pre></p>
 * 
 * <h3>HDR image support</h3>
 * 
 * <p>stb_image now supports loading HDR images in general, and currently the Radiance .HDR file format, although the support is provided generically. You
 * can still load any file through the existing interface; if you attempt to load an HDR file, it will be automatically remapped to LDR, assuming gamma
 * 2.2 and an arbitrary scale factor defaulting to 1; both of these constants can be reconfigured through this interface:
 * <pre><code style="font-family: monospace">
 * stbi_hdr_to_ldr_gamma(2.2f);
 * stbi_hdr_to_ldr_scale(1.0f);</code></pre>
 * (note, do not use <em>inverse</em> constants; stbi_image will invert them appropriately).</p>
 * 
 * <p>Additionally, there is a new, parallel interface for loading files as (linear) floats to preserve the full dynamic range:
 * <pre><code style="font-family: monospace">
 * float *data = stbi_loadf(filename, &x, &y, &n, 0);</code></pre>
 * If you load LDR images through this interface, those images will be promoted to floating point values, run through the inverse of constants
 * corresponding to the above:
 * <pre><code style="font-family: monospace">
 * stbi_ldr_to_hdr_scale(1.0f);
 * stbi_ldr_to_hdr_gamma(2.2f);</code></pre>
 * Finally, given a filename (or an open file or memory block) containing image data, you can query for the "most appropriate" interface to use (that is,
 * whether the image is HDR or not), using:
 * <pre><code style="font-family: monospace">
 * stbi_is_hdr(char *filename);</code></pre></p>
 * 
 * <h3>iPhone PNG support</h3>
 * By default we convert iphone-formatted PNGs back to RGB, even though they are internally encoded differently. You can disable this conversion by
 * calling {@link #stbi_convert_iphone_png_to_rgb convert_iphone_png_to_rgb}(0), in which case you will always just get the native iphone "format" through (which is BGR stored in RGB).
 * 
 * <p>Call {@link #stbi_set_unpremultiply_on_load set_unpremultiply_on_load}(1) as well to force a divide per pixel to remove any premultiplied alpha *only* if the image file explicitly says
 * there's premultiplied data (currently only happens in iPhone images, and only if iPhone convert-to-rgb processing is on).</p>
 */
public final class STBImage {

	static { LWJGLUtil.initialize(); }

	private STBImage() {}

	// --- [ stbi_load ] ---

	/** JNI method for {@link #stbi_load load} */
	@JavadocExclude
	public static native long nstbi_load(long filename, long x, long y, long comp, int req_comp);

	/**
	 * Loads an image from the specified file.
	 * 
	 * <p>The return value from an image loader is an {@code 'unsigned char *'} which points to the pixel data, or {@code NULL} on an allocation failure or if the image
	 * is corrupt or invalid. The pixel data consists of {@code *y} scanlines of {@code *x} pixels, with each pixel consisting of N interleaved 8-bit
	 * components; the first pixel pointed to is top-left-most in the image. There is no padding between image scanlines or between pixels, regardless of
	 * format. The number of components N is {@code 'req_comp'} if {@code req_comp} is non-zero, or {@code *comp} otherwise. If {@code req_comp} is non-zero,
	 * {@code *comp} has the number of components that <i>would</i> have been output otherwise. E.g. if you set {@code req_comp} to 4, you will always get
	 * RGBA output, but you can check {@code *comp} to see if it's trivially opaque because e.g. there were only 3 channels in the source image.</p>
	 * 
	 * <p>An output image with N components has the following components interleaved in this order in each pixel:
	 * <pre><code style="font-family: monospace">
	 * N=#comp     components
	 *   1           grey
	 *   2           grey, alpha
	 *   3           red, green, blue
	 *   4           red, green, blue, alpha</code></pre>
	 * If image loading fails for any reason, the return value will be {@code NULL}, and {@code *x}, {@code *y}, {@code *comp} will be unchanged. The function
	 * {@link #stbi_failure_reason failure_reason} can be queried for an extremely brief, end-user unfriendly explanation of why the load failed.</p>
	 * 
	 * <p>Paletted PNG, BMP, GIF, and PIC images are automatically depalettized.</p>
	 *
	 * @param filename the file name
	 * @param x        outputs the image width in pixels
	 * @param y        outputs the image height in pixels
	 * @param comp     outputs number of components in image
	 * @param req_comp 0 or 1..4 to force that many components per pixel. One of:<br>0, 1, 2, 3, 4
	 */
	public static ByteBuffer stbi_load(ByteBuffer filename, ByteBuffer x, ByteBuffer y, ByteBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(filename);
			checkBuffer(x, 1 << 2);
			checkBuffer(y, 1 << 2);
			checkBuffer(comp, 1 << 2);
		}
		long __result = nstbi_load(memAddress(filename), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memByteBuffer(__result, x.getInt(x.position()) * y.getInt(y.position()) * comp.getInt(comp.position()));
	}

	/** Alternative version of: {@link #stbi_load load} */
	public static ByteBuffer stbi_load(ByteBuffer filename, IntBuffer x, IntBuffer y, IntBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		long __result = nstbi_load(memAddress(filename), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memByteBuffer(__result, x.get(x.position()) * y.get(y.position()) * comp.get(comp.position()));
	}

	/** CharSequence version of: {@link #stbi_load load} */
	public static ByteBuffer stbi_load(CharSequence filename, IntBuffer x, IntBuffer y, IntBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		long __result = nstbi_load(__buffer.address(filenameEncoded), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memByteBuffer(__result, x.get(x.position()) * y.get(y.position()) * comp.get(comp.position()));
	}

	// --- [ stbi_load_from_memory ] ---

	/** JNI method for {@link #stbi_load_from_memory load_from_memory} */
	@JavadocExclude
	public static native long nstbi_load_from_memory(long buffer, int len, long x, long y, long comp, int req_comp);

	/**
	 * In-memory version of {@link #stbi_load load}.
	 *
	 * @param buffer   the buffer from which to load the image data
	 * @param len      the buffer length, in bytes
	 * @param x        outputs the image width in pixels
	 * @param y        outputs the image height in pixels
	 * @param comp     outputs number of components in image
	 * @param req_comp 0 or 1..4 to force that many components per pixel. One of:<br>0, 1, 2, 3, 4
	 */
	public static ByteBuffer stbi_load_from_memory(ByteBuffer buffer, int len, ByteBuffer x, ByteBuffer y, ByteBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(buffer, len);
			checkBuffer(x, 1 << 2);
			checkBuffer(y, 1 << 2);
			checkBuffer(comp, 1 << 2);
		}
		long __result = nstbi_load_from_memory(memAddress(buffer), len, memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memByteBuffer(__result, x.getInt(x.position()) * y.getInt(y.position()) * comp.getInt(comp.position()));
	}

	/** Alternative version of: {@link #stbi_load_from_memory load_from_memory} */
	public static ByteBuffer stbi_load_from_memory(ByteBuffer buffer, IntBuffer x, IntBuffer y, IntBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		long __result = nstbi_load_from_memory(memAddress(buffer), buffer.remaining(), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memByteBuffer(__result, x.get(x.position()) * y.get(y.position()) * comp.get(comp.position()));
	}

	// --- [ stbi_load_from_callbacks ] ---

	/** JNI method for {@link #stbi_load_from_callbacks load_from_callbacks} */
	@JavadocExclude
	public static native long nstbi_load_from_callbacks(long clbk, long user, long x, long y, long comp, int req_comp);

	/**
	 * Callback version of {@link #stbi_load load}.
	 * 
	 * <p>I/O callbacks allow you to read from arbitrary sources, like packaged files or some other source. Data read from callbacks are processed through a
	 * small internal buffer (currently 128 bytes) to try to reduce overhead.</p>
	 * 
	 * <p>The three functions you must define are "read" (reads some bytes of data), "skip" (skips some bytes of data), "eof" (reports if the stream is at the
	 * end).</p>
	 *
	 * @param clbk     an {@link STBIIOCallbacks} struct
	 * @param user     a pointer to user data
	 * @param x        outputs the image width in pixels
	 * @param y        outputs the image height in pixels
	 * @param comp     outputs number of components in image
	 * @param req_comp 0 or 1..4 to force that many components per pixel. One of:<br>0, 1, 2, 3, 4
	 */
	public static ByteBuffer stbi_load_from_callbacks(ByteBuffer clbk, ByteBuffer user, ByteBuffer x, ByteBuffer y, ByteBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(clbk, STBIIOCallbacks.SIZEOF);
			checkBuffer(x, 1 << 2);
			checkBuffer(y, 1 << 2);
			checkBuffer(comp, 1 << 2);
		}
		long __result = nstbi_load_from_callbacks(memAddress(clbk), memAddressSafe(user), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memByteBuffer(__result, x.getInt(x.position()) * y.getInt(y.position()) * comp.getInt(comp.position()));
	}

	/** Alternative version of: {@link #stbi_load_from_callbacks load_from_callbacks} */
	public static ByteBuffer stbi_load_from_callbacks(ByteBuffer clbk, ByteBuffer user, IntBuffer x, IntBuffer y, IntBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(clbk, STBIIOCallbacks.SIZEOF);
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		long __result = nstbi_load_from_callbacks(memAddress(clbk), memAddressSafe(user), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memByteBuffer(__result, x.get(x.position()) * y.get(y.position()) * comp.get(comp.position()));
	}

	// --- [ stbi_loadf ] ---

	/** JNI method for {@link #stbi_loadf loadf} */
	@JavadocExclude
	public static native long nstbi_loadf(long filename, long x, long y, long comp, int req_comp);

	/**
	 * Floating-point version of {@link #stbi_load load}.
	 *
	 * @param filename the file name
	 * @param x        outputs the image width in pixels
	 * @param y        outputs the image height in pixels
	 * @param comp     outputs number of components in image
	 * @param req_comp 0 or 1..4 to force that many components per pixel. One of:<br>0, 1, 2, 3, 4
	 */
	public static FloatBuffer stbi_loadf(ByteBuffer filename, ByteBuffer x, ByteBuffer y, ByteBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(filename);
			checkBuffer(x, 1 << 2);
			checkBuffer(y, 1 << 2);
			checkBuffer(comp, 1 << 2);
		}
		long __result = nstbi_loadf(memAddress(filename), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memFloatBuffer(__result, x.getInt(x.position()) * y.getInt(y.position()) * comp.getInt(comp.position()));
	}

	/** Alternative version of: {@link #stbi_loadf loadf} */
	public static FloatBuffer stbi_loadf(ByteBuffer filename, IntBuffer x, IntBuffer y, IntBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		long __result = nstbi_loadf(memAddress(filename), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memFloatBuffer(__result, x.get(x.position()) * y.get(y.position()) * comp.get(comp.position()));
	}

	/** CharSequence version of: {@link #stbi_loadf loadf} */
	public static FloatBuffer stbi_loadf(CharSequence filename, IntBuffer x, IntBuffer y, IntBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		long __result = nstbi_loadf(__buffer.address(filenameEncoded), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memFloatBuffer(__result, x.get(x.position()) * y.get(y.position()) * comp.get(comp.position()));
	}

	// --- [ stbi_loadf_from_memory ] ---

	/** JNI method for {@link #stbi_loadf_from_memory loadf_from_memory} */
	@JavadocExclude
	public static native long nstbi_loadf_from_memory(long buffer, int len, long x, long y, long comp, int req_comp);

	/**
	 * Floating-point version of {@link #stbi_load_from_memory load_from_memory}.
	 *
	 * @param buffer   the buffer from which to load the image data
	 * @param len      the buffer length, in bytes
	 * @param x        outputs the image width in pixels
	 * @param y        outputs the image height in pixels
	 * @param comp     outputs number of components in image
	 * @param req_comp 0 or 1..4 to force that many components per pixel. One of:<br>0, 1, 2, 3, 4
	 */
	public static FloatBuffer stbi_loadf_from_memory(ByteBuffer buffer, int len, ByteBuffer x, ByteBuffer y, ByteBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(buffer, len);
			checkBuffer(x, 1 << 2);
			checkBuffer(y, 1 << 2);
			checkBuffer(comp, 1 << 2);
		}
		long __result = nstbi_loadf_from_memory(memAddress(buffer), len, memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memFloatBuffer(__result, x.getInt(x.position()) * y.getInt(y.position()) * comp.getInt(comp.position()));
	}

	/** Alternative version of: {@link #stbi_loadf_from_memory loadf_from_memory} */
	public static FloatBuffer stbi_loadf_from_memory(ByteBuffer buffer, IntBuffer x, IntBuffer y, IntBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		long __result = nstbi_loadf_from_memory(memAddress(buffer), buffer.remaining(), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memFloatBuffer(__result, x.get(x.position()) * y.get(y.position()) * comp.get(comp.position()));
	}

	// --- [ stbi_loadf_from_callbacks ] ---

	/** JNI method for {@link #stbi_loadf_from_callbacks loadf_from_callbacks} */
	@JavadocExclude
	public static native long nstbi_loadf_from_callbacks(long clbk, long user, long x, long y, long comp, int req_comp);

	/**
	 * Floating-point version of {@link #stbi_load_from_callbacks load_from_callbacks}.
	 *
	 * @param clbk     an {@link STBIIOCallbacks} struct
	 * @param user     a pointer to user data
	 * @param x        outputs the image width in pixels
	 * @param y        outputs the image height in pixels
	 * @param comp     outputs number of components in image
	 * @param req_comp 0 or 1..4 to force that many components per pixel. One of:<br>0, 1, 2, 3, 4
	 */
	public static FloatBuffer stbi_loadf_from_callbacks(ByteBuffer clbk, ByteBuffer user, ByteBuffer x, ByteBuffer y, ByteBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(clbk, STBIIOCallbacks.SIZEOF);
			checkBuffer(x, 1 << 2);
			checkBuffer(y, 1 << 2);
			checkBuffer(comp, 1 << 2);
		}
		long __result = nstbi_loadf_from_callbacks(memAddress(clbk), memAddressSafe(user), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memFloatBuffer(__result, x.getInt(x.position()) * y.getInt(y.position()) * comp.getInt(comp.position()));
	}

	/** Alternative version of: {@link #stbi_loadf_from_callbacks loadf_from_callbacks} */
	public static FloatBuffer stbi_loadf_from_callbacks(ByteBuffer clbk, ByteBuffer user, IntBuffer x, IntBuffer y, IntBuffer comp, int req_comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(clbk, STBIIOCallbacks.SIZEOF);
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		long __result = nstbi_loadf_from_callbacks(memAddress(clbk), memAddressSafe(user), memAddress(x), memAddress(y), memAddress(comp), req_comp);
		return memFloatBuffer(__result, x.get(x.position()) * y.get(y.position()) * comp.get(comp.position()));
	}

	// --- [ stbi_hdr_to_ldr_gamma ] ---

	/**
	 * Changes the gamma value used when converting HDR images to LDR. The default value is 2.2f
	 *
	 * @param gamma the gamma value
	 */
	public static native void stbi_hdr_to_ldr_gamma(float gamma);

	// --- [ stbi_hdr_to_ldr_scale ] ---

	/**
	 * Changes the scale factor used when converting HDR images to LDR. The default value is 1.0f
	 *
	 * @param scale the scale factor
	 */
	public static native void stbi_hdr_to_ldr_scale(float scale);

	// --- [ stbi_ldr_to_hdr_gamma ] ---

	/**
	 * Changes the gamma value used when converting LDR images to HDR. The default value is 2.2f
	 *
	 * @param gamma the gamma value
	 */
	public static native void stbi_ldr_to_hdr_gamma(float gamma);

	// --- [ stbi_ldr_to_hdr_scale ] ---

	/**
	 * Changes the gamma value used when converting LDR images to HDR. The default value is 2.2f
	 *
	 * @param scale the scale factor
	 */
	public static native void stbi_ldr_to_hdr_scale(float scale);

	// --- [ stbi_is_hdr ] ---

	/** JNI method for {@link #stbi_is_hdr is_hdr} */
	@JavadocExclude
	public static native int nstbi_is_hdr(long filename);

	/**
	 * Checks if the specified file contains an HDR image.
	 *
	 * @param filename the file name
	 *
	 * @return 1 if the image is HDR, 0 otherwise
	 */
	public static int stbi_is_hdr(ByteBuffer filename) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(filename);
		return nstbi_is_hdr(memAddress(filename));
	}

	/** CharSequence version of: {@link #stbi_is_hdr is_hdr} */
	public static int stbi_is_hdr(CharSequence filename) {
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		return nstbi_is_hdr(__buffer.address(filenameEncoded));
	}

	// --- [ stbi_is_hdr_from_memory ] ---

	/** JNI method for {@link #stbi_is_hdr_from_memory is_hdr_from_memory} */
	@JavadocExclude
	public static native int nstbi_is_hdr_from_memory(long buffer, int len);

	/**
	 * In-memory version of {@link #stbi_is_hdr is_hdr}.
	 *
	 * @param buffer the buffer from which to read the image data
	 * @param len    the buffer length, in bytes
	 */
	public static int stbi_is_hdr_from_memory(ByteBuffer buffer, int len) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffer, len);
		return nstbi_is_hdr_from_memory(memAddress(buffer), len);
	}

	/** Alternative version of: {@link #stbi_is_hdr_from_memory is_hdr_from_memory} */
	public static int stbi_is_hdr_from_memory(ByteBuffer buffer) {
		return nstbi_is_hdr_from_memory(memAddress(buffer), buffer.remaining());
	}

	// --- [ stbi_is_hdr_from_callbacks ] ---

	/** JNI method for {@link #stbi_is_hdr_from_callbacks is_hdr_from_callbacks} */
	@JavadocExclude
	public static native int nstbi_is_hdr_from_callbacks(long clbk, long user);

	/**
	 * Callback version of {@link #stbi_is_hdr is_hdr}.
	 *
	 * @param clbk an {@link STBIIOCallbacks} struct
	 * @param user a pointer to user data
	 */
	public static int stbi_is_hdr_from_callbacks(ByteBuffer clbk, ByteBuffer user) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(clbk, STBIIOCallbacks.SIZEOF);
		return nstbi_is_hdr_from_callbacks(memAddress(clbk), memAddressSafe(user));
	}

	// --- [ stbi_failure_reason ] ---

	/** JNI method for {@link #stbi_failure_reason failure_reason} */
	@JavadocExclude
	public static native long nstbi_failure_reason();

	/** Returns a brief reason for failure. */
	public static String stbi_failure_reason() {
		long __result = nstbi_failure_reason();
		return memDecodeASCII(__result);
	}

	// --- [ stbi_image_free ] ---

	/** JNI method for {@link #stbi_image_free image_free} */
	@JavadocExclude
	public static native void nstbi_image_free(long retval_from_stbi_load);

	/**
	 * Frees a loaded image
	 *
	 * @param retval_from_stbi_load an stb image
	 */
	public static void stbi_image_free(ByteBuffer retval_from_stbi_load) {
		nstbi_image_free(memAddress(retval_from_stbi_load));
	}

	// --- [ stbi_info ] ---

	/** JNI method for {@link #stbi_info info} */
	@JavadocExclude
	public static native int nstbi_info(long filename, long x, long y, long comp);

	/**
	 * Returns image dimensions &amp; components without fully decoding the image.
	 *
	 * @param filename the file name
	 * @param x        outputs the image width in pixels
	 * @param y        outputs the image height in pixels
	 * @param comp     outputs number of components in image
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbi_info(ByteBuffer filename, ByteBuffer x, ByteBuffer y, ByteBuffer comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(filename);
			checkBuffer(x, 1 << 2);
			checkBuffer(y, 1 << 2);
			checkBuffer(comp, 1 << 2);
		}
		return nstbi_info(memAddress(filename), memAddress(x), memAddress(y), memAddress(comp));
	}

	/** Alternative version of: {@link #stbi_info info} */
	public static int stbi_info(ByteBuffer filename, IntBuffer x, IntBuffer y, IntBuffer comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		return nstbi_info(memAddress(filename), memAddress(x), memAddress(y), memAddress(comp));
	}

	/** CharSequence version of: {@link #stbi_info info} */
	public static int stbi_info(CharSequence filename, IntBuffer x, IntBuffer y, IntBuffer comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		return nstbi_info(__buffer.address(filenameEncoded), memAddress(x), memAddress(y), memAddress(comp));
	}

	// --- [ stbi_info_from_memory ] ---

	/** JNI method for {@link #stbi_info_from_memory info_from_memory} */
	@JavadocExclude
	public static native int nstbi_info_from_memory(long buffer, int len, long x, long y, long comp);

	/**
	 * In-memory version of {@link #stbi_info info}.
	 *
	 * @param buffer the buffer from which to read the image data
	 * @param len    the buffer length, in bytes
	 * @param x      outputs the image width in pixels
	 * @param y      outputs the image height in pixels
	 * @param comp   outputs number of components in image
	 */
	public static int stbi_info_from_memory(ByteBuffer buffer, int len, ByteBuffer x, ByteBuffer y, ByteBuffer comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(buffer, len);
			checkBuffer(x, 1 << 2);
			checkBuffer(y, 1 << 2);
			checkBuffer(comp, 1 << 2);
		}
		return nstbi_info_from_memory(memAddress(buffer), len, memAddress(x), memAddress(y), memAddress(comp));
	}

	/** Alternative version of: {@link #stbi_info_from_memory info_from_memory} */
	public static int stbi_info_from_memory(ByteBuffer buffer, IntBuffer x, IntBuffer y, IntBuffer comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		return nstbi_info_from_memory(memAddress(buffer), buffer.remaining(), memAddress(x), memAddress(y), memAddress(comp));
	}

	// --- [ stbi_info_from_callbacks ] ---

	/** JNI method for {@link #stbi_info_from_callbacks info_from_callbacks} */
	@JavadocExclude
	public static native int nstbi_info_from_callbacks(long clbk, long user, long x, long y, long comp);

	/**
	 * Callback version of {@link #stbi_info info}.
	 *
	 * @param clbk an {@link STBIIOCallbacks} struct
	 * @param user a pointer to user data
	 * @param x    outputs the image width in pixels
	 * @param y    outputs the image height in pixels
	 * @param comp outputs number of components in image
	 */
	public static int stbi_info_from_callbacks(ByteBuffer clbk, ByteBuffer user, ByteBuffer x, ByteBuffer y, ByteBuffer comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(clbk, STBIIOCallbacks.SIZEOF);
			checkBuffer(x, 1 << 2);
			checkBuffer(y, 1 << 2);
			checkBuffer(comp, 1 << 2);
		}
		return nstbi_info_from_callbacks(memAddress(clbk), memAddressSafe(user), memAddress(x), memAddress(y), memAddress(comp));
	}

	/** Alternative version of: {@link #stbi_info_from_callbacks info_from_callbacks} */
	public static int stbi_info_from_callbacks(ByteBuffer clbk, ByteBuffer user, IntBuffer x, IntBuffer y, IntBuffer comp) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(clbk, STBIIOCallbacks.SIZEOF);
			checkBuffer(x, 1);
			checkBuffer(y, 1);
			checkBuffer(comp, 1);
		}
		return nstbi_info_from_callbacks(memAddress(clbk), memAddressSafe(user), memAddress(x), memAddress(y), memAddress(comp));
	}

	// --- [ stbi_set_unpremultiply_on_load ] ---

	/**
	 * For image formats that explicitly notate that they have premultiplied alpha, we just return the colors as stored in the file. Set this flag to force
	 * unpremultiplication. Results are undefined if the unpremultiply overflows.
	 *
	 * @param flag_true_if_should_unpremultiply the unpremultiply flag
	 */
	public static native void stbi_set_unpremultiply_on_load(int flag_true_if_should_unpremultiply);

	// --- [ stbi_convert_iphone_png_to_rgb ] ---

	/**
	 * Indicate whether we should process iPhone images back to canonical format, or just pass them through "as-is".
	 *
	 * @param flag_true_if_should_convert the convert iPhone PNG to RGB flag
	 */
	public static native void stbi_convert_iphone_png_to_rgb(int flag_true_if_should_convert);

	// --- [ stbi_set_flip_vertically_on_load ] ---

	/**
	 * Flips the image vertically, so the first pixel in the output array is the bottom left.
	 *
	 * @param flag_true_if_should_flip the flip vertically on load flag
	 */
	public static native void stbi_set_flip_vertically_on_load(int flag_true_if_should_flip);

	// --- [ stbi_zlib_decode_malloc_guesssize ] ---

	/** JNI method for {@link #stbi_zlib_decode_malloc_guesssize zlib_decode_malloc_guesssize} */
	@JavadocExclude
	public static native long nstbi_zlib_decode_malloc_guesssize(long buffer, int len, int initial_size, long outlen);

	/**
	 * ZLIB client - used by PNG, available for other purposes
	 *
	 * @param buffer       
	 * @param len          
	 * @param initial_size 
	 */
	public static ByteBuffer stbi_zlib_decode_malloc_guesssize(ByteBuffer buffer, int len, int initial_size) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffer, len);
		APIBuffer __buffer = apiBuffer();
		int outlen = __buffer.intParam();
		long __result = nstbi_zlib_decode_malloc_guesssize(memAddress(buffer), len, initial_size, __buffer.address(outlen));
		return memByteBuffer(__result, __buffer.intValue(outlen));
	}

	/** Alternative version of: {@link #stbi_zlib_decode_malloc_guesssize zlib_decode_malloc_guesssize} */
	public static ByteBuffer stbi_zlib_decode_malloc_guesssize(ByteBuffer buffer, int initial_size) {
		APIBuffer __buffer = apiBuffer();
		int outlen = __buffer.intParam();
		long __result = nstbi_zlib_decode_malloc_guesssize(memAddress(buffer), buffer.remaining(), initial_size, __buffer.address(outlen));
		return memByteBuffer(__result, __buffer.intValue(outlen));
	}

	// --- [ stbi_zlib_decode_malloc_guesssize_headerflag ] ---

	/** JNI method for {@link #stbi_zlib_decode_malloc_guesssize_headerflag zlib_decode_malloc_guesssize_headerflag} */
	@JavadocExclude
	public static native long nstbi_zlib_decode_malloc_guesssize_headerflag(long buffer, int len, int initial_size, long outlen, int parse_header);

	/**
	 * ZLIB client - used by PNG, available for other purposes
	 *
	 * @param buffer       
	 * @param len          
	 * @param initial_size 
	 * @param parse_header 
	 */
	public static ByteBuffer stbi_zlib_decode_malloc_guesssize_headerflag(ByteBuffer buffer, int len, int initial_size, int parse_header) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffer, len);
		APIBuffer __buffer = apiBuffer();
		int outlen = __buffer.intParam();
		long __result = nstbi_zlib_decode_malloc_guesssize_headerflag(memAddress(buffer), len, initial_size, __buffer.address(outlen), parse_header);
		return memByteBuffer(__result, __buffer.intValue(outlen));
	}

	/** Alternative version of: {@link #stbi_zlib_decode_malloc_guesssize_headerflag zlib_decode_malloc_guesssize_headerflag} */
	public static ByteBuffer stbi_zlib_decode_malloc_guesssize_headerflag(ByteBuffer buffer, int initial_size, int parse_header) {
		APIBuffer __buffer = apiBuffer();
		int outlen = __buffer.intParam();
		long __result = nstbi_zlib_decode_malloc_guesssize_headerflag(memAddress(buffer), buffer.remaining(), initial_size, __buffer.address(outlen), parse_header);
		return memByteBuffer(__result, __buffer.intValue(outlen));
	}

	// --- [ stbi_zlib_decode_malloc ] ---

	/** JNI method for {@link #stbi_zlib_decode_malloc zlib_decode_malloc} */
	@JavadocExclude
	public static native long nstbi_zlib_decode_malloc(long buffer, int len, long outlen);

	/**
	 * ZLIB client - used by PNG, available for other purposes
	 *
	 * @param buffer 
	 * @param len    
	 */
	public static ByteBuffer stbi_zlib_decode_malloc(ByteBuffer buffer, int len) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffer, len);
		APIBuffer __buffer = apiBuffer();
		int outlen = __buffer.intParam();
		long __result = nstbi_zlib_decode_malloc(memAddress(buffer), len, __buffer.address(outlen));
		return memByteBuffer(__result, __buffer.intValue(outlen));
	}

	/** Alternative version of: {@link #stbi_zlib_decode_malloc zlib_decode_malloc} */
	public static ByteBuffer stbi_zlib_decode_malloc(ByteBuffer buffer) {
		APIBuffer __buffer = apiBuffer();
		int outlen = __buffer.intParam();
		long __result = nstbi_zlib_decode_malloc(memAddress(buffer), buffer.remaining(), __buffer.address(outlen));
		return memByteBuffer(__result, __buffer.intValue(outlen));
	}

	// --- [ stbi_zlib_decode_buffer ] ---

	/** JNI method for {@link #stbi_zlib_decode_buffer zlib_decode_buffer} */
	@JavadocExclude
	public static native int nstbi_zlib_decode_buffer(long obuffer, int olen, long ibuffer, int ilen);

	/**
	 * ZLIB client - used by PNG, available for other purposes
	 *
	 * @param obuffer 
	 * @param olen    
	 * @param ibuffer 
	 * @param ilen    
	 */
	public static int stbi_zlib_decode_buffer(ByteBuffer obuffer, int olen, ByteBuffer ibuffer, int ilen) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(obuffer, olen);
			checkBuffer(ibuffer, ilen);
		}
		return nstbi_zlib_decode_buffer(memAddress(obuffer), olen, memAddress(ibuffer), ilen);
	}

	/** Alternative version of: {@link #stbi_zlib_decode_buffer zlib_decode_buffer} */
	public static int stbi_zlib_decode_buffer(ByteBuffer obuffer, ByteBuffer ibuffer) {
		return nstbi_zlib_decode_buffer(memAddress(obuffer), obuffer.remaining(), memAddress(ibuffer), ibuffer.remaining());
	}

	// --- [ stbi_zlib_decode_noheader_malloc ] ---

	/** JNI method for {@link #stbi_zlib_decode_noheader_malloc zlib_decode_noheader_malloc} */
	@JavadocExclude
	public static native long nstbi_zlib_decode_noheader_malloc(long buffer, int len, long outlen);

	/**
	 * ZLIB client - used by PNG, available for other purposes
	 *
	 * @param buffer 
	 * @param len    
	 */
	public static ByteBuffer stbi_zlib_decode_noheader_malloc(ByteBuffer buffer, int len) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffer, len);
		APIBuffer __buffer = apiBuffer();
		int outlen = __buffer.intParam();
		long __result = nstbi_zlib_decode_noheader_malloc(memAddress(buffer), len, __buffer.address(outlen));
		return memByteBuffer(__result, __buffer.intValue(outlen));
	}

	/** Alternative version of: {@link #stbi_zlib_decode_noheader_malloc zlib_decode_noheader_malloc} */
	public static ByteBuffer stbi_zlib_decode_noheader_malloc(ByteBuffer buffer) {
		APIBuffer __buffer = apiBuffer();
		int outlen = __buffer.intParam();
		long __result = nstbi_zlib_decode_noheader_malloc(memAddress(buffer), buffer.remaining(), __buffer.address(outlen));
		return memByteBuffer(__result, __buffer.intValue(outlen));
	}

	// --- [ stbi_zlib_decode_noheader_buffer ] ---

	/** JNI method for {@link #stbi_zlib_decode_noheader_buffer zlib_decode_noheader_buffer} */
	@JavadocExclude
	public static native int nstbi_zlib_decode_noheader_buffer(long obuffer, int olen, long ibuffer, int ilen);

	/**
	 * ZLIB client - used by PNG, available for other purposes
	 *
	 * @param obuffer 
	 * @param olen    
	 * @param ibuffer 
	 * @param ilen    
	 */
	public static int stbi_zlib_decode_noheader_buffer(ByteBuffer obuffer, int olen, ByteBuffer ibuffer, int ilen) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(obuffer, olen);
			checkBuffer(ibuffer, ilen);
		}
		return nstbi_zlib_decode_noheader_buffer(memAddress(obuffer), olen, memAddress(ibuffer), ilen);
	}

	/** Alternative version of: {@link #stbi_zlib_decode_noheader_buffer zlib_decode_noheader_buffer} */
	public static int stbi_zlib_decode_noheader_buffer(ByteBuffer obuffer, ByteBuffer ibuffer) {
		return nstbi_zlib_decode_noheader_buffer(memAddress(obuffer), obuffer.remaining(), memAddress(ibuffer), ibuffer.remaining());
	}

     /**
	 * Creates a {@link STBIReadCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link STBIReadCallback} instance
	 */
	public static STBIReadCallback STBIReadCallback(final STBIReadCallback.SAM sam) {
		return new STBIReadCallback() {
			@Override
			public int invoke(long user, long data, int size) {
				return sam.invoke(user, data, size);
			}
		};
	}

     /**
	 * Creates a {@link STBISkipCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link STBISkipCallback} instance
	 */
	public static STBISkipCallback STBISkipCallback(final STBISkipCallback.SAM sam) {
		return new STBISkipCallback() {
			@Override
			public int invoke(long user, int n) {
				return sam.invoke(user, n);
			}
		};
	}

     /**
	 * Creates a {@link STBIEOFCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link STBIEOFCallback} instance
	 */
	public static STBIEOFCallback STBIEOFCallback(final STBIEOFCallback.SAM sam) {
		return new STBIEOFCallback() {
			@Override
			public int invoke(long user) {
				return sam.invoke(user);
			}
		};
	}

}