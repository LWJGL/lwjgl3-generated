/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "OVR_CAPI_0_5_0.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1Projection(JNIEnv *__env, jclass clazz, jlong fovAddress, jfloat znear, jfloat zfar, jint projectionModFlags, jlong __result) {
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrMatrix4f*)(intptr_t)__result) = ovrMatrix4f_Projection(*fov, znear, zfar, projectionModFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1OrthoSubProjection(JNIEnv *__env, jclass clazz, jlong projectionAddress, jlong orthoScaleAddress, jfloat orthoDistance, jfloat hmdToEyeViewOffsetX, jlong __result) {
	ovrMatrix4f *projection = (ovrMatrix4f *)(intptr_t)projectionAddress;
	ovrVector2f *orthoScale = (ovrVector2f *)(intptr_t)orthoScaleAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrMatrix4f*)(intptr_t)__result) = ovrMatrix4f_OrthoSubProjection(*projection, *orthoScale, orthoDistance, hmdToEyeViewOffsetX);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_ovr_OVRUtil_ovr_1WaitTillTime(JNIEnv *__env, jclass clazz, jdouble absTime) {
	UNUSED_PARAMS(__env, clazz)
	return (jdouble)ovr_WaitTillTime(absTime);
}

EXTERN_C_EXIT
