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
public class ARBWindowPos {

	static { GL.initialize(); }

	protected ARBWindowPos() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glWindowPos2iARB, caps.glWindowPos2sARB, caps.glWindowPos2fARB, caps.glWindowPos2dARB, caps.glWindowPos2ivARB, caps.glWindowPos2svARB, 
			caps.glWindowPos2fvARB, caps.glWindowPos2dvARB, caps.glWindowPos3iARB, caps.glWindowPos3sARB, caps.glWindowPos3fARB, caps.glWindowPos3dARB, 
			caps.glWindowPos3ivARB, caps.glWindowPos3svARB, caps.glWindowPos3fvARB, caps.glWindowPos3dvARB
		);
	}

	// --- [ glWindowPos2iARB ] ---

	/** Unsafe version of: {@link #glWindowPos2iARB WindowPos2iARB} */
	public static native void nglWindowPos2iARB(int x, int y);

	/**
	 * Alternate way to set the current raster position. {@code z} is implictly set to 0.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2iARB(int x, int y) {
		nglWindowPos2iARB(x, y);
	}

	// --- [ glWindowPos2sARB ] ---

	/** Unsafe version of: {@link #glWindowPos2sARB WindowPos2sARB} */
	public static native void nglWindowPos2sARB(short x, short y);

	/**
	 * Short version of {@link #glWindowPos2iARB WindowPos2iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2sARB(short x, short y) {
		nglWindowPos2sARB(x, y);
	}

	// --- [ glWindowPos2fARB ] ---

	/** Unsafe version of: {@link #glWindowPos2fARB WindowPos2fARB} */
	public static native void nglWindowPos2fARB(float x, float y);

	/**
	 * Float version of {@link #glWindowPos2iARB WindowPos2iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2fARB(float x, float y) {
		nglWindowPos2fARB(x, y);
	}

	// --- [ glWindowPos2dARB ] ---

	/** Unsafe version of: {@link #glWindowPos2dARB WindowPos2dARB} */
	public static native void nglWindowPos2dARB(double x, double y);

	/**
	 * Double version of {@link #glWindowPos2iARB WindowPos2iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2dARB(double x, double y) {
		nglWindowPos2dARB(x, y);
	}

	// --- [ glWindowPos2ivARB ] ---

	/** Unsafe version of: {@link #glWindowPos2ivARB WindowPos2ivARB} */
	public static native void nglWindowPos2ivARB(long p);

	/**
	 * Pointer version of {@link #glWindowPos2iARB WindowPos2iARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2ivARB(IntBuffer p) {
		if ( CHECKS )
			check(p, 2);
		nglWindowPos2ivARB(memAddress(p));
	}

	// --- [ glWindowPos2svARB ] ---

	/** Unsafe version of: {@link #glWindowPos2svARB WindowPos2svARB} */
	public static native void nglWindowPos2svARB(long p);

	/**
	 * Pointer version of {@link #glWindowPos2sARB WindowPos2sARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2svARB(ShortBuffer p) {
		if ( CHECKS )
			check(p, 2);
		nglWindowPos2svARB(memAddress(p));
	}

	// --- [ glWindowPos2fvARB ] ---

	/** Unsafe version of: {@link #glWindowPos2fvARB WindowPos2fvARB} */
	public static native void nglWindowPos2fvARB(long p);

	/**
	 * Pointer version of {@link #glWindowPos2fARB WindowPos2fARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2fvARB(FloatBuffer p) {
		if ( CHECKS )
			check(p, 2);
		nglWindowPos2fvARB(memAddress(p));
	}

	// --- [ glWindowPos2dvARB ] ---

	/** Unsafe version of: {@link #glWindowPos2dvARB WindowPos2dvARB} */
	public static native void nglWindowPos2dvARB(long p);

	/**
	 * Pointer version of {@link #glWindowPos2dARB WindowPos2dARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2dvARB(DoubleBuffer p) {
		if ( CHECKS )
			check(p, 2);
		nglWindowPos2dvARB(memAddress(p));
	}

	// --- [ glWindowPos3iARB ] ---

	/** Unsafe version of: {@link #glWindowPos3iARB WindowPos3iARB} */
	public static native void nglWindowPos3iARB(int x, int y, int z);

	/**
	 * Alternate way to set the current raster position.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3iARB(int x, int y, int z) {
		nglWindowPos3iARB(x, y, z);
	}

	// --- [ glWindowPos3sARB ] ---

	/** Unsafe version of: {@link #glWindowPos3sARB WindowPos3sARB} */
	public static native void nglWindowPos3sARB(short x, short y, short z);

	/**
	 * Short version of {@link #glWindowPos3iARB WindowPos3iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3sARB(short x, short y, short z) {
		nglWindowPos3sARB(x, y, z);
	}

	// --- [ glWindowPos3fARB ] ---

	/** Unsafe version of: {@link #glWindowPos3fARB WindowPos3fARB} */
	public static native void nglWindowPos3fARB(float x, float y, float z);

	/**
	 * Float version of {@link #glWindowPos3iARB WindowPos3iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3fARB(float x, float y, float z) {
		nglWindowPos3fARB(x, y, z);
	}

	// --- [ glWindowPos3dARB ] ---

	/** Unsafe version of: {@link #glWindowPos3dARB WindowPos3dARB} */
	public static native void nglWindowPos3dARB(double x, double y, double z);

	/**
	 * Double version of {@link #glWindowPos3iARB WindowPos3iARB}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3dARB(double x, double y, double z) {
		nglWindowPos3dARB(x, y, z);
	}

	// --- [ glWindowPos3ivARB ] ---

	/** Unsafe version of: {@link #glWindowPos3ivARB WindowPos3ivARB} */
	public static native void nglWindowPos3ivARB(long p);

	/**
	 * Pointer version of {@link #glWindowPos3iARB WindowPos3iARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3ivARB(IntBuffer p) {
		if ( CHECKS )
			check(p, 3);
		nglWindowPos3ivARB(memAddress(p));
	}

	// --- [ glWindowPos3svARB ] ---

	/** Unsafe version of: {@link #glWindowPos3svARB WindowPos3svARB} */
	public static native void nglWindowPos3svARB(long p);

	/**
	 * Pointer version of {@link #glWindowPos3sARB WindowPos3sARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3svARB(ShortBuffer p) {
		if ( CHECKS )
			check(p, 3);
		nglWindowPos3svARB(memAddress(p));
	}

	// --- [ glWindowPos3fvARB ] ---

	/** Unsafe version of: {@link #glWindowPos3fvARB WindowPos3fvARB} */
	public static native void nglWindowPos3fvARB(long p);

	/**
	 * Pointer version of {@link #glWindowPos3fARB WindowPos3fARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3fvARB(FloatBuffer p) {
		if ( CHECKS )
			check(p, 3);
		nglWindowPos3fvARB(memAddress(p));
	}

	// --- [ glWindowPos3dvARB ] ---

	/** Unsafe version of: {@link #glWindowPos3dvARB WindowPos3dvARB} */
	public static native void nglWindowPos3dvARB(long p);

	/**
	 * Pointer version of {@link #glWindowPos3dARB WindowPos3dARB}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3dvARB(DoubleBuffer p) {
		if ( CHECKS )
			check(p, 3);
		nglWindowPos3dvARB(memAddress(p));
	}

	/** Array version of: {@link #glWindowPos2ivARB WindowPos2ivARB} */
	public static void glWindowPos2ivARB(int[] p) {
		long __functionAddress = GL.getICD().glWindowPos2ivARB;
		if ( CHECKS ) {
			check(__functionAddress);
			check(p, 2);
		}
		callPV(__functionAddress, p);
	}

	/** Array version of: {@link #glWindowPos2svARB WindowPos2svARB} */
	public static void glWindowPos2svARB(short[] p) {
		long __functionAddress = GL.getICD().glWindowPos2svARB;
		if ( CHECKS ) {
			check(__functionAddress);
			check(p, 2);
		}
		callPV(__functionAddress, p);
	}

	/** Array version of: {@link #glWindowPos2fvARB WindowPos2fvARB} */
	public static void glWindowPos2fvARB(float[] p) {
		long __functionAddress = GL.getICD().glWindowPos2fvARB;
		if ( CHECKS ) {
			check(__functionAddress);
			check(p, 2);
		}
		callPV(__functionAddress, p);
	}

	/** Array version of: {@link #glWindowPos2dvARB WindowPos2dvARB} */
	public static void glWindowPos2dvARB(double[] p) {
		long __functionAddress = GL.getICD().glWindowPos2dvARB;
		if ( CHECKS ) {
			check(__functionAddress);
			check(p, 2);
		}
		callPV(__functionAddress, p);
	}

	/** Array version of: {@link #glWindowPos3ivARB WindowPos3ivARB} */
	public static void glWindowPos3ivARB(int[] p) {
		long __functionAddress = GL.getICD().glWindowPos3ivARB;
		if ( CHECKS ) {
			check(__functionAddress);
			check(p, 3);
		}
		callPV(__functionAddress, p);
	}

	/** Array version of: {@link #glWindowPos3svARB WindowPos3svARB} */
	public static void glWindowPos3svARB(short[] p) {
		long __functionAddress = GL.getICD().glWindowPos3svARB;
		if ( CHECKS ) {
			check(__functionAddress);
			check(p, 3);
		}
		callPV(__functionAddress, p);
	}

	/** Array version of: {@link #glWindowPos3fvARB WindowPos3fvARB} */
	public static void glWindowPos3fvARB(float[] p) {
		long __functionAddress = GL.getICD().glWindowPos3fvARB;
		if ( CHECKS ) {
			check(__functionAddress);
			check(p, 3);
		}
		callPV(__functionAddress, p);
	}

	/** Array version of: {@link #glWindowPos3dvARB WindowPos3dvARB} */
	public static void glWindowPos3dvARB(double[] p) {
		long __functionAddress = GL.getICD().glWindowPos3dvARB;
		if ( CHECKS ) {
			check(__functionAddress);
			check(p, 3);
		}
		callPV(__functionAddress, p);
	}

}