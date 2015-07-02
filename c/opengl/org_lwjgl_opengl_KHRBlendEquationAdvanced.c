/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glBlendBarrierKHRPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRBlendEquationAdvanced_nglBlendBarrierKHR(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glBlendBarrierKHRPROC glBlendBarrierKHR = (glBlendBarrierKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendBarrierKHR();
}

EXTERN_C_EXIT
