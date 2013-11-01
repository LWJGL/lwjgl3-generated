/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"
#include "OpenGL.h"

typedef GLsync (APIENTRY *glCreateSyncFromCLeventARBPROC) (cl_context, cl_event, GLbitfield);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBCLEvent_nglCreateSyncFromCLeventARB(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong eventAddress, jint flags, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_event event = (cl_event)(intptr_t)eventAddress;
	glCreateSyncFromCLeventARBPROC glCreateSyncFromCLeventARB = (glCreateSyncFromCLeventARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glCreateSyncFromCLeventARB(context, event, flags);
}
