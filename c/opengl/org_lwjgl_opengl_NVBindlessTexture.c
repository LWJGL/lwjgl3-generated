/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLuint64 (APIENTRY *glGetTextureHandleNVPROC) (GLuint);
typedef GLuint64 (APIENTRY *glGetTextureSamplerHandleNVPROC) (GLuint, GLuint);
typedef void (APIENTRY *glMakeTextureHandleResidentNVPROC) (GLuint64);
typedef void (APIENTRY *glMakeTextureHandleNonResidentNVPROC) (GLuint64);
typedef GLuint64 (APIENTRY *glGetImageHandleNVPROC) (GLuint, GLint, GLboolean, GLint, GLenum);
typedef void (APIENTRY *glMakeImageHandleResidentNVPROC) (GLuint64, GLenum);
typedef void (APIENTRY *glMakeImageHandleNonResidentNVPROC) (GLuint64);
typedef void (APIENTRY *glUniformHandleui64NVPROC) (GLint, GLuint64);
typedef void (APIENTRY *glUniformHandleui64vNVPROC) (GLint, GLsizei, const GLuint64 *);
typedef void (APIENTRY *glProgramUniformHandleui64NVPROC) (GLuint, GLint, GLuint64);
typedef void (APIENTRY *glProgramUniformHandleui64vNVPROC) (GLuint, GLint, GLsizei, const GLuint64 *);
typedef GLboolean (APIENTRY *glIsTextureHandleResidentNVPROC) (GLuint64);
typedef GLboolean (APIENTRY *glIsImageHandleResidentNVPROC) (GLuint64);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglGetTextureHandleNV(JNIEnv *__env, jclass clazz, jint texture, jlong __functionAddress) {
	glGetTextureHandleNVPROC glGetTextureHandleNV = (glGetTextureHandleNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glGetTextureHandleNV(texture);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglGetTextureSamplerHandleNV(JNIEnv *__env, jclass clazz, jint texture, jint sampler, jlong __functionAddress) {
	glGetTextureSamplerHandleNVPROC glGetTextureSamplerHandleNV = (glGetTextureSamplerHandleNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glGetTextureSamplerHandleNV(texture, sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglMakeTextureHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle, jlong __functionAddress) {
	glMakeTextureHandleResidentNVPROC glMakeTextureHandleResidentNV = (glMakeTextureHandleResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeTextureHandleResidentNV(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglMakeTextureHandleNonResidentNV(JNIEnv *__env, jclass clazz, jlong handle, jlong __functionAddress) {
	glMakeTextureHandleNonResidentNVPROC glMakeTextureHandleNonResidentNV = (glMakeTextureHandleNonResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeTextureHandleNonResidentNV(handle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglGetImageHandleNV(JNIEnv *__env, jclass clazz, jint texture, jint level, jboolean layered, jint layer, jint format, jlong __functionAddress) {
	glGetImageHandleNVPROC glGetImageHandleNV = (glGetImageHandleNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glGetImageHandleNV(texture, level, layered, layer, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglMakeImageHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle, jint access, jlong __functionAddress) {
	glMakeImageHandleResidentNVPROC glMakeImageHandleResidentNV = (glMakeImageHandleResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeImageHandleResidentNV(handle, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglMakeImageHandleNonResidentNV(JNIEnv *__env, jclass clazz, jlong handle, jlong __functionAddress) {
	glMakeImageHandleNonResidentNVPROC glMakeImageHandleNonResidentNV = (glMakeImageHandleNonResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeImageHandleNonResidentNV(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglUniformHandleui64NV(JNIEnv *__env, jclass clazz, jint location, jlong value, jlong __functionAddress) {
	glUniformHandleui64NVPROC glUniformHandleui64NV = (glUniformHandleui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformHandleui64NV(location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglUniformHandleui64vNV(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valuesAddress, jlong __functionAddress) {
	const GLuint64 *values = (const GLuint64 *)(intptr_t)valuesAddress;
	glUniformHandleui64vNVPROC glUniformHandleui64vNV = (glUniformHandleui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformHandleui64vNV(location, count, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglProgramUniformHandleui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong value, jlong __functionAddress) {
	glProgramUniformHandleui64NVPROC glProgramUniformHandleui64NV = (glProgramUniformHandleui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformHandleui64NV(program, location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglProgramUniformHandleui64vNV(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valuesAddress, jlong __functionAddress) {
	const GLuint64 *values = (const GLuint64 *)(intptr_t)valuesAddress;
	glProgramUniformHandleui64vNVPROC glProgramUniformHandleui64vNV = (glProgramUniformHandleui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformHandleui64vNV(program, location, count, values);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglIsTextureHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle, jlong __functionAddress) {
	glIsTextureHandleResidentNVPROC glIsTextureHandleResidentNV = (glIsTextureHandleResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsTextureHandleResidentNV(handle);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVBindlessTexture_nglIsImageHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle, jlong __functionAddress) {
	glIsImageHandleResidentNVPROC glIsImageHandleResidentNV = (glIsImageHandleResidentNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsImageHandleResidentNV(handle);
}

EXTERN_C_EXIT
