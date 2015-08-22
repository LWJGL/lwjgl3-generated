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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_stream_sync.txt">NV_stream_sync</a> extension.
 * 
 * <p>This extension defines a new type of reusable sync object. This sync object will be signaled each time a new image frame becomes available in an
 * EGLStream for the consumer to consume.</p>
 * 
 * <p>Requires {@link EGL12 EGL L.1}, {@link KHRStream KHR_stream} and {@link KHRReusableSync KHR_reusable_sync}.</p>
 */
public final class NVStreamSync {

	/**  */
	public static final int
		EGL_SYNC_TYPE_KHR     = 0x30F7,
		EGL_SYNC_NEW_FRAME_NV = 0x321F;

	/** Function address. */
	@JavadocExclude
	public final long CreateStreamSyncNV;

	@JavadocExclude
	public NVStreamSync(FunctionProvider provider) {
		CreateStreamSyncNV = provider.getFunctionAddress("eglCreateStreamSyncNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVStreamSync} instance. */
	public static NVStreamSync getInstance() {
		return checkFunctionality(EGL.getCapabilities().__NVStreamSync);
	}

	// --- [ eglCreateStreamSyncNV ] ---

	/** Unsafe version of {@link #eglCreateStreamSyncNV CreateStreamSyncNV} */
	@JavadocExclude
	public static long neglCreateStreamSyncNV(long dpy, long stream, int type, long attrib_list) {
		long __functionAddress = getInstance().CreateStreamSyncNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPIPP(__functionAddress, dpy, stream, type, attrib_list);
	}

	public static long eglCreateStreamSyncNV(long dpy, long stream, int type, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreateStreamSyncNV(dpy, stream, type, memAddress(attrib_list));
	}

	/** Alternative version of: {@link #eglCreateStreamSyncNV CreateStreamSyncNV} */
	public static long eglCreateStreamSyncNV(long dpy, long stream, int type, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateStreamSyncNV(dpy, stream, type, memAddress(attrib_list));
	}

}