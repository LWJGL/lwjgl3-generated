/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

typedef int (APIENTRY *ChoosePixelFormatPROC) (HDC, const PIXELFORMATDESCRIPTOR *);
typedef int (APIENTRY *DescribePixelFormatPROC) (HDC, int, UINT, LPPIXELFORMATDESCRIPTOR);
typedef int (APIENTRY *GetPixelFormatPROC) (HDC);
typedef BOOL (APIENTRY *SetPixelFormatPROC) (HDC, int, const PIXELFORMATDESCRIPTOR *);
typedef BOOL (APIENTRY *SwapBuffersPROC) (HDC);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nChoosePixelFormat(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hdcAddress, jlong pixelFormatDescriptorAddress) {
	ChoosePixelFormatPROC ChoosePixelFormat = (ChoosePixelFormatPROC)(intptr_t)__functionAddress;
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	const PIXELFORMATDESCRIPTOR *pixelFormatDescriptor = (const PIXELFORMATDESCRIPTOR *)(intptr_t)pixelFormatDescriptorAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)ChoosePixelFormat(hdc, pixelFormatDescriptor);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nDescribePixelFormat(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hdcAddress, jint pixelFormat, jint bytes, jlong pixelFormatDescriptorAddress) {
	DescribePixelFormatPROC DescribePixelFormat = (DescribePixelFormatPROC)(intptr_t)__functionAddress;
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	LPPIXELFORMATDESCRIPTOR pixelFormatDescriptor = (LPPIXELFORMATDESCRIPTOR)(intptr_t)pixelFormatDescriptorAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)DescribePixelFormat(hdc, pixelFormat, bytes, pixelFormatDescriptor);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nGetPixelFormat(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hdcAddress) {
	GetPixelFormatPROC GetPixelFormat = (GetPixelFormatPROC)(intptr_t)__functionAddress;
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)GetPixelFormat(hdc);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nSetPixelFormat(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hdcAddress, jint pixelFormat, jlong pixelFormatDescriptorAddress) {
	SetPixelFormatPROC SetPixelFormat = (SetPixelFormatPROC)(intptr_t)__functionAddress;
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	const PIXELFORMATDESCRIPTOR *pixelFormatDescriptor = (const PIXELFORMATDESCRIPTOR *)(intptr_t)pixelFormatDescriptorAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)SetPixelFormat(hdc, pixelFormat, pixelFormatDescriptor);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nSwapBuffers(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong dcAddress) {
	SwapBuffersPROC SwapBuffers = (SwapBuffersPROC)(intptr_t)__functionAddress;
	HDC dc = (HDC)(intptr_t)dcAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)SwapBuffers(dc);
	saveLastError();
	return __result;
}

EXTERN_C_EXIT
