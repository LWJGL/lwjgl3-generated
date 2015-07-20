/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glGetMultisamplefvNVPROC) (GLenum, GLuint, GLfloat *);
typedef void (APIENTRY *glSampleMaskIndexedNVPROC) (GLuint, GLbitfield);
typedef void (APIENTRY *glTexRenderbufferNVPROC) (GLenum, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVExplicitMultisample_nglGetMultisamplefvNV(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong valAddress, jlong __functionAddress) {
	GLfloat *val = (GLfloat *)(intptr_t)valAddress;
	glGetMultisamplefvNVPROC glGetMultisamplefvNV = (glGetMultisamplefvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultisamplefvNV(pname, index, val);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVExplicitMultisample_nglSampleMaskIndexedNV(JNIEnv *__env, jclass clazz, jint index, jint mask, jlong __functionAddress) {
	glSampleMaskIndexedNVPROC glSampleMaskIndexedNV = (glSampleMaskIndexedNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSampleMaskIndexedNV(index, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVExplicitMultisample_nglTexRenderbufferNV(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer, jlong __functionAddress) {
	glTexRenderbufferNVPROC glTexRenderbufferNV = (glTexRenderbufferNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexRenderbufferNV(target, renderbuffer);
}

EXTERN_C_EXIT
