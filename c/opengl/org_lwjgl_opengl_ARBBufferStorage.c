/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glNamedBufferStorageEXTPROC) (GLuint, GLsizeiptr, const void *, GLbitfield);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBufferStorage_nglNamedBufferStorageEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint flags, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glNamedBufferStorageEXTPROC glNamedBufferStorageEXT = (glNamedBufferStorageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedBufferStorageEXT(buffer, (GLsizeiptr)size, data, flags);
}

EXTERN_C_EXIT
