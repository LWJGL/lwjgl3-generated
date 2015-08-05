/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glDrawArraysInstancedEXTPROC) (GLenum, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glDrawElementsInstancedEXTPROC) (GLenum, GLsizei, GLenum, const void *, GLsizei);
typedef void (APIENTRY *glVertexAttribDivisorEXTPROC) (GLuint, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTInstancedArrays_nglDrawArraysInstancedEXT(JNIEnv *__env, jclass clazz, jint mode, jint start, jint count, jint primcount, jlong __functionAddress) {
	glDrawArraysInstancedEXTPROC glDrawArraysInstancedEXT = (glDrawArraysInstancedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArraysInstancedEXT(mode, start, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTInstancedArrays_nglDrawElementsInstancedEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedEXTPROC glDrawElementsInstancedEXT = (glDrawElementsInstancedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedEXT(mode, count, type, indices, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTInstancedArrays_nglVertexAttribDivisorEXT(JNIEnv *__env, jclass clazz, jint index, jint divisor, jlong __functionAddress) {
	glVertexAttribDivisorEXTPROC glVertexAttribDivisorEXT = (glVertexAttribDivisorEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribDivisorEXT(index, divisor);
}

EXTERN_C_EXIT
