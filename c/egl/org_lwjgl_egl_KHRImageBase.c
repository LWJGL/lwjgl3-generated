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

typedef EGLImageKHR (APIENTRY *eglCreateImageKHRPROC) (EGLDisplay, EGLContext, EGLenum, EGLClientBuffer, const EGLint *);
typedef EGLBoolean (APIENTRY *eglDestroyImageKHRPROC) (EGLDisplay, EGLImageKHR);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_KHRImageBase_neglCreateImageKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong ctxAddress, jint target, jlong bufferAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLContext ctx = (EGLContext)(intptr_t)ctxAddress;
	EGLClientBuffer buffer = (EGLClientBuffer)(intptr_t)bufferAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreateImageKHRPROC eglCreateImageKHR = (eglCreateImageKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateImageKHR(dpy, ctx, target, buffer, attrib_list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRImageBase_neglDestroyImageKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong imageAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLImageKHR image = (EGLImageKHR)(intptr_t)imageAddress;
	eglDestroyImageKHRPROC eglDestroyImageKHR = (eglDestroyImageKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglDestroyImageKHR(dpy, image);
}

EXTERN_C_EXIT
