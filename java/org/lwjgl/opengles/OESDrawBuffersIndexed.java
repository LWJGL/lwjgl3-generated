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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_draw_buffers_indexed.txt">OES_draw_buffers_indexed</a> extension.
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
 * </ul></p>
 * 
 * <p>This extension introduces indexed versions of the enable, blend equation, blend function, and color mask commands, as well as associated indexed
 * queries in order to control and query these states independently on a per-color output basis.</p>
 */
public final class OESDrawBuffersIndexed {

	/** Function address. */
	@JavadocExclude
	public final long
		EnableiOES,
		DisableiOES,
		BlendEquationiOES,
		BlendEquationSeparateiOES,
		BlendFunciOES,
		BlendFuncSeparateiOES,
		ColorMaskiOES,
		IsEnablediOES;

	@JavadocExclude
	public OESDrawBuffersIndexed(FunctionProvider provider) {
		EnableiOES = provider.getFunctionAddress("glEnableiOES");
		DisableiOES = provider.getFunctionAddress("glDisableiOES");
		BlendEquationiOES = provider.getFunctionAddress("glBlendEquationiOES");
		BlendEquationSeparateiOES = provider.getFunctionAddress("glBlendEquationSeparateiOES");
		BlendFunciOES = provider.getFunctionAddress("glBlendFunciOES");
		BlendFuncSeparateiOES = provider.getFunctionAddress("glBlendFuncSeparateiOES");
		ColorMaskiOES = provider.getFunctionAddress("glColorMaskiOES");
		IsEnablediOES = provider.getFunctionAddress("glIsEnablediOES");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OESDrawBuffersIndexed} instance for the current context. */
	public static OESDrawBuffersIndexed getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OESDrawBuffersIndexed);
	}

	static OESDrawBuffersIndexed create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OES_draw_buffers_indexed") ) return null;

		OESDrawBuffersIndexed funcs = new OESDrawBuffersIndexed(provider);
		boolean supported = checkFunctions(
			funcs.EnableiOES, funcs.DisableiOES, funcs.BlendEquationiOES, funcs.BlendEquationSeparateiOES, funcs.BlendFunciOES, funcs.BlendFuncSeparateiOES, 
			funcs.ColorMaskiOES, funcs.IsEnablediOES
		);

		return GLES.checkExtension("GL_OES_draw_buffers_indexed", funcs, supported);
	}

	// --- [ glEnableiOES ] ---

	public static void glEnableiOES(int target, int index) {
		long __functionAddress = getInstance().EnableiOES;
		callIIV(__functionAddress, target, index);
	}

	// --- [ glDisableiOES ] ---

	public static void glDisableiOES(int target, int index) {
		long __functionAddress = getInstance().DisableiOES;
		callIIV(__functionAddress, target, index);
	}

	// --- [ glBlendEquationiOES ] ---

	public static void glBlendEquationiOES(int buf, int mode) {
		long __functionAddress = getInstance().BlendEquationiOES;
		callIIV(__functionAddress, buf, mode);
	}

	// --- [ glBlendEquationSeparateiOES ] ---

	public static void glBlendEquationSeparateiOES(int buf, int modeRGB, int modeAlpha) {
		long __functionAddress = getInstance().BlendEquationSeparateiOES;
		callIIIV(__functionAddress, buf, modeRGB, modeAlpha);
	}

	// --- [ glBlendFunciOES ] ---

	public static void glBlendFunciOES(int buf, int src, int dst) {
		long __functionAddress = getInstance().BlendFunciOES;
		callIIIV(__functionAddress, buf, src, dst);
	}

	// --- [ glBlendFuncSeparateiOES ] ---

	public static void glBlendFuncSeparateiOES(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		long __functionAddress = getInstance().BlendFuncSeparateiOES;
		callIIIIIV(__functionAddress, buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
	}

	// --- [ glColorMaskiOES ] ---

	public static void glColorMaskiOES(int index, boolean r, boolean g, boolean b, boolean a) {
		long __functionAddress = getInstance().ColorMaskiOES;
		callIZZZZV(__functionAddress, index, r, g, b, a);
	}

	// --- [ glIsEnablediOES ] ---

	public static boolean glIsEnablediOES(int target, int index) {
		long __functionAddress = getInstance().IsEnablediOES;
		return callIIZ(__functionAddress, target, index);
	}

}