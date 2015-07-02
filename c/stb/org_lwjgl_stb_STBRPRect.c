/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4242 4244 4702 4711 4738 4820 4996))
#endif
#include "stb_rect_pack.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBRPRect_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(stbrp_rect, id);
	buffer[1] = (jint)offsetof(stbrp_rect, w);
	buffer[2] = (jint)offsetof(stbrp_rect, h);
	buffer[3] = (jint)offsetof(stbrp_rect, x);
	buffer[4] = (jint)offsetof(stbrp_rect, y);
	buffer[5] = (jint)offsetof(stbrp_rect, was_packed);

	return sizeof(stbrp_rect);
}

EXTERN_C_EXIT
