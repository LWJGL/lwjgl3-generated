/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef GLenum (APIENTRY *glGetGraphicsResetStatusEXTPROC) (void);
typedef void (APIENTRY *glReadnPixelsEXTPROC) (GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnUniformfvEXTPROC) (GLuint, GLint, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnUniformivEXTPROC) (GLuint, GLint, GLsizei, GLint *);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_EXTRobustness_nglGetGraphicsResetStatusEXT(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glGetGraphicsResetStatusEXTPROC glGetGraphicsResetStatusEXT = (glGetGraphicsResetStatusEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetGraphicsResetStatusEXT();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTRobustness_nglReadnPixelsEXT(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	void *data = (void *)(intptr_t)dataAddress;
	glReadnPixelsEXTPROC glReadnPixelsEXT = (glReadnPixelsEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReadnPixelsEXT(x, y, width, height, format, type, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTRobustness_nglGetnUniformfvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetnUniformfvEXTPROC glGetnUniformfvEXT = (glGetnUniformfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformfvEXT(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTRobustness_nglGetnUniformivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetnUniformivEXTPROC glGetnUniformivEXT = (glGetnUniformivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformivEXT(program, location, bufSize, params);
}

EXTERN_C_EXIT
