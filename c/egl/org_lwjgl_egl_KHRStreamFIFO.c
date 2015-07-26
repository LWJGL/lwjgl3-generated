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

typedef EGLBoolean (APIENTRY *eglQueryStreamTimeKHRPROC) (EGLDisplay, EGLStreamKHR, EGLenum, EGLTimeKHR *);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRStreamFIFO_neglQueryStreamTimeKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong streamAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	EGLTimeKHR *value = (EGLTimeKHR *)(intptr_t)valueAddress;
	eglQueryStreamTimeKHRPROC eglQueryStreamTimeKHR = (eglQueryStreamTimeKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryStreamTimeKHR(dpy, stream, attribute, value);
}

EXTERN_C_EXIT
