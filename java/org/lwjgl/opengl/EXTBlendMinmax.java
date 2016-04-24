/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/blend_minmax.txt">EXT_blend_minmax</a> extension.
 * 
 * <p>Blending capability is extended by respecifying the entire blend equation. While this document defines only two new equations, the {@link #glBlendEquationEXT BlendEquationEXT}
 * procedure that it defines will be used by subsequent extensions to define additional blending equations.</p>
 * 
 * <p>The two new equations defined by this extension produce the minimum (or maximum) color components of the source and destination colors. Taking the
 * maximum is useful for applications such as maximum projection in medical imaging.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public class EXTBlendMinmax {

	/** Accepted by the {@code mode} parameter of BlendEquationEXT. */
	public static final int
		GL_FUNC_ADD_EXT = 0x8006,
		GL_MIN_EXT      = 0x8007,
		GL_MAX_EXT      = 0x8008;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_BLEND_EQUATION_EXT = 0x8009;

	protected EXTBlendMinmax() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glBlendEquationEXT
		);
	}

	// --- [ glBlendEquationEXT ] ---

	public static void glBlendEquationEXT(int mode) {
		long __functionAddress = GL.getCapabilities().glBlendEquationEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, mode);
	}

}