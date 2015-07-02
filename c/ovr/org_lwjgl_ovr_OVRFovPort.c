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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRFovPort_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrFovPort, UpTan);
	buffer[1] = (jint)offsetof(ovrFovPort, DownTan);
	buffer[2] = (jint)offsetof(ovrFovPort, LeftTan);
	buffer[3] = (jint)offsetof(ovrFovPort, RightTan);

	return sizeof(ovrFovPort);
}

EXTERN_C_EXIT
