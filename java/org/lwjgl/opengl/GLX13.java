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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

import org.lwjgl.system.linux.*;

/** Native bindings to GLX 1.3. */
public final class GLX13 {

	/** Added in GLX 1.3. */
	public static final int
		GLX_WINDOW_BIT              = 0x1,
		GLX_PIXMAP_BIT              = 0x2,
		GLX_PBUFFER_BIT             = 0x4,
		GLX_RGBA_BIT                = 0x1,
		GLX_COLOR_INDEX_BIT         = 0x2,
		GLX_PBUFFER_CLOBBER_MASK    = 0x8000000,
		GLX_FRONT_LEFT_BUFFER_BIT   = 0x1,
		GLX_FRONT_RIGHT_BUFFER_BIT  = 0x2,
		GLX_BACK_LEFT_BUFFER_BIT    = 0x4,
		GLX_BACK_RIGHT_BUFFER_BIT   = 0x8,
		GLX_AUX_BUFFERS_BIT         = 0x10,
		GLX_DEPTH_BUFFER_BIT        = 0x20,
		GLX_STENCIL_BUFFER_BIT      = 0x40,
		GLX_ACCUM_BUFFER_BIT        = 0x80,
		GLX_CONFIG_CAVEAT           = 0x20,
		GLX_X_VISUAL_TYPE           = 0x22,
		GLX_TRANSPARENT_TYPE        = 0x23,
		GLX_TRANSPARENT_INDEX_VALUE = 0x24,
		GLX_TRANSPARENT_RED_VALUE   = 0x25,
		GLX_TRANSPARENT_GREEN_VALUE = 0x26,
		GLX_TRANSPARENT_BLUE_VALUE  = 0x27,
		GLX_TRANSPARENT_ALPHA_VALUE = 0x28,
		GLX_DONT_CARE               = 0xFFFFFFFF,
		GLX_NONE                    = 0x8000,
		GLX_SLOW_CONFIG             = 0x8001,
		GLX_TRUE_COLOR              = 0x8002,
		GLX_DIRECT_COLOR            = 0x8003,
		GLX_PSEUDO_COLOR            = 0x8004,
		GLX_STATIC_COLOR            = 0x8005,
		GLX_GRAY_SCALE              = 0x8006,
		GLX_STATIC_GRAY             = 0x8007,
		GLX_TRANSPARENT_RGB         = 0x8008,
		GLX_TRANSPARENT_INDEX       = 0x8009,
		GLX_VISUAL_ID               = 0x800B,
		GLX_SCREEN                  = 0x800C,
		GLX_NON_CONFORMANT_CONFIG   = 0x800D,
		GLX_DRAWABLE_TYPE           = 0x8010,
		GLX_RENDER_TYPE             = 0x8011,
		GLX_X_RENDERABLE            = 0x8012,
		GLX_FBCONFIG_ID             = 0x8013,
		GLX_RGBA_TYPE               = 0x8014,
		GLX_COLOR_INDEX_TYPE        = 0x8015,
		GLX_MAX_PBUFFER_WIDTH       = 0x8016,
		GLX_MAX_PBUFFER_HEIGHT      = 0x8017,
		GLX_MAX_PBUFFER_PIXELS      = 0x8018,
		GLX_PRESERVED_CONTENTS      = 0x801B,
		GLX_LARGEST_PBUFFER         = 0x801C,
		GLX_WIDTH                   = 0x801D,
		GLX_HEIGHT                  = 0x801E,
		GLX_EVENT_MASK              = 0x801F,
		GLX_DAMAGED                 = 0x8020,
		GLX_SAVED                   = 0x8021,
		GLX_WINDOW                  = 0x8022,
		GLX_PBUFFER                 = 0x8023,
		GLX_PBUFFER_HEIGHT          = 0x8040,
		GLX_PBUFFER_WIDTH           = 0x8041;

	/** Function address. */
	@JavadocExclude
	public final long
		GetFBConfigs,
		ChooseFBConfig,
		GetFBConfigAttrib,
		GetVisualFromFBConfig,
		CreateWindow,
		CreatePixmap,
		DestroyPixmap,
		CreatePbuffer,
		DestroyPbuffer,
		QueryDrawable,
		CreateNewContext,
		MakeContextCurrent,
		GetCurrentReadDrawable,
		QueryContext,
		SelectEvent,
		GetSelectedEvent;

	@JavadocExclude
	public GLX13(FunctionProvider provider) {
		GetFBConfigs = provider.getFunctionAddress("glXGetFBConfigs");
		ChooseFBConfig = provider.getFunctionAddress("glXChooseFBConfig");
		GetFBConfigAttrib = provider.getFunctionAddress("glXGetFBConfigAttrib");
		GetVisualFromFBConfig = provider.getFunctionAddress("glXGetVisualFromFBConfig");
		CreateWindow = provider.getFunctionAddress("glXCreateWindow");
		CreatePixmap = provider.getFunctionAddress("glXCreatePixmap");
		DestroyPixmap = provider.getFunctionAddress("glXDestroyPixmap");
		CreatePbuffer = provider.getFunctionAddress("glXCreatePbuffer");
		DestroyPbuffer = provider.getFunctionAddress("glXDestroyPbuffer");
		QueryDrawable = provider.getFunctionAddress("glXQueryDrawable");
		CreateNewContext = provider.getFunctionAddress("glXCreateNewContext");
		MakeContextCurrent = provider.getFunctionAddress("glXMakeContextCurrent");
		GetCurrentReadDrawable = provider.getFunctionAddress("glXGetCurrentReadDrawable");
		QueryContext = provider.getFunctionAddress("glXQueryContext");
		SelectEvent = provider.getFunctionAddress("glXSelectEvent");
		GetSelectedEvent = provider.getFunctionAddress("glXGetSelectedEvent");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLX13} instance for the current context. */
	public static GLX13 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLX13);
	}

	static GLX13 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_13") ) return null;

		GLX13 funcs = new GLX13(provider);

		boolean supported = checkFunctions(
			funcs.GetFBConfigs, funcs.ChooseFBConfig, funcs.GetFBConfigAttrib, funcs.GetVisualFromFBConfig, funcs.CreateWindow, funcs.CreatePixmap, 
			funcs.DestroyPixmap, funcs.CreatePbuffer, funcs.DestroyPbuffer, funcs.QueryDrawable, funcs.CreateNewContext, funcs.MakeContextCurrent, 
			funcs.GetCurrentReadDrawable, funcs.QueryContext, funcs.SelectEvent, funcs.GetSelectedEvent
		);

		return GL.checkExtension("GLX_13", funcs, supported);
	}

	// --- [ glXGetFBConfigs ] ---

	/** JNI method for {@link #glXGetFBConfigs GetFBConfigs} */
	@JavadocExclude
	public static native long nglXGetFBConfigs(long display, int screen, long nelements, long __functionAddress);

	/** Unsafe version of {@link #glXGetFBConfigs GetFBConfigs} */
	@JavadocExclude
	public static long nglXGetFBConfigs(long display, int screen, long nelements) {
		long __functionAddress = getInstance().GetFBConfigs;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nglXGetFBConfigs(display, screen, nelements, __functionAddress);
	}

	/**
	 * Returns the list of all GLXFBConfigs that are available on the specified screen.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen number
	 */
	public static PointerBuffer glXGetFBConfigs(long display, int screen) {
		APIBuffer __buffer = apiBuffer();
		int nelements = __buffer.intParam();
		long __result = nglXGetFBConfigs(display, screen, __buffer.address(nelements));
		return memPointerBuffer(__result, __buffer.intValue(nelements));
	}

	// --- [ glXChooseFBConfig ] ---

	/** JNI method for {@link #glXChooseFBConfig ChooseFBConfig} */
	@JavadocExclude
	public static native long nglXChooseFBConfig(long display, int screen, long attrib_list, long nelements, long __functionAddress);

	/** Unsafe version of {@link #glXChooseFBConfig ChooseFBConfig} */
	@JavadocExclude
	public static long nglXChooseFBConfig(long display, int screen, long attrib_list, long nelements) {
		long __functionAddress = getInstance().ChooseFBConfig;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nglXChooseFBConfig(display, screen, attrib_list, nelements, __functionAddress);
	}

	/**
	 * Returns a list of GLXFBConfigs that match a list of attributes.
	 *
	 * @param display     the connection to the X server
	 * @param screen      the screen number
	 * @param attrib_list a list of attributes terminated with {@link X#None}
	 */
	public static PointerBuffer glXChooseFBConfig(long display, int screen, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list);
		APIBuffer __buffer = apiBuffer();
		int nelements = __buffer.intParam();
		long __result = nglXChooseFBConfig(display, screen, memAddressSafe(attrib_list), __buffer.address(nelements));
		return memPointerBuffer(__result, __buffer.intValue(nelements));
	}

	/** Alternative version of: {@link #glXChooseFBConfig ChooseFBConfig} */
	public static PointerBuffer glXChooseFBConfig(long display, int screen, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list);
		APIBuffer __buffer = apiBuffer();
		int nelements = __buffer.intParam();
		long __result = nglXChooseFBConfig(display, screen, memAddressSafe(attrib_list), __buffer.address(nelements));
		return memPointerBuffer(__result, __buffer.intValue(nelements));
	}

	// --- [ glXGetFBConfigAttrib ] ---

	/** JNI method for {@link #glXGetFBConfigAttrib GetFBConfigAttrib} */
	@JavadocExclude
	public static native int nglXGetFBConfigAttrib(long display, long config, int attribute, long value, long __functionAddress);

	/** Unsafe version of {@link #glXGetFBConfigAttrib GetFBConfigAttrib} */
	@JavadocExclude
	public static int nglXGetFBConfigAttrib(long display, long config, int attribute, long value) {
		long __functionAddress = getInstance().GetFBConfigAttrib;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(config);
		}
		return nglXGetFBConfigAttrib(display, config, attribute, value, __functionAddress);
	}

	/**
	 * Queries the value of a GLX attribute for a GLXFBConfig.
	 *
	 * @param display   the connection to the X server
	 * @param config    the GLXFBConfig being queried
	 * @param attribute the attribute to query
	 * @param value     the attribute value
	 */
	public static int glXGetFBConfigAttrib(long display, long config, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		return nglXGetFBConfigAttrib(display, config, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #glXGetFBConfigAttrib GetFBConfigAttrib} */
	public static int glXGetFBConfigAttrib(long display, long config, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return nglXGetFBConfigAttrib(display, config, attribute, memAddress(value));
	}

	// --- [ glXGetVisualFromFBConfig ] ---

	/** JNI method for {@link #glXGetVisualFromFBConfig GetVisualFromFBConfig} */
	@JavadocExclude
	public static native long nglXGetVisualFromFBConfig(long display, long config, long __functionAddress);

	/** Unsafe version of {@link #glXGetVisualFromFBConfig GetVisualFromFBConfig} */
	@JavadocExclude
	public static long nglXGetVisualFromFBConfig(long display, long config) {
		long __functionAddress = getInstance().GetVisualFromFBConfig;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(config);
		}
		return nglXGetVisualFromFBConfig(display, config, __functionAddress);
	}

	/**
	 * Retrieves the associated visual of a GLXFBConfig.
	 *
	 * @param display the connection to the X server
	 * @param config  the GLXFBConfig
	 */
	public static ByteBuffer glXGetVisualFromFBConfig(long display, long config) {
		long __result = nglXGetVisualFromFBConfig(display, config);
		return memByteBuffer(__result, XVisualInfo.SIZEOF);
	}

	// --- [ glXCreateWindow ] ---

	/** JNI method for {@link #glXCreateWindow CreateWindow} */
	@JavadocExclude
	public static native long nglXCreateWindow(long display, long config, long win, long attrib_list, long __functionAddress);

	/** Unsafe version of {@link #glXCreateWindow CreateWindow} */
	@JavadocExclude
	public static long nglXCreateWindow(long display, long config, long win, long attrib_list) {
		long __functionAddress = getInstance().CreateWindow;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(config);
		}
		return nglXCreateWindow(display, config, win, attrib_list, __functionAddress);
	}

	/**
	 * Create an onscreen rendering area from an X Window and a desired GLXFBConfig.
	 *
	 * @param display     the connection to the X server
	 * @param config      the GLXFBConfig
	 * @param win         the X Window
	 * @param attrib_list a list of attributes terminated with {@link X#None}
	 */
	public static long glXCreateWindow(long display, long config, long win, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list);
		return nglXCreateWindow(display, config, win, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #glXCreateWindow CreateWindow} */
	public static long glXCreateWindow(long display, long config, long win, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list);
		return nglXCreateWindow(display, config, win, memAddressSafe(attrib_list));
	}

	// --- [ glXCreatePixmap ] ---

	/** JNI method for {@link #glXCreatePixmap CreatePixmap} */
	@JavadocExclude
	public static native long nglXCreatePixmap(long display, long config, long pixmap, long attrib_list, long __functionAddress);

	/** Unsafe version of {@link #glXCreatePixmap CreatePixmap} */
	@JavadocExclude
	public static long nglXCreatePixmap(long display, long config, long pixmap, long attrib_list) {
		long __functionAddress = getInstance().CreatePixmap;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(config);
		}
		return nglXCreatePixmap(display, config, pixmap, attrib_list, __functionAddress);
	}

	/**
	 * Creates a GLXPixmap offscreen rendering area from an X Pixmap and a desired GLXFBConfig.
	 *
	 * @param display     the connection to the X server
	 * @param config      the GLXFBConfig
	 * @param pixmap      the X Pixmap
	 * @param attrib_list a list of attributes terminated with {@link X#None}
	 */
	public static long glXCreatePixmap(long display, long config, long pixmap, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list);
		return nglXCreatePixmap(display, config, pixmap, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #glXCreatePixmap CreatePixmap} */
	public static long glXCreatePixmap(long display, long config, long pixmap, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list);
		return nglXCreatePixmap(display, config, pixmap, memAddressSafe(attrib_list));
	}

	// --- [ glXDestroyPixmap ] ---

	/** JNI method for {@link #glXDestroyPixmap DestroyPixmap} */
	@JavadocExclude
	public static native void nglXDestroyPixmap(long display, long pixmap, long __functionAddress);

	/**
	 * Destroys a GLXPixmap.
	 *
	 * @param display the connection to the X server
	 * @param pixmap  the GLXPixmap to destroy
	 */
	public static void glXDestroyPixmap(long display, long pixmap) {
		long __functionAddress = getInstance().DestroyPixmap;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(pixmap);
		}
		nglXDestroyPixmap(display, pixmap, __functionAddress);
	}

	// --- [ glXCreatePbuffer ] ---

	/** JNI method for {@link #glXCreatePbuffer CreatePbuffer} */
	@JavadocExclude
	public static native long nglXCreatePbuffer(long display, long config, long attrib_list, long __functionAddress);

	/** Unsafe version of {@link #glXCreatePbuffer CreatePbuffer} */
	@JavadocExclude
	public static long nglXCreatePbuffer(long display, long config, long attrib_list) {
		long __functionAddress = getInstance().CreatePbuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(config);
		}
		return nglXCreatePbuffer(display, config, attrib_list, __functionAddress);
	}

	/**
	 * Creates a GLXPbuffer from a GLXFBConfig.
	 *
	 * @param display     the connection to the X server
	 * @param config      the GLXFBConfig
	 * @param attrib_list a list of attributes terminated with {@link X#None}
	 */
	public static long glXCreatePbuffer(long display, long config, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list);
		return nglXCreatePbuffer(display, config, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #glXCreatePbuffer CreatePbuffer} */
	public static long glXCreatePbuffer(long display, long config, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list);
		return nglXCreatePbuffer(display, config, memAddressSafe(attrib_list));
	}

	// --- [ glXDestroyPbuffer ] ---

	/** JNI method for {@link #glXDestroyPbuffer DestroyPbuffer} */
	@JavadocExclude
	public static native void nglXDestroyPbuffer(long display, long pbuf, long __functionAddress);

	/**
	 * Destroys a GLXPbuffer.
	 *
	 * @param display the connection to the X server
	 * @param pbuf    the GLXPbuffer to destroy
	 */
	public static void glXDestroyPbuffer(long display, long pbuf) {
		long __functionAddress = getInstance().DestroyPbuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(pbuf);
		}
		nglXDestroyPbuffer(display, pbuf, __functionAddress);
	}

	// --- [ glXQueryDrawable ] ---

	/** JNI method for {@link #glXQueryDrawable QueryDrawable} */
	@JavadocExclude
	public static native void nglXQueryDrawable(long display, long draw, int attribute, long value, long __functionAddress);

	/** Unsafe version of {@link #glXQueryDrawable QueryDrawable} */
	@JavadocExclude
	public static void nglXQueryDrawable(long display, long draw, int attribute, long value) {
		long __functionAddress = getInstance().QueryDrawable;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(draw);
		}
		nglXQueryDrawable(display, draw, attribute, value, __functionAddress);
	}

	/**
	 * Queries an attribute associated with a GLXDrawable.
	 *
	 * @param display   the connection to the X server
	 * @param draw      the GLXDrawable being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static void glXQueryDrawable(long display, long draw, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglXQueryDrawable(display, draw, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #glXQueryDrawable QueryDrawable} */
	public static void glXQueryDrawable(long display, long draw, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglXQueryDrawable(display, draw, attribute, memAddress(value));
	}

	// --- [ glXCreateNewContext ] ---

	/** JNI method for {@link #glXCreateNewContext CreateNewContext} */
	@JavadocExclude
	public static native long nglXCreateNewContext(long display, long config, int render_type, long share_list, int direct, long __functionAddress);

	/**
	 * Creates an OpenGL rendering context.
	 *
	 * @param display     the connection to the X server
	 * @param config      the GLXFBConfig
	 * @param render_type the render type
	 * @param share_list  a GLXContext to share objects with
	 * @param direct      whether direct rendering is requested
	 */
	public static long glXCreateNewContext(long display, long config, int render_type, long share_list, int direct) {
		long __functionAddress = getInstance().CreateNewContext;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(config);
		}
		return nglXCreateNewContext(display, config, render_type, share_list, direct, __functionAddress);
	}

	// --- [ glXMakeContextCurrent ] ---

	/** JNI method for {@link #glXMakeContextCurrent MakeContextCurrent} */
	@JavadocExclude
	public static native int nglXMakeContextCurrent(long display, long draw, long read, long ctx, long __functionAddress);

	/**
	 * Makes a GLXContext current in the current thread.
	 *
	 * @param display the connection to the X server
	 * @param draw    the draw GLXDrawable
	 * @param read    the read GLXDrawable
	 * @param ctx     the GLXContext
	 */
	public static int glXMakeContextCurrent(long display, long draw, long read, long ctx) {
		long __functionAddress = getInstance().MakeContextCurrent;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nglXMakeContextCurrent(display, draw, read, ctx, __functionAddress);
	}

	// --- [ glXGetCurrentReadDrawable ] ---

	/** JNI method for {@link #glXGetCurrentReadDrawable GetCurrentReadDrawable} */
	@JavadocExclude
	public static native long nglXGetCurrentReadDrawable(long __functionAddress);

	/** Returns the current GLXDrawable used for reading in the current thread. */
	public static long glXGetCurrentReadDrawable() {
		long __functionAddress = getInstance().GetCurrentReadDrawable;
		return nglXGetCurrentReadDrawable(__functionAddress);
	}

	// --- [ glXQueryContext ] ---

	/** JNI method for {@link #glXQueryContext QueryContext} */
	@JavadocExclude
	public static native int nglXQueryContext(long display, long ctx, int attribute, long value, long __functionAddress);

	/** Unsafe version of {@link #glXQueryContext QueryContext} */
	@JavadocExclude
	public static int nglXQueryContext(long display, long ctx, int attribute, long value) {
		long __functionAddress = getInstance().QueryContext;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(ctx);
		}
		return nglXQueryContext(display, ctx, attribute, value, __functionAddress);
	}

	/**
	 * Queries the value of a GLXContext attribute.
	 *
	 * @param display   the connection to the X server
	 * @param ctx       the GLXContext being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static int glXQueryContext(long display, long ctx, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		return nglXQueryContext(display, ctx, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #glXQueryContext QueryContext} */
	public static int glXQueryContext(long display, long ctx, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return nglXQueryContext(display, ctx, attribute, memAddress(value));
	}

	// --- [ glXSelectEvent ] ---

	/** JNI method for {@link #glXSelectEvent SelectEvent} */
	@JavadocExclude
	public static native void nglXSelectEvent(long display, long draw, long event_mask, long __functionAddress);

	/**
	 * Selects which GLX events should be received on a GLXDrawable.
	 *
	 * @param display    the connection to the X server
	 * @param draw       the GLXDrawable
	 * @param event_mask the selection mask
	 */
	public static void glXSelectEvent(long display, long draw, long event_mask) {
		long __functionAddress = getInstance().SelectEvent;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(draw);
		}
		nglXSelectEvent(display, draw, event_mask, __functionAddress);
	}

	// --- [ glXGetSelectedEvent ] ---

	/** JNI method for {@link #glXGetSelectedEvent GetSelectedEvent} */
	@JavadocExclude
	public static native void nglXGetSelectedEvent(long display, long draw, long event_mask, long __functionAddress);

	/** Unsafe version of {@link #glXGetSelectedEvent GetSelectedEvent} */
	@JavadocExclude
	public static void nglXGetSelectedEvent(long display, long draw, long event_mask) {
		long __functionAddress = getInstance().GetSelectedEvent;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(draw);
		}
		nglXGetSelectedEvent(display, draw, event_mask, __functionAddress);
	}

	/**
	 * Returns which GLX events are selected for a GLXDrawable.
	 *
	 * @param display    the connection to the X server
	 * @param draw       the GLXDrawable
	 * @param event_mask returns the selection mask
	 */
	public static void glXGetSelectedEvent(long display, long draw, ByteBuffer event_mask) {
		nglXGetSelectedEvent(display, draw, memAddress(event_mask));
	}

	/** Alternative version of: {@link #glXGetSelectedEvent GetSelectedEvent} */
	public static void glXGetSelectedEvent(long display, long draw, PointerBuffer event_mask) {
		nglXGetSelectedEvent(display, draw, memAddress(event_mask));
	}

}