/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glExtGetShadersQCOMPROC) (GLuint *, GLint, GLint *);
typedef void (APIENTRY *glExtGetProgramsQCOMPROC) (GLuint *, GLint, GLint *);
typedef GLboolean (APIENTRY *glExtIsProgramBinaryQCOMPROC) (GLuint);
typedef void (APIENTRY *glExtGetProgramBinarySourceQCOMPROC) (GLuint, GLenum, GLchar *, GLint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_nglExtGetShadersQCOM(JNIEnv *__env, jclass clazz, jlong shadersAddress, jint maxShaders, jlong numShadersAddress, jlong __functionAddress) {
	GLuint *shaders = (GLuint *)(intptr_t)shadersAddress;
	GLint *numShaders = (GLint *)(intptr_t)numShadersAddress;
	glExtGetShadersQCOMPROC glExtGetShadersQCOM = (glExtGetShadersQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glExtGetShadersQCOM(shaders, maxShaders, numShaders);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_nglExtGetProgramsQCOM(JNIEnv *__env, jclass clazz, jlong programsAddress, jint maxPrograms, jlong numProgramsAddress, jlong __functionAddress) {
	GLuint *programs = (GLuint *)(intptr_t)programsAddress;
	GLint *numPrograms = (GLint *)(intptr_t)numProgramsAddress;
	glExtGetProgramsQCOMPROC glExtGetProgramsQCOM = (glExtGetProgramsQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glExtGetProgramsQCOM(programs, maxPrograms, numPrograms);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_nglExtIsProgramBinaryQCOM(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glExtIsProgramBinaryQCOMPROC glExtIsProgramBinaryQCOM = (glExtIsProgramBinaryQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glExtIsProgramBinaryQCOM(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_nglExtGetProgramBinarySourceQCOM(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jlong sourceAddress, jlong lengthAddress, jlong __functionAddress) {
	GLchar *source = (GLchar *)(intptr_t)sourceAddress;
	GLint *length = (GLint *)(intptr_t)lengthAddress;
	glExtGetProgramBinarySourceQCOMPROC glExtGetProgramBinarySourceQCOM = (glExtGetProgramBinarySourceQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glExtGetProgramBinarySourceQCOM(program, shadertype, source, length);
}

EXTERN_C_EXIT
