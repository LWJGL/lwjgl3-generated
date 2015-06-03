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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/window_pos.txt">ARB_window_pos</a> extension.
 * 
 * <p>In order to set the current raster position to a specific window coordinate with the {@link GL11#glRasterPos2i RasterPos2i} command, the modelview matrix, projection matrix
 * and viewport must be set very carefully. Furthermore, if the desired window coordinate is outside of the window's bounds one must rely on a subtle
 * side-effect of the {@link GL11#glBitmap Bitmap} command in order to avoid frustum clipping.</p>
 * 
 * <p>This extension provides a set of functions to directly set the current raster position in window coordinates, bypassing the modelview matrix, the
 * projection matrix and the viewport-to-window mapping. Furthermore, clip testing is not performed, so that the current raster position is always valid.</p>
 * 
 * <p>This greatly simplifies the process of setting the current raster position to a specific window coordinate prior to calling {@link GL11#glDrawPixels DrawPixels},
 * {@link GL11#glCopyPixels CopyPixels} or {@link GL11#glBitmap Bitmap}. Many matrix operations can be avoided when mixing 2D and 3D rendering.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public final class ARBWindowPos {

	/** Function address. */
	@JavadocExclude
	public final long
		WindowPos2iARB,
		WindowPos2sARB,
		WindowPos2fARB,
		WindowPos2dARB,
		WindowPos2ivARB,
		WindowPos2svARB,
		WindowPos2fvARB,
		WindowPos2dvARB,
		WindowPos3iARB,
		WindowPos3sARB,
		WindowPos3fARB,
		WindowPos3dARB,
		WindowPos3ivARB,
		WindowPos3svARB,
		WindowPos3fvARB,
		WindowPos3dvARB;

	@JavadocExclude
	public ARBWindowPos(FunctionProvider provider) {
		WindowPos2iARB = provider.getFunctionAddress("glWindowPos2iARB");
		WindowPos2sARB = provider.getFunctionAddress("glWindowPos2sARB");
		WindowPos2fARB = provider.getFunctionAddress("glWindowPos2fARB");
		WindowPos2dARB = provider.getFunctionAddress("glWindowPos2dARB");
		WindowPos2ivARB = provider.getFunctionAddress("glWindowPos2ivARB");
		WindowPos2svARB = provider.getFunctionAddress("glWindowPos2svARB");
		WindowPos2fvARB = provider.getFunctionAddress("glWindowPos2fvARB");
		WindowPos2dvARB = provider.getFunctionAddress("glWindowPos2dvARB");
		WindowPos3iARB = provider.getFunctionAddress("glWindowPos3iARB");
		WindowPos3sARB = provider.getFunctionAddress("glWindowPos3sARB");
		WindowPos3fARB = provider.getFunctionAddress("glWindowPos3fARB");
		WindowPos3dARB = provider.getFunctionAddress("glWindowPos3dARB");
		WindowPos3ivARB = provider.getFunctionAddress("glWindowPos3ivARB");
		WindowPos3svARB = provider.getFunctionAddress("glWindowPos3svARB");
		WindowPos3fvARB = provider.getFunctionAddress("glWindowPos3fvARB");
		WindowPos3dvARB = provider.getFunctionAddress("glWindowPos3dvARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBWindowPos} instance for the current context. */
	public static ARBWindowPos getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBWindowPos);
	}

	static ARBWindowPos create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_window_pos") ) return null;

		ARBWindowPos funcs = new ARBWindowPos(provider);

		boolean supported = checkFunctions(
			funcs.WindowPos2iARB, funcs.WindowPos2sARB, funcs.WindowPos2fARB, funcs.WindowPos2dARB, funcs.WindowPos2ivARB, funcs.WindowPos2svARB, 
			funcs.WindowPos2fvARB, funcs.WindowPos2dvARB, funcs.WindowPos3iARB, funcs.WindowPos3sARB, funcs.WindowPos3fARB, funcs.WindowPos3dARB, 
			funcs.WindowPos3ivARB, funcs.WindowPos3svARB, funcs.WindowPos3fvARB, funcs.WindowPos3dvARB
		);

		return GL.checkExtension("GL_ARB_window_pos", funcs, supported);
	}

	// --- [ glWindowPos2iARB ] ---

	/** JNI method for {@link #glWindowPos2iARB WindowPos2iARB} */
	@JavadocExclude
	public static native void nglWindowPos2iARB(int x, int y, long __functionAddress);

	/**
	 * Alternate way to set the current raster position. {@code z} is implictly set to 0.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2iARB(int x, int y) {
		long __functionAddress = getInstance().WindowPos2iARB;
		nglWindowPos2iARB(x, y, __functionAddress);
	}

	// --- [ glWindowPos2sARB ] ---

	/** JNI method for {@link #glWindowPos2sARB WindowPos2sARB} */
	@JavadocExclude
	public static native void nglWindowPos2sARB(short x, short y, long __functionAddress);

	/**
	 * Short version of {@link #glWindowPos2iARB WindowPos2iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2sARB(short x, short y) {
		long __functionAddress = getInstance().WindowPos2sARB;
		nglWindowPos2sARB(x, y, __functionAddress);
	}

	// --- [ glWindowPos2fARB ] ---

	/** JNI method for {@link #glWindowPos2fARB WindowPos2fARB} */
	@JavadocExclude
	public static native void nglWindowPos2fARB(float x, float y, long __functionAddress);

	/**
	 * Float version of {@link #glWindowPos2iARB WindowPos2iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2fARB(float x, float y) {
		long __functionAddress = getInstance().WindowPos2fARB;
		nglWindowPos2fARB(x, y, __functionAddress);
	}

	// --- [ glWindowPos2dARB ] ---

	/** JNI method for {@link #glWindowPos2dARB WindowPos2dARB} */
	@JavadocExclude
	public static native void nglWindowPos2dARB(double x, double y, long __functionAddress);

	/**
	 * Double version of {@link #glWindowPos2iARB WindowPos2iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2dARB(double x, double y) {
		long __functionAddress = getInstance().WindowPos2dARB;
		nglWindowPos2dARB(x, y, __functionAddress);
	}

	// --- [ glWindowPos2ivARB ] ---

	/** JNI method for {@link #glWindowPos2ivARB WindowPos2ivARB} */
	@JavadocExclude
	public static native void nglWindowPos2ivARB(long p, long __functionAddress);

	/** Unsafe version of {@link #glWindowPos2ivARB WindowPos2ivARB} */
	@JavadocExclude
	public static void nglWindowPos2ivARB(long p) {
		long __functionAddress = getInstance().WindowPos2ivARB;
		nglWindowPos2ivARB(p, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glWindowPos2iARB WindowPos2iARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2ivARB(ByteBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 2 << 2);
		nglWindowPos2ivARB(memAddress(p));
	}

	/** Alternative version of: {@link #glWindowPos2ivARB WindowPos2ivARB} */
	public static void glWindowPos2ivARB(IntBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 2);
		nglWindowPos2ivARB(memAddress(p));
	}

	// --- [ glWindowPos2svARB ] ---

	/** JNI method for {@link #glWindowPos2svARB WindowPos2svARB} */
	@JavadocExclude
	public static native void nglWindowPos2svARB(long p, long __functionAddress);

	/** Unsafe version of {@link #glWindowPos2svARB WindowPos2svARB} */
	@JavadocExclude
	public static void nglWindowPos2svARB(long p) {
		long __functionAddress = getInstance().WindowPos2svARB;
		nglWindowPos2svARB(p, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glWindowPos2sARB WindowPos2sARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2svARB(ByteBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 2 << 1);
		nglWindowPos2svARB(memAddress(p));
	}

	/** Alternative version of: {@link #glWindowPos2svARB WindowPos2svARB} */
	public static void glWindowPos2svARB(ShortBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 2);
		nglWindowPos2svARB(memAddress(p));
	}

	// --- [ glWindowPos2fvARB ] ---

	/** JNI method for {@link #glWindowPos2fvARB WindowPos2fvARB} */
	@JavadocExclude
	public static native void nglWindowPos2fvARB(long p, long __functionAddress);

	/** Unsafe version of {@link #glWindowPos2fvARB WindowPos2fvARB} */
	@JavadocExclude
	public static void nglWindowPos2fvARB(long p) {
		long __functionAddress = getInstance().WindowPos2fvARB;
		nglWindowPos2fvARB(p, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glWindowPos2fARB WindowPos2fARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2fvARB(ByteBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 2 << 2);
		nglWindowPos2fvARB(memAddress(p));
	}

	/** Alternative version of: {@link #glWindowPos2fvARB WindowPos2fvARB} */
	public static void glWindowPos2fvARB(FloatBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 2);
		nglWindowPos2fvARB(memAddress(p));
	}

	// --- [ glWindowPos2dvARB ] ---

	/** JNI method for {@link #glWindowPos2dvARB WindowPos2dvARB} */
	@JavadocExclude
	public static native void nglWindowPos2dvARB(long p, long __functionAddress);

	/** Unsafe version of {@link #glWindowPos2dvARB WindowPos2dvARB} */
	@JavadocExclude
	public static void nglWindowPos2dvARB(long p) {
		long __functionAddress = getInstance().WindowPos2dvARB;
		nglWindowPos2dvARB(p, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glWindowPos2dARB WindowPos2dARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2dvARB(ByteBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 2 << 3);
		nglWindowPos2dvARB(memAddress(p));
	}

	/** Alternative version of: {@link #glWindowPos2dvARB WindowPos2dvARB} */
	public static void glWindowPos2dvARB(DoubleBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 2);
		nglWindowPos2dvARB(memAddress(p));
	}

	// --- [ glWindowPos3iARB ] ---

	/** JNI method for {@link #glWindowPos3iARB WindowPos3iARB} */
	@JavadocExclude
	public static native void nglWindowPos3iARB(int x, int y, int z, long __functionAddress);

	/**
	 * Alternate way to set the current raster position.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3iARB(int x, int y, int z) {
		long __functionAddress = getInstance().WindowPos3iARB;
		nglWindowPos3iARB(x, y, z, __functionAddress);
	}

	// --- [ glWindowPos3sARB ] ---

	/** JNI method for {@link #glWindowPos3sARB WindowPos3sARB} */
	@JavadocExclude
	public static native void nglWindowPos3sARB(short x, short y, short z, long __functionAddress);

	/**
	 * Short version of {@link #glWindowPos3iARB WindowPos3iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3sARB(short x, short y, short z) {
		long __functionAddress = getInstance().WindowPos3sARB;
		nglWindowPos3sARB(x, y, z, __functionAddress);
	}

	// --- [ glWindowPos3fARB ] ---

	/** JNI method for {@link #glWindowPos3fARB WindowPos3fARB} */
	@JavadocExclude
	public static native void nglWindowPos3fARB(float x, float y, float z, long __functionAddress);

	/**
	 * Float version of {@link #glWindowPos3iARB WindowPos3iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3fARB(float x, float y, float z) {
		long __functionAddress = getInstance().WindowPos3fARB;
		nglWindowPos3fARB(x, y, z, __functionAddress);
	}

	// --- [ glWindowPos3dARB ] ---

	/** JNI method for {@link #glWindowPos3dARB WindowPos3dARB} */
	@JavadocExclude
	public static native void nglWindowPos3dARB(double x, double y, double z, long __functionAddress);

	/**
	 * Double version of {@link #glWindowPos3iARB WindowPos3iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3dARB(double x, double y, double z) {
		long __functionAddress = getInstance().WindowPos3dARB;
		nglWindowPos3dARB(x, y, z, __functionAddress);
	}

	// --- [ glWindowPos3ivARB ] ---

	/** JNI method for {@link #glWindowPos3ivARB WindowPos3ivARB} */
	@JavadocExclude
	public static native void nglWindowPos3ivARB(long p, long __functionAddress);

	/** Unsafe version of {@link #glWindowPos3ivARB WindowPos3ivARB} */
	@JavadocExclude
	public static void nglWindowPos3ivARB(long p) {
		long __functionAddress = getInstance().WindowPos3ivARB;
		nglWindowPos3ivARB(p, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glWindowPos3iARB WindowPos3iARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3ivARB(ByteBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 3 << 2);
		nglWindowPos3ivARB(memAddress(p));
	}

	/** Alternative version of: {@link #glWindowPos3ivARB WindowPos3ivARB} */
	public static void glWindowPos3ivARB(IntBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 3);
		nglWindowPos3ivARB(memAddress(p));
	}

	// --- [ glWindowPos3svARB ] ---

	/** JNI method for {@link #glWindowPos3svARB WindowPos3svARB} */
	@JavadocExclude
	public static native void nglWindowPos3svARB(long p, long __functionAddress);

	/** Unsafe version of {@link #glWindowPos3svARB WindowPos3svARB} */
	@JavadocExclude
	public static void nglWindowPos3svARB(long p) {
		long __functionAddress = getInstance().WindowPos3svARB;
		nglWindowPos3svARB(p, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glWindowPos3sARB WindowPos3sARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3svARB(ByteBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 3 << 1);
		nglWindowPos3svARB(memAddress(p));
	}

	/** Alternative version of: {@link #glWindowPos3svARB WindowPos3svARB} */
	public static void glWindowPos3svARB(ShortBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 3);
		nglWindowPos3svARB(memAddress(p));
	}

	// --- [ glWindowPos3fvARB ] ---

	/** JNI method for {@link #glWindowPos3fvARB WindowPos3fvARB} */
	@JavadocExclude
	public static native void nglWindowPos3fvARB(long p, long __functionAddress);

	/** Unsafe version of {@link #glWindowPos3fvARB WindowPos3fvARB} */
	@JavadocExclude
	public static void nglWindowPos3fvARB(long p) {
		long __functionAddress = getInstance().WindowPos3fvARB;
		nglWindowPos3fvARB(p, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glWindowPos3fARB WindowPos3fARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3fvARB(ByteBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 3 << 2);
		nglWindowPos3fvARB(memAddress(p));
	}

	/** Alternative version of: {@link #glWindowPos3fvARB WindowPos3fvARB} */
	public static void glWindowPos3fvARB(FloatBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 3);
		nglWindowPos3fvARB(memAddress(p));
	}

	// --- [ glWindowPos3dvARB ] ---

	/** JNI method for {@link #glWindowPos3dvARB WindowPos3dvARB} */
	@JavadocExclude
	public static native void nglWindowPos3dvARB(long p, long __functionAddress);

	/** Unsafe version of {@link #glWindowPos3dvARB WindowPos3dvARB} */
	@JavadocExclude
	public static void nglWindowPos3dvARB(long p) {
		long __functionAddress = getInstance().WindowPos3dvARB;
		nglWindowPos3dvARB(p, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glWindowPos3dARB WindowPos3dARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3dvARB(ByteBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 3 << 3);
		nglWindowPos3dvARB(memAddress(p));
	}

	/** Alternative version of: {@link #glWindowPos3dvARB WindowPos3dvARB} */
	public static void glWindowPos3dvARB(DoubleBuffer p) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(p, 3);
		nglWindowPos3dvARB(memAddress(p));
	}

}