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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the <strong>APPLE_command_queue_select_compute_units</strong> extension. */
public final class APPLECommandQueueSelectComputeUnits {

	/**  */
	public static final int CL_QUEUE_NUM_COMPUTE_UNITS_APPLE = 0x10000014;

	/** Function address. */
	@JavadocExclude
	public final long CreateCommandQueueWithPropertiesAPPLE;

	@JavadocExclude
	public APPLECommandQueueSelectComputeUnits(FunctionProvider provider) {
		CreateCommandQueueWithPropertiesAPPLE = provider.getFunctionAddress("clCreateCommandQueueWithPropertiesAPPLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link APPLECommandQueueSelectComputeUnits} instance for the currently loaded ICD. */
	public static APPLECommandQueueSelectComputeUnits getInstance() {
		return checkFunctionality(CL.getICD().__APPLECommandQueueSelectComputeUnits);
	}

	static APPLECommandQueueSelectComputeUnits create(FunctionProvider provider) {
		APPLECommandQueueSelectComputeUnits funcs = new APPLECommandQueueSelectComputeUnits(provider);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(context);
			checkPointer(device);
		}
		return APPLECommandQueuePriority.nclCreateCommandQueueWithPropertiesAPPLE(context, device, properties, errcode_ret, __functionAddress);
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
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		return nclCreateCommandQueueWithPropertiesAPPLE(context, device, memAddress(properties), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateCommandQueueWithPropertiesAPPLE CreateCommandQueueWithPropertiesAPPLE} */
	public static long clCreateCommandQueueWithPropertiesAPPLE(long context, long device, PointerBuffer properties, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateCommandQueueWithPropertiesAPPLE(context, device, memAddress(properties), memAddressSafe(errcode_ret));
	}

}