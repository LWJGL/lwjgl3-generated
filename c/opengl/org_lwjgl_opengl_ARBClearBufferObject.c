/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glClearNamedBufferDataEXTPROC) (GLuint, GLenum, GLenum, GLenum, const void *);
typedef void (APIENTRY *glClearNamedBufferSubDataEXTPROC) (GLuint, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, const void *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearBufferObject_nglClearNamedBufferDataEXT(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jint format, jint type, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glClearNamedBufferDataEXTPROC glClearNamedBufferDataEXT = (glClearNamedBufferDataEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearNamedBufferDataEXT(buffer, internalformat, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearBufferObject_nglClearNamedBufferSubDataEXT(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jlong offset, jlong size, jint format, jint type, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glClearNamedBufferSubDataEXTPROC glClearNamedBufferSubDataEXT = (glClearNamedBufferSubDataEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearNamedBufferSubDataEXT(buffer, internalformat, (GLintptr)offset, (GLsizeiptr)size, format, type, data);
}

EXTERN_C_EXIT
