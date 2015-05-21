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

/**
 * Native bindings to stb_image_resize.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>Written with emphasis on usability, portability, and efficiency. (No SIMD or threads, so it be easily outperformed by libs that use those.) Only
 * scaling and translation is supported, no rotations or shears. Easy API downsamples w/Mitchell filter, upsamples w/cubic interpolation.</p>
 * 
 * <h3>QUICKSTART</h3>
 * <pre><code style="font-family: monospace">
 * stbir_resize_uint8(      input_pixels , in_w , in_h , 0,
 *                          output_pixels, out_w, out_h, 0, num_channels)
 * stbir_resize_float(...)
 * stbir_resize_uint8_srgb( input_pixels , in_w , in_h , 0,
 *                          output_pixels, out_w, out_h, 0,
 *                          num_channels , alpha_chan  , 0)
 * stbir_resize_uint8_srgb_edgemode(
 *                          input_pixels , in_w , in_h , 0,
 *                          output_pixels, out_w, out_h, 0,
 *                          num_channels , alpha_chan  , 0, STBIR_EDGE_CLAMP)
 *                                                       // WRAP/REFLECT/ZERO</code></pre>
 * <h3>ALPHA CHANNEL</h3>
 * 
 * <p>Most of the resizing functions provide the ability to control how the alpha channel of an image is processed. The important things to know about this:
 * <ol>
 * <li>The best mathematically-behaved version of alpha to use is called "premultiplied alpha", in which the other color channels have had the alpha value
 * multiplied in. If you use premultiplied alpha, linear filtering (such as image resampling done by this library, or performed in texture units on
 * GPUs) does the "right thing". While premultiplied alpha is standard in the movie CGI industry, it is still uncommon in the videogame/real-time
 * world. If you linearly filter non-premultiplied alpha, strange effects occur. (For example, the average of 1% opaque bright green and 99% opaque
 * black produces 50% transparent dark green when non-premultiplied, whereas premultiplied it produces 50% transparent near-black. The former
 * introduces green energy that doesn't exist in the source image.)</li>
 * <li>Artists should not edit premultiplied-alpha images; artists want non-premultiplied alpha images. Thus, art tools generally output non-premultiplied
 * alpha images.</li>
 * <li>You will get best results in most cases by converting images to premultiplied alpha before processing them mathematically.</li>
 * <li>If you pass the flag {@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, the resizer does not do anything special for the alpha channel; it is resampled identically to
 * other channels. This produces the correct results for premultiplied-alpha images, but produces less-than-ideal results for non-premultiplied-alpha
 * images.</li>
 * <li>If you do not pass the flag {@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, then the resizer weights the contribution of input pixels based on their alpha values, or,
 * equivalently, it multiplies the alpha value into the color channels, resamples, then divides by the resultant alpha value. Input pixels which have
 * {@code alpha=0} do not contribute at all to output pixels unless <b>all</b> of the input pixels affecting that output pixel have {@code alpha=0},
 * in which case the result for that pixel is the same as it would be without {@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}. However, this is only true for input images
 * in integer formats. For input images in float format, input pixels with {@code alpha=0} have no effect, and output pixels which have
 * {@code alpha=0} will be 0 in all channels. (For float images, you can manually achieve the same result by adding a tiny epsilon value to the alpha
 * channel of every image, and then subtracting or clamping it at the end.)</li>
 * <li>You can separately control whether the alpha channel is interpreted as linear or affected by the colorspace. By default it is linear; you almost
 * never want to apply the colorspace. (For example, graphics hardware does not apply sRGB conversion to the alpha channel.)</li>
 * </ol></p>
 */
public final class STBImageResize {

	/** Set this flag if you have no alpha channel, or otherwise provide the index of the alpha channel. */
	public static final int STBIR_ALPHA_CHANNEL_NONE = 0xFFFFFFFF;

	/**
	 * Set this flag if your texture has premultiplied alpha. Otherwise, stbir will use alpha-weighted resampling (effectively premultiplying, resampling,
	 * then unpremultiplying).
	 */
	public static final int STBIR_FLAG_ALPHA_PREMULTIPLIED = 0xFFFFFFFF;

	/** The specified alpha channel should be handled as gamma-corrected value even when doing sRGB operations. */
	public static final int STBIR_FLAG_ALPHA_USES_COLORSPACE = 0xFFFFFFFF;

	/** Edge wrap mode. */
	public static final int
		STBIR_EDGE_CLAMP   = 0x1,
		STBIR_EDGE_REFLECT = 0x2,
		STBIR_EDGE_WRAP    = 0x3,
		STBIR_EDGE_ZERO    = 0x4;

	/** Use same filter type that easy-to-use API chooses. */
	public static final int STBIR_FILTER_DEFAULT = 0x0;

	/** A trapezoid w/1-pixel wide ramps, same result as box for integer scale ratios. */
	public static final int STBIR_FILTER_BOX = 0x1;

	/** On upsampling, produces same results as bilinear texture filtering. */
	public static final int STBIR_FILTER_TRIANGLE = 0x2;

	/** The cubic b-spline (aka Mitchell-Netrevalli with B=1,C=0), gaussian-esque. */
	public static final int STBIR_FILTER_CUBICBSPLINE = 0x3;

	/** An interpolating cubic spline. */
	public static final int STBIR_FILTER_CATMULLROM = 0x4;

	/** Mitchell-Netrevalli filter with B=1/3, C=1/3. */
	public static final int STBIR_FILTER_MITCHELL = 0x5;

	/** Colorspace. */
	public static final int
		STBIR_COLORSPACE_LINEAR = 0x0,
		STBIR_COLORSPACE_SRGB   = 0x1;

	/** Data type. */
	public static final int
		STBIR_TYPE_UINT8  = 0x0,
		STBIR_TYPE_UINT16 = 0x1,
		STBIR_TYPE_UINT32 = 0x2,
		STBIR_TYPE_FLOAT  = 0x3;

	static { LWJGLUtil.initialize(); }

	private STBImageResize() {}

	// --- [ stbir_resize_uint8 ] ---

	/** JNI method for {@link #stbir_resize_uint8 resize_uint8} */
	@JavadocExclude
	public static native int nstbir_resize_uint8(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels);

	/**
	 * Easy-to-use API for resizing images.
	 * <ul>
	 * <li>The colorspace is linear.</li>
	 * <li>The alpha channel is treated identically to other channels.</li>
	 * <li>Memory required grows approximately linearly with input and output size, but with discontinuities at {@code input_w == output_w} and
	 * {@code input_h == output_h}.</li>
	 * </ul>
	 * This function uses the default resampling filter defined at compile time. For a different filter, use the medium-complexity API.
	 *
	 * @param input_pixels           the source image data
	 * @param input_w                the source image width
	 * @param input_h                the source image height
	 * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param output_pixels          returns the scaled image data
	 * @param output_w               the resized image width
	 * @param output_h               the resized image height
	 * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbir_resize_uint8(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(input_pixels, input_w * input_h * num_channels);
			checkBuffer(output_pixels, output_w * output_h * num_channels);
		}
		return nstbir_resize_uint8(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels);
	}

	// --- [ stbir_resize_float ] ---

	/** JNI method for {@link #stbir_resize_float resize_float} */
	@JavadocExclude
	public static native int nstbir_resize_float(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels);

	/**
	 * Float version of {@link #stbir_resize_uint8 resize_uint8}.
	 *
	 * @param input_pixels           the source image data
	 * @param input_w                the source image width
	 * @param input_h                the source image height
	 * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param output_pixels          returns the scaled image data
	 * @param output_w               the resized image width
	 * @param output_h               the resized image height
	 * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbir_resize_float(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(input_pixels, (input_w * input_h * num_channels) << 2);
			checkBuffer(output_pixels, (output_w * output_h * num_channels) << 2);
		}
		return nstbir_resize_float(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels);
	}

	/** Alternative version of: {@link #stbir_resize_float resize_float} */
	public static int stbir_resize_float(FloatBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, FloatBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(input_pixels, input_w * input_h * num_channels);
			checkBuffer(output_pixels, output_w * output_h * num_channels);
		}
		return nstbir_resize_float(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels);
	}

	// --- [ stbir_resize_uint8_srgb ] ---

	/** JNI method for {@link #stbir_resize_uint8_srgb resize_uint8_srgb} */
	@JavadocExclude
	public static native int nstbir_resize_uint8_srgb(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags);

	/**
	 * Easy-to-use API for resizing images.
	 * <ul>
	 * <li>The image data is interpreted as gamma-corrected sRGB.</li>
	 * <li>Memory required grows approximately linearly with input and output size, but with discontinuities at {@code input_w == output_w} and
	 * {@code input_h == output_h}.</li>
	 * </ul>
	 * This function uses the default resampling filter defined at compile time. For a different filter, use the medium-complexity API.
	 *
	 * @param input_pixels           the source image data
	 * @param input_w                the source image width
	 * @param input_h                the source image height
	 * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param output_pixels          returns the scaled image data
	 * @param output_w               the resized image width
	 * @param output_h               the resized image height
	 * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
	 * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
	 * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, {@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbir_resize_uint8_srgb(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(input_pixels, input_w * input_h * num_channels);
			checkBuffer(output_pixels, output_w * output_h * num_channels);
		}
		return nstbir_resize_uint8_srgb(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags);
	}

	// --- [ stbir_resize_uint8_srgb_edgemode ] ---

	/** JNI method for {@link #stbir_resize_uint8_srgb_edgemode resize_uint8_srgb_edgemode} */
	@JavadocExclude
	public static native int nstbir_resize_uint8_srgb_edgemode(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode);

	/**
	 * Same as {@link #stbir_resize_uint8_srgb resize_uint8_srgb}, but adds the ability to specify how requests to sample off the edge of the image are handled.
	 *
	 * @param input_pixels           the source image data
	 * @param input_w                the source image width
	 * @param input_h                the source image height
	 * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param output_pixels          returns the scaled image data
	 * @param output_w               the resized image width
	 * @param output_h               the resized image height
	 * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
	 * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
	 * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, {@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}
	 * @param edge_wrap_mode         the edge wrap mode. One of:<br>{@link #STBIR_EDGE_CLAMP EDGE_CLAMP}, {@link #STBIR_EDGE_REFLECT EDGE_REFLECT}, {@link #STBIR_EDGE_WRAP EDGE_WRAP}, {@link #STBIR_EDGE_ZERO EDGE_ZERO}
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbir_resize_uint8_srgb_edgemode(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(input_pixels, input_w * input_h * num_channels);
			checkBuffer(output_pixels, output_w * output_h * num_channels);
		}
		return nstbir_resize_uint8_srgb_edgemode(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode);
	}

	// --- [ stbir_resize_uint8_generic ] ---

	/** JNI method for {@link #stbir_resize_uint8_generic resize_uint8_generic} */
	@JavadocExclude
	public static native int nstbir_resize_uint8_generic(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space, long alloc_context);

	/**
	 * Medium-complexity version of {@link #stbir_resize_uint8 resize_uint8}.
	 *
	 * @param input_pixels           the source image data
	 * @param input_w                the source image width
	 * @param input_h                the source image height
	 * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param output_pixels          returns the scaled image data
	 * @param output_w               the resized image width
	 * @param output_h               the resized image height
	 * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
	 * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
	 * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, {@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}
	 * @param edge_wrap_mode         the edge wrap mode. One of:<br>{@link #STBIR_EDGE_CLAMP EDGE_CLAMP}, {@link #STBIR_EDGE_REFLECT EDGE_REFLECT}, {@link #STBIR_EDGE_WRAP EDGE_WRAP}, {@link #STBIR_EDGE_ZERO EDGE_ZERO}
	 * @param filter                 the scale filter. One of:<br>{@link #STBIR_FILTER_DEFAULT FILTER_DEFAULT}, {@link #STBIR_FILTER_BOX FILTER_BOX}, {@link #STBIR_FILTER_TRIANGLE FILTER_TRIANGLE}, {@link #STBIR_FILTER_CUBICBSPLINE FILTER_CUBICBSPLINE}, {@link #STBIR_FILTER_CATMULLROM FILTER_CATMULLROM}, {@link #STBIR_FILTER_MITCHELL FILTER_MITCHELL}
	 * @param space                  the image colorspace. One of:<br>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}, {@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}
	 * @param alloc_context          pointer to the allocation context
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbir_resize_uint8_generic(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space, ByteBuffer alloc_context) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(input_pixels, input_w * input_h * num_channels);
			checkBuffer(output_pixels, output_w * output_h * num_channels);
		}
		return nstbir_resize_uint8_generic(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode, filter, space, memAddress(alloc_context));
	}

	/** Alternative version of: {@link #stbir_resize_uint8_generic resize_uint8_generic} */
	public static int stbir_resize_uint8_generic(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(input_pixels, input_w * input_h * num_channels);
			checkBuffer(output_pixels, output_w * output_h * num_channels);
		}
		return nstbir_resize_uint8_generic(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode, filter, space, 0L);
	}

	// --- [ stbir_resize_uint16_generic ] ---

	/** JNI method for {@link #stbir_resize_uint16_generic resize_uint16_generic} */
	@JavadocExclude
	public static native int nstbir_resize_uint16_generic(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space, long alloc_context);

	/**
	 * Short version of {@link #stbir_resize_uint8_generic resize_uint8_generic}.
	 *
	 * @param input_pixels           the source image data
	 * @param input_w                the source image width
	 * @param input_h                the source image height
	 * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param output_pixels          returns the scaled image data
	 * @param output_w               the resized image width
	 * @param output_h               the resized image height
	 * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
	 * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
	 * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, {@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}
	 * @param edge_wrap_mode         the edge wrap mode. One of:<br>{@link #STBIR_EDGE_CLAMP EDGE_CLAMP}, {@link #STBIR_EDGE_REFLECT EDGE_REFLECT}, {@link #STBIR_EDGE_WRAP EDGE_WRAP}, {@link #STBIR_EDGE_ZERO EDGE_ZERO}
	 * @param filter                 the scale filter. One of:<br>{@link #STBIR_FILTER_DEFAULT FILTER_DEFAULT}, {@link #STBIR_FILTER_BOX FILTER_BOX}, {@link #STBIR_FILTER_TRIANGLE FILTER_TRIANGLE}, {@link #STBIR_FILTER_CUBICBSPLINE FILTER_CUBICBSPLINE}, {@link #STBIR_FILTER_CATMULLROM FILTER_CATMULLROM}, {@link #STBIR_FILTER_MITCHELL FILTER_MITCHELL}
	 * @param space                  the image colorspace. One of:<br>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}, {@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}
	 * @param alloc_context          pointer to the allocation context
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbir_resize_uint16_generic(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space, ByteBuffer alloc_context) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(input_pixels, (input_w * input_h * num_channels) << 1);
			checkBuffer(output_pixels, (output_w * output_h * num_channels) << 1);
		}
		return nstbir_resize_uint16_generic(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode, filter, space, memAddress(alloc_context));
	}

	/** Alternative version of: {@link #stbir_resize_uint16_generic resize_uint16_generic} */
	public static int stbir_resize_uint16_generic(ShortBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ShortBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(input_pixels, input_w * input_h * num_channels);
			checkBuffer(output_pixels, output_w * output_h * num_channels);
		}
		return nstbir_resize_uint16_generic(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode, filter, space, 0L);
	}

	// --- [ stbir_resize_float_generic ] ---

	/** JNI method for {@link #stbir_resize_float_generic resize_float_generic} */
	@JavadocExclude
	public static native int nstbir_resize_float_generic(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space, long alloc_context);

	/**
	 * Float version of {@link #stbir_resize_uint8_generic resize_uint8_generic}.
	 *
	 * @param input_pixels           the source image data
	 * @param input_w                the source image width
	 * @param input_h                the source image height
	 * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param output_pixels          returns the scaled image data
	 * @param output_w               the resized image width
	 * @param output_h               the resized image height
	 * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
	 * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
	 * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, {@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}
	 * @param edge_wrap_mode         the edge wrap mode. One of:<br>{@link #STBIR_EDGE_CLAMP EDGE_CLAMP}, {@link #STBIR_EDGE_REFLECT EDGE_REFLECT}, {@link #STBIR_EDGE_WRAP EDGE_WRAP}, {@link #STBIR_EDGE_ZERO EDGE_ZERO}
	 * @param filter                 the scale filter. One of:<br>{@link #STBIR_FILTER_DEFAULT FILTER_DEFAULT}, {@link #STBIR_FILTER_BOX FILTER_BOX}, {@link #STBIR_FILTER_TRIANGLE FILTER_TRIANGLE}, {@link #STBIR_FILTER_CUBICBSPLINE FILTER_CUBICBSPLINE}, {@link #STBIR_FILTER_CATMULLROM FILTER_CATMULLROM}, {@link #STBIR_FILTER_MITCHELL FILTER_MITCHELL}
	 * @param space                  the image colorspace. One of:<br>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}, {@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}
	 * @param alloc_context          pointer to the allocation context
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbir_resize_float_generic(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space, ByteBuffer alloc_context) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(input_pixels, (input_w * input_h * num_channels) << 2);
			checkBuffer(output_pixels, (output_w * output_h * num_channels) << 2);
		}
		return nstbir_resize_float_generic(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode, filter, space, memAddress(alloc_context));
	}

	/** Alternative version of: {@link #stbir_resize_float_generic resize_float_generic} */
	public static int stbir_resize_float_generic(FloatBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, FloatBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(input_pixels, input_w * input_h * num_channels);
			checkBuffer(output_pixels, output_w * output_h * num_channels);
		}
		return nstbir_resize_float_generic(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode, filter, space, 0L);
	}

	// --- [ stbir_resize ] ---

	/** JNI method for {@link #stbir_resize resize} */
	@JavadocExclude
	public static native int nstbir_resize(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space, long alloc_context);

	/**
	 * Full-complexity version of {@link #stbir_resize_uint8_generic resize_uint8_generic}.
	 *
	 * @param input_pixels           the source image data
	 * @param input_w                the source image width
	 * @param input_h                the source image height
	 * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param output_pixels          returns the scaled image data
	 * @param output_w               the resized image width
	 * @param output_h               the resized image height
	 * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param datatype               the image data type. One of:<br>{@link #STBIR_TYPE_UINT8 TYPE_UINT8}, {@link #STBIR_TYPE_UINT16 TYPE_UINT16}, {@link #STBIR_TYPE_UINT32 TYPE_UINT32}, {@link #STBIR_TYPE_FLOAT TYPE_FLOAT}
	 * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
	 * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
	 * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, {@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}
	 * @param edge_mode_horizontal   the horizontal edge wrap mode
	 * @param edge_mode_vertical     the vertical edge wrap mode
	 * @param filter_horizontal      the horizontal scale filter
	 * @param filter_vertical        the vertical scale filter
	 * @param space                  the image colorspace. One of:<br>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}, {@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}
	 * @param alloc_context          pointer to the allocation context
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbir_resize(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space, ByteBuffer alloc_context) {
		return nstbir_resize(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, datatype, num_channels, alpha_channel, flags, edge_mode_horizontal, edge_mode_vertical, filter_horizontal, filter_vertical, space, memAddress(alloc_context));
	}

	/** Alternative version of: {@link #stbir_resize resize} */
	public static int stbir_resize(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space) {
		return nstbir_resize(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, datatype, num_channels, alpha_channel, flags, edge_mode_horizontal, edge_mode_vertical, filter_horizontal, filter_vertical, space, 0L);
	}

	// --- [ stbir_resize_subpixel ] ---

	/** JNI method for {@link #stbir_resize_subpixel resize_subpixel} */
	@JavadocExclude
	public static native int nstbir_resize_subpixel(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space, long alloc_context, float x_scale, float y_scale, float x_offset, float y_offset);

	/**
	 * Subpixel version of {@link #stbir_resize resize}.
	 *
	 * @param input_pixels           the source image data
	 * @param input_w                the source image width
	 * @param input_h                the source image height
	 * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param output_pixels          returns the scaled image data
	 * @param output_w               the resized image width
	 * @param output_h               the resized image height
	 * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param datatype               the image data type. One of:<br>{@link #STBIR_TYPE_UINT8 TYPE_UINT8}, {@link #STBIR_TYPE_UINT16 TYPE_UINT16}, {@link #STBIR_TYPE_UINT32 TYPE_UINT32}, {@link #STBIR_TYPE_FLOAT TYPE_FLOAT}
	 * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
	 * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
	 * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, {@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}
	 * @param edge_mode_horizontal   the horizontal edge wrap mode
	 * @param edge_mode_vertical     the vertical edge wrap mode
	 * @param filter_horizontal      the horizontal scale filter
	 * @param filter_vertical        the vertical scale filter
	 * @param space                  the image colorspace. One of:<br>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}, {@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}
	 * @param alloc_context          pointer to the allocation context
	 * @param x_scale                horizontal scale for subpixel correctness
	 * @param y_scale                vertical scale for subpixel correctness
	 * @param x_offset               horizontal offset for subpixel correctness
	 * @param y_offset               vertical offset for subpixel correctness
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbir_resize_subpixel(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space, ByteBuffer alloc_context, float x_scale, float y_scale, float x_offset, float y_offset) {
		return nstbir_resize_subpixel(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, datatype, num_channels, alpha_channel, flags, edge_mode_horizontal, edge_mode_vertical, filter_horizontal, filter_vertical, space, memAddress(alloc_context), x_scale, y_scale, x_offset, y_offset);
	}

	/** Alternative version of: {@link #stbir_resize_subpixel resize_subpixel} */
	public static int stbir_resize_subpixel(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space, float x_scale, float y_scale, float x_offset, float y_offset) {
		return nstbir_resize_subpixel(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, datatype, num_channels, alpha_channel, flags, edge_mode_horizontal, edge_mode_vertical, filter_horizontal, filter_vertical, space, 0L, x_scale, y_scale, x_offset, y_offset);
	}

	// --- [ stbir_resize_region ] ---

	/** JNI method for {@link #stbir_resize_region resize_region} */
	@JavadocExclude
	public static native int nstbir_resize_region(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space, long alloc_context, float s0, float t0, float s1, float t1);

	/**
	 * Region version of {@link #stbir_resize resize}, using texture coordinates.
	 *
	 * @param input_pixels           the source image data
	 * @param input_w                the source image width
	 * @param input_h                the source image height
	 * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param output_pixels          returns the scaled image data
	 * @param output_w               the resized image width
	 * @param output_h               the resized image height
	 * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
	 * @param datatype               the image data type. One of:<br>{@link #STBIR_TYPE_UINT8 TYPE_UINT8}, {@link #STBIR_TYPE_UINT16 TYPE_UINT16}, {@link #STBIR_TYPE_UINT32 TYPE_UINT32}, {@link #STBIR_TYPE_FLOAT TYPE_FLOAT}
	 * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
	 * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
	 * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, {@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}
	 * @param edge_mode_horizontal   the horizontal edge wrap mode
	 * @param edge_mode_vertical     the vertical edge wrap mode
	 * @param filter_horizontal      the horizontal scale filter
	 * @param filter_vertical        the vertical scale filter
	 * @param space                  the image colorspace. One of:<br>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}, {@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}
	 * @param alloc_context          pointer to the allocation context
	 * @param s0                     the left texture coordinate of the region to scale
	 * @param t0                     the top texture coordinate of the region to scale
	 * @param s1                     the right texture coordinate of the region to scale
	 * @param t1                     the bottom texture coordinate of the region to scale
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbir_resize_region(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space, ByteBuffer alloc_context, float s0, float t0, float s1, float t1) {
		return nstbir_resize_region(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, datatype, num_channels, alpha_channel, flags, edge_mode_horizontal, edge_mode_vertical, filter_horizontal, filter_vertical, space, memAddress(alloc_context), s0, t0, s1, t1);
	}

	/** Alternative version of: {@link #stbir_resize_region resize_region} */
	public static int stbir_resize_region(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space, float s0, float t0, float s1, float t1) {
		return nstbir_resize_region(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, datatype, num_channels, alpha_channel, flags, edge_mode_horizontal, edge_mode_vertical, filter_horizontal, filter_vertical, space, 0L, s0, t0, s1, t1);
	}

}