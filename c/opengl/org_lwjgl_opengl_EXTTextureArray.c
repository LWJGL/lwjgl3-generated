/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glFramebufferTextureLayerEXTPROC) (GLenum, GLenum, GLuint, GLint, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureArray_nglFramebufferTextureLayerEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer, jlong __functionAddress) {
	glFramebufferTextureLayerEXTPROC glFramebufferTextureLayerEXT = (glFramebufferTextureLayerEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureLayerEXT(target, attachment, texture, level, layer);
}

EXTERN_C_EXIT
