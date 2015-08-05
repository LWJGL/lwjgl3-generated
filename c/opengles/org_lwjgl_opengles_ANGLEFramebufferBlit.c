/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glBlitFramebufferANGLEPROC) (GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ANGLEFramebufferBlit_nglBlitFramebufferANGLE(JNIEnv *__env, jclass clazz, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter, jlong __functionAddress) {
	glBlitFramebufferANGLEPROC glBlitFramebufferANGLE = (glBlitFramebufferANGLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlitFramebufferANGLE(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

EXTERN_C_EXIT
