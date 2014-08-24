/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glPointParameterfARBPROC) (GLenum, GLfloat);
typedef GLvoid (APIENTRY *glPointParameterfvPROC) (GLenum, const GLfloat *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBPointParameters_nglPointParameterfARB(JNIEnv *__env, jclass clazz, jint pname, jfloat param, jlong __functionAddress) {
	glPointParameterfARBPROC glPointParameterfARB = (glPointParameterfARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPointParameterfARB(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBPointParameters_nglPointParameterfv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glPointParameterfvPROC glPointParameterfv = (glPointParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPointParameterfv(pname, params);
}

EXTERN_C_EXIT
