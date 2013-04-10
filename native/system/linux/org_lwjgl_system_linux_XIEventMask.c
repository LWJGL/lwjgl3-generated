/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <X11/extensions/XInput2.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XIEventMask_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XIEventMask, deviceid));
	buffer[1] = (jint)(offsetof(XIEventMask, mask));
	buffer[2] = (jint)(offsetof(XIEventMask, mask_len));

	return sizeof(XIEventMask);
}