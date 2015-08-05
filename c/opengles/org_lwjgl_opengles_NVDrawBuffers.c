/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glDrawBuffersNVPROC) (GLsizei, const GLenum *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVDrawBuffers_nglDrawBuffersNV(JNIEnv *__env, jclass clazz, jint n, jlong bufsAddress, jlong __functionAddress) {
	const GLenum *bufs = (const GLenum *)(intptr_t)bufsAddress;
	glDrawBuffersNVPROC glDrawBuffersNV = (glDrawBuffersNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawBuffersNV(n, bufs);
}

EXTERN_C_EXIT
