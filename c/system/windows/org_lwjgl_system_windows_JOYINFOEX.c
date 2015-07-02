/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "WindowsLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_JOYINFOEX_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(JOYINFOEX, dwSize);
	buffer[1] = (jint)offsetof(JOYINFOEX, dwFlags);
	buffer[2] = (jint)offsetof(JOYINFOEX, dwXpos);
	buffer[3] = (jint)offsetof(JOYINFOEX, dwYpos);
	buffer[4] = (jint)offsetof(JOYINFOEX, dwZpos);
	buffer[5] = (jint)offsetof(JOYINFOEX, dwRpos);
	buffer[6] = (jint)offsetof(JOYINFOEX, dwUpos);
	buffer[7] = (jint)offsetof(JOYINFOEX, dwVpos);
	buffer[8] = (jint)offsetof(JOYINFOEX, dwButtons);
	buffer[9] = (jint)offsetof(JOYINFOEX, dwButtonNumber);
	buffer[10] = (jint)offsetof(JOYINFOEX, dwPOV);
	buffer[11] = (jint)offsetof(JOYINFOEX, dwReserved1);
	buffer[12] = (jint)offsetof(JOYINFOEX, dwReserved2);

	return sizeof(JOYINFOEX);
}

EXTERN_C_EXIT
