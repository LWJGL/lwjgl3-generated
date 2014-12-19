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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/multitexture.txt">ARB_multitexture</a> extension.
 * 
 * <p>This extension allows application of multiple textures to a fragment in one rendering pass.</p>
 * 
 * <p>Promoted to core in {@link GL13 OpenGL 1.3}.</p>
 */
public final class ARBMultitexture {

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
	@JavadocExclude
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

	@JavadocExclude
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

	/** Returns the {@link ARBMultitexture} instance for the current context. */
	public static ARBMultitexture getInstance() {
		return GL.getCapabilities().__ARBMultitexture;
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

	/** JNI method for {@link #glActiveTextureARB ActiveTextureARB} */
	@JavadocExclude
	public static native void nglActiveTextureARB(int texture, long __functionAddress);

	/**
	 * Selects which texture unit subsequent texture state calls will affect. The number of texture units an implementation supports is implementation
	 * dependent.
	 *
	 * @param texture which texture unit to make active. One of:<br>{@link #GL_TEXTURE0_ARB TEXTURE0_ARB}, GL_TEXTURE[1-31]
	 */
	public static void glActiveTextureARB(int texture) {
		long __functionAddress = getInstance().ActiveTextureARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglActiveTextureARB(texture, __functionAddress);
	}

	// --- [ glClientActiveTextureARB ] ---

	/** JNI method for {@link #glClientActiveTextureARB ClientActiveTextureARB} */
	@JavadocExclude
	public static native void nglClientActiveTextureARB(int texture, long __functionAddress);

	/**
	 * Selects the vertex array client state parameters to be modified by the TexCoordPointer command and the array affected by EnableClientState and
	 * DisableClientState with parameter TEXTURE_COORD_ARRAY.
	 *
	 * @param texture which texture coordinate array to make active. One of:<br>{@link #GL_TEXTURE0_ARB TEXTURE0_ARB}, GL_TEXTURE[1-31]
	 */
	public static void glClientActiveTextureARB(int texture) {
		long __functionAddress = getInstance().ClientActiveTextureARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClientActiveTextureARB(texture, __functionAddress);
	}

	// --- [ glMultiTexCoord1fARB ] ---

	/** JNI method for {@link #glMultiTexCoord1fARB MultiTexCoord1fARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord1fARB(int texture, float s, long __functionAddress);

	/**
	 * Sets the current one-dimensional texture coordinate for the specified texture coordinate set. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1fARB(int texture, float s) {
		long __functionAddress = getInstance().MultiTexCoord1fARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1fARB(texture, s, __functionAddress);
	}

	// --- [ glMultiTexCoord1sARB ] ---

	/** JNI method for {@link #glMultiTexCoord1sARB MultiTexCoord1sARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord1sARB(int texture, short s, long __functionAddress);

	/**
	 * Short version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1sARB(int texture, short s) {
		long __functionAddress = getInstance().MultiTexCoord1sARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1sARB(texture, s, __functionAddress);
	}

	// --- [ glMultiTexCoord1iARB ] ---

	/** JNI method for {@link #glMultiTexCoord1iARB MultiTexCoord1iARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord1iARB(int texture, int s, long __functionAddress);

	/**
	 * Integer version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1iARB(int texture, int s) {
		long __functionAddress = getInstance().MultiTexCoord1iARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1iARB(texture, s, __functionAddress);
	}

	// --- [ glMultiTexCoord1dARB ] ---

	/** JNI method for {@link #glMultiTexCoord1dARB MultiTexCoord1dARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord1dARB(int texture, double s, long __functionAddress);

	/**
	 * Double version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 */
	public static void glMultiTexCoord1dARB(int texture, double s) {
		long __functionAddress = getInstance().MultiTexCoord1dARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1dARB(texture, s, __functionAddress);
	}

	// --- [ glMultiTexCoord1fvARB ] ---

	/** JNI method for {@link #glMultiTexCoord1fARB(int, ByteBuffer) MultiTexCoord1fARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord1fvARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord1fARB(int, ByteBuffer) MultiTexCoord1fARB} */
	@JavadocExclude
	public static void nglMultiTexCoord1fvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord1fvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1fvARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1fARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 2);
		nglMultiTexCoord1fvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord1fARB(int, ByteBuffer) MultiTexCoord1fARB} */
	public static void glMultiTexCoord1ARB(int texture, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1svARB ] ---

	/** JNI method for {@link #glMultiTexCoord1sARB(int, ByteBuffer) MultiTexCoord1sARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord1svARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord1sARB(int, ByteBuffer) MultiTexCoord1sARB} */
	@JavadocExclude
	public static void nglMultiTexCoord1svARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord1svARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1svARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1sARB MultiTexCoord1sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1sARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 1);
		nglMultiTexCoord1svARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord1sARB(int, ByteBuffer) MultiTexCoord1sARB} */
	public static void glMultiTexCoord1ARB(int texture, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1ivARB ] ---

	/** JNI method for {@link #glMultiTexCoord1iARB(int, ByteBuffer) MultiTexCoord1iARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord1ivARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord1iARB(int, ByteBuffer) MultiTexCoord1iARB} */
	@JavadocExclude
	public static void nglMultiTexCoord1ivARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord1ivARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1ivARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1iARB MultiTexCoord1iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1iARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 2);
		nglMultiTexCoord1ivARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord1iARB(int, ByteBuffer) MultiTexCoord1iARB} */
	public static void glMultiTexCoord1ARB(int texture, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord1dvARB ] ---

	/** JNI method for {@link #glMultiTexCoord1dARB(int, ByteBuffer) MultiTexCoord1dARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord1dvARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord1dARB(int, ByteBuffer) MultiTexCoord1dARB} */
	@JavadocExclude
	public static void nglMultiTexCoord1dvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord1dvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord1dvARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord1dARB MultiTexCoord1dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord1dARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 3);
		nglMultiTexCoord1dvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord1dARB(int, ByteBuffer) MultiTexCoord1dARB} */
	public static void glMultiTexCoord1ARB(int texture, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglMultiTexCoord1dvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2fARB ] ---

	/** JNI method for {@link #glMultiTexCoord2fARB MultiTexCoord2fARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord2fARB(int texture, float s, float t, long __functionAddress);

	/**
	 * Sets the current two-dimensional texture coordinate for the specified texture coordinate set. {@code r} is implicitly set to 0 and {@code q} to 1.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2fARB(int texture, float s, float t) {
		long __functionAddress = getInstance().MultiTexCoord2fARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2fARB(texture, s, t, __functionAddress);
	}

	// --- [ glMultiTexCoord2sARB ] ---

	/** JNI method for {@link #glMultiTexCoord2sARB MultiTexCoord2sARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord2sARB(int texture, short s, short t, long __functionAddress);

	/**
	 * Short version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2sARB(int texture, short s, short t) {
		long __functionAddress = getInstance().MultiTexCoord2sARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2sARB(texture, s, t, __functionAddress);
	}

	// --- [ glMultiTexCoord2iARB ] ---

	/** JNI method for {@link #glMultiTexCoord2iARB MultiTexCoord2iARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord2iARB(int texture, int s, int t, long __functionAddress);

	/**
	 * Integer version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2iARB(int texture, int s, int t) {
		long __functionAddress = getInstance().MultiTexCoord2iARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2iARB(texture, s, t, __functionAddress);
	}

	// --- [ glMultiTexCoord2dARB ] ---

	/** JNI method for {@link #glMultiTexCoord2dARB MultiTexCoord2dARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord2dARB(int texture, double s, double t, long __functionAddress);

	/**
	 * Double version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param s       the s component of the current texture coordinates
	 * @param t       the t component of the current texture coordinates
	 */
	public static void glMultiTexCoord2dARB(int texture, double s, double t) {
		long __functionAddress = getInstance().MultiTexCoord2dARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2dARB(texture, s, t, __functionAddress);
	}

	// --- [ glMultiTexCoord2fvARB ] ---

	/** JNI method for {@link #glMultiTexCoord2fARB(int, ByteBuffer) MultiTexCoord2fARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord2fvARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord2fARB(int, ByteBuffer) MultiTexCoord2fARB} */
	@JavadocExclude
	public static void nglMultiTexCoord2fvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord2fvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2fvARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2fARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 2);
		nglMultiTexCoord2fvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord2fARB(int, ByteBuffer) MultiTexCoord2fARB} */
	public static void glMultiTexCoord2ARB(int texture, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2svARB ] ---

	/** JNI method for {@link #glMultiTexCoord2sARB(int, ByteBuffer) MultiTexCoord2sARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord2svARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord2sARB(int, ByteBuffer) MultiTexCoord2sARB} */
	@JavadocExclude
	public static void nglMultiTexCoord2svARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord2svARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2svARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2sARB MultiTexCoord2sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2sARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 1);
		nglMultiTexCoord2svARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord2sARB(int, ByteBuffer) MultiTexCoord2sARB} */
	public static void glMultiTexCoord2ARB(int texture, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2ivARB ] ---

	/** JNI method for {@link #glMultiTexCoord2iARB(int, ByteBuffer) MultiTexCoord2iARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord2ivARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord2iARB(int, ByteBuffer) MultiTexCoord2iARB} */
	@JavadocExclude
	public static void nglMultiTexCoord2ivARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord2ivARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2ivARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2iARB MultiTexCoord2iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2iARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 2);
		nglMultiTexCoord2ivARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord2iARB(int, ByteBuffer) MultiTexCoord2iARB} */
	public static void glMultiTexCoord2ARB(int texture, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord2dvARB ] ---

	/** JNI method for {@link #glMultiTexCoord2dARB(int, ByteBuffer) MultiTexCoord2dARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord2dvARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord2dARB(int, ByteBuffer) MultiTexCoord2dARB} */
	@JavadocExclude
	public static void nglMultiTexCoord2dvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord2dvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord2dvARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord2dARB MultiTexCoord2dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord2dARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 3);
		nglMultiTexCoord2dvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord2dARB(int, ByteBuffer) MultiTexCoord2dARB} */
	public static void glMultiTexCoord2ARB(int texture, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglMultiTexCoord2dvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3fARB ] ---

	/** JNI method for {@link #glMultiTexCoord3fARB MultiTexCoord3fARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord3fARB(int texture, float s, float t, float r, long __functionAddress);

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
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3fARB(texture, s, t, r, __functionAddress);
	}

	// --- [ glMultiTexCoord3sARB ] ---

	/** JNI method for {@link #glMultiTexCoord3sARB MultiTexCoord3sARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord3sARB(int texture, short s, short t, short r, long __functionAddress);

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
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3sARB(texture, s, t, r, __functionAddress);
	}

	// --- [ glMultiTexCoord3iARB ] ---

	/** JNI method for {@link #glMultiTexCoord3iARB MultiTexCoord3iARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord3iARB(int texture, int s, int t, int r, long __functionAddress);

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
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3iARB(texture, s, t, r, __functionAddress);
	}

	// --- [ glMultiTexCoord3dARB ] ---

	/** JNI method for {@link #glMultiTexCoord3dARB MultiTexCoord3dARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord3dARB(int texture, double s, double t, double r, long __functionAddress);

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
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3dARB(texture, s, t, r, __functionAddress);
	}

	// --- [ glMultiTexCoord3fvARB ] ---

	/** JNI method for {@link #glMultiTexCoord3fARB(int, ByteBuffer) MultiTexCoord3fARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord3fvARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord3fARB(int, ByteBuffer) MultiTexCoord3fARB} */
	@JavadocExclude
	public static void nglMultiTexCoord3fvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord3fvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3fvARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3fARB MultiTexCoord3fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3fARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglMultiTexCoord3fvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord3fARB(int, ByteBuffer) MultiTexCoord3fARB} */
	public static void glMultiTexCoord3ARB(int texture, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3svARB ] ---

	/** JNI method for {@link #glMultiTexCoord3sARB(int, ByteBuffer) MultiTexCoord3sARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord3svARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord3sARB(int, ByteBuffer) MultiTexCoord3sARB} */
	@JavadocExclude
	public static void nglMultiTexCoord3svARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord3svARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3svARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3sARB MultiTexCoord3sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3sARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglMultiTexCoord3svARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord3sARB(int, ByteBuffer) MultiTexCoord3sARB} */
	public static void glMultiTexCoord3ARB(int texture, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3ivARB ] ---

	/** JNI method for {@link #glMultiTexCoord3iARB(int, ByteBuffer) MultiTexCoord3iARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord3ivARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord3iARB(int, ByteBuffer) MultiTexCoord3iARB} */
	@JavadocExclude
	public static void nglMultiTexCoord3ivARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord3ivARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3ivARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3iARB MultiTexCoord3iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3iARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglMultiTexCoord3ivARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord3iARB(int, ByteBuffer) MultiTexCoord3iARB} */
	public static void glMultiTexCoord3ARB(int texture, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord3dvARB ] ---

	/** JNI method for {@link #glMultiTexCoord3dARB(int, ByteBuffer) MultiTexCoord3dARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord3dvARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord3dARB(int, ByteBuffer) MultiTexCoord3dARB} */
	@JavadocExclude
	public static void nglMultiTexCoord3dvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord3dvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord3dvARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord3dARB MultiTexCoord3dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord3dARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 3);
		nglMultiTexCoord3dvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord3dARB(int, ByteBuffer) MultiTexCoord3dARB} */
	public static void glMultiTexCoord3ARB(int texture, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglMultiTexCoord3dvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4fARB ] ---

	/** JNI method for {@link #glMultiTexCoord4fARB MultiTexCoord4fARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord4fARB(int texture, float s, float t, float r, float q, long __functionAddress);

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
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4fARB(texture, s, t, r, q, __functionAddress);
	}

	// --- [ glMultiTexCoord4sARB ] ---

	/** JNI method for {@link #glMultiTexCoord4sARB MultiTexCoord4sARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord4sARB(int texture, short s, short t, short r, short q, long __functionAddress);

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
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4sARB(texture, s, t, r, q, __functionAddress);
	}

	// --- [ glMultiTexCoord4iARB ] ---

	/** JNI method for {@link #glMultiTexCoord4iARB MultiTexCoord4iARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord4iARB(int texture, int s, int t, int r, int q, long __functionAddress);

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
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4iARB(texture, s, t, r, q, __functionAddress);
	}

	// --- [ glMultiTexCoord4dARB ] ---

	/** JNI method for {@link #glMultiTexCoord4dARB MultiTexCoord4dARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord4dARB(int texture, double s, double t, double r, double q, long __functionAddress);

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
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4dARB(texture, s, t, r, q, __functionAddress);
	}

	// --- [ glMultiTexCoord4fvARB ] ---

	/** JNI method for {@link #glMultiTexCoord4fARB(int, ByteBuffer) MultiTexCoord4fARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord4fvARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord4fARB(int, ByteBuffer) MultiTexCoord4fARB} */
	@JavadocExclude
	public static void nglMultiTexCoord4fvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord4fvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4fvARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4fARB MultiTexCoord4fARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4fARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglMultiTexCoord4fvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord4fARB(int, ByteBuffer) MultiTexCoord4fARB} */
	public static void glMultiTexCoord4ARB(int texture, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4fvARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4svARB ] ---

	/** JNI method for {@link #glMultiTexCoord4sARB(int, ByteBuffer) MultiTexCoord4sARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord4svARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord4sARB(int, ByteBuffer) MultiTexCoord4sARB} */
	@JavadocExclude
	public static void nglMultiTexCoord4svARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord4svARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4svARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4sARB MultiTexCoord4sARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4sARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglMultiTexCoord4svARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord4sARB(int, ByteBuffer) MultiTexCoord4sARB} */
	public static void glMultiTexCoord4ARB(int texture, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4svARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4ivARB ] ---

	/** JNI method for {@link #glMultiTexCoord4iARB(int, ByteBuffer) MultiTexCoord4iARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord4ivARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord4iARB(int, ByteBuffer) MultiTexCoord4iARB} */
	@JavadocExclude
	public static void nglMultiTexCoord4ivARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord4ivARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4ivARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4iARB MultiTexCoord4iARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4iARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglMultiTexCoord4ivARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord4iARB(int, ByteBuffer) MultiTexCoord4iARB} */
	public static void glMultiTexCoord4ARB(int texture, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4ivARB(texture, memAddress(v));
	}

	// --- [ glMultiTexCoord4dvARB ] ---

	/** JNI method for {@link #glMultiTexCoord4dARB(int, ByteBuffer) MultiTexCoord4dARB} */
	@JavadocExclude
	public static native void nglMultiTexCoord4dvARB(int texture, long v, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoord4dARB(int, ByteBuffer) MultiTexCoord4dARB} */
	@JavadocExclude
	public static void nglMultiTexCoord4dvARB(int texture, long v) {
		long __functionAddress = getInstance().MultiTexCoord4dvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoord4dvARB(texture, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoord4dARB MultiTexCoord4dARB}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param v       the texture coordinate buffer
	 */
	public static void glMultiTexCoord4dARB(int texture, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 3);
		nglMultiTexCoord4dvARB(texture, memAddress(v));
	}

	/** Alternative version of: {@link #glMultiTexCoord4dARB(int, ByteBuffer) MultiTexCoord4dARB} */
	public static void glMultiTexCoord4ARB(int texture, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglMultiTexCoord4dvARB(texture, memAddress(v));
	}

}