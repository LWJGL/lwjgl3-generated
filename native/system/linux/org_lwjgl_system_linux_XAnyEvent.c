/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XAnyEvent_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XAnyEvent, type));
	buffer[1] = (jint)(offsetof(XAnyEvent, serial));
	buffer[2] = (jint)(offsetof(XAnyEvent, send_event));
	buffer[3] = (jint)(offsetof(XAnyEvent, display));
	buffer[4] = (jint)(offsetof(XAnyEvent, window));

	return sizeof(XAnyEvent);
}