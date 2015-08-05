/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glTexStorage1DEXTPROC) (GLenum, GLsizei, GLenum, GLsizei);
typedef void (APIENTRY *glTexStorage2DEXTPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glTexStorage3DEXTPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei);
typedef void (APIENTRY *glTextureStorage1DEXTPROC) (GLuint, GLenum, GLsizei, GLenum, GLsizei);
typedef void (APIENTRY *glTextureStorage2DEXTPROC) (GLuint, GLenum, GLsizei, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glTextureStorage3DEXTPROC) (GLuint, GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureStorage_nglTexStorage1DEXT(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jlong __functionAddress) {
	glTexStorage1DEXTPROC glTexStorage1DEXT = (glTexStorage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorage1DEXT(target, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureStorage_nglTexStorage2DEXT(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glTexStorage2DEXTPROC glTexStorage2DEXT = (glTexStorage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorage2DEXT(target, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureStorage_nglTexStorage3DEXT(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jint depth, jlong __functionAddress) {
	glTexStorage3DEXTPROC glTexStorage3DEXT = (glTexStorage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorage3DEXT(target, levels, internalformat, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureStorage_nglTextureStorage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint levels, jint internalformat, jint width, jlong __functionAddress) {
	glTextureStorage1DEXTPROC glTextureStorage1DEXT = (glTextureStorage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureStorage1DEXT(texture, target, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureStorage_nglTextureStorage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint levels, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glTextureStorage2DEXTPROC glTextureStorage2DEXT = (glTextureStorage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureStorage2DEXT(texture, target, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureStorage_nglTextureStorage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint levels, jint internalformat, jint width, jint height, jint depth, jlong __functionAddress) {
	glTextureStorage3DEXTPROC glTextureStorage3DEXT = (glTextureStorage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureStorage3DEXT(texture, target, levels, internalformat, width, height, depth);
}

EXTERN_C_EXIT
