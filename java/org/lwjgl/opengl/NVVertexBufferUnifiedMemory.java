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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/vertex_buffer_unified_memory.txt">NV_vertex_buffer_unified_memory</a> extension.
 * 
 * <p>This extension provides a mechanism to specify vertex attrib and element array locations using GPU addresses.</p>
 * 
 * <p>Binding vertex buffers is one of the most frequent and expensive operations in many GL applications, due to the cost of chasing pointers and binding
 * objects described in the Overview of {@link NVShaderBufferLoad NV_shader_buffer_load}. The intent of this extension is to enable a way for the application to specify
 * vertex attrib state that alleviates the overhead of object binds and driver memory management.</p>
 */
public final class NVVertexBufferUnifiedMemory {

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

	/** Function address. */
	@JavadocExclude
	public final long
		BufferAddressRangeNV,
		VertexFormatNV,
		NormalFormatNV,
		ColorFormatNV,
		IndexFormatNV,
		TexCoordFormatNV,
		EdgeFlagFormatNV,
		SecondaryColorFormatNV,
		FogCoordFormatNV,
		VertexAttribFormatNV,
		VertexAttribIFormatNV,
		GetIntegerui64i_vNV;

	@JavadocExclude
	public NVVertexBufferUnifiedMemory(FunctionProvider provider) {
		BufferAddressRangeNV = provider.getFunctionAddress("glBufferAddressRangeNV");
		VertexFormatNV = provider.getFunctionAddress("glVertexFormatNV");
		NormalFormatNV = provider.getFunctionAddress("glNormalFormatNV");
		ColorFormatNV = provider.getFunctionAddress("glColorFormatNV");
		IndexFormatNV = provider.getFunctionAddress("glIndexFormatNV");
		TexCoordFormatNV = provider.getFunctionAddress("glTexCoordFormatNV");
		EdgeFlagFormatNV = provider.getFunctionAddress("glEdgeFlagFormatNV");
		SecondaryColorFormatNV = provider.getFunctionAddress("glSecondaryColorFormatNV");
		FogCoordFormatNV = provider.getFunctionAddress("glFogCoordFormatNV");
		VertexAttribFormatNV = provider.getFunctionAddress("glVertexAttribFormatNV");
		VertexAttribIFormatNV = provider.getFunctionAddress("glVertexAttribIFormatNV");
		GetIntegerui64i_vNV = provider.getFunctionAddress("glGetIntegerui64i_vNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVVertexBufferUnifiedMemory} instance for the current context. */
	public static NVVertexBufferUnifiedMemory getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVVertexBufferUnifiedMemory);
	}

	static NVVertexBufferUnifiedMemory create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_vertex_buffer_unified_memory") ) return null;

		NVVertexBufferUnifiedMemory funcs = new NVVertexBufferUnifiedMemory(provider);

		boolean supported = checkFunctions(
			funcs.BufferAddressRangeNV, funcs.VertexFormatNV, funcs.NormalFormatNV, funcs.ColorFormatNV, funcs.IndexFormatNV, funcs.TexCoordFormatNV, 
			funcs.EdgeFlagFormatNV, funcs.SecondaryColorFormatNV, funcs.FogCoordFormatNV, funcs.VertexAttribFormatNV, funcs.VertexAttribIFormatNV, 
			funcs.GetIntegerui64i_vNV
		);

		return GL.checkExtension("GL_NV_vertex_buffer_unified_memory", funcs, supported);
	}

	// --- [ glBufferAddressRangeNV ] ---

	public static void glBufferAddressRangeNV(int pname, int index, long address, long length) {
		long __functionAddress = getInstance().BufferAddressRangeNV;
		callIIJPV(__functionAddress, pname, index, address, length);
	}

	// --- [ glVertexFormatNV ] ---

	public static void glVertexFormatNV(int size, int type, int stride) {
		long __functionAddress = getInstance().VertexFormatNV;
		callIIIV(__functionAddress, size, type, stride);
	}

	// --- [ glNormalFormatNV ] ---

	public static void glNormalFormatNV(int type, int stride) {
		long __functionAddress = getInstance().NormalFormatNV;
		callIIV(__functionAddress, type, stride);
	}

	// --- [ glColorFormatNV ] ---

	public static void glColorFormatNV(int size, int type, int stride) {
		long __functionAddress = getInstance().ColorFormatNV;
		callIIIV(__functionAddress, size, type, stride);
	}

	// --- [ glIndexFormatNV ] ---

	public static void glIndexFormatNV(int type, int stride) {
		long __functionAddress = getInstance().IndexFormatNV;
		callIIV(__functionAddress, type, stride);
	}

	// --- [ glTexCoordFormatNV ] ---

	public static void glTexCoordFormatNV(int size, int type, int stride) {
		long __functionAddress = getInstance().TexCoordFormatNV;
		callIIIV(__functionAddress, size, type, stride);
	}

	// --- [ glEdgeFlagFormatNV ] ---

	public static void glEdgeFlagFormatNV(int stride) {
		long __functionAddress = getInstance().EdgeFlagFormatNV;
		callIV(__functionAddress, stride);
	}

	// --- [ glSecondaryColorFormatNV ] ---

	public static void glSecondaryColorFormatNV(int size, int type, int stride) {
		long __functionAddress = getInstance().SecondaryColorFormatNV;
		callIIIV(__functionAddress, size, type, stride);
	}

	// --- [ glFogCoordFormatNV ] ---

	public static void glFogCoordFormatNV(int type, int stride) {
		long __functionAddress = getInstance().FogCoordFormatNV;
		callIIV(__functionAddress, type, stride);
	}

	// --- [ glVertexAttribFormatNV ] ---

	public static void glVertexAttribFormatNV(int index, int size, int type, boolean normalized, int stride) {
		long __functionAddress = getInstance().VertexAttribFormatNV;
		callIIIZIV(__functionAddress, index, size, type, normalized, stride);
	}

	// --- [ glVertexAttribIFormatNV ] ---

	public static void glVertexAttribIFormatNV(int index, int size, int type, int stride) {
		long __functionAddress = getInstance().VertexAttribIFormatNV;
		callIIIIV(__functionAddress, index, size, type, stride);
	}

	// --- [ glGetIntegerui64i_vNV ] ---

	/** Unsafe version of {@link #glGetIntegerui64i_vNV GetIntegerui64i_vNV} */
	@JavadocExclude
	public static void nglGetIntegerui64i_vNV(int value, int index, long result) {
		long __functionAddress = getInstance().GetIntegerui64i_vNV;
		callIIPV(__functionAddress, value, index, result);
	}

	public static void glGetIntegerui64i_vNV(int value, int index, ByteBuffer result) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(result, 1 << 3);
		nglGetIntegerui64i_vNV(value, index, memAddress(result));
	}

	/** Alternative version of: {@link #glGetIntegerui64i_vNV GetIntegerui64i_vNV} */
	public static void glGetIntegerui64i_vNV(int value, int index, LongBuffer result) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(result, 1);
		nglGetIntegerui64i_vNV(value, index, memAddress(result));
	}

	/** Single return value version of: {@link #glGetIntegerui64i_vNV GetIntegerui64i_vNV} */
	public static long glGetIntegerui64iNV(int value, int index) {
		APIBuffer __buffer = apiBuffer();
		int result = __buffer.longParam();
		nglGetIntegerui64i_vNV(value, index, __buffer.address(result));
		return __buffer.longValue(result);
	}

}