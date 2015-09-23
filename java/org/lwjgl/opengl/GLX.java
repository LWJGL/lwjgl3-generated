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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.*;

/** Native bindings to GLX. */
public final class GLX {

	/** Errors. */
	public static final int
		GLXBadContext                = 0x0,
		GLXBadContextState           = 0x1,
		GLXBadDrawable               = 0x2,
		GLXBadPixmap                 = 0x3,
		GLXBadContextTag             = 0x4,
		GLXBadCurrentWindow          = 0x5,
		GLXBadRenderRequest          = 0x6,
		GLXBadLargeRequest           = 0x7,
		GLXUnsupportedPrivateRequest = 0x8,
		GLXBadFBConfig               = 0x9,
		GLXBadPbuffer                = 0xA,
		GLXBadCurrentDrawable        = 0xB,
		GLXBadWindow                 = 0xC;

	/** Names for attributes to {@link #glXGetConfig GetConfig}. */
	public static final int
		GLX_USE_GL           = 0x1,
		GLX_BUFFER_SIZE      = 0x2,
		GLX_LEVEL            = 0x3,
		GLX_RGBA             = 0x4,
		GLX_DOUBLEBUFFER     = 0x5,
		GLX_STEREO           = 0x6,
		GLX_AUX_BUFFERS      = 0x7,
		GLX_RED_SIZE         = 0x8,
		GLX_GREEN_SIZE       = 0x9,
		GLX_BLUE_SIZE        = 0xA,
		GLX_ALPHA_SIZE       = 0xB,
		GLX_DEPTH_SIZE       = 0xC,
		GLX_STENCIL_SIZE     = 0xD,
		GLX_ACCUM_RED_SIZE   = 0xE,
		GLX_ACCUM_GREEN_SIZE = 0xF,
		GLX_ACCUM_BLUE_SIZE  = 0x10,
		GLX_ACCUM_ALPHA_SIZE = 0x11;

	/** Error return values from {@link #glXGetConfig GetConfig}. Success is indicated by a value of 0. */
	public static final int
		GLX_BAD_SCREEN    = 0x1,
		GLX_BAD_ATTRIBUTE = 0x2,
		GLX_NO_EXTENSION  = 0x3,
		GLX_BAD_VISUAL    = 0x4,
		GLX_BAD_CONTEXT   = 0x5,
		GLX_BAD_VALUE     = 0x6,
		GLX_BAD_ENUM      = 0x7;

	/** Function address. */
	@JavadocExclude
	public final long
		QueryExtension,
		QueryVersion,
		GetConfig,
		ChooseVisual,
		CreateContext,
		MakeCurrent,
		CopyContext,
		IsDirect,
		DestroyContext,
		GetCurrentContext,
		GetCurrentDrawable,
		WaitGL,
		WaitX,
		SwapBuffers,
		UseXFont,
		CreateGLXPixmap,
		DestroyGLXPixmap;

	@JavadocExclude
	public GLX(FunctionProvider provider) {
		QueryExtension = provider.getFunctionAddress("glXQueryExtension");
		QueryVersion = provider.getFunctionAddress("glXQueryVersion");
		GetConfig = provider.getFunctionAddress("glXGetConfig");
		ChooseVisual = provider.getFunctionAddress("glXChooseVisual");
		CreateContext = provider.getFunctionAddress("glXCreateContext");
		MakeCurrent = provider.getFunctionAddress("glXMakeCurrent");
		CopyContext = provider.getFunctionAddress("glXCopyContext");
		IsDirect = provider.getFunctionAddress("glXIsDirect");
		DestroyContext = provider.getFunctionAddress("glXDestroyContext");
		GetCurrentContext = provider.getFunctionAddress("glXGetCurrentContext");
		GetCurrentDrawable = provider.getFunctionAddress("glXGetCurrentDrawable");
		WaitGL = provider.getFunctionAddress("glXWaitGL");
		WaitX = provider.getFunctionAddress("glXWaitX");
		SwapBuffers = provider.getFunctionAddress("glXSwapBuffers");
		UseXFont = provider.getFunctionAddress("glXUseXFont");
		CreateGLXPixmap = provider.getFunctionAddress("glXCreateGLXPixmap");
		DestroyGLXPixmap = provider.getFunctionAddress("glXDestroyGLXPixmap");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLX} instance for the current context. */
	public static GLX getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLX);
	}

	static GLX create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX") ) return null;

		GLX funcs = new GLX(provider);

		boolean supported = checkFunctions(
			funcs.QueryExtension, funcs.QueryVersion, funcs.GetConfig, funcs.ChooseVisual, funcs.CreateContext, funcs.MakeCurrent, funcs.CopyContext, 
			funcs.IsDirect, funcs.DestroyContext, funcs.GetCurrentContext, funcs.GetCurrentDrawable, funcs.WaitGL, funcs.WaitX, funcs.SwapBuffers, 
			funcs.UseXFont, funcs.CreateGLXPixmap, funcs.DestroyGLXPixmap
		);

		return GL.checkExtension("GLX", funcs, supported);
	}

	// --- [ glXQueryExtension ] ---

	/** Unsafe version of {@link #glXQueryExtension QueryExtension} */
	@JavadocExclude
	public static int nglXQueryExtension(long display, long error_base, long event_base) {
		long __functionAddress = getInstance().QueryExtension;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPPPI(__functionAddress, display, error_base, event_base);
	}

	/**
	 * Ascertains if the GLX extension is defined for an X server.
	 *
	 * @param display    the connection to the X server
	 * @param error_base returns the value of the first error code
	 * @param event_base returns the value of the first event code
	 */
	public static int glXQueryExtension(long display, ByteBuffer error_base, ByteBuffer event_base) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(error_base, 1 << 2);
			checkBuffer(event_base, 1 << 2);
		}
		return nglXQueryExtension(display, memAddress(error_base), memAddress(event_base));
	}

	/** Alternative version of: {@link #glXQueryExtension QueryExtension} */
	public static int glXQueryExtension(long display, IntBuffer error_base, IntBuffer event_base) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(error_base, 1);
			checkBuffer(event_base, 1);
		}
		return nglXQueryExtension(display, memAddress(error_base), memAddress(event_base));
	}

	// --- [ glXQueryVersion ] ---

	/** Unsafe version of {@link #glXQueryVersion QueryVersion} */
	@JavadocExclude
	public static int nglXQueryVersion(long display, long major, long minor) {
		long __functionAddress = getInstance().QueryVersion;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPPPI(__functionAddress, display, major, minor);
	}

	/**
	 * Queries the GLX version supported.
	 *
	 * @param display the connection to the X server
	 * @param major   returns the major version
	 * @param minor   returns the minor version
	 */
	public static int glXQueryVersion(long display, ByteBuffer major, ByteBuffer minor) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(major, 1 << 2);
			checkBuffer(minor, 1 << 2);
		}
		return nglXQueryVersion(display, memAddress(major), memAddress(minor));
	}

	/** Alternative version of: {@link #glXQueryVersion QueryVersion} */
	public static int glXQueryVersion(long display, IntBuffer major, IntBuffer minor) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(major, 1);
			checkBuffer(minor, 1);
		}
		return nglXQueryVersion(display, memAddress(major), memAddress(minor));
	}

	// --- [ glXGetConfig ] ---

	/** Unsafe version of {@link #glXGetConfig GetConfig} */
	@JavadocExclude
	public static int nglXGetConfig(long display, long visual, int attribute, long value) {
		long __functionAddress = getInstance().GetConfig;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPPIPI(__functionAddress, display, visual, attribute, value);
	}

	/**
	 * Returns a description of an OpenGL attribute exported by a Visual.
	 *
	 * @param display   the connection to the X server
	 * @param visual    a pointer to an {@link XVisualInfo} structure
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static int glXGetConfig(long display, ByteBuffer visual, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(visual, XVisualInfo.SIZEOF);
			checkBuffer(value, 1 << 2);
		}
		return nglXGetConfig(display, memAddress(visual), attribute, memAddress(value));
	}

	/** Alternative version of: {@link #glXGetConfig GetConfig} */
	public static int glXGetConfig(long display, ByteBuffer visual, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(visual, XVisualInfo.SIZEOF);
			checkBuffer(value, 1);
		}
		return nglXGetConfig(display, memAddress(visual), attribute, memAddress(value));
	}

	// --- [ glXChooseVisual ] ---

	/** Unsafe version of {@link #glXChooseVisual ChooseVisual} */
	@JavadocExclude
	public static long nglXChooseVisual(long display, int screen, long attrib_list) {
		long __functionAddress = getInstance().ChooseVisual;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPIPP(__functionAddress, display, screen, attrib_list);
	}

	/**
	 * Finds a visual that matches the client’s specified attributes.
	 *
	 * @param display     the connection to the X server
	 * @param screen      the screen number
	 * @param attrib_list a list of attributes terminated with {@code None}
	 *
	 * @return a pointer to an {@code XVisualInfo} structure describing the visual that best matches the specified attributes. If no matching visual exists, {@code NULL} is
	 *         returned.
	 */
	public static ByteBuffer glXChooseVisual(long display, int screen, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list);
		long __result = nglXChooseVisual(display, screen, memAddressSafe(attrib_list));
		return memByteBuffer(__result, XVisualInfo.SIZEOF);
	}

	/** Alternative version of: {@link #glXChooseVisual ChooseVisual} */
	public static ByteBuffer glXChooseVisual(long display, int screen, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list);
		long __result = nglXChooseVisual(display, screen, memAddressSafe(attrib_list));
		return memByteBuffer(__result, XVisualInfo.SIZEOF);
	}

	// --- [ glXCreateContext ] ---

	/** Unsafe version of {@link #glXCreateContext CreateContext} */
	@JavadocExclude
	public static long nglXCreateContext(long display, long visual, long share_list, int direct) {
		long __functionAddress = getInstance().CreateContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPPPIP(__functionAddress, display, visual, share_list, direct);
	}

	/**
	 * Creates an OpenGL context.
	 *
	 * @param display    the connection to the X server
	 * @param visual     a pointer to an {@link XVisualInfo} structure
	 * @param share_list the GLXContext to share objects with
	 * @param direct     whether direct rendering is requested
	 */
	public static long glXCreateContext(long display, ByteBuffer visual, long share_list, int direct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(visual, XVisualInfo.SIZEOF);
		return nglXCreateContext(display, memAddress(visual), share_list, direct);
	}

	// --- [ glXMakeCurrent ] ---

	/**
	 * Makes a context current in the current thread
	 *
	 * @param display the connection to the X server
	 * @param draw    the draw GLXdrawable
	 * @param ctx     the GLXContext to make current
	 */
	public static int glXMakeCurrent(long display, long draw, long ctx) {
		long __functionAddress = getInstance().MakeCurrent;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPPPI(__functionAddress, display, draw, ctx);
	}

	// --- [ glXCopyContext ] ---

	/**
	 * Copies OpenGL rendering state from one context to another.
	 *
	 * @param display the connection to the X server
	 * @param source  the source GLXContext
	 * @param dest    the destination GLXContext
	 * @param mask    indicates which groups of state variables are to be copied; it contains the bitwise OR of the symbolic names for the attribute groups
	 */
	public static void glXCopyContext(long display, long source, long dest, long mask) {
		long __functionAddress = getInstance().CopyContext;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(source);
			checkPointer(dest);
		}
		callPPPPV(__functionAddress, display, source, dest, mask);
	}

	// --- [ glXIsDirect ] ---

	/**
	 * Determines if an OpenGL rendering context is direct.
	 *
	 * @param display the connection to the X server
	 * @param ctx     the GLXContext to query
	 */
	public static int glXIsDirect(long display, long ctx) {
		long __functionAddress = getInstance().IsDirect;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(ctx);
		}
		return callPPI(__functionAddress, display, ctx);
	}

	// --- [ glXDestroyContext ] ---

	/**
	 * Destroys an OpenGL context.
	 * 
	 * <p>If {@code ctx} is still current to any thread, {@code ctx} is not destroyed until it is no longer current. In any event, the associated XID will be
	 * destroyed and {@code ctx} cannot subsequently be made current to any thread.</p>
	 *
	 * @param display the connection to the X server
	 * @param ctx     the GLXContext to destroy
	 */
	public static void glXDestroyContext(long display, long ctx) {
		long __functionAddress = getInstance().DestroyContext;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(ctx);
		}
		callPPV(__functionAddress, display, ctx);
	}

	// --- [ glXGetCurrentContext ] ---

	/** Returns the GLXContext that is current in the current thread. */
	public static long glXGetCurrentContext() {
		long __functionAddress = getInstance().GetCurrentContext;
		return callP(__functionAddress);
	}

	// --- [ glXGetCurrentDrawable ] ---

	/** Returns the XID of the current drawable used for rendering. */
	public static long glXGetCurrentDrawable() {
		long __functionAddress = getInstance().GetCurrentDrawable;
		return callP(__functionAddress);
	}

	// --- [ glXWaitGL ] ---

	/**
	 * Prevents X requests from executing until any outstanding OpenGL rendering is done.
	 * 
	 * <p>OpenGL calls made prior to {@code glXWaitGL} are guaranteed to be executed before X rendering calls made after {@code glXWaitGL}. While the same result
	 * can be achieved using {@link GL11#glFinish}, {@code glXWaitGL} does not require a round trip to the server, and is therefore more efficient in cases
	 * where the client and server are on separate machines.</p>
	 */
	public static void glXWaitGL() {
		long __functionAddress = getInstance().WaitGL;
		callV(__functionAddress);
	}

	// --- [ glXWaitX ] ---

	/**
	 * Prevents the OpenGL command sequence from executing until any outstanding X requests are completed.
	 * 
	 * <p>X rendering calls made prior to {@code glXWaitX} are guaranteed to be executed before OpenGL rendering calls made after {@code glXWaitX}. While the same
	 * result can be achieved using {@link Xlib#XSync}, {@code glXWaitX} does not require a round trip to the server, and may therefore be more efficient.</p>
	 */
	public static void glXWaitX() {
		long __functionAddress = getInstance().WaitX;
		callV(__functionAddress);
	}

	// --- [ glXSwapBuffers ] ---

	/**
	 * For drawables that are double buffered, makes the contexts of the back buffer potentially visible (i.e., become the contents of the front buffer).
	 * 
	 * <p>The contents of the back buffer then become undefined. This operation is a no-op if draw was created with a non-double-buffered GLXFBConfig, or if draw
	 * is a GLXPixmap.</p>
	 *
	 * @param display the connection to the X server
	 * @param draw    a double buffered GLXDrawable
	 */
	public static void glXSwapBuffers(long display, long draw) {
		long __functionAddress = getInstance().SwapBuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(draw);
		}
		callPPV(__functionAddress, display, draw);
	}

	// --- [ glXUseXFont ] ---

	/**
	 * Provides a shortcut for using X fonts.
	 *
	 * @param font      the font to use
	 * @param first     the first glyph in the font to use
	 * @param count     the number of display lists to define
	 * @param list_base the base list number
	 */
	public static void glXUseXFont(long font, int first, int count, int list_base) {
		long __functionAddress = getInstance().UseXFont;
		callPIIIV(__functionAddress, font, first, count, list_base);
	}

	// --- [ glXCreateGLXPixmap ] ---

	/** Unsafe version of {@link #glXCreateGLXPixmap CreateGLXPixmap} */
	@JavadocExclude
	public static long nglXCreateGLXPixmap(long display, long visual, long pixmap) {
		long __functionAddress = getInstance().CreateGLXPixmap;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPPPP(__functionAddress, display, visual, pixmap);
	}

	/**
	 * Creates a GLXPixmap from a Pixmap.
	 *
	 * @param display the connection to the X server
	 * @param visual  a pointer to a {@link XVisualInfo} structure
	 * @param pixmap  the Pixmap
	 */
	public static long glXCreateGLXPixmap(long display, ByteBuffer visual, long pixmap) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(visual, XVisualInfo.SIZEOF);
		return nglXCreateGLXPixmap(display, memAddress(visual), pixmap);
	}

	// --- [ glXDestroyGLXPixmap ] ---

	/**
	 * Destroys a GLXPixmap.
	 *
	 * @param display the connection to the X server
	 * @param pixmap  the GLXPixmap to destroy.
	 */
	public static void glXDestroyGLXPixmap(long display, long pixmap) {
		long __functionAddress = getInstance().DestroyGLXPixmap;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(pixmap);
		}
		callPPV(__functionAddress, display, pixmap);
	}

}