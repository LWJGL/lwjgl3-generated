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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/gpu_shader_int64.txt">ARB_gpu_shader_int64</a> extension.
 * 
 * <p>The extension introduces the following features for all shader types:
 * <ul>
 * <li>support for 64-bit scalar and vector integer data types, including uniform API, uniform buffer object, transform feedback, and shader input and
 * output support;</li>
 * <li>new built-in functions to pack and unpack 64-bit integer types into a two-component 32-bit integer vector;</li>
 * <li>new built-in functions to convert double-precision floating-point values to or from their 64-bit integer bit encodings;</li>
 * <li>vector relational functions supporting comparisons of vectors of 64-bit integer types; and</li>
 * <li>common functions abs, sign, min, max, clamp, and mix supporting arguments of 64-bit integer types.</li>
 * </ul></p>
 * 
 * <p>Requires {@link GL40 GL40} and GLSL 4.00.</p>
 */
public final class ARBGPUShaderInt64 {

	/** Returned by the {@code type} parameter of GetActiveAttrib, GetActiveUniform, and GetTransformFeedbackVarying. */
	public static final int
		GL_INT64_ARB               = 0x140E,
		GL_UNSIGNED_INT64_ARB      = 0x140F,
		GL_INT64_VEC2_ARB          = 0x8FE9,
		GL_INT64_VEC3_ARB          = 0x8FEA,
		GL_INT64_VEC4_ARB          = 0x8FEB,
		GL_UNSIGNED_INT64_VEC2_ARB = 0x8FF5,
		GL_UNSIGNED_INT64_VEC3_ARB = 0x8FF6,
		GL_UNSIGNED_INT64_VEC4_ARB = 0x8FF7;

	/** Function address. */
	@JavadocExclude
	public final long
		Uniform1i64ARB,
		Uniform1i64vARB,
		ProgramUniform1i64ARB,
		ProgramUniform1i64vARB,
		Uniform2i64ARB,
		Uniform2i64vARB,
		ProgramUniform2i64ARB,
		ProgramUniform2i64vARB,
		Uniform3i64ARB,
		Uniform3i64vARB,
		ProgramUniform3i64ARB,
		ProgramUniform3i64vARB,
		Uniform4i64ARB,
		Uniform4i64vARB,
		ProgramUniform4i64ARB,
		ProgramUniform4i64vARB,
		Uniform1ui64ARB,
		Uniform1ui64vARB,
		ProgramUniform1ui64ARB,
		ProgramUniform1ui64vARB,
		Uniform2ui64ARB,
		Uniform2ui64vARB,
		ProgramUniform2ui64ARB,
		ProgramUniform2ui64vARB,
		Uniform3ui64ARB,
		Uniform3ui64vARB,
		ProgramUniform3ui64ARB,
		ProgramUniform3ui64vARB,
		Uniform4ui64ARB,
		Uniform4ui64vARB,
		ProgramUniform4ui64ARB,
		ProgramUniform4ui64vARB,
		GetUniformi64vARB,
		GetUniformui64vARB,
		GetnUniformi64vARB,
		GetnUniformui64vARB;

	@JavadocExclude
	public ARBGPUShaderInt64(FunctionProvider provider) {
		Uniform1i64ARB = provider.getFunctionAddress("glUniform1i64ARB");
		Uniform1i64vARB = provider.getFunctionAddress("glUniform1i64vARB");
		ProgramUniform1i64ARB = provider.getFunctionAddress("glProgramUniform1i64ARB");
		ProgramUniform1i64vARB = provider.getFunctionAddress("glProgramUniform1i64vARB");
		Uniform2i64ARB = provider.getFunctionAddress("glUniform2i64ARB");
		Uniform2i64vARB = provider.getFunctionAddress("glUniform2i64vARB");
		ProgramUniform2i64ARB = provider.getFunctionAddress("glProgramUniform2i64ARB");
		ProgramUniform2i64vARB = provider.getFunctionAddress("glProgramUniform2i64vARB");
		Uniform3i64ARB = provider.getFunctionAddress("glUniform3i64ARB");
		Uniform3i64vARB = provider.getFunctionAddress("glUniform3i64vARB");
		ProgramUniform3i64ARB = provider.getFunctionAddress("glProgramUniform3i64ARB");
		ProgramUniform3i64vARB = provider.getFunctionAddress("glProgramUniform3i64vARB");
		Uniform4i64ARB = provider.getFunctionAddress("glUniform4i64ARB");
		Uniform4i64vARB = provider.getFunctionAddress("glUniform4i64vARB");
		ProgramUniform4i64ARB = provider.getFunctionAddress("glProgramUniform4i64ARB");
		ProgramUniform4i64vARB = provider.getFunctionAddress("glProgramUniform4i64vARB");
		Uniform1ui64ARB = provider.getFunctionAddress("glUniform1ui64ARB");
		Uniform1ui64vARB = provider.getFunctionAddress("glUniform1ui64vARB");
		ProgramUniform1ui64ARB = provider.getFunctionAddress("glProgramUniform1ui64ARB");
		ProgramUniform1ui64vARB = provider.getFunctionAddress("glProgramUniform1ui64vARB");
		Uniform2ui64ARB = provider.getFunctionAddress("glUniform2ui64ARB");
		Uniform2ui64vARB = provider.getFunctionAddress("glUniform2ui64vARB");
		ProgramUniform2ui64ARB = provider.getFunctionAddress("glProgramUniform2ui64ARB");
		ProgramUniform2ui64vARB = provider.getFunctionAddress("glProgramUniform2ui64vARB");
		Uniform3ui64ARB = provider.getFunctionAddress("glUniform3ui64ARB");
		Uniform3ui64vARB = provider.getFunctionAddress("glUniform3ui64vARB");
		ProgramUniform3ui64ARB = provider.getFunctionAddress("glProgramUniform3ui64ARB");
		ProgramUniform3ui64vARB = provider.getFunctionAddress("glProgramUniform3ui64vARB");
		Uniform4ui64ARB = provider.getFunctionAddress("glUniform4ui64ARB");
		Uniform4ui64vARB = provider.getFunctionAddress("glUniform4ui64vARB");
		ProgramUniform4ui64ARB = provider.getFunctionAddress("glProgramUniform4ui64ARB");
		ProgramUniform4ui64vARB = provider.getFunctionAddress("glProgramUniform4ui64vARB");
		GetUniformi64vARB = provider.getFunctionAddress("glGetUniformi64vARB");
		GetUniformui64vARB = provider.getFunctionAddress("glGetUniformui64vARB");
		GetnUniformi64vARB = provider.getFunctionAddress("glGetnUniformi64vARB");
		GetnUniformui64vARB = provider.getFunctionAddress("glGetnUniformui64vARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBGPUShaderInt64} instance for the current context. */
	public static ARBGPUShaderInt64 getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBGPUShaderInt64);
	}

	static ARBGPUShaderInt64 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_gpu_shader_int64") ) return null;

		ARBGPUShaderInt64 funcs = new ARBGPUShaderInt64(provider);

		boolean supported = checkFunctions(
			funcs.Uniform1i64ARB, funcs.Uniform1i64vARB, funcs.ProgramUniform1i64ARB, funcs.ProgramUniform1i64vARB, funcs.Uniform2i64ARB, funcs.Uniform2i64vARB, 
			funcs.ProgramUniform2i64ARB, funcs.ProgramUniform2i64vARB, funcs.Uniform3i64ARB, funcs.Uniform3i64vARB, funcs.ProgramUniform3i64ARB, 
			funcs.ProgramUniform3i64vARB, funcs.Uniform4i64ARB, funcs.Uniform4i64vARB, funcs.ProgramUniform4i64ARB, funcs.ProgramUniform4i64vARB, 
			funcs.Uniform1ui64ARB, funcs.Uniform1ui64vARB, funcs.ProgramUniform1ui64ARB, funcs.ProgramUniform1ui64vARB, funcs.Uniform2ui64ARB, 
			funcs.Uniform2ui64vARB, funcs.ProgramUniform2ui64ARB, funcs.ProgramUniform2ui64vARB, funcs.Uniform3ui64ARB, funcs.Uniform3ui64vARB, 
			funcs.ProgramUniform3ui64ARB, funcs.ProgramUniform3ui64vARB, funcs.Uniform4ui64ARB, funcs.Uniform4ui64vARB, funcs.ProgramUniform4ui64ARB, 
			funcs.ProgramUniform4ui64vARB, funcs.GetUniformi64vARB, funcs.GetUniformui64vARB, funcs.GetnUniformi64vARB, funcs.GetnUniformui64vARB
		);

		return GL.checkExtension("GL_ARB_gpu_shader_int64", funcs, supported);
	}

	// --- [ glUniform1i64ARB ] ---

	/**
	 * Specifies the value of an int64_t uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glUniform1i64ARB(int location, long x) {
		long __functionAddress = getInstance().Uniform1i64ARB;
		callIJV(__functionAddress, location, x);
	}

	// --- [ glUniform1i64vARB ] ---

	/** Unsafe version of {@link #glUniform1i64vARB Uniform1i64vARB} */
	@JavadocExclude
	public static void nglUniform1i64vARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1i64vARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single int64_t uniform variable or a int64_t uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified int64_t variable
	 */
	public static void glUniform1i64vARB(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglUniform1i64vARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1i64vARB Uniform1i64vARB} */
	public static void glUniform1i64vARB(int location, LongBuffer value) {
		nglUniform1i64vARB(location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform1i64ARB ] ---

	/**
	 * Specifies the value of an int64_t uniform variable for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1i64ARB(int program, int location, long x) {
		long __functionAddress = getInstance().ProgramUniform1i64ARB;
		callIIJV(__functionAddress, program, location, x);
	}

	// --- [ glProgramUniform1i64vARB ] ---

	/** Unsafe version of {@link #glProgramUniform1i64vARB ProgramUniform1i64vARB} */
	@JavadocExclude
	public static void nglProgramUniform1i64vARB(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1i64vARB;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single int64_t uniform variable or a int64_t uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified int64_t variable
	 */
	public static void glProgramUniform1i64vARB(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglProgramUniform1i64vARB(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1i64vARB ProgramUniform1i64vARB} */
	public static void glProgramUniform1i64vARB(int program, int location, LongBuffer value) {
		nglProgramUniform1i64vARB(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2i64ARB ] ---

	/**
	 * Specifies the value of an i64vec2 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glUniform2i64ARB(int location, long x, long y) {
		long __functionAddress = getInstance().Uniform2i64ARB;
		callIJJV(__functionAddress, location, x, y);
	}

	// --- [ glUniform2i64vARB ] ---

	/** Unsafe version of {@link #glUniform2i64vARB Uniform2i64vARB} */
	@JavadocExclude
	public static void nglUniform2i64vARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2i64vARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec2 uniform variable or a i64vec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec2 variable
	 */
	public static void glUniform2i64vARB(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglUniform2i64vARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2i64vARB Uniform2i64vARB} */
	public static void glUniform2i64vARB(int location, LongBuffer value) {
		nglUniform2i64vARB(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform2i64ARB ] ---

	/**
	 * Specifies the value of an i64vec2 uniform variable for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2i64ARB(int program, int location, long x, long y) {
		long __functionAddress = getInstance().ProgramUniform2i64ARB;
		callIIJJV(__functionAddress, program, location, x, y);
	}

	// --- [ glProgramUniform2i64vARB ] ---

	/** Unsafe version of {@link #glProgramUniform2i64vARB ProgramUniform2i64vARB} */
	@JavadocExclude
	public static void nglProgramUniform2i64vARB(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2i64vARB;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec2 uniform variable or a i64vec2 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec2 variable
	 */
	public static void glProgramUniform2i64vARB(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglProgramUniform2i64vARB(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2i64vARB ProgramUniform2i64vARB} */
	public static void glProgramUniform2i64vARB(int program, int location, LongBuffer value) {
		nglProgramUniform2i64vARB(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3i64ARB ] ---

	/**
	 * Specifies the value of an i64vec3 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glUniform3i64ARB(int location, long x, long y, long z) {
		long __functionAddress = getInstance().Uniform3i64ARB;
		callIJJJV(__functionAddress, location, x, y, z);
	}

	// --- [ glUniform3i64vARB ] ---

	/** Unsafe version of {@link #glUniform3i64vARB Uniform3i64vARB} */
	@JavadocExclude
	public static void nglUniform3i64vARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3i64vARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec3 uniform variable or a i64vec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec3 variable
	 */
	public static void glUniform3i64vARB(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 3);
		nglUniform3i64vARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3i64vARB Uniform3i64vARB} */
	public static void glUniform3i64vARB(int location, LongBuffer value) {
		nglUniform3i64vARB(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform3i64ARB ] ---

	/**
	 * Specifies the value of an i64vec3 uniform variable for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glProgramUniform3i64ARB(int program, int location, long x, long y, long z) {
		long __functionAddress = getInstance().ProgramUniform3i64ARB;
		callIIJJJV(__functionAddress, program, location, x, y, z);
	}

	// --- [ glProgramUniform3i64vARB ] ---

	/** Unsafe version of {@link #glProgramUniform3i64vARB ProgramUniform3i64vARB} */
	@JavadocExclude
	public static void nglProgramUniform3i64vARB(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3i64vARB;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec3 uniform variable or a i64vec3 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec3 variable
	 */
	public static void glProgramUniform3i64vARB(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 3);
		nglProgramUniform3i64vARB(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3i64vARB ProgramUniform3i64vARB} */
	public static void glProgramUniform3i64vARB(int program, int location, LongBuffer value) {
		nglProgramUniform3i64vARB(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4i64ARB ] ---

	/**
	 * Specifies the value of an i64vec4 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glUniform4i64ARB(int location, long x, long y, long z, long w) {
		long __functionAddress = getInstance().Uniform4i64ARB;
		callIJJJJV(__functionAddress, location, x, y, z, w);
	}

	// --- [ glUniform4i64vARB ] ---

	/** Unsafe version of {@link #glUniform4i64vARB Uniform4i64vARB} */
	@JavadocExclude
	public static void nglUniform4i64vARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4i64vARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec4 uniform variable or a i64vec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec4 variable
	 */
	public static void glUniform4i64vARB(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglUniform4i64vARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4i64vARB Uniform4i64vARB} */
	public static void glUniform4i64vARB(int location, LongBuffer value) {
		nglUniform4i64vARB(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform4i64ARB ] ---

	/**
	 * Specifies the value of an i64vec4 uniform variable for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glProgramUniform4i64ARB(int program, int location, long x, long y, long z, long w) {
		long __functionAddress = getInstance().ProgramUniform4i64ARB;
		callIIJJJJV(__functionAddress, program, location, x, y, z, w);
	}

	// --- [ glProgramUniform4i64vARB ] ---

	/** Unsafe version of {@link #glProgramUniform4i64vARB ProgramUniform4i64vARB} */
	@JavadocExclude
	public static void nglProgramUniform4i64vARB(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4i64vARB;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec4 uniform variable or a i64vec4 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec4 variable
	 */
	public static void glProgramUniform4i64vARB(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglProgramUniform4i64vARB(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4i64vARB ProgramUniform4i64vARB} */
	public static void glProgramUniform4i64vARB(int program, int location, LongBuffer value) {
		nglProgramUniform4i64vARB(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniform1ui64ARB ] ---

	/**
	 * Specifies the value of an uint64_t uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glUniform1ui64ARB(int location, long x) {
		long __functionAddress = getInstance().Uniform1ui64ARB;
		callIJV(__functionAddress, location, x);
	}

	// --- [ glUniform1ui64vARB ] ---

	/** Unsafe version of {@link #glUniform1ui64vARB Uniform1ui64vARB} */
	@JavadocExclude
	public static void nglUniform1ui64vARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1ui64vARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single uint64_t uniform variable or a uint64_t uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uint64_t variable
	 */
	public static void glUniform1ui64vARB(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglUniform1ui64vARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1ui64vARB Uniform1ui64vARB} */
	public static void glUniform1ui64vARB(int location, LongBuffer value) {
		nglUniform1ui64vARB(location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform1ui64ARB ] ---

	/**
	 * Specifies the value of an uint64_t uniform variable for the current program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glProgramUniform1ui64ARB(int program, int location, long x) {
		long __functionAddress = getInstance().ProgramUniform1ui64ARB;
		callIIJV(__functionAddress, program, location, x);
	}

	// --- [ glProgramUniform1ui64vARB ] ---

	/** Unsafe version of {@link #glProgramUniform1ui64vARB ProgramUniform1ui64vARB} */
	@JavadocExclude
	public static void nglProgramUniform1ui64vARB(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1ui64vARB;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single uint64_t uniform variable or a uint64_t uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uint64_t variable
	 */
	public static void glProgramUniform1ui64vARB(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglProgramUniform1ui64vARB(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1ui64vARB ProgramUniform1ui64vARB} */
	public static void glProgramUniform1ui64vARB(int program, int location, LongBuffer value) {
		nglProgramUniform1ui64vARB(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2ui64ARB ] ---

	/**
	 * Specifies the value of an u64vec2 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glUniform2ui64ARB(int location, long x, long y) {
		long __functionAddress = getInstance().Uniform2ui64ARB;
		callIJJV(__functionAddress, location, x, y);
	}

	// --- [ glUniform2ui64vARB ] ---

	/** Unsafe version of {@link #glUniform2ui64vARB Uniform2ui64vARB} */
	@JavadocExclude
	public static void nglUniform2ui64vARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2ui64vARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec2 uniform variable or a u64vec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec2 variable
	 */
	public static void glUniform2ui64vARB(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglUniform2ui64vARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2ui64vARB Uniform2ui64vARB} */
	public static void glUniform2ui64vARB(int location, LongBuffer value) {
		nglUniform2ui64vARB(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform2ui64ARB ] ---

	/**
	 * Specifies the value of an u64vec2 uniform variable for the current program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 */
	public static void glProgramUniform2ui64ARB(int program, int location, long x, long y) {
		long __functionAddress = getInstance().ProgramUniform2ui64ARB;
		callIIJJV(__functionAddress, program, location, x, y);
	}

	// --- [ glProgramUniform2ui64vARB ] ---

	/** Unsafe version of {@link #glProgramUniform2ui64vARB ProgramUniform2ui64vARB} */
	@JavadocExclude
	public static void nglProgramUniform2ui64vARB(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2ui64vARB;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec2 uniform variable or a u64vec2 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec2 variable
	 */
	public static void glProgramUniform2ui64vARB(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglProgramUniform2ui64vARB(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2ui64vARB ProgramUniform2ui64vARB} */
	public static void glProgramUniform2ui64vARB(int program, int location, LongBuffer value) {
		nglProgramUniform2ui64vARB(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3ui64ARB ] ---

	/**
	 * Specifies the value of an u64vec3 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glUniform3ui64ARB(int location, long x, long y, long z) {
		long __functionAddress = getInstance().Uniform3ui64ARB;
		callIJJJV(__functionAddress, location, x, y, z);
	}

	// --- [ glUniform3ui64vARB ] ---

	/** Unsafe version of {@link #glUniform3ui64vARB Uniform3ui64vARB} */
	@JavadocExclude
	public static void nglUniform3ui64vARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3ui64vARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec3 uniform variable or a u64vec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec3 variable
	 */
	public static void glUniform3ui64vARB(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 3);
		nglUniform3ui64vARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3ui64vARB Uniform3ui64vARB} */
	public static void glUniform3ui64vARB(int location, LongBuffer value) {
		nglUniform3ui64vARB(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform3ui64ARB ] ---

	/**
	 * Specifies the value of an u64vec3 uniform variable for the current program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 */
	public static void glProgramUniform3ui64ARB(int program, int location, long x, long y, long z) {
		long __functionAddress = getInstance().ProgramUniform3ui64ARB;
		callIIJJJV(__functionAddress, program, location, x, y, z);
	}

	// --- [ glProgramUniform3ui64vARB ] ---

	/** Unsafe version of {@link #glProgramUniform3ui64vARB ProgramUniform3ui64vARB} */
	@JavadocExclude
	public static void nglProgramUniform3ui64vARB(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3ui64vARB;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec3 uniform variable or a u64vec3 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec3 variable
	 */
	public static void glProgramUniform3ui64vARB(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 3);
		nglProgramUniform3ui64vARB(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3ui64vARB ProgramUniform3ui64vARB} */
	public static void glProgramUniform3ui64vARB(int program, int location, LongBuffer value) {
		nglProgramUniform3ui64vARB(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4ui64ARB ] ---

	/**
	 * Specifies the value of an u64vec4 uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glUniform4ui64ARB(int location, long x, long y, long z, long w) {
		long __functionAddress = getInstance().Uniform4ui64ARB;
		callIJJJJV(__functionAddress, location, x, y, z, w);
	}

	// --- [ glUniform4ui64vARB ] ---

	/** Unsafe version of {@link #glUniform4ui64vARB Uniform4ui64vARB} */
	@JavadocExclude
	public static void nglUniform4ui64vARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4ui64vARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec4 uniform variable or a u64vec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec4 variable
	 */
	public static void glUniform4ui64vARB(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglUniform4ui64vARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4ui64vARB Uniform4ui64vARB} */
	public static void glUniform4ui64vARB(int location, LongBuffer value) {
		nglUniform4ui64vARB(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform4ui64ARB ] ---

	/**
	 * Specifies the value of an u64vec4 uniform variable for the current program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 * @param y        the uniform y value
	 * @param z        the uniform z value
	 * @param w        the uniform w value
	 */
	public static void glProgramUniform4ui64ARB(int program, int location, long x, long y, long z, long w) {
		long __functionAddress = getInstance().ProgramUniform4ui64ARB;
		callIIJJJJV(__functionAddress, program, location, x, y, z, w);
	}

	// --- [ glProgramUniform4ui64vARB ] ---

	/** Unsafe version of {@link #glProgramUniform4ui64vARB ProgramUniform4ui64vARB} */
	@JavadocExclude
	public static void nglProgramUniform4ui64vARB(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4ui64vARB;
		callIIIPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec4 uniform variable or a u64vec4 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec4 variable
	 */
	public static void glProgramUniform4ui64vARB(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglProgramUniform4ui64vARB(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4ui64vARB ProgramUniform4ui64vARB} */
	public static void glProgramUniform4ui64vARB(int program, int location, LongBuffer value) {
		nglProgramUniform4ui64vARB(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glGetUniformi64vARB ] ---

	/** Unsafe version of {@link #glGetUniformi64vARB GetUniformi64vARB} */
	@JavadocExclude
	public static void nglGetUniformi64vARB(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformi64vARB;
		callIIPV(__functionAddress, program, location, params);
	}

	/**
	 * Returns the int64_t value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformi64vARB(int program, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetUniformi64vARB(program, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformi64vARB GetUniformi64vARB} */
	public static void glGetUniformi64vARB(int program, int location, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformi64vARB(program, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformi64vARB GetUniformi64vARB} */
	public static long glGetUniformi64vARB(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetUniformi64vARB(program, location, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetUniformui64vARB ] ---

	/** Unsafe version of {@link #glGetUniformui64vARB GetUniformui64vARB} */
	@JavadocExclude
	public static void nglGetUniformui64vARB(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformui64vARB;
		callIIPV(__functionAddress, program, location, params);
	}

	/**
	 * Returns the uint64_t value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformui64vARB(int program, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetUniformui64vARB(program, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformui64vARB GetUniformui64vARB} */
	public static void glGetUniformui64vARB(int program, int location, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformui64vARB(program, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformui64vARB GetUniformui64vARB} */
	public static long glGetUniformui64vARB(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetUniformui64vARB(program, location, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetnUniformi64vARB ] ---

	/** Unsafe version of {@link #glGetnUniformi64vARB GetnUniformi64vARB} */
	@JavadocExclude
	public static void nglGetnUniformi64vARB(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformi64vARB;
		callIIIPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * Robust version of {@link #glGetUniformi64vARB GetUniformi64vARB}.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param bufSize  the maximum number of values to write in {@code params}
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetnUniformi64vARB(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 3);
		nglGetnUniformi64vARB(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformi64vARB GetnUniformi64vARB} */
	public static void glGetnUniformi64vARB(int program, int location, LongBuffer params) {
		nglGetnUniformi64vARB(program, location, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetnUniformi64vARB GetnUniformi64vARB} */
	public static long glGetnUniformi64vARB(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetnUniformi64vARB(program, location, 1, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetnUniformui64vARB ] ---

	/** Unsafe version of {@link #glGetnUniformui64vARB GetnUniformui64vARB} */
	@JavadocExclude
	public static void nglGetnUniformui64vARB(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformui64vARB;
		callIIIPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * Robust version of {@link #glGetUniformui64vARB GetUniformui64vARB}.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param bufSize  the maximum number of values to write in {@code params}
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetnUniformui64vARB(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 3);
		nglGetnUniformui64vARB(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformui64vARB GetnUniformui64vARB} */
	public static void glGetnUniformui64vARB(int program, int location, LongBuffer params) {
		nglGetnUniformui64vARB(program, location, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetnUniformui64vARB GetnUniformui64vARB} */
	public static long glGetnUniformui64vARB(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetnUniformui64vARB(program, location, 1, __buffer.address(params));
		return __buffer.longValue(params);
	}

}