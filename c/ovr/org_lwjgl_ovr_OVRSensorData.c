/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
DISABLE_WARNINGS()
#include "OVR_CAPI.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRSensorData_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrSensorData, Accelerometer);
	buffer[1] = (jint)offsetof(ovrSensorData, Gyro);
	buffer[2] = (jint)offsetof(ovrSensorData, Magnetometer);
	buffer[3] = (jint)offsetof(ovrSensorData, Temperature);
	buffer[4] = (jint)offsetof(ovrSensorData, TimeInSeconds);

	return sizeof(ovrSensorData);
}

EXTERN_C_EXIT
