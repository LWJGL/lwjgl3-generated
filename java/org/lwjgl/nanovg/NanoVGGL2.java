/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Implementation of the NanoVG API using OpenGL 2.0. */
public class NanoVGGL2 {

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

	static { LibNanoVG.initialize(); }

	protected NanoVGGL2() {
		throw new UnsupportedOperationException();
	}

	// --- [ nvglCreateImageFromHandle ] ---

	/**
	 * Creates a NanoVG image from an OpenGL texture.
	 *
	 * @param ctx       the NanoVG context
	 * @param textureId the OpenGL texture id
	 * @param w         the image width
	 * @param h         the image height
	 * @param flags     the image flags
	 *
	 * @return a handle to the image
	 */
	public static native int nnvglCreateImageFromHandleGL2(long ctx, int textureId, int w, int h, int flags);

	/**
	 * Creates a NanoVG image from an OpenGL texture.
	 *
	 * @param ctx       the NanoVG context
	 * @param textureId the OpenGL texture id
	 * @param w         the image width
	 * @param h         the image height
	 * @param flags     the image flags
	 *
	 * @return a handle to the image
	 */
	public static int nvglCreateImageFromHandle(long ctx, int textureId, int w, int h, int flags) {
		if ( CHECKS )
			checkPointer(ctx);
		return nnvglCreateImageFromHandleGL2(ctx, textureId, w, h, flags);
	}

	// --- [ nvglImageHandle ] ---

	/**
	 * Returns the OpenGL texture id associated with a NanoVG image.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle
	 */
	public static native int nnvglImageHandleGL2(long ctx, int image);

	/**
	 * Returns the OpenGL texture id associated with a NanoVG image.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle
	 */
	public static int nvglImageHandle(long ctx, int image) {
		if ( CHECKS )
			checkPointer(ctx);
		return nnvglImageHandleGL2(ctx, image);
	}

	// --- [ nvgCreate ] ---

	/**
	 * Creates a NanoVG context with an OpenGL 2.0 rendering back-end.
	 * 
	 * <p>An OpenGL 2.0+ context must be current in the current thread when this function is called and the returned NanoVG context may only be used in the
	 * thread in which that OpenGL context is current.</p>
	 *
	 * @param flags the context flags. One of:<br><table><tr><td>{@link #NVG_ANTIALIAS ANTIALIAS}</td><td>{@link #NVG_STENCIL_STROKES STENCIL_STROKES}</td><td>{@link #NVG_DEBUG DEBUG}</td></tr></table>
	 */
	public static native long nnvgCreateGL2(int flags);

	/**
	 * Creates a NanoVG context with an OpenGL 2.0 rendering back-end.
	 * 
	 * <p>An OpenGL 2.0+ context must be current in the current thread when this function is called and the returned NanoVG context may only be used in the
	 * thread in which that OpenGL context is current.</p>
	 *
	 * @param flags the context flags. One of:<br><table><tr><td>{@link #NVG_ANTIALIAS ANTIALIAS}</td><td>{@link #NVG_STENCIL_STROKES STENCIL_STROKES}</td><td>{@link #NVG_DEBUG DEBUG}</td></tr></table>
	 */
	public static long nvgCreate(int flags) {
		return nnvgCreateGL2(flags);
	}

	// --- [ nvgDelete ] ---

	/**
	 * Deletes a NanoVG context created with {@link #nvgCreate Create}.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgDeleteGL2(long ctx);

	/**
	 * Deletes a NanoVG context created with {@link #nvgCreate Create}.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgDelete(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgDeleteGL2(ctx);
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
	public static native long nnvgluCreateFramebufferGL2(long ctx, int w, int h, int imageFlags);

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
		long __result = nnvgluCreateFramebufferGL2(ctx, w, h, imageFlags);
		return NVGLUFramebuffer.create(__result);
	}

	// --- [ nvgluBindFramebuffer ] ---

	/**
	 * Binds the framebuffer object associated with the specified {@link NVGLUFramebuffer}.
	 *
	 * @param ctx the NanoVG context
	 * @param fb  the framebuffer to bind
	 */
	public static native void nnvgluBindFramebufferGL2(long ctx, long fb);

	/**
	 * Binds the framebuffer object associated with the specified {@link NVGLUFramebuffer}.
	 *
	 * @param ctx the NanoVG context
	 * @param fb  the framebuffer to bind
	 */
	public static void nvgluBindFramebuffer(long ctx, NVGLUFramebuffer fb) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgluBindFramebufferGL2(ctx, memAddressSafe(fb));
	}

	// --- [ nvgluDeleteFramebuffer ] ---

	/**
	 * Deletes an {@link NVGLUFramebuffer}.
	 *
	 * @param ctx the NanoVG context
	 * @param fb  the framebuffer to delete
	 */
	public static native void nnvgluDeleteFramebufferGL2(long ctx, long fb);

	/**
	 * Deletes an {@link NVGLUFramebuffer}.
	 *
	 * @param ctx the NanoVG context
	 * @param fb  the framebuffer to delete
	 */
	public static void nvgluDeleteFramebuffer(long ctx, NVGLUFramebuffer fb) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgluDeleteFramebufferGL2(ctx, fb.address());
	}

}