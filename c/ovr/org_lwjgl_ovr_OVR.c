/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4710))
#endif
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4711 4738))
#endif
#include "OVR_CAPIShim.c"
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

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetHmdDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong __result) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrHmdDesc*)(intptr_t)__result) = ovr_GetHmdDesc(session);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackerCount(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetTrackerCount(session);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackerDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint trackerDescIndex, jlong __result) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrTrackerDesc*)(intptr_t)__result) = ovr_GetTrackerDesc(session, trackerDescIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1Create(JNIEnv *__env, jclass clazz, jlong pSessionAddress, jlong luidAddress) {
	ovrSession *pSession = (ovrSession *)(intptr_t)pSessionAddress;
	ovrGraphicsLuid *luid = (ovrGraphicsLuid *)(intptr_t)luidAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_Create(pSession, luid);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1Destroy(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_Destroy(session);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetSessionStatus(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong sessionStatusAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrSessionStatus *sessionStatus = (ovrSessionStatus *)(intptr_t)sessionStatusAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetSessionStatus(session, sessionStatus);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetTrackingOriginType(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint origin) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_SetTrackingOriginType(session, origin);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackingOriginType(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetTrackingOriginType(session);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1RecenterTrackingOrigin(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_RecenterTrackingOrigin(session);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1ClearShouldRecenterFlag(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_ClearShouldRecenterFlag(session);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackingState(JNIEnv *__env, jclass clazz, jlong sessionAddress, jdouble absTime, jboolean latencyMarker, jlong __result) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrTrackingState*)(intptr_t)__result) = ovr_GetTrackingState(session, absTime, latencyMarker);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackerPose(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint trackerPoseIndex, jlong __result) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrTrackerPose*)(intptr_t)__result) = ovr_GetTrackerPose(session, trackerPoseIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetInputState(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong inputStateAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrInputState *inputState = (ovrInputState *)(intptr_t)inputStateAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetInputState(session, controllerType, inputState);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetConnectedControllerTypes(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetConnectedControllerTypes(session);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetControllerVibration(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jfloat frequency, jfloat amplitude) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_SetControllerVibration(session, controllerType, frequency, amplitude);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jlong out_LengthAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
	int *out_Length = (int *)(intptr_t)out_LengthAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetTextureSwapChainLength(session, chain, out_Length);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jlong out_IndexAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
	int *out_Index = (int *)(intptr_t)out_IndexAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetTextureSwapChainCurrentIndex(session, chain, out_Index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jlong out_DescAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
	ovrTextureSwapChainDesc *out_Desc = (ovrTextureSwapChainDesc *)(intptr_t)out_DescAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetTextureSwapChainDesc(session, chain, out_Desc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1CommitTextureSwapChain(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_CommitTextureSwapChain(session, chain);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1DestroyTextureSwapChain(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_DestroyTextureSwapChain(session, chain);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1DestroyMirrorTexture(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong mirrorTextureAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrMirrorTexture mirrorTexture = (ovrMirrorTexture)(intptr_t)mirrorTextureAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_DestroyMirrorTexture(session, mirrorTexture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFovTextureSize(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint eye, jlong fovAddress, jfloat pixelsPerDisplayPixel, jlong __result) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrSizei*)(intptr_t)__result) = ovr_GetFovTextureSize(session, eye, *fov, pixelsPerDisplayPixel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetRenderDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint eyeType, jlong fovAddress, jlong __result) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrEyeRenderDesc*)(intptr_t)__result) = ovr_GetRenderDesc(session, eyeType, *fov);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SubmitFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jlong viewScaleDescAddress, jlong layerPtrListAddress, jint layerCount) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const ovrViewScaleDesc *viewScaleDesc = (const ovrViewScaleDesc *)(intptr_t)viewScaleDescAddress;
	const ovrLayerHeader * const *layerPtrList = (const ovrLayerHeader * const *)(intptr_t)layerPtrListAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_SubmitFrame(session, frameIndex, viewScaleDesc, layerPtrList, layerCount);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetPredictedDisplayTime(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jdouble)ovr_GetPredictedDisplayTime(session, frameIndex);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_ovr_OVR_ovr_1GetTimeInSeconds(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jdouble)ovr_GetTimeInSeconds();
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBool(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jboolean defaultVal) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_GetBool(session, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetBool(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jboolean value) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_SetBool(session, propertyName, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetInt(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jint defaultVal) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetInt(session, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetInt(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jint value) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_SetInt(session, propertyName, value);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloat(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloat defaultVal) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)ovr_GetFloat(session, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloat(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloat value) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_SetFloat(session, propertyName, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloatArray(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesCapacity) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	float *values = (float *)(intptr_t)valuesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetFloatArray(session, propertyName, values, valuesCapacity);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloatArray(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesSize) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	float *values = (float *)(intptr_t)valuesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_SetFloatArray(session, propertyName, values, valuesSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetString(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jlong defaultValAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	const char *defaultVal = (const char *)(intptr_t)defaultValAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ovr_GetString(session, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetString(JNIEnv *__env, jclass clazz, jlong hmddescAddress, jlong propertyNameAddress, jlong valueAddress) {
	ovrSession hmddesc = (ovrSession)(intptr_t)hmddescAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	const char *value = (const char *)(intptr_t)valueAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_SetString(hmddesc, propertyName, value);
}

EXTERN_C_EXIT
