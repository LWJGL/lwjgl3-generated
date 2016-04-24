/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "OVR_CAPI.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1Detect(JNIEnv *__env, jclass clazz, jint timeoutMilliseconds, jlong __result) {
	UNUSED_PARAMS(__env, clazz)
	*((ovrDetectResult*)(intptr_t)__result) = ovr_Detect(timeoutMilliseconds);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1Projection(JNIEnv *__env, jclass clazz, jlong fovAddress, jfloat znear, jfloat zfar, jint projectionModFlags, jlong __result) {
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrMatrix4f*)(intptr_t)__result) = ovrMatrix4f_Projection(*fov, znear, zfar, projectionModFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrTimewarpProjectionDesc_1FromProjection(JNIEnv *__env, jclass clazz, jlong projectionAddress, jint projectionModFlags, jlong __result) {
	ovrMatrix4f *projection = (ovrMatrix4f *)(intptr_t)projectionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrTimewarpProjectionDesc*)(intptr_t)__result) = ovrTimewarpProjectionDesc_FromProjection(*projection, projectionModFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1OrthoSubProjection(JNIEnv *__env, jclass clazz, jlong projectionAddress, jlong orthoScaleAddress, jfloat orthoDistance, jfloat HmdToEyeOffsetX, jlong __result) {
	ovrMatrix4f *projection = (ovrMatrix4f *)(intptr_t)projectionAddress;
	ovrVector2f *orthoScale = (ovrVector2f *)(intptr_t)orthoScaleAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrMatrix4f*)(intptr_t)__result) = ovrMatrix4f_OrthoSubProjection(*projection, *orthoScale, orthoDistance, HmdToEyeOffsetX);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1CalcEyePoses(JNIEnv *__env, jclass clazz, jlong headPoseAddress, jlong HmdToEyeOffsetAddress, jlong outEyePosesAddress) {
	ovrPosef *headPose = (ovrPosef *)(intptr_t)headPoseAddress;
	const ovrVector3f *HmdToEyeOffset = (const ovrVector3f *)(intptr_t)HmdToEyeOffsetAddress;
	ovrPosef *outEyePoses = (ovrPosef *)(intptr_t)outEyePosesAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_CalcEyePoses(*headPose, HmdToEyeOffset, outEyePoses);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jboolean latencyMarker, jlong HmdToEyeOffsetAddress, jlong outEyePosesAddress, jlong outSensorSampleTimeAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const ovrVector3f *HmdToEyeOffset = (const ovrVector3f *)(intptr_t)HmdToEyeOffsetAddress;
	ovrPosef *outEyePoses = (ovrPosef *)(intptr_t)outEyePosesAddress;
	double *outSensorSampleTime = (double *)(intptr_t)outSensorSampleTimeAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_GetEyePoses(session, frameIndex, latencyMarker, HmdToEyeOffset, outEyePoses, outSensorSampleTime);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrPosef_1FlipHandedness(JNIEnv *__env, jclass clazz, jlong inPoseAddress, jlong outPoseAddress) {
	const ovrPosef *inPose = (const ovrPosef *)(intptr_t)inPoseAddress;
	ovrPosef *outPose = (ovrPosef *)(intptr_t)outPoseAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrPosef_FlipHandedness(inPose, outPose);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJ_3D(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jboolean latencyMarker, jlong HmdToEyeOffsetAddress, jlong outEyePosesAddress, jdoubleArray outSensorSampleTimeAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const ovrVector3f *HmdToEyeOffset = (const ovrVector3f *)(intptr_t)HmdToEyeOffsetAddress;
	ovrPosef *outEyePoses = (ovrPosef *)(intptr_t)outEyePosesAddress;
	jdouble *outSensorSampleTime = (*__env)->GetPrimitiveArrayCritical(__env, outSensorSampleTimeAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	ovr_GetEyePoses(session, frameIndex, latencyMarker, HmdToEyeOffset, outEyePoses, (double*)outSensorSampleTime);
	(*__env)->ReleasePrimitiveArrayCritical(__env, outSensorSampleTimeAddress, outSensorSampleTime, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJ_3D(jlong sessionAddress, jlong frameIndex, jboolean latencyMarker, jlong HmdToEyeOffsetAddress, jlong outEyePosesAddress, jint outSensorSampleTime__length, jdouble* outSensorSampleTime) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const ovrVector3f *HmdToEyeOffset = (const ovrVector3f *)(intptr_t)HmdToEyeOffsetAddress;
	ovrPosef *outEyePoses = (ovrPosef *)(intptr_t)outEyePosesAddress;
	UNUSED_PARAM(outSensorSampleTime__length)
	ovr_GetEyePoses(session, frameIndex, latencyMarker, HmdToEyeOffset, outEyePoses, (double*)outSensorSampleTime);
}

EXTERN_C_EXIT
