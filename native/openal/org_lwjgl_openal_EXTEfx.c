/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenAL.h"

typedef ALvoid (APIENTRY *alGenEffectsPROC) (ALsizei, ALuint *);
typedef ALvoid (APIENTRY *alDeleteEffectsPROC) (ALsizei, ALuint *);
typedef ALboolean (APIENTRY *alIsEffectPROC) (ALuint);
typedef ALvoid (APIENTRY *alEffectiPROC) (ALuint, ALenum, ALint);
typedef ALvoid (APIENTRY *alEffectivPROC) (ALuint, ALenum, const ALint *);
typedef ALvoid (APIENTRY *alEffectfPROC) (ALuint, ALenum, ALfloat);
typedef ALvoid (APIENTRY *alEffectfvPROC) (ALuint, ALenum, const ALfloat *);
typedef ALvoid (APIENTRY *alGetEffectiPROC) (ALuint, ALenum, ALint *);
typedef ALvoid (APIENTRY *alGetEffectivPROC) (ALuint, ALenum, ALint *);
typedef ALvoid (APIENTRY *alGetEffectfPROC) (ALuint, ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGetEffectfvPROC) (ALuint, ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGenFiltersPROC) (ALsizei, ALuint *);
typedef ALvoid (APIENTRY *alDeleteFiltersPROC) (ALsizei, ALuint *);
typedef ALboolean (APIENTRY *alIsFilterPROC) (ALuint);
typedef ALvoid (APIENTRY *alFilteriPROC) (ALuint, ALenum, ALint);
typedef ALvoid (APIENTRY *alFilterivPROC) (ALuint, ALenum, const ALint *);
typedef ALvoid (APIENTRY *alFilterfPROC) (ALuint, ALenum, ALfloat);
typedef ALvoid (APIENTRY *alFilterfvPROC) (ALuint, ALenum, const ALfloat *);
typedef ALvoid (APIENTRY *alGetFilteriPROC) (ALuint, ALenum, ALint *);
typedef ALvoid (APIENTRY *alGetFilterivPROC) (ALuint, ALenum, ALint *);
typedef ALvoid (APIENTRY *alGetFilterfPROC) (ALuint, ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGetFilterfvPROC) (ALuint, ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGenAuxiliaryEffectSlotsPROC) (ALsizei, ALuint *);
typedef ALvoid (APIENTRY *alDeleteAuxiliaryEffectSlotsPROC) (ALsizei, ALuint *);
typedef ALboolean (APIENTRY *alIsAuxiliaryEffectSlotPROC) (ALuint);
typedef ALvoid (APIENTRY *alAuxiliaryEffectSlotiPROC) (ALuint, ALenum, ALint);
typedef ALvoid (APIENTRY *alAuxiliaryEffectSlotivPROC) (ALuint, ALenum, const ALint *);
typedef ALvoid (APIENTRY *alAuxiliaryEffectSlotfPROC) (ALuint, ALenum, ALfloat);
typedef ALvoid (APIENTRY *alAuxiliaryEffectSlotfvPROC) (ALuint, ALenum, const ALfloat *);
typedef ALvoid (APIENTRY *alGetAuxiliaryEffectSlotiPROC) (ALuint, ALenum, ALint *);
typedef ALvoid (APIENTRY *alGetAuxiliaryEffectSlotivPROC) (ALuint, ALenum, ALint *);
typedef ALvoid (APIENTRY *alGetAuxiliaryEffectSlotfPROC) (ALuint, ALenum, ALfloat *);
typedef ALvoid (APIENTRY *alGetAuxiliaryEffectSlotfvPROC) (ALuint, ALenum, ALfloat *);

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGenEffects(JNIEnv *__env, jclass clazz, jint n, jlong effectsAddress, jlong __functionAddress) {
	ALuint *effects = (ALuint *)(intptr_t)effectsAddress;
	alGenEffectsPROC alGenEffects = (alGenEffectsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGenEffects(n, effects);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalDeleteEffects(JNIEnv *__env, jclass clazz, jint n, jlong effectsAddress, jlong __functionAddress) {
	ALuint *effects = (ALuint *)(intptr_t)effectsAddress;
	alDeleteEffectsPROC alDeleteEffects = (alDeleteEffectsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alDeleteEffects(n, effects);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_EXTEfx_nalIsEffect(JNIEnv *__env, jclass clazz, jint effect, jlong __functionAddress) {
	alIsEffectPROC alIsEffect = (alIsEffectPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)alIsEffect(effect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalEffecti(JNIEnv *__env, jclass clazz, jint effect, jint param, jint value, jlong __functionAddress) {
	alEffectiPROC alEffecti = (alEffectiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alEffecti(effect, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalEffectiv(JNIEnv *__env, jclass clazz, jint effect, jint param, jlong valuesAddress, jlong __functionAddress) {
	const ALint *values = (const ALint *)(intptr_t)valuesAddress;
	alEffectivPROC alEffectiv = (alEffectivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alEffectiv(effect, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalEffectf(JNIEnv *__env, jclass clazz, jint effect, jint param, jfloat value, jlong __functionAddress) {
	alEffectfPROC alEffectf = (alEffectfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alEffectf(effect, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalEffectfv(JNIEnv *__env, jclass clazz, jint effect, jint param, jlong valuesAddress, jlong __functionAddress) {
	const ALfloat *values = (const ALfloat *)(intptr_t)valuesAddress;
	alEffectfvPROC alEffectfv = (alEffectfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alEffectfv(effect, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetEffecti(JNIEnv *__env, jclass clazz, jint effect, jint param, jlong valueAddress, jlong __functionAddress) {
	ALint *value = (ALint *)(intptr_t)valueAddress;
	alGetEffectiPROC alGetEffecti = (alGetEffectiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetEffecti(effect, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetEffectiv(JNIEnv *__env, jclass clazz, jint effect, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALint *values = (ALint *)(intptr_t)valuesAddress;
	alGetEffectivPROC alGetEffectiv = (alGetEffectivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetEffectiv(effect, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetEffectf(JNIEnv *__env, jclass clazz, jint effect, jint param, jlong valueAddress, jlong __functionAddress) {
	ALfloat *value = (ALfloat *)(intptr_t)valueAddress;
	alGetEffectfPROC alGetEffectf = (alGetEffectfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetEffectf(effect, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetEffectfv(JNIEnv *__env, jclass clazz, jint effect, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALfloat *values = (ALfloat *)(intptr_t)valuesAddress;
	alGetEffectfvPROC alGetEffectfv = (alGetEffectfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetEffectfv(effect, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGenFilters(JNIEnv *__env, jclass clazz, jint n, jlong filtersAddress, jlong __functionAddress) {
	ALuint *filters = (ALuint *)(intptr_t)filtersAddress;
	alGenFiltersPROC alGenFilters = (alGenFiltersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGenFilters(n, filters);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalDeleteFilters(JNIEnv *__env, jclass clazz, jint n, jlong filtersAddress, jlong __functionAddress) {
	ALuint *filters = (ALuint *)(intptr_t)filtersAddress;
	alDeleteFiltersPROC alDeleteFilters = (alDeleteFiltersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alDeleteFilters(n, filters);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_EXTEfx_nalIsFilter(JNIEnv *__env, jclass clazz, jint filter, jlong __functionAddress) {
	alIsFilterPROC alIsFilter = (alIsFilterPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)alIsFilter(filter);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalFilteri(JNIEnv *__env, jclass clazz, jint filter, jint param, jint value, jlong __functionAddress) {
	alFilteriPROC alFilteri = (alFilteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alFilteri(filter, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalFilteriv(JNIEnv *__env, jclass clazz, jint filter, jint param, jlong valuesAddress, jlong __functionAddress) {
	const ALint *values = (const ALint *)(intptr_t)valuesAddress;
	alFilterivPROC alFilteriv = (alFilterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alFilteriv(filter, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalFilterf(JNIEnv *__env, jclass clazz, jint filter, jint param, jfloat value, jlong __functionAddress) {
	alFilterfPROC alFilterf = (alFilterfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alFilterf(filter, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalFilterfv(JNIEnv *__env, jclass clazz, jint filter, jint param, jlong valuesAddress, jlong __functionAddress) {
	const ALfloat *values = (const ALfloat *)(intptr_t)valuesAddress;
	alFilterfvPROC alFilterfv = (alFilterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alFilterfv(filter, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetFilteri(JNIEnv *__env, jclass clazz, jint filter, jint param, jlong valueAddress, jlong __functionAddress) {
	ALint *value = (ALint *)(intptr_t)valueAddress;
	alGetFilteriPROC alGetFilteri = (alGetFilteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetFilteri(filter, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetFilteriv(JNIEnv *__env, jclass clazz, jint filter, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALint *values = (ALint *)(intptr_t)valuesAddress;
	alGetFilterivPROC alGetFilteriv = (alGetFilterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetFilteriv(filter, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetFilterf(JNIEnv *__env, jclass clazz, jint filter, jint param, jlong valueAddress, jlong __functionAddress) {
	ALfloat *value = (ALfloat *)(intptr_t)valueAddress;
	alGetFilterfPROC alGetFilterf = (alGetFilterfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetFilterf(filter, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetFilterfv(JNIEnv *__env, jclass clazz, jint filter, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALfloat *values = (ALfloat *)(intptr_t)valuesAddress;
	alGetFilterfvPROC alGetFilterfv = (alGetFilterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetFilterfv(filter, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGenAuxiliaryEffectSlots(JNIEnv *__env, jclass clazz, jint n, jlong effectSlotsAddress, jlong __functionAddress) {
	ALuint *effectSlots = (ALuint *)(intptr_t)effectSlotsAddress;
	alGenAuxiliaryEffectSlotsPROC alGenAuxiliaryEffectSlots = (alGenAuxiliaryEffectSlotsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGenAuxiliaryEffectSlots(n, effectSlots);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalDeleteAuxiliaryEffectSlots(JNIEnv *__env, jclass clazz, jint n, jlong effectSlotsAddress, jlong __functionAddress) {
	ALuint *effectSlots = (ALuint *)(intptr_t)effectSlotsAddress;
	alDeleteAuxiliaryEffectSlotsPROC alDeleteAuxiliaryEffectSlots = (alDeleteAuxiliaryEffectSlotsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alDeleteAuxiliaryEffectSlots(n, effectSlots);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_EXTEfx_nalIsAuxiliaryEffectSlot(JNIEnv *__env, jclass clazz, jint effectSlot, jlong __functionAddress) {
	alIsAuxiliaryEffectSlotPROC alIsAuxiliaryEffectSlot = (alIsAuxiliaryEffectSlotPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)alIsAuxiliaryEffectSlot(effectSlot);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalAuxiliaryEffectSloti(JNIEnv *__env, jclass clazz, jint effectSlot, jint param, jint value, jlong __functionAddress) {
	alAuxiliaryEffectSlotiPROC alAuxiliaryEffectSloti = (alAuxiliaryEffectSlotiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alAuxiliaryEffectSloti(effectSlot, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalAuxiliaryEffectSlotiv(JNIEnv *__env, jclass clazz, jint effectSlot, jint param, jlong valuesAddress, jlong __functionAddress) {
	const ALint *values = (const ALint *)(intptr_t)valuesAddress;
	alAuxiliaryEffectSlotivPROC alAuxiliaryEffectSlotiv = (alAuxiliaryEffectSlotivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alAuxiliaryEffectSlotiv(effectSlot, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalAuxiliaryEffectSlotf(JNIEnv *__env, jclass clazz, jint effectSlot, jint param, jfloat value, jlong __functionAddress) {
	alAuxiliaryEffectSlotfPROC alAuxiliaryEffectSlotf = (alAuxiliaryEffectSlotfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alAuxiliaryEffectSlotf(effectSlot, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalAuxiliaryEffectSlotfv(JNIEnv *__env, jclass clazz, jint effectSlot, jint param, jlong valuesAddress, jlong __functionAddress) {
	const ALfloat *values = (const ALfloat *)(intptr_t)valuesAddress;
	alAuxiliaryEffectSlotfvPROC alAuxiliaryEffectSlotfv = (alAuxiliaryEffectSlotfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alAuxiliaryEffectSlotfv(effectSlot, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetAuxiliaryEffectSloti(JNIEnv *__env, jclass clazz, jint effectSlot, jint param, jlong valueAddress, jlong __functionAddress) {
	ALint *value = (ALint *)(intptr_t)valueAddress;
	alGetAuxiliaryEffectSlotiPROC alGetAuxiliaryEffectSloti = (alGetAuxiliaryEffectSlotiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetAuxiliaryEffectSloti(effectSlot, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetAuxiliaryEffectSlotiv(JNIEnv *__env, jclass clazz, jint effectSlot, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALint *values = (ALint *)(intptr_t)valuesAddress;
	alGetAuxiliaryEffectSlotivPROC alGetAuxiliaryEffectSlotiv = (alGetAuxiliaryEffectSlotivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetAuxiliaryEffectSlotiv(effectSlot, param, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetAuxiliaryEffectSlotf(JNIEnv *__env, jclass clazz, jint effectSlot, jint param, jlong valueAddress, jlong __functionAddress) {
	ALfloat *value = (ALfloat *)(intptr_t)valueAddress;
	alGetAuxiliaryEffectSlotfPROC alGetAuxiliaryEffectSlotf = (alGetAuxiliaryEffectSlotfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetAuxiliaryEffectSlotf(effectSlot, param, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_EXTEfx_nalGetAuxiliaryEffectSlotfv(JNIEnv *__env, jclass clazz, jint effectSlot, jint param, jlong valuesAddress, jlong __functionAddress) {
	ALfloat *values = (ALfloat *)(intptr_t)valuesAddress;
	alGetAuxiliaryEffectSlotfvPROC alGetAuxiliaryEffectSlotfv = (alGetAuxiliaryEffectSlotfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alGetAuxiliaryEffectSlotfv(effectSlot, param, values);
}
