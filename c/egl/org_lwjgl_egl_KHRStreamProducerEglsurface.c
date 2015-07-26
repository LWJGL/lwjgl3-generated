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

typedef EGLSurface (APIENTRY *eglCreateStreamProducerSurfaceKHRPROC) (EGLDisplay, EGLConfig, EGLStreamKHR, const EGLint *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_KHRStreamProducerEglsurface_neglCreateStreamProducerSurfaceKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configAddress, jlong streamAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreateStreamProducerSurfaceKHRPROC eglCreateStreamProducerSurfaceKHR = (eglCreateStreamProducerSurfaceKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateStreamProducerSurfaceKHR(dpy, config, stream, attrib_list);
}

EXTERN_C_EXIT
