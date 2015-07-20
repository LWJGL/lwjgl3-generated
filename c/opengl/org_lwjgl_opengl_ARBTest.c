/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLint (APIENTRY *glGetTextureHandleARBPROC) (GLdouble);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBTest_nglGetTextureHandleARB(JNIEnv *__env, jclass clazz, jdouble test, jlong __functionAddress) {
	glGetTextureHandleARBPROC glGetTextureHandleARB = (glGetTextureHandleARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetTextureHandleARB(test);
}

EXTERN_C_EXIT
