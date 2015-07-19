/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glLoadTransposeMatrixfARBPROC) (const GLfloat *);
typedef void (APIENTRY *glLoadTransposeMatrixdARBPROC) (const GLdouble *);
typedef void (APIENTRY *glMultTransposeMatrixfARBPROC) (const GLfloat *);
typedef void (APIENTRY *glMultTransposeMatrixdARBPROC) (const GLdouble *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglLoadTransposeMatrixfARB(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glLoadTransposeMatrixfARBPROC glLoadTransposeMatrixfARB = (glLoadTransposeMatrixfARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLoadTransposeMatrixfARB(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglLoadTransposeMatrixdARB(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLdouble *m = (const GLdouble *)(intptr_t)mAddress;
	glLoadTransposeMatrixdARBPROC glLoadTransposeMatrixdARB = (glLoadTransposeMatrixdARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLoadTransposeMatrixdARB(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglMultTransposeMatrixfARB(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMultTransposeMatrixfARBPROC glMultTransposeMatrixfARB = (glMultTransposeMatrixfARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultTransposeMatrixfARB(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglMultTransposeMatrixdARB(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLdouble *m = (const GLdouble *)(intptr_t)mAddress;
	glMultTransposeMatrixdARBPROC glMultTransposeMatrixdARB = (glMultTransposeMatrixdARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultTransposeMatrixdARB(m);
}

EXTERN_C_EXIT
