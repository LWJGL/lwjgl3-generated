/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XColor_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(XColor, pixel));
	buffer[1] = (jint)(offsetof(XColor, red));
	buffer[2] = (jint)(offsetof(XColor, green));
	buffer[3] = (jint)(offsetof(XColor, blue));
	buffer[4] = (jint)(offsetof(XColor, flags));
	buffer[5] = (jint)(offsetof(XColor, pad));

	return sizeof(XColor);
}

EXTERN_C_EXIT
