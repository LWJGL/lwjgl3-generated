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

typedef EGLBoolean (APIENTRY *eglPostSubBufferNVPROC) (EGLDisplay, EGLSurface, EGLint, EGLint, EGLint, EGLint);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_NVPostSubBuffer_neglPostSubBufferNV(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	eglPostSubBufferNVPROC eglPostSubBufferNV = (eglPostSubBufferNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglPostSubBufferNV(dpy, surface, x, y, width, height);
}

EXTERN_C_EXIT
