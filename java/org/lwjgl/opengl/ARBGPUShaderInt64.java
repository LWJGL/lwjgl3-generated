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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/gpu_shader_int64.txt">ARB_gpu_shader_int64</a> extension.
 * 
 * <p>The extension introduces the following features for all shader types:</p>
 * 
 * <ul>
 * <li>support for 64-bit scalar and vector integer data types, including uniform API, uniform buffer object, transform feedback, and shader input and
 * output support;</li>
 * <li>new built-in functions to pack and unpack 64-bit integer types into a two-component 32-bit integer vector;</li>
 * <li>new built-in functions to convert double-precision floating-point values to or from their 64-bit integer bit encodings;</li>
 * <li>vector relational functions supporting comparisons of vectors of 64-bit integer types; and</li>
 * <li>common functions abs, sign, min, max, clamp, and mix supporting arguments of 64-bit integer types.</li>
 * </ul>
 * 
 * <p>Requires {@link GL40 GL40} and GLSL 4.00.</p>
 */
public class ARBGPUShaderInt64 {

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

	protected ARBGPUShaderInt64() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glUniform1i64ARB, caps.glUniform1i64vARB, caps.glProgramUniform1i64ARB, caps.glProgramUniform1i64vARB, caps.glUniform2i64ARB, 
			caps.glUniform2i64vARB, caps.glProgramUniform2i64ARB, caps.glProgramUniform2i64vARB, caps.glUniform3i64ARB, caps.glUniform3i64vARB, 
			caps.glProgramUniform3i64ARB, caps.glProgramUniform3i64vARB, caps.glUniform4i64ARB, caps.glUniform4i64vARB, caps.glProgramUniform4i64ARB, 
			caps.glProgramUniform4i64vARB, caps.glUniform1ui64ARB, caps.glUniform1ui64vARB, caps.glProgramUniform1ui64ARB, caps.glProgramUniform1ui64vARB, 
			caps.glUniform2ui64ARB, caps.glUniform2ui64vARB, caps.glProgramUniform2ui64ARB, caps.glProgramUniform2ui64vARB, caps.glUniform3ui64ARB, 
			caps.glUniform3ui64vARB, caps.glProgramUniform3ui64ARB, caps.glProgramUniform3ui64vARB, caps.glUniform4ui64ARB, caps.glUniform4ui64vARB, 
			caps.glProgramUniform4ui64ARB, caps.glProgramUniform4ui64vARB, caps.glGetUniformi64vARB, caps.glGetUniformui64vARB, caps.glGetnUniformi64vARB, 
			caps.glGetnUniformui64vARB
		);
	}

	// --- [ glUniform1i64ARB ] ---

	/**
	 * Specifies the value of an int64_t uniform variable for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param x        the uniform x value
	 */
	public static void glUniform1i64ARB(int location, long x) {
		long __functionAddress = GL.getCapabilities().glUniform1i64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, location, x);
	}

	// --- [ glUniform1i64vARB ] ---

	/**
	 * Specifies the value of a single int64_t uniform variable or a int64_t uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified int64_t variable
	 */
	public static void nglUniform1i64vARB(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform1i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single int64_t uniform variable or a int64_t uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified int64_t variable
	 */
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
		long __functionAddress = GL.getCapabilities().glProgramUniform1i64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, program, location, x);
	}

	// --- [ glProgramUniform1i64vARB ] ---

	/**
	 * Specifies the value of a single int64_t uniform variable or a int64_t uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified int64_t variable
	 */
	public static void nglProgramUniform1i64vARB(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single int64_t uniform variable or a int64_t uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified int64_t variable
	 */
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
		long __functionAddress = GL.getCapabilities().glUniform2i64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJV(__functionAddress, location, x, y);
	}

	// --- [ glUniform2i64vARB ] ---

	/**
	 * Specifies the value of a single i64vec2 uniform variable or a i64vec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec2 variable
	 */
	public static void nglUniform2i64vARB(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform2i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec2 uniform variable or a i64vec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec2 variable
	 */
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
		long __functionAddress = GL.getCapabilities().glProgramUniform2i64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJV(__functionAddress, program, location, x, y);
	}

	// --- [ glProgramUniform2i64vARB ] ---

	/**
	 * Specifies the value of a single i64vec2 uniform variable or a i64vec2 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec2 variable
	 */
	public static void nglProgramUniform2i64vARB(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec2 uniform variable or a i64vec2 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec2 variable
	 */
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
		long __functionAddress = GL.getCapabilities().glUniform3i64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJV(__functionAddress, location, x, y, z);
	}

	// --- [ glUniform3i64vARB ] ---

	/**
	 * Specifies the value of a single i64vec3 uniform variable or a i64vec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec3 variable
	 */
	public static void nglUniform3i64vARB(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform3i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec3 uniform variable or a i64vec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec3 variable
	 */
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
		long __functionAddress = GL.getCapabilities().glProgramUniform3i64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJV(__functionAddress, program, location, x, y, z);
	}

	// --- [ glProgramUniform3i64vARB ] ---

	/**
	 * Specifies the value of a single i64vec3 uniform variable or a i64vec3 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec3 variable
	 */
	public static void nglProgramUniform3i64vARB(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec3 uniform variable or a i64vec3 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec3 variable
	 */
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
		long __functionAddress = GL.getCapabilities().glUniform4i64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJJV(__functionAddress, location, x, y, z, w);
	}

	// --- [ glUniform4i64vARB ] ---

	/**
	 * Specifies the value of a single i64vec4 uniform variable or a i64vec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec4 variable
	 */
	public static void nglUniform4i64vARB(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform4i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec4 uniform variable or a i64vec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec4 variable
	 */
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
		long __functionAddress = GL.getCapabilities().glProgramUniform4i64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJJV(__functionAddress, program, location, x, y, z, w);
	}

	// --- [ glProgramUniform4i64vARB ] ---

	/**
	 * Specifies the value of a single i64vec4 uniform variable or a i64vec4 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec4 variable
	 */
	public static void nglProgramUniform4i64vARB(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single i64vec4 uniform variable or a i64vec4 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec4 variable
	 */
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
		long __functionAddress = GL.getCapabilities().glUniform1ui64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, location, x);
	}

	// --- [ glUniform1ui64vARB ] ---

	/**
	 * Specifies the value of a single uint64_t uniform variable or a uint64_t uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uint64_t variable
	 */
	public static void nglUniform1ui64vARB(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform1ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single uint64_t uniform variable or a uint64_t uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uint64_t variable
	 */
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
		long __functionAddress = GL.getCapabilities().glProgramUniform1ui64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, program, location, x);
	}

	// --- [ glProgramUniform1ui64vARB ] ---

	/**
	 * Specifies the value of a single uint64_t uniform variable or a uint64_t uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uint64_t variable
	 */
	public static void nglProgramUniform1ui64vARB(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single uint64_t uniform variable or a uint64_t uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uint64_t variable
	 */
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
		long __functionAddress = GL.getCapabilities().glUniform2ui64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJV(__functionAddress, location, x, y);
	}

	// --- [ glUniform2ui64vARB ] ---

	/**
	 * Specifies the value of a single u64vec2 uniform variable or a u64vec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec2 variable
	 */
	public static void nglUniform2ui64vARB(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform2ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec2 uniform variable or a u64vec2 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec2 variable
	 */
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
		long __functionAddress = GL.getCapabilities().glProgramUniform2ui64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJV(__functionAddress, program, location, x, y);
	}

	// --- [ glProgramUniform2ui64vARB ] ---

	/**
	 * Specifies the value of a single u64vec2 uniform variable or a u64vec2 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec2 variable
	 */
	public static void nglProgramUniform2ui64vARB(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec2 uniform variable or a u64vec2 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec2 variable
	 */
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
		long __functionAddress = GL.getCapabilities().glUniform3ui64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJV(__functionAddress, location, x, y, z);
	}

	// --- [ glUniform3ui64vARB ] ---

	/**
	 * Specifies the value of a single u64vec3 uniform variable or a u64vec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec3 variable
	 */
	public static void nglUniform3ui64vARB(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform3ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec3 uniform variable or a u64vec3 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec3 variable
	 */
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
		long __functionAddress = GL.getCapabilities().glProgramUniform3ui64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJV(__functionAddress, program, location, x, y, z);
	}

	// --- [ glProgramUniform3ui64vARB ] ---

	/**
	 * Specifies the value of a single u64vec3 uniform variable or a u64vec3 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec3 variable
	 */
	public static void nglProgramUniform3ui64vARB(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec3 uniform variable or a u64vec3 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec3 variable
	 */
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
		long __functionAddress = GL.getCapabilities().glUniform4ui64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJJV(__functionAddress, location, x, y, z, w);
	}

	// --- [ glUniform4ui64vARB ] ---

	/**
	 * Specifies the value of a single u64vec4 uniform variable or a u64vec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec4 variable
	 */
	public static void nglUniform4ui64vARB(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform4ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec4 uniform variable or a u64vec4 uniform variable array for the current program object.
	 *
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec4 variable
	 */
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
		long __functionAddress = GL.getCapabilities().glProgramUniform4ui64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJJV(__functionAddress, program, location, x, y, z, w);
	}

	// --- [ glProgramUniform4ui64vARB ] ---

	/**
	 * Specifies the value of a single u64vec4 uniform variable or a u64vec4 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param count    the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec4 variable
	 */
	public static void nglProgramUniform4ui64vARB(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	/**
	 * Specifies the value of a single u64vec4 uniform variable or a u64vec4 uniform variable array for the specified program object.
	 *
	 * @param program  the program object
	 * @param location the location of the uniform variable to be modified
	 * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec4 variable
	 */
	public static void glProgramUniform4ui64vARB(int program, int location, LongBuffer value) {
		nglProgramUniform4ui64vARB(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glGetUniformi64vARB ] ---

	/**
	 * Returns the int64_t value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void nglGetUniformi64vARB(int program, int location, long params) {
		long __functionAddress = GL.getCapabilities().glGetUniformi64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params);
	}

	/**
	 * Returns the int64_t value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformi64vARB(int program, int location, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformi64vARB(program, location, memAddress(params));
	}

	/**
	 * Returns the int64_t value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 */
	public static long glGetUniformi64vARB(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetUniformi64vARB(program, location, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetUniformui64vARB ] ---

	/**
	 * Returns the uint64_t value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void nglGetUniformui64vARB(int program, int location, long params) {
		long __functionAddress = GL.getCapabilities().glGetUniformui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params);
	}

	/**
	 * Returns the uint64_t value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetUniformui64vARB(int program, int location, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformui64vARB(program, location, memAddress(params));
	}

	/**
	 * Returns the uint64_t value(s) of a uniform variable.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 */
	public static long glGetUniformui64vARB(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetUniformui64vARB(program, location, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetnUniformi64vARB ] ---

	/**
	 * Robust version of {@link #glGetUniformi64vARB GetUniformi64vARB}.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param bufSize  the maximum number of values to write in {@code params}
	 * @param params   the value of the specified uniform variable
	 */
	public static void nglGetnUniformi64vARB(int program, int location, int bufSize, long params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformi64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * Robust version of {@link #glGetUniformi64vARB GetUniformi64vARB}.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetnUniformi64vARB(int program, int location, LongBuffer params) {
		nglGetnUniformi64vARB(program, location, params.remaining(), memAddress(params));
	}

	/**
	 * Robust version of {@link #glGetUniformi64vARB GetUniformi64vARB}.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 */
	public static long glGetnUniformi64vARB(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetnUniformi64vARB(program, location, 1, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetnUniformui64vARB ] ---

	/**
	 * Robust version of {@link #glGetUniformui64vARB GetUniformui64vARB}.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param bufSize  the maximum number of values to write in {@code params}
	 * @param params   the value of the specified uniform variable
	 */
	public static void nglGetnUniformui64vARB(int program, int location, int bufSize, long params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * Robust version of {@link #glGetUniformui64vARB GetUniformui64vARB}.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 * @param params   the value of the specified uniform variable
	 */
	public static void glGetnUniformui64vARB(int program, int location, LongBuffer params) {
		nglGetnUniformui64vARB(program, location, params.remaining(), memAddress(params));
	}

	/**
	 * Robust version of {@link #glGetUniformui64vARB GetUniformui64vARB}.
	 *
	 * @param program  the program object to be queried
	 * @param location the location of the uniform variable to be queried
	 */
	public static long glGetnUniformui64vARB(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetnUniformui64vARB(program, location, 1, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glUniform1i64vARB Uniform1i64vARB} */
	public static void glUniform1i64vARB(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform1i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform1i64vARB ProgramUniform1i64vARB} */
	public static void glProgramUniform1i64vARB(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glUniform2i64vARB Uniform2i64vARB} */
	public static void glUniform2i64vARB(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform2i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform2i64vARB ProgramUniform2i64vARB} */
	public static void glProgramUniform2i64vARB(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glUniform3i64vARB Uniform3i64vARB} */
	public static void glUniform3i64vARB(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform3i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform3i64vARB ProgramUniform3i64vARB} */
	public static void glProgramUniform3i64vARB(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glUniform4i64vARB Uniform4i64vARB} */
	public static void glUniform4i64vARB(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform4i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniform4i64vARB ProgramUniform4i64vARB} */
	public static void glProgramUniform4i64vARB(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4i64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glUniform1ui64vARB Uniform1ui64vARB} */
	public static void glUniform1ui64vARB(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform1ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform1ui64vARB ProgramUniform1ui64vARB} */
	public static void glProgramUniform1ui64vARB(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glUniform2ui64vARB Uniform2ui64vARB} */
	public static void glUniform2ui64vARB(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform2ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform2ui64vARB ProgramUniform2ui64vARB} */
	public static void glProgramUniform2ui64vARB(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glUniform3ui64vARB Uniform3ui64vARB} */
	public static void glUniform3ui64vARB(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform3ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform3ui64vARB ProgramUniform3ui64vARB} */
	public static void glProgramUniform3ui64vARB(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glUniform4ui64vARB Uniform4ui64vARB} */
	public static void glUniform4ui64vARB(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform4ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniform4ui64vARB ProgramUniform4ui64vARB} */
	public static void glProgramUniform4ui64vARB(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glGetUniformi64vARB GetUniformi64vARB} */
	public static void glGetUniformi64vARB(int program, int location, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetUniformi64vARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, program, location, params);
	}

	/** Array version of: {@link #glGetUniformui64vARB GetUniformui64vARB} */
	public static void glGetUniformui64vARB(int program, int location, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetUniformui64vARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, program, location, params);
	}

	/** Array version of: {@link #glGetnUniformi64vARB GetnUniformi64vARB} */
	public static void glGetnUniformi64vARB(int program, int location, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformi64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params.length, params);
	}

	/** Array version of: {@link #glGetnUniformui64vARB GetnUniformui64vARB} */
	public static void glGetnUniformui64vARB(int program, int location, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params.length, params);
	}

}