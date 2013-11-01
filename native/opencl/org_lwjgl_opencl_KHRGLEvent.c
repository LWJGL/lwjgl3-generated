/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"
#include "opengl_types.h"

typedef cl_event (APIENTRY *clCreateEventFromGLsyncKHRPROC) (cl_context, GLsync, cl_int *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_KHRGLEvent_nclCreateEventFromGLsyncKHR(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong syncAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateEventFromGLsyncKHRPROC clCreateEventFromGLsyncKHR = (clCreateEventFromGLsyncKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateEventFromGLsyncKHR(context, sync, errcode_ret);
}
