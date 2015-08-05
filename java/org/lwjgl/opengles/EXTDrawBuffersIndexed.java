/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

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

	/** JNI method for {@link #glEnableiEXT EnableiEXT} */
	@JavadocExclude
	public static native void nglEnableiEXT(int target, int index, long __functionAddress);

	public static void glEnableiEXT(int target, int index) {
		long __functionAddress = getInstance().EnableiEXT;
		nglEnableiEXT(target, index, __functionAddress);
	}

	// --- [ glDisableiEXT ] ---

	/** JNI method for {@link #glDisableiEXT DisableiEXT} */
	@JavadocExclude
	public static native void nglDisableiEXT(int target, int index, long __functionAddress);

	public static void glDisableiEXT(int target, int index) {
		long __functionAddress = getInstance().DisableiEXT;
		nglDisableiEXT(target, index, __functionAddress);
	}

	// --- [ glBlendEquationiEXT ] ---

	/** JNI method for {@link #glBlendEquationiEXT BlendEquationiEXT} */
	@JavadocExclude
	public static native void nglBlendEquationiEXT(int buf, int mode, long __functionAddress);

	public static void glBlendEquationiEXT(int buf, int mode) {
		long __functionAddress = getInstance().BlendEquationiEXT;
		nglBlendEquationiEXT(buf, mode, __functionAddress);
	}

	// --- [ glBlendEquationSeparateiEXT ] ---

	/** JNI method for {@link #glBlendEquationSeparateiEXT BlendEquationSeparateiEXT} */
	@JavadocExclude
	public static native void nglBlendEquationSeparateiEXT(int buf, int modeRGB, int modeAlpha, long __functionAddress);

	public static void glBlendEquationSeparateiEXT(int buf, int modeRGB, int modeAlpha) {
		long __functionAddress = getInstance().BlendEquationSeparateiEXT;
		nglBlendEquationSeparateiEXT(buf, modeRGB, modeAlpha, __functionAddress);
	}

	// --- [ glBlendFunciEXT ] ---

	/** JNI method for {@link #glBlendFunciEXT BlendFunciEXT} */
	@JavadocExclude
	public static native void nglBlendFunciEXT(int buf, int src, int dst, long __functionAddress);

	public static void glBlendFunciEXT(int buf, int src, int dst) {
		long __functionAddress = getInstance().BlendFunciEXT;
		nglBlendFunciEXT(buf, src, dst, __functionAddress);
	}

	// --- [ glBlendFuncSeparateiEXT ] ---

	/** JNI method for {@link #glBlendFuncSeparateiEXT BlendFuncSeparateiEXT} */
	@JavadocExclude
	public static native void nglBlendFuncSeparateiEXT(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha, long __functionAddress);

	public static void glBlendFuncSeparateiEXT(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		long __functionAddress = getInstance().BlendFuncSeparateiEXT;
		nglBlendFuncSeparateiEXT(buf, srcRGB, dstRGB, srcAlpha, dstAlpha, __functionAddress);
	}

	// --- [ glColorMaskiEXT ] ---

	/** JNI method for {@link #glColorMaskiEXT ColorMaskiEXT} */
	@JavadocExclude
	public static native void nglColorMaskiEXT(int index, boolean r, boolean g, boolean b, boolean a, long __functionAddress);

	public static void glColorMaskiEXT(int index, boolean r, boolean g, boolean b, boolean a) {
		long __functionAddress = getInstance().ColorMaskiEXT;
		nglColorMaskiEXT(index, r, g, b, a, __functionAddress);
	}

	// --- [ glIsEnablediEXT ] ---

	/** JNI method for {@link #glIsEnablediEXT IsEnablediEXT} */
	@JavadocExclude
	public static native boolean nglIsEnablediEXT(int target, int index, long __functionAddress);

	public static boolean glIsEnablediEXT(int target, int index) {
		long __functionAddress = getInstance().IsEnablediEXT;
		return nglIsEnablediEXT(target, index, __functionAddress);
	}

}