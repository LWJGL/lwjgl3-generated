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
 * Native bindings to stb_image_write.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <h3>ABOUT</h3>
 * 
 * <p>This header file is a library for writing images to C stdio.</p>
 * 
 * <p>The PNG output is not optimal; it is 20-50% larger than the file written by a decent optimizing implementation. This library is designed for source
 * code compactness and simplicitly, not optimal image file size or run-time performance.</p>
 * 
 * <h3>USAGE</h3>
 * 
 * <p>There are four functions, one for each image file format:
 * <pre><code style="font-family: monospace">
 * int stbi_write_png(char const *filename, int w, int h, int comp, const void *data, int stride_in_bytes);
 * int stbi_write_bmp(char const *filename, int w, int h, int comp, const void *data);
 * int stbi_write_tga(char const *filename, int w, int h, int comp, const void *data);
 * int stbi_write_hdr(char const *filename, int w, int h, int comp, const void *data);</code></pre>
 * The functions create an image file defined by the parameters. The image is a rectangle of pixels stored from left-to-right, top-to-bottom. Each pixel
 * contains {@code comp} channels of data stored interleaved with 8-bits per channel, in the following order: 1=Y, 2=YA, 3=RGB, 4=RGBA. (Y is monochrome
 * color.) The rectangle is {@code w} pixels wide and {@code h} pixels tall. The {@code *data} pointer points to the first byte of the top-left-most
 * pixel.</p>
 */
public final class STBImageWrite {

	static { LWJGLUtil.initialize(); }

	private STBImageWrite() {}

	// --- [ stbi_write_png ] ---

	/** JNI method for {@link #stbi_write_png write_png} */
	@JavadocExclude
	public static native int nstbi_write_png(long filename, int w, int h, int comp, long data, int stride_in_bytes);

	/**
	 * Writes a PNR image file.
	 * 
	 * <p>PNG creates output files with the same number of components as the input.</p>
	 * 
	 * <p>PNG supports writing rectangles of data even when the bytes storing rows of data are not consecutive in memory (e.g. sub-rectangles of a larger image),
	 * by supplying the stride between the beginning of adjacent rows. The other formats do not. (Thus you cannot write a native-format BMP through the BMP
	 * writer, both because it is in BGR order and because it may have padding at the end of the line.)</p>
	 *
	 * @param filename        the image file path
	 * @param w               the image width, in pixels
	 * @param h               the image height, in pixels
	 * @param comp            the number of channels in each pixel
	 * @param data            the image data
	 * @param stride_in_bytes the distance in bytes from the first byte of a row of pixels to the first byte of the next row of pixels
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbi_write_png(ByteBuffer filename, int w, int h, int comp, ByteBuffer data, int stride_in_bytes) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(filename);
			checkBuffer(data, w * h * comp);
		}
		return nstbi_write_png(memAddress(filename), w, h, comp, memAddress(data), stride_in_bytes);
	}

	/** CharSequence version of: {@link #stbi_write_png write_png} */
	public static int stbi_write_png(CharSequence filename, int w, int h, int comp, ByteBuffer data, int stride_in_bytes) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, w * h * comp);
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		return nstbi_write_png(__buffer.address(filenameEncoded), w, h, comp, memAddress(data), stride_in_bytes);
	}

	// --- [ stbi_write_bmp ] ---

	/** JNI method for {@link #stbi_write_bmp write_bmp} */
	@JavadocExclude
	public static native int nstbi_write_bmp(long filename, int w, int h, int comp, long data);

	/**
	 * Writes a BMP image file.
	 * 
	 * <p>The BMP format expands Y to RGB in the file format and does not output alpha.</p>
	 *
	 * @param filename the image file path
	 * @param w        the image width, in pixels
	 * @param h        the image height, in pixels
	 * @param comp     the number of channels in each pixel
	 * @param data     the image data
	 */
	public static int stbi_write_bmp(ByteBuffer filename, int w, int h, int comp, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(filename);
			checkBuffer(data, w * h * comp);
		}
		return nstbi_write_bmp(memAddress(filename), w, h, comp, memAddress(data));
	}

	/** CharSequence version of: {@link #stbi_write_bmp write_bmp} */
	public static int stbi_write_bmp(CharSequence filename, int w, int h, int comp, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, w * h * comp);
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		return nstbi_write_bmp(__buffer.address(filenameEncoded), w, h, comp, memAddress(data));
	}

	// --- [ stbi_write_tga ] ---

	/** JNI method for {@link #stbi_write_tga write_tga} */
	@JavadocExclude
	public static native int nstbi_write_tga(long filename, int w, int h, int comp, long data);

	/**
	 * Writes a TGA image file.
	 *
	 * @param filename the image file path
	 * @param w        the image width, in pixels
	 * @param h        the image height, in pixels
	 * @param comp     the number of channels in each pixel
	 * @param data     the image data
	 */
	public static int stbi_write_tga(ByteBuffer filename, int w, int h, int comp, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(filename);
			checkBuffer(data, w * h * comp);
		}
		return nstbi_write_tga(memAddress(filename), w, h, comp, memAddress(data));
	}

	/** CharSequence version of: {@link #stbi_write_tga write_tga} */
	public static int stbi_write_tga(CharSequence filename, int w, int h, int comp, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, w * h * comp);
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		return nstbi_write_tga(__buffer.address(filenameEncoded), w, h, comp, memAddress(data));
	}

	// --- [ stbi_write_hdr ] ---

	/** JNI method for {@link #stbi_write_hdr write_hdr} */
	@JavadocExclude
	public static native int nstbi_write_hdr(long filename, int w, int h, int comp, long data);

	/**
	 * Writes an HDR image file.
	 * 
	 * <p>HDR expects linear float data. Since the format is always 32-bit rgb(e) data, alpha (if provided) is discarded, and for monochrome data it is
	 * replicated across all three channels.</p>
	 *
	 * @param filename the image file path
	 * @param w        the image width, in pixels
	 * @param h        the image height, in pixels
	 * @param comp     the number of channels in each pixel
	 * @param data     the image data
	 */
	public static int stbi_write_hdr(ByteBuffer filename, int w, int h, int comp, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(filename);
			checkBuffer(data, (w * h * comp) << 2);
		}
		return nstbi_write_hdr(memAddress(filename), w, h, comp, memAddress(data));
	}

	/** Alternative version of: {@link #stbi_write_hdr write_hdr} */
	public static int stbi_write_hdr(ByteBuffer filename, int w, int h, int comp, FloatBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, w * h * comp);
		return nstbi_write_hdr(memAddress(filename), w, h, comp, memAddress(data));
	}

	/** CharSequence version of: {@link #stbi_write_hdr write_hdr} */
	public static int stbi_write_hdr(CharSequence filename, int w, int h, int comp, FloatBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, w * h * comp);
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		return nstbi_write_hdr(__buffer.address(filenameEncoded), w, h, comp, memAddress(data));
	}

}