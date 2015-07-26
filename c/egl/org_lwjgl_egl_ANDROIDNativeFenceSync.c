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

typedef EGLint (APIENTRY *eglDupNativeFenceFDANDROIDPROC) (EGLDisplay, EGLSyncKHR);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_egl_ANDROIDNativeFenceSync_neglDupNativeFenceFDANDROID(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong syncAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSyncKHR sync = (EGLSyncKHR)(intptr_t)syncAddress;
	eglDupNativeFenceFDANDROIDPROC eglDupNativeFenceFDANDROID = (eglDupNativeFenceFDANDROIDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)eglDupNativeFenceFDANDROID(dpy, sync);
}

EXTERN_C_EXIT
