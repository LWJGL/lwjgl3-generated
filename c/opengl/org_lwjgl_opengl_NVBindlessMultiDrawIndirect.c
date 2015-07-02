/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glMultiDrawArraysIndirectBindlessNVPROC) (GLenum, const GLvoid *, GLsizei, GLsizei, GLint);
typedef GLvoid (APIENTRY *glMultiDrawElementsIndirectBindlessNVPROC) (GLenum, GLenum, const GLvoid *, GLsizei, GLsizei, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirect_nglMultiDrawArraysIndirectBindlessNV(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jint drawCount, jint stride, jint vertexBufferCount, jlong __functionAddress) {
	const GLvoid *indirect = (const GLvoid *)(intptr_t)indirectAddress;
	glMultiDrawArraysIndirectBindlessNVPROC glMultiDrawArraysIndirectBindlessNV = (glMultiDrawArraysIndirectBindlessNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawArraysIndirectBindlessNV(mode, indirect, drawCount, stride, vertexBufferCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirect_nglMultiDrawElementsIndirectBindlessNV(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jint drawCount, jint stride, jint vertexBufferCount, jlong __functionAddress) {
	const GLvoid *indirect = (const GLvoid *)(intptr_t)indirectAddress;
	glMultiDrawElementsIndirectBindlessNVPROC glMultiDrawElementsIndirectBindlessNV = (glMultiDrawElementsIndirectBindlessNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawElementsIndirectBindlessNV(mode, type, indirect, drawCount, stride, vertexBufferCount);
}

EXTERN_C_EXIT
