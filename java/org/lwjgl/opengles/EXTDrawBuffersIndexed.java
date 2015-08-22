/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_draw_buffers_indexed.txt">EXT_draw_buffers_indexed</a> extension.
 * 
 * <p>This extension builds upon the EXT_draw_buffers extension. In EXT_draw_buffers (part of OpenGL ES 3.0), separate values could be written to each color
 * buffer, but the blend enable, blend functions, blend equations and color write masks are global and apply to all color outputs.</p>
 * 
 * <p>This extension provides the ability to independently
 * <ul>
 * <li>enable or disable blending</li>
 * <li>set the blend equations</li>
 * <li>set the blend functions, and</li>
 * <li>set the color write masks per color output.</li>
 * </ul>
 * This extension introduces indexed versions of the enable, blend equation, blend function, and color mask commands, as well as associated indexed
 * queries in order to control and query these states independently on a per-color output basis.</p>
 * 
 * <p>Requres {@link GLES30 GLES E.S} or {@link EXTDrawBuffers EXT_draw_buffers}.</p>
 */
public final class EXTDrawBuffersIndexed {

	/** Function address. */
	@JavadocExclude
	public final long
		EnableiEXT,
		DisableiEXT,
		BlendEquationiEXT,
		BlendEquationSeparateiEXT,
		BlendFunciEXT,
		BlendFuncSeparateiEXT,
		ColorMaskiEXT,
		IsEnablediEXT;

	@JavadocExclude
	public EXTDrawBuffersIndexed(FunctionProvider provider) {
		EnableiEXT = provider.getFunctionAddress("glEnableiEXT");
		DisableiEXT = provider.getFunctionAddress("glDisableiEXT");
		BlendEquationiEXT = provider.getFunctionAddress("glBlendEquationiEXT");
		BlendEquationSeparateiEXT = provider.getFunctionAddress("glBlendEquationSeparateiEXT");
		BlendFunciEXT = provider.getFunctionAddress("glBlendFunciEXT");
		BlendFuncSeparateiEXT = provider.getFunctionAddress("glBlendFuncSeparateiEXT");
		ColorMaskiEXT = provider.getFunctionAddress("glColorMaskiEXT");
		IsEnablediEXT = provider.getFunctionAddress("glIsEnablediEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDrawBuffersIndexed} instance for the current context. */
	public static EXTDrawBuffersIndexed getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTDrawBuffersIndexed);
	}

	static EXTDrawBuffersIndexed create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_draw_buffers_indexed") ) return null;

		EXTDrawBuffersIndexed funcs = new EXTDrawBuffersIndexed(provider);
		boolean supported = checkFunctions(
			funcs.EnableiEXT, funcs.DisableiEXT, funcs.BlendEquationiEXT, funcs.BlendEquationSeparateiEXT, funcs.BlendFunciEXT, funcs.BlendFuncSeparateiEXT, 
			funcs.ColorMaskiEXT, funcs.IsEnablediEXT
		);

		return GLES.checkExtension("GL_EXT_draw_buffers_indexed", funcs, supported);
	}

	// --- [ glEnableiEXT ] ---

	public static void glEnableiEXT(int target, int index) {
		long __functionAddress = getInstance().EnableiEXT;
		callIIV(__functionAddress, target, index);
	}

	// --- [ glDisableiEXT ] ---

	public static void glDisableiEXT(int target, int index) {
		long __functionAddress = getInstance().DisableiEXT;
		callIIV(__functionAddress, target, index);
	}

	// --- [ glBlendEquationiEXT ] ---

	public static void glBlendEquationiEXT(int buf, int mode) {
		long __functionAddress = getInstance().BlendEquationiEXT;
		callIIV(__functionAddress, buf, mode);
	}

	// --- [ glBlendEquationSeparateiEXT ] ---

	public static void glBlendEquationSeparateiEXT(int buf, int modeRGB, int modeAlpha) {
		long __functionAddress = getInstance().BlendEquationSeparateiEXT;
		callIIIV(__functionAddress, buf, modeRGB, modeAlpha);
	}

	// --- [ glBlendFunciEXT ] ---

	public static void glBlendFunciEXT(int buf, int src, int dst) {
		long __functionAddress = getInstance().BlendFunciEXT;
		callIIIV(__functionAddress, buf, src, dst);
	}

	// --- [ glBlendFuncSeparateiEXT ] ---

	public static void glBlendFuncSeparateiEXT(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		long __functionAddress = getInstance().BlendFuncSeparateiEXT;
		callIIIIIV(__functionAddress, buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
	}

	// --- [ glColorMaskiEXT ] ---

	public static void glColorMaskiEXT(int index, boolean r, boolean g, boolean b, boolean a) {
		long __functionAddress = getInstance().ColorMaskiEXT;
		callIZZZZV(__functionAddress, index, r, g, b, a);
	}

	// --- [ glIsEnablediEXT ] ---

	public static boolean glIsEnablediEXT(int target, int index) {
		long __functionAddress = getInstance().IsEnablediEXT;
		return callIIZ(__functionAddress, target, index);
	}

}