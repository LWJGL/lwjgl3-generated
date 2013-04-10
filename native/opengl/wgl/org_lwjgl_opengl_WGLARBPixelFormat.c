/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef BOOL (APIENTRY *wglGetPixelFormatAttribivARBPROC) (HDC, int, int, UINT, const int *, int *);
typedef BOOL (APIENTRY *wglGetPixelFormatAttribfvARBPROC) (HDC, int, int, UINT, const int *, FLOAT *);
typedef BOOL (APIENTRY *wglChoosePixelFormatARBPROC) (HDC, const int *, const FLOAT *, UINT, int *, UINT *);

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBPixelFormat_nwglGetPixelFormatAttribivARB(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint pixelFormat, jint layerPlane, jint n, jlong attributesAddress, jlong valuesAddress, jlong __functionAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	const int *attributes = (const int *)(intptr_t)attributesAddress;
	int *values = (int *)(intptr_t)valuesAddress;
	wglGetPixelFormatAttribivARBPROC wglGetPixelFormatAttribivARB = (wglGetPixelFormatAttribivARBPROC)(intptr_t)__functionAddress;
	return (jint)wglGetPixelFormatAttribivARB(hdc, pixelFormat, layerPlane, n, attributes, values);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBPixelFormat_nwglGetPixelFormatAttribfvARB(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint pixelFormat, jint layerPlane, jint n, jlong attributesAddress, jlong valuesAddress, jlong __functionAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	const int *attributes = (const int *)(intptr_t)attributesAddress;
	FLOAT *values = (FLOAT *)(intptr_t)valuesAddress;
	wglGetPixelFormatAttribfvARBPROC wglGetPixelFormatAttribfvARB = (wglGetPixelFormatAttribfvARBPROC)(intptr_t)__functionAddress;
	return (jint)wglGetPixelFormatAttribfvARB(hdc, pixelFormat, layerPlane, n, attributes, values);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLARBPixelFormat_nwglChoosePixelFormatARB(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong attribIListAddress, jlong attribFListAddress, jint maxFormats, jlong formatsAddress, jlong numFormatsAddress, jlong __functionAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	const int *attribIList = (const int *)(intptr_t)attribIListAddress;
	const FLOAT *attribFList = (const FLOAT *)(intptr_t)attribFListAddress;
	int *formats = (int *)(intptr_t)formatsAddress;
	UINT *numFormats = (UINT *)(intptr_t)numFormatsAddress;
	wglChoosePixelFormatARBPROC wglChoosePixelFormatARB = (wglChoosePixelFormatARBPROC)(intptr_t)__functionAddress;
	return (jint)wglChoosePixelFormatARB(hdc, attribIList, attribFList, maxFormats, formats, numFormats);
}