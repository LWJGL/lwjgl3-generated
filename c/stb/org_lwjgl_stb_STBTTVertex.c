/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <stddef.h>
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4242 4244 4701 4702 4711 4996))
#endif
#include "stb_truetype.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTTVertex_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(stbtt_vertex, x);
	buffer[1] = (jint)offsetof(stbtt_vertex, y);
	buffer[2] = (jint)offsetof(stbtt_vertex, cx);
	buffer[3] = (jint)offsetof(stbtt_vertex, cy);
	buffer[4] = (jint)offsetof(stbtt_vertex, type);

	return sizeof(stbtt_vertex);
}

EXTERN_C_EXIT
