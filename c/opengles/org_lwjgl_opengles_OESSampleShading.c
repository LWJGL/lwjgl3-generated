/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glMinSampleShadingOESPROC) (GLfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESSampleShading_nglMinSampleShadingOES(JNIEnv *__env, jclass clazz, jfloat value, jlong __functionAddress) {
	glMinSampleShadingOESPROC glMinSampleShadingOES = (glMinSampleShadingOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMinSampleShadingOES(value);
}

EXTERN_C_EXIT
