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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRLayerEyeFovDepth_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrLayerEyeFovDepth, Header);
	buffer[1] = (jint)offsetof(ovrLayerEyeFovDepth, ColorTexture);
	buffer[2] = (jint)offsetof(ovrLayerEyeFovDepth, Viewport);
	buffer[3] = (jint)offsetof(ovrLayerEyeFovDepth, Fov);
	buffer[4] = (jint)offsetof(ovrLayerEyeFovDepth, RenderPose);
	buffer[5] = (jint)offsetof(ovrLayerEyeFovDepth, DepthTexture);
	buffer[6] = (jint)offsetof(ovrLayerEyeFovDepth, ProjectionDesc);

	return sizeof(ovrLayerEyeFovDepth);
}

EXTERN_C_EXIT
