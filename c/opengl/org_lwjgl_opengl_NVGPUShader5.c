/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glUniform1i64NVPROC) (GLint, GLint64EXT);
typedef void (APIENTRY *glUniform2i64NVPROC) (GLint, GLint64EXT, GLint64EXT);
typedef void (APIENTRY *glUniform3i64NVPROC) (GLint, GLint64EXT, GLint64EXT, GLint64EXT);
typedef void (APIENTRY *glUniform4i64NVPROC) (GLint, GLint64EXT, GLint64EXT, GLint64EXT, GLint64EXT);
typedef void (APIENTRY *glUniform1i64vNVPROC) (GLint, GLsizei, const GLint64EXT *);
typedef void (APIENTRY *glUniform2i64vNVPROC) (GLint, GLsizei, const GLint64EXT *);
typedef void (APIENTRY *glUniform3i64vNVPROC) (GLint, GLsizei, const GLint64EXT *);
typedef void (APIENTRY *glUniform4i64vNVPROC) (GLint, GLsizei, const GLint64EXT *);
typedef void (APIENTRY *glUniform1ui64NVPROC) (GLint, GLuint64EXT);
typedef void (APIENTRY *glUniform2ui64NVPROC) (GLint, GLuint64EXT, GLuint64EXT);
typedef void (APIENTRY *glUniform3ui64NVPROC) (GLint, GLuint64EXT, GLuint64EXT, GLuint64EXT);
typedef void (APIENTRY *glUniform4ui64NVPROC) (GLint, GLuint64EXT, GLuint64EXT, GLuint64EXT, GLuint64EXT);
typedef void (APIENTRY *glUniform1ui64vNVPROC) (GLint, GLsizei, const GLuint64EXT *);
typedef void (APIENTRY *glUniform2ui64vNVPROC) (GLint, GLsizei, GLuint64EXT *);
typedef void (APIENTRY *glUniform3ui64vNVPROC) (GLint, GLsizei, const GLuint64EXT *);
typedef void (APIENTRY *glUniform4ui64vNVPROC) (GLint, GLsizei, const GLuint64EXT *);
typedef void (APIENTRY *glGetUniformi64vNVPROC) (GLuint, GLint, GLint64EXT *);
typedef void (APIENTRY *glGetUniformui64vNVPROC) (GLuint, GLint, GLint64EXT *);
typedef void (APIENTRY *glProgramUniform1i64NVPROC) (GLuint, GLint, GLint64EXT);
typedef void (APIENTRY *glProgramUniform2i64NVPROC) (GLuint, GLint, GLint64EXT, GLint64EXT);
typedef void (APIENTRY *glProgramUniform3i64NVPROC) (GLuint, GLint, GLint64EXT, GLint64EXT, GLint64EXT);
typedef void (APIENTRY *glProgramUniform4i64NVPROC) (GLuint, GLint, GLint64EXT, GLint64EXT, GLint64EXT, GLint64EXT);
typedef void (APIENTRY *glProgramUniform1i64vNVPROC) (GLuint, GLint, GLsizei, const GLint64EXT *);
typedef void (APIENTRY *glProgramUniform2i64vNVPROC) (GLuint, GLint, GLsizei, const GLint64EXT *);
typedef void (APIENTRY *glProgramUniform3i64vNVPROC) (GLuint, GLint, GLsizei, const GLint64EXT *);
typedef void (APIENTRY *glProgramUniform4i64vNVPROC) (GLuint, GLint, GLsizei, const GLint64EXT *);
typedef void (APIENTRY *glProgramUniform1ui64NVPROC) (GLuint, GLint, GLuint64EXT);
typedef void (APIENTRY *glProgramUniform2ui64NVPROC) (GLuint, GLint, GLuint64EXT, GLuint64EXT);
typedef void (APIENTRY *glProgramUniform3ui64NVPROC) (GLuint, GLint, GLuint64EXT, GLuint64EXT, GLuint64EXT);
typedef void (APIENTRY *glProgramUniform4ui64NVPROC) (GLuint, GLint, GLuint64EXT, GLuint64EXT, GLuint64EXT, GLuint64EXT);
typedef void (APIENTRY *glProgramUniform1ui64vNVPROC) (GLuint, GLint, GLsizei, const GLuint64EXT *);
typedef void (APIENTRY *glProgramUniform2ui64vNVPROC) (GLuint, GLint, GLsizei, const GLuint64EXT *);
typedef void (APIENTRY *glProgramUniform3ui64vNVPROC) (GLuint, GLint, GLsizei, const GLuint64EXT *);
typedef void (APIENTRY *glProgramUniform4ui64vNVPROC) (GLuint, GLint, GLsizei, const GLuint64EXT *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform1i64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong __functionAddress) {
	glUniform1i64NVPROC glUniform1i64NV = (glUniform1i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1i64NV(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform2i64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong __functionAddress) {
	glUniform2i64NVPROC glUniform2i64NV = (glUniform2i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2i64NV(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform3i64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong __functionAddress) {
	glUniform3i64NVPROC glUniform3i64NV = (glUniform3i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3i64NV(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform4i64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong w, jlong __functionAddress) {
	glUniform4i64NVPROC glUniform4i64NV = (glUniform4i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4i64NV(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform1i64vNV(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64EXT *value = (const GLint64EXT *)(intptr_t)valueAddress;
	glUniform1i64vNVPROC glUniform1i64vNV = (glUniform1i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1i64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform2i64vNV(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64EXT *value = (const GLint64EXT *)(intptr_t)valueAddress;
	glUniform2i64vNVPROC glUniform2i64vNV = (glUniform2i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2i64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform3i64vNV(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64EXT *value = (const GLint64EXT *)(intptr_t)valueAddress;
	glUniform3i64vNVPROC glUniform3i64vNV = (glUniform3i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3i64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform4i64vNV(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64EXT *value = (const GLint64EXT *)(intptr_t)valueAddress;
	glUniform4i64vNVPROC glUniform4i64vNV = (glUniform4i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4i64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform1ui64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong __functionAddress) {
	glUniform1ui64NVPROC glUniform1ui64NV = (glUniform1ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1ui64NV(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform2ui64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong __functionAddress) {
	glUniform2ui64NVPROC glUniform2ui64NV = (glUniform2ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2ui64NV(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform3ui64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong __functionAddress) {
	glUniform3ui64NVPROC glUniform3ui64NV = (glUniform3ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3ui64NV(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform4ui64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong w, jlong __functionAddress) {
	glUniform4ui64NVPROC glUniform4ui64NV = (glUniform4ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4ui64NV(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform1ui64vNV(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64EXT *value = (const GLuint64EXT *)(intptr_t)valueAddress;
	glUniform1ui64vNVPROC glUniform1ui64vNV = (glUniform1ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1ui64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform2ui64vNV(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	GLuint64EXT *value = (GLuint64EXT *)(intptr_t)valueAddress;
	glUniform2ui64vNVPROC glUniform2ui64vNV = (glUniform2ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2ui64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform3ui64vNV(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64EXT *value = (const GLuint64EXT *)(intptr_t)valueAddress;
	glUniform3ui64vNVPROC glUniform3ui64vNV = (glUniform3ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3ui64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglUniform4ui64vNV(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64EXT *value = (const GLuint64EXT *)(intptr_t)valueAddress;
	glUniform4ui64vNVPROC glUniform4ui64vNV = (glUniform4ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4ui64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglGetUniformi64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLint64EXT *params = (GLint64EXT *)(intptr_t)paramsAddress;
	glGetUniformi64vNVPROC glGetUniformi64vNV = (glGetUniformi64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformi64vNV(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglGetUniformui64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLint64EXT *params = (GLint64EXT *)(intptr_t)paramsAddress;
	glGetUniformui64vNVPROC glGetUniformui64vNV = (glGetUniformui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformui64vNV(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform1i64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong __functionAddress) {
	glProgramUniform1i64NVPROC glProgramUniform1i64NV = (glProgramUniform1i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1i64NV(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform2i64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong __functionAddress) {
	glProgramUniform2i64NVPROC glProgramUniform2i64NV = (glProgramUniform2i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2i64NV(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform3i64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong __functionAddress) {
	glProgramUniform3i64NVPROC glProgramUniform3i64NV = (glProgramUniform3i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3i64NV(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform4i64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong w, jlong __functionAddress) {
	glProgramUniform4i64NVPROC glProgramUniform4i64NV = (glProgramUniform4i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4i64NV(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform1i64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64EXT *value = (const GLint64EXT *)(intptr_t)valueAddress;
	glProgramUniform1i64vNVPROC glProgramUniform1i64vNV = (glProgramUniform1i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1i64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform2i64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64EXT *value = (const GLint64EXT *)(intptr_t)valueAddress;
	glProgramUniform2i64vNVPROC glProgramUniform2i64vNV = (glProgramUniform2i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2i64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform3i64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64EXT *value = (const GLint64EXT *)(intptr_t)valueAddress;
	glProgramUniform3i64vNVPROC glProgramUniform3i64vNV = (glProgramUniform3i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3i64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform4i64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64EXT *value = (const GLint64EXT *)(intptr_t)valueAddress;
	glProgramUniform4i64vNVPROC glProgramUniform4i64vNV = (glProgramUniform4i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4i64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform1ui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong __functionAddress) {
	glProgramUniform1ui64NVPROC glProgramUniform1ui64NV = (glProgramUniform1ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1ui64NV(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform2ui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong __functionAddress) {
	glProgramUniform2ui64NVPROC glProgramUniform2ui64NV = (glProgramUniform2ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2ui64NV(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform3ui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong __functionAddress) {
	glProgramUniform3ui64NVPROC glProgramUniform3ui64NV = (glProgramUniform3ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3ui64NV(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform4ui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong w, jlong __functionAddress) {
	glProgramUniform4ui64NVPROC glProgramUniform4ui64NV = (glProgramUniform4ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4ui64NV(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform1ui64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64EXT *value = (const GLuint64EXT *)(intptr_t)valueAddress;
	glProgramUniform1ui64vNVPROC glProgramUniform1ui64vNV = (glProgramUniform1ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1ui64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform2ui64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64EXT *value = (const GLuint64EXT *)(intptr_t)valueAddress;
	glProgramUniform2ui64vNVPROC glProgramUniform2ui64vNV = (glProgramUniform2ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2ui64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform3ui64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64EXT *value = (const GLuint64EXT *)(intptr_t)valueAddress;
	glProgramUniform3ui64vNVPROC glProgramUniform3ui64vNV = (glProgramUniform3ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3ui64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUShader5_nglProgramUniform4ui64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64EXT *value = (const GLuint64EXT *)(intptr_t)valueAddress;
	glProgramUniform4ui64vNVPROC glProgramUniform4ui64vNV = (glProgramUniform4ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4ui64vNV(program, location, count, value);
}

EXTERN_C_EXIT
