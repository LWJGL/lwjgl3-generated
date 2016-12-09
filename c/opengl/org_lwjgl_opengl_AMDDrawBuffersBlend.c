/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBlendFuncIndexedAMDPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFuncSeparateIndexedAMDPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glBlendEquationIndexedAMDPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationSeparateIndexedAMDPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_nglBlendFuncIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst) {
	glBlendFuncIndexedAMDPROC glBlendFuncIndexedAMD = (glBlendFuncIndexedAMDPROC)tlsGetFunction(78);
	UNUSED_PARAM(clazz)
	glBlendFuncIndexedAMD(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_nglBlendFuncSeparateIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
	glBlendFuncSeparateIndexedAMDPROC glBlendFuncSeparateIndexedAMD = (glBlendFuncSeparateIndexedAMDPROC)tlsGetFunction(81);
	UNUSED_PARAM(clazz)
	glBlendFuncSeparateIndexedAMD(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_nglBlendEquationIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint mode) {
	glBlendEquationIndexedAMDPROC glBlendEquationIndexedAMD = (glBlendEquationIndexedAMDPROC)tlsGetFunction(69);
	UNUSED_PARAM(clazz)
	glBlendEquationIndexedAMD(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_nglBlendEquationSeparateIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha) {
	glBlendEquationSeparateIndexedAMDPROC glBlendEquationSeparateIndexedAMD = (glBlendEquationSeparateIndexedAMDPROC)tlsGetFunction(72);
	UNUSED_PARAM(clazz)
	glBlendEquationSeparateIndexedAMD(buf, modeRGB, modeAlpha);
}

EXTERN_C_EXIT
