/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
DISABLE_WARNINGS()
#include "OVR_CAPI_0_5_0.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRHmdDesc_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrHmdDesc, Type);
	buffer[1] = (jint)offsetof(ovrHmdDesc, ProductName);
	buffer[2] = (jint)offsetof(ovrHmdDesc, Manufacturer);
	buffer[3] = (jint)offsetof(ovrHmdDesc, VendorId);
	buffer[4] = (jint)offsetof(ovrHmdDesc, ProductId);
	buffer[5] = (jint)offsetof(ovrHmdDesc, SerialNumber);
	buffer[6] = (jint)offsetof(ovrHmdDesc, FirmwareMajor);
	buffer[7] = (jint)offsetof(ovrHmdDesc, FirmwareMinor);
	buffer[8] = (jint)offsetof(ovrHmdDesc, CameraFrustumHFovInRadians);
	buffer[9] = (jint)offsetof(ovrHmdDesc, CameraFrustumVFovInRadians);
	buffer[10] = (jint)offsetof(ovrHmdDesc, CameraFrustumNearZInMeters);
	buffer[11] = (jint)offsetof(ovrHmdDesc, CameraFrustumFarZInMeters);
	buffer[12] = (jint)offsetof(ovrHmdDesc, HmdCaps);
	buffer[13] = (jint)offsetof(ovrHmdDesc, TrackingCaps);
	buffer[14] = (jint)offsetof(ovrHmdDesc, DistortionCaps);
	buffer[15] = (jint)offsetof(ovrHmdDesc, DefaultEyeFov);
	buffer[16] = (jint)offsetof(ovrHmdDesc, MaxEyeFov);
	buffer[17] = (jint)offsetof(ovrHmdDesc, EyeRenderOrder);
	buffer[18] = (jint)offsetof(ovrHmdDesc, Resolution);
	buffer[19] = (jint)offsetof(ovrHmdDesc, WindowsPos);
	buffer[20] = (jint)offsetof(ovrHmdDesc, DisplayDeviceName);
	buffer[21] = (jint)offsetof(ovrHmdDesc, DisplayId);

	return sizeof(ovrHmdDesc);
}

EXTERN_C_EXIT
