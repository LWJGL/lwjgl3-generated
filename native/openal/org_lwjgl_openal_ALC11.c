/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenAL.h"

typedef ALCdevice * (APIENTRY *alcCaptureOpenDevicePROC) (const ALCchar *, ALCuint, ALCenum, ALCsizei);
typedef ALCboolean (APIENTRY *alcCaptureCloseDevicePROC) (ALCdevice *);
typedef ALCvoid (APIENTRY *alcCaptureStartPROC) (ALCdevice *);
typedef ALCvoid (APIENTRY *alcCaptureStopPROC) (ALCdevice *);
typedef ALCvoid (APIENTRY *alcCaptureSamplesPROC) (ALCdevice *, ALCvoid *, ALCsizei);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_openal_ALC11_nalcCaptureOpenDevice(JNIEnv *__env, jclass clazz, jlong devicenameAddress, jint frequency, jint format, jint buffersize, jlong __functionAddress) {
	const ALCchar *devicename = (const ALCchar *)(intptr_t)devicenameAddress;
	alcCaptureOpenDevicePROC alcCaptureOpenDevice = (alcCaptureOpenDevicePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)alcCaptureOpenDevice(devicename, frequency, format, buffersize);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_ALC11_nalcCaptureCloseDevice(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong __functionAddress) {
	ALCdevice *device = (ALCdevice *)(intptr_t)deviceAddress;
	alcCaptureCloseDevicePROC alcCaptureCloseDevice = (alcCaptureCloseDevicePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)alcCaptureCloseDevice(device);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_ALC11_nalcCaptureStart(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong __functionAddress) {
	ALCdevice *device = (ALCdevice *)(intptr_t)deviceAddress;
	alcCaptureStartPROC alcCaptureStart = (alcCaptureStartPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alcCaptureStart(device);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_ALC11_nalcCaptureStop(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong __functionAddress) {
	ALCdevice *device = (ALCdevice *)(intptr_t)deviceAddress;
	alcCaptureStopPROC alcCaptureStop = (alcCaptureStopPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alcCaptureStop(device);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_ALC11_nalcCaptureSamples(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong bufferAddress, jint samples, jlong __functionAddress) {
	ALCdevice *device = (ALCdevice *)(intptr_t)deviceAddress;
	ALCvoid *buffer = (ALCvoid *)(intptr_t)bufferAddress;
	alcCaptureSamplesPROC alcCaptureSamples = (alcCaptureSamplesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alcCaptureSamples(device, buffer, samples);
}

EXTERN_C_EXIT
