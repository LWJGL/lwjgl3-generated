/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glViewportArrayvNVPROC) (GLuint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glViewportIndexedfNVPROC) (GLuint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glViewportIndexedfvNVPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glScissorArrayvNVPROC) (GLuint, GLsizei, const GLint *);
typedef void (APIENTRY *glScissorIndexedNVPROC) (GLuint, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glScissorIndexedvNVPROC) (GLuint, const GLint *);
typedef void (APIENTRY *glDepthRangeArrayfvNVPROC) (GLuint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glDepthRangeIndexedfNVPROC) (GLuint, GLfloat, GLfloat);
typedef void (APIENTRY *glGetFloati_vNVPROC) (GLenum, GLuint, GLfloat *);
typedef void (APIENTRY *glEnableiNVPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDisableiNVPROC) (GLenum, GLuint);
typedef GLboolean (APIENTRY *glIsEnablediNVPROC) (GLenum, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglViewportArrayvNV(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glViewportArrayvNVPROC glViewportArrayvNV = (glViewportArrayvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glViewportArrayvNV(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglViewportIndexedfNV(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat w, jfloat h, jlong __functionAddress) {
	glViewportIndexedfNVPROC glViewportIndexedfNV = (glViewportIndexedfNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glViewportIndexedfNV(index, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglViewportIndexedfvNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glViewportIndexedfvNVPROC glViewportIndexedfvNV = (glViewportIndexedfvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glViewportIndexedfvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglScissorArrayvNV(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glScissorArrayvNVPROC glScissorArrayvNV = (glScissorArrayvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glScissorArrayvNV(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglScissorIndexedNV(JNIEnv *__env, jclass clazz, jint index, jint left, jint bottom, jint width, jint height, jlong __functionAddress) {
	glScissorIndexedNVPROC glScissorIndexedNV = (glScissorIndexedNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glScissorIndexedNV(index, left, bottom, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglScissorIndexedvNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glScissorIndexedvNVPROC glScissorIndexedvNV = (glScissorIndexedvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glScissorIndexedvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglDepthRangeArrayfvNV(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glDepthRangeArrayfvNVPROC glDepthRangeArrayfvNV = (glDepthRangeArrayfvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthRangeArrayfvNV(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglDepthRangeIndexedfNV(JNIEnv *__env, jclass clazz, jint index, jfloat n, jfloat f, jlong __functionAddress) {
	glDepthRangeIndexedfNVPROC glDepthRangeIndexedfNV = (glDepthRangeIndexedfNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthRangeIndexedfNV(index, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglGetFloati_1vNV(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetFloati_vNVPROC glGetFloati_vNV = (glGetFloati_vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFloati_vNV(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglEnableiNV(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glEnableiNVPROC glEnableiNV = (glEnableiNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableiNV(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglDisableiNV(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glDisableiNVPROC glDisableiNV = (glDisableiNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableiNV(target, index);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglIsEnablediNV(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glIsEnablediNVPROC glIsEnablediNV = (glIsEnablediNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsEnablediNV(target, index);
}

EXTERN_C_EXIT
