/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleIMGPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glFramebufferTexture2DMultisampleIMGPROC) (GLenum, GLenum, GLenum, GLuint, GLint, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_IMGMultisampledRenderToTexture_nglRenderbufferStorageMultisampleIMG(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glRenderbufferStorageMultisampleIMGPROC glRenderbufferStorageMultisampleIMG = (glRenderbufferStorageMultisampleIMGPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRenderbufferStorageMultisampleIMG(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_IMGMultisampledRenderToTexture_nglFramebufferTexture2DMultisampleIMG(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint samples, jlong __functionAddress) {
	glFramebufferTexture2DMultisampleIMGPROC glFramebufferTexture2DMultisampleIMG = (glFramebufferTexture2DMultisampleIMGPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture2DMultisampleIMG(target, attachment, textarget, texture, level, samples);
}

EXTERN_C_EXIT
