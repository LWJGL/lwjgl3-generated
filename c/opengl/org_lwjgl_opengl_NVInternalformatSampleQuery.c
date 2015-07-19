/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glGetInternalformatSampleivNVPROC) (GLenum, GLenum, GLsizei, GLenum, GLsizei, GLint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVInternalformatSampleQuery_nglGetInternalformatSampleivNV(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint samples, jint pname, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetInternalformatSampleivNVPROC glGetInternalformatSampleivNV = (glGetInternalformatSampleivNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetInternalformatSampleivNV(target, internalformat, samples, pname, bufSize, params);
}

EXTERN_C_EXIT
