/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"

typedef BOOL (APIENTRY *wglMakeContextCurrentARBPROC) (HDC, HDC, HGLRC);
typedef HDC (APIENTRY *wglGetCurrentReadDCARBPROC) (void);

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBMakeCurrentRead_nwglMakeContextCurrentARB(JNIEnv *__env, jclass clazz, jlong drawDCAddress, jlong readDCAddress, jlong hglrcAddress, jlong __functionAddress) {
	HDC drawDC = (HDC)(intptr_t)drawDCAddress;
	HDC readDC = (HDC)(intptr_t)readDCAddress;
	HGLRC hglrc = (HGLRC)(intptr_t)hglrcAddress;
	wglMakeContextCurrentARBPROC wglMakeContextCurrentARB = (wglMakeContextCurrentARBPROC)(intptr_t)__functionAddress;
	return (jint)wglMakeContextCurrentARB(drawDC, readDC, hglrc);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLARBMakeCurrentRead_nwglGetCurrentReadDCARB(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	wglGetCurrentReadDCARBPROC wglGetCurrentReadDCARB = (wglGetCurrentReadDCARBPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)wglGetCurrentReadDCARB();
}