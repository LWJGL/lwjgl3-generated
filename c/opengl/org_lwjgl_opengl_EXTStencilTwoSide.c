/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glActiveStencilFaceEXTPROC) (GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTStencilTwoSide_nglActiveStencilFaceEXT(JNIEnv *__env, jclass clazz, jint face, jlong __functionAddress) {
	glActiveStencilFaceEXTPROC glActiveStencilFaceEXT = (glActiveStencilFaceEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glActiveStencilFaceEXT(face);
}

EXTERN_C_EXIT
