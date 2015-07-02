/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"

typedef cl_int (APIENTRY *clGetGLContextInfoKHRPROC) (const cl_context_properties *, cl_gl_context_info, size_t, void *, size_t *);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_KHRGLSharing_nclGetGLContextInfoKHR(JNIEnv *__env, jclass clazz, jlong propertiesAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	const cl_context_properties *properties = (const cl_context_properties *)(intptr_t)propertiesAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetGLContextInfoKHRPROC clGetGLContextInfoKHR = (clGetGLContextInfoKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetGLContextInfoKHR(properties, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

EXTERN_C_EXIT
