/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Visual_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(Visual, visualid));
	buffer[1] = (jint)(offsetof(Visual, class));
	buffer[2] = (jint)(offsetof(Visual, red_mask));
	buffer[3] = (jint)(offsetof(Visual, green_mask));
	buffer[4] = (jint)(offsetof(Visual, blue_mask));
	buffer[5] = (jint)(offsetof(Visual, bits_per_rgb));
	buffer[6] = (jint)(offsetof(Visual, map_entries));

	return sizeof(Visual);
}

EXTERN_C_EXIT
