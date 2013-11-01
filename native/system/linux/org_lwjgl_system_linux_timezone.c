/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <linux/time.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_timezone_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(struct timezone, tz_minuteswest));
	buffer[1] = (jint)(offsetof(struct timezone, tz_dsttime));

	return sizeof(struct timezone);
}
