/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;

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

	static { GLES.initialize(); }

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

	public static native void glEnableiOES(int target, int index);

	// --- [ glDisableiOES ] ---

	public static native void glDisableiOES(int target, int index);

	// --- [ glBlendEquationiOES ] ---

	public static native void glBlendEquationiOES(int buf, int mode);

	// --- [ glBlendEquationSeparateiOES ] ---

	public static native void glBlendEquationSeparateiOES(int buf, int modeRGB, int modeAlpha);

	// --- [ glBlendFunciOES ] ---

	public static native void glBlendFunciOES(int buf, int src, int dst);

	// --- [ glBlendFuncSeparateiOES ] ---

	public static native void glBlendFuncSeparateiOES(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

	// --- [ glColorMaskiOES ] ---

	public static native void glColorMaskiOES(int index, boolean r, boolean g, boolean b, boolean a);

	// --- [ glIsEnablediOES ] ---

	public static native boolean glIsEnablediOES(int target, int index);

}