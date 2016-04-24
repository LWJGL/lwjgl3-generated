/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/draw_buffers_blend.txt">AMD_draw_buffers_blend</a> extension.
 * 
 * <p>This extension builds upon the ARB_draw_buffers and EXT_draw_buffers2 extensions. In ARB_draw_buffers (part of OpenGL 2.0), separate values could be
 * written to each color buffer. This was further enhanced by EXT_draw_buffers2 by adding in the ability to enable blending and to set color write masks
 * independently per color output.</p>
 * 
 * <p>This extension provides the ability to set individual blend equations and blend functions for each color output.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} and <a href="http://www.opengl.org/registry/specs/EXT/draw_buffers2.txt">AMD_draw_buffers_blend</a>.</p>
 */
public class AMDDrawBuffersBlend {

	protected AMDDrawBuffersBlend() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glBlendFuncIndexedAMD, caps.glBlendFuncSeparateIndexedAMD, caps.glBlendEquationIndexedAMD, caps.glBlendEquationSeparateIndexedAMD
		);
	}

	// --- [ glBlendFuncIndexedAMD ] ---

	public static void glBlendFuncIndexedAMD(int buf, int src, int dst) {
		long __functionAddress = GL.getCapabilities().glBlendFuncIndexedAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, src, dst);
	}

	// --- [ glBlendFuncSeparateIndexedAMD ] ---

	public static void glBlendFuncSeparateIndexedAMD(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		long __functionAddress = GL.getCapabilities().glBlendFuncSeparateIndexedAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
	}

	// --- [ glBlendEquationIndexedAMD ] ---

	public static void glBlendEquationIndexedAMD(int buf, int mode) {
		long __functionAddress = GL.getCapabilities().glBlendEquationIndexedAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, mode);
	}

	// --- [ glBlendEquationSeparateIndexedAMD ] ---

	public static void glBlendEquationSeparateIndexedAMD(int buf, int modeRGB, int modeAlpha) {
		long __functionAddress = GL.getCapabilities().glBlendEquationSeparateIndexedAMD;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, modeRGB, modeAlpha);
	}

}