/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glDepthBoundsEXTPROC) (double, double);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDepthBoundsTest_nglDepthBoundsEXT(JNIEnv *__env, jclass clazz, jdouble zmin, jdouble zmax, jlong __functionAddress) {
	glDepthBoundsEXTPROC glDepthBoundsEXT = (glDepthBoundsEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthBoundsEXT(zmin, zmax);
}

EXTERN_C_EXIT
