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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_native_query.txt">NV_native_query</a> extension.
 * 
 * <p>This extension allows an application to query which native display, pixmap and surface corresponds to a EGL object.</p>
 */
public final class NVNativeQuery {

	/** Function address. */
	@JavadocExclude
	public final long
		QueryNativeDisplayNV,
		QueryNativeWindowNV,
		QueryNativePixmapNV;

	@JavadocExclude
	public NVNativeQuery(FunctionProvider provider) {
		QueryNativeDisplayNV = provider.getFunctionAddress("eglQueryNativeDisplayNV");
		QueryNativeWindowNV = provider.getFunctionAddress("eglQueryNativeWindowNV");
		QueryNativePixmapNV = provider.getFunctionAddress("eglQueryNativePixmapNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVNativeQuery} instance. */
	public static NVNativeQuery getInstance() {
		return checkFunctionality(EGL.getCapabilities().__NVNativeQuery);
	}

	// --- [ eglQueryNativeDisplayNV ] ---

	/** Unsafe version of {@link #eglQueryNativeDisplayNV QueryNativeDisplayNV} */
	@JavadocExclude
	public static boolean neglQueryNativeDisplayNV(long dpy, long display_id) {
		long __functionAddress = getInstance().QueryNativeDisplayNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return callPPZ(__functionAddress, dpy, display_id);
	}

	public static boolean eglQueryNativeDisplayNV(long dpy, ByteBuffer display_id) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(display_id, 1 << POINTER_SHIFT);
		return neglQueryNativeDisplayNV(dpy, memAddress(display_id));
	}

	/** Alternative version of: {@link #eglQueryNativeDisplayNV QueryNativeDisplayNV} */
	public static boolean eglQueryNativeDisplayNV(long dpy, PointerBuffer display_id) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(display_id, 1);
		return neglQueryNativeDisplayNV(dpy, memAddress(display_id));
	}

	// --- [ eglQueryNativeWindowNV ] ---

	/** Unsafe version of {@link #eglQueryNativeWindowNV QueryNativeWindowNV} */
	@JavadocExclude
	public static boolean neglQueryNativeWindowNV(long dpy, long surf, long window) {
		long __functionAddress = getInstance().QueryNativeWindowNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surf);
		}
		return callPPPZ(__functionAddress, dpy, surf, window);
	}

	public static boolean eglQueryNativeWindowNV(long dpy, long surf, ByteBuffer window) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(window, 1 << POINTER_SHIFT);
		return neglQueryNativeWindowNV(dpy, surf, memAddress(window));
	}

	/** Alternative version of: {@link #eglQueryNativeWindowNV QueryNativeWindowNV} */
	public static boolean eglQueryNativeWindowNV(long dpy, long surf, PointerBuffer window) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(window, 1);
		return neglQueryNativeWindowNV(dpy, surf, memAddress(window));
	}

	// --- [ eglQueryNativePixmapNV ] ---

	/** Unsafe version of {@link #eglQueryNativePixmapNV QueryNativePixmapNV} */
	@JavadocExclude
	public static boolean neglQueryNativePixmapNV(long dpy, long surf, long pixmap) {
		long __functionAddress = getInstance().QueryNativePixmapNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surf);
		}
		return callPPPZ(__functionAddress, dpy, surf, pixmap);
	}

	public static boolean eglQueryNativePixmapNV(long dpy, long surf, ByteBuffer pixmap) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pixmap, 1 << POINTER_SHIFT);
		return neglQueryNativePixmapNV(dpy, surf, memAddress(pixmap));
	}

	/** Alternative version of: {@link #eglQueryNativePixmapNV QueryNativePixmapNV} */
	public static boolean eglQueryNativePixmapNV(long dpy, long surf, PointerBuffer pixmap) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pixmap, 1);
		return neglQueryNativePixmapNV(dpy, surf, memAddress(pixmap));
	}

}