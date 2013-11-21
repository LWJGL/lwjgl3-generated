/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glClearTexSubImagePROC) (GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glClearTexImagePROC) (GLuint, GLint, GLenum, GLenum, const GLvoid *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearTexture_nglClearTexSubImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong dataAddress, jlong __functionAddress) {
	const GLvoid *data = (const GLvoid *)(intptr_t)dataAddress;
	glClearTexSubImagePROC glClearTexSubImage = (glClearTexSubImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearTexture_nglClearTexImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jint format, jint type, jlong dataAddress, jlong __functionAddress) {
	const GLvoid *data = (const GLvoid *)(intptr_t)dataAddress;
	glClearTexImagePROC glClearTexImage = (glClearTexImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearTexImage(texture, level, format, type, data);
}

EXTERN_C_EXIT
