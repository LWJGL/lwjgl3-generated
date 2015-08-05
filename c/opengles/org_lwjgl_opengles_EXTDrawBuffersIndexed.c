/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glEnableiEXTPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDisableiEXTPROC) (GLenum, GLuint);
typedef void (APIENTRY *glBlendEquationiEXTPROC) (GLuint, GLenum);
typedef void (APIENTRY *glBlendEquationSeparateiEXTPROC) (GLuint, GLenum, GLenum);
typedef void (APIENTRY *glBlendFunciEXTPROC) (GLuint, GLenum, GLenum);
typedef void (APIENTRY *glBlendFuncSeparateiEXTPROC) (GLuint, GLenum, GLenum, GLenum, GLenum);
typedef void (APIENTRY *glColorMaskiEXTPROC) (GLuint, GLboolean, GLboolean, GLboolean, GLboolean);
typedef GLboolean (APIENTRY *glIsEnablediEXTPROC) (GLenum, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_nglEnableiEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glEnableiEXTPROC glEnableiEXT = (glEnableiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableiEXT(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_nglDisableiEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glDisableiEXTPROC glDisableiEXT = (glDisableiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableiEXT(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_nglBlendEquationiEXT(JNIEnv *__env, jclass clazz, jint buf, jint mode, jlong __functionAddress) {
	glBlendEquationiEXTPROC glBlendEquationiEXT = (glBlendEquationiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationiEXT(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_nglBlendEquationSeparateiEXT(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha, jlong __functionAddress) {
	glBlendEquationSeparateiEXTPROC glBlendEquationSeparateiEXT = (glBlendEquationSeparateiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationSeparateiEXT(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_nglBlendFunciEXT(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst, jlong __functionAddress) {
	glBlendFunciEXTPROC glBlendFunciEXT = (glBlendFunciEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFunciEXT(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_nglBlendFuncSeparateiEXT(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha, jlong __functionAddress) {
	glBlendFuncSeparateiEXTPROC glBlendFuncSeparateiEXT = (glBlendFuncSeparateiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFuncSeparateiEXT(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_nglColorMaskiEXT(JNIEnv *__env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a, jlong __functionAddress) {
	glColorMaskiEXTPROC glColorMaskiEXT = (glColorMaskiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorMaskiEXT(index, r, g, b, a);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_nglIsEnablediEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glIsEnablediEXTPROC glIsEnablediEXT = (glIsEnablediEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsEnablediEXT(target, index);
}

EXTERN_C_EXIT
