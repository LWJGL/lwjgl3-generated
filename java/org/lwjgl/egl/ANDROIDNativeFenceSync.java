/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/ANDROID/EGL_ANDROID_native_fence_sync.txt">ANDROID_native_fence_sync</a> extension.
 * 
 * <p>This extension enables the creation of EGL fence sync objects that are associated with a native synchronization fence object that is referenced using a
 * file descriptor. These EGL fence sync objects have nearly identical semantics to those defined by the KHR_fence_sync extension, except that they have
 * an additional attribute storing the file descriptor referring to the native fence object.</p>
 * 
 * <p>This extension assumes the existence of a native fence synchronization object that behaves similarly to an EGL fence sync object. These native objects
 * must have a signal status like that of an EGLSyncKHR object that indicates whether the fence has ever been signaled. Once signaled the native object's
 * signal status may not change again.</p>
 * 
 * <p>Requires {@link EGL11 EGL L.1} and {@link KHRFenceSync KHR_fence_sync}.</p>
 */
public final class ANDROIDNativeFenceSync {

	/**  */
	public static final int
		EGL_SYNC_NATIVE_FENCE_ANDROID          = 0x3144,
		EGL_SYNC_NATIVE_FENCE_FD_ANDROID       = 0x3145,
		EGL_SYNC_NATIVE_FENCE_SIGNALED_ANDROID = 0x3146,
		EGL_NO_NATIVE_FENCE_FD_ANDROID         = 0xFFFFFFFF;

	/** Function address. */
	@JavadocExclude
	public final long DupNativeFenceFDANDROID;

	@JavadocExclude
	public ANDROIDNativeFenceSync(FunctionProvider provider) {
		DupNativeFenceFDANDROID = provider.getFunctionAddress("eglDupNativeFenceFDANDROID");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ANDROIDNativeFenceSync} instance. */
	public static ANDROIDNativeFenceSync getInstance() {
		return checkFunctionality(EGL.getCapabilities().__ANDROIDNativeFenceSync);
	}

	// --- [ eglDupNativeFenceFDANDROID ] ---

	public static int eglDupNativeFenceFDANDROID(long dpy, long sync) {
		long __functionAddress = getInstance().DupNativeFenceFDANDROID;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(sync);
		}
		return callPPI(__functionAddress, dpy, sync);
	}

}