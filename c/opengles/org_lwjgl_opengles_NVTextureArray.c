/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glTexImage3DNVPROC) (GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, const void *);
typedef void (APIENTRY *glTexSubImage3DNVPROC) (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glCopyTexSubImage3DNVPROC) (GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glCompressedTexImage3DNVPROC) (GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTexSubImage3DNVPROC) (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glFramebufferTextureLayerNVPROC) (GLenum, GLenum, GLuint, GLint, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_nglTexImage3DNV(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalFormat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTexImage3DNVPROC glTexImage3DNV = (glTexImage3DNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_nglTexSubImage3DNV(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTexSubImage3DNVPROC glTexSubImage3DNV = (glTexSubImage3DNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_nglCopyTexSubImage3DNV(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyTexSubImage3DNVPROC glCopyTexSubImage3DNV = (glCopyTexSubImage3DNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_nglCompressedTexImage3DNV(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexImage3DNVPROC glCompressedTexImage3DNV = (glCompressedTexImage3DNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexImage3DNV(target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_nglCompressedTexSubImage3DNV(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexSubImage3DNVPROC glCompressedTexSubImage3DNV = (glCompressedTexSubImage3DNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_nglFramebufferTextureLayerNV(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer, jlong __functionAddress) {
	glFramebufferTextureLayerNVPROC glFramebufferTextureLayerNV = (glFramebufferTextureLayerNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureLayerNV(target, attachment, texture, level, layer);
}

EXTERN_C_EXIT
