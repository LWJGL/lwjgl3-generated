/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_native_query.txt">NV_native_query</a> extension.
 * 
 * <p>This extension allows an application to query which native display, pixmap and surface corresponds to a EGL object.</p>
 */
public class NVNativeQuery {

	protected NVNativeQuery() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglQueryNativeDisplayNV, caps.eglQueryNativeWindowNV, caps.eglQueryNativePixmapNV
		);
	}

	// --- [ eglQueryNativeDisplayNV ] ---

	public static int neglQueryNativeDisplayNV(long dpy, long display_id) {
		long __functionAddress = EGL.getCapabilities().eglQueryNativeDisplayNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
		}
		return callPPI(__functionAddress, dpy, display_id);
	}

	public static boolean eglQueryNativeDisplayNV(long dpy, PointerBuffer display_id) {
		if ( CHECKS )
			checkBuffer(display_id, 1);
		return neglQueryNativeDisplayNV(dpy, memAddress(display_id)) != 0;
	}

	// --- [ eglQueryNativeWindowNV ] ---

	public static int neglQueryNativeWindowNV(long dpy, long surf, long window) {
		long __functionAddress = EGL.getCapabilities().eglQueryNativeWindowNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(surf);
		}
		return callPPPI(__functionAddress, dpy, surf, window);
	}

	public static boolean eglQueryNativeWindowNV(long dpy, long surf, PointerBuffer window) {
		if ( CHECKS )
			checkBuffer(window, 1);
		return neglQueryNativeWindowNV(dpy, surf, memAddress(window)) != 0;
	}

	// --- [ eglQueryNativePixmapNV ] ---

	public static int neglQueryNativePixmapNV(long dpy, long surf, long pixmap) {
		long __functionAddress = EGL.getCapabilities().eglQueryNativePixmapNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(surf);
		}
		return callPPPI(__functionAddress, dpy, surf, pixmap);
	}

	public static boolean eglQueryNativePixmapNV(long dpy, long surf, PointerBuffer pixmap) {
		if ( CHECKS )
			checkBuffer(pixmap, 1);
		return neglQueryNativePixmapNV(dpy, surf, memAddress(pixmap)) != 0;
	}

}