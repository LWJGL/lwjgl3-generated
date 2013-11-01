/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "glfw3.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFWgammaramp_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(GLFWgammaramp, red));
	buffer[1] = (jint)(offsetof(GLFWgammaramp, green));
	buffer[2] = (jint)(offsetof(GLFWgammaramp, blue));
	buffer[3] = (jint)(offsetof(GLFWgammaramp, size));

	return sizeof(GLFWgammaramp);
}
