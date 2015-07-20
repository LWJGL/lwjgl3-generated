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

	/** JNI method for {@link #glVertex2hNV Vertex2hNV} */
	@JavadocExclude
	public static native void nglVertex2hNV(short x, short y, long __functionAddress);

	/**
	 * 
	 *
	 * @param x 
	 * @param y 
	 */
	public static void glVertex2hNV(short x, short y) {
		long __functionAddress = getInstance().Vertex2hNV;
		nglVertex2hNV(x, y, __functionAddress);
	}

	// --- [ glVertex2hvNV ] ---

	/** JNI method for {@link #glVertex2hvNV Vertex2hvNV} */
	@JavadocExclude
	public static native void nglVertex2hvNV(long v, long __functionAddress);

	/** Unsafe version of {@link #glVertex2hvNV Vertex2hvNV} */
	@JavadocExclude
	public static void nglVertex2hvNV(long v) {
		long __functionAddress = getInstance().Vertex2hvNV;
		nglVertex2hvNV(v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param v 
	 */
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

	/** JNI method for {@link #glVertex3hNV Vertex3hNV} */
	@JavadocExclude
	public static native void nglVertex3hNV(short x, short y, short z, long __functionAddress);

	/**
	 * 
	 *
	 * @param x 
	 * @param y 
	 * @param z 
	 */
	public static void glVertex3hNV(short x, short y, short z) {
		long __functionAddress = getInstance().Vertex3hNV;
		nglVertex3hNV(x, y, z, __functionAddress);
	}

	// --- [ glVertex3hvNV ] ---

	/** JNI method for {@link #glVertex3hvNV Vertex3hvNV} */
	@JavadocExclude
	public static native void nglVertex3hvNV(long v, long __functionAddress);

	/** Unsafe version of {@link #glVertex3hvNV Vertex3hvNV} */
	@JavadocExclude
	public static void nglVertex3hvNV(long v) {
		long __functionAddress = getInstance().Vertex3hvNV;
		nglVertex3hvNV(v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param v 
	 */
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

	/** JNI method for {@link #glVertex4hNV Vertex4hNV} */
	@JavadocExclude
	public static native void nglVertex4hNV(short x, short y, short z, short w, long __functionAddress);

	/**
	 * 
	 *
	 * @param x 
	 * @param y 
	 * @param z 
	 * @param w 
	 */
	public static void glVertex4hNV(short x, short y, short z, short w) {
		long __functionAddress = getInstance().Vertex4hNV;
		nglVertex4hNV(x, y, z, w, __functionAddress);
	}

	// --- [ glVertex4hvNV ] ---

	/** JNI method for {@link #glVertex4hvNV Vertex4hvNV} */
	@JavadocExclude
	public static native void nglVertex4hvNV(long v, long __functionAddress);

	/** Unsafe version of {@link #glVertex4hvNV Vertex4hvNV} */
	@JavadocExclude
	public static void nglVertex4hvNV(long v) {
		long __functionAddress = getInstance().Vertex4hvNV;
		nglVertex4hvNV(v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param v 
	 */
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

	/** JNI method for {@link #glNormal3hNV Normal3hNV} */
	@JavadocExclude
	public static native void nglNormal3hNV(short nx, short ny, short nz, long __functionAddress);

	/**
	 * 
	 *
	 * @param nx 
	 * @param ny 
	 * @param nz 
	 */
	public static void glNormal3hNV(short nx, short ny, short nz) {
		long __functionAddress = getInstance().Normal3hNV;
		nglNormal3hNV(nx, ny, nz, __functionAddress);
	}

	// --- [ glNormal3hvNV ] ---

	/** JNI method for {@link #glNormal3hvNV Normal3hvNV} */
	@JavadocExclude
	public static native void nglNormal3hvNV(long v, long __functionAddress);

	/** Unsafe version of {@link #glNormal3hvNV Normal3hvNV} */
	@JavadocExclude
	public static void nglNormal3hvNV(long v) {
		long __functionAddress = getInstance().Normal3hvNV;
		nglNormal3hvNV(v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param v 
	 */
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

	/** JNI method for {@link #glColor3hNV Color3hNV} */
	@JavadocExclude
	public static native void nglColor3hNV(short red, short green, short blue, long __functionAddress);

	/**
	 * 
	 *
	 * @param red   
	 * @param green 
	 * @param blue  
	 */
	public static void glColor3hNV(short red, short green, short blue) {
		long __functionAddress = getInstance().Color3hNV;
		nglColor3hNV(red, green, blue, __functionAddress);
	}

	// --- [ glColor3hvNV ] ---

	/** JNI method for {@link #glColor3hvNV Color3hvNV} */
	@JavadocExclude
	public static native void nglColor3hvNV(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor3hvNV Color3hvNV} */
	@JavadocExclude
	public static void nglColor3hvNV(long v) {
		long __functionAddress = getInstance().Color3hvNV;
		nglColor3hvNV(v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param v 
	 */
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

	/** JNI method for {@link #glColor4hNV Color4hNV} */
	@JavadocExclude
	public static native void nglColor4hNV(short red, short green, short blue, short alpha, long __functionAddress);

	/**
	 * 
	 *
	 * @param red   
	 * @param green 
	 * @param blue  
	 * @param alpha 
	 */
	public static void glColor4hNV(short red, short green, short blue, short alpha) {
		long __functionAddress = getInstance().Color4hNV;
		nglColor4hNV(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4hvNV ] ---

	/** JNI method for {@link #glColor4hvNV Color4hvNV} */
	@JavadocExclude
	public static native void nglColor4hvNV(long v, long __functionAddress);

	/** Unsafe version of {@link #glColor4hvNV Color4hvNV} */
	@JavadocExclude
	public static void nglColor4hvNV(long v) {
		long __functionAddress = getInstance().Color4hvNV;
		nglColor4hvNV(v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param v 
	 */
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

	/** JNI method for {@link #glTexCoord1hNV TexCoord1hNV} */
	@JavadocExclude
	public static native void nglTexCoord1hNV(short s, long __functionAddress);

	/**
	 * 
	 *
	 * @param s 
	 */
	public static void glTexCoord1hNV(short s) {
		long __functionAddress = getInstance().TexCoord1hNV;
		nglTexCoord1hNV(s, __functionAddress);
	}

	// --- [ glTexCoord1hvNV ] ---

	/** JNI method for {@link #glTexCoord1hvNV TexCoord1hvNV} */
	@JavadocExclude
	public static native void nglTexCoord1hvNV(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord1hvNV TexCoord1hvNV} */
	@JavadocExclude
	public static void nglTexCoord1hvNV(long v) {
		long __functionAddress = getInstance().TexCoord1hvNV;
		nglTexCoord1hvNV(v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param v 
	 */
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

	/** JNI method for {@link #glTexCoord2hNV TexCoord2hNV} */
	@JavadocExclude
	public static native void nglTexCoord2hNV(short s, short t, long __functionAddress);

	/**
	 * 
	 *
	 * @param s 
	 * @param t 
	 */
	public static void glTexCoord2hNV(short s, short t) {
		long __functionAddress = getInstance().TexCoord2hNV;
		nglTexCoord2hNV(s, t, __functionAddress);
	}

	// --- [ glTexCoord2hvNV ] ---

	/** JNI method for {@link #glTexCoord2hvNV TexCoord2hvNV} */
	@JavadocExclude
	public static native void nglTexCoord2hvNV(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord2hvNV TexCoord2hvNV} */
	@JavadocExclude
	public static void nglTexCoord2hvNV(long v) {
		long __functionAddress = getInstance().TexCoord2hvNV;
		nglTexCoord2hvNV(v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param v 
	 */
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

	/** JNI method for {@link #glTexCoord3hNV TexCoord3hNV} */
	@JavadocExclude
	public static native void nglTexCoord3hNV(short s, short t, short r, long __functionAddress);

	/**
	 * 
	 *
	 * @param s 
	 * @param t 
	 * @param r 
	 */
	public static void glTexCoord3hNV(short s, short t, short r) {
		long __functionAddress = getInstance().TexCoord3hNV;
		nglTexCoord3hNV(s, t, r, __functionAddress);
	}

	// --- [ glTexCoord3hvNV ] ---

	/** JNI method for {@link #glTexCoord3hvNV TexCoord3hvNV} */
	@JavadocExclude
	public static native void nglTexCoord3hvNV(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord3hvNV TexCoord3hvNV} */
	@JavadocExclude
	public static void nglTexCoord3hvNV(long v) {
		long __functionAddress = getInstance().TexCoord3hvNV;
		nglTexCoord3hvNV(v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param v 
	 */
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

	/** JNI method for {@link #glTexCoord4hNV TexCoord4hNV} */
	@JavadocExclude
	public static native void nglTexCoord4hNV(short s, short t, short r, short q, long __functionAddress);

	/**
	 * 
	 *
	 * @param s 
	 * @param t 
	 * @param r 
	 * @param q 
	 */
	public static void glTexCoord4hNV(short s, short t, short r, short q) {
		long __functionAddress = getInstance().TexCoord4hNV;
		nglTexCoord4hNV(s, t, r, q, __functionAddress);
	}

	// --- [ glTexCoord4hvNV ] ---

	/** JNI method for {@link #glTexCoord4hvNV TexCoord4hvNV} */
	@JavadocExclude
	public static native void nglTexCoord4hvNV(long v, long __functionAddress);

	/** Unsafe version of {@link #glTexCoord4hvNV TexCoord4hvNV} */
	@JavadocExclude
	public static void nglTexCoord4hvNV(long v) {
		long __functionAddress = getInstance().TexCoord4hvNV;
		nglTexCoord4hvNV(v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param v 
	 */
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

	/** JNI method for {@link #glMultiTexCoord1hNV MultiTexCoord1hNV} */
	@JavadocExclude
	public static native void nglMultiTexCoord1hNV(int target, short s, long __functionAddress);

	/**
	 * 
	 *
	 * @param target 
	 * @param s      
	 */
	public static void glMultiTexCoord1hNV(int target, short s) {
		long __functionAddress = getInstance().MultiTexCoord1hNV;
		nglMultiTexCoord1hNV(target, s, __functionAddress);
	}

	// --- [ glMultiTexCoord1hvNV ] ---

	/** JNI method for {@link #glMultiTexCoord1hvNV MultiTexCoord1hvNV} */
	@JavadocExclude
	public static native void nglMultiTexCoord1hvNV(int target, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord1hvNV MultiTexCoord1hvNV} */
	@JavadocExclude
	public static void nglMultiTexCoord1hvNV(int target, long v) {
		long __functionAddress = getInstance().MultiTexCoord1hvNV;
		nglMultiTexCoord1hvNV(target, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param v      
	 */
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

	/** JNI method for {@link #glMultiTexCoord2hNV MultiTexCoord2hNV} */
	@JavadocExclude
	public static native void nglMultiTexCoord2hNV(int target, short s, short t, long __functionAddress);

	/**
	 * 
	 *
	 * @param target 
	 * @param s      
	 * @param t      
	 */
	public static void glMultiTexCoord2hNV(int target, short s, short t) {
		long __functionAddress = getInstance().MultiTexCoord2hNV;
		nglMultiTexCoord2hNV(target, s, t, __functionAddress);
	}

	// --- [ glMultiTexCoord2hvNV ] ---

	/** JNI method for {@link #glMultiTexCoord2hvNV MultiTexCoord2hvNV} */
	@JavadocExclude
	public static native void nglMultiTexCoord2hvNV(int target, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord2hvNV MultiTexCoord2hvNV} */
	@JavadocExclude
	public static void nglMultiTexCoord2hvNV(int target, long v) {
		long __functionAddress = getInstance().MultiTexCoord2hvNV;
		nglMultiTexCoord2hvNV(target, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param v      
	 */
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

	/** JNI method for {@link #glMultiTexCoord3hNV MultiTexCoord3hNV} */
	@JavadocExclude
	public static native void nglMultiTexCoord3hNV(int target, short s, short t, short r, long __functionAddress);

	/**
	 * 
	 *
	 * @param target 
	 * @param s      
	 * @param t      
	 * @param r      
	 */
	public static void glMultiTexCoord3hNV(int target, short s, short t, short r) {
		long __functionAddress = getInstance().MultiTexCoord3hNV;
		nglMultiTexCoord3hNV(target, s, t, r, __functionAddress);
	}

	// --- [ glMultiTexCoord3hvNV ] ---

	/** JNI method for {@link #glMultiTexCoord3hvNV MultiTexCoord3hvNV} */
	@JavadocExclude
	public static native void nglMultiTexCoord3hvNV(int target, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord3hvNV MultiTexCoord3hvNV} */
	@JavadocExclude
	public static void nglMultiTexCoord3hvNV(int target, long v) {
		long __functionAddress = getInstance().MultiTexCoord3hvNV;
		nglMultiTexCoord3hvNV(target, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param v      
	 */
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

	/** JNI method for {@link #glMultiTexCoord4hNV MultiTexCoord4hNV} */
	@JavadocExclude
	public static native void nglMultiTexCoord4hNV(int target, short s, short t, short r, short q, long __functionAddress);

	/**
	 * 
	 *
	 * @param target 
	 * @param s      
	 * @param t      
	 * @param r      
	 * @param q      
	 */
	public static void glMultiTexCoord4hNV(int target, short s, short t, short r, short q) {
		long __functionAddress = getInstance().MultiTexCoord4hNV;
		nglMultiTexCoord4hNV(target, s, t, r, q, __functionAddress);
	}

	// --- [ glMultiTexCoord4hvNV ] ---

	/** JNI method for {@link #glMultiTexCoord4hvNV MultiTexCoord4hvNV} */
	@JavadocExclude
	public static native void nglMultiTexCoord4hvNV(int target, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord4hvNV MultiTexCoord4hvNV} */
	@JavadocExclude
	public static void nglMultiTexCoord4hvNV(int target, long v) {
		long __functionAddress = getInstance().MultiTexCoord4hvNV;
		nglMultiTexCoord4hvNV(target, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param v      
	 */
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

	/** JNI method for {@link #glFogCoordhNV FogCoordhNV} */
	@JavadocExclude
	public static native void nglFogCoordhNV(short fog, long __functionAddress);

	/**
	 * 
	 *
	 * @param fog 
	 */
	public static void glFogCoordhNV(short fog) {
		long __functionAddress = getInstance().FogCoordhNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFogCoordhNV(fog, __functionAddress);
	}

	// --- [ glFogCoordhvNV ] ---

	/** JNI method for {@link #glFogCoordhvNV FogCoordhvNV} */
	@JavadocExclude
	public static native void nglFogCoordhvNV(long fog, long __functionAddress);

	/** Unsafe version of {@link #glFogCoordhvNV FogCoordhvNV} */
	@JavadocExclude
	public static void nglFogCoordhvNV(long fog) {
		long __functionAddress = getInstance().FogCoordhvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFogCoordhvNV(fog, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param fog 
	 */
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

	/** JNI method for {@link #glSecondaryColor3hNV SecondaryColor3hNV} */
	@JavadocExclude
	public static native void nglSecondaryColor3hNV(short red, short green, short blue, long __functionAddress);

	/**
	 * 
	 *
	 * @param red   
	 * @param green 
	 * @param blue  
	 */
	public static void glSecondaryColor3hNV(short red, short green, short blue) {
		long __functionAddress = getInstance().SecondaryColor3hNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColor3hNV(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3hvNV ] ---

	/** JNI method for {@link #glSecondaryColor3hvNV SecondaryColor3hvNV} */
	@JavadocExclude
	public static native void nglSecondaryColor3hvNV(long v, long __functionAddress);

	/** Unsafe version of {@link #glSecondaryColor3hvNV SecondaryColor3hvNV} */
	@JavadocExclude
	public static void nglSecondaryColor3hvNV(long v) {
		long __functionAddress = getInstance().SecondaryColor3hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColor3hvNV(v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param v 
	 */
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

	/** JNI method for {@link #glVertexWeighthNV VertexWeighthNV} */
	@JavadocExclude
	public static native void nglVertexWeighthNV(short weight, long __functionAddress);

	/**
	 * 
	 *
	 * @param weight 
	 */
	public static void glVertexWeighthNV(short weight) {
		long __functionAddress = getInstance().VertexWeighthNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexWeighthNV(weight, __functionAddress);
	}

	// --- [ glVertexWeighthvNV ] ---

	/** JNI method for {@link #glVertexWeighthvNV VertexWeighthvNV} */
	@JavadocExclude
	public static native void nglVertexWeighthvNV(long weight, long __functionAddress);

	/** Unsafe version of {@link #glVertexWeighthvNV VertexWeighthvNV} */
	@JavadocExclude
	public static void nglVertexWeighthvNV(long weight) {
		long __functionAddress = getInstance().VertexWeighthvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexWeighthvNV(weight, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param weight 
	 */
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

	/** JNI method for {@link #glVertexAttrib1hNV VertexAttrib1hNV} */
	@JavadocExclude
	public static native void nglVertexAttrib1hNV(int index, short x, long __functionAddress);

	/**
	 * 
	 *
	 * @param index 
	 * @param x     
	 */
	public static void glVertexAttrib1hNV(int index, short x) {
		long __functionAddress = getInstance().VertexAttrib1hNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib1hNV(index, x, __functionAddress);
	}

	// --- [ glVertexAttrib1hvNV ] ---

	/** JNI method for {@link #glVertexAttrib1hvNV VertexAttrib1hvNV} */
	@JavadocExclude
	public static native void nglVertexAttrib1hvNV(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib1hvNV VertexAttrib1hvNV} */
	@JavadocExclude
	public static void nglVertexAttrib1hvNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib1hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib1hvNV(index, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param v     
	 */
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

	/** JNI method for {@link #glVertexAttrib2hNV VertexAttrib2hNV} */
	@JavadocExclude
	public static native void nglVertexAttrib2hNV(int index, short x, short y, long __functionAddress);

	/**
	 * 
	 *
	 * @param index 
	 * @param x     
	 * @param y     
	 */
	public static void glVertexAttrib2hNV(int index, short x, short y) {
		long __functionAddress = getInstance().VertexAttrib2hNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib2hNV(index, x, y, __functionAddress);
	}

	// --- [ glVertexAttrib2hvNV ] ---

	/** JNI method for {@link #glVertexAttrib2hvNV VertexAttrib2hvNV} */
	@JavadocExclude
	public static native void nglVertexAttrib2hvNV(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib2hvNV VertexAttrib2hvNV} */
	@JavadocExclude
	public static void nglVertexAttrib2hvNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib2hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib2hvNV(index, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param v     
	 */
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

	/** JNI method for {@link #glVertexAttrib3hNV VertexAttrib3hNV} */
	@JavadocExclude
	public static native void nglVertexAttrib3hNV(int index, short x, short y, short z, long __functionAddress);

	/**
	 * 
	 *
	 * @param index 
	 * @param x     
	 * @param y     
	 * @param z     
	 */
	public static void glVertexAttrib3hNV(int index, short x, short y, short z) {
		long __functionAddress = getInstance().VertexAttrib3hNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib3hNV(index, x, y, z, __functionAddress);
	}

	// --- [ glVertexAttrib3hvNV ] ---

	/** JNI method for {@link #glVertexAttrib3hvNV VertexAttrib3hvNV} */
	@JavadocExclude
	public static native void nglVertexAttrib3hvNV(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib3hvNV VertexAttrib3hvNV} */
	@JavadocExclude
	public static void nglVertexAttrib3hvNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib3hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib3hvNV(index, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param v     
	 */
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

	/** JNI method for {@link #glVertexAttrib4hNV VertexAttrib4hNV} */
	@JavadocExclude
	public static native void nglVertexAttrib4hNV(int index, short x, short y, short z, short w, long __functionAddress);

	/**
	 * 
	 *
	 * @param index 
	 * @param x     
	 * @param y     
	 * @param z     
	 * @param w     
	 */
	public static void glVertexAttrib4hNV(int index, short x, short y, short z, short w) {
		long __functionAddress = getInstance().VertexAttrib4hNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib4hNV(index, x, y, z, w, __functionAddress);
	}

	// --- [ glVertexAttrib4hvNV ] ---

	/** JNI method for {@link #glVertexAttrib4hvNV VertexAttrib4hvNV} */
	@JavadocExclude
	public static native void nglVertexAttrib4hvNV(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4hvNV VertexAttrib4hvNV} */
	@JavadocExclude
	public static void nglVertexAttrib4hvNV(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttrib4hvNV(index, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param v     
	 */
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

	/** JNI method for {@link #glVertexAttribs1hvNV VertexAttribs1hvNV} */
	@JavadocExclude
	public static native void nglVertexAttribs1hvNV(int index, int n, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribs1hvNV VertexAttribs1hvNV} */
	@JavadocExclude
	public static void nglVertexAttribs1hvNV(int index, int n, long v) {
		long __functionAddress = getInstance().VertexAttribs1hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribs1hvNV(index, n, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param n     
	 * @param v     
	 */
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

	/** JNI method for {@link #glVertexAttribs2hvNV VertexAttribs2hvNV} */
	@JavadocExclude
	public static native void nglVertexAttribs2hvNV(int index, int n, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribs2hvNV VertexAttribs2hvNV} */
	@JavadocExclude
	public static void nglVertexAttribs2hvNV(int index, int n, long v) {
		long __functionAddress = getInstance().VertexAttribs2hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribs2hvNV(index, n, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param n     
	 * @param v     
	 */
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

	/** JNI method for {@link #glVertexAttribs3hvNV VertexAttribs3hvNV} */
	@JavadocExclude
	public static native void nglVertexAttribs3hvNV(int index, int n, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribs3hvNV VertexAttribs3hvNV} */
	@JavadocExclude
	public static void nglVertexAttribs3hvNV(int index, int n, long v) {
		long __functionAddress = getInstance().VertexAttribs3hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribs3hvNV(index, n, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param n     
	 * @param v     
	 */
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

	/** JNI method for {@link #glVertexAttribs4hvNV VertexAttribs4hvNV} */
	@JavadocExclude
	public static native void nglVertexAttribs4hvNV(int index, int n, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribs4hvNV VertexAttribs4hvNV} */
	@JavadocExclude
	public static void nglVertexAttribs4hvNV(int index, int n, long v) {
		long __functionAddress = getInstance().VertexAttribs4hvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribs4hvNV(index, n, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param n     
	 * @param v     
	 */
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