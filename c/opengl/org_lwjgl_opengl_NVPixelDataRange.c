/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glPixelDataRangeNVPROC) (GLenum, GLsizei, const void *);
typedef void (APIENTRY *glFlushPixelDataRangeNVPROC) (GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPixelDataRange_nglPixelDataRangeNV(JNIEnv *__env, jclass clazz, jint target, jint length, jlong pointerAddress, jlong __functionAddress) {
	const void *pointer = (const void *)(intptr_t)pointerAddress;
	glPixelDataRangeNVPROC glPixelDataRangeNV = (glPixelDataRangeNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPixelDataRangeNV(target, length, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPixelDataRange_nglFlushPixelDataRangeNV(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glFlushPixelDataRangeNVPROC glFlushPixelDataRangeNV = (glFlushPixelDataRangeNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFlushPixelDataRangeNV(target);
}

EXTERN_C_EXIT
