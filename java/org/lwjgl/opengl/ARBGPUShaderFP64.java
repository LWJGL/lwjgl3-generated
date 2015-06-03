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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/gpu_shader_fp64.txt">ARB_gpu_shader_fp64</a> extension.
 * 
 * <p>This extension allows GLSL shaders to use double-precision floating-point data types, including vectors and matrices of doubles. Doubles may be used as
 * inputs, outputs, and uniforms.</p>
 * 
 * <p>The shading language supports various arithmetic and comparison operators on double-precision scalar, vector, and matrix types, and provides a set of
 * built-in functions including:
 * <ul>
 * <li>square roots and inverse square roots;</li>
 * <li>fused floating-point multiply-add operations;</li>
 * <li>splitting a floating-point number into a significand and exponent (frexp), or building a floating-point number from a significand and exponent
 * (ldexp);</li>
 * <li>absolute value, sign tests, various functions to round to an integer value, modulus, minimum, maximum, clamping, blending two values, step
 * functions, and testing for infinity and NaN values;</li>
 * <li>packing and unpacking doubles into a pair of 32-bit unsigned integers;</li>
 * <li>matrix component-wise multiplication, and computation of outer products, transposes, determinants, and inverses; and</li>
 * <li>vector relational functions.</li>
 * </ul></p>
 * 
 * <p>Double-precision versions of angle, trigonometry, and exponential functions are not supported.</p>
 * 
 * <p>Implicit conversions are supported from integer and single-precision floating-point values to doubles, and this extension uses the relaxed function
 * overloading rules specified by the ARB_gpu_shader5 extension to resolve ambiguities.</p>
 * 
 * <p>This extension provides API functions for specifying double-precision uniforms in the default uniform block, including functions similar to the uniform
 * functions added by <a href="http://www.opengl.org/registry/specs/EXT/direct_state_access.txt">EXT_direct_state_access</a> (if supported).</p>
 * 
 * <p>This extension provides an "LF" suffix for specifying double-precision constants. Floating-point constants without a suffix in GLSL are treated as
 * single-precision values for backward compatibility with versions not supporting doubles; similar constants are treated as double-precision values in the
 * "C" programming language.</p>
 * 
 * <p>This extension does not support interpolation of double-precision values; doubles used as fragment shader inputs must be qualified as "flat".
 * Additionally, this extension does not allow vertex attributes with 64-bit components. That support is added separately by
 * <a href="http://www.opengl.org/registry/specs/EXT/vertex_attrib_64bit.txt">EXT_vertex_attrib_64bit</a>.</p>
 * 
 * <p>Requires {@link GL32 GL32} and GLSL 1.50. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public final class ARBGPUShaderFP64 {

	/** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying. */
	public static final int
		GL_DOUBLE_VEC2   = 0x8FFC,
		GL_DOUBLE_VEC3   = 0x8FFD,
		GL_DOUBLE_VEC4   = 0x8FFE,
		GL_DOUBLE_MAT2   = 0x8F46,
		GL_DOUBLE_MAT3   = 0x8F47,
		GL_DOUBLE_MAT4   = 0x8F48,
		GL_DOUBLE_MAT2x3 = 0x8F49,
		GL_DOUBLE_MAT2x4 = 0x8F4A,
		GL_DOUBLE_MAT3x2 = 0x8F4B,
		GL_DOUBLE_MAT3x4 = 0x8F4C,
		GL_DOUBLE_MAT4x2 = 0x8F4D,
		GL_DOUBLE_MAT4x3 = 0x8F4E;

	/** Function address. */
	@JavadocExclude
	public final long
		Uniform1d,
		Uniform2d,
		Uniform3d,
		Uniform4d,
		Uniform1dv,
		Uniform2dv,
		Uniform3dv,
		Uniform4dv,
		UniformMatrix2dv,
		UniformMatrix3dv,
		UniformMatrix4dv,
		UniformMatrix2x3dv,
		UniformMatrix2x4dv,
		UniformMatrix3x2dv,
		UniformMatrix3x4dv,
		UniformMatrix4x2dv,
		UniformMatrix4x3dv,
		GetUniformdv,
		ProgramUniform1dEXT,
		ProgramUniform2dEXT,
		ProgramUniform3dEXT,
		ProgramUniform4dEXT,
		ProgramUniform1dvEXT,
		ProgramUniform2dvEXT,
		ProgramUniform3dvEXT,
		ProgramUniform4dvEXT,
		ProgramUniformMatrix2dvEXT,
		ProgramUniformMatrix3dvEXT,
		ProgramUniformMatrix4dvEXT,
		ProgramUniformMatrix2x3dvEXT,
		ProgramUniformMatrix2x4dvEXT,
		ProgramUniformMatrix3x2dvEXT,
		ProgramUniformMatrix3x4dvEXT,
		ProgramUniformMatrix4x2dvEXT,
		ProgramUniformMatrix4x3dvEXT;

	@JavadocExclude
	public ARBGPUShaderFP64(FunctionProvider provider) {
		Uniform1d = provider.getFunctionAddress("glUniform1d");
		Uniform2d = provider.getFunctionAddress("glUniform2d");
		Uniform3d = provider.getFunctionAddress("glUniform3d");
		Uniform4d = provider.getFunctionAddress("glUniform4d");
		Uniform1dv = provider.getFunctionAddress("glUniform1dv");
		Uniform2dv = provider.getFunctionAddress("glUniform2dv");
		Uniform3dv = provider.getFunctionAddress("glUniform3dv");
		Uniform4dv = provider.getFunctionAddress("glUniform4dv");
		UniformMatrix2dv = provider.getFunctionAddress("glUniformMatrix2dv");
		UniformMatrix3dv = provider.getFunctionAddress("glUniformMatrix3dv");
		UniformMatrix4dv = provider.getFunctionAddress("glUniformMatrix4dv");
		UniformMatrix2x3dv = provider.getFunctionAddress("glUniformMatrix2x3dv");
		UniformMatrix2x4dv = provider.getFunctionAddress("glUniformMatrix2x4dv");
		UniformMatrix3x2dv = provider.getFunctionAddress("glUniformMatrix3x2dv");
		UniformMatrix3x4dv = provider.getFunctionAddress("glUniformMatrix3x4dv");
		UniformMatrix4x2dv = provider.getFunctionAddress("glUniformMatrix4x2dv");
		UniformMatrix4x3dv = provider.getFunctionAddress("glUniformMatrix4x3dv");
		GetUniformdv = provider.getFunctionAddress("glGetUniformdv");
		ProgramUniform1dEXT = provider.getFunctionAddress("glProgramUniform1dEXT");
		ProgramUniform2dEXT = provider.getFunctionAddress("glProgramUniform2dEXT");
		ProgramUniform3dEXT = provider.getFunctionAddress("glProgramUniform3dEXT");
		ProgramUniform4dEXT = provider.getFunctionAddress("glProgramUniform4dEXT");
		ProgramUniform1dvEXT = provider.getFunctionAddress("glProgramUniform1dvEXT");
		ProgramUniform2dvEXT = provider.getFunctionAddress("glProgramUniform2dvEXT");
		ProgramUniform3dvEXT = provider.getFunctionAddress("glProgramUniform3dvEXT");
		ProgramUniform4dvEXT = provider.getFunctionAddress("glProgramUniform4dvEXT");
		ProgramUniformMatrix2dvEXT = provider.getFunctionAddress("glProgramUniformMatrix2dvEXT");
		ProgramUniformMatrix3dvEXT = provider.getFunctionAddress("glProgramUniformMatrix3dvEXT");
		ProgramUniformMatrix4dvEXT = provider.getFunctionAddress("glProgramUniformMatrix4dvEXT");
		ProgramUniformMatrix2x3dvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x3dvEXT");
		ProgramUniformMatrix2x4dvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x4dvEXT");
		ProgramUniformMatrix3x2dvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x2dvEXT");
		ProgramUniformMatrix3x4dvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x4dvEXT");
		ProgramUniformMatrix4x2dvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x2dvEXT");
		ProgramUniformMatrix4x3dvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x3dvEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBGPUShaderFP64} instance for the current context. */
	public static ARBGPUShaderFP64 getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBGPUShaderFP64);
	}

	static ARBGPUShaderFP64 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_gpu_shader_fp64") ) return null;

		ARBGPUShaderFP64 funcs = new ARBGPUShaderFP64(provider);

		boolean supported = checkFunctions(
			funcs.Uniform1d, funcs.Uniform2d, funcs.Uniform3d, funcs.Uniform4d, funcs.Uniform1dv, funcs.Uniform2dv, funcs.Uniform3dv, funcs.Uniform4dv, 
			funcs.UniformMatrix2dv, funcs.UniformMatrix3dv, funcs.UniformMatrix4dv, funcs.UniformMatrix2x3dv, funcs.UniformMatrix2x4dv, 
			funcs.UniformMatrix3x2dv, funcs.UniformMatrix3x4dv, funcs.UniformMatrix4x2dv, funcs.UniformMatrix4x3dv, funcs.GetUniformdv, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniform1dEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniform2dEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniform3dEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniform4dEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniform1dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniform2dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniform3dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniform4dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniformMatrix2dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniformMatrix3dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniformMatrix4dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniformMatrix2x3dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniformMatrix2x4dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniformMatrix3x2dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniformMatrix3x4dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniformMatrix4x2dvEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ProgramUniformMatrix4x3dvEXT : -1L
		);

		return GL.checkExtension("GL_ARB_gpu_shader_fp64", funcs, supported);
	}

	// --- [ glUniform1d ] ---

	/**
	 * Specifies the value of a double uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glUniform1d(int location, double x) {
		long __functionAddress = getInstance().Uniform1d;
		GL40.nglUniform1d(location, x, __functionAddress);
	}

	// --- [ glUniform2d ] ---

	/**
	 * Specifies the value of a dvec2 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glUniform2d(int location, double x, double y) {
		long __functionAddress = getInstance().Uniform2d;
		GL40.nglUniform2d(location, x, y, __functionAddress);
	}

	// --- [ glUniform3d ] ---

	/**
	 * Specifies the value of a dvec3 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glUniform3d(int location, double x, double y, double z) {
		long __functionAddress = getInstance().Uniform3d;
		GL40.nglUniform3d(location, x, y, z, __functionAddress);
	}

	// --- [ glUniform4d ] ---

	/**
	 * Specifies the value of a dvec4 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glUniform4d(int location, double x, double y, double z, double w) {
		long __functionAddress = getInstance().Uniform4d;
		GL40.nglUniform4d(location, x, y, z, w, __functionAddress);
	}

	// --- [ glUniform1dv ] ---

	/** Unsafe version of {@link #glUniform1dv Uniform1dv} */
	@JavadocExclude
	public static void nglUniform1dv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1dv;
		GL40.nglUniform1dv(location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single double uniform variable or a double uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform1dv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglUniform1dv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1dv Uniform1dv} */
	public static void glUniform1dv(int location, DoubleBuffer value) {
		nglUniform1dv(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2dv ] ---

	/** Unsafe version of {@link #glUniform2dv Uniform2dv} */
	@JavadocExclude
	public static void nglUniform2dv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2dv;
		GL40.nglUniform2dv(location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform2dv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglUniform2dv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2dv Uniform2dv} */
	public static void glUniform2dv(int location, DoubleBuffer value) {
		nglUniform2dv(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3dv ] ---

	/** Unsafe version of {@link #glUniform3dv Uniform3dv} */
	@JavadocExclude
	public static void nglUniform3dv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3dv;
		GL40.nglUniform3dv(location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform3dv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 3);
		nglUniform3dv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3dv Uniform3dv} */
	public static void glUniform3dv(int location, DoubleBuffer value) {
		nglUniform3dv(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4dv ] ---

	/** Unsafe version of {@link #glUniform4dv Uniform4dv} */
	@JavadocExclude
	public static void nglUniform4dv(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4dv;
		GL40.nglUniform4dv(location, count, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glUniform4dv(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglUniform4dv(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4dv Uniform4dv} */
	public static void glUniform4dv(int location, DoubleBuffer value) {
		nglUniform4dv(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniformMatrix2dv ] ---

	/** Unsafe version of {@link #glUniformMatrix2dv UniformMatrix2dv} */
	@JavadocExclude
	public static void nglUniformMatrix2dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2dv;
		GL40.nglUniformMatrix2dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix2dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglUniformMatrix2dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2dv UniformMatrix2dv} */
	public static void glUniformMatrix2dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix2dv(location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3dv ] ---

	/** Unsafe version of {@link #glUniformMatrix3dv UniformMatrix3dv} */
	@JavadocExclude
	public static void nglUniformMatrix3dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3dv;
		GL40.nglUniformMatrix3dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix3dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 3);
		nglUniformMatrix3dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3dv UniformMatrix3dv} */
	public static void glUniformMatrix3dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix3dv(location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4dv ] ---

	/** Unsafe version of {@link #glUniformMatrix4dv UniformMatrix4dv} */
	@JavadocExclude
	public static void nglUniformMatrix4dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4dv;
		GL40.nglUniformMatrix4dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix4dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 4) << 3);
		nglUniformMatrix4dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4dv UniformMatrix4dv} */
	public static void glUniformMatrix4dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix4dv(location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix2x3dv ] ---

	/** Unsafe version of {@link #glUniformMatrix2x3dv UniformMatrix2x3dv} */
	@JavadocExclude
	public static void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2x3dv;
		GL40.nglUniformMatrix2x3dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix2x3dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 3);
		nglUniformMatrix2x3dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2x3dv UniformMatrix2x3dv} */
	public static void glUniformMatrix2x3dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix2x3dv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix2x4dv ] ---

	/** Unsafe version of {@link #glUniformMatrix2x4dv UniformMatrix2x4dv} */
	@JavadocExclude
	public static void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2x4dv;
		GL40.nglUniformMatrix2x4dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix2x4dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 3);
		nglUniformMatrix2x4dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2x4dv UniformMatrix2x4dv} */
	public static void glUniformMatrix2x4dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix2x4dv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x2dv ] ---

	/** Unsafe version of {@link #glUniformMatrix3x2dv UniformMatrix3x2dv} */
	@JavadocExclude
	public static void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3x2dv;
		GL40.nglUniformMatrix3x2dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix3x2dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 3);
		nglUniformMatrix3x2dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3x2dv UniformMatrix3x2dv} */
	public static void glUniformMatrix3x2dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix3x2dv(location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3x4dv ] ---

	/** Unsafe version of {@link #glUniformMatrix3x4dv UniformMatrix3x4dv} */
	@JavadocExclude
	public static void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3x4dv;
		GL40.nglUniformMatrix3x4dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix3x4dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 3);
		nglUniformMatrix3x4dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3x4dv UniformMatrix3x4dv} */
	public static void glUniformMatrix3x4dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix3x4dv(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x2dv ] ---

	/** Unsafe version of {@link #glUniformMatrix4x2dv UniformMatrix4x2dv} */
	@JavadocExclude
	public static void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4x2dv;
		GL40.nglUniformMatrix4x2dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix4x2dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 3);
		nglUniformMatrix4x2dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4x2dv UniformMatrix4x2dv} */
	public static void glUniformMatrix4x2dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix4x2dv(location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4x3dv ] ---

	/** Unsafe version of {@link #glUniformMatrix4x3dv UniformMatrix4x3dv} */
	@JavadocExclude
	public static void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4x3dv;
		GL40.nglUniformMatrix4x3dv(location, count, transpose, value, __functionAddress);
	}

	/**
	 * Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.
	 *
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glUniformMatrix4x3dv(int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 3);
		nglUniformMatrix4x3dv(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4x3dv UniformMatrix4x3dv} */
	public static void glUniformMatrix4x3dv(int location, boolean transpose, DoubleBuffer value) {
		nglUniformMatrix4x3dv(location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glGetUniformdv ] ---

	/** Unsafe version of {@link #glGetUniformdv GetUniformdv} */
	@JavadocExclude
	public static void nglGetUniformdv(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformdv;
		GL40.nglGetUniformdv(program, location, params, __functionAddress);
	}

	/**
	 * Returns the double value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformdv(int program, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetUniformdv(program, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformdv GetUniformdv} */
	public static void glGetUniformdv(int program, int location, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformdv(program, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformdv GetUniformdv} */
	public static double glGetUniformd(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.doubleParam();
		nglGetUniformdv(program, location, __buffer.address(params));
		return __buffer.doubleValue(params);
	}

	// --- [ glProgramUniform1dEXT ] ---

	/** JNI method for {@link #glProgramUniform1dEXT ProgramUniform1dEXT} */
	@JavadocExclude
	public static native void nglProgramUniform1dEXT(int program, int location, double x, long __functionAddress);

	/**
	 * DSA version of {@link #glUniform1d Uniform1d}.
	 *
	 * @param program  the program object to update
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1dEXT(int program, int location, double x) {
		long __functionAddress = getInstance().ProgramUniform1dEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1dEXT(program, location, x, __functionAddress);
	}

	// --- [ glProgramUniform2dEXT ] ---

	/** JNI method for {@link #glProgramUniform2dEXT ProgramUniform2dEXT} */
	@JavadocExclude
	public static native void nglProgramUniform2dEXT(int program, int location, double x, double y, long __functionAddress);

	/**
	 * DSA version of {@link #glUniform2d Uniform2d}.
	 *
	 * @param program  the program object to update
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2dEXT(int program, int location, double x, double y) {
		long __functionAddress = getInstance().ProgramUniform2dEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2dEXT(program, location, x, y, __functionAddress);
	}

	// --- [ glProgramUniform3dEXT ] ---

	/** JNI method for {@link #glProgramUniform3dEXT ProgramUniform3dEXT} */
	@JavadocExclude
	public static native void nglProgramUniform3dEXT(int program, int location, double x, double y, double z, long __functionAddress);

	/**
	 * DSA version of {@link #glUniform3d Uniform3d}.
	 *
	 * @param program  the program object to update
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glProgramUniform3dEXT(int program, int location, double x, double y, double z) {
		long __functionAddress = getInstance().ProgramUniform3dEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3dEXT(program, location, x, y, z, __functionAddress);
	}

	// --- [ glProgramUniform4dEXT ] ---

	/** JNI method for {@link #glProgramUniform4dEXT ProgramUniform4dEXT} */
	@JavadocExclude
	public static native void nglProgramUniform4dEXT(int program, int location, double x, double y, double z, double w, long __functionAddress);

	/**
	 * DSA version of {@link #glUniform4d Uniform4d}.
	 *
	 * @param program  the program object to update
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glProgramUniform4dEXT(int program, int location, double x, double y, double z, double w) {
		long __functionAddress = getInstance().ProgramUniform4dEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4dEXT(program, location, x, y, z, w, __functionAddress);
	}

	// --- [ glProgramUniform1dvEXT ] ---

	/** JNI method for {@link #glProgramUniform1dvEXT ProgramUniform1dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniform1dvEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform1dvEXT ProgramUniform1dvEXT} */
	@JavadocExclude
	public static void nglProgramUniform1dvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform1dvEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniform1dv Uniform1dv}.
	 *
	 * @param program  the program object to update
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform1dvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglProgramUniform1dvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1dvEXT ProgramUniform1dvEXT} */
	public static void glProgramUniform1dvEXT(int program, int location, DoubleBuffer value) {
		nglProgramUniform1dvEXT(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2dvEXT ] ---

	/** JNI method for {@link #glProgramUniform2dvEXT ProgramUniform2dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniform2dvEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform2dvEXT ProgramUniform2dvEXT} */
	@JavadocExclude
	public static void nglProgramUniform2dvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform2dvEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniform2dv Uniform2dv}.
	 *
	 * @param program  the program object to update
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform2dvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglProgramUniform2dvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2dvEXT ProgramUniform2dvEXT} */
	public static void glProgramUniform2dvEXT(int program, int location, DoubleBuffer value) {
		nglProgramUniform2dvEXT(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3dvEXT ] ---

	/** JNI method for {@link #glProgramUniform3dvEXT ProgramUniform3dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniform3dvEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform3dvEXT ProgramUniform3dvEXT} */
	@JavadocExclude
	public static void nglProgramUniform3dvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform3dvEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniform3dv Uniform3dv}.
	 *
	 * @param program  the program object to update
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform3dvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 3);
		nglProgramUniform3dvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3dvEXT ProgramUniform3dvEXT} */
	public static void glProgramUniform3dvEXT(int program, int location, DoubleBuffer value) {
		nglProgramUniform3dvEXT(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4dvEXT ] ---

	/** JNI method for {@link #glProgramUniform4dvEXT ProgramUniform4dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniform4dvEXT(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform4dvEXT ProgramUniform4dvEXT} */
	@JavadocExclude
	public static void nglProgramUniform4dvEXT(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniform4dvEXT(program, location, count, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniform4dv Uniform4dv}.
	 *
	 * @param program  the program object to update
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
	 */
	public static void glProgramUniform4dvEXT(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglProgramUniform4dvEXT(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4dvEXT ProgramUniform4dvEXT} */
	public static void glProgramUniform4dvEXT(int program, int location, DoubleBuffer value) {
		nglProgramUniform4dvEXT(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2dvEXT ] ---

	/** JNI method for {@link #glProgramUniformMatrix2dvEXT ProgramUniformMatrix2dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix2dvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix2dvEXT ProgramUniformMatrix2dvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2dvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2dvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniformMatrix2dv UniformMatrix2dv}.
	 *
	 * @param program   the program object to update
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2dvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglProgramUniformMatrix2dvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2dvEXT ProgramUniformMatrix2dvEXT} */
	public static void glProgramUniformMatrix2dvEXT(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix2dvEXT(program, location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3dvEXT ] ---

	/** JNI method for {@link #glProgramUniformMatrix3dvEXT ProgramUniformMatrix3dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix3dvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix3dvEXT ProgramUniformMatrix3dvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3dvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3dvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniformMatrix3dv UniformMatrix3dv}.
	 *
	 * @param program   the program object to update
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3dvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 9) << 3);
		nglProgramUniformMatrix3dvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3dvEXT ProgramUniformMatrix3dvEXT} */
	public static void glProgramUniformMatrix3dvEXT(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix3dvEXT(program, location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4dvEXT ] ---

	/** JNI method for {@link #glProgramUniformMatrix4dvEXT ProgramUniformMatrix4dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix4dvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix4dvEXT ProgramUniformMatrix4dvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4dvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4dvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniformMatrix4dv UniformMatrix4dv}.
	 *
	 * @param program   the program object to update
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4dvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 4) << 3);
		nglProgramUniformMatrix4dvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4dvEXT ProgramUniformMatrix4dvEXT} */
	public static void glProgramUniformMatrix4dvEXT(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix4dvEXT(program, location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x3dvEXT ] ---

	/** JNI method for {@link #glProgramUniformMatrix2x3dvEXT ProgramUniformMatrix2x3dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix2x3dvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix2x3dvEXT ProgramUniformMatrix2x3dvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x3dvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x3dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2x3dvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniformMatrix2x3dv UniformMatrix2x3dv}.
	 *
	 * @param program   the program object to update
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x3dvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 3);
		nglProgramUniformMatrix2x3dvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x3dvEXT ProgramUniformMatrix2x3dvEXT} */
	public static void glProgramUniformMatrix2x3dvEXT(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix2x3dvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x4dvEXT ] ---

	/** JNI method for {@link #glProgramUniformMatrix2x4dvEXT ProgramUniformMatrix2x4dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix2x4dvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix2x4dvEXT ProgramUniformMatrix2x4dvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x4dvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x4dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix2x4dvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniformMatrix2x4dv UniformMatrix2x4dv}.
	 *
	 * @param program   the program object to update
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix2x4dvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 3);
		nglProgramUniformMatrix2x4dvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x4dvEXT ProgramUniformMatrix2x4dvEXT} */
	public static void glProgramUniformMatrix2x4dvEXT(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix2x4dvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x2dvEXT ] ---

	/** JNI method for {@link #glProgramUniformMatrix3x2dvEXT ProgramUniformMatrix3x2dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix3x2dvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix3x2dvEXT ProgramUniformMatrix3x2dvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x2dvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x2dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3x2dvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniformMatrix3x2dv UniformMatrix3x2dv}.
	 *
	 * @param program   the program object to update
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x2dvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 3);
		nglProgramUniformMatrix3x2dvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x2dvEXT ProgramUniformMatrix3x2dvEXT} */
	public static void glProgramUniformMatrix3x2dvEXT(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix3x2dvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x4dvEXT ] ---

	/** JNI method for {@link #glProgramUniformMatrix3x4dvEXT ProgramUniformMatrix3x4dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix3x4dvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix3x4dvEXT ProgramUniformMatrix3x4dvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x4dvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x4dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix3x4dvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniformMatrix3x4dv UniformMatrix3x4dv}.
	 *
	 * @param program   the program object to update
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix3x4dvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 3);
		nglProgramUniformMatrix3x4dvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x4dvEXT ProgramUniformMatrix3x4dvEXT} */
	public static void glProgramUniformMatrix3x4dvEXT(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix3x4dvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x2dvEXT ] ---

	/** JNI method for {@link #glProgramUniformMatrix4x2dvEXT ProgramUniformMatrix4x2dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix4x2dvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix4x2dvEXT ProgramUniformMatrix4x2dvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x2dvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x2dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4x2dvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniformMatrix4x2dv UniformMatrix4x2dv}.
	 *
	 * @param program   the program object to update
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x2dvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 3);
		nglProgramUniformMatrix4x2dvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x2dvEXT ProgramUniformMatrix4x2dvEXT} */
	public static void glProgramUniformMatrix4x2dvEXT(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix4x2dvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x3dvEXT ] ---

	/** JNI method for {@link #glProgramUniformMatrix4x3dvEXT ProgramUniformMatrix4x3dvEXT} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix4x3dvEXT(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix4x3dvEXT ProgramUniformMatrix4x3dvEXT} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x3dvEXT(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x3dvEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramUniformMatrix4x3dvEXT(program, location, count, transpose, value, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniformMatrix4x3dv UniformMatrix4x3dv}.
	 *
	 * @param program   the program object to update
	 * @param location  the location of the uniform variable to be modified
	 * @param count     the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
	 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
	 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
	 */
	public static void glProgramUniformMatrix4x3dvEXT(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 3);
		nglProgramUniformMatrix4x3dvEXT(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x3dvEXT ProgramUniformMatrix4x3dvEXT} */
	public static void glProgramUniformMatrix4x3dvEXT(int program, int location, boolean transpose, DoubleBuffer value) {
		nglProgramUniformMatrix4x3dvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

}