/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void * (APIENTRY *glMapBufferRangeEXTPROC) (GLenum, GLintptr, GLsizeiptr, GLbitfield);
typedef void (APIENTRY *glFlushMappedBufferRangeEXTPROC) (GLenum, GLintptr, GLsizeiptr);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_EXTMapBufferRange_nglMapBufferRangeEXT(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length, jint access, jlong __functionAddress) {
	glMapBufferRangeEXTPROC glMapBufferRangeEXT = (glMapBufferRangeEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glMapBufferRangeEXT(target, (GLintptr)offset, (GLsizeiptr)length, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMapBufferRange_nglFlushMappedBufferRangeEXT(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length, jlong __functionAddress) {
	glFlushMappedBufferRangeEXTPROC glFlushMappedBufferRangeEXT = (glFlushMappedBufferRangeEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFlushMappedBufferRangeEXT(target, (GLintptr)offset, (GLsizeiptr)length);
}

EXTERN_C_EXIT
