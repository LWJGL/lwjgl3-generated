/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenAL.h"

typedef ALCdevice * (APIENTRY *alcOpenDevicePROC) (const ALCchar *);
typedef ALCboolean (APIENTRY *alcCloseDevicePROC) (const ALCdevice *);
typedef ALCcontext * (APIENTRY *alcCreateContextPROC) (const ALCdevice *, const ALCint *);
typedef ALCboolean (APIENTRY *alcMakeContextCurrentPROC) (ALCcontext *);
typedef ALCvoid (APIENTRY *alcProcessContextPROC) (ALCcontext *);
typedef ALCvoid (APIENTRY *alcSuspendContextPROC) (ALCcontext *);
typedef ALCvoid (APIENTRY *alcDestroyContextPROC) (ALCcontext *);
typedef ALCcontext * (APIENTRY *alcGetCurrentContextPROC) (void);
typedef ALCdevice * (APIENTRY *alcGetContextsDevicePROC) (ALCcontext *);
typedef ALCboolean (APIENTRY *alcIsExtensionPresentPROC) (const ALCdevice *, const ALCchar *);
typedef void * (APIENTRY *alcGetProcAddressPROC) (const ALCdevice *, const ALchar *);
typedef ALCenum (APIENTRY *alcGetEnumValuePROC) (const ALCdevice *, const ALCchar *);
typedef ALCenum (APIENTRY *alcGetErrorPROC) (ALCdevice *);
typedef const ALCchar * (APIENTRY *alcGetStringPROC) (ALCdevice *, ALCenum);
typedef ALCvoid (APIENTRY *alcGetIntegervPROC) (ALCdevice *, ALCenum, ALCsizei, ALCint *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_openal_ALC10_nalcOpenDevice(JNIEnv *__env, jclass clazz, jlong deviceSpecifierAddress, jlong __functionAddress) {
	const ALCchar *deviceSpecifier = (const ALCchar *)(intptr_t)deviceSpecifierAddress;
	alcOpenDevicePROC alcOpenDevice = (alcOpenDevicePROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)alcOpenDevice(deviceSpecifier);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_ALC10_nalcCloseDevice(JNIEnv *__env, jclass clazz, jlong deviceHandleAddress, jlong __functionAddress) {
	const ALCdevice *deviceHandle = (const ALCdevice *)(intptr_t)deviceHandleAddress;
	alcCloseDevicePROC alcCloseDevice = (alcCloseDevicePROC)(intptr_t)__functionAddress;
	return (jboolean)alcCloseDevice(deviceHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_openal_ALC10_nalcCreateContext(JNIEnv *__env, jclass clazz, jlong deviceHandleAddress, jlong attrListAddress, jlong __functionAddress) {
	const ALCdevice *deviceHandle = (const ALCdevice *)(intptr_t)deviceHandleAddress;
	const ALCint *attrList = (const ALCint *)(intptr_t)attrListAddress;
	alcCreateContextPROC alcCreateContext = (alcCreateContextPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)alcCreateContext(deviceHandle, attrList);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_ALC10_nalcMakeContextCurrent(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
	ALCcontext *context = (ALCcontext *)(intptr_t)contextAddress;
	alcMakeContextCurrentPROC alcMakeContextCurrent = (alcMakeContextCurrentPROC)(intptr_t)__functionAddress;
	return (jboolean)alcMakeContextCurrent(context);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_ALC10_nalcProcessContext(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
	ALCcontext *context = (ALCcontext *)(intptr_t)contextAddress;
	alcProcessContextPROC alcProcessContext = (alcProcessContextPROC)(intptr_t)__functionAddress;
	alcProcessContext(context);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_ALC10_nalcSuspendContext(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
	ALCcontext *context = (ALCcontext *)(intptr_t)contextAddress;
	alcSuspendContextPROC alcSuspendContext = (alcSuspendContextPROC)(intptr_t)__functionAddress;
	alcSuspendContext(context);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_ALC10_nalcDestroyContext(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
	ALCcontext *context = (ALCcontext *)(intptr_t)contextAddress;
	alcDestroyContextPROC alcDestroyContext = (alcDestroyContextPROC)(intptr_t)__functionAddress;
	alcDestroyContext(context);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_openal_ALC10_nalcGetCurrentContext(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	alcGetCurrentContextPROC alcGetCurrentContext = (alcGetCurrentContextPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)alcGetCurrentContext();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_openal_ALC10_nalcGetContextsDevice(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
	ALCcontext *context = (ALCcontext *)(intptr_t)contextAddress;
	alcGetContextsDevicePROC alcGetContextsDevice = (alcGetContextsDevicePROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)alcGetContextsDevice(context);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_ALC10_nalcIsExtensionPresent(JNIEnv *__env, jclass clazz, jlong deviceHandleAddress, jlong extNameAddress, jlong __functionAddress) {
	const ALCdevice *deviceHandle = (const ALCdevice *)(intptr_t)deviceHandleAddress;
	const ALCchar *extName = (const ALCchar *)(intptr_t)extNameAddress;
	alcIsExtensionPresentPROC alcIsExtensionPresent = (alcIsExtensionPresentPROC)(intptr_t)__functionAddress;
	return (jboolean)alcIsExtensionPresent(deviceHandle, extName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_openal_ALC10_nalcGetProcAddress(JNIEnv *__env, jclass clazz, jlong deviceHandleAddress, jlong funcNameAddress, jlong __functionAddress) {
	const ALCdevice *deviceHandle = (const ALCdevice *)(intptr_t)deviceHandleAddress;
	const ALchar *funcName = (const ALchar *)(intptr_t)funcNameAddress;
	alcGetProcAddressPROC alcGetProcAddress = (alcGetProcAddressPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)alcGetProcAddress(deviceHandle, funcName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_openal_ALC10_nalcGetEnumValue(JNIEnv *__env, jclass clazz, jlong deviceHandleAddress, jlong enumNameAddress, jlong __functionAddress) {
	const ALCdevice *deviceHandle = (const ALCdevice *)(intptr_t)deviceHandleAddress;
	const ALCchar *enumName = (const ALCchar *)(intptr_t)enumNameAddress;
	alcGetEnumValuePROC alcGetEnumValue = (alcGetEnumValuePROC)(intptr_t)__functionAddress;
	return (jint)alcGetEnumValue(deviceHandle, enumName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_openal_ALC10_nalcGetError(JNIEnv *__env, jclass clazz, jlong deviceHandleAddress, jlong __functionAddress) {
	ALCdevice *deviceHandle = (ALCdevice *)(intptr_t)deviceHandleAddress;
	alcGetErrorPROC alcGetError = (alcGetErrorPROC)(intptr_t)__functionAddress;
	return (jint)alcGetError(deviceHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_openal_ALC10_nalcGetString(JNIEnv *__env, jclass clazz, jlong deviceHandleAddress, jint token, jlong __functionAddress) {
	ALCdevice *deviceHandle = (ALCdevice *)(intptr_t)deviceHandleAddress;
	alcGetStringPROC alcGetString = (alcGetStringPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)alcGetString(deviceHandle, token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_ALC10_nalcGetIntegerv(JNIEnv *__env, jclass clazz, jlong deviceHandleAddress, jint token, jint size, jlong destAddress, jlong __functionAddress) {
	ALCdevice *deviceHandle = (ALCdevice *)(intptr_t)deviceHandleAddress;
	ALCint *dest = (ALCint *)(intptr_t)destAddress;
	alcGetIntegervPROC alcGetIntegerv = (alcGetIntegervPROC)(intptr_t)__functionAddress;
	alcGetIntegerv(deviceHandle, token, size, dest);
}