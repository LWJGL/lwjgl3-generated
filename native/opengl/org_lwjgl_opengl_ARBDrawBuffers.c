/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

typedef GLvoid (APIENTRY *glDrawBuffersARBPROC) (GLsizei, const GLenum *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawBuffers_nglDrawBuffersARB(JNIEnv *__env, jclass clazz, jint n, jlong bufsAddress, jlong __functionAddress) {
	const GLenum *bufs = (const GLenum *)(intptr_t)bufsAddress;
	glDrawBuffersARBPROC glDrawBuffersARB = (glDrawBuffersARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawBuffersARB(n, bufs);
}

EXTERN_C_EXIT
