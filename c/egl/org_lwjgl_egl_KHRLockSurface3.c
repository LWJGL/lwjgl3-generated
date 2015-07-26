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

typedef EGLBoolean (APIENTRY *eglLockSurfaceKHRPROC) (EGLDisplay, EGLSurface, const EGLint *);
typedef EGLBoolean (APIENTRY *eglUnlockSurfaceKHRPROC) (EGLDisplay, EGLSurface);
typedef EGLBoolean (APIENTRY *eglQuerySurface64KHRPROC) (EGLDisplay, EGLSurface, EGLint, EGLAttribKHR *);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRLockSurface3_neglLockSurfaceKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglLockSurfaceKHRPROC eglLockSurfaceKHR = (eglLockSurfaceKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglLockSurfaceKHR(dpy, surface, attrib_list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRLockSurface3_neglUnlockSurfaceKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	eglUnlockSurfaceKHRPROC eglUnlockSurfaceKHR = (eglUnlockSurfaceKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglUnlockSurfaceKHR(dpy, surface);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRLockSurface3_neglQuerySurface64KHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	EGLAttribKHR *value = (EGLAttribKHR *)(intptr_t)valueAddress;
	eglQuerySurface64KHRPROC eglQuerySurface64KHR = (eglQuerySurface64KHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQuerySurface64KHR(dpy, surface, attribute, value);
}

EXTERN_C_EXIT
