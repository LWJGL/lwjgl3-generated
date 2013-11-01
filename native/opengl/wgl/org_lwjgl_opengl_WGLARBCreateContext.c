/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef HGLRC (APIENTRY *wglCreateContextAttribsARBPROC) (HDC, HGLRC, const int *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLARBCreateContext_nwglCreateContextAttribsARB(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong shareContextAddress, jlong attribListAddress, jlong __functionAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	HGLRC shareContext = (HGLRC)(intptr_t)shareContextAddress;
	const int *attribList = (const int *)(intptr_t)attribListAddress;
	wglCreateContextAttribsARBPROC wglCreateContextAttribsARB = (wglCreateContextAttribsARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)wglCreateContextAttribsARB(hdc, shareContext, attribList);
}
