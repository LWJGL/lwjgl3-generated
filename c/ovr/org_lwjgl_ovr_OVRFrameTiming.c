/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
DISABLE_WARNINGS()
#include "OVR_CAPI.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRFrameTiming_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrFrameTiming, DisplayMidpointSeconds);
	buffer[1] = (jint)offsetof(ovrFrameTiming, FrameIntervalSeconds);
	buffer[2] = (jint)offsetof(ovrFrameTiming, AppFrameIndex);
	buffer[3] = (jint)offsetof(ovrFrameTiming, DisplayFrameIndex);

	return sizeof(ovrFrameTiming);
}

EXTERN_C_EXIT
