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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/vertex_type_2_10_10_10_rev.txt">ARB_vertex_type_2_10_10_10_rev</a> extension.
 * 
 * <p>This extension adds two new vertex attribute data formats: a signed 2.10.10.10 and an unsigned 2.10.10.10 vertex data format. These vertex data formats
 * describe a 4 component stream which can be used to store normals or other attributes in a quantized form. Normals, tangents, binormals and other vertex
 * attributes can often be specified at reduced precision without introducing noticeable artifacts, reducing the amount of memory and memory bandwidth they consume.</p>
 * 
 * <p>Promoted to core in {@link GL33 OpenGL 3.3}.</p>
 */
public final class ARBVertexType2_10_10_10_REV {

	/**
	 * Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
	 * VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP and VertexAttribP*.
	 */
	public static final int GL_INT_2_10_10_10_REV = 0x8D9F;

	/** Function address. */
	@JavadocExclude
	public final long
		VertexP2ui,
		VertexP3ui,
		VertexP4ui,
		VertexP2uiv,
		VertexP3uiv,
		VertexP4uiv,
		TexCoordP1ui,
		TexCoordP2ui,
		TexCoordP3ui,
		TexCoordP4ui,
		TexCoordP1uiv,
		TexCoordP2uiv,
		TexCoordP3uiv,
		TexCoordP4uiv,
		MultiTexCoordP1ui,
		MultiTexCoordP2ui,
		MultiTexCoordP3ui,
		MultiTexCoordP4ui,
		MultiTexCoordP1uiv,
		MultiTexCoordP2uiv,
		MultiTexCoordP3uiv,
		MultiTexCoordP4uiv,
		NormalP3ui,
		NormalP3uiv,
		ColorP3ui,
		ColorP4ui,
		ColorP3uiv,
		ColorP4uiv,
		SecondaryColorP3ui,
		SecondaryColorP3uiv,
		VertexAttribP1ui,
		VertexAttribP2ui,
		VertexAttribP3ui,
		VertexAttribP4ui,
		VertexAttribP1uiv,
		VertexAttribP2uiv,
		VertexAttribP3uiv,
		VertexAttribP4uiv;

	@JavadocExclude
	public ARBVertexType2_10_10_10_REV(FunctionProvider provider, boolean fc) {
		VertexP2ui = GL.getFunctionAddress(provider, "glVertexP2ui", fc);
		VertexP3ui = GL.getFunctionAddress(provider, "glVertexP3ui", fc);
		VertexP4ui = GL.getFunctionAddress(provider, "glVertexP4ui", fc);
		VertexP2uiv = GL.getFunctionAddress(provider, "glVertexP2uiv", fc);
		VertexP3uiv = GL.getFunctionAddress(provider, "glVertexP3uiv", fc);
		VertexP4uiv = GL.getFunctionAddress(provider, "glVertexP4uiv", fc);
		TexCoordP1ui = GL.getFunctionAddress(provider, "glTexCoordP1ui", fc);
		TexCoordP2ui = GL.getFunctionAddress(provider, "glTexCoordP2ui", fc);
		TexCoordP3ui = GL.getFunctionAddress(provider, "glTexCoordP3ui", fc);
		TexCoordP4ui = GL.getFunctionAddress(provider, "glTexCoordP4ui", fc);
		TexCoordP1uiv = GL.getFunctionAddress(provider, "glTexCoordP1uiv", fc);
		TexCoordP2uiv = GL.getFunctionAddress(provider, "glTexCoordP2uiv", fc);
		TexCoordP3uiv = GL.getFunctionAddress(provider, "glTexCoordP3uiv", fc);
		TexCoordP4uiv = GL.getFunctionAddress(provider, "glTexCoordP4uiv", fc);
		MultiTexCoordP1ui = GL.getFunctionAddress(provider, "glMultiTexCoordP1ui", fc);
		MultiTexCoordP2ui = GL.getFunctionAddress(provider, "glMultiTexCoordP2ui", fc);
		MultiTexCoordP3ui = GL.getFunctionAddress(provider, "glMultiTexCoordP3ui", fc);
		MultiTexCoordP4ui = GL.getFunctionAddress(provider, "glMultiTexCoordP4ui", fc);
		MultiTexCoordP1uiv = GL.getFunctionAddress(provider, "glMultiTexCoordP1uiv", fc);
		MultiTexCoordP2uiv = GL.getFunctionAddress(provider, "glMultiTexCoordP2uiv", fc);
		MultiTexCoordP3uiv = GL.getFunctionAddress(provider, "glMultiTexCoordP3uiv", fc);
		MultiTexCoordP4uiv = GL.getFunctionAddress(provider, "glMultiTexCoordP4uiv", fc);
		NormalP3ui = GL.getFunctionAddress(provider, "glNormalP3ui", fc);
		NormalP3uiv = GL.getFunctionAddress(provider, "glNormalP3uiv", fc);
		ColorP3ui = GL.getFunctionAddress(provider, "glColorP3ui", fc);
		ColorP4ui = GL.getFunctionAddress(provider, "glColorP4ui", fc);
		ColorP3uiv = GL.getFunctionAddress(provider, "glColorP3uiv", fc);
		ColorP4uiv = GL.getFunctionAddress(provider, "glColorP4uiv", fc);
		SecondaryColorP3ui = GL.getFunctionAddress(provider, "glSecondaryColorP3ui", fc);
		SecondaryColorP3uiv = GL.getFunctionAddress(provider, "glSecondaryColorP3uiv", fc);
		VertexAttribP1ui = provider.getFunctionAddress("glVertexAttribP1ui");
		VertexAttribP2ui = provider.getFunctionAddress("glVertexAttribP2ui");
		VertexAttribP3ui = provider.getFunctionAddress("glVertexAttribP3ui");
		VertexAttribP4ui = provider.getFunctionAddress("glVertexAttribP4ui");
		VertexAttribP1uiv = provider.getFunctionAddress("glVertexAttribP1uiv");
		VertexAttribP2uiv = provider.getFunctionAddress("glVertexAttribP2uiv");
		VertexAttribP3uiv = provider.getFunctionAddress("glVertexAttribP3uiv");
		VertexAttribP4uiv = provider.getFunctionAddress("glVertexAttribP4uiv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBVertexType2_10_10_10_REV} instance for the current context. */
	public static ARBVertexType2_10_10_10_REV getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBVertexType2_10_10_10_REV);
	}

	static ARBVertexType2_10_10_10_REV create(java.util.Set<String> ext, FunctionProvider provider, boolean fc) {
		if ( !ext.contains("GL_ARB_vertex_type_2_10_10_10_rev") ) return null;

		ARBVertexType2_10_10_10_REV funcs = new ARBVertexType2_10_10_10_REV(provider, fc);

		boolean supported = (fc || checkFunctions(
			funcs.VertexP2ui, funcs.VertexP3ui, funcs.VertexP4ui, funcs.VertexP2uiv, funcs.VertexP3uiv, funcs.VertexP4uiv, funcs.TexCoordP1ui, 
			funcs.TexCoordP2ui, funcs.TexCoordP3ui, funcs.TexCoordP4ui, funcs.TexCoordP1uiv, funcs.TexCoordP2uiv, funcs.TexCoordP3uiv, funcs.TexCoordP4uiv, 
			funcs.MultiTexCoordP1ui, funcs.MultiTexCoordP2ui, funcs.MultiTexCoordP3ui, funcs.MultiTexCoordP4ui, funcs.MultiTexCoordP1uiv, 
			funcs.MultiTexCoordP2uiv, funcs.MultiTexCoordP3uiv, funcs.MultiTexCoordP4uiv, funcs.NormalP3ui, funcs.NormalP3uiv, funcs.ColorP3ui, funcs.ColorP4ui, 
			funcs.ColorP3uiv, funcs.ColorP4uiv, funcs.SecondaryColorP3ui, funcs.SecondaryColorP3uiv
		)) && checkFunctions(
			funcs.VertexAttribP1ui, funcs.VertexAttribP2ui, funcs.VertexAttribP3ui, funcs.VertexAttribP4ui, funcs.VertexAttribP1uiv, funcs.VertexAttribP2uiv, 
			funcs.VertexAttribP3uiv, funcs.VertexAttribP4uiv
		);

		return GL.checkExtension("GL_ARB_vertex_type_2_10_10_10_rev", funcs, supported);
	}

	// --- [ glVertexP2ui ] ---

	/**
	 * Packed component version of {@link GL11#glVertex2f Vertex2f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP2ui(int type, int value) {
		long __functionAddress = getInstance().VertexP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP2ui(type, value, __functionAddress);
	}

	// --- [ glVertexP3ui ] ---

	/**
	 * Packed component version of {@link GL11#glVertex3f Vertex3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP3ui(int type, int value) {
		long __functionAddress = getInstance().VertexP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP3ui(type, value, __functionAddress);
	}

	// --- [ glVertexP4ui ] ---

	/**
	 * Packed component version of {@link GL11#glVertex4f Vertex4f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP4ui(int type, int value) {
		long __functionAddress = getInstance().VertexP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP4ui(type, value, __functionAddress);
	}

	// --- [ glVertexP2uiv ] ---

	/** Unsafe version of {@link #glVertexP2uiv VertexP2uiv} */
	@JavadocExclude
	public static void nglVertexP2uiv(int type, long value) {
		long __functionAddress = getInstance().VertexP2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP2uiv(type, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexP2ui VertexP2ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP2uiv(int type, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexP2uiv(type, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexP2uiv VertexP2uiv} */
	public static void glVertexP2uiv(int type, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexP2uiv(type, memAddress(value));
	}

	// --- [ glVertexP3uiv ] ---

	/** Unsafe version of {@link #glVertexP3uiv VertexP3uiv} */
	@JavadocExclude
	public static void nglVertexP3uiv(int type, long value) {
		long __functionAddress = getInstance().VertexP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP3uiv(type, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexP3ui VertexP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP3uiv(int type, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexP3uiv(type, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexP3uiv VertexP3uiv} */
	public static void glVertexP3uiv(int type, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexP3uiv(type, memAddress(value));
	}

	// --- [ glVertexP4uiv ] ---

	/** Unsafe version of {@link #glVertexP4uiv VertexP4uiv} */
	@JavadocExclude
	public static void nglVertexP4uiv(int type, long value) {
		long __functionAddress = getInstance().VertexP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP4uiv(type, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexP4ui VertexP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP4uiv(int type, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexP4uiv(type, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexP4uiv VertexP4uiv} */
	public static void glVertexP4uiv(int type, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexP4uiv(type, memAddress(value));
	}

	// --- [ glTexCoordP1ui ] ---

	/**
	 * Packed component version of {@link GL11#glTexCoord1f TexCoord1f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP1ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP1ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP2ui ] ---

	/**
	 * Packed component version of {@link GL11#glTexCoord2f TexCoord2f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP2ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP2ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP3ui ] ---

	/**
	 * Packed component version of {@link GL11#glTexCoord3f TexCoord3f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP3ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP3ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP4ui ] ---

	/**
	 * Packed component version of {@link GL11#glTexCoord4f TexCoord4f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP4ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP4ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP1uiv ] ---

	/** Unsafe version of {@link #glTexCoordP1uiv TexCoordP1uiv} */
	@JavadocExclude
	public static void nglTexCoordP1uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP1uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP1uiv(type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glTexCoordP1ui TexCoordP1ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP1uiv(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP1uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP1uiv TexCoordP1uiv} */
	public static void glTexCoordP1uiv(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP1uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP2uiv ] ---

	/** Unsafe version of {@link #glTexCoordP2uiv TexCoordP2uiv} */
	@JavadocExclude
	public static void nglTexCoordP2uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP2uiv(type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glTexCoordP2ui TexCoordP2ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP2uiv(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP2uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP2uiv TexCoordP2uiv} */
	public static void glTexCoordP2uiv(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP2uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP3uiv ] ---

	/** Unsafe version of {@link #glTexCoordP3uiv TexCoordP3uiv} */
	@JavadocExclude
	public static void nglTexCoordP3uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP3uiv(type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glTexCoordP3ui TexCoordP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP3uiv(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP3uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP3uiv TexCoordP3uiv} */
	public static void glTexCoordP3uiv(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP3uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP4uiv ] ---

	/** Unsafe version of {@link #glTexCoordP4uiv TexCoordP4uiv} */
	@JavadocExclude
	public static void nglTexCoordP4uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP4uiv(type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glTexCoordP4ui TexCoordP4ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP4uiv(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP4uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP4uiv TexCoordP4uiv} */
	public static void glTexCoordP4uiv(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP4uiv(type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP1ui ] ---

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord1f MultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP1ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP2ui ] ---

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord2f MultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP2ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP3ui ] ---

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord3f MultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP3ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP4ui ] ---

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord4f MultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP4ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP1uiv ] ---

	/** Unsafe version of {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv} */
	@JavadocExclude
	public static void nglMultiTexCoordP1uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP1uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP1uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoordP1ui MultiTexCoordP1ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1uiv(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP1uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv} */
	public static void glMultiTexCoordP1uiv(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP1uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP2uiv ] ---

	/** Unsafe version of {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv} */
	@JavadocExclude
	public static void nglMultiTexCoordP2uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP2uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoordP2ui MultiTexCoordP2ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2uiv(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP2uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv} */
	public static void glMultiTexCoordP2uiv(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP2uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP3uiv ] ---

	/** Unsafe version of {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv} */
	@JavadocExclude
	public static void nglMultiTexCoordP3uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP3uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoordP3ui MultiTexCoordP3ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3uiv(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP3uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv} */
	public static void glMultiTexCoordP3uiv(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP3uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP4uiv ] ---

	/** Unsafe version of {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv} */
	@JavadocExclude
	public static void nglMultiTexCoordP4uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP4uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoordP4ui MultiTexCoordP4ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4uiv(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP4uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv} */
	public static void glMultiTexCoordP4uiv(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP4uiv(texture, type, memAddress(coords));
	}

	// --- [ glNormalP3ui ] ---

	/**
	 * Packed component version of {@link GL11#glNormal3f Normal3f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glNormalP3ui(int type, int coords) {
		long __functionAddress = getInstance().NormalP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglNormalP3ui(type, coords, __functionAddress);
	}

	// --- [ glNormalP3uiv ] ---

	/** Unsafe version of {@link #glNormalP3uiv NormalP3uiv} */
	@JavadocExclude
	public static void nglNormalP3uiv(int type, long coords) {
		long __functionAddress = getInstance().NormalP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglNormalP3uiv(type, coords, __functionAddress);
	}

	/**
	 * Pointer version {@link #glNormalP3ui NormalP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glNormalP3uiv(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglNormalP3uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glNormalP3uiv NormalP3uiv} */
	public static void glNormalP3uiv(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglNormalP3uiv(type, memAddress(coords));
	}

	// --- [ glColorP3ui ] ---

	/**
	 * Packed component version of {@link GL11#glColor3f Color3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP3ui(int type, int color) {
		long __functionAddress = getInstance().ColorP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglColorP3ui(type, color, __functionAddress);
	}

	// --- [ glColorP4ui ] ---

	/**
	 * Packed component version of {@link GL11#glColor4f Color4f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP4ui(int type, int color) {
		long __functionAddress = getInstance().ColorP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglColorP4ui(type, color, __functionAddress);
	}

	// --- [ glColorP3uiv ] ---

	/** Unsafe version of {@link #glColorP3uiv ColorP3uiv} */
	@JavadocExclude
	public static void nglColorP3uiv(int type, long color) {
		long __functionAddress = getInstance().ColorP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglColorP3uiv(type, color, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glColorP3ui ColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP3uiv(int type, ByteBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1 << 2);
		nglColorP3uiv(type, memAddress(color));
	}

	/** Alternative version of: {@link #glColorP3uiv ColorP3uiv} */
	public static void glColorP3uiv(int type, IntBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1);
		nglColorP3uiv(type, memAddress(color));
	}

	// --- [ glColorP4uiv ] ---

	/** Unsafe version of {@link #glColorP4uiv ColorP4uiv} */
	@JavadocExclude
	public static void nglColorP4uiv(int type, long color) {
		long __functionAddress = getInstance().ColorP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglColorP4uiv(type, color, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glColorP4ui ColorP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP4uiv(int type, ByteBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1 << 2);
		nglColorP4uiv(type, memAddress(color));
	}

	/** Alternative version of: {@link #glColorP4uiv ColorP4uiv} */
	public static void glColorP4uiv(int type, IntBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1);
		nglColorP4uiv(type, memAddress(color));
	}

	// --- [ glSecondaryColorP3ui ] ---

	/**
	 * Packed component version of {@link GL14#glSecondaryColor3f SecondaryColor3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3ui(int type, int color) {
		long __functionAddress = getInstance().SecondaryColorP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglSecondaryColorP3ui(type, color, __functionAddress);
	}

	// --- [ glSecondaryColorP3uiv ] ---

	/** Unsafe version of {@link #glSecondaryColorP3uiv SecondaryColorP3uiv} */
	@JavadocExclude
	public static void nglSecondaryColorP3uiv(int type, long color) {
		long __functionAddress = getInstance().SecondaryColorP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglSecondaryColorP3uiv(type, color, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glSecondaryColorP3ui SecondaryColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3uiv(int type, ByteBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1 << 2);
		nglSecondaryColorP3uiv(type, memAddress(color));
	}

	/** Alternative version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv} */
	public static void glSecondaryColorP3uiv(int type, IntBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1);
		nglSecondaryColorP3uiv(type, memAddress(color));
	}

	// --- [ glVertexAttribP1ui ] ---

	/**
	 * Packed component version of {@link GL20#glVertexAttrib1f VertexAttrib1f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP1ui;
		GL33.nglVertexAttribP1ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP2ui ] ---

	/**
	 * Packed component version of {@link GL20#glVertexAttrib2f VertexAttrib2f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP2ui;
		GL33.nglVertexAttribP2ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP3ui ] ---

	/**
	 * Packed component version of {@link GL20#glVertexAttrib3f VertexAttrib3f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP3ui;
		GL33.nglVertexAttribP3ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP4ui ] ---

	/**
	 * Packed component version of {@link GL20#glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP4ui;
		GL33.nglVertexAttribP4ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP1uiv ] ---

	/** Unsafe version of {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
	@JavadocExclude
	public static void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP1uiv;
		GL33.nglVertexAttribP1uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1uiv(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP1uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
	public static void glVertexAttribP1uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP1uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP2uiv ] ---

	/** Unsafe version of {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
	@JavadocExclude
	public static void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP2uiv;
		GL33.nglVertexAttribP2uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexAttribP2ui VertexAttribP2ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2uiv(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP2uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
	public static void glVertexAttribP2uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP2uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP3uiv ] ---

	/** Unsafe version of {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
	@JavadocExclude
	public static void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP3uiv;
		GL33.nglVertexAttribP3uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexAttribP3ui VertexAttribP3ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3uiv(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP3uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
	public static void glVertexAttribP3uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP3uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP4uiv ] ---

	/** Unsafe version of {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
	@JavadocExclude
	public static void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP4uiv;
		GL33.nglVertexAttribP4uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexAttribP4ui VertexAttribP4ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4uiv(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP4uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
	public static void glVertexAttribP4uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP4uiv(index, type, normalized, memAddress(value));
	}

}