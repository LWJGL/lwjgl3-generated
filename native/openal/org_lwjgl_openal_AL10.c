/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenAL.h"

typedef ALenum (APIENTRY *alGetErrorPROC) ();
typedef ALvoid (APIENTRY *alEnablePROC) (ALenum);
typedef ALvoid (APIENTRY *alDisablePROC) (ALenum);
typedef ALboolean (APIENTRY *alIsEnabledPROC) (ALenum);
typedef ALboolean (APIENTRY *alGetBooleanPROC) (ALenum);
typedef ALint (APIENTRY *alGetIntegerPROC) (ALenum);
typedef ALfloat (APIENTRY *alGetFloatPROC) (ALenum);
typedef ALdouble (APIENTRY *alGetDoublePROC) (ALenum);
typedef ALvoid (APIENTRY *alGetBooleanvPROC) (ALenum, ALboolean *);
typedef ALvoid (APIENTRY *alGetIntegervPROC) (ALenum, ALint *);
typedef ALvoid (APIENTRY *alGetFloatvPROC) (ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGetDoublevPROC) (ALenum, ALdouble *);
typedef const ALchar * (APIENTRY *alGetStringPROC) (ALenum);
typedef ALvoid (APIENTRY *alDistanceModelPROC) (ALenum);
typedef ALvoid (APIENTRY *alDopplerFactorPROC) (ALfloat);
typedef ALvoid (APIENTRY *alDopplerVelocityPROC) (ALfloat);
typedef ALvoid (APIENTRY *alListenerfPROC) (ALenum, ALfloat);
typedef ALvoid (APIENTRY *alListeneriPROC) (ALenum, ALint);
typedef ALvoid (APIENTRY *alListener3fPROC) (ALenum, ALfloat, ALfloat, ALfloat);
typedef ALvoid (APIENTRY *alListenerfvPROC) (ALenum, const ALfloat *);
typedef ALvoid (APIENTRY *alGetListenerfPROC) (ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGetListeneriPROC) (ALenum, ALint *);
typedef ALvoid (APIENTRY *alGetListener3fPROC) (ALenum, ALfloat *, ALfloat *, ALfloat *);
typedef ALvoid (APIENTRY *alGetListenerfvPROC) (ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGenSourcesPROC) (ALsizei, ALuint *);
typedef ALvoid (APIENTRY *alDeleteSourcesPROC) (ALsizei, ALuint *);
typedef ALboolean (APIENTRY *alIsSourcePROC) (ALuint);
typedef ALvoid (APIENTRY *alSourcefPROC) (ALuint, ALenum, ALfloat);
typedef ALvoid (APIENTRY *alSource3fPROC) (ALuint, ALenum, ALfloat, ALfloat, ALfloat);
typedef ALvoid (APIENTRY *alSourcefvPROC) (ALuint, ALenum, const ALfloat *);
typedef ALvoid (APIENTRY *alSourceiPROC) (ALuint, ALenum, ALint);
typedef ALvoid (APIENTRY *alGetSourcefPROC) (ALuint, ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGetSource3fPROC) (ALuint, ALenum, ALfloat *, ALfloat *, ALfloat *);
typedef ALvoid (APIENTRY *alGetSourcefvPROC) (ALuint, ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGetSourceiPROC) (ALuint, ALenum, ALint *);
typedef ALvoid (APIENTRY *alSourceQueueBuffersPROC) (ALuint, ALsizei, ALuint *);
typedef ALvoid (APIENTRY *alSourceUnqueueBuffersPROC) (ALuint, ALsizei, ALuint *);
typedef ALvoid (APIENTRY *alSourcePlayPROC) (ALuint);
typedef ALvoid (APIENTRY *alSourcePausePROC) (ALuint);
typedef ALvoid (APIENTRY *alSourceStopPROC) (ALuint);
typedef ALvoid (APIENTRY *alSourceRewindPROC) (ALuint);
typedef ALvoid (APIENTRY *alSourcePlayvPROC) (ALsizei, const ALuint *);
typedef ALvoid (APIENTRY *alSourcePausevPROC) (ALsizei, const ALuint *);
typedef ALvoid (APIENTRY *alSourceStopvPROC) (ALsizei, const ALuint *);
typedef ALvoid (APIENTRY *alSourceRewindvPROC) (ALsizei, const ALuint *);
typedef ALvoid (APIENTRY *alGenBuffersPROC) (ALsizei, ALuint *);
typedef ALvoid (APIENTRY *alDeleteBuffersPROC) (ALsizei, const ALuint *);
typedef ALboolean (APIENTRY *alIsBufferPROC) (ALuint);
typedef ALvoid (APIENTRY *alGetBufferfPROC) (ALuint, ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGetBufferiPROC) (ALuint, ALenum, ALint *);
typedef ALvoid (APIENTRY *alBufferDataPROC) (ALuint, ALenum, const ALvoid *, ALsizei, ALsizei);
typedef ALuint (APIENTRY *alGetEnumValuePROC) (const ALchar *);
typedef void * (APIENTRY *alGetProcAddressPROC) (const ALchar *);
typedef ALCboolean (APIENTRY *alIsExtensionPresentPROC) (const ALchar *);

JNIEXPORT jint JNICALL Java_org_lwjgl_openal_AL10_nalGetError(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	alGetErrorPROC alGetError = (alGetErrorPROC)(intptr_t)__functionAddress;
	return (jint)alGetError();
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalEnable(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	alEnablePROC alEnable = (alEnablePROC)(intptr_t)__functionAddress;
	alEnable(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalDisable(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	alDisablePROC alDisable = (alDisablePROC)(intptr_t)__functionAddress;
	alDisable(target);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_AL10_nalIsEnabled(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	alIsEnabledPROC alIsEnabled = (alIsEnabledPROC)(intptr_t)__functionAddress;
	return (jboolean)alIsEnabled(target);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_AL10_nalGetBoolean(JNIEnv *__env, jclass clazz, jint paramName, jlong __functionAddress) {
	alGetBooleanPROC alGetBoolean = (alGetBooleanPROC)(intptr_t)__functionAddress;
	return (jboolean)alGetBoolean(paramName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_openal_AL10_nalGetInteger(JNIEnv *__env, jclass clazz, jint paramName, jlong __functionAddress) {
	alGetIntegerPROC alGetInteger = (alGetIntegerPROC)(intptr_t)__functionAddress;
	return (jint)alGetInteger(paramName);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_openal_AL10_nalGetFloat(JNIEnv *__env, jclass clazz, jint paramName, jlong __functionAddress) {
	alGetFloatPROC alGetFloat = (alGetFloatPROC)(intptr_t)__functionAddress;
	return (jfloat)alGetFloat(paramName);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_openal_AL10_nalGetDouble(JNIEnv *__env, jclass clazz, jint paramName, jlong __functionAddress) {
	alGetDoublePROC alGetDouble = (alGetDoublePROC)(intptr_t)__functionAddress;
	return (jdouble)alGetDouble(paramName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetBooleanv(JNIEnv *__env, jclass clazz, jint paramName, jlong destAddress, jlong __functionAddress) {
	ALboolean *dest = (ALboolean *)(intptr_t)destAddress;
	alGetBooleanvPROC alGetBooleanv = (alGetBooleanvPROC)(intptr_t)__functionAddress;
	alGetBooleanv(paramName, dest);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetIntegerv(JNIEnv *__env, jclass clazz, jint paramName, jlong destAddress, jlong __functionAddress) {
	ALint *dest = (ALint *)(intptr_t)destAddress;
	alGetIntegervPROC alGetIntegerv = (alGetIntegervPROC)(intptr_t)__functionAddress;
	alGetIntegerv(paramName, dest);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetFloatv(JNIEnv *__env, jclass clazz, jint paramName, jlong destAddress, jlong __functionAddress) {
	ALfloat *dest = (ALfloat *)(intptr_t)destAddress;
	alGetFloatvPROC alGetFloatv = (alGetFloatvPROC)(intptr_t)__functionAddress;
	alGetFloatv(paramName, dest);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetDoublev(JNIEnv *__env, jclass clazz, jint paramName, jlong destAddress, jlong __functionAddress) {
	ALdouble *dest = (ALdouble *)(intptr_t)destAddress;
	alGetDoublevPROC alGetDoublev = (alGetDoublevPROC)(intptr_t)__functionAddress;
	alGetDoublev(paramName, dest);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_openal_AL10_nalGetString(JNIEnv *__env, jclass clazz, jint paramName, jlong __functionAddress) {
	alGetStringPROC alGetString = (alGetStringPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)alGetString(paramName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalDistanceModel(JNIEnv *__env, jclass clazz, jint modelName, jlong __functionAddress) {
	alDistanceModelPROC alDistanceModel = (alDistanceModelPROC)(intptr_t)__functionAddress;
	alDistanceModel(modelName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalDopplerFactor(JNIEnv *__env, jclass clazz, jfloat dopplerFactor, jlong __functionAddress) {
	alDopplerFactorPROC alDopplerFactor = (alDopplerFactorPROC)(intptr_t)__functionAddress;
	alDopplerFactor(dopplerFactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalDopplerVelocity(JNIEnv *__env, jclass clazz, jfloat dopplerVelocity, jlong __functionAddress) {
	alDopplerVelocityPROC alDopplerVelocity = (alDopplerVelocityPROC)(intptr_t)__functionAddress;
	alDopplerVelocity(dopplerVelocity);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalListenerf(JNIEnv *__env, jclass clazz, jint paramName, jfloat value, jlong __functionAddress) {
	alListenerfPROC alListenerf = (alListenerfPROC)(intptr_t)__functionAddress;
	alListenerf(paramName, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalListeneri(JNIEnv *__env, jclass clazz, jint paramName, jint values, jlong __functionAddress) {
	alListeneriPROC alListeneri = (alListeneriPROC)(intptr_t)__functionAddress;
	alListeneri(paramName, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalListener3f(JNIEnv *__env, jclass clazz, jint paramName, jfloat value1, jfloat value2, jfloat value3, jlong __functionAddress) {
	alListener3fPROC alListener3f = (alListener3fPROC)(intptr_t)__functionAddress;
	alListener3f(paramName, value1, value2, value3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalListenerfv(JNIEnv *__env, jclass clazz, jint paramName, jlong valuesAddress, jlong __functionAddress) {
	const ALfloat *values = (const ALfloat *)(intptr_t)valuesAddress;
	alListenerfvPROC alListenerfv = (alListenerfvPROC)(intptr_t)__functionAddress;
	alListenerfv(paramName, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetListenerf(JNIEnv *__env, jclass clazz, jint paramName, jlong valueAddress, jlong __functionAddress) {
	ALfloat *value = (ALfloat *)(intptr_t)valueAddress;
	alGetListenerfPROC alGetListenerf = (alGetListenerfPROC)(intptr_t)__functionAddress;
	alGetListenerf(paramName, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetListeneri(JNIEnv *__env, jclass clazz, jint paramName, jlong valueAddress, jlong __functionAddress) {
	ALint *value = (ALint *)(intptr_t)valueAddress;
	alGetListeneriPROC alGetListeneri = (alGetListeneriPROC)(intptr_t)__functionAddress;
	alGetListeneri(paramName, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetListener3f(JNIEnv *__env, jclass clazz, jint paramName, jlong value1Address, jlong value2Address, jlong value3Address, jlong __functionAddress) {
	ALfloat *value1 = (ALfloat *)(intptr_t)value1Address;
	ALfloat *value2 = (ALfloat *)(intptr_t)value2Address;
	ALfloat *value3 = (ALfloat *)(intptr_t)value3Address;
	alGetListener3fPROC alGetListener3f = (alGetListener3fPROC)(intptr_t)__functionAddress;
	alGetListener3f(paramName, value1, value2, value3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetListenerfv(JNIEnv *__env, jclass clazz, jint paramName, jlong valuesAddress, jlong __functionAddress) {
	ALfloat *values = (ALfloat *)(intptr_t)valuesAddress;
	alGetListenerfvPROC alGetListenerfv = (alGetListenerfvPROC)(intptr_t)__functionAddress;
	alGetListenerfv(paramName, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGenSources(JNIEnv *__env, jclass clazz, jint n, jlong srcNamesAddress, jlong __functionAddress) {
	ALuint *srcNames = (ALuint *)(intptr_t)srcNamesAddress;
	alGenSourcesPROC alGenSources = (alGenSourcesPROC)(intptr_t)__functionAddress;
	alGenSources(n, srcNames);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalDeleteSources(JNIEnv *__env, jclass clazz, jint n, jlong sourcesAddress, jlong __functionAddress) {
	ALuint *sources = (ALuint *)(intptr_t)sourcesAddress;
	alDeleteSourcesPROC alDeleteSources = (alDeleteSourcesPROC)(intptr_t)__functionAddress;
	alDeleteSources(n, sources);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_AL10_nalIsSource(JNIEnv *__env, jclass clazz, jint sourceName, jlong __functionAddress) {
	alIsSourcePROC alIsSource = (alIsSourcePROC)(intptr_t)__functionAddress;
	return (jboolean)alIsSource(sourceName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourcef(JNIEnv *__env, jclass clazz, jint source, jint param, jfloat value, jlong __functionAddress) {
	alSourcefPROC alSourcef = (alSourcefPROC)(intptr_t)__functionAddress;
	alSourcef(source, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSource3f(JNIEnv *__env, jclass clazz, jint source, jint param, jfloat v1, jfloat v2, jfloat v3, jlong __functionAddress) {
	alSource3fPROC alSource3f = (alSource3fPROC)(intptr_t)__functionAddress;
	alSource3f(source, param, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourcefv(JNIEnv *__env, jclass clazz, jint source, jint param, jlong valuesAddress, jlong __functionAddress) {
	const ALfloat *values = (const ALfloat *)(intptr_t)valuesAddress;
	alSourcefvPROC alSourcefv = (alSourcefvPROC)(intptr_t)__functionAddress;
	alSourcefv(source, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourcei(JNIEnv *__env, jclass clazz, jint source, jint param, jint value, jlong __functionAddress) {
	alSourceiPROC alSourcei = (alSourceiPROC)(intptr_t)__functionAddress;
	alSourcei(source, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetSourcef(JNIEnv *__env, jclass clazz, jint source, jint param, jlong valueAddress, jlong __functionAddress) {
	ALfloat *value = (ALfloat *)(intptr_t)valueAddress;
	alGetSourcefPROC alGetSourcef = (alGetSourcefPROC)(intptr_t)__functionAddress;
	alGetSourcef(source, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetSource3f(JNIEnv *__env, jclass clazz, jint source, jint param, jlong v1Address, jlong v2Address, jlong v3Address, jlong __functionAddress) {
	ALfloat *v1 = (ALfloat *)(intptr_t)v1Address;
	ALfloat *v2 = (ALfloat *)(intptr_t)v2Address;
	ALfloat *v3 = (ALfloat *)(intptr_t)v3Address;
	alGetSource3fPROC alGetSource3f = (alGetSource3fPROC)(intptr_t)__functionAddress;
	alGetSource3f(source, param, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetSourcefv(JNIEnv *__env, jclass clazz, jint source, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALfloat *values = (ALfloat *)(intptr_t)valuesAddress;
	alGetSourcefvPROC alGetSourcefv = (alGetSourcefvPROC)(intptr_t)__functionAddress;
	alGetSourcefv(source, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetSourcei(JNIEnv *__env, jclass clazz, jint source, jint param, jlong valueAddress, jlong __functionAddress) {
	ALint *value = (ALint *)(intptr_t)valueAddress;
	alGetSourceiPROC alGetSourcei = (alGetSourceiPROC)(intptr_t)__functionAddress;
	alGetSourcei(source, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourceQueueBuffers(JNIEnv *__env, jclass clazz, jint sourceName, jint numBuffers, jlong bufferNamesAddress, jlong __functionAddress) {
	ALuint *bufferNames = (ALuint *)(intptr_t)bufferNamesAddress;
	alSourceQueueBuffersPROC alSourceQueueBuffers = (alSourceQueueBuffersPROC)(intptr_t)__functionAddress;
	alSourceQueueBuffers(sourceName, numBuffers, bufferNames);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourceUnqueueBuffers(JNIEnv *__env, jclass clazz, jint sourceName, jint numEntries, jlong bufferNamesAddress, jlong __functionAddress) {
	ALuint *bufferNames = (ALuint *)(intptr_t)bufferNamesAddress;
	alSourceUnqueueBuffersPROC alSourceUnqueueBuffers = (alSourceUnqueueBuffersPROC)(intptr_t)__functionAddress;
	alSourceUnqueueBuffers(sourceName, numEntries, bufferNames);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourcePlay(JNIEnv *__env, jclass clazz, jint source, jlong __functionAddress) {
	alSourcePlayPROC alSourcePlay = (alSourcePlayPROC)(intptr_t)__functionAddress;
	alSourcePlay(source);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourcePause(JNIEnv *__env, jclass clazz, jint source, jlong __functionAddress) {
	alSourcePausePROC alSourcePause = (alSourcePausePROC)(intptr_t)__functionAddress;
	alSourcePause(source);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourceStop(JNIEnv *__env, jclass clazz, jint source, jlong __functionAddress) {
	alSourceStopPROC alSourceStop = (alSourceStopPROC)(intptr_t)__functionAddress;
	alSourceStop(source);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourceRewind(JNIEnv *__env, jclass clazz, jint source, jlong __functionAddress) {
	alSourceRewindPROC alSourceRewind = (alSourceRewindPROC)(intptr_t)__functionAddress;
	alSourceRewind(source);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourcePlayv(JNIEnv *__env, jclass clazz, jint n, jlong sourcesAddress, jlong __functionAddress) {
	const ALuint *sources = (const ALuint *)(intptr_t)sourcesAddress;
	alSourcePlayvPROC alSourcePlayv = (alSourcePlayvPROC)(intptr_t)__functionAddress;
	alSourcePlayv(n, sources);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourcePausev(JNIEnv *__env, jclass clazz, jint n, jlong sourcesAddress, jlong __functionAddress) {
	const ALuint *sources = (const ALuint *)(intptr_t)sourcesAddress;
	alSourcePausevPROC alSourcePausev = (alSourcePausevPROC)(intptr_t)__functionAddress;
	alSourcePausev(n, sources);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourceStopv(JNIEnv *__env, jclass clazz, jint n, jlong sourcesAddress, jlong __functionAddress) {
	const ALuint *sources = (const ALuint *)(intptr_t)sourcesAddress;
	alSourceStopvPROC alSourceStopv = (alSourceStopvPROC)(intptr_t)__functionAddress;
	alSourceStopv(n, sources);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalSourceRewindv(JNIEnv *__env, jclass clazz, jint n, jlong sourcesAddress, jlong __functionAddress) {
	const ALuint *sources = (const ALuint *)(intptr_t)sourcesAddress;
	alSourceRewindvPROC alSourceRewindv = (alSourceRewindvPROC)(intptr_t)__functionAddress;
	alSourceRewindv(n, sources);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGenBuffers(JNIEnv *__env, jclass clazz, jint n, jlong bufferNamesAddress, jlong __functionAddress) {
	ALuint *bufferNames = (ALuint *)(intptr_t)bufferNamesAddress;
	alGenBuffersPROC alGenBuffers = (alGenBuffersPROC)(intptr_t)__functionAddress;
	alGenBuffers(n, bufferNames);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalDeleteBuffers(JNIEnv *__env, jclass clazz, jint n, jlong bufferNamesAddress, jlong __functionAddress) {
	const ALuint *bufferNames = (const ALuint *)(intptr_t)bufferNamesAddress;
	alDeleteBuffersPROC alDeleteBuffers = (alDeleteBuffersPROC)(intptr_t)__functionAddress;
	alDeleteBuffers(n, bufferNames);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_AL10_nalIsBuffer(JNIEnv *__env, jclass clazz, jint bufferName, jlong __functionAddress) {
	alIsBufferPROC alIsBuffer = (alIsBufferPROC)(intptr_t)__functionAddress;
	return (jboolean)alIsBuffer(bufferName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetBufferf(JNIEnv *__env, jclass clazz, jint bufferName, jint paramName, jlong valueAddress, jlong __functionAddress) {
	ALfloat *value = (ALfloat *)(intptr_t)valueAddress;
	alGetBufferfPROC alGetBufferf = (alGetBufferfPROC)(intptr_t)__functionAddress;
	alGetBufferf(bufferName, paramName, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalGetBufferi(JNIEnv *__env, jclass clazz, jint bufferName, jint paramName, jlong valueAddress, jlong __functionAddress) {
	ALint *value = (ALint *)(intptr_t)valueAddress;
	alGetBufferiPROC alGetBufferi = (alGetBufferiPROC)(intptr_t)__functionAddress;
	alGetBufferi(bufferName, paramName, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL10_nalBufferData(JNIEnv *__env, jclass clazz, jint bufferName, jint format, jlong dataAddress, jint size, jint frequency, jlong __functionAddress) {
	const ALvoid *data = (const ALvoid *)(intptr_t)dataAddress;
	alBufferDataPROC alBufferData = (alBufferDataPROC)(intptr_t)__functionAddress;
	alBufferData(bufferName, format, data, size, frequency);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_openal_AL10_nalGetEnumValue(JNIEnv *__env, jclass clazz, jlong enumNameAddress, jlong __functionAddress) {
	const ALchar *enumName = (const ALchar *)(intptr_t)enumNameAddress;
	alGetEnumValuePROC alGetEnumValue = (alGetEnumValuePROC)(intptr_t)__functionAddress;
	return (jint)alGetEnumValue(enumName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_openal_AL10_nalGetProcAddress(JNIEnv *__env, jclass clazz, jlong funcNameAddress, jlong __functionAddress) {
	const ALchar *funcName = (const ALchar *)(intptr_t)funcNameAddress;
	alGetProcAddressPROC alGetProcAddress = (alGetProcAddressPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)alGetProcAddress(funcName);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_AL10_nalIsExtensionPresent(JNIEnv *__env, jclass clazz, jlong extNameAddress, jlong __functionAddress) {
	const ALchar *extName = (const ALchar *)(intptr_t)extNameAddress;
	alIsExtensionPresentPROC alIsExtensionPresent = (alIsExtensionPresentPROC)(intptr_t)__functionAddress;
	return (jboolean)alIsExtensionPresent(extName);
}