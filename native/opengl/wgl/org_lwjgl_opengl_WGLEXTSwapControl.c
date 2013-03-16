/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"

typedef BOOL (APIENTRY *wglSwapIntervalEXTPROC) (int);
typedef int (APIENTRY *wglGetSwapIntervalEXTPROC) ();

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLEXTSwapControl_nwglSwapIntervalEXT(JNIEnv *__env, jclass clazz, jint interval, jlong __functionAddress) {
	wglSwapIntervalEXTPROC wglSwapIntervalEXT = (wglSwapIntervalEXTPROC)(intptr_t)__functionAddress;
	return (jint)wglSwapIntervalEXT(interval);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLEXTSwapControl_nwglGetSwapIntervalEXT(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	wglGetSwapIntervalEXTPROC wglGetSwapIntervalEXT = (wglGetSwapIntervalEXTPROC)(intptr_t)__functionAddress;
	return (jint)wglGetSwapIntervalEXT();
}