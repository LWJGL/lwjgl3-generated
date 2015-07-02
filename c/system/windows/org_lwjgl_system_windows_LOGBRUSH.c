/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "WindowsLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_LOGBRUSH_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(LOGBRUSH, lbStyle);
	buffer[1] = (jint)offsetof(LOGBRUSH, lbColor);
	buffer[2] = (jint)offsetof(LOGBRUSH, lbHatch);

	return sizeof(LOGBRUSH);
}

EXTERN_C_EXIT
