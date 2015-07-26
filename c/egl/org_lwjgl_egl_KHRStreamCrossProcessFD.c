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

typedef EGLNativeFileDescriptorKHR (APIENTRY *eglGetStreamFileDescriptorKHRPROC) (EGLDisplay, EGLStreamKHR);
typedef EGLStreamKHR (APIENTRY *eglCreateStreamFromFileDescriptorKHRPROC) (EGLDisplay, EGLNativeFileDescriptorKHR);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_egl_KHRStreamCrossProcessFD_neglGetStreamFileDescriptorKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong streamAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	eglGetStreamFileDescriptorKHRPROC eglGetStreamFileDescriptorKHR = (eglGetStreamFileDescriptorKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)eglGetStreamFileDescriptorKHR(dpy, stream);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_KHRStreamCrossProcessFD_neglCreateStreamFromFileDescriptorKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jint file_descriptor, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	eglCreateStreamFromFileDescriptorKHRPROC eglCreateStreamFromFileDescriptorKHR = (eglCreateStreamFromFileDescriptorKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateStreamFromFileDescriptorKHR(dpy, file_descriptor);
}

EXTERN_C_EXIT
