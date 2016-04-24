/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_draw_buffers_indexed.txt">OES_draw_buffers_indexed</a> extension.
 * 
 * <p>This extension builds upon the EXT_draw_buffers extension. In EXT_draw_buffers (part of OpenGL ES 3.0), separate values could be written to each color
 * buffer, but the blend enable, blend functions, blend equations and color write masks are global and apply to all color outputs.</p>
 * 
 * <p>This extension provides the ability to independently</p>
 * 
 * <ul>
 * <li>enable or disable blending</li>
 * <li>set the blend equations</li>
 * <li>set the blend functions, and</li>
 * <li>set the color write masks per color output.</li>
 * </ul>
 * 
 * <p>This extension introduces indexed versions of the enable, blend equation, blend function, and color mask commands, as well as associated indexed
 * queries in order to control and query these states independently on a per-color output basis.</p>
 */
public class OESDrawBuffersIndexed {

	protected OESDrawBuffersIndexed() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glEnableiOES, caps.glDisableiOES, caps.glBlendEquationiOES, caps.glBlendEquationSeparateiOES, caps.glBlendFunciOES, 
			caps.glBlendFuncSeparateiOES, caps.glColorMaskiOES, caps.glIsEnablediOES
		);
	}

	// --- [ glEnableiOES ] ---

	public static void glEnableiOES(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glEnableiOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index);
	}

	// --- [ glDisableiOES ] ---

	public static void glDisableiOES(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glDisableiOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index);
	}

	// --- [ glBlendEquationiOES ] ---

	public static void glBlendEquationiOES(int buf, int mode) {
		long __functionAddress = GLES.getCapabilities().glBlendEquationiOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, mode);
	}

	// --- [ glBlendEquationSeparateiOES ] ---

	public static void glBlendEquationSeparateiOES(int buf, int modeRGB, int modeAlpha) {
		long __functionAddress = GLES.getCapabilities().glBlendEquationSeparateiOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, modeRGB, modeAlpha);
	}

	// --- [ glBlendFunciOES ] ---

	public static void glBlendFunciOES(int buf, int src, int dst) {
		long __functionAddress = GLES.getCapabilities().glBlendFunciOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, src, dst);
	}

	// --- [ glBlendFuncSeparateiOES ] ---

	public static void glBlendFuncSeparateiOES(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		long __functionAddress = GLES.getCapabilities().glBlendFuncSeparateiOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
	}

	// --- [ glColorMaskiOES ] ---

	public static void glColorMaskiOES(int index, boolean r, boolean g, boolean b, boolean a) {
		long __functionAddress = GLES.getCapabilities().glColorMaskiOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, r, g, b, a);
	}

	// --- [ glIsEnablediOES ] ---

	public static boolean glIsEnablediOES(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glIsEnablediOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, target, index);
	}

}