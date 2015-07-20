/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glColorMaskIndexedEXTPROC) (GLuint, GLboolean, GLboolean, GLboolean, GLboolean);
typedef void (APIENTRY *glGetBooleanIndexedvEXTPROC) (GLenum, GLuint, GLboolean *);
typedef void (APIENTRY *glGetIntegerIndexedvEXTPROC) (GLenum, GLuint, GLint *);
typedef void (APIENTRY *glEnableIndexedEXTPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDisableIndexedEXTPROC) (GLenum, GLuint);
typedef GLboolean (APIENTRY *glIsEnabledIndexedEXTPROC) (GLenum, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_nglColorMaskIndexedEXT(JNIEnv *__env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a, jlong __functionAddress) {
	glColorMaskIndexedEXTPROC glColorMaskIndexedEXT = (glColorMaskIndexedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorMaskIndexedEXT(index, r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_nglGetBooleanIndexedvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress, jlong __functionAddress) {
	GLboolean *data = (GLboolean *)(intptr_t)dataAddress;
	glGetBooleanIndexedvEXTPROC glGetBooleanIndexedvEXT = (glGetBooleanIndexedvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBooleanIndexedvEXT(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_nglGetIntegerIndexedvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetIntegerIndexedvEXTPROC glGetIntegerIndexedvEXT = (glGetIntegerIndexedvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetIntegerIndexedvEXT(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_nglEnableIndexedEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glEnableIndexedEXTPROC glEnableIndexedEXT = (glEnableIndexedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableIndexedEXT(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_nglDisableIndexedEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glDisableIndexedEXTPROC glDisableIndexedEXT = (glDisableIndexedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableIndexedEXT(target, index);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_nglIsEnabledIndexedEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glIsEnabledIndexedEXTPROC glIsEnabledIndexedEXT = (glIsEnabledIndexedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsEnabledIndexedEXT(target, index);
}

EXTERN_C_EXIT
