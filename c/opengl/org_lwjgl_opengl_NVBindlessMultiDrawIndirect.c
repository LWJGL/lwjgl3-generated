/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glMultiDrawArraysIndirectBindlessNVPROC) (GLenum, const void *, GLsizei, GLsizei, GLint);
typedef void (APIENTRY *glMultiDrawElementsIndirectBindlessNVPROC) (GLenum, GLenum, const void *, GLsizei, GLsizei, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirect_nglMultiDrawArraysIndirectBindlessNV(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jint drawCount, jint stride, jint vertexBufferCount, jlong __functionAddress) {
	const void *indirect = (const void *)(intptr_t)indirectAddress;
	glMultiDrawArraysIndirectBindlessNVPROC glMultiDrawArraysIndirectBindlessNV = (glMultiDrawArraysIndirectBindlessNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawArraysIndirectBindlessNV(mode, indirect, drawCount, stride, vertexBufferCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirect_nglMultiDrawElementsIndirectBindlessNV(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jint drawCount, jint stride, jint vertexBufferCount, jlong __functionAddress) {
	const void *indirect = (const void *)(intptr_t)indirectAddress;
	glMultiDrawElementsIndirectBindlessNVPROC glMultiDrawElementsIndirectBindlessNV = (glMultiDrawElementsIndirectBindlessNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawElementsIndirectBindlessNV(mode, type, indirect, drawCount, stride, vertexBufferCount);
}

EXTERN_C_EXIT
