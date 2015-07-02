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
#include "stb_truetype.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTTAlignedQuad_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(stbtt_aligned_quad, x0);
	buffer[1] = (jint)offsetof(stbtt_aligned_quad, y0);
	buffer[2] = (jint)offsetof(stbtt_aligned_quad, s0);
	buffer[3] = (jint)offsetof(stbtt_aligned_quad, t0);
	buffer[4] = (jint)offsetof(stbtt_aligned_quad, x1);
	buffer[5] = (jint)offsetof(stbtt_aligned_quad, y1);
	buffer[6] = (jint)offsetof(stbtt_aligned_quad, s1);
	buffer[7] = (jint)offsetof(stbtt_aligned_quad, t1);

	return sizeof(stbtt_aligned_quad);
}

EXTERN_C_EXIT
