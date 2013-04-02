/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenCL.h"

typedef cl_int (APIENTRY *clTerminateContextKHRPROC) (cl_context);

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_KHRTerminateContext_nclTerminateContextKHR(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	clTerminateContextKHRPROC clTerminateContextKHR = (clTerminateContextKHRPROC)(intptr_t)__functionAddress;
	return (jint)clTerminateContextKHR(context);
}