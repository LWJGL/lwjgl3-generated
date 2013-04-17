/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XClientMessageEvent_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XClientMessageEvent, type));
	buffer[1] = (jint)(offsetof(XClientMessageEvent, serial));
	buffer[2] = (jint)(offsetof(XClientMessageEvent, send_event));
	buffer[3] = (jint)(offsetof(XClientMessageEvent, display));
	buffer[4] = (jint)(offsetof(XClientMessageEvent, window));
	buffer[5] = (jint)(offsetof(XClientMessageEvent, message_type));
	buffer[6] = (jint)(offsetof(XClientMessageEvent, format));
	buffer[7] = (jint)(offsetof(XClientMessageEvent, data));
	buffer[8] = (jint)(offsetof(XClientMessageEvent, data.b));
	buffer[9] = (jint)(offsetof(XClientMessageEvent, data.s));
	buffer[10] = (jint)(offsetof(XClientMessageEvent, data.l));

	return sizeof(XClientMessageEvent);
}