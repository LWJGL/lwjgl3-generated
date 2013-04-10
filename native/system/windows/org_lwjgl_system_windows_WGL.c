/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WGL_nwglCreateContext(JNIEnv *__env, jclass clazz, jlong hdcAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jlong)(intptr_t)wglCreateContext(hdc);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WGL_nwglCreateLayerContext(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint layerPlane) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jlong)(intptr_t)wglCreateLayerContext(hdc, layerPlane);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WGL_nwglCopyContext(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint mask) {
	HGLRC src = (HGLRC)(intptr_t)srcAddress;
	HGLRC dst = (HGLRC)(intptr_t)dstAddress;
	return (jint)wglCopyContext(src, dst, mask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WGL_nwglDeleteContext(JNIEnv *__env, jclass clazz, jlong contextAddress) {
	HGLRC context = (HGLRC)(intptr_t)contextAddress;
	return (jint)wglDeleteContext(context);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WGL_wglGetCurrentContext(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)wglGetCurrentContext();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WGL_wglGetCurrentDC(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)wglGetCurrentDC();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WGL_nwglGetProcAddress(JNIEnv *__env, jclass clazz, jlong procAddress) {
	LPCSTR proc = (LPCSTR)(intptr_t)procAddress;
	return (jlong)(intptr_t)wglGetProcAddress(proc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WGL_nwglMakeCurrent(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong contextAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	HGLRC context = (HGLRC)(intptr_t)contextAddress;
	return (jint)wglMakeCurrent(hdc, context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WGL_nwglShareLists(JNIEnv *__env, jclass clazz, jlong context1Address, jlong context2Address) {
	HGLRC context1 = (HGLRC)(intptr_t)context1Address;
	HGLRC context2 = (HGLRC)(intptr_t)context2Address;
	return (jint)wglShareLists(context1, context2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WGL_nwglUseFontBitmaps(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint first, jint count, jint listBase) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jint)wglUseFontBitmaps(hdc, first, count, listBase);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WGL_nwglUseFontOutlines(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint first, jint count, jint listBase, jfloat deviation, jfloat extrusion, jint format, jlong glyphMetricsAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	LPGLYPHMETRICSFLOAT glyphMetrics = (LPGLYPHMETRICSFLOAT)(intptr_t)glyphMetricsAddress;
	return (jint)wglUseFontOutlines(hdc, first, count, listBase, deviation, extrusion, format, glyphMetrics);
}