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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRDistortionVertex_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrDistortionVertex, ScreenPosNDC);
	buffer[1] = (jint)offsetof(ovrDistortionVertex, TimeWarpFactor);
	buffer[2] = (jint)offsetof(ovrDistortionVertex, VignetteFactor);
	buffer[3] = (jint)offsetof(ovrDistortionVertex, TanEyeAnglesR);
	buffer[4] = (jint)offsetof(ovrDistortionVertex, TanEyeAnglesG);
	buffer[5] = (jint)offsetof(ovrDistortionVertex, TanEyeAnglesB);

	return sizeof(ovrDistortionVertex);
}

EXTERN_C_EXIT
