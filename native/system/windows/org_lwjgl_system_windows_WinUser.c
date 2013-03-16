/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "WindowsLWJGL.h"

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_windows_WinUser_nRegisterClassEx(JNIEnv *__env, jclass clazz, jlong wndClassExAddress) {
	const WNDCLASSEX *wndClassEx = (const WNDCLASSEX *)(intptr_t)wndClassExAddress;
	return (jshort)RegisterClassEx(wndClassEx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nUnregisterClass(JNIEnv *__env, jclass clazz, jlong classNameAddress, jlong instanceAddress) {
	LPCTSTR className = (LPCTSTR)(intptr_t)classNameAddress;
	HINSTANCE instance = (HINSTANCE)(intptr_t)instanceAddress;
	return (jint)UnregisterClass(className, instance);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nGetClassInfoEx(JNIEnv *__env, jclass clazz, jlong instanceAddress, jlong classNameAddress, jlong classExAddress) {
	HINSTANCE instance = (HINSTANCE)(intptr_t)instanceAddress;
	LPCTSTR className = (LPCTSTR)(intptr_t)classNameAddress;
	LPWNDCLASSEX classEx = (LPWNDCLASSEX)(intptr_t)classExAddress;
	return (jint)GetClassInfoEx(instance, className, classEx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinUser_nGetClassLongPtr(JNIEnv *__env, jclass clazz, jlong windowAddress, jint index) {
	HWND window = (HWND)(intptr_t)windowAddress;
	return (jlong)GetClassLongPtr(window, index);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinUser_nSetClassLongPtr(JNIEnv *__env, jclass clazz, jlong windowAddress, jint index, jlong newLong) {
	HWND window = (HWND)(intptr_t)windowAddress;
	return (jlong)SetClassLongPtr(window, index, (LONG_PTR)newLong);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinUser_nLoadIcon(JNIEnv *__env, jclass clazz, jlong instanceAddress, jlong iconNameAddress) {
	HINSTANCE instance = (HINSTANCE)(intptr_t)instanceAddress;
	LPCTSTR iconName = (LPCTSTR)(intptr_t)iconNameAddress;
	return (jlong)(intptr_t)LoadIcon(instance, iconName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinUser_nLoadCursor(JNIEnv *__env, jclass clazz, jlong instanceAddress, jlong cursorNameAddress) {
	HINSTANCE instance = (HINSTANCE)(intptr_t)instanceAddress;
	LPCTSTR cursorName = (LPCTSTR)(intptr_t)cursorNameAddress;
	return (jlong)(intptr_t)LoadCursor(instance, cursorName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_GetSystemMetrics(JNIEnv *__env, jclass clazz, jint index) {
	return (jint)GetSystemMetrics(index);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinUser_nCreateWindowEx(JNIEnv *__env, jclass clazz, jint exStyle, jlong classNameAddress, jlong windowNameAddress, jint style, jint x, jint y, jint width, jint height, jlong parentAddress, jlong menuAddress, jlong instanceAddress, jlong paramAddress) {
	LPCTSTR className = (LPCTSTR)(intptr_t)classNameAddress;
	LPCTSTR windowName = (LPCTSTR)(intptr_t)windowNameAddress;
	HWND parent = (HWND)(intptr_t)parentAddress;
	HMENU menu = (HMENU)(intptr_t)menuAddress;
	HINSTANCE instance = (HINSTANCE)(intptr_t)instanceAddress;
	LPVOID param = (LPVOID)(intptr_t)paramAddress;
	return (jlong)(intptr_t)CreateWindowEx(exStyle, className, windowName, style, x, y, width, height, parent, menu, instance, param);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nDestroyWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	HWND window = (HWND)(intptr_t)windowAddress;
	return (jint)DestroyWindow(window);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nShowWindow(JNIEnv *__env, jclass clazz, jlong windowAddress, jint cmdShow) {
	HWND window = (HWND)(intptr_t)windowAddress;
	return (jint)ShowWindow(window, cmdShow);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nUpdateWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	HWND window = (HWND)(intptr_t)windowAddress;
	return (jint)UpdateWindow(window);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nSetWindowPos(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong insertAfterAddress, jint x, jint y, jint width, jint height, jint flags) {
	HWND window = (HWND)(intptr_t)windowAddress;
	HWND insertAfter = (HWND)(intptr_t)insertAfterAddress;
	return (jint)SetWindowPos(window, insertAfter, x, y, width, height, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nGetMessage(JNIEnv *__env, jclass clazz, jlong msgAddress, jlong windowAddress, jint msgFilterMin, jint msgFilterMax) {
	LPMSG msg = (LPMSG)(intptr_t)msgAddress;
	HWND window = (HWND)(intptr_t)windowAddress;
	return (jint)GetMessage(msg, window, msgFilterMin, msgFilterMax);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nPeekMessage(JNIEnv *__env, jclass clazz, jlong msgAddress, jlong windowAddress, jint msgFilterMin, jint msgFilterMax, jint removeMsg) {
	LPMSG msg = (LPMSG)(intptr_t)msgAddress;
	HWND window = (HWND)(intptr_t)windowAddress;
	return (jint)PeekMessage(msg, window, msgFilterMin, msgFilterMax, removeMsg);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nTranslateMessage(JNIEnv *__env, jclass clazz, jlong msgAddress) {
	const MSG *msg = (const MSG *)(intptr_t)msgAddress;
	return (jint)TranslateMessage(msg);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinUser_nDispatchMessage(JNIEnv *__env, jclass clazz, jlong msgAddress) {
	const MSG *msg = (const MSG *)(intptr_t)msgAddress;
	return (jlong)(intptr_t)DispatchMessage(msg);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_GetQueueStatus(JNIEnv *__env, jclass clazz, jint flags) {
	return (jint)GetQueueStatus(flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_GetMessageTime(JNIEnv *__env, jclass clazz) {
	return (jint)GetMessageTime();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinUser_nDefWindowProc(JNIEnv *__env, jclass clazz, jlong windowAddress, jint msg, jlong wParam, jlong lParam) {
	HWND window = (HWND)(intptr_t)windowAddress;
	return (jlong)(intptr_t)DefWindowProc(window, msg, (WPARAM)wParam, (LPARAM)lParam);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinUser_nGetDC(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	HWND window = (HWND)(intptr_t)windowAddress;
	return (jlong)(intptr_t)GetDC(window);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nReleaseDC(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong hdcAddress) {
	HWND window = (HWND)(intptr_t)windowAddress;
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	return (jint)ReleaseDC(window, hdc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nEnumDisplayDevices(JNIEnv *__env, jclass clazz, jlong deviceAddress, jint devNum, jlong displayDeviceAddress, jint flags) {
	LPCTSTR device = (LPCTSTR)(intptr_t)deviceAddress;
	PDISPLAY_DEVICE displayDevice = (PDISPLAY_DEVICE)(intptr_t)displayDeviceAddress;
	return (jint)EnumDisplayDevices(device, devNum, displayDevice, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nEnumDisplaySettings(JNIEnv *__env, jclass clazz, jlong deviceNameAddress, jint modeNum, jlong devModeAddress) {
	LPCTSTR deviceName = (LPCTSTR)(intptr_t)deviceNameAddress;
	DEVMODE *devMode = (DEVMODE *)(intptr_t)devModeAddress;
	return (jint)EnumDisplaySettings(deviceName, modeNum, devMode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nEnumDisplaySettingsEx(JNIEnv *__env, jclass clazz, jlong deviceNameAddress, jint modeNum, jlong devModeAddress, jint flags) {
	LPCTSTR deviceName = (LPCTSTR)(intptr_t)deviceNameAddress;
	DEVMODE *devMode = (DEVMODE *)(intptr_t)devModeAddress;
	return (jint)EnumDisplaySettingsEx(deviceName, modeNum, devMode, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nChangeDisplaySettings(JNIEnv *__env, jclass clazz, jlong devModeAddress, jint flags) {
	DEVMODE *devMode = (DEVMODE *)(intptr_t)devModeAddress;
	return (jint)ChangeDisplaySettings(devMode, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinUser_nChangeDisplaySettingsEx(JNIEnv *__env, jclass clazz, jlong deviceNameAddress, jlong devModeAddress, jlong windowAddress, jint flags, jlong paramAddress) {
	LPCTSTR deviceName = (LPCTSTR)(intptr_t)deviceNameAddress;
	DEVMODE *devMode = (DEVMODE *)(intptr_t)devModeAddress;
	HWND window = (HWND)(intptr_t)windowAddress;
	LPVOID param = (LPVOID)(intptr_t)paramAddress;
	return (jint)ChangeDisplaySettingsEx(deviceName, devMode, window, flags, param);
}