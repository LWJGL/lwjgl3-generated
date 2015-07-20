/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glDeleteFencesNVPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glGenFencesNVPROC) (GLsizei, GLuint *);
typedef GLboolean (APIENTRY *glIsFenceNVPROC) (GLuint);
typedef GLboolean (APIENTRY *glTestFenceNVPROC) (GLuint);
typedef void (APIENTRY *glGetFenceivNVPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glFinishFenceNVPROC) (GLuint);
typedef void (APIENTRY *glSetFenceNVPROC) (GLuint, GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFence_nglDeleteFencesNV(JNIEnv *__env, jclass clazz, jint n, jlong fencesAddress, jlong __functionAddress) {
	const GLuint *fences = (const GLuint *)(intptr_t)fencesAddress;
	glDeleteFencesNVPROC glDeleteFencesNV = (glDeleteFencesNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteFencesNV(n, fences);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFence_nglGenFencesNV(JNIEnv *__env, jclass clazz, jint n, jlong fencesAddress, jlong __functionAddress) {
	GLuint *fences = (GLuint *)(intptr_t)fencesAddress;
	glGenFencesNVPROC glGenFencesNV = (glGenFencesNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenFencesNV(n, fences);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVFence_nglIsFenceNV(JNIEnv *__env, jclass clazz, jint fence, jlong __functionAddress) {
	glIsFenceNVPROC glIsFenceNV = (glIsFenceNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsFenceNV(fence);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVFence_nglTestFenceNV(JNIEnv *__env, jclass clazz, jint fence, jlong __functionAddress) {
	glTestFenceNVPROC glTestFenceNV = (glTestFenceNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glTestFenceNV(fence);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFence_nglGetFenceivNV(JNIEnv *__env, jclass clazz, jint fence, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetFenceivNVPROC glGetFenceivNV = (glGetFenceivNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFenceivNV(fence, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFence_nglFinishFenceNV(JNIEnv *__env, jclass clazz, jint fence, jlong __functionAddress) {
	glFinishFenceNVPROC glFinishFenceNV = (glFinishFenceNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFinishFenceNV(fence);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFence_nglSetFenceNV(JNIEnv *__env, jclass clazz, jint fence, jint condition, jlong __functionAddress) {
	glSetFenceNVPROC glSetFenceNV = (glSetFenceNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSetFenceNV(fence, condition);
}

EXTERN_C_EXIT
