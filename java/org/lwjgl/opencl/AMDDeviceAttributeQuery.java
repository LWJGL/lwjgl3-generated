/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a href="http://www.khronos.org/registry/cl/extensions/amd/cl_amd_device_attribute_query.txt">amd_device_attribute_query</a> extension.
 * 
 * <p>This extension provides a means to query AMD-specific device attributes.</p>
 */
public final class AMDDeviceAttributeQuery {

	/** Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
	public static final int
		CL_DEVICE_PROFILING_TIMER_OFFSET_AMD          = 0x4036,
		CL_DEVICE_GLOBAL_FREE_MEMORY_AMD              = 0x4039,
		CL_DEVICE_SIMD_PER_COMPUTE_UNIT_AMD           = 0x4040,
		CL_DEVICE_SIMD_WIDTH_AMD                      = 0x4041,
		CL_DEVICE_SIMD_INSTRUCTION_WIDTH_AMD          = 0x4042,
		CL_DEVICE_WAVEFRONT_WIDTH_AMD                 = 0x4043,
		CL_DEVICE_GLOBAL_MEM_CHANNELS_AMD             = 0x4044,
		CL_DEVICE_GLOBAL_MEM_CHANNEL_BANKS_AMD        = 0x4045,
		CL_DEVICE_GLOBAL_MEM_CHANNEL_BANK_WIDTH_AMD   = 0x4046,
		CL_DEVICE_LOCAL_MEM_SIZE_PER_COMPUTE_UNIT_AMD = 0x4047,
		CL_DEVICE_LOCAL_MEM_BANKS_AMD                 = 0x4048;

	private AMDDeviceAttributeQuery() {}

}