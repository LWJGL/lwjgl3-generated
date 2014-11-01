/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glBlendColorEXTPROC) (GLclampf, GLclampf, GLclampf, GLclampf);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTBlendColor_nglBlendColorEXT(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha, jlong __functionAddress) {
	glBlendColorEXTPROC glBlendColorEXT = (glBlendColorEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendColorEXT(red, green, blue, alpha);
}

EXTERN_C_EXIT
