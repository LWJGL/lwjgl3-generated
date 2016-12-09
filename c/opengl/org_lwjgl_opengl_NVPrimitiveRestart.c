/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glPrimitiveRestartNVPROC) (void);
typedef void (APIENTRY *glPrimitiveRestartIndexNVPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPrimitiveRestart_nglPrimitiveRestartNV(JNIEnv *__env, jclass clazz) {
	glPrimitiveRestartNVPROC glPrimitiveRestartNV = (glPrimitiveRestartNVPROC)tlsGetFunction(1240);
	UNUSED_PARAM(clazz)
	glPrimitiveRestartNV();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPrimitiveRestart_nglPrimitiveRestartIndexNV(JNIEnv *__env, jclass clazz, jint index) {
	glPrimitiveRestartIndexNVPROC glPrimitiveRestartIndexNV = (glPrimitiveRestartIndexNVPROC)tlsGetFunction(1239);
	UNUSED_PARAM(clazz)
	glPrimitiveRestartIndexNV(index);
}

EXTERN_C_EXIT