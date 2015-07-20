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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/gpu_shader_int64.txt">AMD_gpu_shader_int64</a> extension.
 * 
 * <p>This extension was developed based on the NV_gpu_shader5 extension to allow implementations supporting 64-bit integers to expose the feature without
 * the additional requirements that are present in NV_gpu_shader5.</p>
 * 
 * <p>The extension introduces the following features for all shader types:
 * <ul>
 * <li>support for 64-bit scalar and vector integer data types, including uniform API, uniform buffer object, transform feedback, and shader input and
 * output support;</li>
 * <li>new built-in functions to pack and unpack 64-bit integer types into a two-component 32-bit integer vector;</li>
 * <li>new built-in functions to convert double-precision floating-point values to or from their 64-bit integer bit encodings;</li>
 * <li>vector relational functions supporting comparisons of vectors of 64-bit integer types; and</li>
 * <li>common functions abs, sign, min, max, clamp, and mix supporting arguments of 64-bit integer types.</li>
 * </ul>
 * This extension is designed to be a functional superset of the 64-bit integer support introduced by NV_gpu_shader5 and to be source code compatible with
 * that, thus the new procedures, functions, and tokens are identical to those found in that extension.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0} and GLSL 4.00.</p>
 */
public final class AMDGPUShaderInt64 {

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

	/** Function address. */
	@JavadocExclude
	public final long
		Uniform1i64NV,
		Uniform2i64NV,
		Uniform3i64NV,
		Uniform4i64NV,
		Uniform1i64vNV,
		Uniform2i64vNV,
		Uniform3i64vNV,
		Uniform4i64vNV,
		Uniform1ui64NV,
		Uniform2ui64NV,
		Uniform3ui64NV,
		Uniform4ui64NV,
		Uniform1ui64vNV,
		Uniform2ui64vNV,
		Uniform3ui64vNV,
		Uniform4ui64vNV,
		GetUniformi64vNV,
		GetUniformui64vNV,
		ProgramUniform1i64NV,
		ProgramUniform2i64NV,
		ProgramUniform3i64NV,
		ProgramUniform4i64NV,
		ProgramUniform1i64vNV,
		ProgramUniform2i64vNV,
		ProgramUniform3i64vNV,
		ProgramUniform4i64vNV,
		ProgramUniform1ui64NV,
		ProgramUniform2ui64NV,
		ProgramUniform3ui64NV,
		ProgramUniform4ui64NV,
		ProgramUniform1ui64vNV,
		ProgramUniform2ui64vNV,
		ProgramUniform3ui64vNV,
		ProgramUniform4ui64vNV;

	@JavadocExclude
	public AMDGPUShaderInt64(FunctionProvider provider) {
		Uniform1i64NV = provider.getFunctionAddress("glUniform1i64NV");
		Uniform2i64NV = provider.getFunctionAddress("glUniform2i64NV");
		Uniform3i64NV = provider.getFunctionAddress("glUniform3i64NV");
		Uniform4i64NV = provider.getFunctionAddress("glUniform4i64NV");
		Uniform1i64vNV = provider.getFunctionAddress("glUniform1i64vNV");
		Uniform2i64vNV = provider.getFunctionAddress("glUniform2i64vNV");
		Uniform3i64vNV = provider.getFunctionAddress("glUniform3i64vNV");
		Uniform4i64vNV = provider.getFunctionAddress("glUniform4i64vNV");
		Uniform1ui64NV = provider.getFunctionAddress("glUniform1ui64NV");
		Uniform2ui64NV = provider.getFunctionAddress("glUniform2ui64NV");
		Uniform3ui64NV = provider.getFunctionAddress("glUniform3ui64NV");
		Uniform4ui64NV = provider.getFunctionAddress("glUniform4ui64NV");
		Uniform1ui64vNV = provider.getFunctionAddress("glUniform1ui64vNV");
		Uniform2ui64vNV = provider.getFunctionAddress("glUniform2ui64vNV");
		Uniform3ui64vNV = provider.getFunctionAddress("glUniform3ui64vNV");
		Uniform4ui64vNV = provider.getFunctionAddress("glUniform4ui64vNV");
		GetUniformi64vNV = provider.getFunctionAddress("glGetUniformi64vNV");
		GetUniformui64vNV = provider.getFunctionAddress("glGetUniformui64vNV");
		ProgramUniform1i64NV = provider.getFunctionAddress("glProgramUniform1i64NV");
		ProgramUniform2i64NV = provider.getFunctionAddress("glProgramUniform2i64NV");
		ProgramUniform3i64NV = provider.getFunctionAddress("glProgramUniform3i64NV");
		ProgramUniform4i64NV = provider.getFunctionAddress("glProgramUniform4i64NV");
		ProgramUniform1i64vNV = provider.getFunctionAddress("glProgramUniform1i64vNV");
		ProgramUniform2i64vNV = provider.getFunctionAddress("glProgramUniform2i64vNV");
		ProgramUniform3i64vNV = provider.getFunctionAddress("glProgramUniform3i64vNV");
		ProgramUniform4i64vNV = provider.getFunctionAddress("glProgramUniform4i64vNV");
		ProgramUniform1ui64NV = provider.getFunctionAddress("glProgramUniform1ui64NV");
		ProgramUniform2ui64NV = provider.getFunctionAddress("glProgramUniform2ui64NV");
		ProgramUniform3ui64NV = provider.getFunctionAddress("glProgramUniform3ui64NV");
		ProgramUniform4ui64NV = provider.getFunctionAddress("glProgramUniform4ui64NV");
		ProgramUniform1ui64vNV = provider.getFunctionAddress("glProgramUniform1ui64vNV");
		ProgramUniform2ui64vNV = provider.getFunctionAddress("glProgramUniform2ui64vNV");
		ProgramUniform3ui64vNV = provider.getFunctionAddress("glProgramUniform3ui64vNV");
		ProgramUniform4ui64vNV = provider.getFunctionAddress("glProgramUniform4ui64vNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link AMDGPUShaderInt64} instance for the current context. */
	public static AMDGPUShaderInt64 getInstance() {
		return checkFunctionality(GL.getCapabilities().__AMDGPUShaderInt64);
	}

	static AMDGPUShaderInt64 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_AMD_gpu_shader_int64") ) return null;

		AMDGPUShaderInt64 funcs = new AMDGPUShaderInt64(provider);

		boolean supported = checkFunctions(
			funcs.Uniform1i64NV, funcs.Uniform2i64NV, funcs.Uniform3i64NV, funcs.Uniform4i64NV, funcs.Uniform1i64vNV, funcs.Uniform2i64vNV, 
			funcs.Uniform3i64vNV, funcs.Uniform4i64vNV, funcs.Uniform1ui64NV, funcs.Uniform2ui64NV, funcs.Uniform3ui64NV, funcs.Uniform4ui64NV, 
			funcs.Uniform1ui64vNV, funcs.Uniform2ui64vNV, funcs.Uniform3ui64vNV, funcs.Uniform4ui64vNV, funcs.GetUniformi64vNV, funcs.GetUniformui64vNV, 
			funcs.ProgramUniform1i64NV, funcs.ProgramUniform2i64NV, funcs.ProgramUniform3i64NV, funcs.ProgramUniform4i64NV, funcs.ProgramUniform1i64vNV, 
			funcs.ProgramUniform2i64vNV, funcs.ProgramUniform3i64vNV, funcs.ProgramUniform4i64vNV, funcs.ProgramUniform1ui64NV, funcs.ProgramUniform2ui64NV, 
			funcs.ProgramUniform3ui64NV, funcs.ProgramUniform4ui64NV, funcs.ProgramUniform1ui64vNV, funcs.ProgramUniform2ui64vNV, funcs.ProgramUniform3ui64vNV, 
			funcs.ProgramUniform4ui64vNV
		);

		return GL.checkExtension("GL_AMD_gpu_shader_int64", funcs, supported);
	}

	// --- [ glUniform1i64NV ] ---

	/**
	 * 
	 *
	 * @param location 
	 * @param x        
	 */
	public static void glUniform1i64NV(int location, long x) {
		long __functionAddress = getInstance().Uniform1i64NV;
		NVGPUShader5.nglUniform1i64NV(location, x, __functionAddress);
	}

	// --- [ glUniform2i64NV ] ---

	/**
	 * 
	 *
	 * @param location 
	 * @param x        
	 * @param y        
	 */
	public static void glUniform2i64NV(int location, long x, long y) {
		long __functionAddress = getInstance().Uniform2i64NV;
		NVGPUShader5.nglUniform2i64NV(location, x, y, __functionAddress);
	}

	// --- [ glUniform3i64NV ] ---

	/**
	 * 
	 *
	 * @param location 
	 * @param x        
	 * @param y        
	 * @param z        
	 */
	public static void glUniform3i64NV(int location, long x, long y, long z) {
		long __functionAddress = getInstance().Uniform3i64NV;
		NVGPUShader5.nglUniform3i64NV(location, x, y, z, __functionAddress);
	}

	// --- [ glUniform4i64NV ] ---

	/**
	 * 
	 *
	 * @param location 
	 * @param x        
	 * @param y        
	 * @param z        
	 * @param w        
	 */
	public static void glUniform4i64NV(int location, long x, long y, long z, long w) {
		long __functionAddress = getInstance().Uniform4i64NV;
		NVGPUShader5.nglUniform4i64NV(location, x, y, z, w, __functionAddress);
	}

	// --- [ glUniform1i64vNV ] ---

	/** Unsafe version of {@link #glUniform1i64vNV Uniform1i64vNV} */
	@JavadocExclude
	public static void nglUniform1i64vNV(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1i64vNV;
		NVGPUShader5.nglUniform1i64vNV(location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glUniform1i64vNV(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglUniform1i64vNV(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1i64vNV Uniform1i64vNV} */
	public static void glUniform1i64vNV(int location, LongBuffer value) {
		nglUniform1i64vNV(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2i64vNV ] ---

	/** Unsafe version of {@link #glUniform2i64vNV Uniform2i64vNV} */
	@JavadocExclude
	public static void nglUniform2i64vNV(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2i64vNV;
		NVGPUShader5.nglUniform2i64vNV(location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glUniform2i64vNV(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglUniform2i64vNV(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2i64vNV Uniform2i64vNV} */
	public static void glUniform2i64vNV(int location, LongBuffer value) {
		nglUniform2i64vNV(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3i64vNV ] ---

	/** Unsafe version of {@link #glUniform3i64vNV Uniform3i64vNV} */
	@JavadocExclude
	public static void nglUniform3i64vNV(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3i64vNV;
		NVGPUShader5.nglUniform3i64vNV(location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glUniform3i64vNV(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 3);
		nglUniform3i64vNV(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3i64vNV Uniform3i64vNV} */
	public static void glUniform3i64vNV(int location, LongBuffer value) {
		nglUniform3i64vNV(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4i64vNV ] ---

	/** Unsafe version of {@link #glUniform4i64vNV Uniform4i64vNV} */
	@JavadocExclude
	public static void nglUniform4i64vNV(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4i64vNV;
		NVGPUShader5.nglUniform4i64vNV(location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glUniform4i64vNV(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglUniform4i64vNV(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4i64vNV Uniform4i64vNV} */
	public static void glUniform4i64vNV(int location, LongBuffer value) {
		nglUniform4i64vNV(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniform1ui64NV ] ---

	/**
	 * 
	 *
	 * @param location 
	 * @param x        
	 */
	public static void glUniform1ui64NV(int location, long x) {
		long __functionAddress = getInstance().Uniform1ui64NV;
		NVGPUShader5.nglUniform1ui64NV(location, x, __functionAddress);
	}

	// --- [ glUniform2ui64NV ] ---

	/**
	 * 
	 *
	 * @param location 
	 * @param x        
	 * @param y        
	 */
	public static void glUniform2ui64NV(int location, long x, long y) {
		long __functionAddress = getInstance().Uniform2ui64NV;
		NVGPUShader5.nglUniform2ui64NV(location, x, y, __functionAddress);
	}

	// --- [ glUniform3ui64NV ] ---

	/**
	 * 
	 *
	 * @param location 
	 * @param x        
	 * @param y        
	 * @param z        
	 */
	public static void glUniform3ui64NV(int location, long x, long y, long z) {
		long __functionAddress = getInstance().Uniform3ui64NV;
		NVGPUShader5.nglUniform3ui64NV(location, x, y, z, __functionAddress);
	}

	// --- [ glUniform4ui64NV ] ---

	/**
	 * 
	 *
	 * @param location 
	 * @param x        
	 * @param y        
	 * @param z        
	 * @param w        
	 */
	public static void glUniform4ui64NV(int location, long x, long y, long z, long w) {
		long __functionAddress = getInstance().Uniform4ui64NV;
		NVGPUShader5.nglUniform4ui64NV(location, x, y, z, w, __functionAddress);
	}

	// --- [ glUniform1ui64vNV ] ---

	/** Unsafe version of {@link #glUniform1ui64vNV Uniform1ui64vNV} */
	@JavadocExclude
	public static void nglUniform1ui64vNV(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1ui64vNV;
		NVGPUShader5.nglUniform1ui64vNV(location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glUniform1ui64vNV(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglUniform1ui64vNV(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1ui64vNV Uniform1ui64vNV} */
	public static void glUniform1ui64vNV(int location, LongBuffer value) {
		nglUniform1ui64vNV(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2ui64vNV ] ---

	/** Unsafe version of {@link #glUniform2ui64vNV Uniform2ui64vNV} */
	@JavadocExclude
	public static void nglUniform2ui64vNV(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2ui64vNV;
		NVGPUShader5.nglUniform2ui64vNV(location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glUniform2ui64vNV(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglUniform2ui64vNV(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2ui64vNV Uniform2ui64vNV} */
	public static void glUniform2ui64vNV(int location, LongBuffer value) {
		nglUniform2ui64vNV(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3ui64vNV ] ---

	/** Unsafe version of {@link #glUniform3ui64vNV Uniform3ui64vNV} */
	@JavadocExclude
	public static void nglUniform3ui64vNV(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3ui64vNV;
		NVGPUShader5.nglUniform3ui64vNV(location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glUniform3ui64vNV(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 3);
		nglUniform3ui64vNV(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3ui64vNV Uniform3ui64vNV} */
	public static void glUniform3ui64vNV(int location, LongBuffer value) {
		nglUniform3ui64vNV(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4ui64vNV ] ---

	/** Unsafe version of {@link #glUniform4ui64vNV Uniform4ui64vNV} */
	@JavadocExclude
	public static void nglUniform4ui64vNV(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4ui64vNV;
		NVGPUShader5.nglUniform4ui64vNV(location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glUniform4ui64vNV(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglUniform4ui64vNV(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4ui64vNV Uniform4ui64vNV} */
	public static void glUniform4ui64vNV(int location, LongBuffer value) {
		nglUniform4ui64vNV(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glGetUniformi64vNV ] ---

	/** Unsafe version of {@link #glGetUniformi64vNV GetUniformi64vNV} */
	@JavadocExclude
	public static void nglGetUniformi64vNV(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformi64vNV;
		NVGPUShader5.nglGetUniformi64vNV(program, location, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param params   
	 */
	public static void glGetUniformi64vNV(int program, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetUniformi64vNV(program, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformi64vNV GetUniformi64vNV} */
	public static void glGetUniformi64vNV(int program, int location, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformi64vNV(program, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformi64vNV GetUniformi64vNV} */
	public static long glGetUniformi64NV(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetUniformi64vNV(program, location, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetUniformui64vNV ] ---

	/** Unsafe version of {@link #glGetUniformui64vNV GetUniformui64vNV} */
	@JavadocExclude
	public static void nglGetUniformui64vNV(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformui64vNV;
		NVGPUShader5.nglGetUniformui64vNV(program, location, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param params   
	 */
	public static void glGetUniformui64vNV(int program, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetUniformui64vNV(program, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformui64vNV GetUniformui64vNV} */
	public static void glGetUniformui64vNV(int program, int location, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformui64vNV(program, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformui64vNV GetUniformui64vNV} */
	public static long glGetUniformui64NV(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetUniformui64vNV(program, location, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glProgramUniform1i64NV ] ---

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param x        
	 */
	public static void glProgramUniform1i64NV(int program, int location, long x) {
		long __functionAddress = getInstance().ProgramUniform1i64NV;
		NVGPUShader5.nglProgramUniform1i64NV(program, location, x, __functionAddress);
	}

	// --- [ glProgramUniform2i64NV ] ---

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param x        
	 * @param y        
	 */
	public static void glProgramUniform2i64NV(int program, int location, long x, long y) {
		long __functionAddress = getInstance().ProgramUniform2i64NV;
		NVGPUShader5.nglProgramUniform2i64NV(program, location, x, y, __functionAddress);
	}

	// --- [ glProgramUniform3i64NV ] ---

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param x        
	 * @param y        
	 * @param z        
	 */
	public static void glProgramUniform3i64NV(int program, int location, long x, long y, long z) {
		long __functionAddress = getInstance().ProgramUniform3i64NV;
		NVGPUShader5.nglProgramUniform3i64NV(program, location, x, y, z, __functionAddress);
	}

	// --- [ glProgramUniform4i64NV ] ---

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param x        
	 * @param y        
	 * @param z        
	 * @param w        
	 */
	public static void glProgramUniform4i64NV(int program, int location, long x, long y, long z, long w) {
		long __functionAddress = getInstance().ProgramUniform4i64NV;
		NVGPUShader5.nglProgramUniform4i64NV(program, location, x, y, z, w, __functionAddress);
	}

	// --- [ glProgramUniform1i64vNV ] ---

	/** Unsafe version of {@link #glProgramUniform1i64vNV ProgramUniform1i64vNV} */
	@JavadocExclude
	public static void nglProgramUniform1i64vNV(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1i64vNV;
		NVGPUShader5.nglProgramUniform1i64vNV(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glProgramUniform1i64vNV(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglProgramUniform1i64vNV(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1i64vNV ProgramUniform1i64vNV} */
	public static void glProgramUniform1i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform1i64vNV(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2i64vNV ] ---

	/** Unsafe version of {@link #glProgramUniform2i64vNV ProgramUniform2i64vNV} */
	@JavadocExclude
	public static void nglProgramUniform2i64vNV(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2i64vNV;
		NVGPUShader5.nglProgramUniform2i64vNV(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glProgramUniform2i64vNV(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglProgramUniform2i64vNV(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2i64vNV ProgramUniform2i64vNV} */
	public static void glProgramUniform2i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform2i64vNV(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3i64vNV ] ---

	/** Unsafe version of {@link #glProgramUniform3i64vNV ProgramUniform3i64vNV} */
	@JavadocExclude
	public static void nglProgramUniform3i64vNV(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3i64vNV;
		NVGPUShader5.nglProgramUniform3i64vNV(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glProgramUniform3i64vNV(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 3);
		nglProgramUniform3i64vNV(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3i64vNV ProgramUniform3i64vNV} */
	public static void glProgramUniform3i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform3i64vNV(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4i64vNV ] ---

	/** Unsafe version of {@link #glProgramUniform4i64vNV ProgramUniform4i64vNV} */
	@JavadocExclude
	public static void nglProgramUniform4i64vNV(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4i64vNV;
		NVGPUShader5.nglProgramUniform4i64vNV(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glProgramUniform4i64vNV(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglProgramUniform4i64vNV(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4i64vNV ProgramUniform4i64vNV} */
	public static void glProgramUniform4i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform4i64vNV(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1ui64NV ] ---

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param x        
	 */
	public static void glProgramUniform1ui64NV(int program, int location, long x) {
		long __functionAddress = getInstance().ProgramUniform1ui64NV;
		NVGPUShader5.nglProgramUniform1ui64NV(program, location, x, __functionAddress);
	}

	// --- [ glProgramUniform2ui64NV ] ---

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param x        
	 * @param y        
	 */
	public static void glProgramUniform2ui64NV(int program, int location, long x, long y) {
		long __functionAddress = getInstance().ProgramUniform2ui64NV;
		NVGPUShader5.nglProgramUniform2ui64NV(program, location, x, y, __functionAddress);
	}

	// --- [ glProgramUniform3ui64NV ] ---

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param x        
	 * @param y        
	 * @param z        
	 */
	public static void glProgramUniform3ui64NV(int program, int location, long x, long y, long z) {
		long __functionAddress = getInstance().ProgramUniform3ui64NV;
		NVGPUShader5.nglProgramUniform3ui64NV(program, location, x, y, z, __functionAddress);
	}

	// --- [ glProgramUniform4ui64NV ] ---

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param x        
	 * @param y        
	 * @param z        
	 * @param w        
	 */
	public static void glProgramUniform4ui64NV(int program, int location, long x, long y, long z, long w) {
		long __functionAddress = getInstance().ProgramUniform4ui64NV;
		NVGPUShader5.nglProgramUniform4ui64NV(program, location, x, y, z, w, __functionAddress);
	}

	// --- [ glProgramUniform1ui64vNV ] ---

	/** Unsafe version of {@link #glProgramUniform1ui64vNV ProgramUniform1ui64vNV} */
	@JavadocExclude
	public static void nglProgramUniform1ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1ui64vNV;
		NVGPUShader5.nglProgramUniform1ui64vNV(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glProgramUniform1ui64vNV(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglProgramUniform1ui64vNV(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1ui64vNV ProgramUniform1ui64vNV} */
	public static void glProgramUniform1ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform1ui64vNV(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2ui64vNV ] ---

	/** Unsafe version of {@link #glProgramUniform2ui64vNV ProgramUniform2ui64vNV} */
	@JavadocExclude
	public static void nglProgramUniform2ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2ui64vNV;
		NVGPUShader5.nglProgramUniform2ui64vNV(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glProgramUniform2ui64vNV(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 3);
		nglProgramUniform2ui64vNV(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2ui64vNV ProgramUniform2ui64vNV} */
	public static void glProgramUniform2ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform2ui64vNV(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3ui64vNV ] ---

	/** Unsafe version of {@link #glProgramUniform3ui64vNV ProgramUniform3ui64vNV} */
	@JavadocExclude
	public static void nglProgramUniform3ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3ui64vNV;
		NVGPUShader5.nglProgramUniform3ui64vNV(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glProgramUniform3ui64vNV(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 3);
		nglProgramUniform3ui64vNV(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3ui64vNV ProgramUniform3ui64vNV} */
	public static void glProgramUniform3ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform3ui64vNV(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4ui64vNV ] ---

	/** Unsafe version of {@link #glProgramUniform4ui64vNV ProgramUniform4ui64vNV} */
	@JavadocExclude
	public static void nglProgramUniform4ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4ui64vNV;
		NVGPUShader5.nglProgramUniform4ui64vNV(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glProgramUniform4ui64vNV(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 3);
		nglProgramUniform4ui64vNV(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4ui64vNV ProgramUniform4ui64vNV} */
	public static void glProgramUniform4ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform4ui64vNV(program, location, value.remaining() >> 2, memAddress(value));
	}

}