/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glTexStorageSparseAMDPROC) (GLenum, GLenum, GLsizei, GLsizei, GLsizei, GLsizei, GLbitfield);
typedef void (APIENTRY *glTextureStorageSparseAMDPROC) (GLuint, GLenum, GLenum, GLsizei, GLsizei, GLsizei, GLsizei, GLbitfield);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDSparseTexture_nglTexStorageSparseAMD(JNIEnv *__env, jclass clazz, jint target, jint internalFormat, jint width, jint height, jint depth, jint layers, jint flags, jlong __functionAddress) {
	glTexStorageSparseAMDPROC glTexStorageSparseAMD = (glTexStorageSparseAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorageSparseAMD(target, internalFormat, width, height, depth, layers, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDSparseTexture_nglTextureStorageSparseAMD(JNIEnv *__env, jclass clazz, jint texture, jint target, jint internalFormat, jint width, jint height, jint depth, jint layers, jint flags, jlong __functionAddress) {
	glTextureStorageSparseAMDPROC glTextureStorageSparseAMD = (glTextureStorageSparseAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureStorageSparseAMD(texture, target, internalFormat, width, height, depth, layers, flags);
}

EXTERN_C_EXIT
