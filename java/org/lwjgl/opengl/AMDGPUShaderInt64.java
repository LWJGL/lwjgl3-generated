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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/gpu_shader_int64.txt">AMD_gpu_shader_int64</a> extension.
 * 
 * <p>This extension was developed based on the NV_gpu_shader5 extension to allow implementations supporting 64-bit integers to expose the feature without
 * the additional requirements that are present in NV_gpu_shader5.</p>
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
 * <p>This extension is designed to be a functional superset of the 64-bit integer support introduced by NV_gpu_shader5 and to be source code compatible with
 * that, thus the new procedures, functions, and tokens are identical to those found in that extension.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0} and GLSL 4.00.</p>
 */
public class AMDGPUShaderInt64 {

	/** Returned by the {@code type} parameter of GetActiveAttrib, GetActiveUniform, and GetTransformFeedbackVarying. */
	public static final int
		GL_INT64_NV               = 0x140E,
		GL_UNSIGNED_INT64_NV      = 0x140F,
		GL_INT8_NV                = 0x8FE0,
		GL_INT8_VEC2_NV           = 0x8FE1,
		GL_INT8_VEC3_NV           = 0x8FE2,
		GL_INT8_VEC4_NV           = 0x8FE3,
		GL_INT16_NV               = 0x8FE4,
		GL_INT16_VEC2_NV          = 0x8FE5,
		GL_INT16_VEC3_NV          = 0x8FE6,
		GL_INT16_VEC4_NV          = 0x8FE7,
		GL_INT64_VEC2_NV          = 0x8FE9,
		GL_INT64_VEC3_NV          = 0x8FEA,
		GL_INT64_VEC4_NV          = 0x8FEB,
		GL_UNSIGNED_INT8_NV       = 0x8FEC,
		GL_UNSIGNED_INT8_VEC2_NV  = 0x8FED,
		GL_UNSIGNED_INT8_VEC3_NV  = 0x8FEE,
		GL_UNSIGNED_INT8_VEC4_NV  = 0x8FEF,
		GL_UNSIGNED_INT16_NV      = 0x8FF0,
		GL_UNSIGNED_INT16_VEC2_NV = 0x8FF1,
		GL_UNSIGNED_INT16_VEC3_NV = 0x8FF2,
		GL_UNSIGNED_INT16_VEC4_NV = 0x8FF3,
		GL_UNSIGNED_INT64_VEC2_NV = 0x8FF5,
		GL_UNSIGNED_INT64_VEC3_NV = 0x8FF6,
		GL_UNSIGNED_INT64_VEC4_NV = 0x8FF7,
		GL_FLOAT16_NV             = 0x8FF8,
		GL_FLOAT16_VEC2_NV        = 0x8FF9,
		GL_FLOAT16_VEC3_NV        = 0x8FFA,
		GL_FLOAT16_VEC4_NV        = 0x8FFB;

	protected AMDGPUShaderInt64() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, java.util.Set<String> ext) {
		return checkFunctions(
			caps.glUniform1i64NV, caps.glUniform2i64NV, caps.glUniform3i64NV, caps.glUniform4i64NV, caps.glUniform1i64vNV, caps.glUniform2i64vNV, 
			caps.glUniform3i64vNV, caps.glUniform4i64vNV, caps.glUniform1ui64NV, caps.glUniform2ui64NV, caps.glUniform3ui64NV, caps.glUniform4ui64NV, 
			caps.glUniform1ui64vNV, caps.glUniform2ui64vNV, caps.glUniform3ui64vNV, caps.glUniform4ui64vNV, caps.glGetUniformi64vNV, caps.glGetUniformui64vNV, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform1i64NV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform2i64NV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform3i64NV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform4i64NV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform1i64vNV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform2i64vNV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform3i64vNV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform4i64vNV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform1ui64NV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform2ui64NV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform3ui64NV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform4ui64NV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform1ui64vNV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform2ui64vNV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform3ui64vNV : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glProgramUniform4ui64vNV : -1L
		);
	}

	// --- [ glUniform1i64NV ] ---

	public static void glUniform1i64NV(int location, long x) {
		long __functionAddress = GL.getCapabilities().glUniform1i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, location, x);
	}

	// --- [ glUniform2i64NV ] ---

	public static void glUniform2i64NV(int location, long x, long y) {
		long __functionAddress = GL.getCapabilities().glUniform2i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJV(__functionAddress, location, x, y);
	}

	// --- [ glUniform3i64NV ] ---

	public static void glUniform3i64NV(int location, long x, long y, long z) {
		long __functionAddress = GL.getCapabilities().glUniform3i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJV(__functionAddress, location, x, y, z);
	}

	// --- [ glUniform4i64NV ] ---

	public static void glUniform4i64NV(int location, long x, long y, long z, long w) {
		long __functionAddress = GL.getCapabilities().glUniform4i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJJV(__functionAddress, location, x, y, z, w);
	}

	// --- [ glUniform1i64vNV ] ---

	public static void nglUniform1i64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform1i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform1i64vNV(int location, LongBuffer value) {
		nglUniform1i64vNV(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2i64vNV ] ---

	public static void nglUniform2i64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform2i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform2i64vNV(int location, LongBuffer value) {
		nglUniform2i64vNV(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3i64vNV ] ---

	public static void nglUniform3i64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform3i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform3i64vNV(int location, LongBuffer value) {
		nglUniform3i64vNV(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4i64vNV ] ---

	public static void nglUniform4i64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform4i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform4i64vNV(int location, LongBuffer value) {
		nglUniform4i64vNV(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniform1ui64NV ] ---

	public static void glUniform1ui64NV(int location, long x) {
		long __functionAddress = GL.getCapabilities().glUniform1ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, location, x);
	}

	// --- [ glUniform2ui64NV ] ---

	public static void glUniform2ui64NV(int location, long x, long y) {
		long __functionAddress = GL.getCapabilities().glUniform2ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJV(__functionAddress, location, x, y);
	}

	// --- [ glUniform3ui64NV ] ---

	public static void glUniform3ui64NV(int location, long x, long y, long z) {
		long __functionAddress = GL.getCapabilities().glUniform3ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJV(__functionAddress, location, x, y, z);
	}

	// --- [ glUniform4ui64NV ] ---

	public static void glUniform4ui64NV(int location, long x, long y, long z, long w) {
		long __functionAddress = GL.getCapabilities().glUniform4ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJJV(__functionAddress, location, x, y, z, w);
	}

	// --- [ glUniform1ui64vNV ] ---

	public static void nglUniform1ui64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform1ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform1ui64vNV(int location, LongBuffer value) {
		nglUniform1ui64vNV(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2ui64vNV ] ---

	public static void nglUniform2ui64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform2ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform2ui64vNV(int location, LongBuffer value) {
		nglUniform2ui64vNV(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3ui64vNV ] ---

	public static void nglUniform3ui64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform3ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform3ui64vNV(int location, LongBuffer value) {
		nglUniform3ui64vNV(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4ui64vNV ] ---

	public static void nglUniform4ui64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform4ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform4ui64vNV(int location, LongBuffer value) {
		nglUniform4ui64vNV(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glGetUniformi64vNV ] ---

	public static void nglGetUniformi64vNV(int program, int location, long params) {
		long __functionAddress = GL.getCapabilities().glGetUniformi64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params);
	}

	public static void glGetUniformi64vNV(int program, int location, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformi64vNV(program, location, memAddress(params));
	}

	public static long glGetUniformi64NV(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetUniformi64vNV(program, location, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetUniformui64vNV ] ---

	public static void nglGetUniformui64vNV(int program, int location, long params) {
		long __functionAddress = GL.getCapabilities().glGetUniformui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params);
	}

	public static void glGetUniformui64vNV(int program, int location, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformui64vNV(program, location, memAddress(params));
	}

	public static long glGetUniformui64NV(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetUniformui64vNV(program, location, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glProgramUniform1i64NV ] ---

	public static void glProgramUniform1i64NV(int program, int location, long x) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, program, location, x);
	}

	// --- [ glProgramUniform2i64NV ] ---

	public static void glProgramUniform2i64NV(int program, int location, long x, long y) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJV(__functionAddress, program, location, x, y);
	}

	// --- [ glProgramUniform3i64NV ] ---

	public static void glProgramUniform3i64NV(int program, int location, long x, long y, long z) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJV(__functionAddress, program, location, x, y, z);
	}

	// --- [ glProgramUniform4i64NV ] ---

	public static void glProgramUniform4i64NV(int program, int location, long x, long y, long z, long w) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJJV(__functionAddress, program, location, x, y, z, w);
	}

	// --- [ glProgramUniform1i64vNV ] ---

	public static void nglProgramUniform1i64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform1i64vNV(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2i64vNV ] ---

	public static void nglProgramUniform2i64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform2i64vNV(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3i64vNV ] ---

	public static void nglProgramUniform3i64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform3i64vNV(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4i64vNV ] ---

	public static void nglProgramUniform4i64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform4i64vNV(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1ui64NV ] ---

	public static void glProgramUniform1ui64NV(int program, int location, long x) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, program, location, x);
	}

	// --- [ glProgramUniform2ui64NV ] ---

	public static void glProgramUniform2ui64NV(int program, int location, long x, long y) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJV(__functionAddress, program, location, x, y);
	}

	// --- [ glProgramUniform3ui64NV ] ---

	public static void glProgramUniform3ui64NV(int program, int location, long x, long y, long z) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJV(__functionAddress, program, location, x, y, z);
	}

	// --- [ glProgramUniform4ui64NV ] ---

	public static void glProgramUniform4ui64NV(int program, int location, long x, long y, long z, long w) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJJJJV(__functionAddress, program, location, x, y, z, w);
	}

	// --- [ glProgramUniform1ui64vNV ] ---

	public static void nglProgramUniform1ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform1ui64vNV(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2ui64vNV ] ---

	public static void nglProgramUniform2ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform2ui64vNV(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3ui64vNV ] ---

	public static void nglProgramUniform3ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform3ui64vNV(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4ui64vNV ] ---

	public static void nglProgramUniform4ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform4ui64vNV(program, location, value.remaining() >> 2, memAddress(value));
	}

	/** Array version of: {@link #glUniform1i64vNV Uniform1i64vNV} */
	public static void glUniform1i64vNV(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform1i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length, value);
	}

	/** Array version of: {@link #glUniform2i64vNV Uniform2i64vNV} */
	public static void glUniform2i64vNV(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform2i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glUniform3i64vNV Uniform3i64vNV} */
	public static void glUniform3i64vNV(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform3i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length / 3, value);
	}

	/** Array version of: {@link #glUniform4i64vNV Uniform4i64vNV} */
	public static void glUniform4i64vNV(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform4i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glUniform1ui64vNV Uniform1ui64vNV} */
	public static void glUniform1ui64vNV(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform1ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length, value);
	}

	/** Array version of: {@link #glUniform2ui64vNV Uniform2ui64vNV} */
	public static void glUniform2ui64vNV(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform2ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glUniform3ui64vNV Uniform3ui64vNV} */
	public static void glUniform3ui64vNV(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform3ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length / 3, value);
	}

	/** Array version of: {@link #glUniform4ui64vNV Uniform4ui64vNV} */
	public static void glUniform4ui64vNV(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniform4ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glGetUniformi64vNV GetUniformi64vNV} */
	public static void glGetUniformi64vNV(int program, int location, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetUniformi64vNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, program, location, params);
	}

	/** Array version of: {@link #glGetUniformui64vNV GetUniformui64vNV} */
	public static void glGetUniformui64vNV(int program, int location, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetUniformui64vNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, program, location, params);
	}

	/** Array version of: {@link #glProgramUniform1i64vNV ProgramUniform1i64vNV} */
	public static void glProgramUniform1i64vNV(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform2i64vNV ProgramUniform2i64vNV} */
	public static void glProgramUniform2i64vNV(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform3i64vNV ProgramUniform3i64vNV} */
	public static void glProgramUniform3i64vNV(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform4i64vNV ProgramUniform4i64vNV} */
	public static void glProgramUniform4i64vNV(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniform1ui64vNV ProgramUniform1ui64vNV} */
	public static void glProgramUniform1ui64vNV(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform2ui64vNV ProgramUniform2ui64vNV} */
	public static void glProgramUniform2ui64vNV(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform3ui64vNV ProgramUniform3ui64vNV} */
	public static void glProgramUniform3ui64vNV(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform4ui64vNV ProgramUniform4ui64vNV} */
	public static void glProgramUniform4ui64vNV(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

}