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

typedef EGLint (APIENTRY *eglWaitSyncKHRPROC) (EGLDisplay, EGLSyncKHR, EGLint);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_egl_KHRWaitSync_neglWaitSyncKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong syncAddress, jint flags, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSyncKHR sync = (EGLSyncKHR)(intptr_t)syncAddress;
	eglWaitSyncKHRPROC eglWaitSyncKHR = (eglWaitSyncKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)eglWaitSyncKHR(dpy, sync, flags);
}

EXTERN_C_EXIT
