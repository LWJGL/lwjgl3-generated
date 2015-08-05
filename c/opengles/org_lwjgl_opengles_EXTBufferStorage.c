/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glBufferStorageEXTPROC) (GLenum, GLsizeiptr, const void *, GLbitfield);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTBufferStorage_nglBufferStorageEXT(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint flags, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glBufferStorageEXTPROC glBufferStorageEXT = (glBufferStorageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBufferStorageEXT(target, (GLsizeiptr)size, data, flags);
}

EXTERN_C_EXIT
