/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "WindowsLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_TRACKMOUSEEVENT_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(TRACKMOUSEEVENT, cbSize);
	buffer[1] = (jint)offsetof(TRACKMOUSEEVENT, dwFlags);
	buffer[2] = (jint)offsetof(TRACKMOUSEEVENT, hwndTrack);
	buffer[3] = (jint)offsetof(TRACKMOUSEEVENT, dwHoverTime);

	return sizeof(TRACKMOUSEEVENT);
}

EXTERN_C_EXIT
