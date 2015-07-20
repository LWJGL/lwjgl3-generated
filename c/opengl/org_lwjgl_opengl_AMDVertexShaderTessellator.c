/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glTessellationFactorAMDPROC) (GLfloat);
typedef void (APIENTRY *glTessellationModeAMDPROC) (GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDVertexShaderTessellator_nglTessellationFactorAMD(JNIEnv *__env, jclass clazz, jfloat factor, jlong __functionAddress) {
	glTessellationFactorAMDPROC glTessellationFactorAMD = (glTessellationFactorAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTessellationFactorAMD(factor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDVertexShaderTessellator_nglTessellationModeAMD(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glTessellationModeAMDPROC glTessellationModeAMD = (glTessellationModeAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTessellationModeAMD(mode);
}

EXTERN_C_EXIT
