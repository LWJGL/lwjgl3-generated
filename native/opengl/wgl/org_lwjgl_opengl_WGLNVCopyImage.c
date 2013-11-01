/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef BOOL (APIENTRY *wglCopyImageSubDataNVPROC) (HGLRC, GLuint, GLenum, GLint, GLint, GLint, GLint, HGLRC, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei);

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVCopyImage_nwglCopyImageSubDataNV(JNIEnv *__env, jclass clazz, jlong srcRCAddress, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srcY, jint srcZ, jlong dstRCAddress, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint width, jint height, jint depth, jlong __functionAddress) {
	HGLRC srcRC = (HGLRC)(intptr_t)srcRCAddress;
	HGLRC dstRC = (HGLRC)(intptr_t)dstRCAddress;
	wglCopyImageSubDataNVPROC wglCopyImageSubDataNV = (wglCopyImageSubDataNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglCopyImageSubDataNV(srcRC, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstRC, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth);
}
