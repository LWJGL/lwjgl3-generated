/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glTexParameterIivOESPROC) (GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glTexParameterIuivOESPROC) (GLenum, GLenum, const GLuint *);
typedef void (APIENTRY *glGetTexParameterIivOESPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetTexParameterIuivOESPROC) (GLenum, GLenum, GLuint *);
typedef void (APIENTRY *glSamplerParameterIivOESPROC) (GLuint, GLenum, const GLint *);
typedef void (APIENTRY *glSamplerParameterIuivOESPROC) (GLuint, GLenum, const GLuint *);
typedef void (APIENTRY *glGetSamplerParameterIivOESPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetSamplerParameterIuivOESPROC) (GLuint, GLenum, GLuint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglTexParameterIivOES(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glTexParameterIivOESPROC glTexParameterIivOES = (glTexParameterIivOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterIivOES(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglTexParameterIuivOES(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *params = (const GLuint *)(intptr_t)paramsAddress;
	glTexParameterIuivOESPROC glTexParameterIuivOES = (glTexParameterIuivOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterIuivOES(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglGetTexParameterIivOES(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTexParameterIivOESPROC glGetTexParameterIivOES = (glGetTexParameterIivOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterIivOES(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglGetTexParameterIuivOES(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetTexParameterIuivOESPROC glGetTexParameterIuivOES = (glGetTexParameterIuivOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterIuivOES(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglSamplerParameterIivOES(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glSamplerParameterIivOESPROC glSamplerParameterIivOES = (glSamplerParameterIivOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterIivOES(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglSamplerParameterIuivOES(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *params = (const GLuint *)(intptr_t)paramsAddress;
	glSamplerParameterIuivOESPROC glSamplerParameterIuivOES = (glSamplerParameterIuivOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterIuivOES(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglGetSamplerParameterIivOES(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetSamplerParameterIivOESPROC glGetSamplerParameterIivOES = (glGetSamplerParameterIivOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameterIivOES(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglGetSamplerParameterIuivOES(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetSamplerParameterIuivOESPROC glGetSamplerParameterIuivOES = (glGetSamplerParameterIuivOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameterIuivOES(sampler, pname, params);
}

EXTERN_C_EXIT
