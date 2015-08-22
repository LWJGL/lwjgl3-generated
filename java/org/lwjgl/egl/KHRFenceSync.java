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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_fence_sync.txt">KHR_fence_sync</a> extension.
 * 
 * <p>This extension introduces the concept of "sync objects" into EGL. Sync objects are a synchronization primitive, representing events whose completion
 * can be tested or waited upon. This extension borrows heavily from the GL_ARB_sync extension and introduces a type of sync object known as a "fence sync
 * object" comparable to the OpenGL fence sync object. The specification is designed to allow additional types of sync objects to be easily introduced in
 * later extensions.</p>
 * 
 * <p>Fence sync objects have corresponding fence commands, which are inserted into a client API command stream at the time the fence sync is created. A
 * fence sync object is used to wait for completion of the corresponding fence command. This allows applications to request a partial Finish of an API
 * command stream, wherein all commands issued in a particular client API context will be forced to complete before control is returned to the calling
 * thread.</p>
 * 
 * <p>This document describes three different extension strings collectively. The "EGL_KHR_fence_sync" string indicates that fence syncs and the
 * corresponding interfaces (to create and place a fence, destroy, query, and wait on) are supported.</p>
 * 
 * <p>The remaining extensions list valid client APIs for fence syncs. The "GL_OES_EGL_sync" string indicates that a fence sync object can be created in
 * association with a fence command placed in the command stream of a bound OpenGL ES context. The "VG_KHR_EGL_sync" string indicates the same thing for a
 * bound OpenVG context.</p>
 * 
 * <p>Requires {@link EGL11 EGL L.1}.</p>
 */
public final class KHRFenceSync {

	/**  */
	public static final int
		EGL_SYNC_PRIOR_COMMANDS_COMPLETE_KHR = 0x30F0,
		EGL_SYNC_CONDITION_KHR               = 0x30F8,
		EGL_SYNC_FENCE_KHR                   = 0x30F9;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateSyncKHR,
		DestroySyncKHR,
		ClientWaitSyncKHR,
		GetSyncAttribKHR;

	@JavadocExclude
	public KHRFenceSync(FunctionProvider provider) {
		CreateSyncKHR = provider.getFunctionAddress("eglCreateSyncKHR");
		DestroySyncKHR = provider.getFunctionAddress("eglDestroySyncKHR");
		ClientWaitSyncKHR = provider.getFunctionAddress("eglClientWaitSyncKHR");
		GetSyncAttribKHR = provider.getFunctionAddress("eglGetSyncAttribKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRFenceSync} instance. */
	public static KHRFenceSync getInstance() {
		return checkFunctionality(EGL.getCapabilities().__KHRFenceSync);
	}

	// --- [ eglCreateSyncKHR ] ---

	/** Unsafe version of {@link #eglCreateSyncKHR CreateSyncKHR} */
	@JavadocExclude
	public static long neglCreateSyncKHR(long dpy, int type, long attrib_list) {
		long __functionAddress = getInstance().CreateSyncKHR;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return callPIPP(__functionAddress, dpy, type, attrib_list);
	}

	public static long eglCreateSyncKHR(long dpy, int type, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreateSyncKHR(dpy, type, memAddress(attrib_list));
	}

	/** Alternative version of: {@link #eglCreateSyncKHR CreateSyncKHR} */
	public static long eglCreateSyncKHR(long dpy, int type, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateSyncKHR(dpy, type, memAddress(attrib_list));
	}

	// --- [ eglDestroySyncKHR ] ---

	public static boolean eglDestroySyncKHR(long dpy, long sync) {
		long __functionAddress = getInstance().DestroySyncKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPZ(__functionAddress, dpy, sync);
	}

	// --- [ eglClientWaitSyncKHR ] ---

	public static int eglClientWaitSyncKHR(long dpy, long sync, int flags, long timeout) {
		long __functionAddress = getInstance().ClientWaitSyncKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPIJI(__functionAddress, dpy, sync, flags, timeout);
	}

	// --- [ eglGetSyncAttribKHR ] ---

	/** Unsafe version of {@link #eglGetSyncAttribKHR GetSyncAttribKHR} */
	@JavadocExclude
	public static boolean neglGetSyncAttribKHR(long dpy, long sync, int attribute, long value) {
		long __functionAddress = getInstance().GetSyncAttribKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPIPZ(__functionAddress, dpy, sync, attribute, value);
	}

	public static boolean eglGetSyncAttribKHR(long dpy, long sync, int attribute, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		return neglGetSyncAttribKHR(dpy, sync, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglGetSyncAttribKHR GetSyncAttribKHR} */
	public static boolean eglGetSyncAttribKHR(long dpy, long sync, int attribute, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return neglGetSyncAttribKHR(dpy, sync, attribute, memAddress(value));
	}

}