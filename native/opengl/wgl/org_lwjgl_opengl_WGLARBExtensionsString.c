/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef const char * (APIENTRY *wglGetExtensionsStringARBPROC) (HDC);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLARBExtensionsString_nwglGetExtensionsStringARB(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong __functionAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	wglGetExtensionsStringARBPROC wglGetExtensionsStringARB = (wglGetExtensionsStringARBPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)wglGetExtensionsStringARB(hdc);
}