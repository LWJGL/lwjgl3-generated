/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBlendBarrierKHRPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRBlendEquationAdvanced_nglBlendBarrierKHR(JNIEnv *__env, jclass clazz) {
	glBlendBarrierKHRPROC glBlendBarrierKHR = (glBlendBarrierKHRPROC)tlsGetFunction(63);
	UNUSED_PARAM(clazz)
	glBlendBarrierKHR();
}

EXTERN_C_EXIT