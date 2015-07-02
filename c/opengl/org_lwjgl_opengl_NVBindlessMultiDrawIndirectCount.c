/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glMultiDrawArraysIndirectBindlessCountNVPROC) (GLenum, const GLvoid *, GLintptr, GLsizei, GLsizei, GLint);
typedef GLvoid (APIENTRY *glMultiDrawElementsIndirectBindlessCountNVPROC) (GLenum, GLenum, const GLvoid *, GLintptr, GLsizei, GLsizei, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirectCount_nglMultiDrawArraysIndirectBindlessCountNV(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jlong drawCount, jint maxDrawCount, jint stride, jint vertexBufferCount, jlong __functionAddress) {
	const GLvoid *indirect = (const GLvoid *)(intptr_t)indirectAddress;
	glMultiDrawArraysIndirectBindlessCountNVPROC glMultiDrawArraysIndirectBindlessCountNV = (glMultiDrawArraysIndirectBindlessCountNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawArraysIndirectBindlessCountNV(mode, indirect, (GLintptr)drawCount, maxDrawCount, stride, vertexBufferCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirectCount_nglMultiDrawElementsIndirectBindlessCountNV(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jlong drawCount, jint maxDrawCount, jint stride, jint vertexBufferCount, jlong __functionAddress) {
	const GLvoid *indirect = (const GLvoid *)(intptr_t)indirectAddress;
	glMultiDrawElementsIndirectBindlessCountNVPROC glMultiDrawElementsIndirectBindlessCountNV = (glMultiDrawElementsIndirectBindlessCountNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawElementsIndirectBindlessCountNV(mode, type, indirect, (GLintptr)drawCount, maxDrawCount, stride, vertexBufferCount);
}

EXTERN_C_EXIT
