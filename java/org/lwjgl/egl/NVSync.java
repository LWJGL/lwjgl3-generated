/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_sync.txt">NV_sync</a> extension.
 * 
 * <p>This extension introduces the concept of "sync objects" into EGL. Sync objects are a synchronization primitive, representing events whose completion
 * can be tested or waited upon. This extension borrows heavily from the GL_ARB_sync extension, and like that extension, introduces only a single type of
 * sync object, the "fence sync object." Additional types of sync objects may be introduced in later extensions.</p>
 * 
 * <p>Fence sync objects have corresponding fences, which are inserted into client API command streams. A sync object can be queried for a given condition,
 * such as completion of the corresponding fence. Fence completion allows applications to request a partial Finish of an API command stream, wherein all
 * commands issued in a particular client API context will be forced to complete before control is returned to the calling thread.</p>
 * 
 * <p>Requires {@link EGL11 EGL L.1}.</p>
 */
public class NVSync {

	/**  */
	public static final int
		EGL_SYNC_PRIOR_COMMANDS_COMPLETE_NV = 0x30E6,
		EGL_SYNC_STATUS_NV                  = 0x30E7,
		EGL_SIGNALED_NV                     = 0x30E8,
		EGL_UNSIGNALED_NV                   = 0x30E9,
		EGL_SYNC_FLUSH_COMMANDS_BIT_NV      = 0x1,
		EGL_ALREADY_SIGNALED_NV             = 0x30EA,
		EGL_TIMEOUT_EXPIRED_NV              = 0x30EB,
		EGL_CONDITION_SATISFIED_NV          = 0x30EC,
		EGL_SYNC_TYPE_NV                    = 0x30ED,
		EGL_SYNC_CONDITION_NV               = 0x30EE,
		EGL_SYNC_FENCE_NV                   = 0x30EF;

	/**  */
	public static final long
		EGL_FOREVER_NV = 0xFFFFFFFFFFFFFFFFL,
		EGL_NO_SYNC_NV = 0x0L;

	protected NVSync() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglCreateFenceSyncNV, caps.eglDestroySyncNV, caps.eglFenceNV, caps.eglClientWaitSyncNV, caps.eglSignalSyncNV, caps.eglGetSyncAttribNV
		);
	}

	// --- [ eglCreateFenceSyncNV ] ---

	public static long neglCreateFenceSyncNV(long dpy, int condition, long attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateFenceSyncNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
		}
		return callPPP(__functionAddress, dpy, condition, attrib_list);
	}

	public static long eglCreateFenceSyncNV(long dpy, int condition, IntBuffer attrib_list) {
		if ( CHECKS )
			checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateFenceSyncNV(dpy, condition, memAddress(attrib_list));
	}

	// --- [ eglDestroySyncNV ] ---

	public static boolean eglDestroySyncNV(long sync) {
		long __functionAddress = EGL.getCapabilities().eglDestroySyncNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPI(__functionAddress, sync) != 0;
	}

	// --- [ eglFenceNV ] ---

	public static boolean eglFenceNV(long sync) {
		long __functionAddress = EGL.getCapabilities().eglFenceNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPI(__functionAddress, sync) != 0;
	}

	// --- [ eglClientWaitSyncNV ] ---

	public static int eglClientWaitSyncNV(long sync, int flags, long timeout) {
		long __functionAddress = EGL.getCapabilities().eglClientWaitSyncNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPJI(__functionAddress, sync, flags, timeout);
	}

	// --- [ eglSignalSyncNV ] ---

	public static boolean eglSignalSyncNV(long sync, int mode) {
		long __functionAddress = EGL.getCapabilities().eglSignalSyncNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPI(__functionAddress, sync, mode) != 0;
	}

	// --- [ eglGetSyncAttribNV ] ---

	public static int neglGetSyncAttribNV(long sync, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglGetSyncAttribNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPPI(__functionAddress, sync, attribute, value);
	}

	public static boolean eglGetSyncAttribNV(long sync, int attribute, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return neglGetSyncAttribNV(sync, attribute, memAddress(value)) != 0;
	}

	/** Array version of: {@link #eglCreateFenceSyncNV CreateFenceSyncNV} */
	public static long eglCreateFenceSyncNV(long dpy, int condition, int[] attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateFenceSyncNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkNT(attrib_list, EGL10.EGL_NONE);
		}
		return callPPP(__functionAddress, dpy, condition, attrib_list);
	}

	/** Array version of: {@link #eglGetSyncAttribNV GetSyncAttribNV} */
	public static boolean eglGetSyncAttribNV(long sync, int attribute, int[] value) {
		long __functionAddress = EGL.getCapabilities().eglGetSyncAttribNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			checkBuffer(value, 1);
		}
		return callPPI(__functionAddress, sync, attribute, value) != 0;
	}

}