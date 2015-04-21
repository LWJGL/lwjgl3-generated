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

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_ovr_1InitializeRenderingShimVersion(JNIEnv *__env, jclass clazz, jint requestedMinorVersion) {
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_InitializeRenderingShimVersion(requestedMinorVersion);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_ovr_1InitializeRenderingShim(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_InitializeRenderingShim();
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1Initialize(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
	ovrInitParams const *params = (ovrInitParams const *)(intptr_t)paramsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovr_Initialize(params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_ovr_1Shutdown(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	ovr_Shutdown();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetVersionString(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ovr_GetVersionString();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_ovrHmd_1Detect(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovrHmd_Detect();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_ovrHmd_1Create(JNIEnv *__env, jclass clazz, jint index) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ovrHmd_Create(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1Destroy(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_Destroy(hmd);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_ovrHmd_1CreateDebug(JNIEnv *__env, jclass clazz, jint type) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ovrHmd_CreateDebug(type);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetLastError(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ovrHmd_GetLastError(hmd);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1AttachToWindow(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong windowAddress, jlong destMirrorRectAddress, jlong sourceRenderTargetRectAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	void *window = (void *)(intptr_t)windowAddress;
	const ovrRecti *destMirrorRect = (const ovrRecti *)(intptr_t)destMirrorRectAddress;
	const ovrRecti *sourceRenderTargetRect = (const ovrRecti *)(intptr_t)sourceRenderTargetRectAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_AttachToWindow(hmd, window, destMirrorRect, sourceRenderTargetRect);
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

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1ConfigureTracking(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint supportedTrackingCaps, jint requiredTrackingCaps) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_ConfigureTracking(hmd, supportedTrackingCaps, requiredTrackingCaps);
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

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetFovTextureSize(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint eye, jlong fovAddress, jfloat pixelsPerDisplayPixel, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrSizei*)(intptr_t)__result) = ovrHmd_GetFovTextureSize(hmd, eye, *fov, pixelsPerDisplayPixel);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1ConfigureRendering(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong apiConfigAddress, jint distortionCaps, jlong eyeFovInAddress, jlong eyeRenderDescOutAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const ovrRenderAPIConfig *apiConfig = (const ovrRenderAPIConfig *)(intptr_t)apiConfigAddress;
	const ovrFovPort *eyeFovIn = (const ovrFovPort *)(intptr_t)eyeFovInAddress;
	ovrEyeRenderDesc *eyeRenderDescOut = (ovrEyeRenderDesc *)(intptr_t)eyeRenderDescOutAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_ConfigureRendering(hmd, apiConfig, distortionCaps, eyeFovIn, eyeRenderDescOut);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1BeginFrame(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint frameIndex, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrFrameTiming*)(intptr_t)__result) = ovrHmd_BeginFrame(hmd, frameIndex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1EndFrame(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong renderPoseAddress, jlong eyeTextureAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const ovrPosef *renderPose = (const ovrPosef *)(intptr_t)renderPoseAddress;
	const ovrTexture *eyeTexture = (const ovrTexture *)(intptr_t)eyeTextureAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_EndFrame(hmd, renderPose, eyeTexture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetEyePoses(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint frameIndex, jlong hmdToEyeViewOffsetAddress, jlong outEyePosesAddress, jlong outHmdTrackingStateAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrVector3f *hmdToEyeViewOffset = (ovrVector3f *)(intptr_t)hmdToEyeViewOffsetAddress;
	ovrPosef *outEyePoses = (ovrPosef *)(intptr_t)outEyePosesAddress;
	ovrTrackingState *outHmdTrackingState = (ovrTrackingState *)(intptr_t)outHmdTrackingStateAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_GetEyePoses(hmd, frameIndex, hmdToEyeViewOffset, outEyePoses, outHmdTrackingState);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetHmdPosePerEye(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint eye, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrPosef*)(intptr_t)__result) = ovrHmd_GetHmdPosePerEye(hmd, eye);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetRenderDesc(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint eyeType, jlong fovAddress, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrEyeRenderDesc*)(intptr_t)__result) = ovrHmd_GetRenderDesc(hmd, eyeType, *fov);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1CreateDistortionMesh(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint eyeType, jlong fovAddress, jint distortionCaps, jlong meshDataAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	ovrDistortionMesh *meshData = (ovrDistortionMesh *)(intptr_t)meshDataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_CreateDistortionMesh(hmd, eyeType, *fov, distortionCaps, meshData);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1CreateDistortionMeshDebug(JNIEnv *__env, jclass clazz, jlong hmddescAddress, jint eyeType, jlong fovAddress, jint distortionCaps, jlong meshDataAddress, jfloat debugEyeReliefOverrideInMetres) {
	ovrHmd hmddesc = (ovrHmd)(intptr_t)hmddescAddress;
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	ovrDistortionMesh *meshData = (ovrDistortionMesh *)(intptr_t)meshDataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_CreateDistortionMeshDebug(hmddesc, eyeType, *fov, distortionCaps, meshData, debugEyeReliefOverrideInMetres);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1DestroyDistortionMesh(JNIEnv *__env, jclass clazz, jlong meshDataAddress) {
	ovrDistortionMesh *meshData = (ovrDistortionMesh *)(intptr_t)meshDataAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_DestroyDistortionMesh(meshData);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetRenderScaleAndOffset(JNIEnv *__env, jclass clazz, jlong fovAddress, jlong textureSizeAddress, jlong renderViewportAddress, jlong uvScaleOffsetOutAddress) {
	ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
	ovrSizei *textureSize = (ovrSizei *)(intptr_t)textureSizeAddress;
	ovrRecti *renderViewport = (ovrRecti *)(intptr_t)renderViewportAddress;
	ovrVector2f *uvScaleOffsetOut = (ovrVector2f *)(intptr_t)uvScaleOffsetOutAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_GetRenderScaleAndOffset(*fov, *textureSize, *renderViewport, uvScaleOffsetOut);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetFrameTiming(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint frameIndex, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrFrameTiming*)(intptr_t)__result) = ovrHmd_GetFrameTiming(hmd, frameIndex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1BeginFrameTiming(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint frameIndex, jlong __result) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	*((ovrFrameTiming*)(intptr_t)__result) = ovrHmd_BeginFrameTiming(hmd, frameIndex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1EndFrameTiming(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_EndFrameTiming(hmd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1ResetFrameTiming(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint frameIndex) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_ResetFrameTiming(hmd, frameIndex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetEyeTimewarpMatrices(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint eye, jlong renderPoseAddress, jlong twmOutAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrPosef *renderPose = (ovrPosef *)(intptr_t)renderPoseAddress;
	ovrMatrix4f *twmOut = (ovrMatrix4f *)(intptr_t)twmOutAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_GetEyeTimewarpMatrices(hmd, eye, *renderPose, twmOut);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetEyeTimewarpMatricesDebug(JNIEnv *__env, jclass clazz, jlong hmdAddress, jint eye, jlong renderPoseAddress, jlong playerTorsoMotionAddress, jlong twmOutAddress, jdouble debugTimingOffsetInSeconds) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrPosef *renderPose = (ovrPosef *)(intptr_t)renderPoseAddress;
	ovrQuatf *playerTorsoMotion = (ovrQuatf *)(intptr_t)playerTorsoMotionAddress;
	ovrMatrix4f *twmOut = (ovrMatrix4f *)(intptr_t)twmOutAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_GetEyeTimewarpMatricesDebug(hmd, eye, *renderPose, *playerTorsoMotion, twmOut, debugTimingOffsetInSeconds);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_ovr_OVR_ovr_1GetTimeInSeconds(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jdouble)ovr_GetTimeInSeconds();
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1ProcessLatencyTest(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong rgbColorOutAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	unsigned char *rgbColorOut = (unsigned char *)(intptr_t)rgbColorOutAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_ProcessLatencyTest(hmd, rgbColorOut);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetLatencyTestResult(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ovrHmd_GetLatencyTestResult(hmd);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetLatencyTest2DrawColor(JNIEnv *__env, jclass clazz, jlong hmddescAddress, jlong rgbColorOutAddress) {
	ovrHmd hmddesc = (ovrHmd)(intptr_t)hmddescAddress;
	unsigned char *rgbColorOut = (unsigned char *)(intptr_t)rgbColorOutAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_GetLatencyTest2DrawColor(hmddesc, rgbColorOut);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetHSWDisplayState(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong hasWarningStateAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	ovrHSWDisplayState *hasWarningState = (ovrHSWDisplayState *)(intptr_t)hasWarningStateAddress;
	UNUSED_PARAMS(__env, clazz)
	ovrHmd_GetHSWDisplayState(hmd, hasWarningState);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1DismissHSWDisplay(JNIEnv *__env, jclass clazz, jlong hmdAddress) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_DismissHSWDisplay(hmd);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1GetFloatArray(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jlong valuesAddress, jint arraySize) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	float *values = (float *)(intptr_t)valuesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovrHmd_GetFloatArray(hmd, propertyName, values, arraySize);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novrHmd_1SetFloatArray(JNIEnv *__env, jclass clazz, jlong hmdAddress, jlong propertyNameAddress, jlong valuesAddress, jint arraySize) {
	ovrHmd hmd = (ovrHmd)(intptr_t)hmdAddress;
	const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
	float *values = (float *)(intptr_t)valuesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)ovrHmd_SetFloatArray(hmd, propertyName, values, arraySize);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1TraceMessage(JNIEnv *__env, jclass clazz, jint level, jlong messageAddress) {
	const char *message = (const char *)(intptr_t)messageAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_TraceMessage(level, message);
}

EXTERN_C_EXIT
