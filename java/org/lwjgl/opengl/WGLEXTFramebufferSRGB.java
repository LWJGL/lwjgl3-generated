/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/framebuffer_sRGB.txt">WGL_EXT_framebuffer_sRGB</a> extension.
 * 
 * <p>This extension adds a framebuffer capability for sRGB framebuffer update and blending.</p>
 * 
 * <p>Requires {@link WGLEXTExtensionsString WGL_EXT_extensions_string} and {@link WGLARBPixelFormat WGL_ARB_pixel_format}.</p>
 */
public final class WGLEXTFramebufferSRGB {

	/**
	 * Accepted by the {@code attributes} parameter of {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB GetPixelFormatAttribiARB} and the {@code attribIList} of
	 * {@link WGLARBPixelFormat#wglChoosePixelFormatARB ChoosePixelFormatARB}.
	 */
	public static final int WGL_FRAMEBUFFER_SRGB_CAPABLE_ARB = 0x20A9;

	private WGLEXTFramebufferSRGB() {}

}