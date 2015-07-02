/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glMultiDrawArraysIndirectCountARBPROC) (GLenum, const GLvoid *, GLintptr, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glMultiDrawElementsIndirectCountARBPROC) (GLenum, GLenum, const GLvoid *, GLintptr, GLsizei, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBIndirectParameters_nglMultiDrawArraysIndirectCountARB(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jlong drawcount, jint maxdrawcount, jint stride, jlong __functionAddress) {
	const GLvoid *indirect = (const GLvoid *)(intptr_t)indirectAddress;
	glMultiDrawArraysIndirectCountARBPROC glMultiDrawArraysIndirectCountARB = (glMultiDrawArraysIndirectCountARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawArraysIndirectCountARB(mode, indirect, (GLintptr)drawcount, maxdrawcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBIndirectParameters_nglMultiDrawElementsIndirectCountARB(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jlong drawcount, jint maxdrawcount, jint stride, jlong __functionAddress) {
	const GLvoid *indirect = (const GLvoid *)(intptr_t)indirectAddress;
	glMultiDrawElementsIndirectCountARBPROC glMultiDrawElementsIndirectCountARB = (glMultiDrawElementsIndirectCountARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawElementsIndirectCountARB(mode, type, indirect, (GLintptr)drawcount, maxdrawcount, stride);
}

EXTERN_C_EXIT
