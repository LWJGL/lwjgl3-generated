/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferPixelLocalStorageSizeEXTPROC) (jint, jint);
typedef jint (APIENTRY *glGetFramebufferPixelLocalStorageSizeEXTPROC) (jint);
typedef void (APIENTRY *glClearPixelLocalStorageuiEXTPROC) (jint, jint, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTShaderPixelLocalStorage2_nglFramebufferPixelLocalStorageSizeEXT(JNIEnv *__env, jclass clazz, jint target, jint size) {
	glFramebufferPixelLocalStorageSizeEXTPROC glFramebufferPixelLocalStorageSizeEXT = (glFramebufferPixelLocalStorageSizeEXTPROC)tlsGetFunction(220);
	UNUSED_PARAM(clazz)
	glFramebufferPixelLocalStorageSizeEXT(target, size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_EXTShaderPixelLocalStorage2_nglGetFramebufferPixelLocalStorageSizeEXT(JNIEnv *__env, jclass clazz, jint target) {
	glGetFramebufferPixelLocalStorageSizeEXTPROC glGetFramebufferPixelLocalStorageSizeEXT = (glGetFramebufferPixelLocalStorageSizeEXTPROC)tlsGetFunction(281);
	UNUSED_PARAM(clazz)
	return (jint)glGetFramebufferPixelLocalStorageSizeEXT(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTShaderPixelLocalStorage2_nglClearPixelLocalStorageuiEXT__IIJ(JNIEnv *__env, jclass clazz, jint offset, jint n, jlong valuesAddress) {
	glClearPixelLocalStorageuiEXTPROC glClearPixelLocalStorageuiEXT = (glClearPixelLocalStorageuiEXTPROC)tlsGetFunction(64);
	const intptr_t values = (const intptr_t)valuesAddress;
	UNUSED_PARAM(clazz)
	glClearPixelLocalStorageuiEXT(offset, n, values);
}

EXTERN_C_EXIT