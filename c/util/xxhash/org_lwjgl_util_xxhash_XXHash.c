/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4710))
#endif
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4711))
#endif
#define XXH_PRIVATE_API
#include "xxhash.c"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32(JNIEnv *__env, jclass clazz, jlong inputAddress, jlong length, jint seed) {
	const void *input = (const void *)(intptr_t)inputAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XXH32(input, (size_t)length, seed);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64(JNIEnv *__env, jclass clazz, jlong inputAddress, jlong length, jlong seed) {
	const void *input = (const void *)(intptr_t)inputAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)XXH64(input, (size_t)length, seed);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_XXH32_1createState(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)XXH32_createState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1freeState(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
	XXH32_state_t *statePtr = (XXH32_state_t *)(intptr_t)statePtrAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XXH32_freeState(statePtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_XXH64_1createState(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)XXH64_createState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1freeState(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
	XXH64_state_t *statePtr = (XXH64_state_t *)(intptr_t)statePtrAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XXH64_freeState(statePtr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jint seed) {
	XXH32_state_t *statePtr = (XXH32_state_t *)(intptr_t)statePtrAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XXH32_reset(statePtr, seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
	XXH32_state_t *statePtr = (XXH32_state_t *)(intptr_t)statePtrAddress;
	const void *input = (const void *)(intptr_t)inputAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XXH32_update(statePtr, input, (size_t)length);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
	const XXH32_state_t *statePtr = (const XXH32_state_t *)(intptr_t)statePtrAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XXH32_digest(statePtr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong seed) {
	XXH64_state_t *statePtr = (XXH64_state_t *)(intptr_t)statePtrAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XXH64_reset(statePtr, seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
	XXH64_state_t *statePtr = (XXH64_state_t *)(intptr_t)statePtrAddress;
	const void *input = (const void *)(intptr_t)inputAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XXH64_update(statePtr, input, (size_t)length);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
	const XXH64_state_t *statePtr = (const XXH64_state_t *)(intptr_t)statePtrAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)XXH64_digest(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1canonicalFromHash(JNIEnv *__env, jclass clazz, jlong dstAddress, jint hash) {
	XXH32_canonical_t *dst = (XXH32_canonical_t *)(intptr_t)dstAddress;
	UNUSED_PARAMS(__env, clazz)
	XXH32_canonicalFromHash(dst, hash);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1canonicalFromHash(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong hash) {
	XXH64_canonical_t *dst = (XXH64_canonical_t *)(intptr_t)dstAddress;
	UNUSED_PARAMS(__env, clazz)
	XXH64_canonicalFromHash(dst, hash);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1hashFromCanonical(JNIEnv *__env, jclass clazz, jlong srcAddress) {
	const XXH32_canonical_t *src = (const XXH32_canonical_t *)(intptr_t)srcAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XXH32_hashFromCanonical(src);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1hashFromCanonical(JNIEnv *__env, jclass clazz, jlong srcAddress) {
	const XXH64_canonical_t *src = (const XXH64_canonical_t *)(intptr_t)srcAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)XXH64_hashFromCanonical(src);
}

EXTERN_C_EXIT
