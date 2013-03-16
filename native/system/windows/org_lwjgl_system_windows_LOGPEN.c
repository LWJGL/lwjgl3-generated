/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "WindowsLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_LOGPEN_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(LOGPEN, lopnStyle));
	buffer[1] = (jint)(offsetof(LOGPEN, lopnWidth));
	buffer[2] = (jint)(offsetof(LOGPEN, lopnColor));

	return sizeof(LOGPEN);
}