/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <strong>khr_gl_event</strong> extension.
 * <p/>
 * This extension allows creating OpenCL event objects linked to OpenGL fence sync objects, potentially improving efficiency of sharing images and buffers
 * between the two APIs. The companion {@link org.lwjgl.opengl.ARBCLEvent} extension provides the complementary functionality of creating an OpenGL sync
 * object from an OpenCL event object.
 * <p/>
 * In addition, this extension modifies the behavior of {@link CL10GL#clEnqueueAcquireGLObjects EnqueueAcquireGLObjects} and {@link CL10GL#clEnqueueReleaseGLObjects EnqueueReleaseGLObjects} to implicitly
 * guarantee synchronization with an OpenGL context bound in the same thread as the OpenCL context.
 */
public final class KHRGLEvent {

	/** Returned by {@link CL10#clGetEventInfo GetEventInfo} when {@code param_name} is {@link CL10#CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}. */
	public static final int
		CL_COMMAND_GL_FENCE_SYNC_OBJECT_KHR = 0x200D;

	/** Function address. */
	@JavadocExclude
	public final long CreateEventFromGLsyncKHR;

	@JavadocExclude
	public KHRGLEvent(FunctionProvider provider) {
		CreateEventFromGLsyncKHR = provider.getFunctionAddress("clCreateEventFromGLsyncKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRGLEvent} instance for the CL platform or device that corresponds to the given {@link CLObject}. */
	public static KHRGLEvent getInstance() {
		return CL.getICD().__KHRGLEvent;
	}

	static KHRGLEvent create(FunctionProvider provider) {
		KHRGLEvent funcs = new KHRGLEvent(provider);

		boolean supported = checkFunctions(
			funcs.CreateEventFromGLsyncKHR
		);

		return supported ? funcs : null;
	}

	// --- [ clCreateEventFromGLsyncKHR ] ---

	/** JNI method for {@link #clCreateEventFromGLsyncKHR CreateEventFromGLsyncKHR} */
	@JavadocExclude
	public static native long nclCreateEventFromGLsyncKHR(long context, long sync, long errcode_ret, long __functionAddress);

	/**
	 * Creates an OpenCL event object from an OpenGL fence sync object.
	 *
	 * @param context     the OpenCL context in which to create the event object
	 * @param sync        the OpenGL fence sync object
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 */
	public static CLEvent clCreateEventFromGLsyncKHR(CLContext context, long sync, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance().CreateEventFromGLsyncKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLEvent.create(nclCreateEventFromGLsyncKHR(context.getPointer(), sync, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateEventFromGLsyncKHR CreateEventFromGLsyncKHR} */
	public static CLEvent clCreateEventFromGLsyncKHR(CLContext context, long sync, IntBuffer errcode_ret) {
		long __functionAddress = getInstance().CreateEventFromGLsyncKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLEvent.create(nclCreateEventFromGLsyncKHR(context.getPointer(), sync, memAddressSafe(errcode_ret), __functionAddress), context);
	}

}