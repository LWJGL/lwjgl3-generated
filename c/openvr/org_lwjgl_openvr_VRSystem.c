/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "openvr_capi.h"
ENABLE_WARNINGS()
#define APIENTRY OPENVR_FNTABLE_CALLTYPE

typedef HmdMatrix44_t (APIENTRY *VRSystem_GetProjectionMatrixPROC) (jint, jfloat, jfloat);
typedef HmdMatrix34_t (APIENTRY *VRSystem_GetEyeToHeadTransformPROC) (jint);
typedef HmdMatrix34_t (APIENTRY *VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPosePROC) (void);
typedef HmdMatrix34_t (APIENTRY *VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPosePROC) (void);
typedef HmdMatrix34_t (APIENTRY *VRSystem_GetMatrix34TrackedDevicePropertyPROC) (jint, jint, intptr_t);
typedef HiddenAreaMesh_t (APIENTRY *VRSystem_GetHiddenAreaMeshPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetProjectionMatrix(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint eEye, jfloat fNearZ, jfloat fFarZ, jlong __result) {
	VRSystem_GetProjectionMatrixPROC VRSystem_GetProjectionMatrix = (VRSystem_GetProjectionMatrixPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((HmdMatrix44_t*)(intptr_t)__result) = VRSystem_GetProjectionMatrix(eEye, fNearZ, fFarZ);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetEyeToHeadTransform(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint eEye, jlong __result) {
	VRSystem_GetEyeToHeadTransformPROC VRSystem_GetEyeToHeadTransform = (VRSystem_GetEyeToHeadTransformPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((HmdMatrix34_t*)(intptr_t)__result) = VRSystem_GetEyeToHeadTransform(eEye);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetSeatedZeroPoseToStandingAbsoluteTrackingPose(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
	VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPosePROC VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose = (VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPosePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((HmdMatrix34_t*)(intptr_t)__result) = VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose();
}

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetRawZeroPoseToStandingAbsoluteTrackingPose(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
	VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPosePROC VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose = (VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPosePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((HmdMatrix34_t*)(intptr_t)__result) = VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose();
}

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetMatrix34TrackedDeviceProperty__JIIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint unDeviceIndex, jint prop, jlong pErrorAddress, jlong __result) {
	VRSystem_GetMatrix34TrackedDevicePropertyPROC VRSystem_GetMatrix34TrackedDeviceProperty = (VRSystem_GetMatrix34TrackedDevicePropertyPROC)(intptr_t)__functionAddress;
	intptr_t pError = (intptr_t)pErrorAddress;
	UNUSED_PARAMS(__env, clazz)
	*((HmdMatrix34_t*)(intptr_t)__result) = VRSystem_GetMatrix34TrackedDeviceProperty(unDeviceIndex, prop, pError);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetHiddenAreaMesh(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint eEye, jint type, jlong __result) {
	VRSystem_GetHiddenAreaMeshPROC VRSystem_GetHiddenAreaMesh = (VRSystem_GetHiddenAreaMeshPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((HiddenAreaMesh_t*)(intptr_t)__result) = VRSystem_GetHiddenAreaMesh(eEye, type);
}

EXTERN_C_EXIT
