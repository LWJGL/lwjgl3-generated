/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glSampleCoverageARBPROC) (GLfloat, GLboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultisample_nglSampleCoverageARB(JNIEnv *__env, jclass clazz, jfloat value, jboolean invert, jlong __functionAddress) {
	glSampleCoverageARBPROC glSampleCoverageARB = (glSampleCoverageARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSampleCoverageARB(value, invert);
}

EXTERN_C_EXIT
