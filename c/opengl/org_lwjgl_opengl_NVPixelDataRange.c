/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glPixelDataRangeNVPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glFlushPixelDataRangeNVPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPixelDataRange_nglPixelDataRangeNV(JNIEnv *__env, jclass clazz, jint target, jint length, jlong pointerAddress) {
	glPixelDataRangeNVPROC glPixelDataRangeNV = (glPixelDataRangeNVPROC)tlsGetFunction(1206);
	const intptr_t pointer = (const intptr_t)pointerAddress;
	UNUSED_PARAM(clazz)
	glPixelDataRangeNV(target, length, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPixelDataRange_nglFlushPixelDataRangeNV(JNIEnv *__env, jclass clazz, jint target) {
	glFlushPixelDataRangeNVPROC glFlushPixelDataRangeNV = (glFlushPixelDataRangeNVPROC)tlsGetFunction(425);
	UNUSED_PARAM(clazz)
	glFlushPixelDataRangeNV(target);
}

EXTERN_C_EXIT