/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <stddef.h>
#include "common_tools.h"
DISABLE_WARNINGS()
#include "OVR_CAPI.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRTrackingState_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrTrackingState, HeadPose);
	buffer[1] = (jint)offsetof(ovrTrackingState, CameraPose);
	buffer[2] = (jint)offsetof(ovrTrackingState, LeveledCameraPose);
	buffer[3] = (jint)offsetof(ovrTrackingState, HandPoses);
	buffer[4] = (jint)offsetof(ovrTrackingState, RawSensorData);
	buffer[5] = (jint)offsetof(ovrTrackingState, StatusFlags);
	buffer[6] = (jint)offsetof(ovrTrackingState, HandStatusFlags);
	buffer[7] = (jint)offsetof(ovrTrackingState, LastCameraFrameCounter);

	return sizeof(ovrTrackingState);
}

EXTERN_C_EXIT
