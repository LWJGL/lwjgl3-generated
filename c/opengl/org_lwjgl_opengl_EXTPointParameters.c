/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glPointParameterfEXTPROC) (GLenum, GLfloat);
typedef void (APIENTRY *glPointParameterfvEXTPROC) (GLenum, const GLfloat *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTPointParameters_nglPointParameterfEXT(JNIEnv *__env, jclass clazz, jint pname, jfloat param, jlong __functionAddress) {
	glPointParameterfEXTPROC glPointParameterfEXT = (glPointParameterfEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPointParameterfEXT(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTPointParameters_nglPointParameterfvEXT(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glPointParameterfvEXTPROC glPointParameterfvEXT = (glPointParameterfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPointParameterfvEXT(pname, params);
}

EXTERN_C_EXIT
