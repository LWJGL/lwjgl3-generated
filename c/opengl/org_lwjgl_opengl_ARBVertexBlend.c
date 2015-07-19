/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glWeightfvARBPROC) (GLint, GLfloat *);
typedef void (APIENTRY *glWeightbvARBPROC) (GLint, GLbyte *);
typedef void (APIENTRY *glWeightubvARBPROC) (GLint, GLubyte *);
typedef void (APIENTRY *glWeightsvARBPROC) (GLint, GLshort *);
typedef void (APIENTRY *glWeightusvARBPROC) (GLint, GLushort *);
typedef void (APIENTRY *glWeightivARBPROC) (GLint, GLint *);
typedef void (APIENTRY *glWeightuivARBPROC) (GLint, GLuint *);
typedef void (APIENTRY *glWeightdvARBPROC) (GLint, GLdouble *);
typedef void (APIENTRY *glWeightPointerARBPROC) (GLint, GLenum, GLsizei, void *);
typedef void (APIENTRY *glVertexBlendARBPROC) (GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightfvARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress, jlong __functionAddress) {
	GLfloat *weights = (GLfloat *)(intptr_t)weightsAddress;
	glWeightfvARBPROC glWeightfvARB = (glWeightfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWeightfvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightbvARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress, jlong __functionAddress) {
	GLbyte *weights = (GLbyte *)(intptr_t)weightsAddress;
	glWeightbvARBPROC glWeightbvARB = (glWeightbvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWeightbvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightubvARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress, jlong __functionAddress) {
	GLubyte *weights = (GLubyte *)(intptr_t)weightsAddress;
	glWeightubvARBPROC glWeightubvARB = (glWeightubvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWeightubvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightsvARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress, jlong __functionAddress) {
	GLshort *weights = (GLshort *)(intptr_t)weightsAddress;
	glWeightsvARBPROC glWeightsvARB = (glWeightsvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWeightsvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightusvARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress, jlong __functionAddress) {
	GLushort *weights = (GLushort *)(intptr_t)weightsAddress;
	glWeightusvARBPROC glWeightusvARB = (glWeightusvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWeightusvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightivARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress, jlong __functionAddress) {
	GLint *weights = (GLint *)(intptr_t)weightsAddress;
	glWeightivARBPROC glWeightivARB = (glWeightivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWeightivARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightuivARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress, jlong __functionAddress) {
	GLuint *weights = (GLuint *)(intptr_t)weightsAddress;
	glWeightuivARBPROC glWeightuivARB = (glWeightuivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWeightuivARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightdvARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress, jlong __functionAddress) {
	GLdouble *weights = (GLdouble *)(intptr_t)weightsAddress;
	glWeightdvARBPROC glWeightdvARB = (glWeightdvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWeightdvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightPointerARB(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	void *pointer = (void *)(intptr_t)pointerAddress;
	glWeightPointerARBPROC glWeightPointerARB = (glWeightPointerARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWeightPointerARB(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglVertexBlendARB(JNIEnv *__env, jclass clazz, jint count, jlong __functionAddress) {
	glVertexBlendARBPROC glVertexBlendARB = (glVertexBlendARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexBlendARB(count);
}

EXTERN_C_EXIT
