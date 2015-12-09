/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Implementation of the NanoVG API using OpenGL ES 2.0. */
public class NanoVGGLES2 {

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

	@JavadocExclude
	protected NanoVGGLES2() {
		throw new UnsupportedOperationException();
	}

	// --- [ nvglCreateImageFromHandle ] ---

	/** JNI method for {@link #nvglCreateImageFromHandle lCreateImageFromHandle} */
	@JavadocExclude
	public static native int nnvglCreateImageFromHandle(long ctx, int textureId, int w, int h, int flags);

	/**
	 * Creates a NanoVG image from an OpenGL texture.
	 *
	 * @param ctx       the NanoVG context
	 * @param textureId the OpenGL texture id
	 * @param w         the image width
	 * @param h         the image height
	 * @param flags     the image flags
	 */
	public static int nvglCreateImageFromHandle(long ctx, int textureId, int w, int h, int flags) {
		if ( CHECKS )
			checkPointer(ctx);
		return nnvglCreateImageFromHandle(ctx, textureId, w, h, flags);
	}

	// --- [ nvglImageHandle ] ---

	/** JNI method for {@link #nvglImageHandle lImageHandle} */
	@JavadocExclude
	public static native int nnvglImageHandle(long ctx, int image);

	/**
	 * Returns the OpenGL texture id associated with a NanoVG image.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle
	 */
	public static int nvglImageHandle(long ctx, int image) {
		if ( CHECKS )
			checkPointer(ctx);
		return nnvglImageHandle(ctx, image);
	}

	// --- [ nvgCreateGLES2 ] ---

	/**
	 * Creates a NanoVG context with an OpenGL ES 2.0 rendering back-end.
	 *
	 * @param flags the context flags. One of:<br>{@link #NVG_ANTIALIAS ANTIALIAS}, {@link #NVG_STENCIL_STROKES STENCIL_STROKES}, {@link #NVG_DEBUG DEBUG}
	 */
	public static native long nvgCreateGLES2(int flags);

	// --- [ nvgDeleteGLES2 ] ---

	/** JNI method for {@link #nvgDeleteGLES2 DeleteGLES2} */
	@JavadocExclude
	public static native void nnvgDeleteGLES2(long ctx);

	/**
	 * Deletes a NanoVG context created with {@link #nvgCreateGLES2 CreateGLES2}.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgDeleteGLES2(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgDeleteGLES2(ctx);
	}

	// --- [ nvgluBindFramebuffer ] ---

	/** JNI method for {@link #nvgluBindFramebuffer luBindFramebuffer} */
	@JavadocExclude
	public static native void nnvgluBindFramebuffer(long ctx, long fb);

	/**
	 * Binds the framebuffer object associated with the specified {@link #NVG_NVGLUFramebuffer NVGLUFramebuffer}.
	 *
	 * @param ctx the NanoVG context
	 * @param fb  the framebuffer to bind
	 */
	public static void nvgluBindFramebuffer(long ctx, NVGLUFramebuffer fb) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgluBindFramebuffer(ctx, fb == null ? NULL : fb.address());
	}

	// --- [ nvgluCreateFramebuffer ] ---

	/** JNI method for {@link #nvgluCreateFramebuffer luCreateFramebuffer} */
	@JavadocExclude
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

	// --- [ nvgluDeleteFramebuffer ] ---

	/** JNI method for {@link #nvgluDeleteFramebuffer luDeleteFramebuffer} */
	@JavadocExclude
	public static native void nnvgluDeleteFramebuffer(long ctx, long fb);

	/**
	 * Deletes an {@link #NVG_NVGLUFramebuffer NVGLUFramebuffer}.
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