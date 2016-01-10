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

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_windows_User32_nRegisterClassEx(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong wndClassExAddress) {
	RegisterClassExPROC RegisterClassEx = (RegisterClassExPROC)(intptr_t)__functionAddress;
	const WNDCLASSEX *wndClassEx = (const WNDCLASSEX *)(intptr_t)wndClassExAddress;
	jshort __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jshort)RegisterClassExW(wndClassEx);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nUnregisterClass(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong classNameAddress, jlong instanceAddress) {
	UnregisterClassPROC UnregisterClass = (UnregisterClassPROC)(intptr_t)__functionAddress;
	LPCTSTR className = (LPCTSTR)(intptr_t)classNameAddress;
	HINSTANCE instance = (HINSTANCE)(intptr_t)instanceAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)UnregisterClassW(className, instance);
	saveLastError();
	return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nCreateWindowEx(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint exStyle, jlong classNameAddress, jlong windowNameAddress, jint style, jint x, jint y, jint width, jint height, jlong parentAddress, jlong menuAddress, jlong instanceAddress, jlong paramAddress) {
	CreateWindowExPROC CreateWindowEx = (CreateWindowExPROC)(intptr_t)__functionAddress;
	LPCTSTR className = (LPCTSTR)(intptr_t)classNameAddress;
	LPCTSTR windowName = (LPCTSTR)(intptr_t)windowNameAddress;
	HWND parent = (HWND)(intptr_t)parentAddress;
	HMENU menu = (HMENU)(intptr_t)menuAddress;
	HINSTANCE instance = (HINSTANCE)(intptr_t)instanceAddress;
	LPVOID param = (LPVOID)(intptr_t)paramAddress;
	jlong __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jlong)(intptr_t)CreateWindowExW(exStyle, className, windowName, style, x, y, width, height, parent, menu, instance, param);
	saveLastError();
	return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nDestroyWindow(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong windowAddress) {
	DestroyWindowPROC DestroyWindow = (DestroyWindowPROC)(intptr_t)__functionAddress;
	HWND window = (HWND)(intptr_t)windowAddress;
	jint __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)DestroyWindow(window);
	saveLastError();
	return __result;
}

EXTERN_C_EXIT
