/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_yuv_surface.txt">EXT_yuv_surface</a> extension.
 * 
 * <p>This extension defines a set of new EGL configuration attributes and values which allows EGL to create and use YUV surfaces.</p>
 * 
 * <p>YUV formats can be described using a few simple parameters, and every format can be given with these six parameters. These parameters include the color
 * order, the number of planes, subsample, plane depth, color conversion and depth range.</p>
 * 
 * <p>This extension describes how EGL will handle YUV surfaces, but requires that the client API describe how to fill such a surface. An example of such an
 * extension would be GL_EXT_yuv_target.</p>
 * 
 * <p>Requires {@link EGL14 EGL L.1}.</p>
 */
public final class EXTYUVSurface {

	/**  */
	public static final int
		EGL_YUV_ORDER_EXT               = 0x3301,
		EGL_YUV_NUMBER_OF_PLANES_EXT    = 0x3311,
		EGL_YUV_SUBSAMPLE_EXT           = 0x3312,
		EGL_YUV_DEPTH_RANGE_EXT         = 0x3317,
		EGL_YUV_CSC_STANDARD_EXT        = 0x330A,
		EGL_YUV_PLANE_BPP_EXT           = 0x331A,
		EGL_YUV_BUFFER_EXT              = 0x3300,
		EGL_YUV_ORDER_YUV_EXT           = 0x3302,
		EGL_YUV_ORDER_YVU_EXT           = 0x3303,
		EGL_YUV_ORDER_YUYV_EXT          = 0x3304,
		EGL_YUV_ORDER_UYVY_EXT          = 0x3305,
		EGL_YUV_ORDER_YVYU_EXT          = 0x3306,
		EGL_YUV_ORDER_VYUY_EXT          = 0x3307,
		EGL_YUV_ORDER_AYUV_EXT          = 0x3308,
		EGL_YUV_SUBSAMPLE_4_2_0_EXT     = 0x3313,
		EGL_YUV_SUBSAMPLE_4_2_2_EXT     = 0x3314,
		EGL_YUV_SUBSAMPLE_4_4_4_EXT     = 0x3315,
		EGL_YUV_DEPTH_RANGE_LIMITED_EXT = 0x3318,
		EGL_YUV_DEPTH_RANGE_FULL_EXT    = 0x3319,
		EGL_YUV_CSC_STANDARD_601_EXT    = 0x330B,
		EGL_YUV_CSC_STANDARD_709_EXT    = 0x330C,
		EGL_YUV_CSC_STANDARD_2020_EXT   = 0x330D,
		EGL_YUV_PLANE_BPP_0_EXT         = 0x331B,
		EGL_YUV_PLANE_BPP_8_EXT         = 0x331C,
		EGL_YUV_PLANE_BPP_10_EXT        = 0x331D;

	private EXTYUVSurface() {}

}