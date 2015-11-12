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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRLayerEyeMatrix_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrLayerEyeMatrix, Header);
	buffer[1] = (jint)offsetof(ovrLayerEyeMatrix, ColorTexture);
	buffer[2] = (jint)offsetof(ovrLayerEyeMatrix, Viewport);
	buffer[3] = (jint)offsetof(ovrLayerEyeMatrix, RenderPose);
	buffer[4] = (jint)offsetof(ovrLayerEyeMatrix, Matrix);
	buffer[5] = (jint)offsetof(ovrLayerEyeMatrix, SensorSampleTime);

	return sizeof(ovrLayerEyeMatrix);
}

EXTERN_C_EXIT
