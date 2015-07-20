/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glLockArraysEXTPROC) (GLint, GLsizei);
typedef void (APIENTRY *glUnlockArraysEXTPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTCompiledVertexArray_nglLockArraysEXT(JNIEnv *__env, jclass clazz, jint first, jint count, jlong __functionAddress) {
	glLockArraysEXTPROC glLockArraysEXT = (glLockArraysEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLockArraysEXT(first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTCompiledVertexArray_nglUnlockArraysEXT(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glUnlockArraysEXTPROC glUnlockArraysEXT = (glUnlockArraysEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUnlockArraysEXT();
}

EXTERN_C_EXIT
