/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1IdentifyClient(JNIEnv *__env, jclass clazz, jlong identityAddress) {
    const char *identity = (const char *)(intptr_t)identityAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_IdentifyClient(identity);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1Create(JNIEnv *__env, jclass clazz, jlong pSessionAddress, jlong pLuidAddress) {
    ovrSession *pSession = (ovrSession *)(intptr_t)pSessionAddress;
    ovrGraphicsLuid *pLuid = (ovrGraphicsLuid *)(intptr_t)pLuidAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_Create(pSession, pLuid);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1IsExtensionSupported(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint extension, jlong outExtensionSupportedAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrBool *outExtensionSupported = (ovrBool *)(intptr_t)outExtensionSupportedAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_IsExtensionSupported(session, extension, outExtensionSupported);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1EnableExtension(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint extension) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_EnableExtension(session, extension);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SpecifyTrackingOrigin(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong originPoseAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrPosef *originPose = (ovrPosef *)(intptr_t)originPoseAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SpecifyTrackingOrigin(session, *originPose);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__JJIDJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong deviceTypesAddress, jint deviceCount, jdouble absTime, jlong outDevicePosesAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTrackedDeviceType *deviceTypes = (ovrTrackedDeviceType *)(intptr_t)deviceTypesAddress;
    ovrPoseStatef *outDevicePoses = (ovrPoseStatef *)(intptr_t)outDevicePosesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetDevicePoses(session, deviceTypes, deviceCount, absTime, outDevicePoses);
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

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTouchHapticsDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong __result) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrTouchHapticsDesc*)(intptr_t)__result) = ovr_GetTouchHapticsDesc(session, controllerType);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetControllerVibration(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jfloat frequency, jfloat amplitude) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SetControllerVibration(session, controllerType, frequency, amplitude);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SubmitControllerVibration(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong bufferAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    const ovrHapticsBuffer *buffer = (const ovrHapticsBuffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SubmitControllerVibration(session, controllerType, buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetControllerVibrationState(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong outStateAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrHapticsPlaybackState *outState = (ovrHapticsPlaybackState *)(intptr_t)outStateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetControllerVibrationState(session, controllerType, outState);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1TestBoundary(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint deviceBitmask, jint boundaryType, jlong outTestResultAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrBoundaryTestResult *outTestResult = (ovrBoundaryTestResult *)(intptr_t)outTestResultAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_TestBoundary(session, deviceBitmask, boundaryType, outTestResult);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1TestBoundaryPoint(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong pointAddress, jint singleBoundaryType, jlong outTestResultAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    const ovrVector3f *point = (const ovrVector3f *)(intptr_t)pointAddress;
    ovrBoundaryTestResult *outTestResult = (ovrBoundaryTestResult *)(intptr_t)outTestResultAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_TestBoundaryPoint(session, point, singleBoundaryType, outTestResult);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetBoundaryLookAndFeel(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong lookAndFeelAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    const ovrBoundaryLookAndFeel *lookAndFeel = (const ovrBoundaryLookAndFeel *)(intptr_t)lookAndFeelAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SetBoundaryLookAndFeel(session, lookAndFeel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1ResetBoundaryLookAndFeel(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_ResetBoundaryLookAndFeel(session);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint boundaryType, jlong outFloorPointsAddress, jlong outFloorPointsCountAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrVector3f *outFloorPoints = (ovrVector3f *)(intptr_t)outFloorPointsAddress;
    int *outFloorPointsCount = (int *)(intptr_t)outFloorPointsCountAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetBoundaryGeometry(session, boundaryType, outFloorPoints, outFloorPointsCount);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryDimensions(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint boundaryType, jlong outDimensionsAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrVector3f *outDimensions = (ovrVector3f *)(intptr_t)outDimensionsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetBoundaryDimensions(session, boundaryType, outDimensions);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryVisible(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong outIsVisibleAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrBool *outIsVisible = (ovrBool *)(intptr_t)outIsVisibleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetBoundaryVisible(session, outIsVisible);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1RequestBoundaryVisible(JNIEnv *__env, jclass clazz, jlong sessionAddress, jboolean visible) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_RequestBoundaryVisible(session, visible);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jlong out_LengthAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
    int *out_Length = (int *)(intptr_t)out_LengthAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetTextureSwapChainLength(session, chain, out_Length);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jlong out_IndexAddress) {
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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1WaitToBeginFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_WaitToBeginFrame(session, frameIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1BeginFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_BeginFrame(session, frameIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1EndFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jlong viewScaleDescAddress, jlong layerPtrListAddress, jint layerCount) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    const ovrViewScaleDesc *viewScaleDesc = (const ovrViewScaleDesc *)(intptr_t)viewScaleDescAddress;
    const ovrLayerHeader * const *layerPtrList = (const ovrLayerHeader * const *)(intptr_t)layerPtrListAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_EndFrame(session, frameIndex, viewScaleDesc, layerPtrList, layerCount);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SubmitFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jlong viewScaleDescAddress, jlong layerPtrListAddress, jint layerCount) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    const ovrViewScaleDesc *viewScaleDesc = (const ovrViewScaleDesc *)(intptr_t)viewScaleDescAddress;
    const ovrLayerHeader * const *layerPtrList = (const ovrLayerHeader * const *)(intptr_t)layerPtrListAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SubmitFrame(session, frameIndex, viewScaleDesc, layerPtrList, layerCount);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetPerfStats(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong outStatsAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrPerfStats *outStats = (ovrPerfStats *)(intptr_t)outStatsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetPerfStats(session, outStats);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1ResetPerfStats(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_ResetPerfStats(session);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong camerasAddress, jlong inoutCameraCountAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrExternalCamera *cameras = (ovrExternalCamera *)(intptr_t)camerasAddress;
    unsigned int *inoutCameraCount = (unsigned int *)(intptr_t)inoutCameraCountAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetExternalCameras(session, cameras, inoutCameraCount);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetExternalCameraProperties(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong nameAddress, jlong intrinsicsAddress, jlong extrinsicsAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    const ovrCameraIntrinsics *intrinsics = (const ovrCameraIntrinsics *)(intptr_t)intrinsicsAddress;
    const ovrCameraExtrinsics *extrinsics = (const ovrCameraExtrinsics *)(intptr_t)extrinsicsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SetExternalCameraProperties(session, name, intrinsics, extrinsics);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJJI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesCapacity) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
    float *values = (float *)(intptr_t)valuesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetFloatArray(session, propertyName, values, valuesCapacity);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJJI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesSize) {
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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__J_3IIDJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jintArray deviceTypesAddress, jint deviceCount, jdouble absTime, jlong outDevicePosesAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrPoseStatef *outDevicePoses = (ovrPoseStatef *)(intptr_t)outDevicePosesAddress;
    jint __result;
    jint *deviceTypes = (*__env)->GetPrimitiveArrayCritical(__env, deviceTypesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetDevicePoses(session, (ovrTrackedDeviceType *)deviceTypes, deviceCount, absTime, outDevicePoses);
    (*__env)->ReleasePrimitiveArrayCritical(__env, deviceTypesAddress, deviceTypes, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__J_3IIDJ(jlong sessionAddress, jint deviceTypes__length, jint* deviceTypes, jint deviceCount, jdouble absTime, jlong outDevicePosesAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrPoseStatef *outDevicePoses = (ovrPoseStatef *)(intptr_t)outDevicePosesAddress;
    UNUSED_PARAM(deviceTypes__length)
    return (jint)ovr_GetDevicePoses(session, (ovrTrackedDeviceType *)deviceTypes, deviceCount, absTime, outDevicePoses);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint boundaryType, jlong outFloorPointsAddress, jintArray outFloorPointsCountAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrVector3f *outFloorPoints = (ovrVector3f *)(intptr_t)outFloorPointsAddress;
    jint __result;
    jint *outFloorPointsCount = outFloorPointsCountAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, outFloorPointsCountAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetBoundaryGeometry(session, boundaryType, outFloorPoints, (int *)outFloorPointsCount);
    if (outFloorPointsCount != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, outFloorPointsCountAddress, outFloorPointsCount, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJ_3I(jlong sessionAddress, jint boundaryType, jlong outFloorPointsAddress, jint outFloorPointsCount__length, jint* outFloorPointsCount) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrVector3f *outFloorPoints = (ovrVector3f *)(intptr_t)outFloorPointsAddress;
    UNUSED_PARAM(outFloorPointsCount__length)
    return (jint)ovr_GetBoundaryGeometry(session, boundaryType, outFloorPoints, (int *)outFloorPointsCount);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jintArray out_LengthAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
    jint __result;
    jint *out_Length = (*__env)->GetPrimitiveArrayCritical(__env, out_LengthAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetTextureSwapChainLength(session, chain, (int *)out_Length);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_LengthAddress, out_Length, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJ_3I(jlong sessionAddress, jlong chainAddress, jint out_Length__length, jint* out_Length) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
    UNUSED_PARAM(out_Length__length)
    return (jint)ovr_GetTextureSwapChainLength(session, chain, (int *)out_Length);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jintArray out_IndexAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
    jint __result;
    jint *out_Index = (*__env)->GetPrimitiveArrayCritical(__env, out_IndexAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetTextureSwapChainCurrentIndex(session, chain, (int *)out_Index);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_IndexAddress, out_Index, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJ_3I(jlong sessionAddress, jlong chainAddress, jint out_Index__length, jint* out_Index) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
    UNUSED_PARAM(out_Index__length)
    return (jint)ovr_GetTextureSwapChainCurrentIndex(session, chain, (int *)out_Index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong camerasAddress, jintArray inoutCameraCountAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrExternalCamera *cameras = (ovrExternalCamera *)(intptr_t)camerasAddress;
    jint __result;
    jint *inoutCameraCount = (*__env)->GetPrimitiveArrayCritical(__env, inoutCameraCountAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetExternalCameras(session, cameras, (unsigned int *)inoutCameraCount);
    (*__env)->ReleasePrimitiveArrayCritical(__env, inoutCameraCountAddress, inoutCameraCount, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJ_3I(jlong sessionAddress, jlong camerasAddress, jint inoutCameraCount__length, jint* inoutCameraCount) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrExternalCamera *cameras = (ovrExternalCamera *)(intptr_t)camerasAddress;
    UNUSED_PARAM(inoutCameraCount__length)
    return (jint)ovr_GetExternalCameras(session, cameras, (unsigned int *)inoutCameraCount);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJ_3FI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloatArray valuesAddress, jint valuesCapacity) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
    jint __result;
    jfloat *values = (*__env)->GetPrimitiveArrayCritical(__env, valuesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetFloatArray(session, propertyName, (float *)values, valuesCapacity);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valuesAddress, values, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJ_3FI(jlong sessionAddress, jlong propertyNameAddress, jint values__length, jfloat* values, jint valuesCapacity) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
    UNUSED_PARAM(values__length)
    return (jint)ovr_GetFloatArray(session, propertyName, (float *)values, valuesCapacity);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJ_3FI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloatArray valuesAddress, jint valuesSize) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
    jboolean __result;
    jfloat *values = (*__env)->GetPrimitiveArrayCritical(__env, valuesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)ovr_SetFloatArray(session, propertyName, (float *)values, valuesSize);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valuesAddress, values, 0);
    return __result;
}
JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJ_3FI(jlong sessionAddress, jlong propertyNameAddress, jint values__length, jfloat* values, jint valuesSize) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    const char *propertyName = (const char *)(intptr_t)propertyNameAddress;
    UNUSED_PARAM(values__length)
    return (jboolean)ovr_SetFloatArray(session, propertyName, (float *)values, valuesSize);
}

EXTERN_C_EXIT
