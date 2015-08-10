/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glUniform1i64ARBPROC) (GLint, GLint64);
typedef void (APIENTRY *glUniform1i64vARBPROC) (GLint, GLsizei, const GLint64 *);
typedef void (APIENTRY *glProgramUniform1i64ARBPROC) (GLuint, GLint, GLint64);
typedef void (APIENTRY *glProgramUniform1i64vARBPROC) (GLuint, GLint, GLsizei, const GLint64 *);
typedef void (APIENTRY *glUniform2i64ARBPROC) (GLint, GLint64, GLint64);
typedef void (APIENTRY *glUniform2i64vARBPROC) (GLint, GLsizei, const GLint64 *);
typedef void (APIENTRY *glProgramUniform2i64ARBPROC) (GLuint, GLint, GLint64, GLint64);
typedef void (APIENTRY *glProgramUniform2i64vARBPROC) (GLuint, GLint, GLsizei, const GLint64 *);
typedef void (APIENTRY *glUniform3i64ARBPROC) (GLint, GLint64, GLint64, GLint64);
typedef void (APIENTRY *glUniform3i64vARBPROC) (GLint, GLsizei, const GLint64 *);
typedef void (APIENTRY *glProgramUniform3i64ARBPROC) (GLuint, GLint, GLint64, GLint64, GLint64);
typedef void (APIENTRY *glProgramUniform3i64vARBPROC) (GLuint, GLint, GLsizei, const GLint64 *);
typedef void (APIENTRY *glUniform4i64ARBPROC) (GLint, GLint64, GLint64, GLint64, GLint64);
typedef void (APIENTRY *glUniform4i64vARBPROC) (GLint, GLsizei, const GLint64 *);
typedef void (APIENTRY *glProgramUniform4i64ARBPROC) (GLuint, GLint, GLint64, GLint64, GLint64, GLint64);
typedef void (APIENTRY *glProgramUniform4i64vARBPROC) (GLuint, GLint, GLsizei, const GLint64 *);
typedef void (APIENTRY *glUniform1ui64ARBPROC) (GLint, GLuint64);
typedef void (APIENTRY *glUniform1ui64vARBPROC) (GLint, GLsizei, const GLuint64 *);
typedef void (APIENTRY *glProgramUniform1ui64ARBPROC) (GLuint, GLint, GLuint64);
typedef void (APIENTRY *glProgramUniform1ui64vARBPROC) (GLuint, GLint, GLsizei, const GLuint64 *);
typedef void (APIENTRY *glUniform2ui64ARBPROC) (GLint, GLuint64, GLuint64);
typedef void (APIENTRY *glUniform2ui64vARBPROC) (GLint, GLsizei, const GLuint64 *);
typedef void (APIENTRY *glProgramUniform2ui64ARBPROC) (GLuint, GLint, GLuint64, GLuint64);
typedef void (APIENTRY *glProgramUniform2ui64vARBPROC) (GLuint, GLint, GLsizei, const GLuint64 *);
typedef void (APIENTRY *glUniform3ui64ARBPROC) (GLint, GLuint64, GLuint64, GLuint64);
typedef void (APIENTRY *glUniform3ui64vARBPROC) (GLint, GLsizei, const GLuint64 *);
typedef void (APIENTRY *glProgramUniform3ui64ARBPROC) (GLuint, GLint, GLuint64, GLuint64, GLuint64);
typedef void (APIENTRY *glProgramUniform3ui64vARBPROC) (GLuint, GLint, GLsizei, const GLuint64 *);
typedef void (APIENTRY *glUniform4ui64ARBPROC) (GLint, GLuint64, GLuint64, GLuint64, GLuint64);
typedef void (APIENTRY *glUniform4ui64vARBPROC) (GLint, GLsizei, const GLuint64 *);
typedef void (APIENTRY *glProgramUniform4ui64ARBPROC) (GLuint, GLint, GLuint64, GLuint64, GLuint64, GLuint64);
typedef void (APIENTRY *glProgramUniform4ui64vARBPROC) (GLuint, GLint, GLsizei, const GLuint64 *);
typedef void (APIENTRY *glGetUniformi64vARBPROC) (GLuint, GLint, GLint64 *);
typedef void (APIENTRY *glGetUniformui64vARBPROC) (GLuint, GLint, GLuint64 *);
typedef void (APIENTRY *glGetnUniformi64vARBPROC) (GLuint, GLint, GLsizei, GLint64 *);
typedef void (APIENTRY *glGetnUniformui64vARBPROC) (GLuint, GLint, GLsizei, GLuint64 *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform1i64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong __functionAddress) {
	glUniform1i64ARBPROC glUniform1i64ARB = (glUniform1i64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1i64ARB(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform1i64vARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64 *value = (const GLint64 *)(intptr_t)valueAddress;
	glUniform1i64vARBPROC glUniform1i64vARB = (glUniform1i64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1i64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform1i64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong __functionAddress) {
	glProgramUniform1i64ARBPROC glProgramUniform1i64ARB = (glProgramUniform1i64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1i64ARB(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform1i64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64 *value = (const GLint64 *)(intptr_t)valueAddress;
	glProgramUniform1i64vARBPROC glProgramUniform1i64vARB = (glProgramUniform1i64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1i64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform2i64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong __functionAddress) {
	glUniform2i64ARBPROC glUniform2i64ARB = (glUniform2i64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2i64ARB(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform2i64vARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64 *value = (const GLint64 *)(intptr_t)valueAddress;
	glUniform2i64vARBPROC glUniform2i64vARB = (glUniform2i64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2i64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform2i64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong __functionAddress) {
	glProgramUniform2i64ARBPROC glProgramUniform2i64ARB = (glProgramUniform2i64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2i64ARB(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform2i64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64 *value = (const GLint64 *)(intptr_t)valueAddress;
	glProgramUniform2i64vARBPROC glProgramUniform2i64vARB = (glProgramUniform2i64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2i64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform3i64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong __functionAddress) {
	glUniform3i64ARBPROC glUniform3i64ARB = (glUniform3i64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3i64ARB(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform3i64vARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64 *value = (const GLint64 *)(intptr_t)valueAddress;
	glUniform3i64vARBPROC glUniform3i64vARB = (glUniform3i64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3i64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform3i64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong __functionAddress) {
	glProgramUniform3i64ARBPROC glProgramUniform3i64ARB = (glProgramUniform3i64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3i64ARB(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform3i64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64 *value = (const GLint64 *)(intptr_t)valueAddress;
	glProgramUniform3i64vARBPROC glProgramUniform3i64vARB = (glProgramUniform3i64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3i64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform4i64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong w, jlong __functionAddress) {
	glUniform4i64ARBPROC glUniform4i64ARB = (glUniform4i64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4i64ARB(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform4i64vARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64 *value = (const GLint64 *)(intptr_t)valueAddress;
	glUniform4i64vARBPROC glUniform4i64vARB = (glUniform4i64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4i64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform4i64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong w, jlong __functionAddress) {
	glProgramUniform4i64ARBPROC glProgramUniform4i64ARB = (glProgramUniform4i64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4i64ARB(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform4i64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint64 *value = (const GLint64 *)(intptr_t)valueAddress;
	glProgramUniform4i64vARBPROC glProgramUniform4i64vARB = (glProgramUniform4i64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4i64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform1ui64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong __functionAddress) {
	glUniform1ui64ARBPROC glUniform1ui64ARB = (glUniform1ui64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1ui64ARB(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform1ui64vARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64 *value = (const GLuint64 *)(intptr_t)valueAddress;
	glUniform1ui64vARBPROC glUniform1ui64vARB = (glUniform1ui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1ui64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform1ui64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong __functionAddress) {
	glProgramUniform1ui64ARBPROC glProgramUniform1ui64ARB = (glProgramUniform1ui64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1ui64ARB(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform1ui64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64 *value = (const GLuint64 *)(intptr_t)valueAddress;
	glProgramUniform1ui64vARBPROC glProgramUniform1ui64vARB = (glProgramUniform1ui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1ui64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform2ui64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong __functionAddress) {
	glUniform2ui64ARBPROC glUniform2ui64ARB = (glUniform2ui64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2ui64ARB(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform2ui64vARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64 *value = (const GLuint64 *)(intptr_t)valueAddress;
	glUniform2ui64vARBPROC glUniform2ui64vARB = (glUniform2ui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2ui64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform2ui64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong __functionAddress) {
	glProgramUniform2ui64ARBPROC glProgramUniform2ui64ARB = (glProgramUniform2ui64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2ui64ARB(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform2ui64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64 *value = (const GLuint64 *)(intptr_t)valueAddress;
	glProgramUniform2ui64vARBPROC glProgramUniform2ui64vARB = (glProgramUniform2ui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2ui64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform3ui64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong __functionAddress) {
	glUniform3ui64ARBPROC glUniform3ui64ARB = (glUniform3ui64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3ui64ARB(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform3ui64vARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64 *value = (const GLuint64 *)(intptr_t)valueAddress;
	glUniform3ui64vARBPROC glUniform3ui64vARB = (glUniform3ui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3ui64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform3ui64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong __functionAddress) {
	glProgramUniform3ui64ARBPROC glProgramUniform3ui64ARB = (glProgramUniform3ui64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3ui64ARB(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform3ui64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64 *value = (const GLuint64 *)(intptr_t)valueAddress;
	glProgramUniform3ui64vARBPROC glProgramUniform3ui64vARB = (glProgramUniform3ui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3ui64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform4ui64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong w, jlong __functionAddress) {
	glUniform4ui64ARBPROC glUniform4ui64ARB = (glUniform4ui64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4ui64ARB(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform4ui64vARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64 *value = (const GLuint64 *)(intptr_t)valueAddress;
	glUniform4ui64vARBPROC glUniform4ui64vARB = (glUniform4ui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4ui64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform4ui64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong w, jlong __functionAddress) {
	glProgramUniform4ui64ARBPROC glProgramUniform4ui64ARB = (glProgramUniform4ui64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4ui64ARB(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform4ui64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint64 *value = (const GLuint64 *)(intptr_t)valueAddress;
	glProgramUniform4ui64vARBPROC glProgramUniform4ui64vARB = (glProgramUniform4ui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4ui64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglGetUniformi64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLint64 *params = (GLint64 *)(intptr_t)paramsAddress;
	glGetUniformi64vARBPROC glGetUniformi64vARB = (glGetUniformi64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformi64vARB(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglGetUniformui64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLuint64 *params = (GLuint64 *)(intptr_t)paramsAddress;
	glGetUniformui64vARBPROC glGetUniformui64vARB = (glGetUniformui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformui64vARB(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglGetnUniformi64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLint64 *params = (GLint64 *)(intptr_t)paramsAddress;
	glGetnUniformi64vARBPROC glGetnUniformi64vARB = (glGetnUniformi64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformi64vARB(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglGetnUniformui64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLuint64 *params = (GLuint64 *)(intptr_t)paramsAddress;
	glGetnUniformui64vARBPROC glGetnUniformui64vARB = (glGetnUniformui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformui64vARB(program, location, bufSize, params);
}

EXTERN_C_EXIT
