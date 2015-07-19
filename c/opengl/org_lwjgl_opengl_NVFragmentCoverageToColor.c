/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glFragmentCoverageColorNVPROC) (GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFragmentCoverageToColor_nglFragmentCoverageColorNV(JNIEnv *__env, jclass clazz, jint color, jlong __functionAddress) {
	glFragmentCoverageColorNVPROC glFragmentCoverageColorNV = (glFragmentCoverageColorNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFragmentCoverageColorNV(color);
}

EXTERN_C_EXIT
