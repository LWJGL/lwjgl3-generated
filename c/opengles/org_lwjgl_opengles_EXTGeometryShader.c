/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glFramebufferTextureEXTPROC) (GLenum, GLenum, GLuint, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTGeometryShader_nglFramebufferTextureEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jlong __functionAddress) {
	glFramebufferTextureEXTPROC glFramebufferTextureEXT = (glFramebufferTextureEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureEXT(target, attachment, texture, level);
}

EXTERN_C_EXIT
