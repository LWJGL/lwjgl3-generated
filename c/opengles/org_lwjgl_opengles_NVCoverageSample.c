/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glCoverageMaskNVPROC) (GLboolean);
typedef void (APIENTRY *glCoverageOperationNVPROC) (GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVCoverageSample_nglCoverageMaskNV(JNIEnv *__env, jclass clazz, jboolean mask, jlong __functionAddress) {
	glCoverageMaskNVPROC glCoverageMaskNV = (glCoverageMaskNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCoverageMaskNV(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVCoverageSample_nglCoverageOperationNV(JNIEnv *__env, jclass clazz, jint operation, jlong __functionAddress) {
	glCoverageOperationNVPROC glCoverageOperationNV = (glCoverageOperationNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCoverageOperationNV(operation);
}

EXTERN_C_EXIT
