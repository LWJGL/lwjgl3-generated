/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_nGetVersionEx(JNIEnv *__env, jclass clazz, jlong versionInfoAddress) {
	LPOSVERSIONINFO versionInfo = (LPOSVERSIONINFO)(intptr_t)versionInfoAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)GetVersionEx(versionInfo);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_GetLastError(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)GetLastError();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGetModuleHandle(JNIEnv *__env, jclass clazz, jlong moduleNameAddress) {
	LPCTSTR moduleName = (LPCTSTR)(intptr_t)moduleNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)GetModuleHandle(moduleName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nLoadLibrary(JNIEnv *__env, jclass clazz, jlong nameAddress) {
	LPCTSTR name = (LPCTSTR)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)LoadLibrary(name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGetProcAddress(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong nameAddress) {
	HMODULE handle = (HMODULE)(intptr_t)handleAddress;
	LPCSTR name = (LPCSTR)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)GetProcAddress(handle, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_nFreeLibrary(JNIEnv *__env, jclass clazz, jlong handleAddress) {
	HMODULE handle = (HMODULE)(intptr_t)handleAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)FreeLibrary(handle);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_nQueryPerformanceFrequency(JNIEnv *__env, jclass clazz, jlong frequencyAddress) {
	LARGE_INTEGER *frequency = (LARGE_INTEGER *)(intptr_t)frequencyAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)QueryPerformanceFrequency(frequency);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_nQueryPerformanceCounter(JNIEnv *__env, jclass clazz, jlong frequencyAddress) {
	LARGE_INTEGER *frequency = (LARGE_INTEGER *)(intptr_t)frequencyAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)QueryPerformanceCounter(frequency);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_GlobalAlloc(JNIEnv *__env, jclass clazz, jint flags, jlong bytes) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)GlobalAlloc(flags, (SIZE_T)bytes);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGlobalLock(JNIEnv *__env, jclass clazz, jlong hMemAddress) {
	HGLOBAL hMem = (HGLOBAL)(intptr_t)hMemAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)GlobalLock(hMem);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_nGlobalUnlock(JNIEnv *__env, jclass clazz, jlong hMemAddress) {
	HGLOBAL hMem = (HGLOBAL)(intptr_t)hMemAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)GlobalUnlock(hMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGlobalFree(JNIEnv *__env, jclass clazz, jlong hMemAddress) {
	HGLOBAL hMem = (HGLOBAL)(intptr_t)hMemAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)GlobalFree(hMem);
}
