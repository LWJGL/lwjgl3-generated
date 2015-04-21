/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
DISABLE_WARNINGS()
#include "OVR_CAPI_0_5_0.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRFrameTiming_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrFrameTiming, DeltaSeconds);
	buffer[1] = (jint)offsetof(ovrFrameTiming, ThisFrameSeconds);
	buffer[2] = (jint)offsetof(ovrFrameTiming, TimewarpPointSeconds);
	buffer[3] = (jint)offsetof(ovrFrameTiming, NextFrameSeconds);
	buffer[4] = (jint)offsetof(ovrFrameTiming, ScanoutMidpointSeconds);
	buffer[5] = (jint)offsetof(ovrFrameTiming, EyeScanoutSeconds);

	return sizeof(ovrFrameTiming);
}

EXTERN_C_EXIT
