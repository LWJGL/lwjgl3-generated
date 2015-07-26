/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "EGL/egl.h"
ENABLE_WARNINGS()

typedef EGLBoolean (APIENTRY *eglBindAPIPROC) (EGLenum);
typedef EGLenum (APIENTRY *eglQueryAPIPROC) (void);
typedef EGLSurface (APIENTRY *eglCreatePbufferFromClientBufferPROC) (EGLDisplay, EGLenum, EGLClientBuffer, EGLConfig, const EGLint *);
typedef EGLBoolean (APIENTRY *eglReleaseThreadPROC) (void);
typedef EGLBoolean (APIENTRY *eglWaitClientPROC) (void);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL12_neglBindAPI(JNIEnv *__env, jclass clazz, jint api, jlong __functionAddress) {
	eglBindAPIPROC eglBindAPI = (eglBindAPIPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglBindAPI(api);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_egl_EGL12_neglQueryAPI(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	eglQueryAPIPROC eglQueryAPI = (eglQueryAPIPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)eglQueryAPI();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL12_neglCreatePbufferFromClientBuffer(JNIEnv *__env, jclass clazz, jlong dpyAddress, jint buftype, jlong bufferAddress, jlong configAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLClientBuffer buffer = (EGLClientBuffer)(intptr_t)bufferAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreatePbufferFromClientBufferPROC eglCreatePbufferFromClientBuffer = (eglCreatePbufferFromClientBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreatePbufferFromClientBuffer(dpy, buftype, buffer, config, attrib_list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL12_neglReleaseThread(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	eglReleaseThreadPROC eglReleaseThread = (eglReleaseThreadPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglReleaseThread();
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL12_neglWaitClient(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	eglWaitClientPROC eglWaitClient = (eglWaitClientPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglWaitClient();
}

EXTERN_C_EXIT
