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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/vertex_attrib_integer_64bit.txt">NV_vertex_attrib_integer_64bit</a> extension.
 * 
 * <p>This extension provides support for specifying vertex attributes with 64-bit integer components, analagous to the 64-bit floating point support added
 * in EXT_vertex_attrib_64bit.</p>
 * 
 * <p>Additionally, it provides the VertexAttribLFormatNV entry point to specify bindless vertex attribute arrays with 64-bit integer or floating-point
 * components in conjunction with the NV_vertex_buffer_unified_memory extension.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}, GLSL 1.30, {@link NVGPUShader5 NV_gpu_shader5} or equivalent functionality and {@link EXTVertexAttrib64bit EXT_vertex_attrib_64bit}.</p>
 */
public final class NVVertexAttribInteger64bit {

	/** Accepted by the {@code type} parameter of VertexAttribLPointerEXT, VertexArrayVertexAttribLOffsetEXT, and VertexAttribLFormatNV. */
	public static final int
		GL_INT64_NV          = 0x140E,
		GL_UNSIGNED_INT64_NV = 0x140F;

	/** Function address. */
	@JavadocExclude
	public final long
		VertexAttribL1i64NV,
		VertexAttribL2i64NV,
		VertexAttribL3i64NV,
		VertexAttribL4i64NV,
		VertexAttribL1i64vNV,
		VertexAttribL2i64vNV,
		VertexAttribL3i64vNV,
		VertexAttribL4i64vNV,
		VertexAttribL1ui64NV,
		VertexAttribL2ui64NV,
		VertexAttribL3ui64NV,
		VertexAttribL4ui64NV,
		VertexAttribL1ui64vNV,
		VertexAttribL2ui64vNV,
		VertexAttribL3ui64vNV,
		VertexAttribL4ui64vNV,
		GetVertexAttribLi64vNV,
		GetVertexAttribLui64vNV,
		VertexAttribLFormatNV;

	@JavadocExclude
	public NVVertexAttribInteger64bit(FunctionProvider provider) {
		VertexAttribL1i64NV = provider.getFunctionAddress("glVertexAttribL1i64NV");
		VertexAttribL2i64NV = provider.getFunctionAddress("glVertexAttribL2i64NV");
		VertexAttribL3i64NV = provider.getFunctionAddress("glVertexAttribL3i64NV");
		VertexAttribL4i64NV = provider.getFunctionAddress("glVertexAttribL4i64NV");
		VertexAttribL1i64vNV = provider.getFunctionAddress("glVertexAttribL1i64vNV");
		VertexAttribL2i64vNV = provider.getFunctionAddress("glVertexAttribL2i64vNV");
		VertexAttribL3i64vNV = provider.getFunctionAddress("glVertexAttribL3i64vNV");
		VertexAttribL4i64vNV = provider.getFunctionAddress("glVertexAttribL4i64vNV");
		VertexAttribL1ui64NV = provider.getFunctionAddress("glVertexAttribL1ui64NV");
		VertexAttribL2ui64NV = provider.getFunctionAddress("glVertexAttribL2ui64NV");
		VertexAttribL3ui64NV = provider.getFunctionAddress("glVertexAttribL3ui64NV");
		VertexAttribL4ui64NV = provider.getFunctionAddress("glVertexAttribL4ui64NV");
		VertexAttribL1ui64vNV = provider.getFunctionAddress("glVertexAttribL1ui64vNV");
		VertexAttribL2ui64vNV = provider.getFunctionAddress("glVertexAttribL2ui64vNV");
		VertexAttribL3ui64vNV = provider.getFunctionAddress("glVertexAttribL3ui64vNV");
		VertexAttribL4ui64vNV = provider.getFunctionAddress("glVertexAttribL4ui64vNV");
		GetVertexAttribLi64vNV = provider.getFunctionAddress("glGetVertexAttribLi64vNV");
		GetVertexAttribLui64vNV = provider.getFunctionAddress("glGetVertexAttribLui64vNV");
		VertexAttribLFormatNV = provider.getFunctionAddress("glVertexAttribLFormatNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVVertexAttribInteger64bit} instance for the current context. */
	public static NVVertexAttribInteger64bit getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVVertexAttribInteger64bit);
	}

	static NVVertexAttribInteger64bit create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_vertex_attrib_integer_64bit") ) return null;

		NVVertexAttribInteger64bit funcs = new NVVertexAttribInteger64bit(provider);

		boolean supported = checkFunctions(
			funcs.VertexAttribL1i64NV, funcs.VertexAttribL2i64NV, funcs.VertexAttribL3i64NV, funcs.VertexAttribL4i64NV, funcs.VertexAttribL1i64vNV, 
			funcs.VertexAttribL2i64vNV, funcs.VertexAttribL3i64vNV, funcs.VertexAttribL4i64vNV, funcs.VertexAttribL1ui64NV, funcs.VertexAttribL2ui64NV, 
			funcs.VertexAttribL3ui64NV, funcs.VertexAttribL4ui64NV, funcs.VertexAttribL1ui64vNV, funcs.VertexAttribL2ui64vNV, funcs.VertexAttribL3ui64vNV, 
			funcs.VertexAttribL4ui64vNV, funcs.GetVertexAttribLi64vNV, funcs.GetVertexAttribLui64vNV, 
			ext.contains("GL_NV_vertex_buffer_unified_memory") ? funcs.VertexAttribLFormatNV : -1L
		);

		return GL.checkExtension("GL_NV_vertex_attrib_integer_64bit", funcs, supported);
	}

	// --- [ glVertexAttribL1i64NV ] ---

	public static void glVertexAttribL1i64NV(int index, long x) {
		long __functionAddress = getInstance().VertexAttribL1i64NV;
		callIJV(__functionAddress, index, x);
	}

	// --- [ glVertexAttribL2i64NV ] ---

	public static void glVertexAttribL2i64NV(int index, long x, long y) {
		long __functionAddress = getInstance().VertexAttribL2i64NV;
		callIJJV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttribL3i64NV ] ---

	public static void glVertexAttribL3i64NV(int index, long x, long y, long z) {
		long __functionAddress = getInstance().VertexAttribL3i64NV;
		callIJJJV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttribL4i64NV ] ---

	public static void glVertexAttribL4i64NV(int index, long x, long y, long z, long w) {
		long __functionAddress = getInstance().VertexAttribL4i64NV;
		callIJJJJV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribL1i64vNV ] ---

	/** Unsafe version of {@link #glVertexAttribL1i64vNV VertexAttribL1i64vNV} */
	@JavadocExclude
	public static void nglVertexAttribL1i64vNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL1i64vNV;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL1i64vNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 3);
		nglVertexAttribL1i64vNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL1i64vNV VertexAttribL1i64vNV} */
	public static void glVertexAttribL1i64vNV(int index, LongBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttribL1i64vNV(index, memAddress(v));
	}

	// --- [ glVertexAttribL2i64vNV ] ---

	/** Unsafe version of {@link #glVertexAttribL2i64vNV VertexAttribL2i64vNV} */
	@JavadocExclude
	public static void nglVertexAttribL2i64vNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL2i64vNV;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL2i64vNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 3);
		nglVertexAttribL2i64vNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL2i64vNV VertexAttribL2i64vNV} */
	public static void glVertexAttribL2i64vNV(int index, LongBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttribL2i64vNV(index, memAddress(v));
	}

	// --- [ glVertexAttribL3i64vNV ] ---

	/** Unsafe version of {@link #glVertexAttribL3i64vNV VertexAttribL3i64vNV} */
	@JavadocExclude
	public static void nglVertexAttribL3i64vNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL3i64vNV;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL3i64vNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 3);
		nglVertexAttribL3i64vNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL3i64vNV VertexAttribL3i64vNV} */
	public static void glVertexAttribL3i64vNV(int index, LongBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttribL3i64vNV(index, memAddress(v));
	}

	// --- [ glVertexAttribL4i64vNV ] ---

	/** Unsafe version of {@link #glVertexAttribL4i64vNV VertexAttribL4i64vNV} */
	@JavadocExclude
	public static void nglVertexAttribL4i64vNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL4i64vNV;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL4i64vNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 3);
		nglVertexAttribL4i64vNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL4i64vNV VertexAttribL4i64vNV} */
	public static void glVertexAttribL4i64vNV(int index, LongBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribL4i64vNV(index, memAddress(v));
	}

	// --- [ glVertexAttribL1ui64NV ] ---

	public static void glVertexAttribL1ui64NV(int index, long x) {
		long __functionAddress = getInstance().VertexAttribL1ui64NV;
		callIJV(__functionAddress, index, x);
	}

	// --- [ glVertexAttribL2ui64NV ] ---

	public static void glVertexAttribL2ui64NV(int index, long x, long y) {
		long __functionAddress = getInstance().VertexAttribL2ui64NV;
		callIJJV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttribL3ui64NV ] ---

	public static void glVertexAttribL3ui64NV(int index, long x, long y, long z) {
		long __functionAddress = getInstance().VertexAttribL3ui64NV;
		callIJJJV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttribL4ui64NV ] ---

	public static void glVertexAttribL4ui64NV(int index, long x, long y, long z, long w) {
		long __functionAddress = getInstance().VertexAttribL4ui64NV;
		callIJJJJV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribL1ui64vNV ] ---

	/** Unsafe version of {@link #glVertexAttribL1ui64vNV VertexAttribL1ui64vNV} */
	@JavadocExclude
	public static void nglVertexAttribL1ui64vNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL1ui64vNV;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL1ui64vNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 3);
		nglVertexAttribL1ui64vNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL1ui64vNV VertexAttribL1ui64vNV} */
	public static void glVertexAttribL1ui64vNV(int index, LongBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttribL1ui64vNV(index, memAddress(v));
	}

	// --- [ glVertexAttribL2ui64vNV ] ---

	/** Unsafe version of {@link #glVertexAttribL2ui64vNV VertexAttribL2ui64vNV} */
	@JavadocExclude
	public static void nglVertexAttribL2ui64vNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL2ui64vNV;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL2ui64vNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 3);
		nglVertexAttribL2ui64vNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL2ui64vNV VertexAttribL2ui64vNV} */
	public static void glVertexAttribL2ui64vNV(int index, LongBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttribL2ui64vNV(index, memAddress(v));
	}

	// --- [ glVertexAttribL3ui64vNV ] ---

	/** Unsafe version of {@link #glVertexAttribL3ui64vNV VertexAttribL3ui64vNV} */
	@JavadocExclude
	public static void nglVertexAttribL3ui64vNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL3ui64vNV;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL3ui64vNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 3);
		nglVertexAttribL3ui64vNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL3ui64vNV VertexAttribL3ui64vNV} */
	public static void glVertexAttribL3ui64vNV(int index, LongBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttribL3ui64vNV(index, memAddress(v));
	}

	// --- [ glVertexAttribL4ui64vNV ] ---

	/** Unsafe version of {@link #glVertexAttribL4ui64vNV VertexAttribL4ui64vNV} */
	@JavadocExclude
	public static void nglVertexAttribL4ui64vNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL4ui64vNV;
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL4ui64vNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 3);
		nglVertexAttribL4ui64vNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL4ui64vNV VertexAttribL4ui64vNV} */
	public static void glVertexAttribL4ui64vNV(int index, LongBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribL4ui64vNV(index, memAddress(v));
	}

	// --- [ glGetVertexAttribLi64vNV ] ---

	/** Unsafe version of {@link #glGetVertexAttribLi64vNV GetVertexAttribLi64vNV} */
	@JavadocExclude
	public static void nglGetVertexAttribLi64vNV(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribLi64vNV;
		callIIPV(__functionAddress, index, pname, params);
	}

	public static void glGetVertexAttribLi64vNV(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetVertexAttribLi64vNV(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribLi64vNV GetVertexAttribLi64vNV} */
	public static void glGetVertexAttribLi64vNV(int index, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetVertexAttribLi64vNV(index, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetVertexAttribLi64vNV GetVertexAttribLi64vNV} */
	public static long glGetVertexAttribLi64NV(int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetVertexAttribLi64vNV(index, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetVertexAttribLui64vNV ] ---

	/** Unsafe version of {@link #glGetVertexAttribLui64vNV GetVertexAttribLui64vNV} */
	@JavadocExclude
	public static void nglGetVertexAttribLui64vNV(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribLui64vNV;
		callIIPV(__functionAddress, index, pname, params);
	}

	public static void glGetVertexAttribLui64vNV(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetVertexAttribLui64vNV(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribLui64vNV GetVertexAttribLui64vNV} */
	public static void glGetVertexAttribLui64vNV(int index, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetVertexAttribLui64vNV(index, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetVertexAttribLui64vNV GetVertexAttribLui64vNV} */
	public static long glGetVertexAttribLui64NV(int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetVertexAttribLui64vNV(index, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glVertexAttribLFormatNV ] ---

	public static void glVertexAttribLFormatNV(int index, int size, int type, int stride) {
		long __functionAddress = getInstance().VertexAttribLFormatNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIV(__functionAddress, index, size, type, stride);
	}

}