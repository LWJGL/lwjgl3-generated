/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glTexBufferEXTPROC) (GLenum, GLenum, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureBufferObject_nglTexBufferEXT(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong __functionAddress) {
	glTexBufferEXTPROC glTexBufferEXT = (glTexBufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexBufferEXT(target, internalformat, buffer);
}

EXTERN_C_EXIT
