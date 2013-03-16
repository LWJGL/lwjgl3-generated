/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "WindowsLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_MSG_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(MSG, hwnd));
	buffer[1] = (jint)(offsetof(MSG, message));
	buffer[2] = (jint)(offsetof(MSG, wParam));
	buffer[3] = (jint)(offsetof(MSG, lParam));
	buffer[4] = (jint)(offsetof(MSG, time));
	buffer[5] = (jint)(offsetof(MSG, pt));

	return sizeof(MSG);
}