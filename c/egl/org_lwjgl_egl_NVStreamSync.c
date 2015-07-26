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

typedef EGLSyncKHR (APIENTRY *eglCreateStreamSyncNVPROC) (EGLDisplay, EGLStreamKHR, EGLenum, const EGLint *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_NVStreamSync_neglCreateStreamSyncNV(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong streamAddress, jint type, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreateStreamSyncNVPROC eglCreateStreamSyncNV = (eglCreateStreamSyncNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateStreamSyncNV(dpy, stream, type, attrib_list);
}

EXTERN_C_EXIT
