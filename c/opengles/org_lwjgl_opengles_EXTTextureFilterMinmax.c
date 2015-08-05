/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glRasterSamplesEXTPROC) (GLuint, GLboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureFilterMinmax_nglRasterSamplesEXT(JNIEnv *__env, jclass clazz, jint samples, jboolean fixedsamplelocations, jlong __functionAddress) {
	glRasterSamplesEXTPROC glRasterSamplesEXT = (glRasterSamplesEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterSamplesEXT(samples, fixedsamplelocations);
}

EXTERN_C_EXIT
