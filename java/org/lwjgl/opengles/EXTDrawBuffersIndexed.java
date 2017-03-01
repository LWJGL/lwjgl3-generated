/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_draw_buffers_indexed.txt">EXT_draw_buffers_indexed</a> extension.
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

	static { GLES.initialize(); }

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

	public static native void glEnableiEXT(int target, int index);

	// --- [ glDisableiEXT ] ---

	public static native void glDisableiEXT(int target, int index);

	// --- [ glBlendEquationiEXT ] ---

	public static native void glBlendEquationiEXT(int buf, int mode);

	// --- [ glBlendEquationSeparateiEXT ] ---

	public static native void glBlendEquationSeparateiEXT(int buf, int modeRGB, int modeAlpha);

	// --- [ glBlendFunciEXT ] ---

	public static native void glBlendFunciEXT(int buf, int src, int dst);

	// --- [ glBlendFuncSeparateiEXT ] ---

	public static native void glBlendFuncSeparateiEXT(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

	// --- [ glColorMaskiEXT ] ---

	public static native void glColorMaskiEXT(int index, boolean r, boolean g, boolean b, boolean a);

	// --- [ glIsEnablediEXT ] ---

	public static native boolean glIsEnablediEXT(int target, int index);

}