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

	/** Function address. */
	public final long
		ActiveTextureARB,
		ClientActiveTextureARB,
		MultiTexCoord1fARB,
		MultiTexCoord1sARB,
		MultiTexCoord1iARB,
		MultiTexCoord1dARB,
		MultiTexCoord1fvARB,
		MultiTexCoord1svARB,
		MultiTexCoord1ivARB,
		MultiTexCoord1dvARB,
		MultiTexCoord2fARB,
		MultiTexCoord2sARB,
		MultiTexCoord2iARB,
		MultiTexCoord2dARB,
		MultiTexCoord2fvARB,
		MultiTexCoord2svARB,
		MultiTexCoord2ivARB,
		MultiTexCoord2dvARB,
		MultiTexCoord3fARB,
		MultiTexCoord3sARB,
		MultiTexCoord3iARB,
		MultiTexCoord3dARB,
		MultiTexCoord3fvARB,
		MultiTexCoord3svARB,
		MultiTexCoord3ivARB,
		MultiTexCoord3dvARB,
		MultiTexCoord4fARB,
		MultiTexCoord4sARB,
		MultiTexCoord4iARB,
		MultiTexCoord4dARB,
		MultiTexCoord4fvARB,
		MultiTexCoord4svARB,
		MultiTexCoord4ivARB,
		MultiTexCoord4dvARB;

	protected ARBMultitexture() {
		throw new UnsupportedOperationException();
	}

	public ARBMultitexture(FunctionProvider provider) {
		ActiveTextureARB = provider.getFunctionAddress("glActiveTextureARB");
		ClientActiveTextureARB = provider.getFunctionAddress("glClientActiveTextureARB");
		MultiTexCoord1fARB = provider.getFunctionAddress("glMultiTexCoord1fARB");
		MultiTexCoord1sARB = provider.getFunctionAddress("glMultiTexCoord1sARB");
		MultiTexCoord1iARB = provider.getFunctionAddress("glMultiTexCoord1iARB");
		MultiTexCoord1dARB = provider.getFunctionAddress("glMultiTexCoord1dARB");
		MultiTexCoord1fvARB = provider.getFunctionAddress("glMultiTexCoord1fvARB");
		MultiTexCoord1svARB = provider.getFunctionAddress("glMultiTexCoord1svARB");
		MultiTexCoord1ivARB = provider.getFunctionAddress("glMultiTexCoord1ivARB");
		MultiTexCoord1dvARB = provider.getFunctionAddress("glMultiTexCoord1dvARB");
		MultiTexCoord2fARB = provider.getFunctionAddress("glMultiTexCoord2fARB");
		MultiTexCoord2sARB = provider.getFunctionAddress("glMultiTexCoord2sARB");
		MultiTexCoord2iARB = provider.getFunctionAddress("glMultiTexCoord2iARB");
		MultiTexCoord2dARB = provider.getFunctionAddress("glMultiTexCoord2dARB");
		MultiTexCoord2fvARB = provider.getFunctionAddress("glMultiTexCoord2fvARB");
		MultiTexCoord2svARB = provider.getFunctionAddress("glMultiTexCoord2svARB");
		MultiTexCoord2ivARB = provider.getFunctionAddress("glMultiTexCoord2ivARB");
		MultiTexCoord2dvARB = provider.getFunctionAddress("glMultiTexCoord2dvARB");
		MultiTexCoord3fARB = provider.getFunctionAddress("glMultiTexCoord3fARB");
		MultiTexCoord3sARB = provider.getFunctionAddress("glMultiTexCoord3sARB");
		MultiTexCoord3iARB = provider.getFunctionAddress("glMultiTexCoord3iARB");
		MultiTexCoord3dARB = provider.getFunctionAddress("glMultiTexCoord3dARB");
		MultiTexCoord3fvARB = provider.getFunctionAddress("glMultiTexCoord3fvARB");
		MultiTexCoord3svARB = provider.getFunctionAddress("glMultiTexCoord3svARB");
		MultiTexCoord3ivARB = provider.getFunctionAddress("glMultiTexCoord3ivARB");
		MultiTexCoord3dvARB = provider.getFunctionAddress("glMultiTexCoord3dvARB");
		MultiTexCoord4fARB = provider.getFunctionAddress("glMultiTexCoord4fARB");
		MultiTexCoord4sARB = provider.getFunctionAddress("glMultiTexCoord4sARB");
		MultiTexCoord4iARB = provider.getFunctionAddress("glMultiTexCoord4iARB");
		MultiTexCoord4dARB = provider.getFunctionAddress("glMultiTexCoord4dARB");
		MultiTexCoord4fvARB = provider.getFunctionAddress("glMultiTexCoord4fvARB");
		MultiTexCoord4svARB = provider.getFunctionAddress("glMultiTexCoord4svARB");
		MultiTexCoord4ivARB = provider.getFunctionAddress("glMultiTexCoord4ivARB");
		MultiTexCoord4dvARB = provider.getFunctionAddress("glMultiTexCoord4dvARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBMultitexture} instance of the current context. */
	public static ARBMultitexture getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link ARBMultitexture} instance of the specified {@link GLCapabilities}. */
	public static ARBMultitexture getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__ARBMultitexture);
	}

	static ARBMultitexture create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_multitexture") ) return null;

		ARBMultitexture funcs = new ARBMultitexture(provider);

		boolean supported = checkFunctions(
			funcs.ActiveTextureARB, funcs.ClientActiveTextureARB, funcs.MultiTexCoord1fARB, funcs.MultiTexCoord1sARB, funcs.MultiTexCoord1iARB, 
			funcs.MultiTexCoord1dARB, funcs.MultiTexCoord1fvARB, funcs.MultiTexCoord1svARB, funcs.MultiTexCoord1ivARB, funcs.MultiTexCoord1dvARB, 
			funcs.MultiTexCoord2fARB, funcs.MultiTexCoord2sARB, funcs.MultiTexCoord2iARB, funcs.MultiTexCoord2dARB, funcs.MultiTexCoord2fvARB, 
			funcs.MultiTexCoord2svARB, funcs.MultiTexCoord2ivARB, funcs.MultiTexCoord2dvARB, funcs.MultiTexCoord3fARB, funcs.MultiTexCoord3sARB, 
			funcs.MultiTexCoord3iARB, funcs.MultiTexCoord3dARB, funcs.MultiTexCoord3fvARB, funcs.MultiTexCoord3svARB, funcs.MultiTexCoord3ivARB, 
			funcs.MultiTexCoord3dvARB, funcs.MultiTexCoord4fARB, funcs.MultiTexCoord4sARB, funcs.MultiTexCoord4iARB, funcs.MultiTexCoord4dARB, 
			funcs.MultiTexCoord4fvARB, funcs.MultiTexCoord4svARB, funcs.MultiTexCoord4ivARB, funcs.MultiTexCoord4dvARB
		);

		return GL.checkExtension("GL_ARB_multitexture", funcs, supported);
	}

	// --- [ glActiveTextureARB ] ---

	/**
	 * Selects which texture unit subsequent texture state calls will affect. The number of texture units an implementation supports is implementation
	 * dependent.
	 *
	 * @param texture which texture unit to make active. One of:<br>{@link #GL_TEXTURE0_ARB TEXTURE0_ARB}, GL_TEXTURE[1-31]
	 */
	public static void glActiveTextureARB(int texture) {
		long __functionAddress = getInstance().ActiveTextureARB;
		callIV(__functionAddress, texture);
	}

	// --- [ glClientActiveTextureARB ] ---

	/**
	 * Selects the vertex array client state parameters to be modified by the TexCoordPointer command and the array affected by EnableClientState and
	 * DisableClientState with parameter TEXTURE_COORD_ARRAY.
	 *
	 * @param texture which texture coordinate array to make active. One of:<br>{@link #GL_TEXTURE0_ARB TEXTURE0_ARB}, GL_TEXTURE[1-31]
	 */
	public static void glClientActiveTextureARB(int texture) {
		long __functionAddress = getInstance().ClientActiveTextureARB;
		callIV(__functionAddress, texture);
	}

	// --- [ glMultiTexCoord1fARB ] ---

	/**
	 * Sets the current one-dimensional texture coordinate for the specified texture coordinate set. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1fARB(int texture, float s) {
		long __functionAddress = getInstance().MultiTexCoord1fARB;
		callIFV(__functionAddress, texture, s);
	}

	// --- [ glMultiTexCoord1sARB ] ---

	/**
	 * Short version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1sARB(int texture, short s) {
		long __functionAddress = getInstance().MultiTexCoord1sARB;
		callISV(__functionAddress, texture, s);
	}

	// --- [ glMultiTexCoord1iARB ] ---

	/**
	 * Integer version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1iARB(int texture, int s) {
		long __functionAddress = getInstance().MultiTexCoord1iARB;
		callIIV(__functionAddress, texture, s);
	}

	// --- [ glMultiTexCoord1dARB ] ---

	/**
	 * Double version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1dARB(int texture, double s) {
		long __functionAddress = getInstance().MultiTexCoord1dARB;
		callIDV(__functionAddress, texture, s);
	}

	// --- [ glMultiTexCoord1fvARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord1fvARB MultiTexCoord1fvARB} */
	public static void nglMultiTexCoord1fvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord1fvARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1fvARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1 << 2);
		nglMultiTexCoord1fvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord1fvARB MultiTexCoord1fvARB} */
	public static void glMultiTexCoord1fvARB(int texture, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1svARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord1svARB MultiTexCoord1svARB} */
	public static void nglMultiTexCoord1svARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord1svARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1sARB MultiTexCoord1sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1svARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1 << 1);
		nglMultiTexCoord1svARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord1svARB MultiTexCoord1svARB} */
	public static void glMultiTexCoord1svARB(int texture, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1ivARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord1ivARB MultiTexCoord1ivARB} */
	public static void nglMultiTexCoord1ivARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord1ivARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1iARB MultiTexCoord1iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1ivARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1 << 2);
		nglMultiTexCoord1ivARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord1ivARB MultiTexCoord1ivARB} */
	public static void glMultiTexCoord1ivARB(int texture, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1dvARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord1dvARB MultiTexCoord1dvARB} */
	public static void nglMultiTexCoord1dvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord1dvARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1dARB MultiTexCoord1dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1dvARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1 << 3);
		nglMultiTexCoord1dvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord1dvARB MultiTexCoord1dvARB} */
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
		long __functionAddress = getInstance().MultiTexCoord2fARB;
		callIFFV(__functionAddress, texture, s, t);
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
		long __functionAddress = getInstance().MultiTexCoord2sARB;
		callISSV(__functionAddress, texture, s, t);
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
		long __functionAddress = getInstance().MultiTexCoord2iARB;
		callIIIV(__functionAddress, texture, s, t);
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
		long __functionAddress = getInstance().MultiTexCoord2dARB;
		callIDDV(__functionAddress, texture, s, t);
	}

	// --- [ glMultiTexCoord2fvARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord2fvARB MultiTexCoord2fvARB} */
	public static void nglMultiTexCoord2fvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord2fvARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2fvARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2 << 2);
		nglMultiTexCoord2fvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord2fvARB MultiTexCoord2fvARB} */
	public static void glMultiTexCoord2fvARB(int texture, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2svARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord2svARB MultiTexCoord2svARB} */
	public static void nglMultiTexCoord2svARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord2svARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2sARB MultiTexCoord2sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2svARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2 << 1);
		nglMultiTexCoord2svARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord2svARB MultiTexCoord2svARB} */
	public static void glMultiTexCoord2svARB(int texture, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2ivARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord2ivARB MultiTexCoord2ivARB} */
	public static void nglMultiTexCoord2ivARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord2ivARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2iARB MultiTexCoord2iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2ivARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2 << 2);
		nglMultiTexCoord2ivARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord2ivARB MultiTexCoord2ivARB} */
	public static void glMultiTexCoord2ivARB(int texture, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2dvARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord2dvARB MultiTexCoord2dvARB} */
	public static void nglMultiTexCoord2dvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord2dvARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2dARB MultiTexCoord2dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2dvARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2 << 3);
		nglMultiTexCoord2dvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord2dvARB MultiTexCoord2dvARB} */
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
		long __functionAddress = getInstance().MultiTexCoord3fARB;
		callIFFFV(__functionAddress, texture, s, t, r);
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
		long __functionAddress = getInstance().MultiTexCoord3sARB;
		callISSSV(__functionAddress, texture, s, t, r);
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
		long __functionAddress = getInstance().MultiTexCoord3iARB;
		callIIIIV(__functionAddress, texture, s, t, r);
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
		long __functionAddress = getInstance().MultiTexCoord3dARB;
		callIDDDV(__functionAddress, texture, s, t, r);
	}

	// --- [ glMultiTexCoord3fvARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord3fvARB MultiTexCoord3fvARB} */
	public static void nglMultiTexCoord3fvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord3fvARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3fARB MultiTexCoord3fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3fvARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3 << 2);
		nglMultiTexCoord3fvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord3fvARB MultiTexCoord3fvARB} */
	public static void glMultiTexCoord3fvARB(int texture, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3svARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord3svARB MultiTexCoord3svARB} */
	public static void nglMultiTexCoord3svARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord3svARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3sARB MultiTexCoord3sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3svARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3 << 1);
		nglMultiTexCoord3svARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord3svARB MultiTexCoord3svARB} */
	public static void glMultiTexCoord3svARB(int texture, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3ivARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord3ivARB MultiTexCoord3ivARB} */
	public static void nglMultiTexCoord3ivARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord3ivARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3iARB MultiTexCoord3iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3ivARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3 << 2);
		nglMultiTexCoord3ivARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord3ivARB MultiTexCoord3ivARB} */
	public static void glMultiTexCoord3ivARB(int texture, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3dvARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord3dvARB MultiTexCoord3dvARB} */
	public static void nglMultiTexCoord3dvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord3dvARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3dARB MultiTexCoord3dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3dvARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3 << 3);
		nglMultiTexCoord3dvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord3dvARB MultiTexCoord3dvARB} */
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
		long __functionAddress = getInstance().MultiTexCoord4fARB;
		callIFFFFV(__functionAddress, texture, s, t, r, q);
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
		long __functionAddress = getInstance().MultiTexCoord4sARB;
		callISSSSV(__functionAddress, texture, s, t, r, q);
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
		long __functionAddress = getInstance().MultiTexCoord4iARB;
		callIIIIIV(__functionAddress, texture, s, t, r, q);
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
		long __functionAddress = getInstance().MultiTexCoord4dARB;
		callIDDDDV(__functionAddress, texture, s, t, r, q);
	}

	// --- [ glMultiTexCoord4fvARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord4fvARB MultiTexCoord4fvARB} */
	public static void nglMultiTexCoord4fvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord4fvARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4fARB MultiTexCoord4fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4fvARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4 << 2);
		nglMultiTexCoord4fvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord4fvARB MultiTexCoord4fvARB} */
	public static void glMultiTexCoord4fvARB(int texture, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4svARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord4svARB MultiTexCoord4svARB} */
	public static void nglMultiTexCoord4svARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord4svARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4sARB MultiTexCoord4sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4svARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4 << 1);
		nglMultiTexCoord4svARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord4svARB MultiTexCoord4svARB} */
	public static void glMultiTexCoord4svARB(int texture, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4ivARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord4ivARB MultiTexCoord4ivARB} */
	public static void nglMultiTexCoord4ivARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord4ivARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4iARB MultiTexCoord4iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4ivARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4 << 2);
		nglMultiTexCoord4ivARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord4ivARB MultiTexCoord4ivARB} */
	public static void glMultiTexCoord4ivARB(int texture, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4dvARB ] ---

	/** Unsafe version of {@link #glMultiTexCoord4dvARB MultiTexCoord4dvARB} */
	public static void nglMultiTexCoord4dvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord4dvARB;
		callIPV(__functionAddress, texture, v);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4dARB MultiTexCoord4dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4dvARB(int texture, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4 << 3);
		nglMultiTexCoord4dvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord4dvARB MultiTexCoord4dvARB} */
	public static void glMultiTexCoord4dvARB(int texture, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4dvARB(texture, memAddress(v));
	}

}