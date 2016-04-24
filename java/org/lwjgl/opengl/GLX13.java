/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.*;

/** Native bindings to GLX 1.3. */
public class GLX13 {

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

	protected GLX13() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLXCapabilities caps) {
		return checkFunctions(
			caps.glXGetFBConfigs, caps.glXChooseFBConfig, caps.glXGetFBConfigAttrib, caps.glXGetVisualFromFBConfig, caps.glXCreateWindow, caps.glXCreatePixmap, 
			caps.glXDestroyPixmap, caps.glXCreatePbuffer, caps.glXDestroyPbuffer, caps.glXQueryDrawable, caps.glXCreateNewContext, caps.glXMakeContextCurrent, 
			caps.glXGetCurrentReadDrawable, caps.glXQueryContext, caps.glXSelectEvent, caps.glXGetSelectedEvent
		);
	}

	// --- [ glXGetFBConfigs ] ---

	/**
	 * Returns the list of all GLXFBConfigs that are available on the specified screen.
	 *
	 * @param display   the connection to the X server
	 * @param screen    the screen number
	 * @param nelements returns the number of GLXFBConfigs in the returned list
	 */
	public static long nglXGetFBConfigs(long display, int screen, long nelements) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetFBConfigs;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPPP(__functionAddress, display, screen, nelements);
	}

	/**
	 * Returns the list of all GLXFBConfigs that are available on the specified screen.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen number
	 */
	public static PointerBuffer glXGetFBConfigs(long display, int screen) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		IntBuffer nelements = stack.callocInt(1);
		try {
			long __result = nglXGetFBConfigs(display, screen, memAddress(nelements));
			return memPointerBuffer(__result, nelements.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glXChooseFBConfig ] ---

	/**
	 * Returns a list of GLXFBConfigs that match a list of attributes.
	 *
	 * @param display     the connection to the X server
	 * @param screen      the screen number
	 * @param attrib_list a list of attributes terminated with {@code None}
	 * @param nelements   returns the number of GLXFBConfigs matched
	 */
	public static long nglXChooseFBConfig(long display, int screen, long attrib_list, long nelements) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXChooseFBConfig;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPPPP(__functionAddress, display, screen, attrib_list, nelements);
	}

	/**
	 * Returns a list of GLXFBConfigs that match a list of attributes.
	 *
	 * @param display     the connection to the X server
	 * @param screen      the screen number
	 * @param attrib_list a list of attributes terminated with {@code None}
	 */
	public static PointerBuffer glXChooseFBConfig(long display, int screen, IntBuffer attrib_list) {
		if ( CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		IntBuffer nelements = stack.callocInt(1);
		try {
			long __result = nglXChooseFBConfig(display, screen, memAddressSafe(attrib_list), memAddress(nelements));
			return memPointerBuffer(__result, nelements.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glXGetFBConfigAttrib ] ---

	/**
	 * Queries the value of a GLX attribute for a GLXFBConfig.
	 *
	 * @param display   the connection to the X server
	 * @param config    the GLXFBConfig being queried
	 * @param attribute the attribute to query
	 * @param value     the attribute value
	 */
	public static int nglXGetFBConfigAttrib(long display, long config, int attribute, long value) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetFBConfigAttrib;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
		}
		return callPPPI(__functionAddress, display, config, attribute, value);
	}

	/**
	 * Queries the value of a GLX attribute for a GLXFBConfig.
	 *
	 * @param display   the connection to the X server
	 * @param config    the GLXFBConfig being queried
	 * @param attribute the attribute to query
	 * @param value     the attribute value
	 */
	public static int glXGetFBConfigAttrib(long display, long config, int attribute, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return nglXGetFBConfigAttrib(display, config, attribute, memAddress(value));
	}

	// --- [ glXGetVisualFromFBConfig ] ---

	/**
	 * Retrieves the associated visual of a GLXFBConfig.
	 *
	 * @param display the connection to the X server
	 * @param config  the GLXFBConfig
	 */
	public static long nglXGetVisualFromFBConfig(long display, long config) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetVisualFromFBConfig;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
		}
		return callPPP(__functionAddress, display, config);
	}

	/**
	 * Retrieves the associated visual of a GLXFBConfig.
	 *
	 * @param display the connection to the X server
	 * @param config  the GLXFBConfig
	 */
	public static XVisualInfo glXGetVisualFromFBConfig(long display, long config) {
		long __result = nglXGetVisualFromFBConfig(display, config);
		return XVisualInfo.create(__result);
	}

	// --- [ glXCreateWindow ] ---

	/**
	 * Create an onscreen rendering area from an X Window and a desired GLXFBConfig.
	 *
	 * @param display     the connection to the X server
	 * @param config      the GLXFBConfig
	 * @param win         the X Window
	 * @param attrib_list a list of attributes terminated with {@code None}
	 */
	public static long nglXCreateWindow(long display, long config, long win, long attrib_list) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateWindow;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
		}
		return callPPPPP(__functionAddress, display, config, win, attrib_list);
	}

	/**
	 * Create an onscreen rendering area from an X Window and a desired GLXFBConfig.
	 *
	 * @param display     the connection to the X server
	 * @param config      the GLXFBConfig
	 * @param win         the X Window
	 * @param attrib_list a list of attributes terminated with {@code None}
	 */
	public static long glXCreateWindow(long display, long config, long win, IntBuffer attrib_list) {
		if ( CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list);
		return nglXCreateWindow(display, config, win, memAddressSafe(attrib_list));
	}

	// --- [ glXCreatePixmap ] ---

	/**
	 * Creates a GLXPixmap offscreen rendering area from an X Pixmap and a desired GLXFBConfig.
	 *
	 * @param display     the connection to the X server
	 * @param config      the GLXFBConfig
	 * @param pixmap      the X Pixmap
	 * @param attrib_list a list of attributes terminated with {@code None}
	 */
	public static long nglXCreatePixmap(long display, long config, long pixmap, long attrib_list) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCreatePixmap;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
		}
		return callPPPPP(__functionAddress, display, config, pixmap, attrib_list);
	}

	/**
	 * Creates a GLXPixmap offscreen rendering area from an X Pixmap and a desired GLXFBConfig.
	 *
	 * @param display     the connection to the X server
	 * @param config      the GLXFBConfig
	 * @param pixmap      the X Pixmap
	 * @param attrib_list a list of attributes terminated with {@code None}
	 */
	public static long glXCreatePixmap(long display, long config, long pixmap, IntBuffer attrib_list) {
		if ( CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list);
		return nglXCreatePixmap(display, config, pixmap, memAddressSafe(attrib_list));
	}

	// --- [ glXDestroyPixmap ] ---

	/**
	 * Destroys a GLXPixmap.
	 *
	 * @param display the connection to the X server
	 * @param pixmap  the GLXPixmap to destroy
	 */
	public static void glXDestroyPixmap(long display, long pixmap) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXDestroyPixmap;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(pixmap);
		}
		callPPV(__functionAddress, display, pixmap);
	}

	// --- [ glXCreatePbuffer ] ---

	/**
	 * Creates a GLXPbuffer from a GLXFBConfig.
	 *
	 * @param display     the connection to the X server
	 * @param config      the GLXFBConfig
	 * @param attrib_list a list of attributes terminated with {@code None}
	 */
	public static long nglXCreatePbuffer(long display, long config, long attrib_list) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCreatePbuffer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
		}
		return callPPPP(__functionAddress, display, config, attrib_list);
	}

	/**
	 * Creates a GLXPbuffer from a GLXFBConfig.
	 *
	 * @param display     the connection to the X server
	 * @param config      the GLXFBConfig
	 * @param attrib_list a list of attributes terminated with {@code None}
	 */
	public static long glXCreatePbuffer(long display, long config, IntBuffer attrib_list) {
		if ( CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list);
		return nglXCreatePbuffer(display, config, memAddressSafe(attrib_list));
	}

	// --- [ glXDestroyPbuffer ] ---

	/**
	 * Destroys a GLXPbuffer.
	 *
	 * @param display the connection to the X server
	 * @param pbuf    the GLXPbuffer to destroy
	 */
	public static void glXDestroyPbuffer(long display, long pbuf) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXDestroyPbuffer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(pbuf);
		}
		callPPV(__functionAddress, display, pbuf);
	}

	// --- [ glXQueryDrawable ] ---

	/**
	 * Queries an attribute associated with a GLXDrawable.
	 *
	 * @param display   the connection to the X server
	 * @param draw      the GLXDrawable being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static void nglXQueryDrawable(long display, long draw, int attribute, long value) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryDrawable;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(draw);
		}
		callPPPV(__functionAddress, display, draw, attribute, value);
	}

	/**
	 * Queries an attribute associated with a GLXDrawable.
	 *
	 * @param display   the connection to the X server
	 * @param draw      the GLXDrawable being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static void glXQueryDrawable(long display, long draw, int attribute, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglXQueryDrawable(display, draw, attribute, memAddress(value));
	}

	// --- [ glXCreateNewContext ] ---

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
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateNewContext;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
		}
		return callPPPP(__functionAddress, display, config, render_type, share_list, direct);
	}

	// --- [ glXMakeContextCurrent ] ---

	/**
	 * Makes a GLXContext current in the current thread.
	 *
	 * @param display the connection to the X server
	 * @param draw    the draw GLXDrawable
	 * @param read    the read GLXDrawable
	 * @param ctx     the GLXContext
	 */
	public static int glXMakeContextCurrent(long display, long draw, long read, long ctx) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXMakeContextCurrent;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPPPPI(__functionAddress, display, draw, read, ctx);
	}

	// --- [ glXGetCurrentReadDrawable ] ---

	/** Returns the current GLXDrawable used for reading in the current thread. */
	public static long glXGetCurrentReadDrawable() {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentReadDrawable;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress);
	}

	// --- [ glXQueryContext ] ---

	/**
	 * Queries the value of a GLXContext attribute.
	 *
	 * @param display   the connection to the X server
	 * @param ctx       the GLXContext being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static int nglXQueryContext(long display, long ctx, int attribute, long value) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryContext;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(ctx);
		}
		return callPPPI(__functionAddress, display, ctx, attribute, value);
	}

	/**
	 * Queries the value of a GLXContext attribute.
	 *
	 * @param display   the connection to the X server
	 * @param ctx       the GLXContext being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static int glXQueryContext(long display, long ctx, int attribute, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return nglXQueryContext(display, ctx, attribute, memAddress(value));
	}

	// --- [ glXSelectEvent ] ---

	/**
	 * Selects which GLX events should be received on a GLXDrawable.
	 *
	 * @param display    the connection to the X server
	 * @param draw       the GLXDrawable
	 * @param event_mask the selection mask
	 */
	public static void glXSelectEvent(long display, long draw, long event_mask) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXSelectEvent;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(draw);
		}
		callPPPV(__functionAddress, display, draw, event_mask);
	}

	// --- [ glXGetSelectedEvent ] ---

	/**
	 * Returns which GLX events are selected for a GLXDrawable.
	 *
	 * @param display    the connection to the X server
	 * @param draw       the GLXDrawable
	 * @param event_mask returns the selection mask
	 */
	public static void nglXGetSelectedEvent(long display, long draw, long event_mask) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetSelectedEvent;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(draw);
		}
		callPPPV(__functionAddress, display, draw, event_mask);
	}

	/**
	 * Returns which GLX events are selected for a GLXDrawable.
	 *
	 * @param display    the connection to the X server
	 * @param draw       the GLXDrawable
	 * @param event_mask returns the selection mask
	 */
	public static void glXGetSelectedEvent(long display, long draw, PointerBuffer event_mask) {
		nglXGetSelectedEvent(display, draw, memAddress(event_mask));
	}

	/** Array version of: {@link #glXGetFBConfigAttrib GetFBConfigAttrib} */
	public static int glXGetFBConfigAttrib(long display, long config, int attribute, int[] value) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetFBConfigAttrib;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
			checkBuffer(value, 1);
		}
		return callPPPI(__functionAddress, display, config, attribute, value);
	}

	/** Array version of: {@link #glXCreateWindow CreateWindow} */
	public static long glXCreateWindow(long display, long config, long win, int[] attrib_list) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateWindow;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
			if ( attrib_list != null ) checkNT(attrib_list);
		}
		return callPPPPP(__functionAddress, display, config, win, attrib_list);
	}

	/** Array version of: {@link #glXCreatePixmap CreatePixmap} */
	public static long glXCreatePixmap(long display, long config, long pixmap, int[] attrib_list) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCreatePixmap;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
			if ( attrib_list != null ) checkNT(attrib_list);
		}
		return callPPPPP(__functionAddress, display, config, pixmap, attrib_list);
	}

	/** Array version of: {@link #glXCreatePbuffer CreatePbuffer} */
	public static long glXCreatePbuffer(long display, long config, int[] attrib_list) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCreatePbuffer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
			if ( attrib_list != null ) checkNT(attrib_list);
		}
		return callPPPP(__functionAddress, display, config, attrib_list);
	}

	/** Array version of: {@link #glXQueryDrawable QueryDrawable} */
	public static void glXQueryDrawable(long display, long draw, int attribute, int[] value) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryDrawable;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(draw);
			checkBuffer(value, 1);
		}
		callPPPV(__functionAddress, display, draw, attribute, value);
	}

	/** Array version of: {@link #glXQueryContext QueryContext} */
	public static int glXQueryContext(long display, long ctx, int attribute, int[] value) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryContext;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(ctx);
			checkBuffer(value, 1);
		}
		return callPPPI(__functionAddress, display, ctx, attribute, value);
	}

}