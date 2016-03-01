/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_native_query.txt">NV_native_query</a> extension.
 * 
 * <p>This extension allows an application to query which native display, pixmap and surface corresponds to a EGL object.</p>
 */
public class NVNativeQuery {

	/** Function address. */
	public final long
		QueryNativeDisplayNV,
		QueryNativeWindowNV,
		QueryNativePixmapNV;

	protected NVNativeQuery() {
		throw new UnsupportedOperationException();
	}

	public NVNativeQuery(FunctionProvider provider) {
		QueryNativeDisplayNV = provider.getFunctionAddress("eglQueryNativeDisplayNV");
		QueryNativeWindowNV = provider.getFunctionAddress("eglQueryNativeWindowNV");
		QueryNativePixmapNV = provider.getFunctionAddress("eglQueryNativePixmapNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVNativeQuery} instance. */
	public static NVNativeQuery getInstance() {
		return getInstance(EGL.getCapabilities());
	}

	/** Returns the {@link NVNativeQuery} instance of the specified {@link EGLCapabilities}. */
	public static NVNativeQuery getInstance(EGLCapabilities caps) {
		return checkFunctionality(caps.__NVNativeQuery);
	}

	// --- [ eglQueryNativeDisplayNV ] ---

	/** Unsafe version of {@link #eglQueryNativeDisplayNV QueryNativeDisplayNV} */
	public static int neglQueryNativeDisplayNV(long dpy, long display_id) {
		long __functionAddress = getInstance().QueryNativeDisplayNV;
		if ( CHECKS )
			checkPointer(dpy);
		return callPPI(__functionAddress, dpy, display_id);
	}

	public static int eglQueryNativeDisplayNV(long dpy, ByteBuffer display_id) {
		if ( CHECKS )
			checkBuffer(display_id, 1 << POINTER_SHIFT);
		return neglQueryNativeDisplayNV(dpy, memAddress(display_id));
	}

	/** Alternative version of: {@link #eglQueryNativeDisplayNV QueryNativeDisplayNV} */
	public static int eglQueryNativeDisplayNV(long dpy, PointerBuffer display_id) {
		if ( CHECKS )
			checkBuffer(display_id, 1);
		return neglQueryNativeDisplayNV(dpy, memAddress(display_id));
	}

	// --- [ eglQueryNativeWindowNV ] ---

	/** Unsafe version of {@link #eglQueryNativeWindowNV QueryNativeWindowNV} */
	public static int neglQueryNativeWindowNV(long dpy, long surf, long window) {
		long __functionAddress = getInstance().QueryNativeWindowNV;
		if ( CHECKS ) {
			checkPointer(dpy);
			checkPointer(surf);
		}
		return callPPPI(__functionAddress, dpy, surf, window);
	}

	public static int eglQueryNativeWindowNV(long dpy, long surf, ByteBuffer window) {
		if ( CHECKS )
			checkBuffer(window, 1 << POINTER_SHIFT);
		return neglQueryNativeWindowNV(dpy, surf, memAddress(window));
	}

	/** Alternative version of: {@link #eglQueryNativeWindowNV QueryNativeWindowNV} */
	public static int eglQueryNativeWindowNV(long dpy, long surf, PointerBuffer window) {
		if ( CHECKS )
			checkBuffer(window, 1);
		return neglQueryNativeWindowNV(dpy, surf, memAddress(window));
	}

	// --- [ eglQueryNativePixmapNV ] ---

	/** Unsafe version of {@link #eglQueryNativePixmapNV QueryNativePixmapNV} */
	public static int neglQueryNativePixmapNV(long dpy, long surf, long pixmap) {
		long __functionAddress = getInstance().QueryNativePixmapNV;
		if ( CHECKS ) {
			checkPointer(dpy);
			checkPointer(surf);
		}
		return callPPPI(__functionAddress, dpy, surf, pixmap);
	}

	public static int eglQueryNativePixmapNV(long dpy, long surf, ByteBuffer pixmap) {
		if ( CHECKS )
			checkBuffer(pixmap, 1 << POINTER_SHIFT);
		return neglQueryNativePixmapNV(dpy, surf, memAddress(pixmap));
	}

	/** Alternative version of: {@link #eglQueryNativePixmapNV QueryNativePixmapNV} */
	public static int eglQueryNativePixmapNV(long dpy, long surf, PointerBuffer pixmap) {
		if ( CHECKS )
			checkBuffer(pixmap, 1);
		return neglQueryNativePixmapNV(dpy, surf, memAddress(pixmap));
	}

}