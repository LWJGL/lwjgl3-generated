/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/** Native bindings to the <strong>APPLE_command_queue_priority</strong> extension. */
public class APPLECommandQueuePriority {

	/**  */
	public static final int
		CL_QUEUE_PRIORITY_APPLE            = 0x10000013,
		CL_QUEUE_PRIORITY_BACKGROUND_APPLE = 0x10000015,
		CL_QUEUE_PRIORITY_DEFAULT_APPLE    = 0x10000017;

	/** Function address. */
	@JavadocExclude
	public final long CreateCommandQueueWithPropertiesAPPLE;

	@JavadocExclude
	protected APPLECommandQueuePriority() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public APPLECommandQueuePriority(FunctionProvider provider) {
		CreateCommandQueueWithPropertiesAPPLE = provider.getFunctionAddress("clCreateCommandQueueWithPropertiesAPPLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link APPLECommandQueuePriority} instance of the currently loaded ICD. */
	public static APPLECommandQueuePriority getInstance() {
		return getInstance(CL.getICD());
	}

	/** Returns the {@link APPLECommandQueuePriority} instance of the specified {@link CLCapabilities}. */
	public static APPLECommandQueuePriority getInstance(CLCapabilities caps) {
		return checkFunctionality(caps.__APPLECommandQueuePriority);
	}

	static APPLECommandQueuePriority create(FunctionProvider provider) {
		APPLECommandQueuePriority funcs = new APPLECommandQueuePriority(provider);

		boolean supported = checkFunctions(
			funcs.CreateCommandQueueWithPropertiesAPPLE
		);

		return supported ? funcs : null;
	}

	// --- [ clCreateCommandQueueWithPropertiesAPPLE ] ---

	/** Unsafe version of {@link #clCreateCommandQueueWithPropertiesAPPLE CreateCommandQueueWithPropertiesAPPLE} */
	@JavadocExclude
	public static long nclCreateCommandQueueWithPropertiesAPPLE(long context, long device, long properties, long errcode_ret) {
		long __functionAddress = getInstance().CreateCommandQueueWithPropertiesAPPLE;
		if ( CHECKS ) {
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
	public static long clCreateCommandQueueWithPropertiesAPPLE(long context, long device, ByteBuffer properties, ByteBuffer errcode_ret) {
		if ( CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		return nclCreateCommandQueueWithPropertiesAPPLE(context, device, memAddress(properties), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateCommandQueueWithPropertiesAPPLE CreateCommandQueueWithPropertiesAPPLE} */
	public static long clCreateCommandQueueWithPropertiesAPPLE(long context, long device, PointerBuffer properties, IntBuffer errcode_ret) {
		if ( CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateCommandQueueWithPropertiesAPPLE(context, device, memAddress(properties), memAddressSafe(errcode_ret));
	}

}