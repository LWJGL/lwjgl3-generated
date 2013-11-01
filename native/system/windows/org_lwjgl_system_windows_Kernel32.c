/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

typedef DWORD_PTR (APIENTRY *SetThreadAffinityMaskPROC) (HANDLE, DWORD_PTR);

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_Kernel32_nSetThreadAffinityMask(JNIEnv *__env, jclass clazz, jlong threadAddress, jlong threadAffinityMask, jlong __functionAddress) {
	HANDLE thread = (HANDLE)(intptr_t)threadAddress;
	SetThreadAffinityMaskPROC SetThreadAffinityMask = (SetThreadAffinityMaskPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)SetThreadAffinityMask(thread, (DWORD_PTR)threadAffinityMask);
}
