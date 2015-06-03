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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/blend_color.txt">EXT_blend_color</a> extension.
 * 
 * <p>Blending capability is extended by defining a constant color that can be included in blending equations. A typical usage is blending two RGB images.
 * Without the constant blend factor, one image must have an alpha channel with each pixel set to the desired blend factor.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public final class EXTBlendColor {

	/** Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc. */
	public static final int
		GL_CONSTANT_COLOR_EXT           = 0x8001,
		GL_ONE_MINUS_CONSTANT_COLOR_EXT = 0x8002,
		GL_CONSTANT_ALPHA_EXT           = 0x8003,
		GL_ONE_MINUS_CONSTANT_ALPHA_EXT = 0x8004;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_BLEND_COLOR_EXT = 0x8005;

	/** Function address. */
	@JavadocExclude
	public final long BlendColorEXT;

	@JavadocExclude
	public EXTBlendColor(FunctionProvider provider) {
		BlendColorEXT = provider.getFunctionAddress("glBlendColorEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTBlendColor} instance for the current context. */
	public static EXTBlendColor getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTBlendColor);
	}

	static EXTBlendColor create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_blend_color") ) return null;

		EXTBlendColor funcs = new EXTBlendColor(provider);

		boolean supported = checkFunctions(
			funcs.BlendColorEXT
		);

		return GL.checkExtension("GL_EXT_blend_color", funcs, supported);
	}

	// --- [ glBlendColorEXT ] ---

	/** JNI method for {@link #glBlendColorEXT BlendColorEXT} */
	@JavadocExclude
	public static native void nglBlendColorEXT(float red, float green, float blue, float alpha, long __functionAddress);

	/**
	 * 
	 *
	 * @param red   
	 * @param green 
	 * @param blue  
	 * @param alpha 
	 */
	public static void glBlendColorEXT(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().BlendColorEXT;
		nglBlendColorEXT(red, green, blue, alpha, __functionAddress);
	}

}