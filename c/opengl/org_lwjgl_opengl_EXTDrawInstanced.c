/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glDrawArraysInstancedEXTPROC) (GLenum, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glDrawElementsInstancedEXTPROC) (GLenum, GLsizei, GLenum, const void *, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawInstanced_nglDrawArraysInstancedEXT(JNIEnv *__env, jclass clazz, jint mode, jint start, jint count, jint primcount, jlong __functionAddress) {
	glDrawArraysInstancedEXTPROC glDrawArraysInstancedEXT = (glDrawArraysInstancedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArraysInstancedEXT(mode, start, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawInstanced_nglDrawElementsInstancedEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedEXTPROC glDrawElementsInstancedEXT = (glDrawElementsInstancedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedEXT(mode, count, type, indices, primcount);
}

EXTERN_C_EXIT
