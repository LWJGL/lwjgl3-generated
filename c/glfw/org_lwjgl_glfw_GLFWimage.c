/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <stddef.h>
#include "common_tools.h"
#include "glfw3.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_glfw_GLFWimage_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(GLFWimage, width);
	buffer[1] = (jint)offsetof(GLFWimage, height);
	buffer[2] = (jint)offsetof(GLFWimage, pixels);

	return sizeof(GLFWimage);
}

EXTERN_C_EXIT
