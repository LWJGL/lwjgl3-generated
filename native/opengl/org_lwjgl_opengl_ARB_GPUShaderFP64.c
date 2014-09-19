/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

typedef GLvoid (APIENTRY *glUniform1dPROC) (GLint, GLdouble);
typedef GLvoid (APIENTRY *glUniform2dPROC) (GLint, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glUniform3dPROC) (GLint, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glUniform4dPROC) (GLint, GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glUniform1dvPROC) (GLint, GLsizei, const GLdouble *);
typedef GLvoid (APIENTRY *glUniform2dvPROC) (GLint, GLsizei, const GLdouble *);
typedef GLvoid (APIENTRY *glUniform3dvPROC) (GLint, GLsizei, const GLdouble *);
typedef GLvoid (APIENTRY *glUniform4dvPROC) (GLint, GLsizei, const GLdouble *);
typedef GLvoid (APIENTRY *glUniformMatrix2dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glUniformMatrix3dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glUniformMatrix4dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glUniformMatrix2x3dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glUniformMatrix2x4dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glUniformMatrix3x2dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glUniformMatrix3x4dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glUniformMatrix4x2dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glUniformMatrix4x3dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef GLvoid (APIENTRY *glGetUniformdvPROC) (GLuint, GLint, GLdouble *);
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

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniform1d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jlong __functionAddress) {
	glUniform1dPROC glUniform1d = (glUniform1dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1d(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniform2d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y, jlong __functionAddress) {
	glUniform2dPROC glUniform2d = (glUniform2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2d(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniform3d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glUniform3dPROC glUniform3d = (glUniform3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3d(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniform4d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glUniform4dPROC glUniform4d = (glUniform4dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4d(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniform1dv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniform1dvPROC glUniform1dv = (glUniform1dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniform2dv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniform2dvPROC glUniform2dv = (glUniform2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniform3dv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniform3dvPROC glUniform3dv = (glUniform3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniform4dv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniform4dvPROC glUniform4dv = (glUniform4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniformMatrix2dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix2dvPROC glUniformMatrix2dv = (glUniformMatrix2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniformMatrix3dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix3dvPROC glUniformMatrix3dv = (glUniformMatrix3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniformMatrix4dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix4dvPROC glUniformMatrix4dv = (glUniformMatrix4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniformMatrix2x3dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix2x3dvPROC glUniformMatrix2x3dv = (glUniformMatrix2x3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2x3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniformMatrix2x4dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix2x4dvPROC glUniformMatrix2x4dv = (glUniformMatrix2x4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2x4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniformMatrix3x2dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix3x2dvPROC glUniformMatrix3x2dv = (glUniformMatrix3x2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3x2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniformMatrix3x4dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix3x4dvPROC glUniformMatrix3x4dv = (glUniformMatrix3x4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3x4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniformMatrix4x2dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix4x2dvPROC glUniformMatrix4x2dv = (glUniformMatrix4x2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4x2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglUniformMatrix4x3dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix4x3dvPROC glUniformMatrix4x3dv = (glUniformMatrix4x3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4x3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglGetUniformdv(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetUniformdvPROC glGetUniformdv = (glGetUniformdvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformdv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniform1dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jlong __functionAddress) {
	glProgramUniform1dEXTPROC glProgramUniform1dEXT = (glProgramUniform1dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1dEXT(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniform2dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jlong __functionAddress) {
	glProgramUniform2dEXTPROC glProgramUniform2dEXT = (glProgramUniform2dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2dEXT(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniform3dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glProgramUniform3dEXTPROC glProgramUniform3dEXT = (glProgramUniform3dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3dEXT(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniform4dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glProgramUniform4dEXTPROC glProgramUniform4dEXT = (glProgramUniform4dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4dEXT(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniform1dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform1dvEXTPROC glProgramUniform1dvEXT = (glProgramUniform1dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniform2dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform2dvEXTPROC glProgramUniform2dvEXT = (glProgramUniform2dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniform3dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform3dvEXTPROC glProgramUniform3dvEXT = (glProgramUniform3dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniform4dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform4dvEXTPROC glProgramUniform4dvEXT = (glProgramUniform4dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniformMatrix2dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix2dvEXTPROC glProgramUniformMatrix2dvEXT = (glProgramUniformMatrix2dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniformMatrix3dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix3dvEXTPROC glProgramUniformMatrix3dvEXT = (glProgramUniformMatrix3dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniformMatrix4dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix4dvEXTPROC glProgramUniformMatrix4dvEXT = (glProgramUniformMatrix4dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniformMatrix2x3dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x3dvEXTPROC glProgramUniformMatrix2x3dvEXT = (glProgramUniformMatrix2x3dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x3dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniformMatrix2x4dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x4dvEXTPROC glProgramUniformMatrix2x4dvEXT = (glProgramUniformMatrix2x4dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniformMatrix3x2dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x2dvEXTPROC glProgramUniformMatrix3x2dvEXT = (glProgramUniformMatrix3x2dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniformMatrix3x4dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x4dvEXTPROC glProgramUniformMatrix3x4dvEXT = (glProgramUniformMatrix3x4dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniformMatrix4x2dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x2dvEXTPROC glProgramUniformMatrix4x2dvEXT = (glProgramUniformMatrix4x2dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARB_1GPUShaderFP64_nglProgramUniformMatrix4x3dvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x3dvEXTPROC glProgramUniformMatrix4x3dvEXT = (glProgramUniformMatrix4x3dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x3dvEXT(program, location, count, transpose, value);
}

EXTERN_C_EXIT
