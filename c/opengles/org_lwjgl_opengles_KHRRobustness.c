/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef GLenum (APIENTRY *glGetGraphicsResetStatusKHRPROC) (void);
typedef void (APIENTRY *glReadnPixelsPROC) (GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnUniformfvKHRPROC) (GLuint, GLint, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnUniformivKHRPROC) (GLuint, GLint, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnUniformuivKHRPROC) (GLuint, GLint, GLsizei, GLfloat *);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_KHRRobustness_nglGetGraphicsResetStatusKHR(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glGetGraphicsResetStatusKHRPROC glGetGraphicsResetStatusKHR = (glGetGraphicsResetStatusKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetGraphicsResetStatusKHR();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRRobustness_nglReadnPixels(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong pixelsAddress, jlong __functionAddress) {
	void *pixels = (void *)(intptr_t)pixelsAddress;
	glReadnPixelsPROC glReadnPixels = (glReadnPixelsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRRobustness_nglGetnUniformfvKHR(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetnUniformfvKHRPROC glGetnUniformfvKHR = (glGetnUniformfvKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformfvKHR(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRRobustness_nglGetnUniformivKHR(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetnUniformivKHRPROC glGetnUniformivKHR = (glGetnUniformivKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformivKHR(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRRobustness_nglGetnUniformuivKHR(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetnUniformuivKHRPROC glGetnUniformuivKHR = (glGetnUniformuivKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformuivKHR(program, location, bufSize, params);
}

EXTERN_C_EXIT
