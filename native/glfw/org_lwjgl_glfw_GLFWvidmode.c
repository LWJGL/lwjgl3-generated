/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "glfw3.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_glfw_GLFWvidmode_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(GLFWvidmode, width));
	buffer[1] = (jint)(offsetof(GLFWvidmode, height));
	buffer[2] = (jint)(offsetof(GLFWvidmode, redBits));
	buffer[3] = (jint)(offsetof(GLFWvidmode, greenBits));
	buffer[4] = (jint)(offsetof(GLFWvidmode, blueBits));
	buffer[5] = (jint)(offsetof(GLFWvidmode, refreshRate));

	return sizeof(GLFWvidmode);
}

EXTERN_C_EXIT
