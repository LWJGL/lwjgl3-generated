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
public final class EXTBlendMinmax {

	/** Accepted by the {@code mode} parameter of BlendEquationEXT. */
	public static final int
		GL_FUNC_ADD_EXT = 0x8006,
		GL_MIN_EXT      = 0x8007,
		GL_MAX_EXT      = 0x8008;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_BLEND_EQUATION_EXT = 0x8009;

	/** Function address. */
	@JavadocExclude
	public final long BlendEquationEXT;

	@JavadocExclude
	public EXTBlendMinmax(FunctionProvider provider) {
		BlendEquationEXT = provider.getFunctionAddress("glBlendEquationEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTBlendMinmax} instance for the current context. */
	public static EXTBlendMinmax getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTBlendMinmax);
	}

	static EXTBlendMinmax create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_blend_minmax") ) return null;

		EXTBlendMinmax funcs = new EXTBlendMinmax(provider);

		boolean supported = checkFunctions(
			funcs.BlendEquationEXT
		);

		return GL.checkExtension("GL_EXT_blend_minmax", funcs, supported);
	}

	// --- [ glBlendEquationEXT ] ---

	/** JNI method for {@link #glBlendEquationEXT BlendEquationEXT} */
	@JavadocExclude
	public static native void nglBlendEquationEXT(int mode, long __functionAddress);

	/**
	 * 
	 *
	 * @param mode 
	 */
	public static void glBlendEquationEXT(int mode) {
		long __functionAddress = getInstance().BlendEquationEXT;
		nglBlendEquationEXT(mode, __functionAddress);
	}

}