/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XSelectionEvent_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(XSelectionEvent, type);
	buffer[1] = (jint)offsetof(XSelectionEvent, serial);
	buffer[2] = (jint)offsetof(XSelectionEvent, send_event);
	buffer[3] = (jint)offsetof(XSelectionEvent, display);
	buffer[4] = (jint)offsetof(XSelectionEvent, requestor);
	buffer[5] = (jint)offsetof(XSelectionEvent, selection);
	buffer[6] = (jint)offsetof(XSelectionEvent, target);
	buffer[7] = (jint)offsetof(XSelectionEvent, property);
	buffer[8] = (jint)offsetof(XSelectionEvent, time);

	return sizeof(XSelectionEvent);
}

EXTERN_C_EXIT
