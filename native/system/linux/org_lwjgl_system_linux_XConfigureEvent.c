/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XConfigureEvent_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(XConfigureEvent, type));
	buffer[1] = (jint)(offsetof(XConfigureEvent, serial));
	buffer[2] = (jint)(offsetof(XConfigureEvent, send_event));
	buffer[3] = (jint)(offsetof(XConfigureEvent, display));
	buffer[4] = (jint)(offsetof(XConfigureEvent, event));
	buffer[5] = (jint)(offsetof(XConfigureEvent, window));
	buffer[6] = (jint)(offsetof(XConfigureEvent, x));
	buffer[7] = (jint)(offsetof(XConfigureEvent, y));
	buffer[8] = (jint)(offsetof(XConfigureEvent, width));
	buffer[9] = (jint)(offsetof(XConfigureEvent, height));
	buffer[10] = (jint)(offsetof(XConfigureEvent, border_width));
	buffer[11] = (jint)(offsetof(XConfigureEvent, above));
	buffer[12] = (jint)(offsetof(XConfigureEvent, override_redirect));

	return sizeof(XConfigureEvent);
}

EXTERN_C_EXIT
