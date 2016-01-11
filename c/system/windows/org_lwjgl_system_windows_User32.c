/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

typedef ATOM (APIENTRY *RegisterClassExPROC) (const WNDCLASSEX *);
typedef BOOL (APIENTRY *UnregisterClassPROC) (LPCTSTR, HINSTANCE);
typedef HWND (APIENTRY *CreateWindowExPROC) (DWORD, LPCTSTR, LPCTSTR, DWORD, int, int, int, int, HWND, HMENU, HINSTANCE, LPVOID);
typedef BOOL (APIENTRY *DestroyWindowPROC) (HWND);

EXTERN_C_ENTER

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_windows_User32_nRegisterClassEx(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong lpwcxAddress) {
	RegisterClassExPROC RegisterClassEx = (RegisterClassExPROC)(intptr_t)__functionAddress;
	const WNDCLASSEX *lpwcx = (const WNDCLASSEX *)(intptr_t)lpwcxAddress;
	jshort __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jshort)RegisterClassExW(lpwcx);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nUnregisterClass(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong lpClassNameAddress, jlong hInstanceAddress) {
	UnregisterClassPROC UnregisterClass = (UnregisterClassPROC)(intptr_t)__functionAddress;
	LPCTSTR lpClassName = (LPCTSTR)(intptr_t)lpClassNameAddress;
	HINSTANCE hInstance = (HINSTANCE)(intptr_t)hInstanceAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)UnregisterClassW(lpClassName, hInstance);
	saveLastError();
	return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nCreateWindowEx(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint dwExStyle, jlong lpClassNameAddress, jlong lpWindowNameAddress, jint dwStyle, jint x, jint y, jint nWidth, jint nHeight, jlong hWndParentAddress, jlong hMenuAddress, jlong hInstanceAddress, jlong lpParamAddress) {
	CreateWindowExPROC CreateWindowEx = (CreateWindowExPROC)(intptr_t)__functionAddress;
	LPCTSTR lpClassName = (LPCTSTR)(intptr_t)lpClassNameAddress;
	LPCTSTR lpWindowName = (LPCTSTR)(intptr_t)lpWindowNameAddress;
	HWND hWndParent = (HWND)(intptr_t)hWndParentAddress;
	HMENU hMenu = (HMENU)(intptr_t)hMenuAddress;
	HINSTANCE hInstance = (HINSTANCE)(intptr_t)hInstanceAddress;
	LPVOID lpParam = (LPVOID)(intptr_t)lpParamAddress;
	jlong __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jlong)(intptr_t)CreateWindowExW(dwExStyle, lpClassName, lpWindowName, dwStyle, x, y, nWidth, nHeight, hWndParent, hMenu, hInstance, lpParam);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nDestroyWindow(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress) {
	DestroyWindowPROC DestroyWindow = (DestroyWindowPROC)(intptr_t)__functionAddress;
	HWND hWnd = (HWND)(intptr_t)hWndAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)DestroyWindow(hWnd);
	saveLastError();
	return __result;
}

EXTERN_C_EXIT
