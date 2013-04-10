/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenAL.h"

typedef ALvoid (APIENTRY *alListener3iPROC) (ALenum, ALfloat, ALfloat, ALfloat);
typedef ALvoid (APIENTRY *alGetListenerivPROC) (ALenum, ALint *);
typedef ALvoid (APIENTRY *alSource3iPROC) (ALuint, ALenum, ALint, ALint, ALint);
typedef ALvoid (APIENTRY *alListenerivPROC) (ALenum, const ALint *);
typedef ALvoid (APIENTRY *alSourceivPROC) (ALuint, ALenum, const ALint *);
typedef ALvoid (APIENTRY *alBufferfPROC) (ALuint, ALenum, ALfloat);
typedef ALvoid (APIENTRY *alBuffer3fPROC) (ALuint, ALenum, ALfloat, ALfloat, ALfloat);
typedef ALvoid (APIENTRY *alBufferfvPROC) (ALuint, ALenum, const ALfloat *);
typedef ALvoid (APIENTRY *alBufferiPROC) (ALuint, ALenum, ALint);
typedef ALvoid (APIENTRY *alBuffer3iPROC) (ALuint, ALenum, ALint, ALint, ALint);
typedef ALvoid (APIENTRY *alBufferivPROC) (ALuint, ALenum, const ALint *);
typedef ALvoid (APIENTRY *alGetBufferiPROC) (ALuint, ALenum, ALint *);
typedef ALvoid (APIENTRY *alGetBufferivPROC) (ALuint, ALenum, ALint *);
typedef ALvoid (APIENTRY *alGetBufferfPROC) (ALuint, ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGetBufferfvPROC) (ALuint, ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alSpeedOfSoundPROC) (ALfloat);

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalListener3i(JNIEnv *__env, jclass clazz, jint paramName, jfloat value1, jfloat value2, jfloat value3, jlong __functionAddress) {
	alListener3iPROC alListener3i = (alListener3iPROC)(intptr_t)__functionAddress;
	alListener3i(paramName, value1, value2, value3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalGetListeneriv(JNIEnv *__env, jclass clazz, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALint *values = (ALint *)(intptr_t)valuesAddress;
	alGetListenerivPROC alGetListeneriv = (alGetListenerivPROC)(intptr_t)__functionAddress;
	alGetListeneriv(param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalSource3i(JNIEnv *__env, jclass clazz, jint source, jint paramName, jint value1, jint value2, jint value3, jlong __functionAddress) {
	alSource3iPROC alSource3i = (alSource3iPROC)(intptr_t)__functionAddress;
	alSource3i(source, paramName, value1, value2, value3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalListeneriv(JNIEnv *__env, jclass clazz, jint listener, jlong valueAddress, jlong __functionAddress) {
	const ALint *value = (const ALint *)(intptr_t)valueAddress;
	alListenerivPROC alListeneriv = (alListenerivPROC)(intptr_t)__functionAddress;
	alListeneriv(listener, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalSourceiv(JNIEnv *__env, jclass clazz, jint source, jint paramName, jlong valueAddress, jlong __functionAddress) {
	const ALint *value = (const ALint *)(intptr_t)valueAddress;
	alSourceivPROC alSourceiv = (alSourceivPROC)(intptr_t)__functionAddress;
	alSourceiv(source, paramName, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalBufferf(JNIEnv *__env, jclass clazz, jint buffer, jint paramName, jfloat value, jlong __functionAddress) {
	alBufferfPROC alBufferf = (alBufferfPROC)(intptr_t)__functionAddress;
	alBufferf(buffer, paramName, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalBuffer3f(JNIEnv *__env, jclass clazz, jint buffer, jint paramName, jfloat value1, jfloat value2, jfloat value3, jlong __functionAddress) {
	alBuffer3fPROC alBuffer3f = (alBuffer3fPROC)(intptr_t)__functionAddress;
	alBuffer3f(buffer, paramName, value1, value2, value3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalBufferfv(JNIEnv *__env, jclass clazz, jint buffer, jint paramName, jlong valueAddress, jlong __functionAddress) {
	const ALfloat *value = (const ALfloat *)(intptr_t)valueAddress;
	alBufferfvPROC alBufferfv = (alBufferfvPROC)(intptr_t)__functionAddress;
	alBufferfv(buffer, paramName, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalBufferi(JNIEnv *__env, jclass clazz, jint buffer, jint paramName, jint value, jlong __functionAddress) {
	alBufferiPROC alBufferi = (alBufferiPROC)(intptr_t)__functionAddress;
	alBufferi(buffer, paramName, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalBuffer3i(JNIEnv *__env, jclass clazz, jint buffer, jint paramName, jint value1, jint value2, jint value3, jlong __functionAddress) {
	alBuffer3iPROC alBuffer3i = (alBuffer3iPROC)(intptr_t)__functionAddress;
	alBuffer3i(buffer, paramName, value1, value2, value3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalBufferiv(JNIEnv *__env, jclass clazz, jint buffer, jint paramName, jlong valueAddress, jlong __functionAddress) {
	const ALint *value = (const ALint *)(intptr_t)valueAddress;
	alBufferivPROC alBufferiv = (alBufferivPROC)(intptr_t)__functionAddress;
	alBufferiv(buffer, paramName, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalGetBufferi(JNIEnv *__env, jclass clazz, jint buffer, jint param, jlong valueAddress, jlong __functionAddress) {
	ALint *value = (ALint *)(intptr_t)valueAddress;
	alGetBufferiPROC alGetBufferi = (alGetBufferiPROC)(intptr_t)__functionAddress;
	alGetBufferi(buffer, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalGetBufferiv(JNIEnv *__env, jclass clazz, jint buffer, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALint *values = (ALint *)(intptr_t)valuesAddress;
	alGetBufferivPROC alGetBufferiv = (alGetBufferivPROC)(intptr_t)__functionAddress;
	alGetBufferiv(buffer, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalGetBufferf(JNIEnv *__env, jclass clazz, jint buffer, jint param, jlong valueAddress, jlong __functionAddress) {
	ALfloat *value = (ALfloat *)(intptr_t)valueAddress;
	alGetBufferfPROC alGetBufferf = (alGetBufferfPROC)(intptr_t)__functionAddress;
	alGetBufferf(buffer, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalGetBufferfv(JNIEnv *__env, jclass clazz, jint buffer, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALfloat *values = (ALfloat *)(intptr_t)valuesAddress;
	alGetBufferfvPROC alGetBufferfv = (alGetBufferfvPROC)(intptr_t)__functionAddress;
	alGetBufferfv(buffer, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_AL11_nalSpeedOfSound(JNIEnv *__env, jclass clazz, jfloat value, jlong __functionAddress) {
	alSpeedOfSoundPROC alSpeedOfSound = (alSpeedOfSoundPROC)(intptr_t)__functionAddress;
	alSpeedOfSound(value);
}