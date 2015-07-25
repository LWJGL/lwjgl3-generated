/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

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
public final class AMDDrawBuffersBlend {

	/** Function address. */
	@JavadocExclude
	public final long
		BlendFuncIndexedAMD,
		BlendFuncSeparateIndexedAMD,
		BlendEquationIndexedAMD,
		BlendEquationSeparateIndexedAMD;

	@JavadocExclude
	public AMDDrawBuffersBlend(FunctionProvider provider) {
		BlendFuncIndexedAMD = provider.getFunctionAddress("glBlendFuncIndexedAMD");
		BlendFuncSeparateIndexedAMD = provider.getFunctionAddress("glBlendFuncSeparateIndexedAMD");
		BlendEquationIndexedAMD = provider.getFunctionAddress("glBlendEquationIndexedAMD");
		BlendEquationSeparateIndexedAMD = provider.getFunctionAddress("glBlendEquationSeparateIndexedAMD");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link AMDDrawBuffersBlend} instance for the current context. */
	public static AMDDrawBuffersBlend getInstance() {
		return checkFunctionality(GL.getCapabilities().__AMDDrawBuffersBlend);
	}

	static AMDDrawBuffersBlend create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_AMD_draw_buffers_blend") ) return null;

		AMDDrawBuffersBlend funcs = new AMDDrawBuffersBlend(provider);

		boolean supported = checkFunctions(
			funcs.BlendFuncIndexedAMD, funcs.BlendFuncSeparateIndexedAMD, funcs.BlendEquationIndexedAMD, funcs.BlendEquationSeparateIndexedAMD
		);

		return GL.checkExtension("GL_AMD_draw_buffers_blend", funcs, supported);
	}

	// --- [ glBlendFuncIndexedAMD ] ---

	/** JNI method for {@link #glBlendFuncIndexedAMD BlendFuncIndexedAMD} */
	@JavadocExclude
	public static native void nglBlendFuncIndexedAMD(int buf, int src, int dst, long __functionAddress);

	public static void glBlendFuncIndexedAMD(int buf, int src, int dst) {
		long __functionAddress = getInstance().BlendFuncIndexedAMD;
		nglBlendFuncIndexedAMD(buf, src, dst, __functionAddress);
	}

	// --- [ glBlendFuncSeparateIndexedAMD ] ---

	/** JNI method for {@link #glBlendFuncSeparateIndexedAMD BlendFuncSeparateIndexedAMD} */
	@JavadocExclude
	public static native void nglBlendFuncSeparateIndexedAMD(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha, long __functionAddress);

	public static void glBlendFuncSeparateIndexedAMD(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		long __functionAddress = getInstance().BlendFuncSeparateIndexedAMD;
		nglBlendFuncSeparateIndexedAMD(buf, srcRGB, dstRGB, srcAlpha, dstAlpha, __functionAddress);
	}

	// --- [ glBlendEquationIndexedAMD ] ---

	/** JNI method for {@link #glBlendEquationIndexedAMD BlendEquationIndexedAMD} */
	@JavadocExclude
	public static native void nglBlendEquationIndexedAMD(int buf, int mode, long __functionAddress);

	public static void glBlendEquationIndexedAMD(int buf, int mode) {
		long __functionAddress = getInstance().BlendEquationIndexedAMD;
		nglBlendEquationIndexedAMD(buf, mode, __functionAddress);
	}

	// --- [ glBlendEquationSeparateIndexedAMD ] ---

	/** JNI method for {@link #glBlendEquationSeparateIndexedAMD BlendEquationSeparateIndexedAMD} */
	@JavadocExclude
	public static native void nglBlendEquationSeparateIndexedAMD(int buf, int modeRGB, int modeAlpha, long __functionAddress);

	public static void glBlendEquationSeparateIndexedAMD(int buf, int modeRGB, int modeAlpha) {
		long __functionAddress = getInstance().BlendEquationSeparateIndexedAMD;
		nglBlendEquationSeparateIndexedAMD(buf, modeRGB, modeAlpha, __functionAddress);
	}

}