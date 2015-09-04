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
#define STB_VORBIS_HEADER_ONLY
#include "stb_vorbis.c"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbisAlloc_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(stb_vorbis_alloc, alloc_buffer);
	buffer[1] = (jint)offsetof(stb_vorbis_alloc, alloc_buffer_length_in_bytes);

	return sizeof(stb_vorbis_alloc);
}

EXTERN_C_EXIT
