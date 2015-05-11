/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glPointParameteriNVPROC) (GLenum, GLint);
typedef GLvoid (APIENTRY *glPointParameterivNVPROC) (GLenum, const GLint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRenderingSharedEdge_nglPointParameteriNV(JNIEnv *__env, jclass clazz, jint pname, jint param, jlong __functionAddress) {
	glPointParameteriNVPROC glPointParameteriNV = (glPointParameteriNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPointParameteriNV(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRenderingSharedEdge_nglPointParameterivNV(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glPointParameterivNVPROC glPointParameterivNV = (glPointParameterivNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPointParameterivNV(pname, params);
}

EXTERN_C_EXIT
