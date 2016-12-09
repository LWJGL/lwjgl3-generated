/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDepthRangedNVPROC) (jdouble, jdouble);
typedef void (APIENTRY *glClearDepthdNVPROC) (jdouble);
typedef void (APIENTRY *glDepthBoundsdNVPROC) (jdouble, jdouble);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDepthBufferFloat_nglDepthRangedNV(JNIEnv *__env, jclass clazz, jdouble zNear, jdouble zFar) {
	glDepthRangedNVPROC glDepthRangedNV = (glDepthRangedNVPROC)tlsGetFunction(326);
	UNUSED_PARAM(clazz)
	glDepthRangedNV(zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDepthBufferFloat_nglClearDepthdNV(JNIEnv *__env, jclass clazz, jdouble depth) {
	glClearDepthdNVPROC glClearDepthdNV = (glClearDepthdNVPROC)tlsGetFunction(118);
	UNUSED_PARAM(clazz)
	glClearDepthdNV(depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDepthBufferFloat_nglDepthBoundsdNV(JNIEnv *__env, jclass clazz, jdouble zmin, jdouble zmax) {
	glDepthBoundsdNVPROC glDepthBoundsdNV = (glDepthBoundsdNVPROC)tlsGetFunction(320);
	UNUSED_PARAM(clazz)
	glDepthBoundsdNV(zmin, zmax);
}

EXTERN_C_EXIT