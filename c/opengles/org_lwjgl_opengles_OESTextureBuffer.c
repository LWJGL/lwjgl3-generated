/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glTexBufferOESPROC) (GLenum, GLenum, GLuint);
typedef void (APIENTRY *glTexBufferRangeOESPROC) (GLenum, GLenum, GLuint, GLintptr, GLsizeiptr);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBuffer_nglTexBufferOES(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong __functionAddress) {
	glTexBufferOESPROC glTexBufferOES = (glTexBufferOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexBufferOES(target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBuffer_nglTexBufferRangeOES(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong offset, jlong size, jlong __functionAddress) {
	glTexBufferRangeOESPROC glTexBufferRangeOES = (glTexBufferRangeOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexBufferRangeOES(target, internalformat, buffer, (GLintptr)offset, (GLsizeiptr)size);
}

EXTERN_C_EXIT
