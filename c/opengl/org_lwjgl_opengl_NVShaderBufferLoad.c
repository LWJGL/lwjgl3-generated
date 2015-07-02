/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glMakeBufferResidentNVPROC) (GLenum, GLenum);
typedef GLvoid (APIENTRY *glMakeBufferNonResidentNVPROC) (GLenum);
typedef GLboolean (APIENTRY *glIsBufferResidentNVPROC) (GLenum);
typedef GLvoid (APIENTRY *glMakeNamedBufferResidentNVPROC) (GLuint, GLenum);
typedef GLvoid (APIENTRY *glMakeNamedBufferNonResidentNVPROC) (GLuint);
typedef GLboolean (APIENTRY *glIsNamedBufferResidentNVPROC) (GLuint);
typedef GLvoid (APIENTRY *glGetBufferParameterui64vNVPROC) (GLenum, GLenum, GLuint64EXT *);
typedef GLvoid (APIENTRY *glGetNamedBufferParameterui64vNVPROC) (GLuint, GLenum, GLuint64EXT *);
typedef GLvoid (APIENTRY *glGetIntegerui64vNVPROC) (GLenum, GLuint64EXT *);
typedef GLvoid (APIENTRY *glUniformui64NVPROC) (GLint, GLuint64EXT);
typedef GLvoid (APIENTRY *glUniformui64vNVPROC) (GLint, GLsizei, const GLuint64EXT *);
typedef GLvoid (APIENTRY *glGetUniformui64vNVPROC) (GLuint, GLint, GLuint64EXT *);
typedef GLvoid (APIENTRY *glProgramUniformui64NVPROC) (GLuint, GLint, GLuint64EXT);
typedef GLvoid (APIENTRY *glProgramUniformui64vNVPROC) (GLuint, GLint, GLsizei, const GLuint64EXT *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglMakeBufferResidentNV(JNIEnv *__env, jclass clazz, jint target, jint access, jlong __functionAddress) {
	glMakeBufferResidentNVPROC glMakeBufferResidentNV = (glMakeBufferResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeBufferResidentNV(target, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglMakeBufferNonResidentNV(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glMakeBufferNonResidentNVPROC glMakeBufferNonResidentNV = (glMakeBufferNonResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeBufferNonResidentNV(target);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglIsBufferResidentNV(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glIsBufferResidentNVPROC glIsBufferResidentNV = (glIsBufferResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsBufferResidentNV(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglMakeNamedBufferResidentNV(JNIEnv *__env, jclass clazz, jint buffer, jint access, jlong __functionAddress) {
	glMakeNamedBufferResidentNVPROC glMakeNamedBufferResidentNV = (glMakeNamedBufferResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeNamedBufferResidentNV(buffer, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglMakeNamedBufferNonResidentNV(JNIEnv *__env, jclass clazz, jint buffer, jlong __functionAddress) {
	glMakeNamedBufferNonResidentNVPROC glMakeNamedBufferNonResidentNV = (glMakeNamedBufferNonResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeNamedBufferNonResidentNV(buffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglIsNamedBufferResidentNV(JNIEnv *__env, jclass clazz, jint buffer, jlong __functionAddress) {
	glIsNamedBufferResidentNVPROC glIsNamedBufferResidentNV = (glIsNamedBufferResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsNamedBufferResidentNV(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetBufferParameterui64vNV(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint64EXT *params = (GLuint64EXT *)(intptr_t)paramsAddress;
	glGetBufferParameterui64vNVPROC glGetBufferParameterui64vNV = (glGetBufferParameterui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBufferParameterui64vNV(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetNamedBufferParameterui64vNV(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint64EXT *params = (GLuint64EXT *)(intptr_t)paramsAddress;
	glGetNamedBufferParameterui64vNVPROC glGetNamedBufferParameterui64vNV = (glGetNamedBufferParameterui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedBufferParameterui64vNV(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetIntegerui64vNV(JNIEnv *__env, jclass clazz, jint value, jlong resultAddress, jlong __functionAddress) {
	GLuint64EXT *result = (GLuint64EXT *)(intptr_t)resultAddress;
	glGetIntegerui64vNVPROC glGetIntegerui64vNV = (glGetIntegerui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetIntegerui64vNV(value, result);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglUniformui64NV(JNIEnv *__env, jclass clazz, jint location, jlong value, jlong __functionAddress) {
	glUniformui64NVPROC glUniformui64NV = (glUniformui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformui64NV(location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglUniformui64vNV(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64EXT *value = (const GLuint64EXT *)(intptr_t)valueAddress;
	glUniformui64vNVPROC glUniformui64vNV = (glUniformui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformui64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetUniformui64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLuint64EXT *params = (GLuint64EXT *)(intptr_t)paramsAddress;
	glGetUniformui64vNVPROC glGetUniformui64vNV = (glGetUniformui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformui64vNV(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglProgramUniformui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong value, jlong __functionAddress) {
	glProgramUniformui64NVPROC glProgramUniformui64NV = (glProgramUniformui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformui64NV(program, location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglProgramUniformui64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64EXT *value = (const GLuint64EXT *)(intptr_t)valueAddress;
	glProgramUniformui64vNVPROC glProgramUniformui64vNV = (glProgramUniformui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformui64vNV(program, location, count, value);
}

EXTERN_C_EXIT
