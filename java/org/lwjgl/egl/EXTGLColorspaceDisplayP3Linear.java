/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_gl_colorspace_display_p3_linear.txt">EXT_gl_colorspace_display_p3_linear</a> extension.
 * 
 * <p>Applications that want to use the Display-P3 color space (DCI-P3 primaries and linear or sRGB-like transfer function) can use this extension to
 * communicate to the platform that framebuffer contents represent colors in the Display-P3 color space. The application is responsible for producing
 * appropriate framebuffer contents, but will typically use built-in sRGB encoding in OpenGL and OpenGL ES to accomplish this.</p>
 * 
 * <p>Requires {@link KHRGLColorspace KHR_gl_colorspace}.</p>
 */
public final class EXTGLColorspaceDisplayP3Linear {

    /** Accepted as attribute values for {@link EGL15#EGL_GL_COLORSPACE GL_COLORSPACE} by {@link EGL10#eglCreateWindowSurface CreateWindowSurface}, {@link EGL10#eglCreatePbufferSurface CreatePbufferSurface} and {@link EGL10#eglCreatePixmapSurface CreatePixmapSurface}. */
    public static final int EGL_GL_COLORSPACE_DISPLAY_P3_LINEAR_EXT = 0x3362;

    private EXTGLColorspaceDisplayP3Linear() {}

}