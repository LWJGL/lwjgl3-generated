/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "WindowsLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_RECT_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(RECT, left));
	buffer[1] = (jint)(offsetof(RECT, top));
	buffer[2] = (jint)(offsetof(RECT, right));
	buffer[3] = (jint)(offsetof(RECT, bottom));

	return sizeof(RECT);
}

EXTERN_C_EXIT
