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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_reusable_sync.txt">KHR_reusable_sync</a> extension.
 * 
 * <p>This extension introduces the concept of "sync objects" into EGL. Sync objects are a synchronization primitive, representing events whose completion
 * can be tested or waited upon. This extension borrows from the GL_ARB_sync extension but introduces a type of sync object known as "reusable sync
 * object" comparable to an OS semaphore. The specification is designed to allow additional types of sync objects to be easily introduced in later
 * extensions.</p>
 * 
 * <p>Reusable sync objects may be used to synchronize activity between threads or between client APIs. Synchronization is accomplished by explicitly
 * changing the status of a reusable object using EGL API commands.</p>
 * 
 * <p>Requires {@link EGL11 EGL L.1}.</p>
 */
public class KHRReusableSync {

	/**  */
	public static final int
		EGL_SYNC_STATUS_KHR             = 0x30F1,
		EGL_SIGNALED_KHR                = 0x30F2,
		EGL_UNSIGNALED_KHR              = 0x30F3,
		EGL_TIMEOUT_EXPIRED_KHR         = 0x30F5,
		EGL_CONDITION_SATISFIED_KHR     = 0x30F6,
		EGL_SYNC_TYPE_KHR               = 0x30F7,
		EGL_SYNC_REUSABLE_KHR           = 0x30FA,
		EGL_SYNC_FLUSH_COMMANDS_BIT_KHR = 0x1;

	/**  */
	public static final long
		EGL_FOREVER_KHR = 0xFFFFFFFFFFFFFFFFL,
		EGL_NO_SYNC_KHR = 0x0L;

	protected KHRReusableSync() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglCreateSyncKHR, caps.eglDestroySyncKHR, caps.eglClientWaitSyncKHR, caps.eglSignalSyncKHR, caps.eglGetSyncAttribKHR
		);
	}

	// --- [ eglCreateSyncKHR ] ---

	public static long neglCreateSyncKHR(long dpy, int type, long attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateSyncKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
		}
		return callPPP(__functionAddress, dpy, type, attrib_list);
	}

	public static long eglCreateSyncKHR(long dpy, int type, IntBuffer attrib_list) {
		if ( CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateSyncKHR(dpy, type, memAddressSafe(attrib_list));
	}

	// --- [ eglDestroySyncKHR ] ---

	public static boolean eglDestroySyncKHR(long dpy, long sync) {
		long __functionAddress = EGL.getCapabilities().eglDestroySyncKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPI(__functionAddress, dpy, sync) != 0;
	}

	// --- [ eglClientWaitSyncKHR ] ---

	public static int eglClientWaitSyncKHR(long dpy, long sync, int flags, long timeout) {
		long __functionAddress = EGL.getCapabilities().eglClientWaitSyncKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPJI(__functionAddress, dpy, sync, flags, timeout);
	}

	// --- [ eglSignalSyncKHR ] ---

	public static boolean eglSignalSyncKHR(long dpy, long sync, int mode) {
		long __functionAddress = EGL.getCapabilities().eglSignalSyncKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPI(__functionAddress, dpy, sync, mode) != 0;
	}

	// --- [ eglGetSyncAttribKHR ] ---

	public static int neglGetSyncAttribKHR(long dpy, long sync, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglGetSyncAttribKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPPI(__functionAddress, dpy, sync, attribute, value);
	}

	public static boolean eglGetSyncAttribKHR(long dpy, long sync, int attribute, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return neglGetSyncAttribKHR(dpy, sync, attribute, memAddress(value)) != 0;
	}

	/** Array version of: {@link #eglCreateSyncKHR CreateSyncKHR} */
	public static long eglCreateSyncKHR(long dpy, int type, int[] attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateSyncKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		}
		return callPPP(__functionAddress, dpy, type, attrib_list);
	}

	/** Array version of: {@link #eglGetSyncAttribKHR GetSyncAttribKHR} */
	public static boolean eglGetSyncAttribKHR(long dpy, long sync, int attribute, int[] value) {
		long __functionAddress = EGL.getCapabilities().eglGetSyncAttribKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(sync);
			checkBuffer(value, 1);
		}
		return callPPPI(__functionAddress, dpy, sync, attribute, value) != 0;
	}

}