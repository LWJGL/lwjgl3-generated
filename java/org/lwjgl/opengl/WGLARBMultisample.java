/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/multisample.txt">WGL_ARB_multisample</a> extension.
 * <p/>
 * This extension provides a mechanism to antialias all GL primitives: points, lines, polygons, bitmaps, and images.  The technique is to sample all
 * primitives multiple times at each pixel.  The color sample values are resolved to a single, displayable color each time a pixel is updated, so the
 * antialiasing appears to be automatic at the application level.  Because each sample includes depth and stencil information, the depth and stencil
 * functions perform equivalently to the single-sample mode.
 */
public final class WGLARBMultisample {

	/**
	 * Accepted by the {@code attributes} parameter of {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB GetPixelFormatAttribiARB},
	 * {@link WGLARBPixelFormat#wglGetPixelFormatAttribfARB GetPixelFormatAttribfARB}, and the {@code attribIList} and {@code attribFList} of
	 * {@link WGLARBPixelFormat#wglChoosePixelFormatARB ChoosePixelFormatARB}.
	 */
	public static final int
		WGL_SAMPLE_BUFFERS_ARB = 0x2041,
		WGL_SAMPLES_ARB        = 0x2042;

	private WGLARBMultisample() {}

}