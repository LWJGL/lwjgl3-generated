/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Implementation of the NanoVG API using OpenGL 3.0. */
public class NanoVGGL3 {

	/** Flag indicating if geometry based anti-aliasing is used (may not be needed when using MSAA). */
	public static final int NVG_ANTIALIAS = 1<<0;

	/**
	 * Flag indicating if strokes should be drawn using stencil buffer. The rendering will be a little slower, but path overlaps (i.e.
	 * self-intersecting or sharp turns) will be drawn just once.
	 */
	public static final int NVG_STENCIL_STROKES = 1<<1;

	/** Flag indicating that additional debug checks are done. */
	public static final int NVG_DEBUG = 1<<2;

	/** Do not delete GL texture handle. */
	public static final int NVG_IMAGE_NODELETE = 1<<16;

	static { Library.initialize(); }

	protected NanoVGGL3() {
		throw new UnsupportedOperationException();
	}

	// --- [ nvglCreateImageFromHandleGL3 ] ---

	/**
	 * Creates a NanoVG image from an OpenGL texture.
	 *
	 * @param ctx       the NanoVG context
	 * @param textureId the OpenGL texture id
	 * @param w         the image width
	 * @param h         the image height
	 * @param flags     the image flags
	 */
	public static native int nnvglCreateImageFromHandleGL3(long ctx, int textureId, int w, int h, int flags);

	/**
	 * Creates a NanoVG image from an OpenGL texture.
	 *
	 * @param ctx       the NanoVG context
	 * @param textureId the OpenGL texture id
	 * @param w         the image width
	 * @param h         the image height
	 * @param flags     the image flags
	 */
	public static int nvglCreateImageFromHandleGL3(long ctx, int textureId, int w, int h, int flags) {
		if ( CHECKS )
			checkPointer(ctx);
		return nnvglCreateImageFromHandleGL3(ctx, textureId, w, h, flags);
	}

	// --- [ nvglImageHandleGL3 ] ---

	/**
	 * Returns the OpenGL texture id associated with a NanoVG image.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle
	 */
	public static native int nnvglImageHandleGL3(long ctx, int image);

	/**
	 * Returns the OpenGL texture id associated with a NanoVG image.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle
	 */
	public static int nvglImageHandleGL3(long ctx, int image) {
		if ( CHECKS )
			checkPointer(ctx);
		return nnvglImageHandleGL3(ctx, image);
	}

	// --- [ nvgCreateGL3 ] ---

	/**
	 * Creates a NanoVG context with an OpenGL 3.0 rendering back-end.
	 * 
	 * <p>An OpenGL 3.0+ context must be current in the current thread when this function is called and the returned NanoVG context may only be used in the
	 * thread in which that OpenGL context is current.</p>
	 *
	 * @param flags the context flags. One of:<br><table><tr><td>{@link #NVG_ANTIALIAS ANTIALIAS}</td><td>{@link #NVG_STENCIL_STROKES STENCIL_STROKES}</td><td>{@link #NVG_DEBUG DEBUG}</td></tr></table>
	 */
	public static native long nvgCreateGL3(int flags);

	// --- [ nvgDeleteGL3 ] ---

	/**
	 * Deletes a NanoVG context created with {@link #nvgCreateGL3 CreateGL3}.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgDeleteGL3(long ctx);

	/**
	 * Deletes a NanoVG context created with {@link #nvgCreateGL3 CreateGL3}.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgDeleteGL3(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgDeleteGL3(ctx);
	}

	// --- [ nvgluCreateFramebuffer ] ---

	/**
	 * Creates a framebuffer object to render to.
	 *
	 * @param ctx        the NanoVG context
	 * @param w          the framebuffer width
	 * @param h          the framebuffer height
	 * @param imageFlags the image flags
	 */
	public static native long nnvgluCreateFramebuffer(long ctx, int w, int h, int imageFlags);

	/**
	 * Creates a framebuffer object to render to.
	 *
	 * @param ctx        the NanoVG context
	 * @param w          the framebuffer width
	 * @param h          the framebuffer height
	 * @param imageFlags the image flags
	 */
	public static NVGLUFramebuffer nvgluCreateFramebuffer(long ctx, int w, int h, int imageFlags) {
		if ( CHECKS )
			checkPointer(ctx);
		long __result = nnvgluCreateFramebuffer(ctx, w, h, imageFlags);
		return NVGLUFramebuffer.create(__result);
	}

	// --- [ nvgluBindFramebuffer ] ---

	/**
	 * Binds the framebuffer object associated with the specified {@link NVGLUFramebuffer}.
	 *
	 * @param ctx the NanoVG context
	 * @param fb  the framebuffer to bind
	 */
	public static native void nnvgluBindFramebuffer(long ctx, long fb);

	/**
	 * Binds the framebuffer object associated with the specified {@link NVGLUFramebuffer}.
	 *
	 * @param ctx the NanoVG context
	 * @param fb  the framebuffer to bind
	 */
	public static void nvgluBindFramebuffer(long ctx, NVGLUFramebuffer fb) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgluBindFramebuffer(ctx, fb == null ? NULL : fb.address());
	}

	// --- [ nvgluDeleteFramebuffer ] ---

	/**
	 * Deletes an {@link NVGLUFramebuffer}.
	 *
	 * @param ctx the NanoVG context
	 * @param fb  the framebuffer to delete
	 */
	public static native void nnvgluDeleteFramebuffer(long ctx, long fb);

	/**
	 * Deletes an {@link NVGLUFramebuffer}.
	 *
	 * @param ctx the NanoVG context
	 * @param fb  the framebuffer to delete
	 */
	public static void nvgluDeleteFramebuffer(long ctx, NVGLUFramebuffer fb) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgluDeleteFramebuffer(ctx, fb.address());
	}

}