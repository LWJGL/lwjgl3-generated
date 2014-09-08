/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/multisample.txt">WGL_ARB_multisample</a> extension.
 * 
 * <p>See {@link ARBMultisample} for details.</p>
 * 
 * <p>Requires {@link WGLEXTExtensionsString WGL_EXT_extensions_string} and {@link WGLARBPixelFormat WGL_ARB_pixel_format}.</p>
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