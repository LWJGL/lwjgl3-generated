/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"

typedef cl_command_queue (APIENTRY *clCreateCommandQueueWithPropertiesAPPLEPROC) (cl_context, cl_device_id, const cl_queue_properties_APPLE *, cl_int *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_APPLECommandQueuePriority_nclCreateCommandQueueWithPropertiesAPPLE(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong deviceAddress, jlong propertiesAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_device_id device = (cl_device_id)(intptr_t)deviceAddress;
	const cl_queue_properties_APPLE *properties = (const cl_queue_properties_APPLE *)(intptr_t)propertiesAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateCommandQueueWithPropertiesAPPLEPROC clCreateCommandQueueWithPropertiesAPPLE = (clCreateCommandQueueWithPropertiesAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateCommandQueueWithPropertiesAPPLE(context, device, properties, errcode_ret);
}

EXTERN_C_EXIT
