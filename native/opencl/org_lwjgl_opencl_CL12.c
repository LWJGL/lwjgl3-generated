/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "opencl.h"

typedef void * (APIENTRY *clGetExtensionFunctionAddressForPlatformPROC) (cl_platform_id, const cl_char *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL12_nclGetExtensionFunctionAddressForPlatform(JNIEnv *__env, jclass clazz, jlong platformAddress, jlong func_nameAddress, jlong __functionAddress) {
	cl_platform_id platform = (cl_platform_id)(intptr_t)platformAddress;
	const cl_char *func_name = (const cl_char *)(intptr_t)func_nameAddress;
	clGetExtensionFunctionAddressForPlatformPROC clGetExtensionFunctionAddressForPlatform = (clGetExtensionFunctionAddressForPlatformPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)clGetExtensionFunctionAddressForPlatform(platform, func_name);
}