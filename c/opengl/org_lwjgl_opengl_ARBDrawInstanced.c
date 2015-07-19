/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glDrawArraysInstancedARBPROC) (GLenum, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glDrawElementsInstancedARBPROC) (GLenum, GLsizei, GLenum, const void *, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawInstanced_nglDrawArraysInstancedARB(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount, jlong __functionAddress) {
	glDrawArraysInstancedARBPROC glDrawArraysInstancedARB = (glDrawArraysInstancedARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArraysInstancedARB(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawInstanced_nglDrawElementsInstancedARB(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedARBPROC glDrawElementsInstancedARB = (glDrawElementsInstancedARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedARB(mode, count, type, indices, primcount);
}

EXTERN_C_EXIT
