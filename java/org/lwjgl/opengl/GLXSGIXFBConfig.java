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
 * 
 * <p>This extension introduces a new way to describe the capabilities of a GLX drawable (i.e., to describe the depth of color buffer components and the type
 * and size of ancillary buffers), removes the "similarity" requirement when making a context current to a drawable, and supports  RGBA rendering to
 * one-and two-component Windows and GLX Pixmaps.</p>
 */
public final class GLXSGIXFBConfig {

	/** Accepted by the {@code attribute} parameter of {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX}, and by the {@code attrib_list} parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX}. */
	public static final int
		GLX_DRAWABLE_TYPE_SGIX = 0x8010,
		GLX_RENDER_TYPE_SGIX   = 0x8011,
		GLX_X_RENDERABLE_SGIX  = 0x8012;

	/**
	 * Accepted by the {@code attribute} parameter of {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX}, the {@code attrib_list} parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX},
	 * by the {@code attribute} parameter of {@link GLXSGIXPbuffer#glXQueryGLXPbufferSGIX QueryGLXPbufferSGIX} and by the {@code attribute} parameter of
	 * {@link GLXEXTImportContext#glXQueryContextInfoEXT QueryContextInfoEXT}.
	 */
	public static final int GLX_FBCONFIG_ID_SGIX = 0x8013;

	/** Accepted by the {@code attribute} parameter of {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX}. */
	public static final int GLX_SCREEN_EXT = 0x800C;

	/**
	 * Returned by {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} (when {@code attribute} is set to {@link #GLX_DRAWABLE_TYPE_SGIX DRAWABLE_TYPE_SGIX}) and accepted by the {@code attrib_list}
	 * parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX} (following the {@link #GLX_DRAWABLE_TYPE_SGIX DRAWABLE_TYPE_SGIX} token).
	 */
	public static final int
		GLX_WINDOW_BIT_SGIX = 0x1,
		GLX_PIXMAP_BIT_SGIX = 0x2;

	/**
	 * Returned by {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} (when {@code attribute} is set to {@link #GLX_RENDER_TYPE_SGIX RENDER_TYPE_SGIX}) and accepted by the {@code attrib_list}
	 * parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX} (following the {@link #GLX_RENDER_TYPE_SGIX RENDER_TYPE_SGIX} token).
	 */
	public static final int
		GLX_RGBA_BIT_SGIX        = 0x1,
		GLX_COLOR_INDEX_BIT_SGIX = 0x2;

	/** Accepted by the {@code render_type} parameter of {@link #glXCreateContextWithConfigSGIX CreateContextWithConfigSGIX}. */
	public static final int
		GLX_RGBA_TYPE_SGIX        = 0x8014,
		GLX_COLOR_INDEX_TYPE_SGIX = 0x8015;

	/** Function address. */
	@JavadocExclude
	public final long
		GetFBConfigAttribSGIX,
		ChooseFBConfigSGIX,
		CreateGLXPixmapWithConfigSGIX,
		CreateContextWithConfigSGIX,
		GetVisualFromFBConfigSGIX,
		GetFBConfigFromVisualSGIX;

	@JavadocExclude
	public GLXSGIXFBConfig(FunctionProvider provider) {
		GetFBConfigAttribSGIX = provider.getFunctionAddress("glXGetFBConfigAttribSGIX");
		ChooseFBConfigSGIX = provider.getFunctionAddress("glXChooseFBConfigSGIX");
		CreateGLXPixmapWithConfigSGIX = provider.getFunctionAddress("glXCreateGLXPixmapWithConfigSGIX");
		CreateContextWithConfigSGIX = provider.getFunctionAddress("glXCreateContextWithConfigSGIX");
		GetVisualFromFBConfigSGIX = provider.getFunctionAddress("glXGetVisualFromFBConfigSGIX");
		GetFBConfigFromVisualSGIX = provider.getFunctionAddress("glXGetFBConfigFromVisualSGIX");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXSGIXFBConfig} instance for the current context. */
	public static GLXSGIXFBConfig getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLXSGIXFBConfig);
	}

	static GLXSGIXFBConfig create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGIX_fbconfig") ) return null;

		GLXSGIXFBConfig funcs = new GLXSGIXFBConfig(provider);

		boolean supported = checkFunctions(
			funcs.GetFBConfigAttribSGIX, funcs.ChooseFBConfigSGIX, funcs.CreateGLXPixmapWithConfigSGIX, funcs.CreateContextWithConfigSGIX, 
			funcs.GetVisualFromFBConfigSGIX, funcs.GetFBConfigFromVisualSGIX
		);

		return GL.checkExtension("GLX_SGIX_fbconfig", funcs, supported);
	}

	// --- [ glXGetFBConfigAttribSGIX ] ---

	/** JNI method for {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} */
	@JavadocExclude
	public static native int nglXGetFBConfigAttribSGIX(long display, long config, int attribute, long value, long __functionAddress);

	/** Unsafe version of {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} */
	@JavadocExclude
	public static int nglXGetFBConfigAttribSGIX(long display, long config, int attribute, long value) {
		long __functionAddress = getInstance().GetFBConfigAttribSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(config);
		}
		return nglXGetFBConfigAttribSGIX(display, config, attribute, value, __functionAddress);
	}

	/**
	 * Gets the value of a GLX attribute for a {@code GLXFBConfigSGIX}.
	 *
	 * @param display   the connection to the X server
	 * @param config    the {@code GLXFBConfigSGIX} being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static int glXGetFBConfigAttribSGIX(long display, long config, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		return nglXGetFBConfigAttribSGIX(display, config, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} */
	public static int glXGetFBConfigAttribSGIX(long display, long config, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return nglXGetFBConfigAttribSGIX(display, config, attribute, memAddress(value));
	}

	// --- [ glXChooseFBConfigSGIX ] ---

	/** JNI method for {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX} */
	@JavadocExclude
	public static native long nglXChooseFBConfigSGIX(long display, int screen, long attrib_list, long nelements, long __functionAddress);

	/** Unsafe version of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX} */
	@JavadocExclude
	public static long nglXChooseFBConfigSGIX(long display, int screen, long attrib_list, long nelements) {
		long __functionAddress = getInstance().ChooseFBConfigSGIX;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nglXChooseFBConfigSGIX(display, screen, attrib_list, nelements, __functionAddress);
	}

	/**
	 * Gets {@code GLXFBConfigSGIX}s that match a list of attributes or to get the list of GLXFBConfigSGIXs that are available on the specified screen.
	 *
	 * @param display     the connection to the X server
	 * @param screen      the screen number
	 * @param attrib_list an optional list of attributes, terminated with {@link org.lwjgl.system.linux.X#None}
	 */
	public static PointerBuffer glXChooseFBConfigSGIX(long display, int screen, ByteBuffer attrib_list) {
		APIBuffer __buffer = apiBuffer();
		int nelements = __buffer.intParam();
		long __result = nglXChooseFBConfigSGIX(display, screen, memAddressSafe(attrib_list), __buffer.address(nelements));
		return memPointerBuffer(__result, __buffer.intValue(nelements));
	}

	/** Alternative version of: {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX} */
	public static PointerBuffer glXChooseFBConfigSGIX(long display, int screen, IntBuffer attrib_list) {
		APIBuffer __buffer = apiBuffer();
		int nelements = __buffer.intParam();
		long __result = nglXChooseFBConfigSGIX(display, screen, memAddressSafe(attrib_list), __buffer.address(nelements));
		return memPointerBuffer(__result, __buffer.intValue(nelements));
	}

	// --- [ glXCreateGLXPixmapWithConfigSGIX ] ---

	/** JNI method for {@link #glXCreateGLXPixmapWithConfigSGIX CreateGLXPixmapWithConfigSGIX} */
	@JavadocExclude
	public static native long nglXCreateGLXPixmapWithConfigSGIX(long display, long config, long pixmap, long __functionAddress);

	/**
	 * Creates a GLX pixmap using a {@code GLXFBConfigSGIX}.
	 *
	 * @param display the connection to the X server
	 * @param config  the {@code GLXFBConfigSGIX}
	 * @param pixmap  the pixmap
	 */
	public static long glXCreateGLXPixmapWithConfigSGIX(long display, long config, long pixmap) {
		long __functionAddress = getInstance().CreateGLXPixmapWithConfigSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(config);
		}
		return nglXCreateGLXPixmapWithConfigSGIX(display, config, pixmap, __functionAddress);
	}

	// --- [ glXCreateContextWithConfigSGIX ] ---

	/** JNI method for {@link #glXCreateContextWithConfigSGIX CreateContextWithConfigSGIX} */
	@JavadocExclude
	public static native long nglXCreateContextWithConfigSGIX(long display, long config, int render_type, long share_list, int direct, long __functionAddress);

	/**
	 * Creates a GLX context using a {@code GLXFBConfigSGIX}.
	 *
	 * @param display     the connection to the X server
	 * @param config      the {@code GLXFBConfigSGIX}
	 * @param render_type the render type. One of:<br>{@link #GLX_RGBA_TYPE_SGIX RGBA_TYPE_SGIX}, {@link #GLX_COLOR_INDEX_TYPE_SGIX COLOR_INDEX_TYPE_SGIX}
	 * @param share_list  the GLX context to share objects with
	 * @param direct      direct rendering request
	 */
	public static long glXCreateContextWithConfigSGIX(long display, long config, int render_type, long share_list, int direct) {
		long __functionAddress = getInstance().CreateContextWithConfigSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(config);
			checkPointer(share_list);
		}
		return nglXCreateContextWithConfigSGIX(display, config, render_type, share_list, direct, __functionAddress);
	}

	// --- [ glXGetVisualFromFBConfigSGIX ] ---

	/** JNI method for {@link #glXGetVisualFromFBConfigSGIX GetVisualFromFBConfigSGIX} */
	@JavadocExclude
	public static native long nglXGetVisualFromFBConfigSGIX(long display, long config, long __functionAddress);

	/** Unsafe version of {@link #glXGetVisualFromFBConfigSGIX GetVisualFromFBConfigSGIX} */
	@JavadocExclude
	public static long nglXGetVisualFromFBConfigSGIX(long display, long config) {
		long __functionAddress = getInstance().GetVisualFromFBConfigSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(config);
		}
		return nglXGetVisualFromFBConfigSGIX(display, config, __functionAddress);
	}

	/**
	 * Retrieves the associated visual of a {@code GLXFBConfigSGIX}.
	 *
	 * @param display the connection to the X server
	 * @param config  the {@code GLXFBConfigSGIX}
	 */
	public static ByteBuffer glXGetVisualFromFBConfigSGIX(long display, long config) {
		long __result = nglXGetVisualFromFBConfigSGIX(display, config);
		return memByteBuffer(__result, XVisualInfo.SIZEOF);
	}

	// --- [ glXGetFBConfigFromVisualSGIX ] ---

	/** JNI method for {@link #glXGetFBConfigFromVisualSGIX GetFBConfigFromVisualSGIX} */
	@JavadocExclude
	public static native long nglXGetFBConfigFromVisualSGIX(long display, long vis, long __functionAddress);

	/** Unsafe version of {@link #glXGetFBConfigFromVisualSGIX GetFBConfigFromVisualSGIX} */
	@JavadocExclude
	public static long nglXGetFBConfigFromVisualSGIX(long display, long vis) {
		long __functionAddress = getInstance().GetFBConfigFromVisualSGIX;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nglXGetFBConfigFromVisualSGIX(display, vis, __functionAddress);
	}

	/**
	 * Retrieves the {@code GLXFBConfigSGIX} associated with a visual.
	 *
	 * @param display the connection to the X server
	 * @param vis     the visual
	 */
	public static long glXGetFBConfigFromVisualSGIX(long display, ByteBuffer vis) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(vis, XVisualInfo.SIZEOF);
		return nglXGetFBConfigFromVisualSGIX(display, memAddress(vis));
	}

}