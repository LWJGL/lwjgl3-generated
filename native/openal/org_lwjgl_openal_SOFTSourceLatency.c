/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenAL.h"

typedef ALvoid (APIENTRY *alSourcedSOFTPROC) (ALuint, ALenum, ALdouble);
typedef ALvoid (APIENTRY *alSource3dSOFTPROC) (ALuint, ALenum, ALdouble, ALdouble, ALdouble);
typedef ALvoid (APIENTRY *alSourcedvSOFTPROC) (ALuint, ALenum, const ALdouble *);
typedef ALvoid (APIENTRY *alGetSourcedSOFTPROC) (ALuint, ALenum, ALdouble *);
typedef ALvoid (APIENTRY *alGetSource3dSOFTPROC) (ALuint, ALenum, ALdouble *, ALdouble *, ALdouble *);
typedef ALvoid (APIENTRY *alGetSourcedvSOFTPROC) (ALuint, ALenum, ALdouble *);
typedef ALvoid (APIENTRY *alSourcei64SOFTPROC) (ALuint, ALenum, ALint64SOFT);
typedef ALvoid (APIENTRY *alSource3i64SOFTPROC) (ALuint, ALenum, ALint64SOFT, ALint64SOFT, ALint64SOFT);
typedef ALvoid (APIENTRY *alSourcei64vSOFTPROC) (ALuint, ALenum, const ALint64SOFT *);
typedef ALvoid (APIENTRY *alGetSourcei64SOFTPROC) (ALuint, ALenum, ALint64SOFT *);
typedef ALvoid (APIENTRY *alGetSource3i64SOFTPROC) (ALuint, ALenum, ALint64SOFT *, ALint64SOFT *, ALint64SOFT *);
typedef ALvoid (APIENTRY *alGetSourcei64vSOFTPROC) (ALuint, ALenum, ALint64SOFT *);

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalSourcedSOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jdouble value, jlong __functionAddress) {
	alSourcedSOFTPROC alSourcedSOFT = (alSourcedSOFTPROC)(intptr_t)__functionAddress;
	alSourcedSOFT(source, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalSource3dSOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jdouble value1, jdouble value2, jdouble value3, jlong __functionAddress) {
	alSource3dSOFTPROC alSource3dSOFT = (alSource3dSOFTPROC)(intptr_t)__functionAddress;
	alSource3dSOFT(source, param, value1, value2, value3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalSourcedvSOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jlong valueAddress, jlong __functionAddress) {
	const ALdouble *value = (const ALdouble *)(intptr_t)valueAddress;
	alSourcedvSOFTPROC alSourcedvSOFT = (alSourcedvSOFTPROC)(intptr_t)__functionAddress;
	alSourcedvSOFT(source, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalGetSourcedSOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jlong valueAddress, jlong __functionAddress) {
	ALdouble *value = (ALdouble *)(intptr_t)valueAddress;
	alGetSourcedSOFTPROC alGetSourcedSOFT = (alGetSourcedSOFTPROC)(intptr_t)__functionAddress;
	alGetSourcedSOFT(source, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalGetSource3dSOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jlong value1Address, jlong value2Address, jlong value3Address, jlong __functionAddress) {
	ALdouble *value1 = (ALdouble *)(intptr_t)value1Address;
	ALdouble *value2 = (ALdouble *)(intptr_t)value2Address;
	ALdouble *value3 = (ALdouble *)(intptr_t)value3Address;
	alGetSource3dSOFTPROC alGetSource3dSOFT = (alGetSource3dSOFTPROC)(intptr_t)__functionAddress;
	alGetSource3dSOFT(source, param, value1, value2, value3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalGetSourcedvSOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALdouble *values = (ALdouble *)(intptr_t)valuesAddress;
	alGetSourcedvSOFTPROC alGetSourcedvSOFT = (alGetSourcedvSOFTPROC)(intptr_t)__functionAddress;
	alGetSourcedvSOFT(source, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalSourcei64SOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jlong value, jlong __functionAddress) {
	alSourcei64SOFTPROC alSourcei64SOFT = (alSourcei64SOFTPROC)(intptr_t)__functionAddress;
	alSourcei64SOFT(source, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalSource3i64SOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jlong value1, jlong value2, jlong value3, jlong __functionAddress) {
	alSource3i64SOFTPROC alSource3i64SOFT = (alSource3i64SOFTPROC)(intptr_t)__functionAddress;
	alSource3i64SOFT(source, param, value1, value2, value3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalSourcei64vSOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jlong valuesAddress, jlong __functionAddress) {
	const ALint64SOFT *values = (const ALint64SOFT *)(intptr_t)valuesAddress;
	alSourcei64vSOFTPROC alSourcei64vSOFT = (alSourcei64vSOFTPROC)(intptr_t)__functionAddress;
	alSourcei64vSOFT(source, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalGetSourcei64SOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jlong valueAddress, jlong __functionAddress) {
	ALint64SOFT *value = (ALint64SOFT *)(intptr_t)valueAddress;
	alGetSourcei64SOFTPROC alGetSourcei64SOFT = (alGetSourcei64SOFTPROC)(intptr_t)__functionAddress;
	alGetSourcei64SOFT(source, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalGetSource3i64SOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jlong value1Address, jlong value2Address, jlong value3Address, jlong __functionAddress) {
	ALint64SOFT *value1 = (ALint64SOFT *)(intptr_t)value1Address;
	ALint64SOFT *value2 = (ALint64SOFT *)(intptr_t)value2Address;
	ALint64SOFT *value3 = (ALint64SOFT *)(intptr_t)value3Address;
	alGetSource3i64SOFTPROC alGetSource3i64SOFT = (alGetSource3i64SOFTPROC)(intptr_t)__functionAddress;
	alGetSource3i64SOFT(source, param, value1, value2, value3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTSourceLatency_nalGetSourcei64vSOFT(JNIEnv *__env, jclass clazz, jint source, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALint64SOFT *values = (ALint64SOFT *)(intptr_t)valuesAddress;
	alGetSourcei64vSOFTPROC alGetSourcei64vSOFT = (alGetSourcei64vSOFTPROC)(intptr_t)__functionAddress;
	alGetSourcei64vSOFT(source, param, values);
}