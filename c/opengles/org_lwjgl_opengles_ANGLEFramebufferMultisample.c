/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleANGLEPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ANGLEFramebufferMultisample_nglRenderbufferStorageMultisampleANGLE(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glRenderbufferStorageMultisampleANGLEPROC glRenderbufferStorageMultisampleANGLE = (glRenderbufferStorageMultisampleANGLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRenderbufferStorageMultisampleANGLE(target, samples, internalformat, width, height);
}

EXTERN_C_EXIT
