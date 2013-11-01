/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "WindowsLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_DISPLAY_1DEVICE_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(DISPLAY_DEVICE, cb));
	buffer[1] = (jint)(offsetof(DISPLAY_DEVICE, DeviceName));
	buffer[2] = (jint)(offsetof(DISPLAY_DEVICE, DeviceString));
	buffer[3] = (jint)(offsetof(DISPLAY_DEVICE, StateFlags));
	buffer[4] = (jint)(offsetof(DISPLAY_DEVICE, DeviceID));
	buffer[5] = (jint)(offsetof(DISPLAY_DEVICE, DeviceKey));

	return sizeof(DISPLAY_DEVICE);
}
