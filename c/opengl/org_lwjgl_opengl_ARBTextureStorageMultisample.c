/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glTextureStorage2DMultisampleEXTPROC) (GLuint, GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean);
typedef void (APIENTRY *glTextureStorage3DMultisampleEXTPROC) (GLuint, GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorageMultisample_nglTextureStorage2DMultisampleEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations, jlong __functionAddress) {
	glTextureStorage2DMultisampleEXTPROC glTextureStorage2DMultisampleEXT = (glTextureStorage2DMultisampleEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureStorage2DMultisampleEXT(texture, target, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorageMultisample_nglTextureStorage3DMultisampleEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations, jlong __functionAddress) {
	glTextureStorage3DMultisampleEXTPROC glTextureStorage3DMultisampleEXT = (glTextureStorage3DMultisampleEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureStorage3DMultisampleEXT(texture, target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

EXTERN_C_EXIT
