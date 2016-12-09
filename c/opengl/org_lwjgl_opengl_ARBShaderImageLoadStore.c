/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindImageTexturePROC) (jint, jint, jint, jboolean, jint, jint, jint);
typedef void (APIENTRY *glMemoryBarrierPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderImageLoadStore_nglBindImageTexture(JNIEnv *__env, jclass clazz, jint unit, jint texture, jint level, jboolean layered, jint layer, jint access, jint format) {
	glBindImageTexturePROC glBindImageTexture = (glBindImageTexturePROC)tlsGetFunction(44);
	UNUSED_PARAM(clazz)
	glBindImageTexture(unit, texture, level, layered, layer, access, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderImageLoadStore_nglMemoryBarrier(JNIEnv *__env, jclass clazz, jint barriers) {
	glMemoryBarrierPROC glMemoryBarrier = (glMemoryBarrierPROC)tlsGetFunction(977);
	UNUSED_PARAM(clazz)
	glMemoryBarrier(barriers);
}

EXTERN_C_EXIT