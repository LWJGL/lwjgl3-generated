/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glMultiDrawArraysIndirectBindlessCountNVPROC) (GLenum, const void *, GLintptr, GLsizei, GLsizei, GLint);
typedef void (APIENTRY *glMultiDrawElementsIndirectBindlessCountNVPROC) (GLenum, GLenum, const void *, GLintptr, GLsizei, GLsizei, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirectCount_nglMultiDrawArraysIndirectBindlessCountNV(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jlong drawCount, jint maxDrawCount, jint stride, jint vertexBufferCount, jlong __functionAddress) {
	const void *indirect = (const void *)(intptr_t)indirectAddress;
	glMultiDrawArraysIndirectBindlessCountNVPROC glMultiDrawArraysIndirectBindlessCountNV = (glMultiDrawArraysIndirectBindlessCountNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawArraysIndirectBindlessCountNV(mode, indirect, (GLintptr)drawCount, maxDrawCount, stride, vertexBufferCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirectCount_nglMultiDrawElementsIndirectBindlessCountNV(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jlong drawCount, jint maxDrawCount, jint stride, jint vertexBufferCount, jlong __functionAddress) {
	const void *indirect = (const void *)(intptr_t)indirectAddress;
	glMultiDrawElementsIndirectBindlessCountNVPROC glMultiDrawElementsIndirectBindlessCountNV = (glMultiDrawElementsIndirectBindlessCountNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawElementsIndirectBindlessCountNV(mode, type, indirect, (GLintptr)drawCount, maxDrawCount, stride, vertexBufferCount);
}

EXTERN_C_EXIT
