/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "WindowsLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_OSVERSIONINFOEX_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(OSVERSIONINFOEX, dwOSVersionInfoSize));
	buffer[1] = (jint)(offsetof(OSVERSIONINFOEX, dwMajorVersion));
	buffer[2] = (jint)(offsetof(OSVERSIONINFOEX, dwMinorVersion));
	buffer[3] = (jint)(offsetof(OSVERSIONINFOEX, dwBuildNumber));
	buffer[4] = (jint)(offsetof(OSVERSIONINFOEX, dwPlatformId));
	buffer[5] = (jint)(offsetof(OSVERSIONINFOEX, szCSDVersion));
	buffer[6] = (jint)(offsetof(OSVERSIONINFOEX, wServicePackMajor));
	buffer[7] = (jint)(offsetof(OSVERSIONINFOEX, wServicePackMinor));
	buffer[8] = (jint)(offsetof(OSVERSIONINFOEX, wSuiteMask));
	buffer[9] = (jint)(offsetof(OSVERSIONINFOEX, wProductType));

	return sizeof(OSVERSIONINFOEX);
}

EXTERN_C_EXIT
