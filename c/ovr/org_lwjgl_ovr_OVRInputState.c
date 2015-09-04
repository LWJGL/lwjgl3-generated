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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRInputState_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrInputState, TimeInSeconds);
	buffer[1] = (jint)offsetof(ovrInputState, ConnectedControllerTypes);
	buffer[2] = (jint)offsetof(ovrInputState, Buttons);
	buffer[3] = (jint)offsetof(ovrInputState, Touches);
	buffer[4] = (jint)offsetof(ovrInputState, IndexTrigger);
	buffer[5] = (jint)offsetof(ovrInputState, HandTrigger);
	buffer[6] = (jint)offsetof(ovrInputState, Thumbstick);

	return sizeof(ovrInputState);
}

EXTERN_C_EXIT
