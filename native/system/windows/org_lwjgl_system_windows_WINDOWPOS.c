/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "WindowsLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WINDOWPOS_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(WINDOWPOS, hwnd));
	buffer[1] = (jint)(offsetof(WINDOWPOS, hwndInsertAfter));
	buffer[2] = (jint)(offsetof(WINDOWPOS, x));
	buffer[3] = (jint)(offsetof(WINDOWPOS, y));
	buffer[4] = (jint)(offsetof(WINDOWPOS, cx));
	buffer[5] = (jint)(offsetof(WINDOWPOS, cy));
	buffer[6] = (jint)(offsetof(WINDOWPOS, flags));

	return sizeof(WINDOWPOS);
}