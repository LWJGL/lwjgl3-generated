/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glUseShaderProgramEXTPROC) (GLenum, GLuint);
typedef void (APIENTRY *glActiveProgramEXTPROC) (GLuint);
typedef GLuint (APIENTRY *glCreateShaderProgramEXTPROC) (GLenum, const GLchar *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSeparateShaderObjects_nglUseShaderProgramEXT(JNIEnv *__env, jclass clazz, jint type, jint program, jlong __functionAddress) {
	glUseShaderProgramEXTPROC glUseShaderProgramEXT = (glUseShaderProgramEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUseShaderProgramEXT(type, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSeparateShaderObjects_nglActiveProgramEXT(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glActiveProgramEXTPROC glActiveProgramEXT = (glActiveProgramEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glActiveProgramEXT(program);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_EXTSeparateShaderObjects_nglCreateShaderProgramEXT(JNIEnv *__env, jclass clazz, jint type, jlong stringAddress, jlong __functionAddress) {
	const GLchar *string = (const GLchar *)(intptr_t)stringAddress;
	glCreateShaderProgramEXTPROC glCreateShaderProgramEXT = (glCreateShaderProgramEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCreateShaderProgramEXT(type, string);
}

EXTERN_C_EXIT
