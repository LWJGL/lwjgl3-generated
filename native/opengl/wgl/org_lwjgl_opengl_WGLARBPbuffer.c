/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"
#include "WGL.h"

typedef HPBUFFERARB (APIENTRY *wglCreatePbufferARBPROC) (HDC, int, int, int, const int *);
typedef HDC (APIENTRY *wglGetPbufferDCARBPROC) (HPBUFFERARB);
typedef int (APIENTRY *wglReleasePbufferDCARBPROC) (HPBUFFERARB, HDC);
typedef BOOL (APIENTRY *wglDestroyPbufferARBPROC) (HPBUFFERARB);
typedef BOOL (APIENTRY *wglQueryPbufferARBPROC) (HPBUFFERARB, int, int *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLARBPbuffer_nwglCreatePbufferARB(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint pixelFormat, jint width, jint height, jlong attribListAddress, jlong __functionAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	const int *attribList = (const int *)(intptr_t)attribListAddress;
	wglCreatePbufferARBPROC wglCreatePbufferARB = (wglCreatePbufferARBPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)wglCreatePbufferARB(hdc, pixelFormat, width, height, attribList);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLARBPbuffer_nwglGetPbufferDCARB(JNIEnv *__env, jclass clazz, jlong pbufferAddress, jlong __functionAddress) {
	HPBUFFERARB pbuffer = (HPBUFFERARB)(intptr_t)pbufferAddress;
	wglGetPbufferDCARBPROC wglGetPbufferDCARB = (wglGetPbufferDCARBPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)wglGetPbufferDCARB(pbuffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBPbuffer_nwglReleasePbufferDCARB(JNIEnv *__env, jclass clazz, jlong pbufferAddress, jlong hdcAddress, jlong __functionAddress) {
	HPBUFFERARB pbuffer = (HPBUFFERARB)(intptr_t)pbufferAddress;
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	wglReleasePbufferDCARBPROC wglReleasePbufferDCARB = (wglReleasePbufferDCARBPROC)(intptr_t)__functionAddress;
	return (jint)wglReleasePbufferDCARB(pbuffer, hdc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBPbuffer_nwglDestroyPbufferARB(JNIEnv *__env, jclass clazz, jlong pbufferAddress, jlong __functionAddress) {
	HPBUFFERARB pbuffer = (HPBUFFERARB)(intptr_t)pbufferAddress;
	wglDestroyPbufferARBPROC wglDestroyPbufferARB = (wglDestroyPbufferARBPROC)(intptr_t)__functionAddress;
	return (jint)wglDestroyPbufferARB(pbuffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBPbuffer_nwglQueryPbufferARB(JNIEnv *__env, jclass clazz, jlong pbufferAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	HPBUFFERARB pbuffer = (HPBUFFERARB)(intptr_t)pbufferAddress;
	int *value = (int *)(intptr_t)valueAddress;
	wglQueryPbufferARBPROC wglQueryPbufferARB = (wglQueryPbufferARBPROC)(intptr_t)__functionAddress;
	return (jint)wglQueryPbufferARB(pbuffer, attribute, value);
}