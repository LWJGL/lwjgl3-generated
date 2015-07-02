/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <linux/joystick.h>

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_JSEvent_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(struct js_event, time);
	buffer[1] = (jint)offsetof(struct js_event, value);
	buffer[2] = (jint)offsetof(struct js_event, type);
	buffer[3] = (jint)offsetof(struct js_event, number);

	return sizeof(struct js_event);
}

EXTERN_C_EXIT
