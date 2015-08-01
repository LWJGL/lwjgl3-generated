/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** The core EGL 1.1 functionality. */
public final class EGL11 {

	/**  */
	public static final int
		EGL_BACK_BUFFER          = 0x3084,
		EGL_BIND_TO_TEXTURE_RGB  = 0x3039,
		EGL_BIND_TO_TEXTURE_RGBA = 0x303A,
		EGL_CONTEXT_LOST         = 0x300E,
		EGL_MIN_SWAP_INTERVAL    = 0x303B,
		EGL_MAX_SWAP_INTERVAL    = 0x303C,
		EGL_MIPMAP_TEXTURE       = 0x3082,
		EGL_MIPMAP_LEVEL         = 0x3083,
		EGL_NO_TEXTURE           = 0x305C,
		EGL_TEXTURE_2D           = 0x305F,
		EGL_TEXTURE_FORMAT       = 0x3080,
		EGL_TEXTURE_RGB          = 0x305D,
		EGL_TEXTURE_RGBA         = 0x305E,
		EGL_TEXTURE_TARGET       = 0x3081;

	/** Function address. */
	@JavadocExclude
	public final long
		BindTexImage,
		ReleaseTexImage,
		SurfaceAttrib,
		SwapInterval;

	@JavadocExclude
	public EGL11(FunctionProvider provider) {
		BindTexImage = provider.getFunctionAddress("eglBindTexImage");
		ReleaseTexImage = provider.getFunctionAddress("eglReleaseTexImage");
		SurfaceAttrib = provider.getFunctionAddress("eglSurfaceAttrib");
		SwapInterval = provider.getFunctionAddress("eglSwapInterval");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EGL11} instance. */
	public static EGL11 getInstance() {
		return checkFunctionality(EGL.getCapabilities().__EGL11);
	}

	// --- [ eglBindTexImage ] ---

	/** JNI method for {@link #eglBindTexImage BindTexImage} */
	@JavadocExclude
	public static native boolean neglBindTexImage(long dpy, long surface, int buffer, long __functionAddress);

	public static boolean eglBindTexImage(long dpy, long surface, int buffer) {
		long __functionAddress = getInstance().BindTexImage;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return neglBindTexImage(dpy, surface, buffer, __functionAddress);
	}

	// --- [ eglReleaseTexImage ] ---

	/** JNI method for {@link #eglReleaseTexImage ReleaseTexImage} */
	@JavadocExclude
	public static native boolean neglReleaseTexImage(long dpy, long surface, int buffer, long __functionAddress);

	public static boolean eglReleaseTexImage(long dpy, long surface, int buffer) {
		long __functionAddress = getInstance().ReleaseTexImage;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return neglReleaseTexImage(dpy, surface, buffer, __functionAddress);
	}

	// --- [ eglSurfaceAttrib ] ---

	/** JNI method for {@link #eglSurfaceAttrib SurfaceAttrib} */
	@JavadocExclude
	public static native boolean neglSurfaceAttrib(long dpy, long surface, int attribute, int value, long __functionAddress);

	public static boolean eglSurfaceAttrib(long dpy, long surface, int attribute, int value) {
		long __functionAddress = getInstance().SurfaceAttrib;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return neglSurfaceAttrib(dpy, surface, attribute, value, __functionAddress);
	}

	// --- [ eglSwapInterval ] ---

	/** JNI method for {@link #eglSwapInterval SwapInterval} */
	@JavadocExclude
	public static native boolean neglSwapInterval(long dpy, int interval, long __functionAddress);

	public static boolean eglSwapInterval(long dpy, int interval) {
		long __functionAddress = getInstance().SwapInterval;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return neglSwapInterval(dpy, interval, __functionAddress);
	}

}