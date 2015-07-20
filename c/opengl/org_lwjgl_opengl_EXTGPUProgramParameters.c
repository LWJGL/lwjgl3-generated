/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glProgramEnvParameters4fvEXTPROC) (GLenum, GLuint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramLocalParameters4fvEXTPROC) (GLenum, GLuint, GLsizei, const GLfloat *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUProgramParameters_nglProgramEnvParameters4fvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jint count, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glProgramEnvParameters4fvEXTPROC glProgramEnvParameters4fvEXT = (glProgramEnvParameters4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramEnvParameters4fvEXT(target, index, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUProgramParameters_nglProgramLocalParameters4fvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jint count, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glProgramLocalParameters4fvEXTPROC glProgramLocalParameters4fvEXT = (glProgramLocalParameters4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramLocalParameters4fvEXT(target, index, count, params);
}

EXTERN_C_EXIT
