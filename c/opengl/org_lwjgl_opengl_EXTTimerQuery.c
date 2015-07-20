/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glGetQueryObjecti64vEXTPROC) (GLuint, GLenum, GLint64 *);
typedef void (APIENTRY *glGetQueryObjectui64vEXTPROC) (GLuint, GLenum, GLuint64 *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTimerQuery_nglGetQueryObjecti64vEXT(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint64 *params = (GLint64 *)(intptr_t)paramsAddress;
	glGetQueryObjecti64vEXTPROC glGetQueryObjecti64vEXT = (glGetQueryObjecti64vEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjecti64vEXT(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTimerQuery_nglGetQueryObjectui64vEXT(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint64 *params = (GLuint64 *)(intptr_t)paramsAddress;
	glGetQueryObjectui64vEXTPROC glGetQueryObjectui64vEXT = (glGetQueryObjectui64vEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjectui64vEXT(id, pname, params);
}

EXTERN_C_EXIT
