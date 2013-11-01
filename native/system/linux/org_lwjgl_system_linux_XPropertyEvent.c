/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XPropertyEvent_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(XPropertyEvent, type));
	buffer[1] = (jint)(offsetof(XPropertyEvent, serial));
	buffer[2] = (jint)(offsetof(XPropertyEvent, send_event));
	buffer[3] = (jint)(offsetof(XPropertyEvent, display));
	buffer[4] = (jint)(offsetof(XPropertyEvent, window));
	buffer[5] = (jint)(offsetof(XPropertyEvent, atom));
	buffer[6] = (jint)(offsetof(XPropertyEvent, time));
	buffer[7] = (jint)(offsetof(XPropertyEvent, state));

	return sizeof(XPropertyEvent);
}
