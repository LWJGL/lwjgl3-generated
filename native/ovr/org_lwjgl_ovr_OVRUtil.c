/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "OVR_CAPI_0_6_0.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1Projection(JNIEnv *__env, jclass clazz, jlong fovAddress, jfloat znear, jfloat zfar, jint projectionModFlags, jlong __result) {
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrMatrix4f*)(intptr_t)__result) = ovrMatrix4f_Projection(*fov, znear, zfar, projectionModFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrTimewarpProjectionDesc_1FromProjection(JNIEnv *__env, jclass clazz, jlong projectionAddress, jlong __result) {
	ovrMatrix4f *projection = (ovrMatrix4f *)(intptr_t)projectionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrTimewarpProjectionDesc*)(intptr_t)__result) = ovrTimewarpProjectionDesc_FromProjection(*projection);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1OrthoSubProjection(JNIEnv *__env, jclass clazz, jlong projectionAddress, jlong orthoScaleAddress, jfloat orthoDistance, jfloat hmdToEyeViewOffsetX, jlong __result) {
	ovrMatrix4f *projection = (ovrMatrix4f *)(intptr_t)projectionAddress;
	ovrVector2f *orthoScale = (ovrVector2f *)(intptr_t)orthoScaleAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrMatrix4f*)(intptr_t)__result) = ovrMatrix4f_OrthoSubProjection(*projection, *orthoScale, orthoDistance, hmdToEyeViewOffsetX);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1CalcEyePoses(JNIEnv *__env, jclass clazz, jlong headPoseAddress, jlong hmdToEyeViewOffsetAddress, jlong outEyePosesAddress) {
	ovrPosef *headPose = (ovrPosef *)(intptr_t)headPoseAddress;
	const ovrVector3f *hmdToEyeViewOffset = (const ovrVector3f *)(intptr_t)hmdToEyeViewOffsetAddress;
	ovrPosef *outEyePoses = (ovrPosef *)(intptr_t)outEyePosesAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_CalcEyePoses(*headPose, hmdToEyeViewOffset, outEyePoses);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrHmd_1GetEyePoses(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint frameIndex, jlong hmdToEyeViewOffsetAddress, jlong outEyePosesAddress, jlong outHmdTrackingStateAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const ovrVector3f *hmdToEyeViewOffset = (const ovrVector3f *)(intptr_t)hmdToEyeViewOffsetAddress;
	ovrPosef *outEyePoses = (ovrPosef *)(intptr_t)outEyePosesAddress;
	ovrTrackingState *outHmdTrackingState = (ovrTrackingState *)(intptr_t)outHmdTrackingStateAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_GetEyePoses(hmd, frameIndex, hmdToEyeViewOffset, outEyePoses, outHmdTrackingState);
}

EXTERN_C_EXIT
