/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTessellationFactorAMDPROC) (jfloat);
typedef void (APIENTRY *glTessellationModeAMDPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDVertexShaderTessellator_nglTessellationFactorAMD(JNIEnv *__env, jclass clazz, jfloat factor) {
	glTessellationFactorAMDPROC glTessellationFactorAMD = (glTessellationFactorAMDPROC)tlsGetFunction(1546);
	UNUSED_PARAM(clazz)
	glTessellationFactorAMD(factor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDVertexShaderTessellator_nglTessellationModeAMD(JNIEnv *__env, jclass clazz, jint mode) {
	glTessellationModeAMDPROC glTessellationModeAMD = (glTessellationModeAMDPROC)tlsGetFunction(1547);
	UNUSED_PARAM(clazz)
	glTessellationModeAMD(mode);
}

EXTERN_C_EXIT
