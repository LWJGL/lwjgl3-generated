/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef GLint (APIENTRY *glXGetVideoSyncSGIPROC) (unsigned int *);
typedef GLint (APIENTRY *glXWaitVideoSyncSGIPROC) (int, int, unsigned int *);

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXSGIVideoSync_nglXGetVideoSyncSGI(JNIEnv *__env, jclass clazz, jlong countAddress, jlong __functionAddress) {
	unsigned int *count = (unsigned int *)(intptr_t)countAddress;
	glXGetVideoSyncSGIPROC glXGetVideoSyncSGI = (glXGetVideoSyncSGIPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXGetVideoSyncSGI(count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXSGIVideoSync_nglXWaitVideoSyncSGI(JNIEnv *__env, jclass clazz, jint divisor, jint remainder, jlong countAddress, jlong __functionAddress) {
	unsigned int *count = (unsigned int *)(intptr_t)countAddress;
	glXWaitVideoSyncSGIPROC glXWaitVideoSyncSGI = (glXWaitVideoSyncSGIPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXWaitVideoSyncSGI(divisor, remainder, count);
}
