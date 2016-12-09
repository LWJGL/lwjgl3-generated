/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jlong (APIENTRY *glGetTextureHandleNVPROC) (jint);
typedef jlong (APIENTRY *glGetTextureSamplerHandleNVPROC) (jint, jint);
typedef void (APIENTRY *glMakeTextureHandleResidentNVPROC) (jlong);
typedef void (APIENTRY *glMakeTextureHandleNonResidentNVPROC) (jlong);
typedef jlong (APIENTRY *glGetImageHandleNVPROC) (jint, jint, jboolean, jint, jint);
typedef void (APIENTRY *glMakeImageHandleResidentNVPROC) (jlong, jint);
typedef void (APIENTRY *glMakeImageHandleNonResidentNVPROC) (jlong);
typedef void (APIENTRY *glUniformHandleui64NVPROC) (jint, jlong);
typedef void (APIENTRY *glUniformHandleui64vNVPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniformHandleui64NVPROC) (jint, jint, jlong);
typedef void (APIENTRY *glProgramUniformHandleui64vNVPROC) (jint, jint, jint, const intptr_t);
typedef jboolean (APIENTRY *glIsTextureHandleResidentNVPROC) (jlong);
typedef jboolean (APIENTRY *glIsImageHandleResidentNVPROC) (jlong);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglGetTextureHandleNV(JNIEnv *__env, jclass clazz, jint texture) {
	glGetTextureHandleNVPROC glGetTextureHandleNV = (glGetTextureHandleNVPROC)tlsGetFunction(720);
	UNUSED_PARAM(clazz)
	return (jlong)glGetTextureHandleNV(texture);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglGetTextureSamplerHandleNV(JNIEnv *__env, jclass clazz, jint texture, jint sampler) {
	glGetTextureSamplerHandleNVPROC glGetTextureSamplerHandleNV = (glGetTextureSamplerHandleNVPROC)tlsGetFunction(736);
	UNUSED_PARAM(clazz)
	return (jlong)glGetTextureSamplerHandleNV(texture, sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglMakeTextureHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle) {
	glMakeTextureHandleResidentNVPROC glMakeTextureHandleResidentNV = (glMakeTextureHandleResidentNVPROC)tlsGetFunction(925);
	UNUSED_PARAM(clazz)
	glMakeTextureHandleResidentNV(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglMakeTextureHandleNonResidentNV(JNIEnv *__env, jclass clazz, jlong handle) {
	glMakeTextureHandleNonResidentNVPROC glMakeTextureHandleNonResidentNV = (glMakeTextureHandleNonResidentNVPROC)tlsGetFunction(923);
	UNUSED_PARAM(clazz)
	glMakeTextureHandleNonResidentNV(handle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglGetImageHandleNV(JNIEnv *__env, jclass clazz, jint texture, jint level, jboolean layered, jint layer, jint format) {
	glGetImageHandleNVPROC glGetImageHandleNV = (glGetImageHandleNVPROC)tlsGetFunction(560);
	UNUSED_PARAM(clazz)
	return (jlong)glGetImageHandleNV(texture, level, layered, layer, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglMakeImageHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle, jint access) {
	glMakeImageHandleResidentNVPROC glMakeImageHandleResidentNV = (glMakeImageHandleResidentNVPROC)tlsGetFunction(919);
	UNUSED_PARAM(clazz)
	glMakeImageHandleResidentNV(handle, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglMakeImageHandleNonResidentNV(JNIEnv *__env, jclass clazz, jlong handle) {
	glMakeImageHandleNonResidentNVPROC glMakeImageHandleNonResidentNV = (glMakeImageHandleNonResidentNVPROC)tlsGetFunction(917);
	UNUSED_PARAM(clazz)
	glMakeImageHandleNonResidentNV(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglUniformHandleui64NV(JNIEnv *__env, jclass clazz, jint location, jlong value) {
	glUniformHandleui64NVPROC glUniformHandleui64NV = (glUniformHandleui64NVPROC)tlsGetFunction(1785);
	UNUSED_PARAM(clazz)
	glUniformHandleui64NV(location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglUniformHandleui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valuesAddress) {
	glUniformHandleui64vNVPROC glUniformHandleui64vNV = (glUniformHandleui64vNVPROC)tlsGetFunction(1787);
	const intptr_t values = (const intptr_t)valuesAddress;
	UNUSED_PARAM(clazz)
	glUniformHandleui64vNV(location, count, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglProgramUniformHandleui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong value) {
	glProgramUniformHandleui64NVPROC glProgramUniformHandleui64NV = (glProgramUniformHandleui64NVPROC)tlsGetFunction(1355);
	UNUSED_PARAM(clazz)
	glProgramUniformHandleui64NV(program, location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglProgramUniformHandleui64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valuesAddress) {
	glProgramUniformHandleui64vNVPROC glProgramUniformHandleui64vNV = (glProgramUniformHandleui64vNVPROC)tlsGetFunction(1357);
	const intptr_t values = (const intptr_t)valuesAddress;
	UNUSED_PARAM(clazz)
	glProgramUniformHandleui64vNV(program, location, count, values);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglIsTextureHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle) {
	glIsTextureHandleResidentNVPROC glIsTextureHandleResidentNV = (glIsTextureHandleResidentNVPROC)tlsGetFunction(885);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsTextureHandleResidentNV(handle);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglIsImageHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle) {
	glIsImageHandleResidentNVPROC glIsImageHandleResidentNV = (glIsImageHandleResidentNVPROC)tlsGetFunction(865);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsImageHandleResidentNV(handle);
}

EXTERN_C_EXIT