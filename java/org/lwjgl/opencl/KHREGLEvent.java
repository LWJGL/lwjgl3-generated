/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.khronos.org/registry/cl/extensions/khr/cl_khr_egl_event.txt">khr_egl_event</a> extension.
 * 
 * <p>This extension allows creating OpenCL event objects linked to EGL fence sync objects, potentially improving efficiency of sharing images and
 * buffers between the two APIs. The companion {@code EGL_KHR_cl_event} extension provides the complementary functionality of creating an EGL sync
 * object from an OpenCL event object.</p>
 */
public class KHREGLEvent {

	/** Returned by clCreateEventFromEGLSyncKHR if sync is not a valid EGLSyncKHR handle created with respect to EGLDisplay display. */
	public static final int CL_INVALID_EGL_OBJECT_KHR = -1093;

	/** Returned by {@link CL10#clGetEventInfo GetEventInfo} when param_name is {@link CL10#CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}. */
	public static final int CL_COMMAND_EGL_FENCE_SYNC_OBJECT_KHR = 0x202F;

	protected KHREGLEvent() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(CLCapabilities caps) {
		return checkFunctions(
			caps.clCreateEventFromEGLSyncKHR
		);
	}

	// --- [ clCreateEventFromEGLSyncKHR ] ---

	/**
	 * Creates a linked event object.
	 *
	 * @param context     a valid OpenCL context
	 * @param sync        the name of a sync object of type {@link org.lwjgl.egl.EGL15#EGL_SYNC_FENCE} created with respect to {@code EGLDisplay display}.
	 * @param display     an {@code EGLDisplay}
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 */
	public static long nclCreateEventFromEGLSyncKHR(long context, long sync, long display, long errcode_ret) {
		long __functionAddress = CL.getICD().clCreateEventFromEGLSyncKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
			checkPointer(sync);
			checkPointer(display);
		}
		return callPPPPP(__functionAddress, context, sync, display, errcode_ret);
	}

	/**
	 * Creates a linked event object.
	 *
	 * @param context     a valid OpenCL context
	 * @param sync        the name of a sync object of type {@link org.lwjgl.egl.EGL15#EGL_SYNC_FENCE} created with respect to {@code EGLDisplay display}.
	 * @param display     an {@code EGLDisplay}
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 */
	public static long clCreateEventFromEGLSyncKHR(long context, long sync, long display, IntBuffer errcode_ret) {
		if ( CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateEventFromEGLSyncKHR(context, sync, display, memAddressSafe(errcode_ret));
	}

	/** Array version of: {@link #clCreateEventFromEGLSyncKHR CreateEventFromEGLSyncKHR} */
	public static long clCreateEventFromEGLSyncKHR(long context, long sync, long display, int[] errcode_ret) {
		long __functionAddress = CL.getICD().clCreateEventFromEGLSyncKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
			checkPointer(sync);
			checkPointer(display);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return callPPPPP(__functionAddress, context, sync, display, errcode_ret);
	}

}