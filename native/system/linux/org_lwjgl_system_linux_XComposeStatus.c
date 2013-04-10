/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <X11/Xutil.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XComposeStatus_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XComposeStatus, compose_ptr));
	buffer[1] = (jint)(offsetof(XComposeStatus, chars_matched));

	return sizeof(XComposeStatus);
}