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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/half_float.txt">NV_half_float</a> extension.
 * 
 * <p>This extension introduces a new storage format and data type for half-precision (16-bit) floating-point quantities. The floating-point format is very
 * similar to the IEEE single-precision floating-point standard, except that it has only 5 exponent bits and 10 mantissa bits. Half-precision floats are
 * smaller than full precision floats and provide a larger dynamic range than similarly-sized normalized scalar data types.</p>
 * 
 * <p>This extension allows applications to use half-precision floating point data when specifying vertices or pixel data. It adds new commands to specify
 * vertex attributes using the new data type, and extends the existing vertex array and image specification commands to accept the new data type.</p>
 * 
 * <p>This storage format is also used to represent 16-bit components in the floating-point frame buffers, as defined in the NV_float_buffer extension.</p>
 */
public final class NVHalfFloat {

	/**
	 * Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, TexCoordPointer, FogCoordPointerEXT, SecondaryColorPointerEXT,
	 * VertexWeightPointerEXT, VertexAttribPointerNV, DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D,
	 * and GetTexImage.
	 */
	public static final int GL_HALF_FLOAT_NV = 0x140B;

	/** Function address. */
	@JavadocExclude
	public final long
		Vertex2hNV,
		Vertex2hvNV,
		Vertex3hNV,
		Vertex3hvNV,
		Vertex4hNV,
		Vertex4hvNV,
		Normal3hNV,
		Normal3hvNV,
		Color3hNV,
		Color3hvNV,
		Color4hNV,
		Color4hvNV,
		TexCoord1hNV,
		TexCoord1hvNV,
		TexCoord2hNV,
		TexCoord2hvNV,
		TexCoord3hNV,
		TexCoord3hvNV,
		TexCoord4hNV,
		TexCoord4hvNV,
		MultiTexCoord1hNV,
		MultiTexCoord1hvNV,
		MultiTexCoord2hNV,
		MultiTexCoord2hvNV,
		MultiTexCoord3hNV,
		MultiTexCoord3hvNV,
		MultiTexCoord4hNV,
		MultiTexCoord4hvNV,
		FogCoordhNV,
		FogCoordhvNV,
		SecondaryColor3hNV,
		SecondaryColor3hvNV,
		VertexWeighthNV,
		VertexWeighthvNV,
		VertexAttrib1hNV,
		VertexAttrib1hvNV,
		VertexAttrib2hNV,
		VertexAttrib2hvNV,
		VertexAttrib3hNV,
		VertexAttrib3hvNV,
		VertexAttrib4hNV,
		VertexAttrib4hvNV,
		VertexAttribs1hvNV,
		VertexAttribs2hvNV,
		VertexAttribs3hvNV,
		VertexAttribs4hvNV;

	@JavadocExclude
	public NVHalfFloat(FunctionProvider provider) {
		Vertex2hNV = provider.getFunctionAddress("glVertex2hNV");
		Vertex2hvNV = provider.getFunctionAddress("glVertex2hvNV");
		Vertex3hNV = provider.getFunctionAddress("glVertex3hNV");
		Vertex3hvNV = provider.getFunctionAddress("glVertex3hvNV");
		Vertex4hNV = provider.getFunctionAddress("glVertex4hNV");
		Vertex4hvNV = provider.getFunctionAddress("glVertex4hvNV");
		Normal3hNV = provider.getFunctionAddress("glNormal3hNV");
		Normal3hvNV = provider.getFunctionAddress("glNormal3hvNV");
		Color3hNV = provider.getFunctionAddress("glColor3hNV");
		Color3hvNV = provider.getFunctionAddress("glColor3hvNV");
		Color4hNV = provider.getFunctionAddress("glColor4hNV");
		Color4hvNV = provider.getFunctionAddress("glColor4hvNV");
		TexCoord1hNV = provider.getFunctionAddress("glTexCoord1hNV");
		TexCoord1hvNV = provider.getFunctionAddress("glTexCoord1hvNV");
		TexCoord2hNV = provider.getFunctionAddress("glTexCoord2hNV");
		TexCoord2hvNV = provider.getFunctionAddress("glTexCoord2hvNV");
		TexCoord3hNV = provider.getFunctionAddress("glTexCoord3hNV");
		TexCoord3hvNV = provider.getFunctionAddress("glTexCoord3hvNV");
		TexCoord4hNV = provider.getFunctionAddress("glTexCoord4hNV");
		TexCoord4hvNV = provider.getFunctionAddress("glTexCoord4hvNV");
		MultiTexCoord1hNV = provider.getFunctionAddress("glMultiTexCoord1hNV");
		MultiTexCoord1hvNV = provider.getFunctionAddress("glMultiTexCoord1hvNV");
		MultiTexCoord2hNV = provider.getFunctionAddress("glMultiTexCoord2hNV");
		MultiTexCoord2hvNV = provider.getFunctionAddress("glMultiTexCoord2hvNV");
		MultiTexCoord3hNV = provider.getFunctionAddress("glMultiTexCoord3hNV");
		MultiTexCoord3hvNV = provider.getFunctionAddress("glMultiTexCoord3hvNV");
		MultiTexCoord4hNV = provider.getFunctionAddress("glMultiTexCoord4hNV");
		MultiTexCoord4hvNV = provider.getFunctionAddress("glMultiTexCoord4hvNV");
		FogCoordhNV = provider.getFunctionAddress("glFogCoordhNV");
		FogCoordhvNV = provider.getFunctionAddress("glFogCoordhvNV");
		SecondaryColor3hNV = provider.getFunctionAddress("glSecondaryColor3hNV");
		SecondaryColor3hvNV = provider.getFunctionAddress("glSecondaryColor3hvNV");
		VertexWeighthNV = provider.getFunctionAddress("glVertexWeighthNV");
		VertexWeighthvNV = provider.getFunctionAddress("glVertexWeighthvNV");
		VertexAttrib1hNV = provider.getFunctionAddress("glVertexAttrib1hNV");
		VertexAttrib1hvNV = provider.getFunctionAddress("glVertexAttrib1hvNV");
		VertexAttrib2hNV = provider.getFunctionAddress("glVertexAttrib2hNV");
		VertexAttrib2hvNV = provider.getFunctionAddress("glVertexAttrib2hvNV");
		VertexAttrib3hNV = provider.getFunctionAddress("glVertexAttrib3hNV");
		VertexAttrib3hvNV = provider.getFunctionAddress("glVertexAttrib3hvNV");
		VertexAttrib4hNV = provider.getFunctionAddress("glVertexAttrib4hNV");
		VertexAttrib4hvNV = provider.getFunctionAddress("glVertexAttrib4hvNV");
		VertexAttribs1hvNV = provider.getFunctionAddress("glVertexAttribs1hvNV");
		VertexAttribs2hvNV = provider.getFunctionAddress("glVertexAttribs2hvNV");
		VertexAttribs3hvNV = provider.getFunctionAddress("glVertexAttribs3hvNV");
		VertexAttribs4hvNV = provider.getFunctionAddress("glVertexAttribs4hvNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVHalfFloat} instance for the current context. */
	public static NVHalfFloat getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVHalfFloat);
	}

	static NVHalfFloat create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_half_float") ) return null;

		NVHalfFloat funcs = new NVHalfFloat(provider);

		boolean supported = checkFunctions(
			funcs.Vertex2hNV, funcs.Vertex2hvNV, funcs.Vertex3hNV, funcs.Vertex3hvNV, funcs.Vertex4hNV, funcs.Vertex4hvNV, funcs.Normal3hNV, funcs.Normal3hvNV, 
			funcs.Color3hNV, funcs.Color3hvNV, funcs.Color4hNV, funcs.Color4hvNV, funcs.TexCoord1hNV, funcs.TexCoord1hvNV, funcs.TexCoord2hNV, 
			funcs.TexCoord2hvNV, funcs.TexCoord3hNV, funcs.TexCoord3hvNV, funcs.TexCoord4hNV, funcs.TexCoord4hvNV, funcs.MultiTexCoord1hNV, 
			funcs.MultiTexCoord1hvNV, funcs.MultiTexCoord2hNV, funcs.MultiTexCoord2hvNV, funcs.MultiTexCoord3hNV, funcs.MultiTexCoord3hvNV, 
			funcs.MultiTexCoord4hNV, funcs.MultiTexCoord4hvNV, ext.contains("GL_EXT_fog_coord") ? funcs.FogCoordhNV : -1L, 
			ext.contains("GL_EXT_fog_coord") ? funcs.FogCoordhvNV : -1L, ext.contains("GL_EXT_secondary_color") ? funcs.SecondaryColor3hNV : -1L, 
			ext.contains("GL_EXT_secondary_color") ? funcs.SecondaryColor3hvNV : -1L, ext.contains("GL_EXT_vertex_weighting") ? funcs.VertexWeighthNV : -1L, 
			ext.contains("GL_EXT_vertex_weighting") ? funcs.VertexWeighthvNV : -1L, ext.contains("GL_NV_vertex_program") ? funcs.VertexAttrib1hNV : -1L, 
			ext.contains("GL_NV_vertex_program") ? funcs.VertexAttrib1hvNV : -1L, ext.contains("GL_NV_vertex_program") ? funcs.VertexAttrib2hNV : -1L, 
			ext.contains("GL_NV_vertex_program") ? funcs.VertexAttrib2hvNV : -1L, ext.contains("GL_NV_vertex_program") ? funcs.VertexAttrib3hNV : -1L, 
			ext.contains("GL_NV_vertex_program") ? funcs.VertexAttrib3hvNV : -1L, ext.contains("GL_NV_vertex_program") ? funcs.VertexAttrib4hNV : -1L, 
			ext.contains("GL_NV_vertex_program") ? funcs.VertexAttrib4hvNV : -1L, ext.contains("GL_NV_vertex_program") ? funcs.VertexAttribs1hvNV : -1L, 
			ext.contains("GL_NV_vertex_program") ? funcs.VertexAttribs2hvNV : -1L, ext.contains("GL_NV_vertex_program") ? funcs.VertexAttribs3hvNV : -1L, 
			ext.contains("GL_NV_vertex_program") ? funcs.VertexAttribs4hvNV : -1L
		);

		return GL.checkExtension("GL_NV_half_float", funcs, supported);
	}

	// --- [ glVertex2hNV ] ---

	public static void glVertex2hNV(short x, short y) {
		long __functionAddress = getInstance().Vertex2hNV;
		callSSV(__functionAddress, x, y);
	}

	// --- [ glVertex2hvNV ] ---

	/** Unsafe version of {@link #glVertex2hvNV Vertex2hvNV} */
	@JavadocExclude
	public static void nglVertex2hvNV(long v) {
		long __functionAddress = getInstance().Vertex2hvNV;
		callPV(__functionAddress, v);
	}

	public static void glVertex2hvNV(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 1);
		nglVertex2hvNV(memAddress(v));
	}

	/** Alternative version of: {@link #glVertex2hvNV Vertex2hvNV} */
	public static void glVertex2hvNV(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertex2hvNV(memAddress(v));
	}

	// --- [ glVertex3hNV ] ---

	public static void glVertex3hNV(short x, short y, short z) {
		long __functionAddress = getInstance().Vertex3hNV;
		callSSSV(__functionAddress, x, y, z);
	}

	// --- [ glVertex3hvNV ] ---

	/** Unsafe version of {@link #glVertex3hvNV Vertex3hvNV} */
	@JavadocExclude
	public static void nglVertex3hvNV(long v) {
		long __functionAddress = getInstance().Vertex3hvNV;
		callPV(__functionAddress, v);
	}

	public static void glVertex3hvNV(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglVertex3hvNV(memAddress(v));
	}

	/** Alternative version of: {@link #glVertex3hvNV Vertex3hvNV} */
	public static void glVertex3hvNV(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertex3hvNV(memAddress(v));
	}

	// --- [ glVertex4hNV ] ---

	public static void glVertex4hNV(short x, short y, short z, short w) {
		long __functionAddress = getInstance().Vertex4hNV;
		callSSSSV(__functionAddress, x, y, z, w);
	}

	// --- [ glVertex4hvNV ] ---

	/** Unsafe version of {@link #glVertex4hvNV Vertex4hvNV} */
	@JavadocExclude
	public static void nglVertex4hvNV(long v) {
		long __functionAddress = getInstance().Vertex4hvNV;
		callPV(__functionAddress, v);
	}

	public static void glVertex4hvNV(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertex4hvNV(memAddress(v));
	}

	/** Alternative version of: {@link #glVertex4hvNV Vertex4hvNV} */
	public static void glVertex4hvNV(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertex4hvNV(memAddress(v));
	}

	// --- [ glNormal3hNV ] ---

	public static void glNormal3hNV(short nx, short ny, short nz) {
		long __functionAddress = getInstance().Normal3hNV;
		callSSSV(__functionAddress, nx, ny, nz);
	}

	// --- [ glNormal3hvNV ] ---

	/** Unsafe version of {@link #glNormal3hvNV Normal3hvNV} */
	@JavadocExclude
	public static void nglNormal3hvNV(long v) {
		long __functionAddress = getInstance().Normal3hvNV;
		callPV(__functionAddress, v);
	}

	public static void glNormal3hvNV(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglNormal3hvNV(memAddress(v));
	}

	/** Alternative version of: {@link #glNormal3hvNV Normal3hvNV} */
	public static void glNormal3hvNV(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglNormal3hvNV(memAddress(v));
	}

	// --- [ glColor3hNV ] ---

	public static void glColor3hNV(short red, short green, short blue) {
		long __functionAddress = getInstance().Color3hNV;
		callSSSV(__functionAddress, red, green, blue);
	}

	// --- [ glColor3hvNV ] ---

	/** Unsafe version of {@link #glColor3hvNV Color3hvNV} */
	@JavadocExclude
	public static void nglColor3hvNV(long v) {
		long __functionAddress = getInstance().Color3hvNV;
		callPV(__functionAddress, v);
	}

	public static void glColor3hvNV(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglColor3hvNV(memAddress(v));
	}

	/** Alternative version of: {@link #glColor3hvNV Color3hvNV} */
	public static void glColor3hvNV(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglColor3hvNV(memAddress(v));
	}

	// --- [ glColor4hNV ] ---

	public static void glColor4hNV(short red, short green, short blue, short alpha) {
		long __functionAddress = getInstance().Color4hNV;
		callSSSSV(__functionAddress, red, green, blue, alpha);
	}

	// --- [ glColor4hvNV ] ---

	/** Unsafe version of {@link #glColor4hvNV Color4hvNV} */
	@JavadocExclude
	public static void nglColor4hvNV(long v) {
		long __functionAddress = getInstance().Color4hvNV;
		callPV(__functionAddress, v);
	}

	public static void glColor4hvNV(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglColor4hvNV(memAddress(v));
	}

	/** Alternative version of: {@link #glColor4hvNV Color4hvNV} */
	public static void glColor4hvNV(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglColor4hvNV(memAddress(v));
	}

	// --- [ glTexCoord1hNV ] ---

	public static void glTexCoord1hNV(short s) {
		long __functionAddress = getInstance().TexCoord1hNV;
		callSV(__functionAddress, s);
	}

	// --- [ glTexCoord1hvNV ] ---

	/** Unsafe version of {@link #glTexCoord1hvNV TexCoord1hvNV} */
	@JavadocExclude
	public static void nglTexCoord1hvNV(long v) {
		long __functionAddress = getInstance().TexCoord1hvNV;
		callPV(__functionAddress, v);
	}

	public static void glTexCoord1hvNV(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 1);
		nglTexCoord1hvNV(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord1hvNV TexCoord1hvNV} */
	public static void glTexCoord1hvNV(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglTexCoord1hvNV(memAddress(v));
	}

	// --- [ glTexCoord2hNV ] ---

	public static void glTexCoord2hNV(short s, short t) {
		long __functionAddress = getInstance().TexCoord2hNV;
		callSSV(__functionAddress, s, t);
	}

	// --- [ glTexCoord2hvNV ] ---

	/** Unsafe version of {@link #glTexCoord2hvNV TexCoord2hvNV} */
	@JavadocExclude
	public static void nglTexCoord2hvNV(long v) {
		long __functionAddress = getInstance().TexCoord2hvNV;
		callPV(__functionAddress, v);
	}

	public static void glTexCoord2hvNV(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 1);
		nglTexCoord2hvNV(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord2hvNV TexCoord2hvNV} */
	public static void glTexCoord2hvNV(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglTexCoord2hvNV(memAddress(v));
	}

	// --- [ glTexCoord3hNV ] ---

	public static void glTexCoord3hNV(short s, short t, short r) {
		long __functionAddress = getInstance().TexCoord3hNV;
		callSSSV(__functionAddress, s, t, r);
	}

	// --- [ glTexCoord3hvNV ] ---

	/** Unsafe version of {@link #glTexCoord3hvNV TexCoord3hvNV} */
	@JavadocExclude
	public static void nglTexCoord3hvNV(long v) {
		long __functionAddress = getInstance().TexCoord3hvNV;
		callPV(__functionAddress, v);
	}

	public static void glTexCoord3hvNV(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglTexCoord3hvNV(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord3hvNV TexCoord3hvNV} */
	public static void glTexCoord3hvNV(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglTexCoord3hvNV(memAddress(v));
	}

	// --- [ glTexCoord4hNV ] ---

	public static void glTexCoord4hNV(short s, short t, short r, short q) {
		long __functionAddress = getInstance().TexCoord4hNV;
		callSSSSV(__functionAddress, s, t, r, q);
	}

	// --- [ glTexCoord4hvNV ] ---

	/** Unsafe version of {@link #glTexCoord4hvNV TexCoord4hvNV} */
	@JavadocExclude
	public static void nglTexCoord4hvNV(long v) {
		long __functionAddress = getInstance().TexCoord4hvNV;
		callPV(__functionAddress, v);
	}

	public static void glTexCoord4hvNV(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglTexCoord4hvNV(memAddress(v));
	}

	/** Alternative version of: {@link #glTexCoord4hvNV TexCoord4hvNV} */
	public static void glTexCoord4hvNV(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglTexCoord4hvNV(memAddress(v));
	}

	// --- [ glMultiTexCoord1hNV ] ---

	public static void glMultiTexCoord1hNV(int target, short s) {
		long __functionAddress = getInstance().MultiTexCoord1hNV;
		callISV(__functionAddress, target, s);
	}

	// --- [ glMultiTexCoord1hvNV ] ---

	/** Unsafe version of {@link #glMultiTexCoord1hvNV MultiTexCoord1hvNV} */
	@JavadocExclude
	public static void nglMultiTexCoord1hvNV(int target, long v) {
		long __functionAddress = getInstance().MultiTexCoord1hvNV;
		callIPV(__functionAddress, target, v);
	}

	public static void glMultiTexCoord1hvNV(int target, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 1);
		nglMultiTexCoord1hvNV(target, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord1hvNV MultiTexCoord1hvNV} */
	public static void glMultiTexCoord1hvNV(int target, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1hvNV(target, memAddress(v));
	}

	// --- [ glMultiTexCoord2hNV ] ---

	public static void glMultiTexCoord2hNV(int target, short s, short t) {
		long __functionAddress = getInstance().MultiTexCoord2hNV;
		callISSV(__functionAddress, target, s, t);
	}

	// --- [ glMultiTexCoord2hvNV ] ---

	/** Unsafe version of {@link #glMultiTexCoord2hvNV MultiTexCoord2hvNV} */
	@JavadocExclude
	public static void nglMultiTexCoord2hvNV(int target, long v) {
		long __functionAddress = getInstance().MultiTexCoord2hvNV;
		callIPV(__functionAddress, target, v);
	}

	public static void glMultiTexCoord2hvNV(int target, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 1);
		nglMultiTexCoord2hvNV(target, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord2hvNV MultiTexCoord2hvNV} */
	public static void glMultiTexCoord2hvNV(int target, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2hvNV(target, memAddress(v));
	}

	// --- [ glMultiTexCoord3hNV ] ---

	public static void glMultiTexCoord3hNV(int target, short s, short t, short r) {
		long __functionAddress = getInstance().MultiTexCoord3hNV;
		callISSSV(__functionAddress, target, s, t, r);
	}

	// --- [ glMultiTexCoord3hvNV ] ---

	/** Unsafe version of {@link #glMultiTexCoord3hvNV MultiTexCoord3hvNV} */
	@JavadocExclude
	public static void nglMultiTexCoord3hvNV(int target, long v) {
		long __functionAddress = getInstance().MultiTexCoord3hvNV;
		callIPV(__functionAddress, target, v);
	}

	public static void glMultiTexCoord3hvNV(int target, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglMultiTexCoord3hvNV(target, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord3hvNV MultiTexCoord3hvNV} */
	public static void glMultiTexCoord3hvNV(int target, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3hvNV(target, memAddress(v));
	}

	// --- [ glMultiTexCoord4hNV ] ---

	public static void glMultiTexCoord4hNV(int target, short s, short t, short r, short q) {
		long __functionAddress = getInstance().MultiTexCoord4hNV;
		callISSSSV(__functionAddress, target, s, t, r, q);
	}

	// --- [ glMultiTexCoord4hvNV ] ---

	/** Unsafe version of {@link #glMultiTexCoord4hvNV MultiTexCoord4hvNV} */
	@JavadocExclude
	public static void nglMultiTexCoord4hvNV(int target, long v) {
		long __functionAddress = getInstance().MultiTexCoord4hvNV;
		callIPV(__functionAddress, target, v);
	}

	public static void glMultiTexCoord4hvNV(int target, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglMultiTexCoord4hvNV(target, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord4hvNV MultiTexCoord4hvNV} */
	public static void glMultiTexCoord4hvNV(int target, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4hvNV(target, memAddress(v));
	}

	// --- [ glFogCoordhNV ] ---

	public static void glFogCoordhNV(short fog) {
		long __functionAddress = getInstance().FogCoordhNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callSV(__functionAddress, fog);
	}

	// --- [ glFogCoordhvNV ] ---

	/** Unsafe version of {@link #glFogCoordhvNV FogCoordhvNV} */
	@JavadocExclude
	public static void nglFogCoordhvNV(long fog) {
		long __functionAddress = getInstance().FogCoordhvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, fog);
	}

	public static void glFogCoordhvNV(ByteBuffer fog) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(fog, 1 << 1);
		nglFogCoordhvNV(memAddress(fog));
	}

	/** Alternative version of: {@link #glFogCoordhvNV FogCoordhvNV} */
	public static void glFogCoordhvNV(ShortBuffer fog) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(fog, 1);
		nglFogCoordhvNV(memAddress(fog));
	}

	// --- [ glSecondaryColor3hNV ] ---

	public static void glSecondaryColor3hNV(short red, short green, short blue) {
		long __functionAddress = getInstance().SecondaryColor3hNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callSSSV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3hvNV ] ---

	/** Unsafe version of {@link #glSecondaryColor3hvNV SecondaryColor3hvNV} */
	@JavadocExclude
	public static void nglSecondaryColor3hvNV(long v) {
		long __functionAddress = getInstance().SecondaryColor3hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	public static void glSecondaryColor3hvNV(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglSecondaryColor3hvNV(memAddress(v));
	}

	/** Alternative version of: {@link #glSecondaryColor3hvNV SecondaryColor3hvNV} */
	public static void glSecondaryColor3hvNV(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3hvNV(memAddress(v));
	}

	// --- [ glVertexWeighthNV ] ---

	public static void glVertexWeighthNV(short weight) {
		long __functionAddress = getInstance().VertexWeighthNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callSV(__functionAddress, weight);
	}

	// --- [ glVertexWeighthvNV ] ---

	/** Unsafe version of {@link #glVertexWeighthvNV VertexWeighthvNV} */
	@JavadocExclude
	public static void nglVertexWeighthvNV(long weight) {
		long __functionAddress = getInstance().VertexWeighthvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, weight);
	}

	public static void glVertexWeighthvNV(ByteBuffer weight) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(weight, 1 << 1);
		nglVertexWeighthvNV(memAddress(weight));
	}

	/** Alternative version of: {@link #glVertexWeighthvNV VertexWeighthvNV} */
	public static void glVertexWeighthvNV(ShortBuffer weight) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(weight, 1);
		nglVertexWeighthvNV(memAddress(weight));
	}

	// --- [ glVertexAttrib1hNV ] ---

	public static void glVertexAttrib1hNV(int index, short x) {
		long __functionAddress = getInstance().VertexAttrib1hNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callISV(__functionAddress, index, x);
	}

	// --- [ glVertexAttrib1hvNV ] ---

	/** Unsafe version of {@link #glVertexAttrib1hvNV VertexAttrib1hvNV} */
	@JavadocExclude
	public static void nglVertexAttrib1hvNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib1hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttrib1hvNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 1);
		nglVertexAttrib1hvNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib1hvNV VertexAttrib1hvNV} */
	public static void glVertexAttrib1hvNV(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1hvNV(index, memAddress(v));
	}

	// --- [ glVertexAttrib2hNV ] ---

	public static void glVertexAttrib2hNV(int index, short x, short y) {
		long __functionAddress = getInstance().VertexAttrib2hNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callISSV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttrib2hvNV ] ---

	/** Unsafe version of {@link #glVertexAttrib2hvNV VertexAttrib2hvNV} */
	@JavadocExclude
	public static void nglVertexAttrib2hvNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib2hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttrib2hvNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 1);
		nglVertexAttrib2hvNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib2hvNV VertexAttrib2hvNV} */
	public static void glVertexAttrib2hvNV(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2hvNV(index, memAddress(v));
	}

	// --- [ glVertexAttrib3hNV ] ---

	public static void glVertexAttrib3hNV(int index, short x, short y, short z) {
		long __functionAddress = getInstance().VertexAttrib3hNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callISSSV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttrib3hvNV ] ---

	/** Unsafe version of {@link #glVertexAttrib3hvNV VertexAttrib3hvNV} */
	@JavadocExclude
	public static void nglVertexAttrib3hvNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib3hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttrib3hvNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglVertexAttrib3hvNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib3hvNV VertexAttrib3hvNV} */
	public static void glVertexAttrib3hvNV(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3hvNV(index, memAddress(v));
	}

	// --- [ glVertexAttrib4hNV ] ---

	public static void glVertexAttrib4hNV(int index, short x, short y, short z, short w) {
		long __functionAddress = getInstance().VertexAttrib4hNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callISSSSV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttrib4hvNV ] ---

	/** Unsafe version of {@link #glVertexAttrib4hvNV VertexAttrib4hvNV} */
	@JavadocExclude
	public static void nglVertexAttrib4hvNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, index, v);
	}

	public static void glVertexAttrib4hvNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttrib4hvNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4hvNV VertexAttrib4hvNV} */
	public static void glVertexAttrib4hvNV(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4hvNV(index, memAddress(v));
	}

	// --- [ glVertexAttribs1hvNV ] ---

	/** Unsafe version of {@link #glVertexAttribs1hvNV VertexAttribs1hvNV} */
	@JavadocExclude
	public static void nglVertexAttribs1hvNV(int index, int n, long v) {
		long __functionAddress = getInstance().VertexAttribs1hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, index, n, v);
	}

	public static void glVertexAttribs1hvNV(int index, int n, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, n << 1);
		nglVertexAttribs1hvNV(index, n, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribs1hvNV VertexAttribs1hvNV} */
	public static void glVertexAttribs1hvNV(int index, ShortBuffer v) {
		nglVertexAttribs1hvNV(index, v.remaining(), memAddress(v));
	}

	// --- [ glVertexAttribs2hvNV ] ---

	/** Unsafe version of {@link #glVertexAttribs2hvNV VertexAttribs2hvNV} */
	@JavadocExclude
	public static void nglVertexAttribs2hvNV(int index, int n, long v) {
		long __functionAddress = getInstance().VertexAttribs2hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, index, n, v);
	}

	public static void glVertexAttribs2hvNV(int index, int n, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, (n << 1) << 1);
		nglVertexAttribs2hvNV(index, n, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribs2hvNV VertexAttribs2hvNV} */
	public static void glVertexAttribs2hvNV(int index, ShortBuffer v) {
		nglVertexAttribs2hvNV(index, v.remaining() >> 1, memAddress(v));
	}

	// --- [ glVertexAttribs3hvNV ] ---

	/** Unsafe version of {@link #glVertexAttribs3hvNV VertexAttribs3hvNV} */
	@JavadocExclude
	public static void nglVertexAttribs3hvNV(int index, int n, long v) {
		long __functionAddress = getInstance().VertexAttribs3hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, index, n, v);
	}

	public static void glVertexAttribs3hvNV(int index, int n, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, (n * 3) << 1);
		nglVertexAttribs3hvNV(index, n, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribs3hvNV VertexAttribs3hvNV} */
	public static void glVertexAttribs3hvNV(int index, ShortBuffer v) {
		nglVertexAttribs3hvNV(index, v.remaining() / 3, memAddress(v));
	}

	// --- [ glVertexAttribs4hvNV ] ---

	/** Unsafe version of {@link #glVertexAttribs4hvNV VertexAttribs4hvNV} */
	@JavadocExclude
	public static void nglVertexAttribs4hvNV(int index, int n, long v) {
		long __functionAddress = getInstance().VertexAttribs4hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, index, n, v);
	}

	public static void glVertexAttribs4hvNV(int index, int n, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, (n << 4) << 1);
		nglVertexAttribs4hvNV(index, n, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribs4hvNV VertexAttribs4hvNV} */
	public static void glVertexAttribs4hvNV(int index, ShortBuffer v) {
		nglVertexAttribs4hvNV(index, v.remaining() >> 4, memAddress(v));
	}

}