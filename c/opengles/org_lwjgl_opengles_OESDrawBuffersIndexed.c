/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glEnableiOESPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDisableiOESPROC) (GLenum, GLuint);
typedef void (APIENTRY *glBlendEquationiOESPROC) (GLuint, GLenum);
typedef void (APIENTRY *glBlendEquationSeparateiOESPROC) (GLuint, GLenum, GLenum);
typedef void (APIENTRY *glBlendFunciOESPROC) (GLuint, GLenum, GLenum);
typedef void (APIENTRY *glBlendFuncSeparateiOESPROC) (GLuint, GLenum, GLenum, GLenum, GLenum);
typedef void (APIENTRY *glColorMaskiOESPROC) (GLuint, GLboolean, GLboolean, GLboolean, GLboolean);
typedef GLboolean (APIENTRY *glIsEnablediOESPROC) (GLenum, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglEnableiOES(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glEnableiOESPROC glEnableiOES = (glEnableiOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableiOES(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglDisableiOES(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glDisableiOESPROC glDisableiOES = (glDisableiOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableiOES(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglBlendEquationiOES(JNIEnv *__env, jclass clazz, jint buf, jint mode, jlong __functionAddress) {
	glBlendEquationiOESPROC glBlendEquationiOES = (glBlendEquationiOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationiOES(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglBlendEquationSeparateiOES(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha, jlong __functionAddress) {
	glBlendEquationSeparateiOESPROC glBlendEquationSeparateiOES = (glBlendEquationSeparateiOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationSeparateiOES(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglBlendFunciOES(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst, jlong __functionAddress) {
	glBlendFunciOESPROC glBlendFunciOES = (glBlendFunciOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFunciOES(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglBlendFuncSeparateiOES(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha, jlong __functionAddress) {
	glBlendFuncSeparateiOESPROC glBlendFuncSeparateiOES = (glBlendFuncSeparateiOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFuncSeparateiOES(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglColorMaskiOES(JNIEnv *__env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a, jlong __functionAddress) {
	glColorMaskiOESPROC glColorMaskiOES = (glColorMaskiOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorMaskiOES(index, r, g, b, a);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglIsEnablediOES(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glIsEnablediOESPROC glIsEnablediOES = (glIsEnablediOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsEnablediOES(target, index);
}

EXTERN_C_EXIT
