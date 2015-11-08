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

/** Native bindings to the <strong>APPLE_command_queue_select_compute_units</strong> extension. */
public class APPLECommandQueueSelectComputeUnits {

	/**  */
	public static final int CL_QUEUE_NUM_COMPUTE_UNITS_APPLE = 0x10000014;

	/** Function address. */
	@JavadocExclude
	public final long CreateCommandQueueWithPropertiesAPPLE;

	@JavadocExclude
	protected APPLECommandQueueSelectComputeUnits() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public APPLECommandQueueSelectComputeUnits(FunctionProvider provider) {
		CreateCommandQueueWithPropertiesAPPLE = provider.getFunctionAddress("clCreateCommandQueueWithPropertiesAPPLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link APPLECommandQueueSelectComputeUnits} instance of the currently loaded ICD. */
	public static APPLECommandQueueSelectComputeUnits getInstance() {
		return getInstance(CL.getICD());
	}

	/** Returns the {@link APPLECommandQueueSelectComputeUnits} instance of the specified {@link CLCapabilities}. */
	public static APPLECommandQueueSelectComputeUnits getInstance(CLCapabilities caps) {
		return checkFunctionality(caps.__APPLECommandQueueSelectComputeUnits);
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