/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_platform_base.txt">EXT_platform_base</a> extension.
 * 
 * <p>This extension defines functionality and behavior for EGL implementations that support multiple platforms at runtime. For example, on Linux an EGL
 * implementation could support X11, Wayland, GBM (Generic Buffer Manager), Surface Flinger, and perhaps other platforms.</p>
 * 
 * <p>In particular, this extension defines the following:
 * <ol>
 * <li>A mechanism by which an EGL client can detect which platforms the EGL implementation supports.</li>
 * <li>New functions that enable an EGL client to specify to which platform a native resource belongs when creating an EGL resource from that native
 * resource. For example, this extension enables an EGL client to specify, when creating an EGLSurface from a native window, that the window belongs
 * to X11.</li>
 * <li>That an EGL client is not restricted to interacting with a single platform per process. A client process can create and manage EGL resources from
 * multiple platforms.</li>
 * </ol>
 * The generic term 'platform' is used throughout this extension specification rather than 'window system' because not all EGL platforms are window
 * systems. In particular, those platforms that allow headless rendering without a display server, such as GBM, are not window systems.</p>
 * 
 * <p>This extension does not specify behavior specific to any platform, nor does it specify the set of platforms that an EGL implementation may support.
 * Platform-specific details lie outside this extension's scope and are instead described by extensions layered atop this one.</p>
 * 
 * <p>Requires {@link EGL14 EGL L.1} and <a href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_client_extensions.txt">EXT_platform_base</a> to query its existence without a display.</p>
 */
public final class EXTPlatformBase {

	/** Function address. */
	@JavadocExclude
	public final long
		GetPlatformDisplayEXT,
		CreatePlatformWindowSurfaceEXT,
		CreatePlatformPixmapSurfaceEXT;

	@JavadocExclude
	public EXTPlatformBase(FunctionProvider provider) {
		GetPlatformDisplayEXT = provider.getFunctionAddress("eglGetPlatformDisplayEXT");
		CreatePlatformWindowSurfaceEXT = provider.getFunctionAddress("eglCreatePlatformWindowSurfaceEXT");
		CreatePlatformPixmapSurfaceEXT = provider.getFunctionAddress("eglCreatePlatformPixmapSurfaceEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTPlatformBase} instance. */
	public static EXTPlatformBase getInstance() {
		return checkFunctionality(EGL.getCapabilities().__EXTPlatformBase);
	}

	// --- [ eglGetPlatformDisplayEXT ] ---

	/** Unsafe version of {@link #eglGetPlatformDisplayEXT GetPlatformDisplayEXT} */
	@JavadocExclude
	public static long neglGetPlatformDisplayEXT(int platform, long native_display, long attrib_list) {
		long __functionAddress = getInstance().GetPlatformDisplayEXT;
		if ( LWJGLUtil.CHECKS )
			checkPointer(native_display);
		return callIPPP(__functionAddress, platform, native_display, attrib_list);
	}

	public static long eglGetPlatformDisplayEXT(int platform, long native_display, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglGetPlatformDisplayEXT(platform, native_display, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglGetPlatformDisplayEXT GetPlatformDisplayEXT} */
	public static long eglGetPlatformDisplayEXT(int platform, long native_display, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglGetPlatformDisplayEXT(platform, native_display, memAddressSafe(attrib_list));
	}

	// --- [ eglCreatePlatformWindowSurfaceEXT ] ---

	/** Unsafe version of {@link #eglCreatePlatformWindowSurfaceEXT CreatePlatformWindowSurfaceEXT} */
	@JavadocExclude
	public static long neglCreatePlatformWindowSurfaceEXT(long dpy, long config, long native_window, long attrib_list) {
		long __functionAddress = getInstance().CreatePlatformWindowSurfaceEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(config);
			checkPointer(native_window);
		}
		return callPPPPP(__functionAddress, dpy, config, native_window, attrib_list);
	}

	public static long eglCreatePlatformWindowSurfaceEXT(long dpy, long config, long native_window, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreatePlatformWindowSurfaceEXT(dpy, config, native_window, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreatePlatformWindowSurfaceEXT CreatePlatformWindowSurfaceEXT} */
	public static long eglCreatePlatformWindowSurfaceEXT(long dpy, long config, long native_window, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreatePlatformWindowSurfaceEXT(dpy, config, native_window, memAddressSafe(attrib_list));
	}

	// --- [ eglCreatePlatformPixmapSurfaceEXT ] ---

	/** Unsafe version of {@link #eglCreatePlatformPixmapSurfaceEXT CreatePlatformPixmapSurfaceEXT} */
	@JavadocExclude
	public static long neglCreatePlatformPixmapSurfaceEXT(long dpy, long config, long native_pixmap, long attrib_list) {
		long __functionAddress = getInstance().CreatePlatformPixmapSurfaceEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(config);
			checkPointer(native_pixmap);
		}
		return callPPPPP(__functionAddress, dpy, config, native_pixmap, attrib_list);
	}

	public static long eglCreatePlatformPixmapSurfaceEXT(long dpy, long config, long native_pixmap, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreatePlatformPixmapSurfaceEXT(dpy, config, native_pixmap, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreatePlatformPixmapSurfaceEXT CreatePlatformPixmapSurfaceEXT} */
	public static long eglCreatePlatformPixmapSurfaceEXT(long dpy, long config, long native_pixmap, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreatePlatformPixmapSurfaceEXT(dpy, config, native_pixmap, memAddressSafe(attrib_list));
	}

}