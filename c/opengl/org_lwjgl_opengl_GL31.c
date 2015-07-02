/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glDrawArraysInstancedPROC) (GLenum, GLint, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glDrawElementsInstancedPROC) (GLenum, GLsizei, GLenum, const GLvoid *, GLsizei);
typedef GLvoid (APIENTRY *glCopyBufferSubDataPROC) (GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr);
typedef GLvoid (APIENTRY *glPrimitiveRestartIndexPROC) (GLuint);
typedef GLvoid (APIENTRY *glTexBufferPROC) (GLenum, GLenum, GLuint);
typedef GLvoid (APIENTRY *glGetUniformIndicesPROC) (GLuint, GLsizei, const GLchar **, GLuint *);
typedef GLvoid (APIENTRY *glGetActiveUniformsivPROC) (GLuint, GLsizei, const GLuint *, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetActiveUniformNamePROC) (GLuint, GLuint, GLsizei, GLsizei *, GLchar *);
typedef GLuint (APIENTRY *glGetUniformBlockIndexPROC) (GLuint, const GLchar *);
typedef GLvoid (APIENTRY *glGetActiveUniformBlockivPROC) (GLuint, GLuint, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetActiveUniformBlockNamePROC) (GLuint, GLuint, GLsizei, GLsizei *, GLchar *);
typedef GLvoid (APIENTRY *glUniformBlockBindingPROC) (GLuint, GLuint, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglDrawArraysInstanced(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount, jlong __functionAddress) {
	glDrawArraysInstancedPROC glDrawArraysInstanced = (glDrawArraysInstancedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArraysInstanced(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglDrawElementsInstanced(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jlong __functionAddress) {
	const GLvoid *indices = (const GLvoid *)(intptr_t)indicesAddress;
	glDrawElementsInstancedPROC glDrawElementsInstanced = (glDrawElementsInstancedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstanced(mode, count, type, indices, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglCopyBufferSubData(JNIEnv *__env, jclass clazz, jint readTarget, jint writeTarget, jlong readOffset, jlong writeOffset, jlong size, jlong __functionAddress) {
	glCopyBufferSubDataPROC glCopyBufferSubData = (glCopyBufferSubDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyBufferSubData(readTarget, writeTarget, (GLintptr)readOffset, (GLintptr)writeOffset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglPrimitiveRestartIndex(JNIEnv *__env, jclass clazz, jint index, jlong __functionAddress) {
	glPrimitiveRestartIndexPROC glPrimitiveRestartIndex = (glPrimitiveRestartIndexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPrimitiveRestartIndex(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglTexBuffer(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong __functionAddress) {
	glTexBufferPROC glTexBuffer = (glTexBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexBuffer(target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglGetUniformIndices(JNIEnv *__env, jclass clazz, jint program, jint uniformCount, jlong uniformNamesAddress, jlong uniformIndicesAddress, jlong __functionAddress) {
	const GLchar **uniformNames = (const GLchar **)(intptr_t)uniformNamesAddress;
	GLuint *uniformIndices = (GLuint *)(intptr_t)uniformIndicesAddress;
	glGetUniformIndicesPROC glGetUniformIndices = (glGetUniformIndicesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformIndices(program, uniformCount, uniformNames, uniformIndices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglGetActiveUniformsiv(JNIEnv *__env, jclass clazz, jint program, jint uniformCount, jlong uniformIndicesAddress, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *uniformIndices = (const GLuint *)(intptr_t)uniformIndicesAddress;
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetActiveUniformsivPROC glGetActiveUniformsiv = (glGetActiveUniformsivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglGetActiveUniformName(JNIEnv *__env, jclass clazz, jint program, jint uniformIndex, jint bufSize, jlong lengthAddress, jlong uniformNameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *uniformName = (GLchar *)(intptr_t)uniformNameAddress;
	glGetActiveUniformNamePROC glGetActiveUniformName = (glGetActiveUniformNamePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveUniformName(program, uniformIndex, bufSize, length, uniformName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL31_nglGetUniformBlockIndex(JNIEnv *__env, jclass clazz, jint program, jlong uniformBlockNameAddress, jlong __functionAddress) {
	const GLchar *uniformBlockName = (const GLchar *)(intptr_t)uniformBlockNameAddress;
	glGetUniformBlockIndexPROC glGetUniformBlockIndex = (glGetUniformBlockIndexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetUniformBlockIndex(program, uniformBlockName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglGetActiveUniformBlockiv(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetActiveUniformBlockivPROC glGetActiveUniformBlockiv = (glGetActiveUniformBlockivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglGetActiveUniformBlockName(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint bufSize, jlong lengthAddress, jlong uniformBlockNameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *uniformBlockName = (GLchar *)(intptr_t)uniformBlockNameAddress;
	glGetActiveUniformBlockNamePROC glGetActiveUniformBlockName = (glGetActiveUniformBlockNamePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglUniformBlockBinding(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint uniformBlockBinding, jlong __functionAddress) {
	glUniformBlockBindingPROC glUniformBlockBinding = (glUniformBlockBindingPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
}

EXTERN_C_EXIT
