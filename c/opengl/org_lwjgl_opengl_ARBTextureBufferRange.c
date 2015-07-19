/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glTextureBufferRangeEXTPROC) (GLuint, GLenum, GLenum, GLuint, GLintptr, GLsizeiptr);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureBufferRange_nglTextureBufferRangeEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint internalformat, jint buffer, jlong offset, jlong size, jlong __functionAddress) {
	glTextureBufferRangeEXTPROC glTextureBufferRangeEXT = (glTextureBufferRangeEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureBufferRangeEXT(texture, target, internalformat, buffer, (GLintptr)offset, (GLsizeiptr)size);
}

EXTERN_C_EXIT
