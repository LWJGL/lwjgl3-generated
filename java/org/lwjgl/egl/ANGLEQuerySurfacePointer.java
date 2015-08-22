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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/ANGLE/EGL_ANGLE_query_surface_pointer.txt">ANGLE_query_surface_pointer</a> extension.
 * 
 * <p>This extension allows querying pointer-sized surface attributes, thus avoiding problems with coercing 64-bit pointers into a 32-bit integer.</p>
 */
public final class ANGLEQuerySurfacePointer {

	/** Function address. */
	@JavadocExclude
	public final long QuerySurfacePointerANGLE;

	@JavadocExclude
	public ANGLEQuerySurfacePointer(FunctionProvider provider) {
		QuerySurfacePointerANGLE = provider.getFunctionAddress("eglQuerySurfacePointerANGLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ANGLEQuerySurfacePointer} instance. */
	public static ANGLEQuerySurfacePointer getInstance() {
		return checkFunctionality(EGL.getCapabilities().__ANGLEQuerySurfacePointer);
	}

	// --- [ eglQuerySurfacePointerANGLE ] ---

	/** Unsafe version of {@link #eglQuerySurfacePointerANGLE QuerySurfacePointerANGLE} */
	@JavadocExclude
	public static boolean neglQuerySurfacePointerANGLE(long dpy, long surface, int attribute, long value) {
		long __functionAddress = getInstance().QuerySurfacePointerANGLE;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPIPZ(__functionAddress, dpy, surface, attribute, value);
	}

	public static boolean eglQuerySurfacePointerANGLE(long dpy, long surface, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << POINTER_SHIFT);
		return neglQuerySurfacePointerANGLE(dpy, surface, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglQuerySurfacePointerANGLE QuerySurfacePointerANGLE} */
	public static boolean eglQuerySurfacePointerANGLE(long dpy, long surface, int attribute, PointerBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return neglQuerySurfacePointerANGLE(dpy, surface, attribute, memAddress(value));
	}

}