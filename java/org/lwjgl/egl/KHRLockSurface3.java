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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_lock_surface3.txt">KHR_lock_surface3</a> extension.
 * 
 * <p>This extension allows mapping color buffers of EGL surfaces into the client address space. This is useful primarily for software rendering on low-end
 * devices which do not support EGL client rendering APIs, although it may be implemented efficiently on more capable devices as well.</p>
 * 
 * <p>Requires {@link EGL14 EGL L.1}.</p>
 */
public final class KHRLockSurface3 {

	/**  */
	public static final int
		EGL_READ_SURFACE_BIT_KHR              = 0x1,
		EGL_WRITE_SURFACE_BIT_KHR             = 0x2,
		EGL_LOCK_SURFACE_BIT_KHR              = 0x80,
		EGL_OPTIMAL_FORMAT_BIT_KHR            = 0x100,
		EGL_MATCH_FORMAT_KHR                  = 0x3043,
		EGL_FORMAT_RGB_565_EXACT_KHR          = 0x30C0,
		EGL_FORMAT_RGB_565_KHR                = 0x30C1,
		EGL_FORMAT_RGBA_8888_EXACT_KHR        = 0x30C2,
		EGL_FORMAT_RGBA_8888_KHR              = 0x30C3,
		EGL_MAP_PRESERVE_PIXELS_KHR           = 0x30C4,
		EGL_LOCK_USAGE_HINT_KHR               = 0x30C5,
		EGL_BITMAP_PITCH_KHR                  = 0x30C7,
		EGL_BITMAP_ORIGIN_KHR                 = 0x30C8,
		EGL_BITMAP_PIXEL_RED_OFFSET_KHR       = 0x30C9,
		EGL_BITMAP_PIXEL_GREEN_OFFSET_KHR     = 0x30CA,
		EGL_BITMAP_PIXEL_BLUE_OFFSET_KHR      = 0x30CB,
		EGL_BITMAP_PIXEL_ALPHA_OFFSET_KHR     = 0x30CC,
		EGL_BITMAP_PIXEL_LUMINANCE_OFFSET_KHR = 0x30CD,
		EGL_BITMAP_PIXEL_SIZE_KHR             = 0x3110,
		EGL_BITMAP_POINTER_KHR                = 0x30C6,
		EGL_LOWER_LEFT_KHR                    = 0x30CE,
		EGL_UPPER_LEFT_KHR                    = 0x30CF;

	/** Function address. */
	@JavadocExclude
	public final long
		LockSurfaceKHR,
		UnlockSurfaceKHR,
		QuerySurface64KHR;

	@JavadocExclude
	public KHRLockSurface3(FunctionProvider provider) {
		LockSurfaceKHR = provider.getFunctionAddress("eglLockSurfaceKHR");
		UnlockSurfaceKHR = provider.getFunctionAddress("eglUnlockSurfaceKHR");
		QuerySurface64KHR = provider.getFunctionAddress("eglQuerySurface64KHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRLockSurface3} instance. */
	public static KHRLockSurface3 getInstance() {
		return checkFunctionality(EGL.getCapabilities().__KHRLockSurface3);
	}

	// --- [ eglLockSurfaceKHR ] ---

	/** Unsafe version of {@link #eglLockSurfaceKHR LockSurfaceKHR} */
	@JavadocExclude
	public static boolean neglLockSurfaceKHR(long dpy, long surface, long attrib_list) {
		long __functionAddress = getInstance().LockSurfaceKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPPZ(__functionAddress, dpy, surface, attrib_list);
	}

	public static boolean eglLockSurfaceKHR(long dpy, long surface, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglLockSurfaceKHR(dpy, surface, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglLockSurfaceKHR LockSurfaceKHR} */
	public static boolean eglLockSurfaceKHR(long dpy, long surface, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglLockSurfaceKHR(dpy, surface, memAddressSafe(attrib_list));
	}

	// --- [ eglUnlockSurfaceKHR ] ---

	public static boolean eglUnlockSurfaceKHR(long dpy, long surface) {
		long __functionAddress = getInstance().UnlockSurfaceKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPZ(__functionAddress, dpy, surface);
	}

	// --- [ eglQuerySurface64KHR ] ---

	/** Unsafe version of {@link #eglQuerySurface64KHR QuerySurface64KHR} */
	@JavadocExclude
	public static boolean neglQuerySurface64KHR(long dpy, long surface, int attribute, long value) {
		long __functionAddress = getInstance().QuerySurface64KHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(surface);
		}
		return callPPIPZ(__functionAddress, dpy, surface, attribute, value);
	}

	public static boolean eglQuerySurface64KHR(long dpy, long surface, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << POINTER_SHIFT);
		return neglQuerySurface64KHR(dpy, surface, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglQuerySurface64KHR QuerySurface64KHR} */
	public static boolean eglQuerySurface64KHR(long dpy, long surface, int attribute, PointerBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return neglQuerySurface64KHR(dpy, surface, attribute, memAddress(value));
	}

}