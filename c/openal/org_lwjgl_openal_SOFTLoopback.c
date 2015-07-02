/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenAL.h"

typedef ALCdevice * (APIENTRY *alcLoopbackOpenDeviceSOFTPROC) (const ALCchar *);
typedef ALCboolean (APIENTRY *alcIsRenderFormatSupportedSOFTPROC) (ALCdevice *, ALCsizei, ALCenum, ALCenum);
typedef ALCvoid (APIENTRY *alcRenderSamplesSOFTPROC) (ALCdevice *, ALCvoid *, ALCsizei);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_openal_SOFTLoopback_nalcLoopbackOpenDeviceSOFT(JNIEnv *__env, jclass clazz, jlong deviceNameAddress, jlong __functionAddress) {
	const ALCchar *deviceName = (const ALCchar *)(intptr_t)deviceNameAddress;
	alcLoopbackOpenDeviceSOFTPROC alcLoopbackOpenDeviceSOFT = (alcLoopbackOpenDeviceSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)alcLoopbackOpenDeviceSOFT(deviceName);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_SOFTLoopback_nalcIsRenderFormatSupportedSOFT(JNIEnv *__env, jclass clazz, jlong deviceAddress, jint frequency, jint channels, jint type, jlong __functionAddress) {
	ALCdevice *device = (ALCdevice *)(intptr_t)deviceAddress;
	alcIsRenderFormatSupportedSOFTPROC alcIsRenderFormatSupportedSOFT = (alcIsRenderFormatSupportedSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)alcIsRenderFormatSupportedSOFT(device, frequency, channels, type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTLoopback_nalcRenderSamplesSOFT(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong bufferAddress, jint samples, jlong __functionAddress) {
	ALCdevice *device = (ALCdevice *)(intptr_t)deviceAddress;
	ALCvoid *buffer = (ALCvoid *)(intptr_t)bufferAddress;
	alcRenderSamplesSOFTPROC alcRenderSamplesSOFT = (alcRenderSamplesSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alcRenderSamplesSOFT(device, buffer, samples);
}

EXTERN_C_EXIT
