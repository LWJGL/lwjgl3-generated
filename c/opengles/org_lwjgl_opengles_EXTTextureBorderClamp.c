/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glTexParameterIivEXTPROC) (GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glTexParameterIuivEXTPROC) (GLenum, GLenum, const GLuint *);
typedef void (APIENTRY *glGetTexParameterIivEXTPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetTexParameterIuivEXTPROC) (GLenum, GLenum, GLuint *);
typedef void (APIENTRY *glSamplerParameterIivEXTPROC) (GLuint, GLenum, const GLint *);
typedef void (APIENTRY *glSamplerParameterIuivEXTPROC) (GLuint, GLenum, const GLuint *);
typedef void (APIENTRY *glGetSamplerParameterIivEXTPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetSamplerParameterIuivEXTPROC) (GLuint, GLenum, GLuint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglTexParameterIivEXT(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glTexParameterIivEXTPROC glTexParameterIivEXT = (glTexParameterIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterIivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglTexParameterIuivEXT(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *params = (const GLuint *)(intptr_t)paramsAddress;
	glTexParameterIuivEXTPROC glTexParameterIuivEXT = (glTexParameterIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterIuivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglGetTexParameterIivEXT(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTexParameterIivEXTPROC glGetTexParameterIivEXT = (glGetTexParameterIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterIivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglGetTexParameterIuivEXT(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetTexParameterIuivEXTPROC glGetTexParameterIuivEXT = (glGetTexParameterIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterIuivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglSamplerParameterIivEXT(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramAddress, jlong __functionAddress) {
	const GLint *param = (const GLint *)(intptr_t)paramAddress;
	glSamplerParameterIivEXTPROC glSamplerParameterIivEXT = (glSamplerParameterIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterIivEXT(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglSamplerParameterIuivEXT(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramAddress, jlong __functionAddress) {
	const GLuint *param = (const GLuint *)(intptr_t)paramAddress;
	glSamplerParameterIuivEXTPROC glSamplerParameterIuivEXT = (glSamplerParameterIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterIuivEXT(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglGetSamplerParameterIivEXT(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetSamplerParameterIivEXTPROC glGetSamplerParameterIivEXT = (glGetSamplerParameterIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameterIivEXT(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglGetSamplerParameterIuivEXT(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetSamplerParameterIuivEXTPROC glGetSamplerParameterIuivEXT = (glGetSamplerParameterIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameterIuivEXT(sampler, pname, params);
}

EXTERN_C_EXIT
