/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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
 * <p>There are four functions, one for each image file format:</p>
 * 
 * <pre><code>int stbi_write_png(char const *filename, int w, int h, int comp, const void *data, int stride_in_bytes);
int stbi_write_bmp(char const *filename, int w, int h, int comp, const void *data);
int stbi_write_tga(char const *filename, int w, int h, int comp, const void *data);
int stbi_write_hdr(char const *filename, int w, int h, int comp, const void *data);</code></pre>
 * 
 * <p>There are also four equivalent functions that use an arbitrary write function. You are expected to open/close your file-equivalent before and after
 * calling these:</p>
 * 
 * <pre><code>int stbi_write_png_to_func(stbi_write_func *func, void *context, int w, int h, int comp, const void  *data, int stride_in_bytes);
int stbi_write_bmp_to_func(stbi_write_func *func, void *context, int w, int h, int comp, const void  *data);
int stbi_write_tga_to_func(stbi_write_func *func, void *context, int w, int h, int comp, const void  *data);
int stbi_write_hdr_to_func(stbi_write_func *func, void *context, int w, int h, int comp, const float *data);</code></pre>
 * 
 * <p>where the callback is:</p>
 * 
 * <pre><code>void stbi_write_func(void *context, void *data, int size);</code></pre>
 * 
 * <p>The functions create an image file defined by the parameters. The image is a rectangle of pixels stored from left-to-right, top-to-bottom. Each pixel
 * contains {@code comp} channels of data stored interleaved with 8-bits per channel, in the following order: 1=Y, 2=YA, 3=RGB, 4=RGBA. (Y is monochrome
 * color.) The rectangle is {@code w} pixels wide and {@code h} pixels tall. The {@code *data} pointer points to the first byte of the top-left-most
 * pixel.</p>
 */
public class STBImageWrite {

	static { LibSTB.initialize(); }

	protected STBImageWrite() {
		throw new UnsupportedOperationException();
	}

	// --- [ stbi_write_png ] ---

	/** Unsafe version of: {@link #stbi_write_png write_png} */
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
	public static boolean stbi_write_png(ByteBuffer filename, int w, int h, int comp, ByteBuffer data, int stride_in_bytes) {
		if ( CHECKS ) {
			checkNT1(filename);
			checkBuffer(data, w * h * comp);
		}
		return nstbi_write_png(memAddress(filename), w, h, comp, memAddress(data), stride_in_bytes) != 0;
	}

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
	public static boolean stbi_write_png(CharSequence filename, int w, int h, int comp, ByteBuffer data, int stride_in_bytes) {
		if ( CHECKS )
			checkBuffer(data, w * h * comp);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nstbi_write_png(memAddress(filenameEncoded), w, h, comp, memAddress(data), stride_in_bytes) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ stbi_write_bmp ] ---

	/** Unsafe version of: {@link #stbi_write_bmp write_bmp} */
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
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static boolean stbi_write_bmp(ByteBuffer filename, int w, int h, int comp, ByteBuffer data) {
		if ( CHECKS ) {
			checkNT1(filename);
			checkBuffer(data, w * h * comp);
		}
		return nstbi_write_bmp(memAddress(filename), w, h, comp, memAddress(data)) != 0;
	}

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
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static boolean stbi_write_bmp(CharSequence filename, int w, int h, int comp, ByteBuffer data) {
		if ( CHECKS )
			checkBuffer(data, w * h * comp);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nstbi_write_bmp(memAddress(filenameEncoded), w, h, comp, memAddress(data)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ stbi_write_tga ] ---

	/** Unsafe version of: {@link #stbi_write_tga write_tga} */
	public static native int nstbi_write_tga(long filename, int w, int h, int comp, long data);

	/**
	 * Writes a TGA image file.
	 * 
	 * <p>TGA supports RLE or non-RLE compressed data. To use non-RLE-compressed data, set the global variable {@code stbi_write_tga_with_rle} to 0. The variable
	 * can be accessed with {@link #stbi_write_tga_with_rle write_tga_with_rle}.</p>
	 *
	 * @param filename the image file path
	 * @param w        the image width, in pixels
	 * @param h        the image height, in pixels
	 * @param comp     the number of channels in each pixel
	 * @param data     the image data
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static boolean stbi_write_tga(ByteBuffer filename, int w, int h, int comp, ByteBuffer data) {
		if ( CHECKS ) {
			checkNT1(filename);
			checkBuffer(data, w * h * comp);
		}
		return nstbi_write_tga(memAddress(filename), w, h, comp, memAddress(data)) != 0;
	}

	/**
	 * Writes a TGA image file.
	 * 
	 * <p>TGA supports RLE or non-RLE compressed data. To use non-RLE-compressed data, set the global variable {@code stbi_write_tga_with_rle} to 0. The variable
	 * can be accessed with {@link #stbi_write_tga_with_rle write_tga_with_rle}.</p>
	 *
	 * @param filename the image file path
	 * @param w        the image width, in pixels
	 * @param h        the image height, in pixels
	 * @param comp     the number of channels in each pixel
	 * @param data     the image data
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static boolean stbi_write_tga(CharSequence filename, int w, int h, int comp, ByteBuffer data) {
		if ( CHECKS )
			checkBuffer(data, w * h * comp);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nstbi_write_tga(memAddress(filenameEncoded), w, h, comp, memAddress(data)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ stbi_write_tga_with_rle ] ---

	private static native long nstbi_write_tga_with_rle();

	private static IntBuffer stbi_write_tga_with_rle() {
		long __result = nstbi_write_tga_with_rle();
		return memIntBuffer(__result, 1);
	}

	/** Returns the address of the global variable {@code stbi_write_tga_with_rle}. */
	public static final IntBuffer stbi_write_tga_with_rle = stbi_write_tga_with_rle();

	// --- [ stbi_write_hdr ] ---

	/** Unsafe version of: {@link #stbi_write_hdr write_hdr} */
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
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static boolean stbi_write_hdr(ByteBuffer filename, int w, int h, int comp, FloatBuffer data) {
		if ( CHECKS ) {
			checkNT1(filename);
			checkBuffer(data, w * h * comp);
		}
		return nstbi_write_hdr(memAddress(filename), w, h, comp, memAddress(data)) != 0;
	}

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
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static boolean stbi_write_hdr(CharSequence filename, int w, int h, int comp, FloatBuffer data) {
		if ( CHECKS )
			checkBuffer(data, w * h * comp);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nstbi_write_hdr(memAddress(filenameEncoded), w, h, comp, memAddress(data)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ stbi_write_png_to_func ] ---

	/** Unsafe version of: {@link #stbi_write_png_to_func write_png_to_func} */
	public static native int nstbi_write_png_to_func(long func, long context, int w, int h, int comp, long data, int stride_in_bytes);

	/**
	 * Callback version of {@link #stbi_write_png write_png}.
	 *
	 * @param func            the callback function
	 * @param context         a context that will be passed to {@code func}
	 * @param w               the image width, in pixels
	 * @param h               the image height, in pixels
	 * @param comp            the number of channels in each pixel
	 * @param data            the image data
	 * @param stride_in_bytes the distance in bytes from the first byte of a row of pixels to the first byte of the next row of pixels
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static boolean stbi_write_png_to_func(STBIWriteCallbackI func, ByteBuffer context, int w, int h, int comp, ByteBuffer data, int stride_in_bytes) {
		if ( CHECKS )
			checkBuffer(data, w * h * comp);
		return nstbi_write_png_to_func(func.address(), memAddressSafe(context), w, h, comp, memAddress(data), stride_in_bytes) != 0;
	}

	// --- [ stbi_write_bmp_to_func ] ---

	/** Unsafe version of: {@link #stbi_write_bmp_to_func write_bmp_to_func} */
	public static native int nstbi_write_bmp_to_func(long func, long context, int w, int h, int comp, long data);

	/**
	 * Callback version of {@link #stbi_write_bmp write_bmp}.
	 *
	 * @param func    the callback function
	 * @param context a context that will be passed to {@code func}
	 * @param w       the image width, in pixels
	 * @param h       the image height, in pixels
	 * @param comp    the number of channels in each pixel
	 * @param data    the image data
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static boolean stbi_write_bmp_to_func(STBIWriteCallbackI func, ByteBuffer context, int w, int h, int comp, ByteBuffer data) {
		if ( CHECKS )
			checkBuffer(data, w * h * comp);
		return nstbi_write_bmp_to_func(func.address(), memAddressSafe(context), w, h, comp, memAddress(data)) != 0;
	}

	// --- [ stbi_write_tga_to_func ] ---

	/** Unsafe version of: {@link #stbi_write_tga_to_func write_tga_to_func} */
	public static native int nstbi_write_tga_to_func(long func, long context, int w, int h, int comp, long data);

	/**
	 * Callback version of {@link #stbi_write_tga write_tga}.
	 *
	 * @param func    the callback function
	 * @param context a context that will be passed to {@code func}
	 * @param w       the image width, in pixels
	 * @param h       the image height, in pixels
	 * @param comp    the number of channels in each pixel
	 * @param data    the image data
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static boolean stbi_write_tga_to_func(STBIWriteCallbackI func, ByteBuffer context, int w, int h, int comp, ByteBuffer data) {
		if ( CHECKS )
			checkBuffer(data, w * h * comp);
		return nstbi_write_tga_to_func(func.address(), memAddressSafe(context), w, h, comp, memAddress(data)) != 0;
	}

	// --- [ stbi_write_hdr_to_func ] ---

	/** Unsafe version of: {@link #stbi_write_hdr_to_func write_hdr_to_func} */
	public static native int nstbi_write_hdr_to_func(long func, long context, int w, int h, int comp, long data);

	/**
	 * Callback version of {@link #stbi_write_hdr write_hdr}.
	 *
	 * @param func    the callback function
	 * @param context a context that will be passed to {@code func}
	 * @param w       the image width, in pixels
	 * @param h       the image height, in pixels
	 * @param comp    the number of channels in each pixel
	 * @param data    the image data
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static boolean stbi_write_hdr_to_func(STBIWriteCallbackI func, ByteBuffer context, int w, int h, int comp, FloatBuffer data) {
		if ( CHECKS )
			checkBuffer(data, w * h * comp);
		return nstbi_write_hdr_to_func(func.address(), memAddressSafe(context), w, h, comp, memAddress(data)) != 0;
	}

	/** Array version of: {@link #nstbi_write_hdr} */
	public static native int nstbi_write_hdr(long filename, int w, int h, int comp, float[] data);

	/** Array version of: {@link #stbi_write_hdr write_hdr} */
	public static boolean stbi_write_hdr(ByteBuffer filename, int w, int h, int comp, float[] data) {
		if ( CHECKS ) {
			checkNT1(filename);
			checkBuffer(data, w * h * comp);
		}
		return nstbi_write_hdr(memAddress(filename), w, h, comp, data) != 0;
	}

	/** Array version of: {@link #stbi_write_hdr write_hdr} */
	public static boolean stbi_write_hdr(CharSequence filename, int w, int h, int comp, float[] data) {
		if ( CHECKS )
			checkBuffer(data, w * h * comp);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nstbi_write_hdr(memAddress(filenameEncoded), w, h, comp, data) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nstbi_write_hdr_to_func} */
	public static native int nstbi_write_hdr_to_func(long func, long context, int w, int h, int comp, float[] data);

	/** Array version of: {@link #stbi_write_hdr_to_func write_hdr_to_func} */
	public static boolean stbi_write_hdr_to_func(STBIWriteCallbackI func, ByteBuffer context, int w, int h, int comp, float[] data) {
		if ( CHECKS )
			checkBuffer(data, w * h * comp);
		return nstbi_write_hdr_to_func(func.address(), memAddressSafe(context), w, h, comp, data) != 0;
	}

}