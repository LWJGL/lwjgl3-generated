/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawArraysInstancedPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedPROC) (jint, jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glCopyBufferSubDataPROC) (jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glPrimitiveRestartIndexPROC) (jint);
typedef void (APIENTRY *glTexBufferPROC) (jint, jint, jint);
typedef void (APIENTRY *glGetUniformIndicesPROC) (jint, jint, const intptr_t, intptr_t);
typedef void (APIENTRY *glGetActiveUniformsivPROC) (jint, jint, const intptr_t, jint, intptr_t);
typedef void (APIENTRY *glGetActiveUniformNamePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef jint (APIENTRY *glGetUniformBlockIndexPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGetActiveUniformBlockivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetActiveUniformBlockNamePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glUniformBlockBindingPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglDrawArraysInstanced(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount) {
	glDrawArraysInstancedPROC glDrawArraysInstanced = (glDrawArraysInstancedPROC)tlsGetFunction(346);
	UNUSED_PARAM(clazz)
	glDrawArraysInstanced(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglDrawElementsInstanced(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount) {
	glDrawElementsInstancedPROC glDrawElementsInstanced = (glDrawElementsInstancedPROC)tlsGetFunction(360);
	const intptr_t indices = (const intptr_t)indicesAddress;
	UNUSED_PARAM(clazz)
	glDrawElementsInstanced(mode, count, type, indices, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglCopyBufferSubData(JNIEnv *__env, jclass clazz, jint readTarget, jint writeTarget, jlong readOffset, jlong writeOffset, jlong size) {
	glCopyBufferSubDataPROC glCopyBufferSubData = (glCopyBufferSubDataPROC)tlsGetFunction(228);
	UNUSED_PARAM(clazz)
	glCopyBufferSubData(readTarget, writeTarget, (intptr_t)readOffset, (intptr_t)writeOffset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglPrimitiveRestartIndex(JNIEnv *__env, jclass clazz, jint index) {
	glPrimitiveRestartIndexPROC glPrimitiveRestartIndex = (glPrimitiveRestartIndexPROC)tlsGetFunction(1238);
	UNUSED_PARAM(clazz)
	glPrimitiveRestartIndex(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglTexBuffer(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer) {
	glTexBufferPROC glTexBuffer = (glTexBufferPROC)tlsGetFunction(1549);
	UNUSED_PARAM(clazz)
	glTexBuffer(target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglGetUniformIndices__IIJJ(JNIEnv *__env, jclass clazz, jint program, jint uniformCount, jlong uniformNamesAddress, jlong uniformIndicesAddress) {
	glGetUniformIndicesPROC glGetUniformIndices = (glGetUniformIndicesPROC)tlsGetFunction(746);
	const intptr_t uniformNames = (const intptr_t)uniformNamesAddress;
	intptr_t uniformIndices = (intptr_t)uniformIndicesAddress;
	UNUSED_PARAM(clazz)
	glGetUniformIndices(program, uniformCount, uniformNames, uniformIndices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglGetActiveUniformsiv__IIJIJ(JNIEnv *__env, jclass clazz, jint program, jint uniformCount, jlong uniformIndicesAddress, jint pname, jlong paramsAddress) {
	glGetActiveUniformsivPROC glGetActiveUniformsiv = (glGetActiveUniformsivPROC)tlsGetFunction(500);
	const intptr_t uniformIndices = (const intptr_t)uniformIndicesAddress;
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglGetActiveUniformName__IIIJJ(JNIEnv *__env, jclass clazz, jint program, jint uniformIndex, jint bufSize, jlong lengthAddress, jlong uniformNameAddress) {
	glGetActiveUniformNamePROC glGetActiveUniformName = (glGetActiveUniformNamePROC)tlsGetFunction(499);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t uniformName = (intptr_t)uniformNameAddress;
	UNUSED_PARAM(clazz)
	glGetActiveUniformName(program, uniformIndex, bufSize, length, uniformName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL31_nglGetUniformBlockIndex(JNIEnv *__env, jclass clazz, jint program, jlong uniformBlockNameAddress) {
	glGetUniformBlockIndexPROC glGetUniformBlockIndex = (glGetUniformBlockIndexPROC)tlsGetFunction(744);
	const intptr_t uniformBlockName = (const intptr_t)uniformBlockNameAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetUniformBlockIndex(program, uniformBlockName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglGetActiveUniformBlockiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint pname, jlong paramsAddress) {
	glGetActiveUniformBlockivPROC glGetActiveUniformBlockiv = (glGetActiveUniformBlockivPROC)tlsGetFunction(498);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglGetActiveUniformBlockName__IIIJJ(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint bufSize, jlong lengthAddress, jlong uniformBlockNameAddress) {
	glGetActiveUniformBlockNamePROC glGetActiveUniformBlockName = (glGetActiveUniformBlockNamePROC)tlsGetFunction(497);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t uniformBlockName = (intptr_t)uniformBlockNameAddress;
	UNUSED_PARAM(clazz)
	glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL31_nglUniformBlockBinding(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint uniformBlockBinding) {
	glUniformBlockBindingPROC glUniformBlockBinding = (glUniformBlockBindingPROC)tlsGetFunction(1782);
	UNUSED_PARAM(clazz)
	glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
}

EXTERN_C_EXIT