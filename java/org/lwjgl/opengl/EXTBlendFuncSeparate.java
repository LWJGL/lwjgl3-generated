/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/blend_func_separate.txt">EXT_blend_func_separate</a> extension.
 * 
 * <p>Blending capability is extended by defining a function that allows independent setting of the RGB and alpha blend factors for blend operations that
 * require source and destination blend factors. It is not always desired that the blending used for RGB is also applied to alpha.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public class EXTBlendFuncSeparate {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_BLEND_DST_RGB_EXT   = 0x80C8,
		GL_BLEND_SRC_RGB_EXT   = 0x80C9,
		GL_BLEND_DST_ALPHA_EXT = 0x80CA,
		GL_BLEND_SRC_ALPHA_EXT = 0x80CB;

	/** Function address. */
	@JavadocExclude
	public final long BlendFuncSeparateEXT;

	@JavadocExclude
	protected EXTBlendFuncSeparate() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public EXTBlendFuncSeparate(FunctionProvider provider) {
		BlendFuncSeparateEXT = provider.getFunctionAddress("glBlendFuncSeparateEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTBlendFuncSeparate} instance of the current context. */
	public static EXTBlendFuncSeparate getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link EXTBlendFuncSeparate} instance of the specified {@link GLCapabilities}. */
	public static EXTBlendFuncSeparate getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__EXTBlendFuncSeparate);
	}

	static EXTBlendFuncSeparate create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_blend_func_separate") ) return null;

		EXTBlendFuncSeparate funcs = new EXTBlendFuncSeparate(provider);

		boolean supported = checkFunctions(
			funcs.BlendFuncSeparateEXT
		);

		return GL.checkExtension("GL_EXT_blend_func_separate", funcs, supported);
	}

	// --- [ glBlendFuncSeparateEXT ] ---

	public static void glBlendFuncSeparateEXT(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		long __functionAddress = getInstance().BlendFuncSeparateEXT;
		callIIIIV(__functionAddress, sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
	}

}