/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glBlendEquationiARBPROC) (GLuint, GLenum);
typedef GLvoid (APIENTRY *glBlendEquationSeparateiARBPROC) (GLuint, GLenum, GLenum);
typedef GLvoid (APIENTRY *glBlendFunciARBPROC) (GLuint, GLenum, GLenum);
typedef GLvoid (APIENTRY *glBlendFuncSeparateiARBPROC) (GLuint, GLenum, GLenum, GLenum, GLenum);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawBuffersBlend_nglBlendEquationiARB(JNIEnv *__env, jclass clazz, jint buf, jint mode, jlong __functionAddress) {
	glBlendEquationiARBPROC glBlendEquationiARB = (glBlendEquationiARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationiARB(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawBuffersBlend_nglBlendEquationSeparateiARB(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha, jlong __functionAddress) {
	glBlendEquationSeparateiARBPROC glBlendEquationSeparateiARB = (glBlendEquationSeparateiARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationSeparateiARB(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawBuffersBlend_nglBlendFunciARB(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst, jlong __functionAddress) {
	glBlendFunciARBPROC glBlendFunciARB = (glBlendFunciARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFunciARB(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawBuffersBlend_nglBlendFuncSeparateiARB(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha, jlong __functionAddress) {
	glBlendFuncSeparateiARBPROC glBlendFuncSeparateiARB = (glBlendFuncSeparateiARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFuncSeparateiARB(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}
