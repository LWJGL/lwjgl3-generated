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
#define STB_VORBIS_HEADER_ONLY
#include "stb_vorbis.c"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbisInfo_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(stb_vorbis_info, sample_rate);
	buffer[1] = (jint)offsetof(stb_vorbis_info, channels);
	buffer[2] = (jint)offsetof(stb_vorbis_info, setup_memory_required);
	buffer[3] = (jint)offsetof(stb_vorbis_info, setup_temp_memory_required);
	buffer[4] = (jint)offsetof(stb_vorbis_info, temp_memory_required);
	buffer[5] = (jint)offsetof(stb_vorbis_info, max_frame_size);

	return sizeof(stb_vorbis_info);
}

EXTERN_C_EXIT
