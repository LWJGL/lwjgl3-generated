/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glLoadTransposeMatrixfARBPROC) (const intptr_t);
typedef void (APIENTRY *glLoadTransposeMatrixdARBPROC) (const intptr_t);
typedef void (APIENTRY *glMultTransposeMatrixfARBPROC) (const intptr_t);
typedef void (APIENTRY *glMultTransposeMatrixdARBPROC) (const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglLoadTransposeMatrixfARB__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
	glLoadTransposeMatrixfARBPROC glLoadTransposeMatrixfARB = (glLoadTransposeMatrixfARBPROC)tlsGetFunction(911);
	const intptr_t m = (const intptr_t)mAddress;
	UNUSED_PARAM(clazz)
	glLoadTransposeMatrixfARB(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglLoadTransposeMatrixdARB__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
	glLoadTransposeMatrixdARBPROC glLoadTransposeMatrixdARB = (glLoadTransposeMatrixdARBPROC)tlsGetFunction(909);
	const intptr_t m = (const intptr_t)mAddress;
	UNUSED_PARAM(clazz)
	glLoadTransposeMatrixdARB(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglMultTransposeMatrixfARB__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
	glMultTransposeMatrixfARBPROC glMultTransposeMatrixfARB = (glMultTransposeMatrixfARBPROC)tlsGetFunction(988);
	const intptr_t m = (const intptr_t)mAddress;
	UNUSED_PARAM(clazz)
	glMultTransposeMatrixfARB(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglMultTransposeMatrixdARB__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
	glMultTransposeMatrixdARBPROC glMultTransposeMatrixdARB = (glMultTransposeMatrixdARBPROC)tlsGetFunction(986);
	const intptr_t m = (const intptr_t)mAddress;
	UNUSED_PARAM(clazz)
	glMultTransposeMatrixdARB(m);
}

EXTERN_C_EXIT
