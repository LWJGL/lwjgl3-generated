/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/multisample_coverage.txt">NV_multisample_coverage</a> extension.
 * 
 * <p>This extension follows the example of the NV_framebuffer_multisample_coverage extension, which adds CSAA support for framebuffer objects.</p>
 * 
 * <p>Requires {@link ARBMultisample ARB_multisample}.</p>
 */
public final class NVMultisampleCoverage {

	/**
	 * Accepted by the {@code attribList} parameter of glXChooseVisual, and by the {@code attrib} parameter of glXGetConfig, the
	 * {@code attrib_list} parameter of glXChooseFBConfig, and the {@code attribute} parameter of glXGetFBConfigAttrib.
	 */
	public static final int
		GL_GLX_COVERAGE_SAMPLES_NV = 0x186A1,
		GL_GLX_COLOR_SAMPLES_NV    = 0x20B3;

	/**
	 * Accepted by the {@code piAttributes} parameter of wglGetPixelFormatAttribivEXT, wglGetPixelFormatAttribfvEXT, and the
	 * {@code piAttribIList} and {@code pfAttribIList} of wglChoosePixelFormatEXT.
	 */
	public static final int
		GL_WGL_COVERAGE_SAMPLES_NV = 0x2042,
		GL_WGL_COLOR_SAMPLES_NV    = 0x20B9;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int GL_COLOR_SAMPLES_NV = 0x8E20;

	private NVMultisampleCoverage() {}

}