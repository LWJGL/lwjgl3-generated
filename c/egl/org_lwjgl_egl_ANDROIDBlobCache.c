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

typedef void (APIENTRY *eglSetBlobCacheFuncsANDROIDPROC) (EGLDisplay, EGLSetBlobFuncANDROID, EGLGetBlobFuncANDROID);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_egl_ANDROIDBlobCache_neglSetBlobCacheFuncsANDROID(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong setAddress, jlong getAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSetBlobFuncANDROID set = (EGLSetBlobFuncANDROID)(intptr_t)setAddress;
	EGLGetBlobFuncANDROID get = (EGLGetBlobFuncANDROID)(intptr_t)getAddress;
	eglSetBlobCacheFuncsANDROIDPROC eglSetBlobCacheFuncsANDROID = (eglSetBlobCacheFuncsANDROIDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	eglSetBlobCacheFuncsANDROID(dpy, set, get);
}

EXTERN_C_EXIT
