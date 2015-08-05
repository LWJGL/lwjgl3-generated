/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glBlendEquationEXTPROC) (GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTBlendMinmax_nglBlendEquationEXT(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glBlendEquationEXTPROC glBlendEquationEXT = (glBlendEquationEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationEXT(mode);
}

EXTERN_C_EXIT
