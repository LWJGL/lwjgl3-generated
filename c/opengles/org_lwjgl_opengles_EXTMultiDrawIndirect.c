/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glMultiDrawArraysIndirectEXTPROC) (GLenum, const void *, GLsizei, GLsizei);
typedef void (APIENTRY *glMultiDrawElementsIndirectEXTPROC) (GLenum, GLenum, const void *, GLsizei, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawIndirect_nglMultiDrawArraysIndirectEXT(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jint drawcount, jint stride, jlong __functionAddress) {
	const void *indirect = (const void *)(intptr_t)indirectAddress;
	glMultiDrawArraysIndirectEXTPROC glMultiDrawArraysIndirectEXT = (glMultiDrawArraysIndirectEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawArraysIndirectEXT(mode, indirect, drawcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawIndirect_nglMultiDrawElementsIndirectEXT(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jint drawcount, jint stride, jlong __functionAddress) {
	const void *indirect = (const void *)(intptr_t)indirectAddress;
	glMultiDrawElementsIndirectEXTPROC glMultiDrawElementsIndirectEXT = (glMultiDrawElementsIndirectEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawElementsIndirectEXT(mode, type, indirect, drawcount, stride);
}

EXTERN_C_EXIT
