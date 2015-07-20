/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glConservativeRasterParameterfNVPROC) (GLenum, GLfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVConservativeRasterDilate_nglConservativeRasterParameterfNV(JNIEnv *__env, jclass clazz, jint pname, jfloat value, jlong __functionAddress) {
	glConservativeRasterParameterfNVPROC glConservativeRasterParameterfNV = (glConservativeRasterParameterfNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glConservativeRasterParameterfNV(pname, value);
}

EXTERN_C_EXIT
