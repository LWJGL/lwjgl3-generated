/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef BOOL (APIENTRY *wglDelayBeforeSwapNVPROC) (HDC, GLfloat);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVDelayBeforeSwap_nwglDelayBeforeSwapNV(JNIEnv *__env, jclass clazz, jlong hDCAddress, jfloat seconds, jlong __functionAddress) {
	HDC hDC = (HDC)(intptr_t)hDCAddress;
	wglDelayBeforeSwapNVPROC wglDelayBeforeSwapNV = (wglDelayBeforeSwapNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglDelayBeforeSwapNV(hDC, seconds);
}

EXTERN_C_EXIT
