/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XKeyEvent_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XKeyEvent, type));
	buffer[1] = (jint)(offsetof(XKeyEvent, serial));
	buffer[2] = (jint)(offsetof(XKeyEvent, send_event));
	buffer[3] = (jint)(offsetof(XKeyEvent, display));
	buffer[4] = (jint)(offsetof(XKeyEvent, window));
	buffer[5] = (jint)(offsetof(XKeyEvent, root));
	buffer[6] = (jint)(offsetof(XKeyEvent, subwindow));
	buffer[7] = (jint)(offsetof(XKeyEvent, time));
	buffer[8] = (jint)(offsetof(XKeyEvent, x));
	buffer[9] = (jint)(offsetof(XKeyEvent, y));
	buffer[10] = (jint)(offsetof(XKeyEvent, x_root));
	buffer[11] = (jint)(offsetof(XKeyEvent, y_root));
	buffer[12] = (jint)(offsetof(XKeyEvent, state));
	buffer[13] = (jint)(offsetof(XKeyEvent, keycode));
	buffer[14] = (jint)(offsetof(XKeyEvent, same_screen));

	return sizeof(XKeyEvent);
}