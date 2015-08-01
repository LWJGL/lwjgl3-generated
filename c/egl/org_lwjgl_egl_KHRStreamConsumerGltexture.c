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

typedef EGLBoolean (APIENTRY *eglStreamConsumerGLTextureExternalKHRPROC) (EGLDisplay, EGLStreamKHR);
typedef EGLBoolean (APIENTRY *eglStreamConsumerAcquireKHRPROC) (EGLDisplay, EGLStreamKHR);
typedef EGLBoolean (APIENTRY *eglStreamConsumerReleaseKHRPROC) (EGLDisplay, EGLStreamKHR);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRStreamConsumerGLTexture_neglStreamConsumerGLTextureExternalKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong streamAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	eglStreamConsumerGLTextureExternalKHRPROC eglStreamConsumerGLTextureExternalKHR = (eglStreamConsumerGLTextureExternalKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglStreamConsumerGLTextureExternalKHR(dpy, stream);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRStreamConsumerGLTexture_neglStreamConsumerAcquireKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong streamAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	eglStreamConsumerAcquireKHRPROC eglStreamConsumerAcquireKHR = (eglStreamConsumerAcquireKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglStreamConsumerAcquireKHR(dpy, stream);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRStreamConsumerGLTexture_neglStreamConsumerReleaseKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong streamAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	eglStreamConsumerReleaseKHRPROC eglStreamConsumerReleaseKHR = (eglStreamConsumerReleaseKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglStreamConsumerReleaseKHR(dpy, stream);
}

EXTERN_C_EXIT
