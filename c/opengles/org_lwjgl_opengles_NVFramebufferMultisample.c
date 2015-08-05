/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleNVPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVFramebufferMultisample_nglRenderbufferStorageMultisampleNV(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glRenderbufferStorageMultisampleNVPROC glRenderbufferStorageMultisampleNV = (glRenderbufferStorageMultisampleNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRenderbufferStorageMultisampleNV(target, samples, internalformat, width, height);
}

EXTERN_C_EXIT
