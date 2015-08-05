/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glTexBufferEXTPROC) (GLenum, GLenum, GLuint);
typedef void (APIENTRY *glTexBufferRangeEXTPROC) (GLenum, GLenum, GLuint, GLintptr, GLsizeiptr);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBuffer_nglTexBufferEXT(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong __functionAddress) {
	glTexBufferEXTPROC glTexBufferEXT = (glTexBufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexBufferEXT(target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBuffer_nglTexBufferRangeEXT(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong offset, jlong size, jlong __functionAddress) {
	glTexBufferRangeEXTPROC glTexBufferRangeEXT = (glTexBufferRangeEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexBufferRangeEXT(target, internalformat, buffer, (GLintptr)offset, (GLsizeiptr)size);
}

EXTERN_C_EXIT
