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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/blend_equation_separate.txt">EXT_blend_equation_separate</a> extension.
 * 
 * <p><a href="http://www.opengl.org/registry/specs/EXT/blend_func_separate.txt">EXT_blend_func_separate</a> introduced separate RGB and alpha blend factors. <a href="http://www.opengl.org/registry/specs/EXT/blend_minmax.txt">EXT_blend_minmax</a> introduced a
 * distinct blend equation for combining source and destination blend terms. (<a href="http://www.opengl.org/registry/specs/EXT_blend_subtract/blend_subtract.txt">EXT_blend_subtract_blend_subtract</a> &
 * <a href="http://www.opengl.org/registry/specs/EXT/blend_logic_op.txt">EXT_blend_logic_op</a> added other blend equation modes.) OpenGL 1.4 integrated both functionalities into the core standard.</p>
 * 
 * <p>While there are separate blend functions for the RGB and alpha blend factors, OpenGL 1.4 provides a single blend equation that applies to both RGB and
 * alpha portions of blending.</p>
 * 
 * <p>This extension provides a separate blend equation for RGB and alpha to match the generality available for blend factors.</p>
 * 
 * <p>Requires {@link GL14 OpenGL 1.4} or {@link ARBImaging ARB_imaging} or <a href="http://www.opengl.org/registry/specs/EXT/blend_minmax.txt">EXT_blend_minmax</a> and/or
 * <a href="http://www.opengl.org/registry/specs/EXT_blend_subtract/blend_subtract.txt">EXT_blend_subtract_blend_subtract</a>. Promoted to core in {@link GL20 OpenGL 2.0}.</p>
 */
public final class EXTBlendEquationSeparate {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_BLEND_EQUATION_RGB_EXT   = 0x8009,
		GL_BLEND_EQUATION_ALPHA_EXT = 0x883D;

	/** Function address. */
	@JavadocExclude
	public final long BlendEquationSeparateEXT;

	@JavadocExclude
	public EXTBlendEquationSeparate(FunctionProvider provider) {
		BlendEquationSeparateEXT = provider.getFunctionAddress("glBlendEquationSeparateEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTBlendEquationSeparate} instance for the current context. */
	public static EXTBlendEquationSeparate getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTBlendEquationSeparate);
	}

	static EXTBlendEquationSeparate create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_blend_equation_separate") ) return null;

		EXTBlendEquationSeparate funcs = new EXTBlendEquationSeparate(provider);

		boolean supported = checkFunctions(
			funcs.BlendEquationSeparateEXT
		);

		return GL.checkExtension("GL_EXT_blend_equation_separate", funcs, supported);
	}

	// --- [ glBlendEquationSeparateEXT ] ---

	/** JNI method for {@link #glBlendEquationSeparateEXT BlendEquationSeparateEXT} */
	@JavadocExclude
	public static native void nglBlendEquationSeparateEXT(int modeRGB, int modeAlpha, long __functionAddress);

	/**
	 * 
	 *
	 * @param modeRGB   
	 * @param modeAlpha 
	 */
	public static void glBlendEquationSeparateEXT(int modeRGB, int modeAlpha) {
		long __functionAddress = getInstance().BlendEquationSeparateEXT;
		nglBlendEquationSeparateEXT(modeRGB, modeAlpha, __functionAddress);
	}

}