/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenAL.h"

typedef ALvoid (APIENTRY *alBufferSamplesSOFTPROC) (ALuint, ALuint, ALenum, ALsizei, ALenum, ALenum, const ALCvoid *);
typedef ALCboolean (APIENTRY *alIsBufferFormatSupportedSOFTPROC) (ALCenum);
typedef ALCvoid (APIENTRY *alBufferSubSamplesSOFTPROC) (ALuint, ALCsizei, ALCsizei, ALenum, ALenum, const ALCvoid *);
typedef ALCvoid (APIENTRY *alGetBufferSamplesSOFTPROC) (ALuint, ALCsizei, ALCsizei, ALenum, ALenum, ALCvoid *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTBufferSamples_nalBufferSamplesSOFT(JNIEnv *__env, jclass clazz, jint buffer, jint samplerate, jint internalformat, jint samples, jint channels, jint type, jlong dataAddress, jlong __functionAddress) {
	const ALCvoid *data = (const ALCvoid *)(intptr_t)dataAddress;
	alBufferSamplesSOFTPROC alBufferSamplesSOFT = (alBufferSamplesSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, data);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_SOFTBufferSamples_nalIsBufferFormatSupportedSOFT(JNIEnv *__env, jclass clazz, jint format, jlong __functionAddress) {
	alIsBufferFormatSupportedSOFTPROC alIsBufferFormatSupportedSOFT = (alIsBufferFormatSupportedSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)alIsBufferFormatSupportedSOFT(format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTBufferSamples_nalBufferSubSamplesSOFT(JNIEnv *__env, jclass clazz, jint buffer, jint offset, jint samples, jint channels, jint type, jlong dataAddress, jlong __functionAddress) {
	const ALCvoid *data = (const ALCvoid *)(intptr_t)dataAddress;
	alBufferSubSamplesSOFTPROC alBufferSubSamplesSOFT = (alBufferSubSamplesSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alBufferSubSamplesSOFT(buffer, offset, samples, channels, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTBufferSamples_nalGetBufferSamplesSOFT(JNIEnv *__env, jclass clazz, jint buffer, jint offset, jint samples, jint channels, jint type, jlong dataAddress, jlong __functionAddress) {
	ALCvoid *data = (ALCvoid *)(intptr_t)dataAddress;
	alGetBufferSamplesSOFTPROC alGetBufferSamplesSOFT = (alGetBufferSamplesSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetBufferSamplesSOFT(buffer, offset, samples, channels, type, data);
}

EXTERN_C_EXIT
