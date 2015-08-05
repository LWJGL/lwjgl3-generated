/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glCopyImageSubDataEXTPROC) (GLuint, GLenum, GLint, GLint, GLint, GLint, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTCopyImage_nglCopyImageSubDataEXT(JNIEnv *__env, jclass clazz, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srcY, jint srcZ, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint srcWidth, jint srcHeight, jint srcDepth, jlong __functionAddress) {
	glCopyImageSubDataEXTPROC glCopyImageSubDataEXT = (glCopyImageSubDataEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyImageSubDataEXT(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
}

EXTERN_C_EXIT
