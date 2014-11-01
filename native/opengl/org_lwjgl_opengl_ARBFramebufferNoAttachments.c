/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glNamedFramebufferParameteriEXTPROC) (GLuint, GLenum, GLint);
typedef GLvoid (APIENTRY *glGetNamedFramebufferParameterivEXTPROC) (GLuint, GLenum, GLint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferNoAttachments_nglNamedFramebufferParameteriEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jint param, jlong __functionAddress) {
	glNamedFramebufferParameteriEXTPROC glNamedFramebufferParameteriEXT = (glNamedFramebufferParameteriEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferParameteriEXT(framebuffer, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferNoAttachments_nglGetNamedFramebufferParameterivEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetNamedFramebufferParameterivEXTPROC glGetNamedFramebufferParameterivEXT = (glGetNamedFramebufferParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedFramebufferParameterivEXT(framebuffer, pname, params);
}

EXTERN_C_EXIT
