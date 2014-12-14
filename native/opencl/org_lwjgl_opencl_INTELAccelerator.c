/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"

typedef cl_accelerator_intel (APIENTRY *clCreateAcceleratorINTELPROC) (cl_context, cl_accelerator_type_intel, size_t, const void *, cl_int *);
typedef cl_int (APIENTRY *clRetainAcceleratorINTELPROC) (cl_accelerator_intel);
typedef cl_int (APIENTRY *clReleaseAcceleratorINTELPROC) (cl_accelerator_intel);
typedef cl_int (APIENTRY *clGetAcceleratorInfoINTELPROC) (cl_accelerator_intel, cl_accelerator_info_intel, size_t, void *, size_t *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_INTELAccelerator_nclCreateAcceleratorINTEL(JNIEnv *__env, jclass clazz, jlong contextAddress, jint accelerator_type, jlong descriptor_size, jlong descriptorAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	const void *descriptor = (const void *)(intptr_t)descriptorAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateAcceleratorINTELPROC clCreateAcceleratorINTEL = (clCreateAcceleratorINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateAcceleratorINTEL(context, accelerator_type, (size_t)descriptor_size, descriptor, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_INTELAccelerator_nclRetainAcceleratorINTEL(JNIEnv *__env, jclass clazz, jlong acceleratorAddress, jlong __functionAddress) {
	cl_accelerator_intel accelerator = (cl_accelerator_intel)(intptr_t)acceleratorAddress;
	clRetainAcceleratorINTELPROC clRetainAcceleratorINTEL = (clRetainAcceleratorINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clRetainAcceleratorINTEL(accelerator);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_INTELAccelerator_nclReleaseAcceleratorINTEL(JNIEnv *__env, jclass clazz, jlong acceleratorAddress, jlong __functionAddress) {
	cl_accelerator_intel accelerator = (cl_accelerator_intel)(intptr_t)acceleratorAddress;
	clReleaseAcceleratorINTELPROC clReleaseAcceleratorINTEL = (clReleaseAcceleratorINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clReleaseAcceleratorINTEL(accelerator);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_INTELAccelerator_nclGetAcceleratorInfoINTEL(JNIEnv *__env, jclass clazz, jlong acceleratorAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_accelerator_intel accelerator = (cl_accelerator_intel)(intptr_t)acceleratorAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetAcceleratorInfoINTELPROC clGetAcceleratorInfoINTEL = (clGetAcceleratorInfoINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetAcceleratorInfoINTEL(accelerator, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

EXTERN_C_EXIT
