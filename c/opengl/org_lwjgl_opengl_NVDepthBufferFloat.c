/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glDepthRangedNVPROC) (GLdouble, GLdouble);
typedef void (APIENTRY *glClearDepthdNVPROC) (GLdouble);
typedef void (APIENTRY *glDepthBoundsdNVPROC) (GLdouble, GLdouble);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDepthBufferFloat_nglDepthRangedNV(JNIEnv *__env, jclass clazz, jdouble zNear, jdouble zFar, jlong __functionAddress) {
	glDepthRangedNVPROC glDepthRangedNV = (glDepthRangedNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthRangedNV(zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDepthBufferFloat_nglClearDepthdNV(JNIEnv *__env, jclass clazz, jdouble depth, jlong __functionAddress) {
	glClearDepthdNVPROC glClearDepthdNV = (glClearDepthdNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearDepthdNV(depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDepthBufferFloat_nglDepthBoundsdNV(JNIEnv *__env, jclass clazz, jdouble zmin, jdouble zmax, jlong __functionAddress) {
	glDepthBoundsdNVPROC glDepthBoundsdNV = (glDepthBoundsdNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthBoundsdNV(zmin, zmax);
}

EXTERN_C_EXIT
