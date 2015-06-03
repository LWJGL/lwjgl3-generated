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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/shader_buffer_load.txt">NV_shader_buffer_load</a> extension.
 * 
 * <p>At a very coarse level, GL has evolved in a way that allows applications to replace many of the original state machine variables with blocks of
 * user-defined data. For example, the current vertex state has been augmented by vertex buffer objects, fixed-function shading state and parameters have
 * been replaced by shaders/programs and constant buffers, etc. Applications switch between coarse sets of state by binding objects to the context or to
 * other container objects (e.g. vertex array objects) instead of manipulating state variables of the context. In terms of the number of GL commands
 * required to draw an object, modern applications are orders of magnitude more efficient than legacy applications, but this explosion of objects bound to
 * other objects has led to a new bottleneck - pointer chasing and CPU L2 cache misses in the driver, and general L2 cache pollution.</p>
 * 
 * <p>This extension provides a mechanism to read from a flat, 64-bit GPU address space from programs/shaders, to query GPU addresses of buffer objects at the
 * API level, and to bind buffer objects to the context in such a way that they can be accessed via their GPU addresses in any shader stage.</p>
 * 
 * <p>The intent is that applications can avoid re-binding buffer objects or updating constants between each Draw call and instead simply use a VertexAttrib
 * (or TexCoord, or InstanceID, or...) to "point" to the new object's state. In this way, one of the cheapest "state" updates (from the CPU's point of
 * view) can be used to effect a significant state change in the shader similarly to how a pointer change may on the CPU. At the same time, this relieves
 * the limits on how many buffer objects can be accessed at once by shaders, and allows these buffer object accesses to be exposed as C-style pointer
 * dereferences in the shading language.</p>
 * 
 * <p>As a very simple example, imagine packing a group of similar objects' constants into a single buffer object and pointing your program at object
 * &lt;i&gt; by setting <pre><code style="font-family: monospace">
 * glVertexAttribI1iEXT(attrLoc, i);</code></pre> and using a shader as such:
 * <pre><code style="font-family: monospace">
 * struct MyObjectType {
 * 	mat4x4 modelView;
 *     vec4 materialPropertyX;
 *     // etc.
 * };
 * uniform MyObjectType *allObjects;
 * in int objectID; // bound to attrLoc
 * 
 * ...
 * 
 * mat4x4 thisObjectsMatrix = allObjects[objectID].modelView;
 * // do transform, shading, etc.</code></pre>
 * This is beneficial in much the same way that texture arrays allow choosing between similar, but independent, texture maps with a single coordinate
 * identifying which slice of the texture to use. It also resembles instancing, where a lightweight change (incrementing the instance ID) can be used to
 * generate a different and interesting result, but with additional flexibility over instancing because the values are app-controlled and not a single incrementing counter.</p>
 * 
 * <p>Dependent pointer fetches are allowed, so more complex scene graph structures can be built into buffer objects providing significant new flexibility in
 * the use of shaders. Another simple example, showing something you can't do with existing functionality, is to do dependent fetches into many buffer
 * objects:
 * <pre><code style="font-family: monospace">
 * GenBuffers(N, dataBuffers);
 * GenBuffers(1, &pointerBuffer);
 * 
 * GLuint64EXT gpuAddrs[N];
 * for (i = 0; i < N; ++i) {
 *     BindBuffer(target, dataBuffers[i]);
 *     BufferData(target, size[i], myData[i], STATIC_DRAW);
 * 
 *     // get the address of this buffer and make it resident.
 *     GetBufferParameterui64vNV(target, BUFFER_GPU_ADDRESS,
 *                               gpuaddrs[i]);
 *     MakeBufferResidentNV(target, READ_ONLY);
 * }
 * 
 * GLuint64EXT pointerBufferAddr;
 * BindBuffer(target, pointerBuffer);
 * BufferData(target, sizeof(GLuint64EXT)*N, gpuAddrs, STATIC_DRAW);
 * GetBufferParameterui64vNV(target, BUFFER_GPU_ADDRESS,
 *                           &pointerBufferAddr);
 * MakeBufferResidentNV(target, READ_ONLY);
 * 
 * // now in the shader, we can use a double indirection
 * vec4 **ptrToBuffers = pointerBufferAddr;
 * vec4 *ptrToBufferI = ptrToBuffers[i];</code></pre>
 * This allows simultaneous access to more buffers than <a href="http://www.opengl.org/registry/specs/EXT/bindable_uniform.txt">EXT_bindable_uniform</a> (MAX_VERTEX_BINDABLE_UNIFORMS, etc.) and each can be
 * larger than MAX_BINDABLE_UNIFORM_SIZE.</p>
 */
public final class NVShaderBufferLoad {

	/** Accepted by the {@code pname} parameter of GetBufferParameterui64vNV, GetNamedBufferParameterui64vNV. */
	public static final int GL_BUFFER_GPU_ADDRESS_NV = 0x8F1D;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int GL_GPU_ADDRESS_NV = 0x8F34;

	/** Accepted by the {@code value} parameter of GetIntegerui64vNV. */
	public static final int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 0x8F35;

	/** Function address. */
	@JavadocExclude
	public final long
		MakeBufferResidentNV,
		MakeBufferNonResidentNV,
		IsBufferResidentNV,
		MakeNamedBufferResidentNV,
		MakeNamedBufferNonResidentNV,
		IsNamedBufferResidentNV,
		GetBufferParameterui64vNV,
		GetNamedBufferParameterui64vNV,
		GetIntegerui64vNV,
		Uniformui64NV,
		Uniformui64vNV,
		GetUniformui64vNV,
		ProgramUniformui64NV,
		ProgramUniformui64vNV;

	@JavadocExclude
	public NVShaderBufferLoad(FunctionProvider provider) {
		MakeBufferResidentNV = provider.getFunctionAddress("glMakeBufferResidentNV");
		MakeBufferNonResidentNV = provider.getFunctionAddress("glMakeBufferNonResidentNV");
		IsBufferResidentNV = provider.getFunctionAddress("glIsBufferResidentNV");
		MakeNamedBufferResidentNV = provider.getFunctionAddress("glMakeNamedBufferResidentNV");
		MakeNamedBufferNonResidentNV = provider.getFunctionAddress("glMakeNamedBufferNonResidentNV");
		IsNamedBufferResidentNV = provider.getFunctionAddress("glIsNamedBufferResidentNV");
		GetBufferParameterui64vNV = provider.getFunctionAddress("glGetBufferParameterui64vNV");
		GetNamedBufferParameterui64vNV = provider.getFunctionAddress("glGetNamedBufferParameterui64vNV");
		GetIntegerui64vNV = provider.getFunctionAddress("glGetIntegerui64vNV");
		Uniformui64NV = provider.getFunctionAddress("glUniformui64NV");
		Uniformui64vNV = provider.getFunctionAddress("glUniformui64vNV");
		GetUniformui64vNV = provider.getFunctionAddress("glGetUniformui64vNV");
		ProgramUniformui64NV = provider.getFunctionAddress("glProgramUniformui64NV");
		ProgramUniformui64vNV = provider.getFunctionAddress("glProgramUniformui64vNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVShaderBufferLoad} instance for the current context. */
	public static NVShaderBufferLoad getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVShaderBufferLoad);
	}

	static NVShaderBufferLoad create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_shader_buffer_load") ) return null;

		NVShaderBufferLoad funcs = new NVShaderBufferLoad(provider);

		boolean supported = checkFunctions(
			funcs.MakeBufferResidentNV, funcs.MakeBufferNonResidentNV, funcs.IsBufferResidentNV, funcs.MakeNamedBufferResidentNV, 
			funcs.MakeNamedBufferNonResidentNV, funcs.IsNamedBufferResidentNV, funcs.GetBufferParameterui64vNV, funcs.GetNamedBufferParameterui64vNV, 
			funcs.GetIntegerui64vNV, funcs.Uniformui64NV, funcs.Uniformui64vNV, funcs.GetUniformui64vNV, funcs.ProgramUniformui64NV, 
			funcs.ProgramUniformui64vNV
		);

		return GL.checkExtension("GL_NV_shader_buffer_load", funcs, supported);
	}

	// --- [ glMakeBufferResidentNV ] ---

	/** JNI method for {@link #glMakeBufferResidentNV MakeBufferResidentNV} */
	@JavadocExclude
	public static native void nglMakeBufferResidentNV(int target, int access, long __functionAddress);

	/**
	 * 
	 *
	 * @param target 
	 * @param access 
	 */
	public static void glMakeBufferResidentNV(int target, int access) {
		long __functionAddress = getInstance().MakeBufferResidentNV;
		nglMakeBufferResidentNV(target, access, __functionAddress);
	}

	// --- [ glMakeBufferNonResidentNV ] ---

	/** JNI method for {@link #glMakeBufferNonResidentNV MakeBufferNonResidentNV} */
	@JavadocExclude
	public static native void nglMakeBufferNonResidentNV(int target, long __functionAddress);

	/**
	 * 
	 *
	 * @param target 
	 */
	public static void glMakeBufferNonResidentNV(int target) {
		long __functionAddress = getInstance().MakeBufferNonResidentNV;
		nglMakeBufferNonResidentNV(target, __functionAddress);
	}

	// --- [ glIsBufferResidentNV ] ---

	/** JNI method for {@link #glIsBufferResidentNV IsBufferResidentNV} */
	@JavadocExclude
	public static native boolean nglIsBufferResidentNV(int target, long __functionAddress);

	/**
	 * 
	 *
	 * @param target 
	 */
	public static boolean glIsBufferResidentNV(int target) {
		long __functionAddress = getInstance().IsBufferResidentNV;
		return nglIsBufferResidentNV(target, __functionAddress);
	}

	// --- [ glMakeNamedBufferResidentNV ] ---

	/** JNI method for {@link #glMakeNamedBufferResidentNV MakeNamedBufferResidentNV} */
	@JavadocExclude
	public static native void nglMakeNamedBufferResidentNV(int buffer, int access, long __functionAddress);

	/**
	 * 
	 *
	 * @param buffer 
	 * @param access 
	 */
	public static void glMakeNamedBufferResidentNV(int buffer, int access) {
		long __functionAddress = getInstance().MakeNamedBufferResidentNV;
		nglMakeNamedBufferResidentNV(buffer, access, __functionAddress);
	}

	// --- [ glMakeNamedBufferNonResidentNV ] ---

	/** JNI method for {@link #glMakeNamedBufferNonResidentNV MakeNamedBufferNonResidentNV} */
	@JavadocExclude
	public static native void nglMakeNamedBufferNonResidentNV(int buffer, long __functionAddress);

	/**
	 * 
	 *
	 * @param buffer 
	 */
	public static void glMakeNamedBufferNonResidentNV(int buffer) {
		long __functionAddress = getInstance().MakeNamedBufferNonResidentNV;
		nglMakeNamedBufferNonResidentNV(buffer, __functionAddress);
	}

	// --- [ glIsNamedBufferResidentNV ] ---

	/** JNI method for {@link #glIsNamedBufferResidentNV IsNamedBufferResidentNV} */
	@JavadocExclude
	public static native boolean nglIsNamedBufferResidentNV(int buffer, long __functionAddress);

	/**
	 * 
	 *
	 * @param buffer 
	 */
	public static boolean glIsNamedBufferResidentNV(int buffer) {
		long __functionAddress = getInstance().IsNamedBufferResidentNV;
		return nglIsNamedBufferResidentNV(buffer, __functionAddress);
	}

	// --- [ glGetBufferParameterui64vNV ] ---

	/** JNI method for {@link #glGetBufferParameterui64vNV GetBufferParameterui64vNV} */
	@JavadocExclude
	public static native void nglGetBufferParameterui64vNV(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetBufferParameterui64vNV GetBufferParameterui64vNV} */
	@JavadocExclude
	public static void nglGetBufferParameterui64vNV(int target, int pname, long params) {
		long __functionAddress = getInstance().GetBufferParameterui64vNV;
		nglGetBufferParameterui64vNV(target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param pname  
	 * @param params 
	 */
	public static void glGetBufferParameterui64vNV(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetBufferParameterui64vNV(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetBufferParameterui64vNV GetBufferParameterui64vNV} */
	public static void glGetBufferParameterui64vNV(int target, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetBufferParameterui64vNV(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetBufferParameterui64vNV GetBufferParameterui64vNV} */
	public static long glGetBufferParameterui64NV(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetBufferParameterui64vNV(target, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetNamedBufferParameterui64vNV ] ---

	/** JNI method for {@link #glGetNamedBufferParameterui64vNV GetNamedBufferParameterui64vNV} */
	@JavadocExclude
	public static native void nglGetNamedBufferParameterui64vNV(int buffer, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedBufferParameterui64vNV GetNamedBufferParameterui64vNV} */
	@JavadocExclude
	public static void nglGetNamedBufferParameterui64vNV(int buffer, int pname, long params) {
		long __functionAddress = getInstance().GetNamedBufferParameterui64vNV;
		nglGetNamedBufferParameterui64vNV(buffer, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param buffer 
	 * @param pname  
	 * @param params 
	 */
	public static void glGetNamedBufferParameterui64vNV(int buffer, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetNamedBufferParameterui64vNV(buffer, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedBufferParameterui64vNV GetNamedBufferParameterui64vNV} */
	public static void glGetNamedBufferParameterui64vNV(int buffer, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedBufferParameterui64vNV(buffer, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedBufferParameterui64vNV GetNamedBufferParameterui64vNV} */
	public static long glGetNamedBufferParameterui64NV(int buffer, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetNamedBufferParameterui64vNV(buffer, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetIntegerui64vNV ] ---

	/** JNI method for {@link #glGetIntegerui64vNV GetIntegerui64vNV} */
	@JavadocExclude
	public static native void nglGetIntegerui64vNV(int value, long result, long __functionAddress);

	/** Unsafe version of {@link #glGetIntegerui64vNV GetIntegerui64vNV} */
	@JavadocExclude
	public static void nglGetIntegerui64vNV(int value, long result) {
		long __functionAddress = getInstance().GetIntegerui64vNV;
		nglGetIntegerui64vNV(value, result, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param value  
	 * @param result 
	 */
	public static void glGetIntegerui64vNV(int value, ByteBuffer result) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(result, 1 << 3);
		nglGetIntegerui64vNV(value, memAddress(result));
	}

	/** Alternative version of: {@link #glGetIntegerui64vNV GetIntegerui64vNV} */
	public static void glGetIntegerui64vNV(int value, LongBuffer result) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(result, 1);
		nglGetIntegerui64vNV(value, memAddress(result));
	}

	/** Single return value version of: {@link #glGetIntegerui64vNV GetIntegerui64vNV} */
	public static long glGetIntegerui64NV(int value) {
		APIBuffer __buffer = apiBuffer();
		int result = __buffer.longParam();
		nglGetIntegerui64vNV(value, __buffer.address(result));
		return __buffer.longValue(result);
	}

	// --- [ glUniformui64NV ] ---

	/** JNI method for {@link #glUniformui64NV Uniformui64NV} */
	@JavadocExclude
	public static native void nglUniformui64NV(int location, long value, long __functionAddress);

	/**
	 * 
	 *
	 * @param location 
	 * @param value    
	 */
	public static void glUniformui64NV(int location, long value) {
		long __functionAddress = getInstance().Uniformui64NV;
		nglUniformui64NV(location, value, __functionAddress);
	}

	// --- [ glUniformui64vNV ] ---

	/** JNI method for {@link #glUniformui64vNV Uniformui64vNV} */
	@JavadocExclude
	public static native void nglUniformui64vNV(int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glUniformui64vNV Uniformui64vNV} */
	@JavadocExclude
	public static void nglUniformui64vNV(int location, int count, long value) {
		long __functionAddress = getInstance().Uniformui64vNV;
		nglUniformui64vNV(location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glUniformui64vNV(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglUniformui64vNV(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformui64vNV Uniformui64vNV} */
	public static void glUniformui64vNV(int location, LongBuffer value) {
		nglUniformui64vNV(location, value.remaining(), memAddress(value));
	}

	// --- [ glGetUniformui64vNV ] ---

	/** JNI method for {@link #glGetUniformui64vNV GetUniformui64vNV} */
	@JavadocExclude
	public static native void nglGetUniformui64vNV(int program, int location, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetUniformui64vNV GetUniformui64vNV} */
	@JavadocExclude
	public static void nglGetUniformui64vNV(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformui64vNV;
		nglGetUniformui64vNV(program, location, params, __functionAddress);
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

	// --- [ glProgramUniformui64NV ] ---

	/** JNI method for {@link #glProgramUniformui64NV ProgramUniformui64NV} */
	@JavadocExclude
	public static native void nglProgramUniformui64NV(int program, int location, long value, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param value    
	 */
	public static void glProgramUniformui64NV(int program, int location, long value) {
		long __functionAddress = getInstance().ProgramUniformui64NV;
		nglProgramUniformui64NV(program, location, value, __functionAddress);
	}

	// --- [ glProgramUniformui64vNV ] ---

	/** JNI method for {@link #glProgramUniformui64vNV ProgramUniformui64vNV} */
	@JavadocExclude
	public static native void nglProgramUniformui64vNV(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformui64vNV ProgramUniformui64vNV} */
	@JavadocExclude
	public static void nglProgramUniformui64vNV(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniformui64vNV;
		nglProgramUniformui64vNV(program, location, count, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param count    
	 * @param value    
	 */
	public static void glProgramUniformui64vNV(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 3);
		nglProgramUniformui64vNV(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformui64vNV ProgramUniformui64vNV} */
	public static void glProgramUniformui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniformui64vNV(program, location, value.remaining(), memAddress(value));
	}

}