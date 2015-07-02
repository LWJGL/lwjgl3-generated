/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"
#include "WGL.h"

typedef BOOL (APIENTRY *wglBindTexImageARBPROC) (HPBUFFERARB, int);
typedef BOOL (APIENTRY *wglReleaseTexImageARBPROC) (HPBUFFERARB, int);
typedef BOOL (APIENTRY *wglSetPbufferAttribARBPROC) (HPBUFFERARB, const int *);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBRenderTexture_nwglBindTexImageARB(JNIEnv *__env, jclass clazz, jlong pbufferAddress, jint buffer, jlong __functionAddress) {
	HPBUFFERARB pbuffer = (HPBUFFERARB)(intptr_t)pbufferAddress;
	wglBindTexImageARBPROC wglBindTexImageARB = (wglBindTexImageARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglBindTexImageARB(pbuffer, buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBRenderTexture_nwglReleaseTexImageARB(JNIEnv *__env, jclass clazz, jlong pbufferAddress, jint buffer, jlong __functionAddress) {
	HPBUFFERARB pbuffer = (HPBUFFERARB)(intptr_t)pbufferAddress;
	wglReleaseTexImageARBPROC wglReleaseTexImageARB = (wglReleaseTexImageARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglReleaseTexImageARB(pbuffer, buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBRenderTexture_nwglSetPbufferAttribARB(JNIEnv *__env, jclass clazz, jlong pbufferAddress, jlong attribListAddress, jlong __functionAddress) {
	HPBUFFERARB pbuffer = (HPBUFFERARB)(intptr_t)pbufferAddress;
	const int *attribList = (const int *)(intptr_t)attribListAddress;
	wglSetPbufferAttribARBPROC wglSetPbufferAttribARB = (wglSetPbufferAttribARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglSetPbufferAttribARB(pbuffer, attribList);
}

EXTERN_C_EXIT
