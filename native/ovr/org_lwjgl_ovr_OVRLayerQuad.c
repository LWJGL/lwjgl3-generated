/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
DISABLE_WARNINGS()
#include "OVR_CAPI_0_6_0.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRLayerQuad_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrLayerQuad, Header);
	buffer[1] = (jint)offsetof(ovrLayerQuad, ColorTexture);
	buffer[2] = (jint)offsetof(ovrLayerQuad, Viewport);
	buffer[3] = (jint)offsetof(ovrLayerQuad, QuadPoseCenter);
	buffer[4] = (jint)offsetof(ovrLayerQuad, QuadSize);

	return sizeof(ovrLayerQuad);
}

EXTERN_C_EXIT
