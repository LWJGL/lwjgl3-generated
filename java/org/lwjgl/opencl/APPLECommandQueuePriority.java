/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the <strong>APPLE_command_queue_priority</strong> extension. */
public class APPLECommandQueuePriority {

	/**  */
	public static final int
		CL_QUEUE_PRIORITY_APPLE            = 0x10000013,
		CL_QUEUE_PRIORITY_BACKGROUND_APPLE = 0x10000015,
		CL_QUEUE_PRIORITY_DEFAULT_APPLE    = 0x10000017;

	protected APPLECommandQueuePriority() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(CLCapabilities caps) {
		return checkFunctions(
			caps.clCreateCommandQueueWithPropertiesAPPLE
		);
	}

	// --- [ clCreateCommandQueueWithPropertiesAPPLE ] ---

	/** Unsafe version of: {@link #clCreateCommandQueueWithPropertiesAPPLE CreateCommandQueueWithPropertiesAPPLE} */
	public static long nclCreateCommandQueueWithPropertiesAPPLE(long context, long device, long properties, long errcode_ret) {
		long __functionAddress = CL.getICD().clCreateCommandQueueWithPropertiesAPPLE;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
			checkPointer(device);
		}
		return callPPPPP(__functionAddress, context, device, properties, errcode_ret);
	}

	/**
	 * 
	 *
	 * @param context     
	 * @param device      
	 * @param properties  
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 */
	public static long clCreateCommandQueueWithPropertiesAPPLE(long context, long device, PointerBuffer properties, IntBuffer errcode_ret) {
		if ( CHECKS )
			checkBufferSafe(errcode_ret, 1);
		return nclCreateCommandQueueWithPropertiesAPPLE(context, device, memAddress(properties), memAddressSafe(errcode_ret));
	}

	/** Array version of: {@link #clCreateCommandQueueWithPropertiesAPPLE CreateCommandQueueWithPropertiesAPPLE} */
	public static long clCreateCommandQueueWithPropertiesAPPLE(long context, long device, PointerBuffer properties, int[] errcode_ret) {
		long __functionAddress = CL.getICD().clCreateCommandQueueWithPropertiesAPPLE;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
			checkPointer(device);
			checkBufferSafe(errcode_ret, 1);
		}
		return callPPPPP(__functionAddress, context, device, memAddress(properties), errcode_ret);
	}

}