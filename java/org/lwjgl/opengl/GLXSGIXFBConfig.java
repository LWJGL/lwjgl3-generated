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
import static org.lwjgl.system.APIUtil.*;

import org.lwjgl.system.linux.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGIX/fbconfig.txt">GLX_SGIX_fbconfig</a> extension.
 * <p/>
 * This extension introduces a new way to describe the capabilities of a GLX drawable (i.e., to describe the depth of color buffer components and the type
 * and size of ancillary buffers), removes the "similarity" requirement when making a context current to a drawable, and supports  RGBA rendering to
 * one-and two-component Windows and GLX Pixmaps.
 */
public final class GLXSGIXFBConfig {

	/** Accepted by the {@code attribute} parameter of {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX}, and by the {@code attrib_list} parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX}: */
	public static final int
		GLX_DRAWABLE_TYPE_SGIX = 0x8010,
		GLX_RENDER_TYPE_SGIX   = 0x8011,
		GLX_X_RENDERABLE_SGIX  = 0x8012;

	/**
	 * Accepted by the {@code attribute} parameter of {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX}, the {@code attrib_list} parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX},
	 * by the {@code attribute} parameter of {@link GLXSGIXPbuffer#glXQueryGLXPbufferSGIX QueryGLXPbufferSGIX} and by the {@code attribute} parameter of
	 * {@link GLXEXTImportContext#glXQueryContextInfoEXT QueryContextInfoEXT}:
	 */
	public static final int
		GLX_FBCONFIG_ID_SGIX = 0x8013;

	/** Accepted by the {@code attribute} parameter of {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX}: */
	public static final int
		GLX_SCREEN_EXT = 0x800C;

	/**
	 * Returned by {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} (when {@code attribute} is set to {@link #GLX_DRAWABLE_TYPE_SGIX DRAWABLE_TYPE_SGIX}) and accepted by the {@code attrib_list}
	 * parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX} (following the {@link #GLX_DRAWABLE_TYPE_SGIX DRAWABLE_TYPE_SGIX} token):
	 */
	public static final int
		GLX_WINDOW_BIT_SGIX = 0x1,
		GLX_PIXMAP_BIT_SGIX = 0x2;

	/**
	 * Returned by {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} (when {@code attribute} is set to {@link #GLX_RENDER_TYPE_SGIX RENDER_TYPE_SGIX}) and accepted by the {@code attrib_list}
	 * parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX} (following the {@link #GLX_RENDER_TYPE_SGIX RENDER_TYPE_SGIX} token):
	 */
	public static final int
		GLX_RGBA_BIT_SGIX        = 0x1,
		GLX_COLOR_INDEX_BIT_SGIX = 0x2;

	/** Accepted by the {@code render_type} parameter of {@link #glXCreateContextWithConfigSGIX CreateContextWithConfigSGIX}: */
	public static final int
		GLX_RGBA_TYPE_SGIX        = 0x8014,
		GLX_COLOR_INDEX_TYPE_SGIX = 0x8015;

	private GLXSGIXFBConfig() {}

	// --- [ glXGetFBConfigAttribSGIX ] ---

	/** JNI method for {@link #glXGetFBConfigAttribSGIX glXGetFBConfigAttribSGIX} */
	public static native int nglXGetFBConfigAttribSGIX(long display, long config, int attribute, long value, long __functionAddress);

	/**
	 * Gets the value of a GLX attribute for a {@code GLXFBConfigSGIX}.
	 *
	 * @param display   the connection to the X server
	 * @param config    the {@code GLXFBConfigSGIX} being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static int glXGetFBConfigAttribSGIX(long display, long config, int attribute, ByteBuffer value) {
		long __functionAddress = getInstance().glXGetFBConfigAttribSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
			checkBuffer(value, 1 << 2);
		}
		return nglXGetFBConfigAttribSGIX(display, config, attribute, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glXGetFBConfigAttribSGIX glXGetFBConfigAttribSGIX} */
	public static int glXGetFBConfigAttribSGIX(long display, long config, int attribute, IntBuffer value) {
		long __functionAddress = getInstance().glXGetFBConfigAttribSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
			checkBuffer(value, 1);
		}
		return nglXGetFBConfigAttribSGIX(display, config, attribute, memAddress(value), __functionAddress);
	}

	// --- [ glXChooseFBConfigSGIX ] ---

	/** JNI method for {@link #glXChooseFBConfigSGIX glXChooseFBConfigSGIX} */
	public static native long nglXChooseFBConfigSGIX(long display, int screen, long attrib_list, long nelements, long __functionAddress);

	/**
	 * Gets {@code GLXFBConfigSGIX}s that match a list of attributes or to get the list of GLXFBConfigSGIXs that are available on the specified screen.
	 *
	 * @param display     the connection to the X server
	 * @param screen      the screen number
	 * @param attrib_list an optional list of attributes, terminated with {@link org.lwjgl.system.linux.X#None}
	 */
	public static PointerBuffer glXChooseFBConfigSGIX(long display, int screen, ByteBuffer attrib_list) {
		long __functionAddress = getInstance().glXChooseFBConfigSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		APIBuffer __buffer = apiBuffer();
		int nelements = __buffer.intParam();
		long __result = nglXChooseFBConfigSGIX(display, screen, memAddressSafe(attrib_list), __buffer.address() + nelements, __functionAddress);
		return memPointerBuffer(__result, __buffer.intValue(nelements));
	}

	/** Alternative version of: {@link #glXChooseFBConfigSGIX glXChooseFBConfigSGIX} */
	public static PointerBuffer glXChooseFBConfigSGIX(long display, int screen, IntBuffer attrib_list) {
		long __functionAddress = getInstance().glXChooseFBConfigSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		APIBuffer __buffer = apiBuffer();
		int nelements = __buffer.intParam();
		long __result = nglXChooseFBConfigSGIX(display, screen, memAddressSafe(attrib_list), __buffer.address() + nelements, __functionAddress);
		return memPointerBuffer(__result, __buffer.intValue(nelements));
	}

	// --- [ glXCreateGLXPixmapWithConfigSGIX ] ---

	/** JNI method for {@link #glXCreateGLXPixmapWithConfigSGIX glXCreateGLXPixmapWithConfigSGIX} */
	public static native long nglXCreateGLXPixmapWithConfigSGIX(long display, long config, long pixmap, long __functionAddress);

	/**
	 * Creates a GLX pixmap using a {@code GLXFBConfigSGIX}.
	 *
	 * @param display the connection to the X server
	 * @param config  the {@code GLXFBConfigSGIX}
	 * @param pixmap  the pixmap
	 */
	public static long glXCreateGLXPixmapWithConfigSGIX(long display, long config, long pixmap) {
		long __functionAddress = getInstance().glXCreateGLXPixmapWithConfigSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
		}
		return nglXCreateGLXPixmapWithConfigSGIX(display, config, pixmap, __functionAddress);
	}

	// --- [ glXCreateContextWithConfigSGIX ] ---

	/** JNI method for {@link #glXCreateContextWithConfigSGIX glXCreateContextWithConfigSGIX} */
	public static native long nglXCreateContextWithConfigSGIX(long display, long config, int render_type, long share_list, int direct, long __functionAddress);

	/**
	 * Creates a GLX context using a {@code GLXFBConfigSGIX}.
	 *
	 * @param display     the connection to the X server
	 * @param config      the {@code GLXFBConfigSGIX}
	 * @param render_type the render type. One of:<p/>{@link #GLX_RGBA_TYPE_SGIX RGBA_TYPE_SGIX}, {@link #GLX_COLOR_INDEX_TYPE_SGIX COLOR_INDEX_TYPE_SGIX}
	 * @param share_list  the GLX context to share objects with
	 * @param direct      direct rendering request
	 */
	public static long glXCreateContextWithConfigSGIX(long display, long config, int render_type, long share_list, int direct) {
		long __functionAddress = getInstance().glXCreateContextWithConfigSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
			checkPointer(share_list);
		}
		return nglXCreateContextWithConfigSGIX(display, config, render_type, share_list, direct, __functionAddress);
	}

	// --- [ glXGetVisualFromFBConfigSGIX ] ---

	/** JNI method for {@link #glXGetVisualFromFBConfigSGIX glXGetVisualFromFBConfigSGIX} */
	public static native long nglXGetVisualFromFBConfigSGIX(long display, long config, long __functionAddress);

	/**
	 * Retrieves the associated visual of a {@code GLXFBConfigSGIX}.
	 *
	 * @param display the connection to the X server
	 * @param config  the {@code GLXFBConfigSGIX}
	 */
	public static ByteBuffer glXGetVisualFromFBConfigSGIX(long display, long config) {
		long __functionAddress = getInstance().glXGetVisualFromFBConfigSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(config);
		}
		long __result = nglXGetVisualFromFBConfigSGIX(display, config, __functionAddress);
		return memByteBuffer(__result, XVisualInfo.SIZEOF);
	}

	// --- [ glXGetFBConfigFromVisualSGIX ] ---

	/** JNI method for {@link #glXGetFBConfigFromVisualSGIX glXGetFBConfigFromVisualSGIX} */
	public static native long nglXGetFBConfigFromVisualSGIX(long display, long vis, long __functionAddress);

	/**
	 * Retrieves the {@code GLXFBConfigSGIX} associated with a visual.
	 *
	 * @param display the connection to the X server
	 * @param vis     the visual
	 */
	public static long glXGetFBConfigFromVisualSGIX(long display, ByteBuffer vis) {
		long __functionAddress = getInstance().glXGetFBConfigFromVisualSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkBuffer(vis, XVisualInfo.SIZEOF);
		}
		return nglXGetFBConfigFromVisualSGIX(display, memAddress(vis), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	@JavadocExclude
	public static Functions getInstance() {
		return GL.getCapabilities().__GLXSGIXFBConfig;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGIX_fbconfig") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glXGetFBConfigAttribSGIX) &&
			GL.isFunctionSupported(funcs.glXChooseFBConfigSGIX) &&
			GL.isFunctionSupported(funcs.glXCreateGLXPixmapWithConfigSGIX) &&
			GL.isFunctionSupported(funcs.glXCreateContextWithConfigSGIX) &&
			GL.isFunctionSupported(funcs.glXGetVisualFromFBConfigSGIX) &&
			GL.isFunctionSupported(funcs.glXGetFBConfigFromVisualSGIX);

		return GL.checkExtension("GLX_SGIX_fbconfig", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLXSGIXFBConfig}. */
	@JavadocExclude
	public static final class Functions implements FunctionMap {

		public final long
			glXGetFBConfigAttribSGIX,
			glXChooseFBConfigSGIX,
			glXCreateGLXPixmapWithConfigSGIX,
			glXCreateContextWithConfigSGIX,
			glXGetVisualFromFBConfigSGIX,
			glXGetFBConfigFromVisualSGIX;

		public Functions(FunctionProvider provider) {
			glXGetFBConfigAttribSGIX = provider.getFunctionAddress("glXGetFBConfigAttribSGIX");
			glXChooseFBConfigSGIX = provider.getFunctionAddress("glXChooseFBConfigSGIX");
			glXCreateGLXPixmapWithConfigSGIX = provider.getFunctionAddress("glXCreateGLXPixmapWithConfigSGIX");
			glXCreateContextWithConfigSGIX = provider.getFunctionAddress("glXCreateContextWithConfigSGIX");
			glXGetVisualFromFBConfigSGIX = provider.getFunctionAddress("glXGetVisualFromFBConfigSGIX");
			glXGetFBConfigFromVisualSGIX = provider.getFunctionAddress("glXGetFBConfigFromVisualSGIX");
		}

	}

}