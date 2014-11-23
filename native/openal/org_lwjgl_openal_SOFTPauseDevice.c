/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenAL.h"

typedef ALCvoid (APIENTRY *alcDevicePauseSOFTPROC) (ALCdevice *);
typedef ALCvoid (APIENTRY *alcDeviceResumeSOFTPROC) (ALCdevice *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTPauseDevice_nalcDevicePauseSOFT(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong __functionAddress) {
	ALCdevice *device = (ALCdevice *)(intptr_t)deviceAddress;
	alcDevicePauseSOFTPROC alcDevicePauseSOFT = (alcDevicePauseSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alcDevicePauseSOFT(device);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTPauseDevice_nalcDeviceResumeSOFT(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong __functionAddress) {
	ALCdevice *device = (ALCdevice *)(intptr_t)deviceAddress;
	alcDeviceResumeSOFTPROC alcDeviceResumeSOFT = (alcDeviceResumeSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alcDeviceResumeSOFT(device);
}

EXTERN_C_EXIT
