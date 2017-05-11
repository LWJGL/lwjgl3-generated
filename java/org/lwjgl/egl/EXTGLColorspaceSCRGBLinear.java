/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_gl_colorspace_scrgb_linear.txt">EXT_gl_colorspace_scrgb_linear</a> extension.
 * 
 * <p>This extension provides a new color space option, scRGB, for applications to choose from when creating an {@code EGLSurface}. The scRGB color space
 * defines a linear display referred space. It has the same white point and color primaries as sRGB, and thus is backward-compatible with sRGB. Refer to
 * the IEC 61966-2-2:2003 standard for details on scRGB color space.</p>
 * 
 * <p>This extension chooses to use floating-point formats for scRGB color space. For each color channel, the floating-point values of 0.0 and 1.0 still
 * correspond to sRGB chromaticities and luminance levels. However, scRGB space allows for color values beyond the range of [0.0, 1.0], and can thus
 * achieve a larger color volume than that of sRGB. As it is display referred, scRGB space makes assumptions of how the floating-point color values should
 * map to luminance levels by the underlying display pipeline. The expected mapping is such that a color value of (1.0, 1.0, 1.0) corresponds to a
 * luminance level of 80 nits on a standardized studio monitor. As the color value per channel goes beyond 1.0 and up to 125.0, the corresponding
 * luminance levels also increase linearly to a maximum of 10000 nits.</p>
 * 
 * <p>Requires {@link KHRGLColorspace KHR_gl_colorspace} and {@link EXTPixelFormatFloat EXT_pixel_format_float}.</p>
 */
public final class EXTGLColorspaceSCRGBLinear {

    /** Accepted as attribute values for {@link EGL15#EGL_GL_COLORSPACE GL_COLORSPACE} by {@link EGL10#eglCreateWindowSurface CreateWindowSurface}, {@link EGL10#eglCreatePbufferSurface CreatePbufferSurface} and {@link EGL10#eglCreatePixmapSurface CreatePixmapSurface}. */
    public static final int EGL_GL_COLORSPACE_SCRGB_LINEAR_EXT = 0x3350;

    private EXTGLColorspaceSCRGBLinear() {}

}