/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4701 4702 4711 4738))
#endif
#define STB_DXT_IMPLEMENTATION
#include "stb_dxt.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBDXT_nstb_1compress_1dxt_1block(JNIEnv *__env, jclass clazz, jlong destAddress, jlong srcAddress, jint alpha, jint mode) {
	unsigned char *dest = (unsigned char *)(intptr_t)destAddress;
	const unsigned char *src = (const unsigned char *)(intptr_t)srcAddress;
	UNUSED_PARAMS(__env, clazz)
	stb_compress_dxt_block(dest, src, alpha, mode);
}

EXTERN_C_EXIT
