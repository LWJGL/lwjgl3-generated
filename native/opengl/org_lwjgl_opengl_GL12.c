/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glTexImage3DPROC) (GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glTexSubImage3DPROC) (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glCopyTexSubImage3DPROC) (GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glDrawRangeElementsPROC) (GLenum, GLuint, GLuint, GLsizei, GLenum, const GLvoid *);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL12_nglTexImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const GLvoid *pixels = (const GLvoid *)(intptr_t)pixelsAddress;
	glTexImage3DPROC glTexImage3D = (glTexImage3DPROC)(intptr_t)__functionAddress;
	glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL12_nglTexSubImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const GLvoid *pixels = (const GLvoid *)(intptr_t)pixelsAddress;
	glTexSubImage3DPROC glTexSubImage3D = (glTexSubImage3DPROC)(intptr_t)__functionAddress;
	glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL12_nglCopyTexSubImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyTexSubImage3DPROC glCopyTexSubImage3D = (glCopyTexSubImage3DPROC)(intptr_t)__functionAddress;
	glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL12_nglDrawRangeElements(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jlong __functionAddress) {
	const GLvoid *indices = (const GLvoid *)(intptr_t)indicesAddress;
	glDrawRangeElementsPROC glDrawRangeElements = (glDrawRangeElementsPROC)(intptr_t)__functionAddress;
	glDrawRangeElements(mode, start, end, count, type, indices);
}