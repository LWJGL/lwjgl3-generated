/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLuint64 (APIENTRY *glGetTextureHandleARBPROC) (GLuint);
typedef GLuint64 (APIENTRY *glGetTextureSamplerHandleARBPROC) (GLuint, GLuint);
typedef void (APIENTRY *glMakeTextureHandleResidentARBPROC) (GLuint64);
typedef void (APIENTRY *glMakeTextureHandleNonResidentARBPROC) (GLuint64);
typedef GLuint64 (APIENTRY *glGetImageHandleARBPROC) (GLuint, GLint, GLboolean, GLint, GLenum);
typedef void (APIENTRY *glMakeImageHandleResidentARBPROC) (GLuint64, GLenum);
typedef void (APIENTRY *glMakeImageHandleNonResidentARBPROC) (GLuint64);
typedef void (APIENTRY *glUniformHandleui64ARBPROC) (GLint, GLuint64);
typedef void (APIENTRY *glUniformHandleui64vARBPROC) (GLint, GLsizei, const GLuint64 *);
typedef void (APIENTRY *glProgramUniformHandleui64ARBPROC) (GLuint, GLint, GLuint64);
typedef void (APIENTRY *glProgramUniformHandleui64vARBPROC) (GLuint, GLint, GLsizei, const GLuint64 *);
typedef GLboolean (APIENTRY *glIsTextureHandleResidentARBPROC) (GLuint64);
typedef GLboolean (APIENTRY *glIsImageHandleResidentARBPROC) (GLuint64);
typedef void (APIENTRY *glVertexAttribL1ui64ARBPROC) (GLuint, GLuint64);
typedef void (APIENTRY *glVertexAttribL1ui64vARBPROC) (GLuint, const GLuint64 *);
typedef void (APIENTRY *glGetVertexAttribLui64vARBPROC) (GLuint, GLenum, GLuint64 *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglGetTextureHandleARB(JNIEnv *__env, jclass clazz, jint texture, jlong __functionAddress) {
	glGetTextureHandleARBPROC glGetTextureHandleARB = (glGetTextureHandleARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glGetTextureHandleARB(texture);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglGetTextureSamplerHandleARB(JNIEnv *__env, jclass clazz, jint texture, jint sampler, jlong __functionAddress) {
	glGetTextureSamplerHandleARBPROC glGetTextureSamplerHandleARB = (glGetTextureSamplerHandleARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glGetTextureSamplerHandleARB(texture, sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglMakeTextureHandleResidentARB(JNIEnv *__env, jclass clazz, jlong handle, jlong __functionAddress) {
	glMakeTextureHandleResidentARBPROC glMakeTextureHandleResidentARB = (glMakeTextureHandleResidentARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeTextureHandleResidentARB(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglMakeTextureHandleNonResidentARB(JNIEnv *__env, jclass clazz, jlong handle, jlong __functionAddress) {
	glMakeTextureHandleNonResidentARBPROC glMakeTextureHandleNonResidentARB = (glMakeTextureHandleNonResidentARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeTextureHandleNonResidentARB(handle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglGetImageHandleARB(JNIEnv *__env, jclass clazz, jint texture, jint level, jboolean layered, jint layer, jint format, jlong __functionAddress) {
	glGetImageHandleARBPROC glGetImageHandleARB = (glGetImageHandleARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glGetImageHandleARB(texture, level, layered, layer, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglMakeImageHandleResidentARB(JNIEnv *__env, jclass clazz, jlong handle, jint access, jlong __functionAddress) {
	glMakeImageHandleResidentARBPROC glMakeImageHandleResidentARB = (glMakeImageHandleResidentARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeImageHandleResidentARB(handle, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglMakeImageHandleNonResidentARB(JNIEnv *__env, jclass clazz, jlong handle, jlong __functionAddress) {
	glMakeImageHandleNonResidentARBPROC glMakeImageHandleNonResidentARB = (glMakeImageHandleNonResidentARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMakeImageHandleNonResidentARB(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglUniformHandleui64ARB(JNIEnv *__env, jclass clazz, jint location, jlong value, jlong __functionAddress) {
	glUniformHandleui64ARBPROC glUniformHandleui64ARB = (glUniformHandleui64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformHandleui64ARB(location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglUniformHandleui64vARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valuesAddress, jlong __functionAddress) {
	const GLuint64 *values = (const GLuint64 *)(intptr_t)valuesAddress;
	glUniformHandleui64vARBPROC glUniformHandleui64vARB = (glUniformHandleui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformHandleui64vARB(location, count, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglProgramUniformHandleui64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong value, jlong __functionAddress) {
	glProgramUniformHandleui64ARBPROC glProgramUniformHandleui64ARB = (glProgramUniformHandleui64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformHandleui64ARB(program, location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglProgramUniformHandleui64vARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valuesAddress, jlong __functionAddress) {
	const GLuint64 *values = (const GLuint64 *)(intptr_t)valuesAddress;
	glProgramUniformHandleui64vARBPROC glProgramUniformHandleui64vARB = (glProgramUniformHandleui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformHandleui64vARB(program, location, count, values);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglIsTextureHandleResidentARB(JNIEnv *__env, jclass clazz, jlong handle, jlong __functionAddress) {
	glIsTextureHandleResidentARBPROC glIsTextureHandleResidentARB = (glIsTextureHandleResidentARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsTextureHandleResidentARB(handle);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglIsImageHandleResidentARB(JNIEnv *__env, jclass clazz, jlong handle, jlong __functionAddress) {
	glIsImageHandleResidentARBPROC glIsImageHandleResidentARB = (glIsImageHandleResidentARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsImageHandleResidentARB(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglVertexAttribL1ui64ARB(JNIEnv *__env, jclass clazz, jint index, jlong x, jlong __functionAddress) {
	glVertexAttribL1ui64ARBPROC glVertexAttribL1ui64ARB = (glVertexAttribL1ui64ARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL1ui64ARB(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglVertexAttribL1ui64vARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint64 *v = (const GLuint64 *)(intptr_t)vAddress;
	glVertexAttribL1ui64vARBPROC glVertexAttribL1ui64vARB = (glVertexAttribL1ui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL1ui64vARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglGetVertexAttribLui64vARB(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint64 *params = (GLuint64 *)(intptr_t)paramsAddress;
	glGetVertexAttribLui64vARBPROC glGetVertexAttribLui64vARB = (glGetVertexAttribLui64vARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribLui64vARB(index, pname, params);
}

EXTERN_C_EXIT
