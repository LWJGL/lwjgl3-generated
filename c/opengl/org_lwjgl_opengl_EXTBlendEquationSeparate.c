/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBlendEquationSeparateEXTPROC) (GLenum, GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTBlendEquationSeparate_nglBlendEquationSeparateEXT(JNIEnv *__env, jclass clazz, jint modeRGB, jint modeAlpha, jlong __functionAddress) {
	glBlendEquationSeparateEXTPROC glBlendEquationSeparateEXT = (glBlendEquationSeparateEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationSeparateEXT(modeRGB, modeAlpha);
}

EXTERN_C_EXIT
