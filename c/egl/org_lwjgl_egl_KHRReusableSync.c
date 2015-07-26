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

typedef EGLSyncKHR (APIENTRY *eglCreateSyncKHRPROC) (EGLDisplay, EGLenum, const EGLint *);
typedef EGLBoolean (APIENTRY *eglDestroySyncKHRPROC) (EGLDisplay, EGLSyncKHR);
typedef EGLint (APIENTRY *eglClientWaitSyncKHRPROC) (EGLDisplay, EGLSyncKHR, EGLint, EGLTimeKHR);
typedef EGLBoolean (APIENTRY *eglSignalSyncKHRPROC) (EGLDisplay, EGLSyncKHR, EGLenum);
typedef EGLBoolean (APIENTRY *eglGetSyncAttribKHRPROC) (EGLDisplay, EGLSyncKHR, EGLint, EGLint *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_KHRReusableSync_neglCreateSyncKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jint type, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreateSyncKHRPROC eglCreateSyncKHR = (eglCreateSyncKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateSyncKHR(dpy, type, attrib_list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRReusableSync_neglDestroySyncKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong syncAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSyncKHR sync = (EGLSyncKHR)(intptr_t)syncAddress;
	eglDestroySyncKHRPROC eglDestroySyncKHR = (eglDestroySyncKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglDestroySyncKHR(dpy, sync);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_egl_KHRReusableSync_neglClientWaitSyncKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong syncAddress, jint flags, jlong timeout, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSyncKHR sync = (EGLSyncKHR)(intptr_t)syncAddress;
	eglClientWaitSyncKHRPROC eglClientWaitSyncKHR = (eglClientWaitSyncKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)eglClientWaitSyncKHR(dpy, sync, flags, timeout);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRReusableSync_neglSignalSyncKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong syncAddress, jint mode, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSyncKHR sync = (EGLSyncKHR)(intptr_t)syncAddress;
	eglSignalSyncKHRPROC eglSignalSyncKHR = (eglSignalSyncKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglSignalSyncKHR(dpy, sync, mode);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRReusableSync_neglGetSyncAttribKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong syncAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSyncKHR sync = (EGLSyncKHR)(intptr_t)syncAddress;
	EGLint *value = (EGLint *)(intptr_t)valueAddress;
	eglGetSyncAttribKHRPROC eglGetSyncAttribKHR = (eglGetSyncAttribKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglGetSyncAttribKHR(dpy, sync, attribute, value);
}

EXTERN_C_EXIT
