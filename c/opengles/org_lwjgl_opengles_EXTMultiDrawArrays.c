/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glMultiDrawArraysEXTPROC) (GLenum, const GLint *, const GLsizei *, GLsizei);
typedef void (APIENTRY *glMultiDrawElementsEXTPROC) (GLenum, const GLsizei *, GLenum, const void * const *, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawArrays_nglMultiDrawArraysEXT(JNIEnv *__env, jclass clazz, jint mode, jlong firstAddress, jlong countAddress, jint primcount, jlong __functionAddress) {
	const GLint *first = (const GLint *)(intptr_t)firstAddress;
	const GLsizei *count = (const GLsizei *)(intptr_t)countAddress;
	glMultiDrawArraysEXTPROC glMultiDrawArraysEXT = (glMultiDrawArraysEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawArraysEXT(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawArrays_nglMultiDrawElementsEXT(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint primcount, jlong __functionAddress) {
	const GLsizei *count = (const GLsizei *)(intptr_t)countAddress;
	const void * const *indices = (const void * const *)(intptr_t)indicesAddress;
	glMultiDrawElementsEXTPROC glMultiDrawElementsEXT = (glMultiDrawElementsEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawElementsEXT(mode, count, type, indices, primcount);
}

EXTERN_C_EXIT
