/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XButtonEvent_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XButtonEvent, type));
	buffer[1] = (jint)(offsetof(XButtonEvent, serial));
	buffer[2] = (jint)(offsetof(XButtonEvent, send_event));
	buffer[3] = (jint)(offsetof(XButtonEvent, display));
	buffer[4] = (jint)(offsetof(XButtonEvent, window));
	buffer[5] = (jint)(offsetof(XButtonEvent, root));
	buffer[6] = (jint)(offsetof(XButtonEvent, subwindow));
	buffer[7] = (jint)(offsetof(XButtonEvent, time));
	buffer[8] = (jint)(offsetof(XButtonEvent, x));
	buffer[9] = (jint)(offsetof(XButtonEvent, y));
	buffer[10] = (jint)(offsetof(XButtonEvent, x_root));
	buffer[11] = (jint)(offsetof(XButtonEvent, y_root));
	buffer[12] = (jint)(offsetof(XButtonEvent, state));
	buffer[13] = (jint)(offsetof(XButtonEvent, button));
	buffer[14] = (jint)(offsetof(XButtonEvent, same_screen));

	return sizeof(XButtonEvent);
}