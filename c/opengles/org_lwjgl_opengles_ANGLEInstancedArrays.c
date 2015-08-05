/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glDrawArraysInstancedANGLEPROC) (GLenum, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glDrawElementsInstancedANGLEPROC) (GLenum, GLsizei, GLenum, const void *, GLsizei);
typedef void (APIENTRY *glVertexAttribDivisorANGLEPROC) (GLuint, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ANGLEInstancedArrays_nglDrawArraysInstancedANGLE(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount, jlong __functionAddress) {
	glDrawArraysInstancedANGLEPROC glDrawArraysInstancedANGLE = (glDrawArraysInstancedANGLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArraysInstancedANGLE(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ANGLEInstancedArrays_nglDrawElementsInstancedANGLE(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedANGLEPROC glDrawElementsInstancedANGLE = (glDrawElementsInstancedANGLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedANGLE(mode, count, type, indices, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ANGLEInstancedArrays_nglVertexAttribDivisorANGLE(JNIEnv *__env, jclass clazz, jint index, jint divisor, jlong __functionAddress) {
	glVertexAttribDivisorANGLEPROC glVertexAttribDivisorANGLE = (glVertexAttribDivisorANGLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribDivisorANGLE(index, divisor);
}

EXTERN_C_EXIT
