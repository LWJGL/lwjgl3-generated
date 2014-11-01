/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glTexPageCommitmentARBPROC) (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLboolean);
typedef GLvoid (APIENTRY *glTexturePageCommitmentEXTPROC) (GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSparseTexture_nglTexPageCommitmentARB(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jboolean commit, jlong __functionAddress) {
	glTexPageCommitmentARBPROC glTexPageCommitmentARB = (glTexPageCommitmentARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexPageCommitmentARB(target, level, xoffset, yoffset, zoffset, width, height, depth, commit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSparseTexture_nglTexturePageCommitmentEXT(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jboolean commit, jlong __functionAddress) {
	glTexturePageCommitmentEXTPROC glTexturePageCommitmentEXT = (glTexturePageCommitmentEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexturePageCommitmentEXT(texture, level, xoffset, yoffset, zoffset, width, height, depth, commit);
}

EXTERN_C_EXIT
