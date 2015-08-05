/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glDrawArraysInstancedNVPROC) (GLenum, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glDrawElementsInstancedNVPROC) (GLenum, GLsizei, GLenum, const void *, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVDrawInstanced_nglDrawArraysInstancedNV(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount, jlong __functionAddress) {
	glDrawArraysInstancedNVPROC glDrawArraysInstancedNV = (glDrawArraysInstancedNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArraysInstancedNV(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVDrawInstanced_nglDrawElementsInstancedNV(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedNVPROC glDrawElementsInstancedNV = (glDrawElementsInstancedNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedNV(mode, count, type, indices, primcount);
}

EXTERN_C_EXIT
