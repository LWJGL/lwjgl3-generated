/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.opengl.*;

/** Native bindings to GLX. */
public final class GLX {

	/** Names for attributes to {@link #glXGetConfig}. */
	public static final int
		USE_GL           = 0x1,
		BUFFER_SIZE      = 0x2,
		LEVEL            = 0x3,
		RGBA             = 0x4,
		DOUBLEBUFFER     = 0x5,
		STEREO           = 0x6,
		AUX_BUFFERS      = 0x7,
		RED_SIZE         = 0x8,
		GREEN_SIZE       = 0x9,
		BLUE_SIZE        = 0xA,
		ALPHA_SIZE       = 0xB,
		DEPTH_SIZE       = 0xC,
		STENCIL_SIZE     = 0xD,
		ACCUM_RED_SIZE   = 0xE,
		ACCUM_GREEN_SIZE = 0xF,
		ACCUM_BLUE_SIZE  = 0x10,
		ACCUM_ALPHA_SIZE = 0x11;

	/** Error return values from {@link #glXGetConfig}. Success is indicated by a value of 0. */
	public static final int
		BAD_SCREEN    = 0x1,
		BAD_ATTRIBUTE = 0x2,
		NO_EXTENSION  = 0x3,
		BAD_VISUAL    = 0x4,
		BAD_CONTEXT   = 0x5,
		BAD_VALUE     = 0x6,
		BAD_ENUM      = 0x7;

	private GLX() {}

	// --- [ QueryExtension ] ---

	/** JNI method for {@link #QueryExtension} */
	public static native int nQueryExtension(long display, long error_base, long event_base);

	/**
	 * Ascertains if the GLX extension is defined for an X server.
	 *
	 * @param display    the connection to the X server
	 * @param error_base returns the value of the first error code
	 * @param event_base returns the value of the first event code
	 */
	public static int QueryExtension(long display, ByteBuffer error_base, ByteBuffer event_base) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(error_base, 1 << 2);
			checkBuffer(event_base, 1 << 2);
		}
		return nQueryExtension(display, memAddress(error_base), memAddress(event_base));
	}

	/** Alternative version of: {@link #QueryExtension} */
	public static int QueryExtension(long display, IntBuffer error_base, IntBuffer event_base) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(error_base, 1);
			checkBuffer(event_base, 1);
		}
		return nQueryExtension(display, memAddress(error_base), memAddress(event_base));
	}

	// --- [ QueryVersion ] ---

	/** JNI method for {@link #QueryVersion} */
	public static native int nQueryVersion(long display, long major, long minor);

	/**
	 * Queries the GLX version supported.
	 *
	 * @param display the connection to the X server
	 * @param major   returns the major version
	 * @param minor   returns the minor version
	 */
	public static int QueryVersion(long display, ByteBuffer major, ByteBuffer minor) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(major, 1 << 2);
			checkBuffer(minor, 1 << 2);
		}
		return nQueryVersion(display, memAddress(major), memAddress(minor));
	}

	/** Alternative version of: {@link #QueryVersion} */
	public static int QueryVersion(long display, IntBuffer major, IntBuffer minor) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(major, 1);
			checkBuffer(minor, 1);
		}
		return nQueryVersion(display, memAddress(major), memAddress(minor));
	}

	// --- [ GetConfig ] ---

	/** JNI method for {@link #GetConfig} */
	public static native int nGetConfig(long display, long visual, int attribute, long value);

	/**
	 * Returns a description of an OpenGL attribute exported by a Visual.
	 *
	 * @param display   the connection to the X server
	 * @param visual    a pointer to an {@link XVisualInfo} structure
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static int GetConfig(long display, ByteBuffer visual, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(visual, XVisualInfo.SIZEOF);
			checkBuffer(value, 1 << 2);
		}
		return nGetConfig(display, memAddress(visual), attribute, memAddress(value));
	}

	/** Alternative version of: {@link #GetConfig} */
	public static int GetConfig(long display, ByteBuffer visual, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(visual, XVisualInfo.SIZEOF);
			checkBuffer(value, 1);
		}
		return nGetConfig(display, memAddress(visual), attribute, memAddress(value));
	}

	// --- [ ChooseVisual ] ---

	/** JNI method for {@link #ChooseVisual} */
	public static native long nChooseVisual(long display, int screen, long attrib_list);

	/**
	 * Finds a visual that matches the client’s specified attributes.
	 *
	 * @param display     the connection to the X server
	 * @param screen      the screen number
	 * @param attrib_list a list of attributes terminated with {@link X#None}
	 *
	 * @return a pointer to an {@code XVisualInfo} structure describing the visual that best matches the specified attributes. If no matching visual exists, {@code NULL} is
	 *         returned.
	 */
	public static ByteBuffer ChooseVisual(long display, int screen, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			if ( attrib_list != null ) checkNT4(attrib_list);
		}
		long __result = nChooseVisual(display, screen, memAddressSafe(attrib_list));
		return memByteBuffer(__result, XVisualInfo.SIZEOF);
	}

	/** Alternative version of: {@link #ChooseVisual} */
	public static ByteBuffer ChooseVisual(long display, int screen, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			if ( attrib_list != null ) checkNT(attrib_list);
		}
		long __result = nChooseVisual(display, screen, memAddressSafe(attrib_list));
		return memByteBuffer(__result, XVisualInfo.SIZEOF);
	}

	// --- [ CreateContext ] ---

	/** JNI method for {@link #CreateContext} */
	public static native long nCreateContext(long display, long visual, long share_list, int direct);

	/**
	 * Creates an OpenGL context.
	 *
	 * @param display    the connection to the X server
	 * @param visual     a pointer to an {@link XVisualInfo} structure
	 * @param share_list the GLXContext to share objects with
	 * @param direct     whether direct rendering is requested
	 */
	public static long CreateContext(long display, ByteBuffer visual, long share_list, int direct) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(visual, XVisualInfo.SIZEOF);
			checkPointer(share_list);
		}
		return nCreateContext(display, memAddress(visual), share_list, direct);
	}

	// --- [ MakeCurrent ] ---

	/** JNI method for {@link #MakeCurrent} */
	public static native int nMakeCurrent(long display, long draw, long ctx);

	/**
	 * Makes a context current in the current thread
	 *
	 * @param display the connection to the X server
	 * @param draw    the draw GLXdrawable
	 * @param ctx     the GLXContext to make current
	 */
	public static int MakeCurrent(long display, long draw, long ctx) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(draw);
			checkPointer(ctx);
		}
		return nMakeCurrent(display, draw, ctx);
	}

	// --- [ CopyContext ] ---

	/** JNI method for {@link #CopyContext} */
	public static native void nCopyContext(long display, long source, long dest, long mask);

	/**
	 * Copies OpenGL rendering state from one context to another.
	 *
	 * @param display the connection to the X server
	 * @param source  the source GLXContext
	 * @param dest    the destination GLXContext
	 * @param mask    indicates which groups of state variables are to be copied; it contains the bitwise OR of the symbolic names for the attribute groups
	 */
	public static void CopyContext(long display, long source, long dest, long mask) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(source);
			checkPointer(dest);
		}
		nCopyContext(display, source, dest, mask);
	}

	// --- [ IsDirect ] ---

	/** JNI method for {@link #IsDirect} */
	public static native int nIsDirect(long display, long ctx);

	/**
	 * Determines if an OpenGL rendering context is direct.
	 *
	 * @param display the connection to the X server
	 * @param ctx     the GLXContext to query
	 */
	public static int IsDirect(long display, long ctx) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(ctx);
		}
		return nIsDirect(display, ctx);
	}

	// --- [ DestroyContext ] ---

	/** JNI method for {@link #DestroyContext} */
	public static native void nDestroyContext(long display, long ctx);

	/**
	 * Destroys an OpenGL context.
	 * <p/>
	 * If {@code ctx} is still current to any thread, {@code ctx} is not destroyed until it is no longer current. In any event, the associated XID will be
	 * destroyed and {@code ctx} cannot subsequently be made current to any thread.
	 *
	 * @param display the connection to the X server
	 * @param ctx     the GLXContext to destroy
	 */
	public static void DestroyContext(long display, long ctx) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(ctx);
		}
		nDestroyContext(display, ctx);
	}

	// --- [ GetCurrentContext ] ---

	/** Returns the GLXContext that is current in the current thread. */
	public static native long GetCurrentContext();

	// --- [ GetCurrentDrawable ] ---

	/** Returns the XID of the current drawable used for rendering. */
	public static native long GetCurrentDrawable();

	// --- [ WaitGL ] ---

	/**
	 * Prevents X requests from executing until any outstanding OpenGL rendering is done.
	 * <p/>
	 * OpenGL calls made prior to {@code glXWaitGL} are guaranteed to be executed before X rendering calls made after {@code glXWaitGL}. While the same result
	 * can be achieved using {@link GL11.glFinish}, {@code glXWaitGL} does not require a round trip to the server, and is therefore more efficient in cases
	 * where the client and server are on separate machines.
	 */
	public static native void WaitGL();

	// --- [ WaitX ] ---

	/**
	 * Prevents the OpenGL command sequence from executing until any outstanding X requests are completed.
	 * <p/>
	 * X rendering calls made prior to {@code glXWaitX} are guaranteed to be executed before OpenGL rendering calls made after {@code glXWaitX}. While the same
	 * result can be achieved using {@link Xlib#XSync}, {@code glXWaitX} does not require a round trip to the server, and may therefore be more efficient.
	 */
	public static native void WaitX();

	// --- [ SwapBuffers ] ---

	/** JNI method for {@link #SwapBuffers} */
	public static native void nSwapBuffers(long display, long draw);

	/**
	 * For drawables that are double buffered, makes the contexts of the back buffer potentially visible (i.e., become the contents of the front buffer).
	 * <p/>
	 * The contents of the back buffer then become undefined. This operation is a no-op if draw was created with a non-double-buffered GLXFBConfig, or if draw
	 * is a GLXPixmap.
	 *
	 * @param display the connection to the X server
	 * @param draw    a double buffered GLXDrawable
	 */
	public static void SwapBuffers(long display, long draw) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(draw);
		}
		nSwapBuffers(display, draw);
	}

	// --- [ UseXFont ] ---

	/**
	 * Provides a shortcut for using X fonts.
	 *
	 * @param font      the font to use
	 * @param first     the first glyph in the font to use
	 * @param count     the number of display lists to define
	 * @param list_base the base list number
	 */
	public static native void UseXFont(long font, int first, int count, int list_base);

	// --- [ CreateGLXPixmap ] ---

	/** JNI method for {@link #CreateGLXPixmap} */
	public static native long nCreateGLXPixmap(long display, long visual, long pixmap);

	/**
	 * Creates a GLXPixmap from a Pixmap.
	 *
	 * @param display the connection to the X server
	 * @param visual  a pointer to a {@link XVisualInfo} structure
	 * @param pixmap  the Pixmap
	 */
	public static long CreateGLXPixmap(long display, ByteBuffer visual, long pixmap) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(visual, XVisualInfo.SIZEOF);
		}
		return nCreateGLXPixmap(display, memAddress(visual), pixmap);
	}

	// --- [ DestroyGLXPixmap ] ---

	/** JNI method for {@link #DestroyGLXPixmap} */
	public static native void nDestroyGLXPixmap(long display, long pixmap);

	/**
	 * Destroys a GLXPixmap.
	 *
	 * @param display the connection to the X server
	 * @param pixmap  the GLXPixmap to destroy.
	 */
	public static void DestroyGLXPixmap(long display, long pixmap) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(pixmap);
		}
		nDestroyGLXPixmap(display, pixmap);
	}

}