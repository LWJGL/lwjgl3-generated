/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleEXTPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glFramebufferTexture2DMultisampleEXTPROC) (GLenum, GLenum, GLenum, GLuint, GLint, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultisampledRenderToTexture_nglRenderbufferStorageMultisampleEXT(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glRenderbufferStorageMultisampleEXTPROC glRenderbufferStorageMultisampleEXT = (glRenderbufferStorageMultisampleEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRenderbufferStorageMultisampleEXT(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultisampledRenderToTexture_nglFramebufferTexture2DMultisampleEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint samples, jlong __functionAddress) {
	glFramebufferTexture2DMultisampleEXTPROC glFramebufferTexture2DMultisampleEXT = (glFramebufferTexture2DMultisampleEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture2DMultisampleEXT(target, attachment, textarget, texture, level, samples);
}

EXTERN_C_EXIT
