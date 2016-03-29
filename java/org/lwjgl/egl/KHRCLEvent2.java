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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_cl_event2.txt">KHR_cl_event2</a> extension.
 * 
 * <p>This extension allows creating an EGL sync object linked to an OpenCL event object, potentially improving efficiency of sharing images between the two
 * APIs. The companion cl_khr_egl_event extension provides the complementary functionality of creating an OpenCL event object from an EGL sync object.</p>
 * 
 * <p>This extension is functionally identical to EGL_KHR_cl_event, but is intended to replace that extension. It exists only to address an implementation
 * issue on 64-bit platforms where passing OpenCL event handles in an EGLint attribute list value is impossible, because the implementations use a 32-bit
 * type for EGLint.</p>
 * 
 * <p>This extension also incorporates some required functionality from the EGL_KHR_fence_sync extension, similarly modified for 64-bit platforms.</p>
 * 
 * <p>Requires {@link EGL14 EGL L.1} and {@link KHRFenceSync KHR_fence_sync}.</p>
 */
public class KHRCLEvent2 {

	/**  */
	public static final int
		EGL_CL_EVENT_HANDLE_KHR        = 0x309C,
		EGL_SYNC_CL_EVENT_KHR          = 0x30FE,
		EGL_SYNC_CL_EVENT_COMPLETE_KHR = 0x30FF;

	protected KHRCLEvent2() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglCreateSync64KHR
		);
	}

	// --- [ eglCreateSync64KHR ] ---

	/** Unsafe version of {@link #eglCreateSync64KHR CreateSync64KHR} */
	public static long neglCreateSync64KHR(long dpy, int type, long attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateSync64KHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
		}
		return callPIPP(__functionAddress, dpy, type, attrib_list);
	}

	public static long eglCreateSync64KHR(long dpy, int type, ByteBuffer attrib_list) {
		if ( CHECKS )
			checkNTP(attrib_list, EGL10.EGL_NONE);
		return neglCreateSync64KHR(dpy, type, memAddress(attrib_list));
	}

	/** Alternative version of: {@link #eglCreateSync64KHR CreateSync64KHR} */
	public static long eglCreateSync64KHR(long dpy, int type, PointerBuffer attrib_list) {
		if ( CHECKS )
			checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateSync64KHR(dpy, type, memAddress(attrib_list));
	}

}