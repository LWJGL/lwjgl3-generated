/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBlendFuncIndexedAMDPROC) (GLuint, GLenum, GLenum);
typedef void (APIENTRY *glBlendFuncSeparateIndexedAMDPROC) (GLuint, GLenum, GLenum, GLenum, GLenum);
typedef void (APIENTRY *glBlendEquationIndexedAMDPROC) (GLuint, GLenum);
typedef void (APIENTRY *glBlendEquationSeparateIndexedAMDPROC) (GLuint, GLenum, GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_nglBlendFuncIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst, jlong __functionAddress) {
	glBlendFuncIndexedAMDPROC glBlendFuncIndexedAMD = (glBlendFuncIndexedAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFuncIndexedAMD(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_nglBlendFuncSeparateIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha, jlong __functionAddress) {
	glBlendFuncSeparateIndexedAMDPROC glBlendFuncSeparateIndexedAMD = (glBlendFuncSeparateIndexedAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFuncSeparateIndexedAMD(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_nglBlendEquationIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint mode, jlong __functionAddress) {
	glBlendEquationIndexedAMDPROC glBlendEquationIndexedAMD = (glBlendEquationIndexedAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationIndexedAMD(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_nglBlendEquationSeparateIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha, jlong __functionAddress) {
	glBlendEquationSeparateIndexedAMDPROC glBlendEquationSeparateIndexedAMD = (glBlendEquationSeparateIndexedAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationSeparateIndexedAMD(buf, modeRGB, modeAlpha);
}

EXTERN_C_EXIT
