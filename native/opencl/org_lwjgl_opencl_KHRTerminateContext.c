/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"

typedef cl_int (APIENTRY *clTerminateContextKHRPROC) (cl_context);

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_KHRTerminateContext_nclTerminateContextKHR(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	clTerminateContextKHRPROC clTerminateContextKHR = (clTerminateContextKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clTerminateContextKHR(context);
}
