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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/vertex_buffer_unified_memory.txt">NV_vertex_buffer_unified_memory</a> extension.
 * 
 * <p>This extension provides a mechanism to specify vertex attrib and element array locations using GPU addresses.</p>
 * 
 * <p>Binding vertex buffers is one of the most frequent and expensive operations in many GL applications, due to the cost of chasing pointers and binding
 * objects described in the Overview of {@link NVShaderBufferLoad NV_shader_buffer_load}. The intent of this extension is to enable a way for the application to specify
 * vertex attrib state that alleviates the overhead of object binds and driver memory management.</p>
 */
public class NVVertexBufferUnifiedMemory {

	/** Accepted by the {@code cap} parameter of DisableClientState, EnableClientState, IsEnabled. */
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV = 0x8F1E,
		GL_ELEMENT_ARRAY_UNIFIED_NV       = 0x8F1F;

	/** Accepted by the {@code pname} parameter of BufferAddressRangeNV and the {@code value} parameter of GetIntegerui64i_vNV. */
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV = 0x8F20,
		GL_TEXTURE_COORD_ARRAY_ADDRESS_NV = 0x8F25;

	/** Accepted by the {@code pname} parameter of BufferAddressRangeNV and the {@code value} parameter of GetIntegerui64vNV. */
	public static final int
		GL_VERTEX_ARRAY_ADDRESS_NV          = 0x8F21,
		GL_NORMAL_ARRAY_ADDRESS_NV          = 0x8F22,
		GL_COLOR_ARRAY_ADDRESS_NV           = 0x8F23,
		GL_INDEX_ARRAY_ADDRESS_NV           = 0x8F24,
		GL_EDGE_FLAG_ARRAY_ADDRESS_NV       = 0x8F26,
		GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV = 0x8F27,
		GL_FOG_COORD_ARRAY_ADDRESS_NV       = 0x8F28,
		GL_ELEMENT_ARRAY_ADDRESS_NV         = 0x8F29;

	/** Accepted by the {@code target} parameter of GetIntegeri_vNV. */
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV = 0x8F2A,
		GL_TEXTURE_COORD_ARRAY_LENGTH_NV = 0x8F2F;

	/** Accepted by the {@code value} parameter of GetIntegerv. */
	public static final int
		GL_VERTEX_ARRAY_LENGTH_NV          = 0x8F2B,
		GL_NORMAL_ARRAY_LENGTH_NV          = 0x8F2C,
		GL_COLOR_ARRAY_LENGTH_NV           = 0x8F2D,
		GL_INDEX_ARRAY_LENGTH_NV           = 0x8F2E,
		GL_EDGE_FLAG_ARRAY_LENGTH_NV       = 0x8F30,
		GL_SECONDARY_COLOR_ARRAY_LENGTH_NV = 0x8F31,
		GL_FOG_COORD_ARRAY_LENGTH_NV       = 0x8F32,
		GL_ELEMENT_ARRAY_LENGTH_NV         = 0x8F33;

	protected NVVertexBufferUnifiedMemory() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glBufferAddressRangeNV, caps.glVertexFormatNV, caps.glNormalFormatNV, caps.glColorFormatNV, caps.glIndexFormatNV, caps.glTexCoordFormatNV, 
			caps.glEdgeFlagFormatNV, caps.glSecondaryColorFormatNV, caps.glFogCoordFormatNV, caps.glVertexAttribFormatNV, caps.glVertexAttribIFormatNV, 
			caps.glGetIntegerui64i_vNV
		);
	}

	// --- [ glBufferAddressRangeNV ] ---

	public static void glBufferAddressRangeNV(int pname, int index, long address, long length) {
		long __functionAddress = GL.getCapabilities().glBufferAddressRangeNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJPV(__functionAddress, pname, index, address, length);
	}

	// --- [ glVertexFormatNV ] ---

	public static void glVertexFormatNV(int size, int type, int stride) {
		long __functionAddress = GL.getCapabilities().glVertexFormatNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, size, type, stride);
	}

	// --- [ glNormalFormatNV ] ---

	public static void glNormalFormatNV(int type, int stride) {
		long __functionAddress = GL.getCapabilities().glNormalFormatNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, stride);
	}

	// --- [ glColorFormatNV ] ---

	public static void glColorFormatNV(int size, int type, int stride) {
		long __functionAddress = GL.getCapabilities().glColorFormatNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, size, type, stride);
	}

	// --- [ glIndexFormatNV ] ---

	public static void glIndexFormatNV(int type, int stride) {
		long __functionAddress = GL.getCapabilities().glIndexFormatNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, stride);
	}

	// --- [ glTexCoordFormatNV ] ---

	public static void glTexCoordFormatNV(int size, int type, int stride) {
		long __functionAddress = GL.getCapabilities().glTexCoordFormatNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, size, type, stride);
	}

	// --- [ glEdgeFlagFormatNV ] ---

	public static void glEdgeFlagFormatNV(int stride) {
		long __functionAddress = GL.getCapabilities().glEdgeFlagFormatNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, stride);
	}

	// --- [ glSecondaryColorFormatNV ] ---

	public static void glSecondaryColorFormatNV(int size, int type, int stride) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorFormatNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, size, type, stride);
	}

	// --- [ glFogCoordFormatNV ] ---

	public static void glFogCoordFormatNV(int type, int stride) {
		long __functionAddress = GL.getCapabilities().glFogCoordFormatNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, stride);
	}

	// --- [ glVertexAttribFormatNV ] ---

	public static void glVertexAttribFormatNV(int index, int size, int type, boolean normalized, int stride) {
		long __functionAddress = GL.getCapabilities().glVertexAttribFormatNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, size, type, normalized, stride);
	}

	// --- [ glVertexAttribIFormatNV ] ---

	public static void glVertexAttribIFormatNV(int index, int size, int type, int stride) {
		long __functionAddress = GL.getCapabilities().glVertexAttribIFormatNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, size, type, stride);
	}

	// --- [ glGetIntegerui64i_vNV ] ---

	public static void nglGetIntegerui64i_vNV(int value, int index, long result) {
		long __functionAddress = GL.getCapabilities().glGetIntegerui64i_vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, value, index, result);
	}

	public static void glGetIntegerui64i_vNV(int value, int index, LongBuffer result) {
		if ( CHECKS )
			checkBuffer(result, 1);
		nglGetIntegerui64i_vNV(value, index, memAddress(result));
	}

	public static long glGetIntegerui64iNV(int value, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer result = stack.callocLong(1);
			nglGetIntegerui64i_vNV(value, index, memAddress(result));
			return result.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGetIntegerui64i_vNV GetIntegerui64i_vNV} */
	public static void glGetIntegerui64i_vNV(int value, int index, long[] result) {
		long __functionAddress = GL.getCapabilities().glGetIntegerui64i_vNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(result, 1);
		}
		callPV(__functionAddress, value, index, result);
	}

}