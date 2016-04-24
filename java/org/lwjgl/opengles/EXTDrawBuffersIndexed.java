/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_draw_buffers_indexed.txt">EXT_draw_buffers_indexed</a> extension.
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
 * 
 * <p>Requres {@link GLES30 GLES 3.0} or {@link EXTDrawBuffers EXT_draw_buffers}.</p>
 */
public class EXTDrawBuffersIndexed {

	protected EXTDrawBuffersIndexed() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glEnableiEXT, caps.glDisableiEXT, caps.glBlendEquationiEXT, caps.glBlendEquationSeparateiEXT, caps.glBlendFunciEXT, 
			caps.glBlendFuncSeparateiEXT, caps.glColorMaskiEXT, caps.glIsEnablediEXT
		);
	}

	// --- [ glEnableiEXT ] ---

	public static void glEnableiEXT(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glEnableiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index);
	}

	// --- [ glDisableiEXT ] ---

	public static void glDisableiEXT(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glDisableiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index);
	}

	// --- [ glBlendEquationiEXT ] ---

	public static void glBlendEquationiEXT(int buf, int mode) {
		long __functionAddress = GLES.getCapabilities().glBlendEquationiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, mode);
	}

	// --- [ glBlendEquationSeparateiEXT ] ---

	public static void glBlendEquationSeparateiEXT(int buf, int modeRGB, int modeAlpha) {
		long __functionAddress = GLES.getCapabilities().glBlendEquationSeparateiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, modeRGB, modeAlpha);
	}

	// --- [ glBlendFunciEXT ] ---

	public static void glBlendFunciEXT(int buf, int src, int dst) {
		long __functionAddress = GLES.getCapabilities().glBlendFunciEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, src, dst);
	}

	// --- [ glBlendFuncSeparateiEXT ] ---

	public static void glBlendFuncSeparateiEXT(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		long __functionAddress = GLES.getCapabilities().glBlendFuncSeparateiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
	}

	// --- [ glColorMaskiEXT ] ---

	public static void glColorMaskiEXT(int index, boolean r, boolean g, boolean b, boolean a) {
		long __functionAddress = GLES.getCapabilities().glColorMaskiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, r, g, b, a);
	}

	// --- [ glIsEnablediEXT ] ---

	public static boolean glIsEnablediEXT(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glIsEnablediEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, target, index);
	}

}