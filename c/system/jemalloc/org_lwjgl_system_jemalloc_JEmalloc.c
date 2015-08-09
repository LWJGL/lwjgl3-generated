/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "jemalloc.h"
#define APIENTRY
ENABLE_WARNINGS()

typedef void (APIENTRY *je_malloc_message_cb)(void *, const char *);

typedef void * (APIENTRY *je_mallocPROC) (size_t);
typedef void * (APIENTRY *je_callocPROC) (size_t, size_t);
typedef int (APIENTRY *je_posix_memalignPROC) (void **, size_t, size_t);
typedef void * (APIENTRY *je_aligned_allocPROC) (size_t, size_t);
typedef void * (APIENTRY *je_reallocPROC) (void *, size_t);
typedef void (APIENTRY *je_freePROC) (void *);
typedef void * (APIENTRY *je_mallocxPROC) (size_t, int);
typedef void * (APIENTRY *je_rallocxPROC) (void *, size_t, int);
typedef size_t (APIENTRY *je_xallocxPROC) (void *, size_t, size_t, int);
typedef size_t (APIENTRY *je_sallocxPROC) (const void *, int);
typedef void (APIENTRY *je_dallocxPROC) (void *, int);
typedef void (APIENTRY *je_sdallocxPROC) (void *, size_t, int);
typedef void * (APIENTRY *je_nallocxPROC) (size_t, int);
typedef int (APIENTRY *je_mallctlPROC) (const char *, void *, size_t *, void *, size_t);
typedef int (APIENTRY *je_mallctlnametomibPROC) (const char *, size_t *, size_t *);
typedef int (APIENTRY *je_mallctlbymibPROC) (const size_t *, size_t, void *, size_t *, void *, size_t);
typedef void (APIENTRY *je_malloc_stats_printPROC) (je_malloc_message_cb, void *, const char *);
typedef size_t (APIENTRY *je_malloc_usable_sizePROC) (const void *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1malloc(JNIEnv *__env, jclass clazz, jlong size, jlong __functionAddress) {
	je_mallocPROC je_malloc = (je_mallocPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)je_malloc((size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1calloc(JNIEnv *__env, jclass clazz, jlong num, jlong size, jlong __functionAddress) {
	je_callocPROC je_calloc = (je_callocPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)je_calloc((size_t)num, (size_t)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1posix_1memalign(JNIEnv *__env, jclass clazz, jlong memptrAddress, jlong alignment, jlong size, jlong __functionAddress) {
	void **memptr = (void **)(intptr_t)memptrAddress;
	je_posix_memalignPROC je_posix_memalign = (je_posix_memalignPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)je_posix_memalign(memptr, (size_t)alignment, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1aligned_1alloc(JNIEnv *__env, jclass clazz, jlong alignment, jlong size, jlong __functionAddress) {
	je_aligned_allocPROC je_aligned_alloc = (je_aligned_allocPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)je_aligned_alloc((size_t)alignment, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1realloc(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong size, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	je_reallocPROC je_realloc = (je_reallocPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)je_realloc(ptr, (size_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1free(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	je_freePROC je_free = (je_freePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	je_free(ptr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1mallocx(JNIEnv *__env, jclass clazz, jlong size, jint flags, jlong __functionAddress) {
	je_mallocxPROC je_mallocx = (je_mallocxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)je_mallocx((size_t)size, flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1rallocx(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong size, jint flags, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	je_rallocxPROC je_rallocx = (je_rallocxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)je_rallocx(ptr, (size_t)size, flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1xallocx(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong size, jlong extra, jint flags, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	je_xallocxPROC je_xallocx = (je_xallocxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)je_xallocx(ptr, (size_t)size, (size_t)extra, flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1sallocx(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint flags, jlong __functionAddress) {
	const void *ptr = (const void *)(intptr_t)ptrAddress;
	je_sallocxPROC je_sallocx = (je_sallocxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)je_sallocx(ptr, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1dallocx(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint flags, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	je_dallocxPROC je_dallocx = (je_dallocxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	je_dallocx(ptr, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1sdallocx(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong size, jint flags, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	je_sdallocxPROC je_sdallocx = (je_sdallocxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	je_sdallocx(ptr, (size_t)size, flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1nallocx(JNIEnv *__env, jclass clazz, jlong size, jint flags, jlong __functionAddress) {
	je_nallocxPROC je_nallocx = (je_nallocxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)je_nallocx((size_t)size, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1mallctl(JNIEnv *__env, jclass clazz, jlong nameAddress, jlong oldpAddress, jlong oldlenpAddress, jlong newpAddress, jlong newlen, jlong __functionAddress) {
	const char *name = (const char *)(intptr_t)nameAddress;
	void *oldp = (void *)(intptr_t)oldpAddress;
	size_t *oldlenp = (size_t *)(intptr_t)oldlenpAddress;
	void *newp = (void *)(intptr_t)newpAddress;
	je_mallctlPROC je_mallctl = (je_mallctlPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)je_mallctl(name, oldp, oldlenp, newp, (size_t)newlen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1mallctlnametomib(JNIEnv *__env, jclass clazz, jlong nameAddress, jlong mibpAddress, jlong miblenpAddress, jlong __functionAddress) {
	const char *name = (const char *)(intptr_t)nameAddress;
	size_t *mibp = (size_t *)(intptr_t)mibpAddress;
	size_t *miblenp = (size_t *)(intptr_t)miblenpAddress;
	je_mallctlnametomibPROC je_mallctlnametomib = (je_mallctlnametomibPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)je_mallctlnametomib(name, mibp, miblenp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1mallctlbymib(JNIEnv *__env, jclass clazz, jlong mibAddress, jlong miblen, jlong oldpAddress, jlong oldlenpAddress, jlong newpAddress, jlong newlen, jlong __functionAddress) {
	const size_t *mib = (const size_t *)(intptr_t)mibAddress;
	void *oldp = (void *)(intptr_t)oldpAddress;
	size_t *oldlenp = (size_t *)(intptr_t)oldlenpAddress;
	void *newp = (void *)(intptr_t)newpAddress;
	je_mallctlbymibPROC je_mallctlbymib = (je_mallctlbymibPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)je_mallctlbymib(mib, (size_t)miblen, oldp, oldlenp, newp, (size_t)newlen);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1malloc_1stats_1print(JNIEnv *__env, jclass clazz, jlong write_cbAddress, jlong je_cbopaqueAddress, jlong optsAddress, jlong __functionAddress) {
	je_malloc_message_cb write_cb = (je_malloc_message_cb)(intptr_t)write_cbAddress;
	void *je_cbopaque = (void *)(intptr_t)je_cbopaqueAddress;
	const char *opts = (const char *)(intptr_t)optsAddress;
	je_malloc_stats_printPROC je_malloc_stats_print = (je_malloc_stats_printPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	je_malloc_stats_print(write_cb, je_cbopaque, opts);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jemalloc_JEmalloc_nje_1malloc_1usable_1size(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong __functionAddress) {
	const void *ptr = (const void *)(intptr_t)ptrAddress;
	je_malloc_usable_sizePROC je_malloc_usable_size = (je_malloc_usable_sizePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)je_malloc_usable_size(ptr);
}

EXTERN_C_EXIT
