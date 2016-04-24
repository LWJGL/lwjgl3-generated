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
 * &lt;i&gt; by setting <code>glVertexAttribI1iEXT(attrLoc, i);</code> and using a shader as such:</p>
 * 
 * <pre><code>struct MyObjectType {
    mat4x4 modelView;
    vec4 materialPropertyX;
    // etc.
};
uniform MyObjectType *allObjects;
in int objectID; // bound to attrLoc

...

mat4x4 thisObjectsMatrix = allObjects[objectID].modelView;
// do transform, shading, etc.</code></pre>
 * 
 * <p>This is beneficial in much the same way that texture arrays allow choosing between similar, but independent, texture maps with a single coordinate
 * identifying which slice of the texture to use. It also resembles instancing, where a lightweight change (incrementing the instance ID) can be used to
 * generate a different and interesting result, but with additional flexibility over instancing because the values are app-controlled and not a single incrementing counter.</p>
 * 
 * <p>Dependent pointer fetches are allowed, so more complex scene graph structures can be built into buffer objects providing significant new flexibility in
 * the use of shaders. Another simple example, showing something you can't do with existing functionality, is to do dependent fetches into many buffer
 * objects:</p>
 * 
 * <pre><code>GenBuffers(N, dataBuffers);
GenBuffers(1, &pointerBuffer);

GLuint64EXT gpuAddrs[N];
for (i = 0; i < N; ++i) {
    BindBuffer(target, dataBuffers[i]);
    BufferData(target, size[i], myData[i], STATIC_DRAW);

    // get the address of this buffer and make it resident.
    GetBufferParameterui64vNV(target, BUFFER_GPU_ADDRESS,
                              gpuaddrs[i]);
    MakeBufferResidentNV(target, READ_ONLY);
}

GLuint64EXT pointerBufferAddr;
BindBuffer(target, pointerBuffer);
BufferData(target, sizeof(GLuint64EXT)*N, gpuAddrs, STATIC_DRAW);
GetBufferParameterui64vNV(target, BUFFER_GPU_ADDRESS,
                          &pointerBufferAddr);
MakeBufferResidentNV(target, READ_ONLY);

// now in the shader, we can use a double indirection
vec4 **ptrToBuffers = pointerBufferAddr;
vec4 *ptrToBufferI = ptrToBuffers[i];</code></pre>
 * 
 * <p>This allows simultaneous access to more buffers than <a href="http://www.opengl.org/registry/specs/EXT/bindable_uniform.txt">EXT_bindable_uniform</a> (MAX_VERTEX_BINDABLE_UNIFORMS, etc.) and each can be
 * larger than MAX_BINDABLE_UNIFORM_SIZE.</p>
 */
public class NVShaderBufferLoad {

	/** Accepted by the {@code pname} parameter of GetBufferParameterui64vNV, GetNamedBufferParameterui64vNV. */
	public static final int GL_BUFFER_GPU_ADDRESS_NV = 0x8F1D;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int GL_GPU_ADDRESS_NV = 0x8F34;

	/** Accepted by the {@code value} parameter of GetIntegerui64vNV. */
	public static final int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 0x8F35;

	protected NVShaderBufferLoad() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glMakeBufferResidentNV, caps.glMakeBufferNonResidentNV, caps.glIsBufferResidentNV, caps.glMakeNamedBufferResidentNV, 
			caps.glMakeNamedBufferNonResidentNV, caps.glIsNamedBufferResidentNV, caps.glGetBufferParameterui64vNV, caps.glGetNamedBufferParameterui64vNV, 
			caps.glGetIntegerui64vNV, caps.glUniformui64NV, caps.glUniformui64vNV, caps.glGetUniformui64vNV, caps.glProgramUniformui64NV, 
			caps.glProgramUniformui64vNV
		);
	}

	// --- [ glMakeBufferResidentNV ] ---

	public static void glMakeBufferResidentNV(int target, int access) {
		long __functionAddress = GL.getCapabilities().glMakeBufferResidentNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, access);
	}

	// --- [ glMakeBufferNonResidentNV ] ---

	public static void glMakeBufferNonResidentNV(int target) {
		long __functionAddress = GL.getCapabilities().glMakeBufferNonResidentNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target);
	}

	// --- [ glIsBufferResidentNV ] ---

	public static boolean glIsBufferResidentNV(int target) {
		long __functionAddress = GL.getCapabilities().glIsBufferResidentNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, target);
	}

	// --- [ glMakeNamedBufferResidentNV ] ---

	public static void glMakeNamedBufferResidentNV(int buffer, int access) {
		long __functionAddress = GL.getCapabilities().glMakeNamedBufferResidentNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buffer, access);
	}

	// --- [ glMakeNamedBufferNonResidentNV ] ---

	public static void glMakeNamedBufferNonResidentNV(int buffer) {
		long __functionAddress = GL.getCapabilities().glMakeNamedBufferNonResidentNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buffer);
	}

	// --- [ glIsNamedBufferResidentNV ] ---

	public static boolean glIsNamedBufferResidentNV(int buffer) {
		long __functionAddress = GL.getCapabilities().glIsNamedBufferResidentNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, buffer);
	}

	// --- [ glGetBufferParameterui64vNV ] ---

	public static void nglGetBufferParameterui64vNV(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetBufferParameterui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glGetBufferParameterui64vNV(int target, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetBufferParameterui64vNV(target, pname, memAddress(params));
	}

	public static long glGetBufferParameterui64NV(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetBufferParameterui64vNV(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetNamedBufferParameterui64vNV ] ---

	public static void nglGetNamedBufferParameterui64vNV(int buffer, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferParameterui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, pname, params);
	}

	public static void glGetNamedBufferParameterui64vNV(int buffer, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetNamedBufferParameterui64vNV(buffer, pname, memAddress(params));
	}

	public static long glGetNamedBufferParameterui64NV(int buffer, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetNamedBufferParameterui64vNV(buffer, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetIntegerui64vNV ] ---

	public static void nglGetIntegerui64vNV(int value, long result) {
		long __functionAddress = GL.getCapabilities().glGetIntegerui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, value, result);
	}

	public static void glGetIntegerui64vNV(int value, LongBuffer result) {
		if ( CHECKS )
			checkBuffer(result, 1);
		nglGetIntegerui64vNV(value, memAddress(result));
	}

	public static long glGetIntegerui64NV(int value) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer result = stack.callocLong(1);
			nglGetIntegerui64vNV(value, memAddress(result));
			return result.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glUniformui64NV ] ---

	public static void glUniformui64NV(int location, long value) {
		long __functionAddress = GL.getCapabilities().glUniformui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, location, value);
	}

	// --- [ glUniformui64vNV ] ---

	public static void nglUniformui64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniformui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniformui64vNV(int location, LongBuffer value) {
		nglUniformui64vNV(location, value.remaining(), memAddress(value));
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

	// --- [ glProgramUniformui64NV ] ---

	public static void glProgramUniformui64NV(int program, int location, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniformui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, program, location, value);
	}

	// --- [ glProgramUniformui64vNV ] ---

	public static void nglProgramUniformui64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniformui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniformui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniformui64vNV(program, location, value.remaining(), memAddress(value));
	}

	/** Array version of: {@link #glGetBufferParameterui64vNV GetBufferParameterui64vNV} */
	public static void glGetBufferParameterui64vNV(int target, int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetBufferParameterui64vNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetNamedBufferParameterui64vNV GetNamedBufferParameterui64vNV} */
	public static void glGetNamedBufferParameterui64vNV(int buffer, int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferParameterui64vNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, buffer, pname, params);
	}

	/** Array version of: {@link #glGetIntegerui64vNV GetIntegerui64vNV} */
	public static void glGetIntegerui64vNV(int value, long[] result) {
		long __functionAddress = GL.getCapabilities().glGetIntegerui64vNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(result, 1);
		}
		callPV(__functionAddress, value, result);
	}

	/** Array version of: {@link #glUniformui64vNV Uniformui64vNV} */
	public static void glUniformui64vNV(int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glUniformui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length, value);
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

	/** Array version of: {@link #glProgramUniformui64vNV ProgramUniformui64vNV} */
	public static void glProgramUniformui64vNV(int program, int location, long[] value) {
		long __functionAddress = GL.getCapabilities().glProgramUniformui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

}