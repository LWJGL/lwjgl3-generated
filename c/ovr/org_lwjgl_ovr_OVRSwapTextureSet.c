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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRSwapTextureSet_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrSwapTextureSet, Textures);
	buffer[1] = (jint)offsetof(ovrSwapTextureSet, TextureCount);
	buffer[2] = (jint)offsetof(ovrSwapTextureSet, CurrentIndex);

	return sizeof(ovrSwapTextureSet);
}

EXTERN_C_EXIT
