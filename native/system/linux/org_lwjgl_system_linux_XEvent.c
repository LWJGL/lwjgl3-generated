/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XEvent_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XEvent, type));
	buffer[1] = (jint)(offsetof(XEvent, xkey));
	buffer[2] = (jint)(offsetof(XEvent, xerror));
	buffer[3] = (jint)(offsetof(XEvent, pad));

	return sizeof(XEvent);
}