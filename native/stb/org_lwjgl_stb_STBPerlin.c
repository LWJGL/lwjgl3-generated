/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4242 4244 4702 4711 4738 4820 4996))
#endif
#define STB_PERLIN_IMPLEMENTATION
#include "stb_perlin.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBPerlin_stb_1perlin_1noise3(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jint x_wrap, jint y_wrap, jint z_wrap) {
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)stb_perlin_noise3(x, y, z, x_wrap, y_wrap, z_wrap);
}

EXTERN_C_EXIT
