/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glMakeBufferResidentNVPROC) (jint, jint);
typedef void (APIENTRY *glMakeBufferNonResidentNVPROC) (jint);
typedef jboolean (APIENTRY *glIsBufferResidentNVPROC) (jint);
typedef void (APIENTRY *glMakeNamedBufferResidentNVPROC) (jint, jint);
typedef void (APIENTRY *glMakeNamedBufferNonResidentNVPROC) (jint);
typedef jboolean (APIENTRY *glIsNamedBufferResidentNVPROC) (jint);
typedef void (APIENTRY *glGetBufferParameterui64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetNamedBufferParameterui64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetIntegerui64vNVPROC) (jint, intptr_t);
typedef void (APIENTRY *glUniformui64NVPROC) (jint, jlong);
typedef void (APIENTRY *glUniformui64vNVPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetUniformui64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniformui64NVPROC) (jint, jint, jlong);
typedef void (APIENTRY *glProgramUniformui64vNVPROC) (jint, jint, jint, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglMakeBufferResidentNV(JNIEnv *__env, jclass clazz, jint target, jint access) {
	glMakeBufferResidentNVPROC glMakeBufferResidentNV = (glMakeBufferResidentNVPROC)tlsGetFunction(915);
	UNUSED_PARAM(clazz)
	glMakeBufferResidentNV(target, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglMakeBufferNonResidentNV(JNIEnv *__env, jclass clazz, jint target) {
	glMakeBufferNonResidentNVPROC glMakeBufferNonResidentNV = (glMakeBufferNonResidentNVPROC)tlsGetFunction(914);
	UNUSED_PARAM(clazz)
	glMakeBufferNonResidentNV(target);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglIsBufferResidentNV(JNIEnv *__env, jclass clazz, jint target) {
	glIsBufferResidentNVPROC glIsBufferResidentNV = (glIsBufferResidentNVPROC)tlsGetFunction(856);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsBufferResidentNV(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglMakeNamedBufferResidentNV(JNIEnv *__env, jclass clazz, jint buffer, jint access) {
	glMakeNamedBufferResidentNVPROC glMakeNamedBufferResidentNV = (glMakeNamedBufferResidentNVPROC)tlsGetFunction(921);
	UNUSED_PARAM(clazz)
	glMakeNamedBufferResidentNV(buffer, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglMakeNamedBufferNonResidentNV(JNIEnv *__env, jclass clazz, jint buffer) {
	glMakeNamedBufferNonResidentNVPROC glMakeNamedBufferNonResidentNV = (glMakeNamedBufferNonResidentNVPROC)tlsGetFunction(920);
	UNUSED_PARAM(clazz)
	glMakeNamedBufferNonResidentNV(buffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglIsNamedBufferResidentNV(JNIEnv *__env, jclass clazz, jint buffer) {
	glIsNamedBufferResidentNVPROC glIsNamedBufferResidentNV = (glIsNamedBufferResidentNVPROC)tlsGetFunction(867);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsNamedBufferResidentNV(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetBufferParameterui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetBufferParameterui64vNVPROC glGetBufferParameterui64vNV = (glGetBufferParameterui64vNVPROC)tlsGetFunction(512);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetBufferParameterui64vNV(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetNamedBufferParameterui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress) {
	glGetNamedBufferParameterui64vNVPROC glGetNamedBufferParameterui64vNV = (glGetNamedBufferParameterui64vNVPROC)tlsGetFunction(599);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetNamedBufferParameterui64vNV(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetIntegerui64vNV__IJ(JNIEnv *__env, jclass clazz, jint value, jlong resultAddress) {
	glGetIntegerui64vNVPROC glGetIntegerui64vNV = (glGetIntegerui64vNVPROC)tlsGetFunction(567);
	intptr_t result = (intptr_t)resultAddress;
	UNUSED_PARAM(clazz)
	glGetIntegerui64vNV(value, result);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglUniformui64NV(JNIEnv *__env, jclass clazz, jint location, jlong value) {
	glUniformui64NVPROC glUniformui64NV = (glUniformui64NVPROC)tlsGetFunction(1810);
	UNUSED_PARAM(clazz)
	glUniformui64NV(location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglUniformui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniformui64vNVPROC glUniformui64vNV = (glUniformui64vNVPROC)tlsGetFunction(1811);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformui64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetUniformui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
	glGetUniformui64vNVPROC glGetUniformui64vNV = (glGetUniformui64vNVPROC)tlsGetFunction(759);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetUniformui64vNV(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglProgramUniformui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong value) {
	glProgramUniformui64NVPROC glProgramUniformui64NV = (glProgramUniformui64NVPROC)tlsGetFunction(1394);
	UNUSED_PARAM(clazz)
	glProgramUniformui64NV(program, location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglProgramUniformui64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
	glProgramUniformui64vNVPROC glProgramUniformui64vNV = (glProgramUniformui64vNVPROC)tlsGetFunction(1395);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glProgramUniformui64vNV(program, location, count, value);
}

EXTERN_C_EXIT
