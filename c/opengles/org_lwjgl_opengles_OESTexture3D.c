/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glTexImage3DOESPROC) (GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, const void *);
typedef void (APIENTRY *glTexSubImage3DOESPROC) (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glCopyTexSubImage3DOESPROC) (GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glCompressedTexImage3DOESPROC) (GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTexSubImage3DOESPROC) (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glFramebufferTexture3DOESPROC) (GLenum, GLenum, GLenum, GLuint, GLint, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_nglTexImage3DOES(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTexImage3DOESPROC glTexImage3DOES = (glTexImage3DOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_nglTexSubImage3DOES(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTexSubImage3DOESPROC glTexSubImage3DOES = (glTexSubImage3DOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_nglCopyTexSubImage3DOES(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyTexSubImage3DOESPROC glCopyTexSubImage3DOES = (glCopyTexSubImage3DOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_nglCompressedTexImage3DOES(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexImage3DOESPROC glCompressedTexImage3DOES = (glCompressedTexImage3DOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexImage3DOES(target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_nglCompressedTexSubImage3DOES(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexSubImage3DOESPROC glCompressedTexSubImage3DOES = (glCompressedTexSubImage3DOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_nglFramebufferTexture3DOES(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint zoffset, jlong __functionAddress) {
	glFramebufferTexture3DOESPROC glFramebufferTexture3DOES = (glFramebufferTexture3DOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture3DOES(target, attachment, textarget, texture, level, zoffset);
}

EXTERN_C_EXIT
