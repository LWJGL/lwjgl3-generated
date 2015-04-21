/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XMotionEvent_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(XMotionEvent, type);
	buffer[1] = (jint)offsetof(XMotionEvent, serial);
	buffer[2] = (jint)offsetof(XMotionEvent, send_event);
	buffer[3] = (jint)offsetof(XMotionEvent, display);
	buffer[4] = (jint)offsetof(XMotionEvent, window);
	buffer[5] = (jint)offsetof(XMotionEvent, root);
	buffer[6] = (jint)offsetof(XMotionEvent, subwindow);
	buffer[7] = (jint)offsetof(XMotionEvent, time);
	buffer[8] = (jint)offsetof(XMotionEvent, x);
	buffer[9] = (jint)offsetof(XMotionEvent, y);
	buffer[10] = (jint)offsetof(XMotionEvent, x_root);
	buffer[11] = (jint)offsetof(XMotionEvent, y_root);
	buffer[12] = (jint)offsetof(XMotionEvent, state);
	buffer[13] = (jint)offsetof(XMotionEvent, is_hint);
	buffer[14] = (jint)offsetof(XMotionEvent, same_screen);

	return sizeof(XMotionEvent);
}

EXTERN_C_EXIT
