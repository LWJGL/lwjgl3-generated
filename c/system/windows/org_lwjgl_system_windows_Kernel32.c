/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_Kernel32_nSetThreadAffinityMask(JNIEnv *__env, jclass clazz, jlong threadAddress, jlong threadAffinityMask) {
	HANDLE thread = (HANDLE)(intptr_t)threadAddress;
	jlong __result;
	UNUSED_PARAMS(__env, clazz)
	__result = (jlong)SetThreadAffinityMask(thread, (DWORD_PTR)threadAffinityMask);
	saveLastError();
	return __result;
}

EXTERN_C_EXIT
