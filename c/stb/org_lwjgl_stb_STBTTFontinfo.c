/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4701 4702 4711 4738))
#endif
#include "stb_truetype.h"
ENABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	#define alignof __alignof
#else
	#include <stdalign.h>
#endif

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTTFontinfo_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = alignof(stbtt_fontinfo);

	return sizeof(stbtt_fontinfo);
}

EXTERN_C_EXIT
