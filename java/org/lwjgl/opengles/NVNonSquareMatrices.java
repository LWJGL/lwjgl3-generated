/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_non_square_matrices.txt">NV_non_square_matrices</a> extension.
 * 
 * <p>This extension adds support for non-square matrix variables in GLSL shaders.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class NVNonSquareMatrices {

	/** Returned by GetActiveAttrib and GetActiveUniform. */
	public static final int
		GL_FLOAT_MAT2x3_NV = 0x8B65,
		GL_FLOAT_MAT2x4_NV = 0x8B66,
		GL_FLOAT_MAT3x2_NV = 0x8B67,
		GL_FLOAT_MAT3x4_NV = 0x8B68,
		GL_FLOAT_MAT4x2_NV = 0x8B69,
		GL_FLOAT_MAT4x3_NV = 0x8B6A;

	/** Function address. */
	@JavadocExclude
	public final long
		UniformMatrix2x3fvNV,
		UniformMatrix3x2fvNV,
		UniformMatrix2x4fvNV,
		UniformMatrix4x2fvNV,
		UniformMatrix3x4fvNV,
		UniformMatrix4x3fvNV;

	@JavadocExclude
	public NVNonSquareMatrices(FunctionProvider provider) {
		UniformMatrix2x3fvNV = provider.getFunctionAddress("glUniformMatrix2x3fvNV");
		UniformMatrix3x2fvNV = provider.getFunctionAddress("glUniformMatrix3x2fvNV");
		UniformMatrix2x4fvNV = provider.getFunctionAddress("glUniformMatrix2x4fvNV");
		UniformMatrix4x2fvNV = provider.getFunctionAddress("glUniformMatrix4x2fvNV");
		UniformMatrix3x4fvNV = provider.getFunctionAddress("glUniformMatrix3x4fvNV");
		UniformMatrix4x3fvNV = provider.getFunctionAddress("glUniformMatrix4x3fvNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVNonSquareMatrices} instance for the current context. */
	public static NVNonSquareMatrices getInstance() {
		return checkFunctionality(GLES.getCapabilities().__NVNonSquareMatrices);
	}

	static NVNonSquareMatrices create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_non_square_matrices") ) return null;

		NVNonSquareMatrices funcs = new NVNonSquareMatrices(provider);
		boolean supported = checkFunctions(
			funcs.UniformMatrix2x3fvNV, funcs.UniformMatrix3x2fvNV, funcs.UniformMatrix2x4fvNV, funcs.UniformMatrix4x2fvNV, funcs.UniformMatrix3x4fvNV, 
			funcs.UniformMatrix4x3fvNV
		);

		return GLES.checkExtension("GL_NV_non_square_matrices", funcs, supported);
	}

	// --- [ glUniformMatrix2x3fvNV ] ---

	/** Unsafe version of {@link #glUniformMatrix2x3fvNV UniformMatrix2x3fvNV} */
	@JavadocExclude
	public static void nglUniformMatrix2x3fvNV(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2x3fvNV;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix2x3fvNV(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglUniformMatrix2x3fvNV(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2x3fvNV UniformMatrix2x3fvNV} */
	public static void glUniformMatrix2x3fvNV(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2x3fvNV(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x2fvNV ] ---

	/** Unsafe version of {@link #glUniformMatrix3x2fvNV UniformMatrix3x2fvNV} */
	@JavadocExclude
	public static void nglUniformMatrix3x2fvNV(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3x2fvNV;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix3x2fvNV(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglUniformMatrix3x2fvNV(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3x2fvNV UniformMatrix3x2fvNV} */
	public static void glUniformMatrix3x2fvNV(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3x2fvNV(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix2x4fvNV ] ---

	/** Unsafe version of {@link #glUniformMatrix2x4fvNV UniformMatrix2x4fvNV} */
	@JavadocExclude
	public static void nglUniformMatrix2x4fvNV(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2x4fvNV;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix2x4fvNV(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglUniformMatrix2x4fvNV(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2x4fvNV UniformMatrix2x4fvNV} */
	public static void glUniformMatrix2x4fvNV(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2x4fvNV(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x2fvNV ] ---

	/** Unsafe version of {@link #glUniformMatrix4x2fvNV UniformMatrix4x2fvNV} */
	@JavadocExclude
	public static void nglUniformMatrix4x2fvNV(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4x2fvNV;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix4x2fvNV(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglUniformMatrix4x2fvNV(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4x2fvNV UniformMatrix4x2fvNV} */
	public static void glUniformMatrix4x2fvNV(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4x2fvNV(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x4fvNV ] ---

	/** Unsafe version of {@link #glUniformMatrix3x4fvNV UniformMatrix3x4fvNV} */
	@JavadocExclude
	public static void nglUniformMatrix3x4fvNV(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3x4fvNV;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix3x4fvNV(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglUniformMatrix3x4fvNV(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3x4fvNV UniformMatrix3x4fvNV} */
	public static void glUniformMatrix3x4fvNV(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3x4fvNV(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x3fvNV ] ---

	/** Unsafe version of {@link #glUniformMatrix4x3fvNV UniformMatrix4x3fvNV} */
	@JavadocExclude
	public static void nglUniformMatrix4x3fvNV(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4x3fvNV;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	public static void glUniformMatrix4x3fvNV(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglUniformMatrix4x3fvNV(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4x3fvNV UniformMatrix4x3fvNV} */
	public static void glUniformMatrix4x3fvNV(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4x3fvNV(location, value.remaining() / 12, transpose, memAddress(value));
	}

}