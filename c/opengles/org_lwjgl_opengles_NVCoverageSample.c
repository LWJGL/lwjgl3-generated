/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glCoverageMaskNVPROC) (jboolean);
typedef void (APIENTRY *glCoverageOperationNVPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVCoverageSample_nglCoverageMaskNV(JNIEnv *__env, jclass clazz, jboolean mask) {
	glCoverageMaskNVPROC glCoverageMaskNV = (glCoverageMaskNVPROC)tlsGetFunction(100);
	UNUSED_PARAM(clazz)
	glCoverageMaskNV(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVCoverageSample_nglCoverageOperationNV(JNIEnv *__env, jclass clazz, jint operation) {
	glCoverageOperationNVPROC glCoverageOperationNV = (glCoverageOperationNVPROC)tlsGetFunction(103);
	UNUSED_PARAM(clazz)
	glCoverageOperationNV(operation);
}

EXTERN_C_EXIT
