/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glPrimitiveRestartNVPROC) (void);
typedef void (APIENTRY *glPrimitiveRestartIndexNVPROC) (GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPrimitiveRestart_nglPrimitiveRestartNV(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPrimitiveRestartNVPROC glPrimitiveRestartNV = (glPrimitiveRestartNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPrimitiveRestartNV();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPrimitiveRestart_nglPrimitiveRestartIndexNV(JNIEnv *__env, jclass clazz, jint index, jlong __functionAddress) {
	glPrimitiveRestartIndexNVPROC glPrimitiveRestartIndexNV = (glPrimitiveRestartIndexNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPrimitiveRestartIndexNV(index);
}

EXTERN_C_EXIT
