/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#define APIENTRY __stdcall

typedef jint (APIENTRY *ChoosePixelFormatPROC) (intptr_t, const intptr_t);
typedef jint (APIENTRY *DescribePixelFormatPROC) (intptr_t, jint, jint, intptr_t);
typedef jint (APIENTRY *GetPixelFormatPROC) (intptr_t);
typedef jint (APIENTRY *SetPixelFormatPROC) (intptr_t, jint, const intptr_t);
typedef jint (APIENTRY *SwapBuffersPROC) (intptr_t);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nChoosePixelFormat(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hdcAddress, jlong pixelFormatDescriptorAddress) {
	ChoosePixelFormatPROC ChoosePixelFormat = (ChoosePixelFormatPROC)(intptr_t)__functionAddress;
	intptr_t hdc = (intptr_t)hdcAddress;
	const intptr_t pixelFormatDescriptor = (const intptr_t)pixelFormatDescriptorAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)ChoosePixelFormat(hdc, pixelFormatDescriptor);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nDescribePixelFormat(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hdcAddress, jint pixelFormat, jint bytes, jlong pixelFormatDescriptorAddress) {
	DescribePixelFormatPROC DescribePixelFormat = (DescribePixelFormatPROC)(intptr_t)__functionAddress;
	intptr_t hdc = (intptr_t)hdcAddress;
	intptr_t pixelFormatDescriptor = (intptr_t)pixelFormatDescriptorAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)DescribePixelFormat(hdc, pixelFormat, bytes, pixelFormatDescriptor);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nGetPixelFormat(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hdcAddress) {
	GetPixelFormatPROC GetPixelFormat = (GetPixelFormatPROC)(intptr_t)__functionAddress;
	intptr_t hdc = (intptr_t)hdcAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)GetPixelFormat(hdc);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nSetPixelFormat(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hdcAddress, jint pixelFormat, jlong pixelFormatDescriptorAddress) {
	SetPixelFormatPROC SetPixelFormat = (SetPixelFormatPROC)(intptr_t)__functionAddress;
	intptr_t hdc = (intptr_t)hdcAddress;
	const intptr_t pixelFormatDescriptor = (const intptr_t)pixelFormatDescriptorAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)SetPixelFormat(hdc, pixelFormat, pixelFormatDescriptor);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nSwapBuffers(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong dcAddress) {
	SwapBuffersPROC SwapBuffers = (SwapBuffersPROC)(intptr_t)__functionAddress;
	intptr_t dc = (intptr_t)dcAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)SwapBuffers(dc);
	saveLastError();
	return __result;
}

EXTERN_C_EXIT
