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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRTimewarpProjectionDesc_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrTimewarpProjectionDesc, Projection22);
	buffer[1] = (jint)offsetof(ovrTimewarpProjectionDesc, Projection23);
	buffer[2] = (jint)offsetof(ovrTimewarpProjectionDesc, Projection32);

	return sizeof(ovrTimewarpProjectionDesc);
}

EXTERN_C_EXIT
