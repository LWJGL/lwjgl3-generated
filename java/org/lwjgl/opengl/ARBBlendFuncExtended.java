/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/blend_func_extended.txt">ARB_blend_func_extended</a> extension.
 * 
 * <p>Traditional OpenGL includes fixed-function blending that combines source colors with the existing content of a render buffer in a variety of ways. A
 * number of extensions have enhanced this functionality by adding further sources of blending weights and methods to combine them. However, the inputs to
 * the fixed-function blending units are constrained to a source color (as output from fragment shading), destination color (as the current content of the
 * frame buffer) or constants that may be used in their place.</p>
 * 
 * <p>This extension adds new blending functions whereby a fragment shader may output two colors, one of which is treated as the source color, and the other
 * used as a blending factor for either source or destination colors. Furthermore, this extension increases orthogonality by allowing the
 * {@link GL11#GL_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE} function to be used as the destination weight.</p>
 * 
 * <p>Requires {@link ARBFragmentShader ARB_fragment_shader} and <a href="http://www.opengl.org/registry/specs/EXT/gpu_shader4.txt">EXT_gpu_shader4</a>. Promoted to core in {@link GL33 OpenGL 3.3}.</p>
 */
public final class ARBBlendFuncExtended {

	/**
	 * Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunci, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and
	 * {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparatei.
	 */
	public static final int
		GL_SRC1_COLOR           = 0x88F9,
		GL_ONE_MINUS_SRC1_COLOR = 0x88FA,
		GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev. */
	public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;

	/** Function address. */
	@JavadocExclude
	public final long
		BindFragDataLocationIndexed,
		GetFragDataIndex;

	@JavadocExclude
	public ARBBlendFuncExtended(FunctionProvider provider) {
		BindFragDataLocationIndexed = provider.getFunctionAddress("glBindFragDataLocationIndexed");
		GetFragDataIndex = provider.getFunctionAddress("glGetFragDataIndex");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBBlendFuncExtended} instance for the current context. */
	public static ARBBlendFuncExtended getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBBlendFuncExtended);
	}

	static ARBBlendFuncExtended create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_blend_func_extended") ) return null;

		ARBBlendFuncExtended funcs = new ARBBlendFuncExtended(provider);

		boolean supported = checkFunctions(
			funcs.BindFragDataLocationIndexed, funcs.GetFragDataIndex
		);

		return GL.checkExtension("GL_ARB_blend_func_extended", funcs, supported);
	}

	// --- [ glBindFragDataLocationIndexed ] ---

	/** Unsafe version of {@link #glBindFragDataLocationIndexed BindFragDataLocationIndexed} */
	@JavadocExclude
	public static void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name) {
		long __functionAddress = getInstance().BindFragDataLocationIndexed;
		GL33.nglBindFragDataLocationIndexed(program, colorNumber, index, name, __functionAddress);
	}

	/**
	 * Binds a user-defined varying out variable to a fragment shader color number and index.
	 *
	 * @param program     the name of the program containing varying out variable whose binding to modify
	 * @param colorNumber the color number to bind the user-defined varying out variable to
	 * @param index       the index of the color input to bind the user-defined varying out variable to
	 * @param name        the name of the user-defined varying out variable whose binding to modify
	 */
	public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(name));
	}

	/** CharSequence version of: {@link #glBindFragDataLocationIndexed BindFragDataLocationIndexed} */
	public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		nglBindFragDataLocationIndexed(program, colorNumber, index, __buffer.address(nameEncoded));
	}

	// --- [ glGetFragDataIndex ] ---

	/** Unsafe version of {@link #glGetFragDataIndex GetFragDataIndex} */
	@JavadocExclude
	public static int nglGetFragDataIndex(int program, long name) {
		long __functionAddress = getInstance().GetFragDataIndex;
		return GL33.nglGetFragDataIndex(program, name, __functionAddress);
	}

	/**
	 * Queries the bindings of color indices to user-defined varying out variables.
	 *
	 * @param program the name of the program containing varying out variable whose binding to query
	 * @param name    the name of the user-defined varying out variable whose index to query
	 */
	public static int glGetFragDataIndex(int program, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetFragDataIndex(program, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetFragDataIndex GetFragDataIndex} */
	public static int glGetFragDataIndex(int program, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetFragDataIndex(program, __buffer.address(nameEncoded));
	}

}