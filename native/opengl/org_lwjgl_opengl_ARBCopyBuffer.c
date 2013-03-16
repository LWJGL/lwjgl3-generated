/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glCopyBufferSubDataPROC) (GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBCopyBuffer_nglCopyBufferSubData(JNIEnv *__env, jclass clazz, jint readTarget, jint writeTarget, jlong readOffset, jlong writeOffset, jlong size, jlong __functionAddress) {
	glCopyBufferSubDataPROC glCopyBufferSubData = (glCopyBufferSubDataPROC)(intptr_t)__functionAddress;
	glCopyBufferSubData(readTarget, writeTarget, (GLintptr)readOffset, (GLintptr)writeOffset, (GLsizeiptr)size);
}