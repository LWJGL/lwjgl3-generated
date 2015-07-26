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

typedef EGLSyncNV (APIENTRY *eglCreateFenceSyncNVPROC) (EGLDisplay, EGLenum, const EGLint *);
typedef EGLBoolean (APIENTRY *eglDestroySyncNVPROC) (EGLSyncNV);
typedef EGLBoolean (APIENTRY *eglFenceNVPROC) (EGLSyncNV);
typedef EGLint (APIENTRY *eglClientWaitSyncNVPROC) (EGLSyncNV, EGLint, EGLTimeNV);
typedef EGLBoolean (APIENTRY *eglSignalSyncNVPROC) (EGLSyncNV, EGLenum);
typedef EGLBoolean (APIENTRY *eglGetSyncAttribNVPROC) (EGLSyncNV, EGLint, EGLint *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_NVSync_neglCreateFenceSyncNV(JNIEnv *__env, jclass clazz, jlong dpyAddress, jint condition, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreateFenceSyncNVPROC eglCreateFenceSyncNV = (eglCreateFenceSyncNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateFenceSyncNV(dpy, condition, attrib_list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_NVSync_neglDestroySyncNV(JNIEnv *__env, jclass clazz, jlong syncAddress, jlong __functionAddress) {
	EGLSyncNV sync = (EGLSyncNV)(intptr_t)syncAddress;
	eglDestroySyncNVPROC eglDestroySyncNV = (eglDestroySyncNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglDestroySyncNV(sync);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_NVSync_neglFenceNV(JNIEnv *__env, jclass clazz, jlong syncAddress, jlong __functionAddress) {
	EGLSyncNV sync = (EGLSyncNV)(intptr_t)syncAddress;
	eglFenceNVPROC eglFenceNV = (eglFenceNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglFenceNV(sync);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_egl_NVSync_neglClientWaitSyncNV(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout, jlong __functionAddress) {
	EGLSyncNV sync = (EGLSyncNV)(intptr_t)syncAddress;
	eglClientWaitSyncNVPROC eglClientWaitSyncNV = (eglClientWaitSyncNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)eglClientWaitSyncNV(sync, flags, timeout);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_NVSync_neglSignalSyncNV(JNIEnv *__env, jclass clazz, jlong syncAddress, jint mode, jlong __functionAddress) {
	EGLSyncNV sync = (EGLSyncNV)(intptr_t)syncAddress;
	eglSignalSyncNVPROC eglSignalSyncNV = (eglSignalSyncNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglSignalSyncNV(sync, mode);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_NVSync_neglGetSyncAttribNV(JNIEnv *__env, jclass clazz, jlong syncAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLSyncNV sync = (EGLSyncNV)(intptr_t)syncAddress;
	EGLint *value = (EGLint *)(intptr_t)valueAddress;
	eglGetSyncAttribNVPROC eglGetSyncAttribNV = (eglGetSyncAttribNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglGetSyncAttribNV(sync, attribute, value);
}

EXTERN_C_EXIT
