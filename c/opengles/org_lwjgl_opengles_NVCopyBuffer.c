/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glCopyBufferSubDataNVPROC) (GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVCopyBuffer_nglCopyBufferSubDataNV(JNIEnv *__env, jclass clazz, jint readTarget, jint writeTarget, jlong readOffset, jlong writeOffset, jlong size, jlong __functionAddress) {
	glCopyBufferSubDataNVPROC glCopyBufferSubDataNV = (glCopyBufferSubDataNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyBufferSubDataNV(readTarget, writeTarget, (GLintptr)readOffset, (GLintptr)writeOffset, (GLsizeiptr)size);
}

EXTERN_C_EXIT
