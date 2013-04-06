/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "WindowsLWJGL.h"

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinGDI_GetStockObject(JNIEnv *__env, jclass clazz, jint object) {
	return (jlong)(intptr_t)GetStockObject(object);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nEnumObjects(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint objectType, jlong objectFuncAddress, jlong param) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	GOBJENUMPROC objectFunc = (GOBJENUMPROC)(intptr_t)objectFuncAddress;
	return (jint)EnumObjects(hdc, objectType, objectFunc, (LPARAM)param);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinGDI_nSelectObject(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong objectAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	HGDIOBJ object = (HGDIOBJ)(intptr_t)objectAddress;
	return (jlong)(intptr_t)SelectObject(hdc, object);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinGDI_nGetCurrentObject(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint objectType) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jlong)(intptr_t)GetCurrentObject(hdc, objectType);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nGetObjectType(JNIEnv *__env, jclass clazz, jlong objectAddress) {
	HGDIOBJ object = (HGDIOBJ)(intptr_t)objectAddress;
	return (jint)GetObjectType(object);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nDeleteObject(JNIEnv *__env, jclass clazz, jlong objectAddress) {
	HGDIOBJ object = (HGDIOBJ)(intptr_t)objectAddress;
	return (jint)DeleteObject(object);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinGDI_nCreateDC(JNIEnv *__env, jclass clazz, jlong lpszDriverAddress, jlong lpszDeviceAddress, jlong lpszOutputAddress, jlong lpInitDataAddress) {
	LPCTSTR lpszDriver = (LPCTSTR)(intptr_t)lpszDriverAddress;
	LPCTSTR lpszDevice = (LPCTSTR)(intptr_t)lpszDeviceAddress;
	LPCTSTR lpszOutput = (LPCTSTR)(intptr_t)lpszOutputAddress;
	const DEVMODE *lpInitData = (const DEVMODE *)(intptr_t)lpInitDataAddress;
	return (jlong)(intptr_t)CreateDC(lpszDriver, lpszDevice, lpszOutput, lpInitData);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinGDI_nCreateCompatibleDC(JNIEnv *__env, jclass clazz, jlong hdcAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jlong)(intptr_t)CreateCompatibleDC(hdc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nDeleteDC(JNIEnv *__env, jclass clazz, jlong hdcAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jint)DeleteDC(hdc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nCancelDC(JNIEnv *__env, jclass clazz, jlong hdcAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jint)CancelDC(hdc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nSaveDC(JNIEnv *__env, jclass clazz, jlong hdcAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jint)SaveDC(hdc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nRestoreDC(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint savedDC) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jint)RestoreDC(hdc, savedDC);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nGetDCOrgEx(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong pointAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	LPPOINT point = (LPPOINT)(intptr_t)pointAddress;
	return (jint)GetDCOrgEx(hdc, point);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nGetDeviceCaps(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint index) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jint)GetDeviceCaps(hdc, index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nGetDeviceGammaRamp(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong lpRampAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	LPVOID lpRamp = (LPVOID)(intptr_t)lpRampAddress;
	return (jint)GetDeviceGammaRamp(hdc, lpRamp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nSetDeviceGammaRamp(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong lpRampAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	LPVOID lpRamp = (LPVOID)(intptr_t)lpRampAddress;
	return (jint)SetDeviceGammaRamp(hdc, lpRamp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nChoosePixelFormat(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong pixelFormatDescriptorAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	const PIXELFORMATDESCRIPTOR *pixelFormatDescriptor = (const PIXELFORMATDESCRIPTOR *)(intptr_t)pixelFormatDescriptorAddress;
	return (jint)ChoosePixelFormat(hdc, pixelFormatDescriptor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nDescribePixelFormat(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint pixelFormat, jint bytes, jlong pixelFormatDescriptorAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	LPPIXELFORMATDESCRIPTOR pixelFormatDescriptor = (LPPIXELFORMATDESCRIPTOR)(intptr_t)pixelFormatDescriptorAddress;
	return (jint)DescribePixelFormat(hdc, pixelFormat, bytes, pixelFormatDescriptor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nGetPixelFormat(JNIEnv *__env, jclass clazz, jlong hdcAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jint)GetPixelFormat(hdc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nSetPixelFormat(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint pixelFormat, jlong pixelFormatDescriptorAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	const PIXELFORMATDESCRIPTOR *pixelFormatDescriptor = (const PIXELFORMATDESCRIPTOR *)(intptr_t)pixelFormatDescriptorAddress;
	return (jint)SetPixelFormat(hdc, pixelFormat, pixelFormatDescriptor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinGDI_nSwapBuffers(JNIEnv *__env, jclass clazz, jlong dcAddress) {
	HDC dc = (HDC)(intptr_t)dcAddress;
	return (jint)SwapBuffers(dc);
}