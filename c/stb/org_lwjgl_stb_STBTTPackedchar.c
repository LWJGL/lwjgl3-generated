/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <stddef.h>
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4242 4244 4702 4711 4738 4820 4996))
#endif
#include "stb_truetype.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTTPackedchar_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(stbtt_packedchar, x0);
	buffer[1] = (jint)offsetof(stbtt_packedchar, y0);
	buffer[2] = (jint)offsetof(stbtt_packedchar, x1);
	buffer[3] = (jint)offsetof(stbtt_packedchar, y1);
	buffer[4] = (jint)offsetof(stbtt_packedchar, xoff);
	buffer[5] = (jint)offsetof(stbtt_packedchar, yoff);
	buffer[6] = (jint)offsetof(stbtt_packedchar, xadvance);
	buffer[7] = (jint)offsetof(stbtt_packedchar, xoff2);
	buffer[8] = (jint)offsetof(stbtt_packedchar, yoff2);

	return sizeof(stbtt_packedchar);
}

EXTERN_C_EXIT
