/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "EGL/egl.h"
#include "EGL/eglext.h"
ENABLE_WARNINGS()

typedef EGLuint64NV (APIENTRY *eglGetSystemTimeFrequencyNVPROC) (void);
typedef EGLuint64NV (APIENTRY *eglGetSystemTimeNVPROC) (void);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_NVSystemTime_neglGetSystemTimeFrequencyNV(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	eglGetSystemTimeFrequencyNVPROC eglGetSystemTimeFrequencyNV = (eglGetSystemTimeFrequencyNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)eglGetSystemTimeFrequencyNV();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_NVSystemTime_neglGetSystemTimeNV(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	eglGetSystemTimeNVPROC eglGetSystemTimeNV = (eglGetSystemTimeNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)eglGetSystemTimeNV();
}

EXTERN_C_EXIT
