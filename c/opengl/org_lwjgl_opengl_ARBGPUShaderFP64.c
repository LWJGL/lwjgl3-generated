/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glProgramUniform1dEXTPROC) (GLuint, GLint, GLdouble);
typedef GLvoid (APIENTRY *glProgramUniform2dEXTPROC) (GLuint, GLint, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glProgramUniform3dEXTPROC) (GLuint, GLint, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glProgramUniform4dEXTPROC) (GLuint, GLint, GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glProgramUniform1dvEXTPROC) (GLuint, GLint, GLsizei, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniform2dvEXTPROC) (GLuint, GLint, GLsizei, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniform3dvEXTPROC) (GLuint, GLint, GLsizei, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniform4dvEXTPROC) (GLuint, GLint, GLsizei, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniformMatrix2dvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniformMatrix3dvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniformMatrix4dvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniformMatrix2x3dvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniformMatrix2x4dvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniformMatrix3x2dvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniformMatrix3x4dvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniformMatrix4x2dvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramUniformMatrix4x3dvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform1dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jlong __functionAddress) {
	glProgramUniform1dEXTPROC glProgramUniform1dEXT = (glProgramUniform1dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1dEXT(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform2dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jlong __functionAddress) {
	glProgramUniform2dEXTPROC glProgramUniform2dEXT = (glProgramUniform2dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2dEXT(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform3dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glProgramUniform3dEXTPROC glProgramUniform3dEXT = (glProgramUniform3dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3dEXT(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform4dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glProgramUniform4dEXTPROC glProgramUniform4dEXT = (glProgramUniform4dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4dEXT(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform1dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform1dvEXTPROC glProgramUniform1dvEXT = (glProgramUniform1dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform2dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform2dvEXTPROC glProgramUniform2dvEXT = (glProgramUniform2dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform3dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform3dvEXTPROC glProgramUniform3dvEXT = (glProgramUniform3dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform4dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform4dvEXTPROC glProgramUniform4dvEXT = (glProgramUniform4dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix2dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix2dvEXTPROC glProgramUniformMatrix2dvEXT = (glProgramUniformMatrix2dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix3dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix3dvEXTPROC glProgramUniformMatrix3dvEXT = (glProgramUniformMatrix3dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix4dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix4dvEXTPROC glProgramUniformMatrix4dvEXT = (glProgramUniformMatrix4dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix2x3dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x3dvEXTPROC glProgramUniformMatrix2x3dvEXT = (glProgramUniformMatrix2x3dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x3dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix2x4dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x4dvEXTPROC glProgramUniformMatrix2x4dvEXT = (glProgramUniformMatrix2x4dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix3x2dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x2dvEXTPROC glProgramUniformMatrix3x2dvEXT = (glProgramUniformMatrix3x2dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix3x4dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x4dvEXTPROC glProgramUniformMatrix3x4dvEXT = (glProgramUniformMatrix3x4dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix4x2dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x2dvEXTPROC glProgramUniformMatrix4x2dvEXT = (glProgramUniformMatrix4x2dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix4x3dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x3dvEXTPROC glProgramUniformMatrix4x3dvEXT = (glProgramUniformMatrix4x3dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x3dvEXT(program, location, count, transpose, value);
}

EXTERN_C_EXIT
