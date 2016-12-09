/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
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
public class ARBVertexType2_10_10_10_REV {

	/**
	 * Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
	 * VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP and VertexAttribP*.
	 */
	public static final int GL_INT_2_10_10_10_REV = 0x8D9F;

	static { GL.initialize(); }

	protected ARBVertexType2_10_10_10_REV() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, boolean fc) {
		return (fc || checkFunctions(
			caps.glVertexP2ui, caps.glVertexP3ui, caps.glVertexP4ui, caps.glVertexP2uiv, caps.glVertexP3uiv, caps.glVertexP4uiv, caps.glTexCoordP1ui, 
			caps.glTexCoordP2ui, caps.glTexCoordP3ui, caps.glTexCoordP4ui, caps.glTexCoordP1uiv, caps.glTexCoordP2uiv, caps.glTexCoordP3uiv, 
			caps.glTexCoordP4uiv, caps.glMultiTexCoordP1ui, caps.glMultiTexCoordP2ui, caps.glMultiTexCoordP3ui, caps.glMultiTexCoordP4ui, 
			caps.glMultiTexCoordP1uiv, caps.glMultiTexCoordP2uiv, caps.glMultiTexCoordP3uiv, caps.glMultiTexCoordP4uiv, caps.glNormalP3ui, caps.glNormalP3uiv, 
			caps.glColorP3ui, caps.glColorP4ui, caps.glColorP3uiv, caps.glColorP4uiv, caps.glSecondaryColorP3ui, caps.glSecondaryColorP3uiv
		)) && checkFunctions(
			caps.glVertexAttribP1ui, caps.glVertexAttribP2ui, caps.glVertexAttribP3ui, caps.glVertexAttribP4ui, caps.glVertexAttribP1uiv, 
			caps.glVertexAttribP2uiv, caps.glVertexAttribP3uiv, caps.glVertexAttribP4uiv
		);
	}

	// --- [ glVertexP2ui ] ---

	/** Unsafe version of: {@link #glVertexP2ui VertexP2ui} */
	public static native void nglVertexP2ui(int type, int value);

	/**
	 * Packed component version of {@link GL11#glVertex2f Vertex2f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP2ui(int type, int value) {
		nglVertexP2ui(type, value);
	}

	// --- [ glVertexP3ui ] ---

	/** Unsafe version of: {@link #glVertexP3ui VertexP3ui} */
	public static native void nglVertexP3ui(int type, int value);

	/**
	 * Packed component version of {@link GL11#glVertex3f Vertex3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP3ui(int type, int value) {
		nglVertexP3ui(type, value);
	}

	// --- [ glVertexP4ui ] ---

	/** Unsafe version of: {@link #glVertexP4ui VertexP4ui} */
	public static native void nglVertexP4ui(int type, int value);

	/**
	 * Packed component version of {@link GL11#glVertex4f Vertex4f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP4ui(int type, int value) {
		nglVertexP4ui(type, value);
	}

	// --- [ glVertexP2uiv ] ---

	/** Unsafe version of: {@link #glVertexP2uiv VertexP2uiv} */
	public static native void nglVertexP2uiv(int type, long value);

	/**
	 * Pointer version of {@link #glVertexP2ui VertexP2ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP2uiv(int type, IntBuffer value) {
		if ( CHECKS )
			check(value, 1);
		nglVertexP2uiv(type, memAddress(value));
	}

	// --- [ glVertexP3uiv ] ---

	/** Unsafe version of: {@link #glVertexP3uiv VertexP3uiv} */
	public static native void nglVertexP3uiv(int type, long value);

	/**
	 * Pointer version of {@link #glVertexP3ui VertexP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP3uiv(int type, IntBuffer value) {
		if ( CHECKS )
			check(value, 1);
		nglVertexP3uiv(type, memAddress(value));
	}

	// --- [ glVertexP4uiv ] ---

	/** Unsafe version of: {@link #glVertexP4uiv VertexP4uiv} */
	public static native void nglVertexP4uiv(int type, long value);

	/**
	 * Pointer version of {@link #glVertexP4ui VertexP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP4uiv(int type, IntBuffer value) {
		if ( CHECKS )
			check(value, 1);
		nglVertexP4uiv(type, memAddress(value));
	}

	// --- [ glTexCoordP1ui ] ---

	/** Unsafe version of: {@link #glTexCoordP1ui TexCoordP1ui} */
	public static native void nglTexCoordP1ui(int type, int coords);

	/**
	 * Packed component version of {@link GL11#glTexCoord1f TexCoord1f}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP1ui(int type, int coords) {
		nglTexCoordP1ui(type, coords);
	}

	// --- [ glTexCoordP2ui ] ---

	/** Unsafe version of: {@link #glTexCoordP2ui TexCoordP2ui} */
	public static native void nglTexCoordP2ui(int type, int coords);

	/**
	 * Packed component version of {@link GL11#glTexCoord2f TexCoord2f}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP2ui(int type, int coords) {
		nglTexCoordP2ui(type, coords);
	}

	// --- [ glTexCoordP3ui ] ---

	/** Unsafe version of: {@link #glTexCoordP3ui TexCoordP3ui} */
	public static native void nglTexCoordP3ui(int type, int coords);

	/**
	 * Packed component version of {@link GL11#glTexCoord3f TexCoord3f}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP3ui(int type, int coords) {
		nglTexCoordP3ui(type, coords);
	}

	// --- [ glTexCoordP4ui ] ---

	/** Unsafe version of: {@link #glTexCoordP4ui TexCoordP4ui} */
	public static native void nglTexCoordP4ui(int type, int coords);

	/**
	 * Packed component version of {@link GL11#glTexCoord4f TexCoord4f}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP4ui(int type, int coords) {
		nglTexCoordP4ui(type, coords);
	}

	// --- [ glTexCoordP1uiv ] ---

	/** Unsafe version of: {@link #glTexCoordP1uiv TexCoordP1uiv} */
	public static native void nglTexCoordP1uiv(int type, long coords);

	/**
	 * Pointer version of {@link #glTexCoordP1ui TexCoordP1ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP1uiv(int type, IntBuffer coords) {
		if ( CHECKS )
			check(coords, 1);
		nglTexCoordP1uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP2uiv ] ---

	/** Unsafe version of: {@link #glTexCoordP2uiv TexCoordP2uiv} */
	public static native void nglTexCoordP2uiv(int type, long coords);

	/**
	 * Pointer version of {@link #glTexCoordP2ui TexCoordP2ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP2uiv(int type, IntBuffer coords) {
		if ( CHECKS )
			check(coords, 1);
		nglTexCoordP2uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP3uiv ] ---

	/** Unsafe version of: {@link #glTexCoordP3uiv TexCoordP3uiv} */
	public static native void nglTexCoordP3uiv(int type, long coords);

	/**
	 * Pointer version of {@link #glTexCoordP3ui TexCoordP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP3uiv(int type, IntBuffer coords) {
		if ( CHECKS )
			check(coords, 1);
		nglTexCoordP3uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP4uiv ] ---

	/** Unsafe version of: {@link #glTexCoordP4uiv TexCoordP4uiv} */
	public static native void nglTexCoordP4uiv(int type, long coords);

	/**
	 * Pointer version of {@link #glTexCoordP4ui TexCoordP4ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP4uiv(int type, IntBuffer coords) {
		if ( CHECKS )
			check(coords, 1);
		nglTexCoordP4uiv(type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP1ui ] ---

	/** Unsafe version of: {@link #glMultiTexCoordP1ui MultiTexCoordP1ui} */
	public static native void nglMultiTexCoordP1ui(int texture, int type, int coords);

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord1f MultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1ui(int texture, int type, int coords) {
		nglMultiTexCoordP1ui(texture, type, coords);
	}

	// --- [ glMultiTexCoordP2ui ] ---

	/** Unsafe version of: {@link #glMultiTexCoordP2ui MultiTexCoordP2ui} */
	public static native void nglMultiTexCoordP2ui(int texture, int type, int coords);

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord2f MultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2ui(int texture, int type, int coords) {
		nglMultiTexCoordP2ui(texture, type, coords);
	}

	// --- [ glMultiTexCoordP3ui ] ---

	/** Unsafe version of: {@link #glMultiTexCoordP3ui MultiTexCoordP3ui} */
	public static native void nglMultiTexCoordP3ui(int texture, int type, int coords);

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord3f MultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3ui(int texture, int type, int coords) {
		nglMultiTexCoordP3ui(texture, type, coords);
	}

	// --- [ glMultiTexCoordP4ui ] ---

	/** Unsafe version of: {@link #glMultiTexCoordP4ui MultiTexCoordP4ui} */
	public static native void nglMultiTexCoordP4ui(int texture, int type, int coords);

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord4f MultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4ui(int texture, int type, int coords) {
		nglMultiTexCoordP4ui(texture, type, coords);
	}

	// --- [ glMultiTexCoordP1uiv ] ---

	/** Unsafe version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv} */
	public static native void nglMultiTexCoordP1uiv(int texture, int type, long coords);

	/**
	 * Pointer version of {@link #glMultiTexCoordP1ui MultiTexCoordP1ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1uiv(int texture, int type, IntBuffer coords) {
		if ( CHECKS )
			check(coords, 1);
		nglMultiTexCoordP1uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP2uiv ] ---

	/** Unsafe version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv} */
	public static native void nglMultiTexCoordP2uiv(int texture, int type, long coords);

	/**
	 * Pointer version of {@link #glMultiTexCoordP2ui MultiTexCoordP2ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2uiv(int texture, int type, IntBuffer coords) {
		if ( CHECKS )
			check(coords, 1);
		nglMultiTexCoordP2uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP3uiv ] ---

	/** Unsafe version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv} */
	public static native void nglMultiTexCoordP3uiv(int texture, int type, long coords);

	/**
	 * Pointer version of {@link #glMultiTexCoordP3ui MultiTexCoordP3ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3uiv(int texture, int type, IntBuffer coords) {
		if ( CHECKS )
			check(coords, 1);
		nglMultiTexCoordP3uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP4uiv ] ---

	/** Unsafe version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv} */
	public static native void nglMultiTexCoordP4uiv(int texture, int type, long coords);

	/**
	 * Pointer version of {@link #glMultiTexCoordP4ui MultiTexCoordP4ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4uiv(int texture, int type, IntBuffer coords) {
		if ( CHECKS )
			check(coords, 1);
		nglMultiTexCoordP4uiv(texture, type, memAddress(coords));
	}

	// --- [ glNormalP3ui ] ---

	/** Unsafe version of: {@link #glNormalP3ui NormalP3ui} */
	public static native void nglNormalP3ui(int type, int coords);

	/**
	 * Packed component version of {@link GL11#glNormal3f Normal3f}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glNormalP3ui(int type, int coords) {
		nglNormalP3ui(type, coords);
	}

	// --- [ glNormalP3uiv ] ---

	/** Unsafe version of: {@link #glNormalP3uiv NormalP3uiv} */
	public static native void nglNormalP3uiv(int type, long coords);

	/**
	 * Pointer version {@link #glNormalP3ui NormalP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glNormalP3uiv(int type, IntBuffer coords) {
		if ( CHECKS )
			check(coords, 1);
		nglNormalP3uiv(type, memAddress(coords));
	}

	// --- [ glColorP3ui ] ---

	/** Unsafe version of: {@link #glColorP3ui ColorP3ui} */
	public static native void nglColorP3ui(int type, int color);

	/**
	 * Packed component version of {@link GL11#glColor3f Color3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glColorP3ui(int type, int color) {
		nglColorP3ui(type, color);
	}

	// --- [ glColorP4ui ] ---

	/** Unsafe version of: {@link #glColorP4ui ColorP4ui} */
	public static native void nglColorP4ui(int type, int color);

	/**
	 * Packed component version of {@link GL11#glColor4f Color4f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glColorP4ui(int type, int color) {
		nglColorP4ui(type, color);
	}

	// --- [ glColorP3uiv ] ---

	/** Unsafe version of: {@link #glColorP3uiv ColorP3uiv} */
	public static native void nglColorP3uiv(int type, long color);

	/**
	 * Pointer version of {@link #glColorP3ui ColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glColorP3uiv(int type, IntBuffer color) {
		if ( CHECKS )
			check(color, 1);
		nglColorP3uiv(type, memAddress(color));
	}

	// --- [ glColorP4uiv ] ---

	/** Unsafe version of: {@link #glColorP4uiv ColorP4uiv} */
	public static native void nglColorP4uiv(int type, long color);

	/**
	 * Pointer version of {@link #glColorP4ui ColorP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glColorP4uiv(int type, IntBuffer color) {
		if ( CHECKS )
			check(color, 1);
		nglColorP4uiv(type, memAddress(color));
	}

	// --- [ glSecondaryColorP3ui ] ---

	/** Unsafe version of: {@link #glSecondaryColorP3ui SecondaryColorP3ui} */
	public static native void nglSecondaryColorP3ui(int type, int color);

	/**
	 * Packed component version of {@link GL14#glSecondaryColor3f SecondaryColor3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3ui(int type, int color) {
		nglSecondaryColorP3ui(type, color);
	}

	// --- [ glSecondaryColorP3uiv ] ---

	/** Unsafe version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv} */
	public static native void nglSecondaryColorP3uiv(int type, long color);

	/**
	 * Pointer version of {@link #glSecondaryColorP3ui SecondaryColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3uiv(int type, IntBuffer color) {
		if ( CHECKS )
			check(color, 1);
		nglSecondaryColorP3uiv(type, memAddress(color));
	}

	// --- [ glVertexAttribP1ui ] ---

	/** Unsafe version of: {@link #glVertexAttribP1ui VertexAttribP1ui} */
	public static native void nglVertexAttribP1ui(int index, int type, boolean normalized, int value);

	/**
	 * Packed component version of {@link GL20#glVertexAttrib1f VertexAttrib1f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1ui(int index, int type, boolean normalized, int value) {
		nglVertexAttribP1ui(index, type, normalized, value);
	}

	// --- [ glVertexAttribP2ui ] ---

	/** Unsafe version of: {@link #glVertexAttribP2ui VertexAttribP2ui} */
	public static native void nglVertexAttribP2ui(int index, int type, boolean normalized, int value);

	/**
	 * Packed component version of {@link GL20#glVertexAttrib2f VertexAttrib2f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2ui(int index, int type, boolean normalized, int value) {
		nglVertexAttribP2ui(index, type, normalized, value);
	}

	// --- [ glVertexAttribP3ui ] ---

	/** Unsafe version of: {@link #glVertexAttribP3ui VertexAttribP3ui} */
	public static native void nglVertexAttribP3ui(int index, int type, boolean normalized, int value);

	/**
	 * Packed component version of {@link GL20#glVertexAttrib3f VertexAttrib3f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3ui(int index, int type, boolean normalized, int value) {
		nglVertexAttribP3ui(index, type, normalized, value);
	}

	// --- [ glVertexAttribP4ui ] ---

	/** Unsafe version of: {@link #glVertexAttribP4ui VertexAttribP4ui} */
	public static native void nglVertexAttribP4ui(int index, int type, boolean normalized, int value);

	/**
	 * Packed component version of {@link GL20#glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4ui(int index, int type, boolean normalized, int value) {
		nglVertexAttribP4ui(index, type, normalized, value);
	}

	// --- [ glVertexAttribP1uiv ] ---

	/** Unsafe version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
	public static native void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value);

	/**
	 * Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( CHECKS )
			check(value, 1);
		nglVertexAttribP1uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP2uiv ] ---

	/** Unsafe version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
	public static native void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value);

	/**
	 * Pointer version of {@link #glVertexAttribP2ui VertexAttribP2ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( CHECKS )
			check(value, 1);
		nglVertexAttribP2uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP3uiv ] ---

	/** Unsafe version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
	public static native void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value);

	/**
	 * Pointer version of {@link #glVertexAttribP3ui VertexAttribP3ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( CHECKS )
			check(value, 1);
		nglVertexAttribP3uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP4uiv ] ---

	/** Unsafe version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
	public static native void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value);

	/**
	 * Pointer version of {@link #glVertexAttribP4ui VertexAttribP4ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( CHECKS )
			check(value, 1);
		nglVertexAttribP4uiv(index, type, normalized, memAddress(value));
	}

	/** Array version of: {@link #glVertexP2uiv VertexP2uiv} */
	public static void glVertexP2uiv(int type, int[] value) {
		long __functionAddress = GL.getICD().glVertexP2uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(value, 1);
		}
		callPV(__functionAddress, type, value);
	}

	/** Array version of: {@link #glVertexP3uiv VertexP3uiv} */
	public static void glVertexP3uiv(int type, int[] value) {
		long __functionAddress = GL.getICD().glVertexP3uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(value, 1);
		}
		callPV(__functionAddress, type, value);
	}

	/** Array version of: {@link #glVertexP4uiv VertexP4uiv} */
	public static void glVertexP4uiv(int type, int[] value) {
		long __functionAddress = GL.getICD().glVertexP4uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(value, 1);
		}
		callPV(__functionAddress, type, value);
	}

	/** Array version of: {@link #glTexCoordP1uiv TexCoordP1uiv} */
	public static void glTexCoordP1uiv(int type, int[] coords) {
		long __functionAddress = GL.getICD().glTexCoordP1uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 1);
		}
		callPV(__functionAddress, type, coords);
	}

	/** Array version of: {@link #glTexCoordP2uiv TexCoordP2uiv} */
	public static void glTexCoordP2uiv(int type, int[] coords) {
		long __functionAddress = GL.getICD().glTexCoordP2uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 1);
		}
		callPV(__functionAddress, type, coords);
	}

	/** Array version of: {@link #glTexCoordP3uiv TexCoordP3uiv} */
	public static void glTexCoordP3uiv(int type, int[] coords) {
		long __functionAddress = GL.getICD().glTexCoordP3uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 1);
		}
		callPV(__functionAddress, type, coords);
	}

	/** Array version of: {@link #glTexCoordP4uiv TexCoordP4uiv} */
	public static void glTexCoordP4uiv(int type, int[] coords) {
		long __functionAddress = GL.getICD().glTexCoordP4uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 1);
		}
		callPV(__functionAddress, type, coords);
	}

	/** Array version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv} */
	public static void glMultiTexCoordP1uiv(int texture, int type, int[] coords) {
		long __functionAddress = GL.getICD().glMultiTexCoordP1uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 1);
		}
		callPV(__functionAddress, texture, type, coords);
	}

	/** Array version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv} */
	public static void glMultiTexCoordP2uiv(int texture, int type, int[] coords) {
		long __functionAddress = GL.getICD().glMultiTexCoordP2uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 1);
		}
		callPV(__functionAddress, texture, type, coords);
	}

	/** Array version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv} */
	public static void glMultiTexCoordP3uiv(int texture, int type, int[] coords) {
		long __functionAddress = GL.getICD().glMultiTexCoordP3uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 1);
		}
		callPV(__functionAddress, texture, type, coords);
	}

	/** Array version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv} */
	public static void glMultiTexCoordP4uiv(int texture, int type, int[] coords) {
		long __functionAddress = GL.getICD().glMultiTexCoordP4uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 1);
		}
		callPV(__functionAddress, texture, type, coords);
	}

	/** Array version of: {@link #glNormalP3uiv NormalP3uiv} */
	public static void glNormalP3uiv(int type, int[] coords) {
		long __functionAddress = GL.getICD().glNormalP3uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 1);
		}
		callPV(__functionAddress, type, coords);
	}

	/** Array version of: {@link #glColorP3uiv ColorP3uiv} */
	public static void glColorP3uiv(int type, int[] color) {
		long __functionAddress = GL.getICD().glColorP3uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(color, 1);
		}
		callPV(__functionAddress, type, color);
	}

	/** Array version of: {@link #glColorP4uiv ColorP4uiv} */
	public static void glColorP4uiv(int type, int[] color) {
		long __functionAddress = GL.getICD().glColorP4uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(color, 1);
		}
		callPV(__functionAddress, type, color);
	}

	/** Array version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv} */
	public static void glSecondaryColorP3uiv(int type, int[] color) {
		long __functionAddress = GL.getICD().glSecondaryColorP3uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(color, 1);
		}
		callPV(__functionAddress, type, color);
	}

	/** Array version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
	public static void glVertexAttribP1uiv(int index, int type, boolean normalized, int[] value) {
		long __functionAddress = GL.getICD().glVertexAttribP1uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(value, 1);
		}
		callPV(__functionAddress, index, type, normalized, value);
	}

	/** Array version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
	public static void glVertexAttribP2uiv(int index, int type, boolean normalized, int[] value) {
		long __functionAddress = GL.getICD().glVertexAttribP2uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(value, 1);
		}
		callPV(__functionAddress, index, type, normalized, value);
	}

	/** Array version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
	public static void glVertexAttribP3uiv(int index, int type, boolean normalized, int[] value) {
		long __functionAddress = GL.getICD().glVertexAttribP3uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(value, 1);
		}
		callPV(__functionAddress, index, type, normalized, value);
	}

	/** Array version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
	public static void glVertexAttribP4uiv(int index, int type, boolean normalized, int[] value) {
		long __functionAddress = GL.getICD().glVertexAttribP4uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(value, 1);
		}
		callPV(__functionAddress, index, type, normalized, value);
	}

}