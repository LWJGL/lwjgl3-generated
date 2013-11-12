/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XSelectionRequestEvent_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(XSelectionRequestEvent, type));
	buffer[1] = (jint)(offsetof(XSelectionRequestEvent, serial));
	buffer[2] = (jint)(offsetof(XSelectionRequestEvent, send_event));
	buffer[3] = (jint)(offsetof(XSelectionRequestEvent, display));
	buffer[4] = (jint)(offsetof(XSelectionRequestEvent, owner));
	buffer[5] = (jint)(offsetof(XSelectionRequestEvent, requestor));
	buffer[6] = (jint)(offsetof(XSelectionRequestEvent, selection));
	buffer[7] = (jint)(offsetof(XSelectionRequestEvent, target));
	buffer[8] = (jint)(offsetof(XSelectionRequestEvent, property));
	buffer[9] = (jint)(offsetof(XSelectionRequestEvent, time));

	return sizeof(XSelectionRequestEvent);
}

EXTERN_C_EXIT
