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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRLayerUnion_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrLayer_Union, Header);
	buffer[1] = (jint)offsetof(ovrLayer_Union, EyeFov);
	buffer[2] = (jint)offsetof(ovrLayer_Union, EyeFovDepth);
	buffer[3] = (jint)offsetof(ovrLayer_Union, Quad);
	buffer[4] = (jint)offsetof(ovrLayer_Union, Direct);

	return sizeof(ovrLayer_Union);
}

EXTERN_C_EXIT