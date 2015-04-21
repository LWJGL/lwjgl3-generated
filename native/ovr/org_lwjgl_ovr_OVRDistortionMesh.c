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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRDistortionMesh_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrDistortionMesh, pVertexData);
	buffer[1] = (jint)offsetof(ovrDistortionMesh, pIndexData);
	buffer[2] = (jint)offsetof(ovrDistortionMesh, VertexCount);
	buffer[3] = (jint)offsetof(ovrDistortionMesh, IndexCount);

	return sizeof(ovrDistortionMesh);
}

EXTERN_C_EXIT
