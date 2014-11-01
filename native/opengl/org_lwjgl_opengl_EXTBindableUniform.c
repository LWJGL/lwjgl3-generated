/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glUniformBufferEXTPROC) (GLuint, GLint, GLuint);
typedef GLint (APIENTRY *glGetUniformBufferSizeEXTPROC) (GLuint, GLint);
typedef GLintptr (APIENTRY *glGetUniformOffsetEXTPROC) (GLuint, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTBindableUniform_nglUniformBufferEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint buffer, jlong __functionAddress) {
	glUniformBufferEXTPROC glUniformBufferEXT = (glUniformBufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformBufferEXT(program, location, buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_EXTBindableUniform_nglGetUniformBufferSizeEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jlong __functionAddress) {
	glGetUniformBufferSizeEXTPROC glGetUniformBufferSizeEXT = (glGetUniformBufferSizeEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetUniformBufferSizeEXT(program, location);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_EXTBindableUniform_nglGetUniformOffsetEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jlong __functionAddress) {
	glGetUniformOffsetEXTPROC glGetUniformOffsetEXT = (glGetUniformOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glGetUniformOffsetEXT(program, location);
}

EXTERN_C_EXIT
