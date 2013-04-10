/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"
#include <GL/glx.h>

typedef GLvoid (APIENTRY *glXCopyImageSubDataNVPROC) (Display *, GLXContext, GLuint, GLenum, GLint, GLint, GLint, GLint, GLXContext, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXNVCopyImage_nglXCopyImageSubDataNV(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong srcCtxAddress, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srcY, jint srcZ, jlong dstCtxAddress, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint width, jint height, jint depth, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext srcCtx = (GLXContext)(intptr_t)srcCtxAddress;
	GLXContext dstCtx = (GLXContext)(intptr_t)dstCtxAddress;
	glXCopyImageSubDataNVPROC glXCopyImageSubDataNV = (glXCopyImageSubDataNVPROC)(intptr_t)__functionAddress;
	glXCopyImageSubDataNV(display, srcCtx, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstCtx, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth);
}