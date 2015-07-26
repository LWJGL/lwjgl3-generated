/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "EGL/egl.h"
ENABLE_WARNINGS()

typedef EGLBoolean (APIENTRY *eglBindTexImagePROC) (EGLDisplay, EGLSurface, EGLint);
typedef EGLBoolean (APIENTRY *eglReleaseTexImagePROC) (EGLDisplay, EGLSurface, EGLint);
typedef EGLBoolean (APIENTRY *eglSurfaceAttribPROC) (EGLDisplay, EGLSurface, EGLint, EGLint);
typedef EGLBoolean (APIENTRY *eglSwapIntervalPROC) (EGLDisplay, EGLint);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL11_neglBindTexImage(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jint buffer, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	eglBindTexImagePROC eglBindTexImage = (eglBindTexImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglBindTexImage(dpy, surface, buffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL11_neglReleaseTexImage(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jint buffer, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	eglReleaseTexImagePROC eglReleaseTexImage = (eglReleaseTexImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglReleaseTexImage(dpy, surface, buffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL11_neglSurfaceAttrib(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jint attribute, jint value, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	eglSurfaceAttribPROC eglSurfaceAttrib = (eglSurfaceAttribPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglSurfaceAttrib(dpy, surface, attribute, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL11_neglSwapInterval(JNIEnv *__env, jclass clazz, jlong dpyAddress, jint interval, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	eglSwapIntervalPROC eglSwapInterval = (eglSwapIntervalPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglSwapInterval(dpy, interval);
}

EXTERN_C_EXIT
