/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "jemalloc.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_nJEMALLOC_1VERSION(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)JEMALLOC_VERSION;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_JEMALLOC_1VERSION_1MAJOR(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)JEMALLOC_VERSION_MAJOR;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_JEMALLOC_1VERSION_1MINOR(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)JEMALLOC_VERSION_MINOR;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_JEMALLOC_1VERSION_1BUGFIX(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)JEMALLOC_VERSION_BUGFIX;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_JEMALLOC_1VERSION_1NREV(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)JEMALLOC_VERSION_NREV;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_nJEMALLOC_1VERSION_1GID(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)JEMALLOC_VERSION_GID;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_MALLOCX_1LG_1ALIGN(JNIEnv *__env, jclass clazz, jint la) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)MALLOCX_LG_ALIGN(la);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_MALLOCX_1ALIGN(JNIEnv *__env, jclass clazz, jlong a) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)MALLOCX_ALIGN((size_t)a);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_MALLOCX_1ZERO(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)MALLOCX_ZERO;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_MALLOCX_1TCACHE(JNIEnv *__env, jclass clazz, jint tc) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)MALLOCX_TCACHE(tc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_MALLOCX_1TCACHE_1NONE(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)MALLOCX_TCACHE_NONE;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmacros_MALLOCX_1ARENA(JNIEnv *__env, jclass clazz, jint a) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)MALLOCX_ARENA(a);
}

EXTERN_C_EXIT
