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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_stream_sync.txt">NV_stream_sync</a> extension.
 * 
 * <p>This extension defines a new type of reusable sync object. This sync object will be signaled each time a new image frame becomes available in an
 * EGLStream for the consumer to consume.</p>
 * 
 * <p>Requires {@link EGL12 EGL L.1}, {@link KHRStream KHR_stream} and {@link KHRReusableSync KHR_reusable_sync}.</p>
 */
public class NVStreamSync {

	/**  */
	public static final int
		EGL_SYNC_TYPE_KHR     = 0x30F7,
		EGL_SYNC_NEW_FRAME_NV = 0x321F;

	protected NVStreamSync() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglCreateStreamSyncNV
		);
	}

	// --- [ eglCreateStreamSyncNV ] ---

	public static long neglCreateStreamSyncNV(long dpy, long stream, int type, long attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateStreamSyncNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPPP(__functionAddress, dpy, stream, type, attrib_list);
	}

	public static long eglCreateStreamSyncNV(long dpy, long stream, int type, IntBuffer attrib_list) {
		if ( CHECKS )
			checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateStreamSyncNV(dpy, stream, type, memAddress(attrib_list));
	}

	/** Array version of: {@link #eglCreateStreamSyncNV CreateStreamSyncNV} */
	public static long eglCreateStreamSyncNV(long dpy, long stream, int type, int[] attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateStreamSyncNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(stream);
			checkNT(attrib_list, EGL10.EGL_NONE);
		}
		return callPPPP(__functionAddress, dpy, stream, type, attrib_list);
	}

}