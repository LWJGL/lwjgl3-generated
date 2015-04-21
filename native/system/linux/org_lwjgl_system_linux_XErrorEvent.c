/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XErrorEvent_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(XErrorEvent, type);
	buffer[1] = (jint)offsetof(XErrorEvent, display);
	buffer[2] = (jint)offsetof(XErrorEvent, serial);
	buffer[3] = (jint)offsetof(XErrorEvent, error_code);
	buffer[4] = (jint)offsetof(XErrorEvent, request_code);
	buffer[5] = (jint)offsetof(XErrorEvent, minor_code);
	buffer[6] = (jint)offsetof(XErrorEvent, resourceid);

	return sizeof(XErrorEvent);
}

EXTERN_C_EXIT
