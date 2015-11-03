/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_WINDOWS
	#define _NO_CRT_STDIO_INLINE
#endif
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4711))
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

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetHmdDesc(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrHmdDesc*)(intptr_t)__result) = ovr_GetHmdDesc(hmd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1Create(JNIEnv *__env, jclass clazz, jlong pHmdAddress, jlong luidAddress) {
	ovrHmd *pHmd = (ovrHmd *)(intptr_t)pHmdAddress;
	ovrGraphicsLuid *luid = (ovrGraphicsLuid *)(intptr_t)luidAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_Create(pHmd, luid);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1Destroy(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_Destroy(hmd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetEnabledCaps(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetEnabledCaps(hmd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetEnabledCaps(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint hmdCaps) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_SetEnabledCaps(hmd, hmdCaps);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1ConfigureTracking(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint requestedTrackingCaps, jint requiredTrackingCaps) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_ConfigureTracking(hmd, requestedTrackingCaps, requiredTrackingCaps);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1RecenterPose(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_RecenterPose(hmd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackingState(JNIEnv *__env, jclass clazz, jlong hmdAddress, jdouble absTime, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrTrackingState*)(intptr_t)__result) = ovr_GetTrackingState(hmd, absTime);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetInputState(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint controllerTypeMask, jlong inputStateAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrInputState *inputState = (ovrInputState *)(intptr_t)inputStateAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetInputState(hmd, controllerTypeMask, inputState);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetControllerVibration(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint controllerTypeMask, jfloat frequency, jfloat amplitude) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_SetControllerVibration(hmd, controllerTypeMask, frequency, amplitude);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1DestroySwapTextureSet(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong textureSetAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrSwapTextureSet *textureSet = (ovrSwapTextureSet *)(intptr_t)textureSetAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_DestroySwapTextureSet(hmd, textureSet);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1DestroyMirrorTexture(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong mirrorTextureAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrTexture *mirrorTexture = (ovrTexture *)(intptr_t)mirrorTextureAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_DestroyMirrorTexture(hmd, mirrorTexture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFovTextureSize(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint eye, jlong fovAddress, jfloat pixelsPerDisplayPixel, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrSizei*)(intptr_t)__result) = ovr_GetFovTextureSize(hmd, eye, *fov, pixelsPerDisplayPixel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetRenderDesc(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint eyeType, jlong fovAddress, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrEyeRenderDesc*)(intptr_t)__result) = ovr_GetRenderDesc(hmd, eyeType, *fov);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SubmitFrame(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint frameIndex, jlong viewScaleDescAddress, jlong layerPtrListAddress, jint layerCount) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const ovrViewScaleDesc *viewScaleDesc = (const ovrViewScaleDesc *)(intptr_t)viewScaleDescAddress;
	const ovrLayerHeader * const *layerPtrList = (const ovrLayerHeader * const *)(intptr_t)layerPtrListAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_SubmitFrame(hmd, frameIndex, viewScaleDesc, layerPtrList, layerCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFrameTiming(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint frameIndex, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrFrameTiming*)(intptr_t)__result) = ovr_GetFrameTiming(hmd, frameIndex);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_ovr_OVR_ovr_1GetTimeInSeconds(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jdouble)ovr_GetTimeInSeconds();
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1ResetBackOfHeadTracking(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_ResetBackOfHeadTracking(hmd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1ResetMulticameraTracking(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovr_ResetMulticameraTracking(hmd);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBool(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jboolean defaultVal) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_GetBool(hmd, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetBool(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jboolean value) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_SetBool(hmd, propertyName, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetInt(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jint defaultVal) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetInt(hmd, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetInt(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jint value) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_SetInt(hmd, propertyName, value);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloat(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jfloat defaultVal) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)ovr_GetFloat(hmd, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloat(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jfloat value) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_SetFloat(hmd, propertyName, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloatArray(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesCapacity) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	float *values = (float *)(intptr_t)valuesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetFloatArray(hmd, propertyName, values, valuesCapacity);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloatArray(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesSize) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	float *values = (float *)(intptr_t)valuesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_SetFloatArray(hmd, propertyName, values, valuesSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetString(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jlong defaultValAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	const char *defaultVal = (const char *)(intptr_t)defaultValAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ovr_GetString(hmd, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetString(JNIEnv *__env, jclass clazz, jlong hmddescAddress, jlong propertyNameAddress, jlong valueAddress) {
	ovrHmd hmddesc = (ovrHmd)(intptr_t)hmddescAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	const char *value = (const char *)(intptr_t)valueAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_SetString(hmddesc, propertyName, value);
}

EXTERN_C_EXIT
