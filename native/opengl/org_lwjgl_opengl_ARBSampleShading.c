/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glMinSampleShadingARBPROC) (GLfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSampleShading_nglMinSampleShadingARB(JNIEnv *__env, jclass clazz, jfloat value, jlong __functionAddress) {
	glMinSampleShadingARBPROC glMinSampleShadingARB = (glMinSampleShadingARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMinSampleShadingARB(value);
}

EXTERN_C_EXIT
