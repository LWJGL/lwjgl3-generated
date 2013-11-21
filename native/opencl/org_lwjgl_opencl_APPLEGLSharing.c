/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"

typedef cl_int (APIENTRY *clGetGLContextInfoAPPLEPROC) (cl_context, void *, cl_gl_platform_info, size_t, void *, size_t *);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_APPLEGLSharing_nclGetGLContextInfoAPPLE(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong platform_gl_ctxAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	void *platform_gl_ctx = (void *)(intptr_t)platform_gl_ctxAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetGLContextInfoAPPLEPROC clGetGLContextInfoAPPLE = (clGetGLContextInfoAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetGLContextInfoAPPLE(context, platform_gl_ctx, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

EXTERN_C_EXIT
