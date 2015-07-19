/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glClearColorIiEXTPROC) (GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glClearColorIuiEXTPROC) (GLuint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glTexParameterIivEXTPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glTexParameterIuivEXTPROC) (GLenum, GLenum, GLuint *);
typedef void (APIENTRY *glGetTexParameterIivEXTPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetTexParameterIuivEXTPROC) (GLenum, GLenum, GLuint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_nglClearColorIiEXT(JNIEnv *__env, jclass clazz, jint r, jint g, jint b, jint a, jlong __functionAddress) {
	glClearColorIiEXTPROC glClearColorIiEXT = (glClearColorIiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearColorIiEXT(r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_nglClearColorIuiEXT(JNIEnv *__env, jclass clazz, jint r, jint g, jint b, jint a, jlong __functionAddress) {
	glClearColorIuiEXTPROC glClearColorIuiEXT = (glClearColorIuiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearColorIuiEXT(r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_nglTexParameterIivEXT(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glTexParameterIivEXTPROC glTexParameterIivEXT = (glTexParameterIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterIivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_nglTexParameterIuivEXT(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glTexParameterIuivEXTPROC glTexParameterIuivEXT = (glTexParameterIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterIuivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_nglGetTexParameterIivEXT(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTexParameterIivEXTPROC glGetTexParameterIivEXT = (glGetTexParameterIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterIivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_nglGetTexParameterIuivEXT(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetTexParameterIuivEXTPROC glGetTexParameterIuivEXT = (glGetTexParameterIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterIuivEXT(target, pname, params);
}

EXTERN_C_EXIT
