/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef void (APIENTRY *glXCopyBufferSubDataNVPROC) (Display *, GLXContext, GLXContext, GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr);
typedef void (APIENTRY *glXNamedCopyBufferSubDataNVPROC) (Display *, GLXContext, GLXContext, GLuint, GLuint, GLintptr, GLintptr, GLsizeiptr);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXNVCopyBuffer_nglXCopyBufferSubDataNV(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong readCtxAddress, jlong writeCtxAddress, jint readTarget, jint writeTarget, jlong readOffset, jlong writeOffset, jlong size, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext readCtx = (GLXContext)(intptr_t)readCtxAddress;
	GLXContext writeCtx = (GLXContext)(intptr_t)writeCtxAddress;
	glXCopyBufferSubDataNVPROC glXCopyBufferSubDataNV = (glXCopyBufferSubDataNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glXCopyBufferSubDataNV(display, readCtx, writeCtx, readTarget, writeTarget, (GLintptr)readOffset, (GLintptr)writeOffset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXNVCopyBuffer_nglXNamedCopyBufferSubDataNV(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong readCtxAddress, jlong writeCtxAddress, jint readBuffer, jint writeBuffer, jlong readOffset, jlong writeOffset, jlong size, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext readCtx = (GLXContext)(intptr_t)readCtxAddress;
	GLXContext writeCtx = (GLXContext)(intptr_t)writeCtxAddress;
	glXNamedCopyBufferSubDataNVPROC glXNamedCopyBufferSubDataNV = (glXNamedCopyBufferSubDataNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glXNamedCopyBufferSubDataNV(display, readCtx, writeCtx, readBuffer, writeBuffer, (GLintptr)readOffset, (GLintptr)writeOffset, (GLsizeiptr)size);
}

EXTERN_C_EXIT
