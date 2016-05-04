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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/ANGLE/EGL_ANGLE_query_surface_pointer.txt">ANGLE_query_surface_pointer</a> extension.
 * 
 * <p>This extension allows querying pointer-sized surface attributes, thus avoiding problems with coercing 64-bit pointers into a 32-bit integer.</p>
 */
public class ANGLEQuerySurfacePointer {

	protected ANGLEQuerySurfacePointer() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglQuerySurfacePointerANGLE
		);
	}

	// --- [ eglQuerySurfacePointerANGLE ] ---

	public static int neglQuerySurfacePointerANGLE(long dpy, long surface, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglQuerySurfacePointerANGLE;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPPI(__functionAddress, dpy, surface, attribute, value);
	}

	public static boolean eglQuerySurfacePointerANGLE(long dpy, long surface, int attribute, PointerBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return neglQuerySurfacePointerANGLE(dpy, surface, attribute, memAddress(value)) != 0;
	}

}