/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef HANDLE (APIENTRY *wglCreateBufferRegionARBPROC) (HDC, int, UINT);
typedef VOID (APIENTRY *wglDeleteBufferRegionARBPROC) (HANDLE);
typedef BOOL (APIENTRY *wglSaveBufferRegionARBPROC) (HANDLE, int, int, int, int);
typedef BOOL (APIENTRY *wglRestoreBufferRegionARBPROC) (HANDLE, int, int, int, int, int, int);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLARBBufferRegion_nwglCreateBufferRegionARB(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint layerPlane, jint type, jlong __functionAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	wglCreateBufferRegionARBPROC wglCreateBufferRegionARB = (wglCreateBufferRegionARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)wglCreateBufferRegionARB(hdc, layerPlane, type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_WGLARBBufferRegion_nwglDeleteBufferRegionARB(JNIEnv *__env, jclass clazz, jlong regionAddress, jlong __functionAddress) {
	HANDLE region = (HANDLE)(intptr_t)regionAddress;
	wglDeleteBufferRegionARBPROC wglDeleteBufferRegionARB = (wglDeleteBufferRegionARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	wglDeleteBufferRegionARB(region);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBBufferRegion_nwglSaveBufferRegionARB(JNIEnv *__env, jclass clazz, jlong regionAddress, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	HANDLE region = (HANDLE)(intptr_t)regionAddress;
	wglSaveBufferRegionARBPROC wglSaveBufferRegionARB = (wglSaveBufferRegionARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglSaveBufferRegionARB(region, x, y, width, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBBufferRegion_nwglRestoreBufferRegionARB(JNIEnv *__env, jclass clazz, jlong regionAddress, jint x, jint y, jint width, jint height, jint xSrc, jint ySrc, jlong __functionAddress) {
	HANDLE region = (HANDLE)(intptr_t)regionAddress;
	wglRestoreBufferRegionARBPROC wglRestoreBufferRegionARB = (wglRestoreBufferRegionARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglRestoreBufferRegionARB(region, x, y, width, height, xSrc, ySrc);
}

EXTERN_C_EXIT
