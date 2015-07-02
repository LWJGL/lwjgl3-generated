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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1Initialize(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
	const ovrInitParams *params = (const ovrInitParams *)(intptr_t)paramsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_Initialize(params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_ovr_1Shutdown(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	ovr_Shutdown();
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetLastErrorInfo(JNIEnv *__env, jclass clazz, jlong errorInfoAddress) {
	ovrErrorInfo *errorInfo = (ovrErrorInfo *)(intptr_t)errorInfoAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_GetLastErrorInfo(errorInfo);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetVersionString(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ovr_GetVersionString();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novr_1TraceMessage(JNIEnv *__env, jclass clazz, jint level, jlong messageAddress) {
	const char *message = (const char *)(intptr_t)messageAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ovr_TraceMessage(level, message);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_ovrHmd_1Detect(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovrHmd_Detect();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1Create(JNIEnv *__env, jclass clazz, jint index, jlong pHmdAddress) {
	ovrHmd *pHmd = (ovrHmd *)(intptr_t)pHmdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovrHmd_Create(index, pHmd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1CreateDebug(JNIEnv *__env, jclass clazz, jint type, jlong pHmdAddress) {
	ovrHmd *pHmd = (ovrHmd *)(intptr_t)pHmdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovrHmd_CreateDebug(type, pHmd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1Destroy(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_Destroy(hmd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetEnabledCaps(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovrHmd_GetEnabledCaps(hmd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1SetEnabledCaps(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint hmdCaps) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_SetEnabledCaps(hmd, hmdCaps);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1ConfigureTracking(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint supportedTrackingCaps, jint requiredTrackingCaps) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovrHmd_ConfigureTracking(hmd, supportedTrackingCaps, requiredTrackingCaps);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1RecenterPose(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_RecenterPose(hmd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetTrackingState(JNIEnv *__env, jclass clazz, jlong hmdAddress, jdouble absTime, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrTrackingState*)(intptr_t)__result) = ovrHmd_GetTrackingState(hmd, absTime);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1DestroySwapTextureSet(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong textureSetAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrSwapTextureSet *textureSet = (ovrSwapTextureSet *)(intptr_t)textureSetAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_DestroySwapTextureSet(hmd, textureSet);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1DestroyMirrorTexture(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong mirrorTextureAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrTexture *mirrorTexture = (ovrTexture *)(intptr_t)mirrorTextureAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_DestroyMirrorTexture(hmd, mirrorTexture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetFovTextureSize(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint eye, jlong fovAddress, jfloat pixelsPerDisplayPixel, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrSizei*)(intptr_t)__result) = ovrHmd_GetFovTextureSize(hmd, eye, *fov, pixelsPerDisplayPixel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetRenderDesc(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint eyeType, jlong fovAddress, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrEyeRenderDesc*)(intptr_t)__result) = ovrHmd_GetRenderDesc(hmd, eyeType, *fov);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1SubmitFrame(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint frameIndex, jlong viewScaleDescAddress, jlong layerPtrListAddress, jint layerCount) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const ovrViewScaleDesc *viewScaleDesc = (const ovrViewScaleDesc *)(intptr_t)viewScaleDescAddress;
	const ovrLayerHeader * const *layerPtrList = (const ovrLayerHeader * const *)(intptr_t)layerPtrListAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovrHmd_SubmitFrame(hmd, frameIndex, viewScaleDesc, layerPtrList, layerCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetFrameTiming(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint frameIndex, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrFrameTiming*)(intptr_t)__result) = ovrHmd_GetFrameTiming(hmd, frameIndex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1ResetFrameTiming(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint frameIndex) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_ResetFrameTiming(hmd, frameIndex);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_ovr_OVR_ovr_1GetTimeInSeconds(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jdouble)ovr_GetTimeInSeconds();
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetBool(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jboolean defaultVal) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_GetBool(hmd, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1SetBool(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jboolean value) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_SetBool(hmd, propertyName, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetInt(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jint defaultVal) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovrHmd_GetInt(hmd, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1SetInt(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jint value) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_SetInt(hmd, propertyName, value);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetFloat(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jfloat defaultVal) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)ovrHmd_GetFloat(hmd, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1SetFloat(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jfloat value) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_SetFloat(hmd, propertyName, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetFloatArray(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesCapacity) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	float *values = (float *)(intptr_t)valuesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovrHmd_GetFloatArray(hmd, propertyName, values, valuesCapacity);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1SetFloatArray(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesSize) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	float *values = (float *)(intptr_t)valuesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_SetFloatArray(hmd, propertyName, values, valuesSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetString(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jlong defaultValAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	const char *defaultVal = (const char *)(intptr_t)defaultValAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ovrHmd_GetString(hmd, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1SetString(JNIEnv *__env, jclass clazz, jlong hmddescAddress, jlong propertyNameAddress, jlong valueAddress) {
	ovrHmd hmddesc = (ovrHmd)(intptr_t)hmddescAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	const char *value = (const char *)(intptr_t)valueAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_SetString(hmddesc, propertyName, value);
}

EXTERN_C_EXIT
