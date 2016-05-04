/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The core EGL 1.1 functionality. */
public class EGL11 {

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

	protected EGL11() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglBindTexImage, caps.eglReleaseTexImage, caps.eglSurfaceAttrib, caps.eglSwapInterval
		);
	}

	// --- [ eglBindTexImage ] ---

	public static boolean eglBindTexImage(long dpy, long surface, int buffer) {
		long __functionAddress = EGL.getCapabilities().eglBindTexImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPI(__functionAddress, dpy, surface, buffer) != 0;
	}

	// --- [ eglReleaseTexImage ] ---

	public static boolean eglReleaseTexImage(long dpy, long surface, int buffer) {
		long __functionAddress = EGL.getCapabilities().eglReleaseTexImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPI(__functionAddress, dpy, surface, buffer) != 0;
	}

	// --- [ eglSurfaceAttrib ] ---

	public static boolean eglSurfaceAttrib(long dpy, long surface, int attribute, int value) {
		long __functionAddress = EGL.getCapabilities().eglSurfaceAttrib;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPI(__functionAddress, dpy, surface, attribute, value) != 0;
	}

	// --- [ eglSwapInterval ] ---

	public static boolean eglSwapInterval(long dpy, int interval) {
		long __functionAddress = EGL.getCapabilities().eglSwapInterval;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
		}
		return callPI(__functionAddress, dpy, interval) != 0;
	}

}