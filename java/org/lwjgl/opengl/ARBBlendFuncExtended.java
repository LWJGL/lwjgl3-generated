/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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
public class ARBBlendFuncExtended {

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

	protected ARBBlendFuncExtended() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glBindFragDataLocationIndexed, caps.glGetFragDataIndex
		);
	}

	// --- [ glBindFragDataLocationIndexed ] ---

	/**
	 * Binds a user-defined varying out variable to a fragment shader color number and index.
	 *
	 * @param program     the name of the program containing varying out variable whose binding to modify
	 * @param colorNumber the color number to bind the user-defined varying out variable to
	 * @param index       the index of the color input to bind the user-defined varying out variable to
	 * @param name        the name of the user-defined varying out variable whose binding to modify
	 */
	public static void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name) {
		long __functionAddress = GL.getCapabilities().glBindFragDataLocationIndexed;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, colorNumber, index, name);
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
		if ( CHECKS )
			checkNT1(name);
		nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(name));
	}

	/**
	 * Binds a user-defined varying out variable to a fragment shader color number and index.
	 *
	 * @param program     the name of the program containing varying out variable whose binding to modify
	 * @param colorNumber the color number to bind the user-defined varying out variable to
	 * @param index       the index of the color input to bind the user-defined varying out variable to
	 * @param name        the name of the user-defined varying out variable whose binding to modify
	 */
	public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetFragDataIndex ] ---

	/**
	 * Queries the bindings of color indices to user-defined varying out variables.
	 *
	 * @param program the name of the program containing varying out variable whose binding to query
	 * @param name    the name of the user-defined varying out variable whose index to query
	 */
	public static int nglGetFragDataIndex(int program, long name) {
		long __functionAddress = GL.getCapabilities().glGetFragDataIndex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, name);
	}

	/**
	 * Queries the bindings of color indices to user-defined varying out variables.
	 *
	 * @param program the name of the program containing varying out variable whose binding to query
	 * @param name    the name of the user-defined varying out variable whose index to query
	 */
	public static int glGetFragDataIndex(int program, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetFragDataIndex(program, memAddress(name));
	}

	/**
	 * Queries the bindings of color indices to user-defined varying out variables.
	 *
	 * @param program the name of the program containing varying out variable whose binding to query
	 * @param name    the name of the user-defined varying out variable whose index to query
	 */
	public static int glGetFragDataIndex(int program, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetFragDataIndex(program, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

}