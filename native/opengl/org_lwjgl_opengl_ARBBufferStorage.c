/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glBufferStoragePROC) (GLenum, GLsizeiptr, const GLvoid *, GLbitfield);
typedef GLvoid (APIENTRY *glNamedBufferStorageEXTPROC) (GLuint, GLsizeiptr, const GLvoid *, GLbitfield);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBufferStorage_nglBufferStorage(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint flags, jlong __functionAddress) {
	const GLvoid *data = (const GLvoid *)(intptr_t)dataAddress;
	glBufferStoragePROC glBufferStorage = (glBufferStoragePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBufferStorage(target, (GLsizeiptr)size, data, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBufferStorage_nglNamedBufferStorageEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint flags, jlong __functionAddress) {
	const GLvoid *data = (const GLvoid *)(intptr_t)dataAddress;
	glNamedBufferStorageEXTPROC glNamedBufferStorageEXT = (glNamedBufferStorageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedBufferStorageEXT(buffer, (GLsizeiptr)size, data, flags);
}

EXTERN_C_EXIT
