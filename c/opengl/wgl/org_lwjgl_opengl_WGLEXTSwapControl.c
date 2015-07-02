/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef BOOL (APIENTRY *wglSwapIntervalEXTPROC) (int);
typedef int (APIENTRY *wglGetSwapIntervalEXTPROC) (void);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLEXTSwapControl_nwglSwapIntervalEXT(JNIEnv *__env, jclass clazz, jint interval, jlong __functionAddress) {
	wglSwapIntervalEXTPROC wglSwapIntervalEXT = (wglSwapIntervalEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglSwapIntervalEXT(interval);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLEXTSwapControl_nwglGetSwapIntervalEXT(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	wglGetSwapIntervalEXTPROC wglGetSwapIntervalEXT = (wglGetSwapIntervalEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglGetSwapIntervalEXT();
}

EXTERN_C_EXIT
