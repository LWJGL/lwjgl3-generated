/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/multitexture.txt">ARB_multitexture</a> extension.
 * 
 * <p>This extension allows application of multiple textures to a fragment in one rendering pass.</p>
 * 
 * <p>Promoted to core in {@link GL13 OpenGL 1.3}.</p>
 */
public class ARBMultitexture {

	/** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord. */
	public static final int
		GL_TEXTURE0_ARB  = 0x84C0,
		GL_TEXTURE1_ARB  = 0x84C1,
		GL_TEXTURE2_ARB  = 0x84C2,
		GL_TEXTURE3_ARB  = 0x84C3,
		GL_TEXTURE4_ARB  = 0x84C4,
		GL_TEXTURE5_ARB  = 0x84C5,
		GL_TEXTURE6_ARB  = 0x84C6,
		GL_TEXTURE7_ARB  = 0x84C7,
		GL_TEXTURE8_ARB  = 0x84C8,
		GL_TEXTURE9_ARB  = 0x84C9,
		GL_TEXTURE10_ARB = 0x84CA,
		GL_TEXTURE11_ARB = 0x84CB,
		GL_TEXTURE12_ARB = 0x84CC,
		GL_TEXTURE13_ARB = 0x84CD,
		GL_TEXTURE14_ARB = 0x84CE,
		GL_TEXTURE15_ARB = 0x84CF,
		GL_TEXTURE16_ARB = 0x84D0,
		GL_TEXTURE17_ARB = 0x84D1,
		GL_TEXTURE18_ARB = 0x84D2,
		GL_TEXTURE19_ARB = 0x84D3,
		GL_TEXTURE20_ARB = 0x84D4,
		GL_TEXTURE21_ARB = 0x84D5,
		GL_TEXTURE22_ARB = 0x84D6,
		GL_TEXTURE23_ARB = 0x84D7,
		GL_TEXTURE24_ARB = 0x84D8,
		GL_TEXTURE25_ARB = 0x84D9,
		GL_TEXTURE26_ARB = 0x84DA,
		GL_TEXTURE27_ARB = 0x84DB,
		GL_TEXTURE28_ARB = 0x84DC,
		GL_TEXTURE29_ARB = 0x84DD,
		GL_TEXTURE30_ARB = 0x84DE,
		GL_TEXTURE31_ARB = 0x84DF;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_ACTIVE_TEXTURE_ARB        = 0x84E0,
		GL_CLIENT_ACTIVE_TEXTURE_ARB = 0x84E1,
		GL_MAX_TEXTURE_UNITS_ARB     = 0x84E2;

	protected ARBMultitexture() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glActiveTextureARB, caps.glClientActiveTextureARB, caps.glMultiTexCoord1fARB, caps.glMultiTexCoord1sARB, caps.glMultiTexCoord1iARB, 
			caps.glMultiTexCoord1dARB, caps.glMultiTexCoord1fvARB, caps.glMultiTexCoord1svARB, caps.glMultiTexCoord1ivARB, caps.glMultiTexCoord1dvARB, 
			caps.glMultiTexCoord2fARB, caps.glMultiTexCoord2sARB, caps.glMultiTexCoord2iARB, caps.glMultiTexCoord2dARB, caps.glMultiTexCoord2fvARB, 
			caps.glMultiTexCoord2svARB, caps.glMultiTexCoord2ivARB, caps.glMultiTexCoord2dvARB, caps.glMultiTexCoord3fARB, caps.glMultiTexCoord3sARB, 
			caps.glMultiTexCoord3iARB, caps.glMultiTexCoord3dARB, caps.glMultiTexCoord3fvARB, caps.glMultiTexCoord3svARB, caps.glMultiTexCoord3ivARB, 
			caps.glMultiTexCoord3dvARB, caps.glMultiTexCoord4fARB, caps.glMultiTexCoord4sARB, caps.glMultiTexCoord4iARB, caps.glMultiTexCoord4dARB, 
			caps.glMultiTexCoord4fvARB, caps.glMultiTexCoord4svARB, caps.glMultiTexCoord4ivARB, caps.glMultiTexCoord4dvARB
		);
	}

	// --- [ glActiveTextureARB ] ---

	/**
	 * Selects which texture unit subsequent texture state calls will affect. The number of texture units an implementation supports is implementation
	 * dependent.
	 *
	 * @param texture which texture unit to make active. One of:<br><table><tr><td>{@link #GL_TEXTURE0_ARB TEXTURE0_ARB}</td><td>GL_TEXTURE[1-31]</td></tr></table>
	 */
	public static void glActiveTextureARB(int texture) {
		long __functionAddress = GL.getCapabilities().glActiveTextureARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture);
	}

	// --- [ glClientActiveTextureARB ] ---

	/**
	 * Selects the vertex array client state parameters to be modified by the TexCoordPointer command and the array affected by EnableClientState and
	 * DisableClientState with parameter TEXTURE_COORD_ARRAY.
	 *
	 * @param texture which texture coordinate array to make active. One of:<br><table><tr><td>{@link #GL_TEXTURE0_ARB TEXTURE0_ARB}</td><td>GL_TEXTURE[1-31]</td></tr></table>
	 */
	public static void glClientActiveTextureARB(int texture) {
		long __functionAddress = GL.getCapabilities().glClientActiveTextureARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture);
	}

	// --- [ glMultiTexCoord1fARB ] ---

	/**
	 * Sets the current one-dimensional texture coordinate for the specified texture coordinate set. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1fARB(int texture, float s) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s);
	}

	// --- [ glMultiTexCoord1sARB ] ---

	/**
	 * Short version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1sARB(int texture, short s) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s);
	}

	// --- [ glMultiTexCoord1iARB ] ---

	/**
	 * Integer version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1iARB(int texture, int s) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1iARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s);
	}

	// --- [ glMultiTexCoord1dARB ] ---

	/**
	 * Double version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1dARB(int texture, double s) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s);
	}

	// --- [ glMultiTexCoord1fvARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord1fvARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1fvARB(int texture, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1svARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord1sARB MultiTexCoord1sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord1svARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1sARB MultiTexCoord1sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1svARB(int texture, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1ivARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord1iARB MultiTexCoord1iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord1ivARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1ivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1iARB MultiTexCoord1iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1ivARB(int texture, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1dvARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord1dARB MultiTexCoord1dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord1dvARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1dARB MultiTexCoord1dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1dvARB(int texture, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1dvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2fARB ] ---

	/**
	 * Sets the current two-dimensional texture coordinate for the specified texture coordinate set. {@code r} is implicitly set to 0 and {@code q} to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2fARB(int texture, float s, float t) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t);
	}

	// --- [ glMultiTexCoord2sARB ] ---

	/**
	 * Short version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2sARB(int texture, short s, short t) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t);
	}

	// --- [ glMultiTexCoord2iARB ] ---

	/**
	 * Integer version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2iARB(int texture, int s, int t) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2iARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t);
	}

	// --- [ glMultiTexCoord2dARB ] ---

	/**
	 * Double version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2dARB(int texture, double s, double t) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t);
	}

	// --- [ glMultiTexCoord2fvARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord2fvARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2fvARB(int texture, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2svARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord2sARB MultiTexCoord2sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord2svARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2sARB MultiTexCoord2sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2svARB(int texture, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2ivARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord2iARB MultiTexCoord2iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord2ivARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2ivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2iARB MultiTexCoord2iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2ivARB(int texture, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2dvARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord2dARB MultiTexCoord2dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord2dvARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2dARB MultiTexCoord2dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2dvARB(int texture, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2dvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3fARB ] ---

	/**
	 * Sets the current three-dimensional texture coordinate for the specified texture coordinate set. {@code q} is implicitly set to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static void glMultiTexCoord3fARB(int texture, float s, float t, float r) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t, r);
	}

	// --- [ glMultiTexCoord3sARB ] ---

	/**
	 * Short version of {@link #glMultiTexCoord3fARB MultiTexCoord3fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static void glMultiTexCoord3sARB(int texture, short s, short t, short r) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t, r);
	}

	// --- [ glMultiTexCoord3iARB ] ---

	/**
	 * Integer version of {@link #glMultiTexCoord3fARB MultiTexCoord3fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static void glMultiTexCoord3iARB(int texture, int s, int t, int r) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3iARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t, r);
	}

	// --- [ glMultiTexCoord3dARB ] ---

	/**
	 * Double version of {@link #glMultiTexCoord3fARB MultiTexCoord3fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 */
	public static void glMultiTexCoord3dARB(int texture, double s, double t, double r) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t, r);
	}

	// --- [ glMultiTexCoord3fvARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord3fARB MultiTexCoord3fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord3fvARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3fARB MultiTexCoord3fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3fvARB(int texture, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3svARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord3sARB MultiTexCoord3sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord3svARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3sARB MultiTexCoord3sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3svARB(int texture, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3ivARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord3iARB MultiTexCoord3iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord3ivARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3ivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3iARB MultiTexCoord3iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3ivARB(int texture, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3dvARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord3dARB MultiTexCoord3dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord3dvARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3dARB MultiTexCoord3dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3dvARB(int texture, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3dvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4fARB ] ---

	/**
	 * Sets the current four-dimensional texture coordinate for the specified texture coordinate set.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static void glMultiTexCoord4fARB(int texture, float s, float t, float r, float q) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t, r, q);
	}

	// --- [ glMultiTexCoord4sARB ] ---

	/**
	 * Short version of {@link #glMultiTexCoord4fARB MultiTexCoord4fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static void glMultiTexCoord4sARB(int texture, short s, short t, short r, short q) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t, r, q);
	}

	// --- [ glMultiTexCoord4iARB ] ---

	/**
	 * Integer version of {@link #glMultiTexCoord4fARB MultiTexCoord4fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static void glMultiTexCoord4iARB(int texture, int s, int t, int r, int q) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4iARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t, r, q);
	}

	// --- [ glMultiTexCoord4dARB ] ---

	/**
	 * Double version of {@link #glMultiTexCoord4fARB MultiTexCoord4fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 * @param r       the r component of the current texture coordinates
	 * @param q       the q component of the current texture coordinates
	 */
	public static void glMultiTexCoord4dARB(int texture, double s, double t, double r, double q) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, s, t, r, q);
	}

	// --- [ glMultiTexCoord4fvARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord4fARB MultiTexCoord4fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord4fvARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4fARB MultiTexCoord4fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4fvARB(int texture, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4svARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord4sARB MultiTexCoord4sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord4svARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4sARB MultiTexCoord4sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4svARB(int texture, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4ivARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord4iARB MultiTexCoord4iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord4ivARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4ivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4iARB MultiTexCoord4iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4ivARB(int texture, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4dvARB ] ---

	/**
	 * Pointer version of {@link #glMultiTexCoord4dARB MultiTexCoord4dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void nglMultiTexCoord4dvARB(int texture, long v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4dARB MultiTexCoord4dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4dvARB(int texture, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4dvARB(texture, memAddress(v));
	}

	/** Array version of: {@link #glMultiTexCoord1fvARB MultiTexCoord1fvARB} */
	public static void glMultiTexCoord1fvARB(int texture, float[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1fvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord1svARB MultiTexCoord1svARB} */
	public static void glMultiTexCoord1svARB(int texture, short[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1svARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord1ivARB MultiTexCoord1ivARB} */
	public static void glMultiTexCoord1ivARB(int texture, int[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1ivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord1dvARB MultiTexCoord1dvARB} */
	public static void glMultiTexCoord1dvARB(int texture, double[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord1dvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord2fvARB MultiTexCoord2fvARB} */
	public static void glMultiTexCoord2fvARB(int texture, float[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2fvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord2svARB MultiTexCoord2svARB} */
	public static void glMultiTexCoord2svARB(int texture, short[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2svARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord2ivARB MultiTexCoord2ivARB} */
	public static void glMultiTexCoord2ivARB(int texture, int[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2ivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord2dvARB MultiTexCoord2dvARB} */
	public static void glMultiTexCoord2dvARB(int texture, double[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord2dvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord3fvARB MultiTexCoord3fvARB} */
	public static void glMultiTexCoord3fvARB(int texture, float[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3fvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord3svARB MultiTexCoord3svARB} */
	public static void glMultiTexCoord3svARB(int texture, short[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3svARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord3ivARB MultiTexCoord3ivARB} */
	public static void glMultiTexCoord3ivARB(int texture, int[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3ivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord3dvARB MultiTexCoord3dvARB} */
	public static void glMultiTexCoord3dvARB(int texture, double[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord3dvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord4fvARB MultiTexCoord4fvARB} */
	public static void glMultiTexCoord4fvARB(int texture, float[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4fvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord4svARB MultiTexCoord4svARB} */
	public static void glMultiTexCoord4svARB(int texture, short[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4svARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord4ivARB MultiTexCoord4ivARB} */
	public static void glMultiTexCoord4ivARB(int texture, int[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4ivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, texture, v);
	}

	/** Array version of: {@link #glMultiTexCoord4dvARB MultiTexCoord4dvARB} */
	public static void glMultiTexCoord4dvARB(int texture, double[] v) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoord4dvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, texture, v);
	}

}