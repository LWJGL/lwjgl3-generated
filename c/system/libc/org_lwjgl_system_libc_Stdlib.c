/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stdlib.h>
#ifdef LWJGL_WINDOWS
	#define aligned_alloc(alignment, size) _aligned_malloc(size, alignment)
	#define aligned_free _aligned_free
#else
	#ifndef __USE_ISOC11
	inline void* aligned_alloc(size_t alignment, size_t size) {
		void *p;
		if ( !posix_memalign(&p, alignment, size) )
			return p;
		return NULL;
	}
	#endif
	#define aligned_free free
#endif

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_Stdlib_nmalloc(JNIEnv *__env, jclass clazz, jlong size) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)malloc((size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_Stdlib_ncalloc(JNIEnv *__env, jclass clazz, jlong nmemb, jlong size) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)calloc((size_t)nmemb, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_Stdlib_nrealloc(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong size) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)realloc(ptr, (size_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_nfree__J(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	UNUSED_PARAMS(__env, clazz)
	free(ptr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_Stdlib_naligned_1alloc(JNIEnv *__env, jclass clazz, jlong alignment, jlong size) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)aligned_alloc((size_t)alignment, (size_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_naligned_1free__J(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	UNUSED_PARAMS(__env, clazz)
	aligned_free(ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_nfree___3S(JNIEnv *__env, jclass clazz, jshortArray ptrAddress) {
	jshort *ptr = ptrAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ptrAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	free((void*)ptr);
	if ( ptr != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, ptrAddress, ptr, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_Stdlib_nfree___3S(jint ptr__length, jshort* ptr) {
	UNUSED_PARAM(ptr__length)
	free((void*)ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_nfree___3I(JNIEnv *__env, jclass clazz, jintArray ptrAddress) {
	jint *ptr = ptrAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ptrAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	free((void*)ptr);
	if ( ptr != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, ptrAddress, ptr, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_Stdlib_nfree___3I(jint ptr__length, jint* ptr) {
	UNUSED_PARAM(ptr__length)
	free((void*)ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_nfree___3J(JNIEnv *__env, jclass clazz, jlongArray ptrAddress) {
	jlong *ptr = ptrAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ptrAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	free((void*)ptr);
	if ( ptr != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, ptrAddress, ptr, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_Stdlib_nfree___3J(jint ptr__length, jlong* ptr) {
	UNUSED_PARAM(ptr__length)
	free((void*)ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_nfree___3F(JNIEnv *__env, jclass clazz, jfloatArray ptrAddress) {
	jfloat *ptr = ptrAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ptrAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	free((void*)ptr);
	if ( ptr != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, ptrAddress, ptr, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_Stdlib_nfree___3F(jint ptr__length, jfloat* ptr) {
	UNUSED_PARAM(ptr__length)
	free((void*)ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_nfree___3D(JNIEnv *__env, jclass clazz, jdoubleArray ptrAddress) {
	jdouble *ptr = ptrAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ptrAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	free((void*)ptr);
	if ( ptr != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, ptrAddress, ptr, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_Stdlib_nfree___3D(jint ptr__length, jdouble* ptr) {
	UNUSED_PARAM(ptr__length)
	free((void*)ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_naligned_1free___3S(JNIEnv *__env, jclass clazz, jshortArray ptrAddress) {
	jshort *ptr = ptrAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ptrAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	aligned_free((void*)ptr);
	if ( ptr != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, ptrAddress, ptr, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_Stdlib_naligned_1free___3S(jint ptr__length, jshort* ptr) {
	UNUSED_PARAM(ptr__length)
	aligned_free((void*)ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_naligned_1free___3I(JNIEnv *__env, jclass clazz, jintArray ptrAddress) {
	jint *ptr = ptrAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ptrAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	aligned_free((void*)ptr);
	if ( ptr != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, ptrAddress, ptr, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_Stdlib_naligned_1free___3I(jint ptr__length, jint* ptr) {
	UNUSED_PARAM(ptr__length)
	aligned_free((void*)ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_naligned_1free___3J(JNIEnv *__env, jclass clazz, jlongArray ptrAddress) {
	jlong *ptr = ptrAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ptrAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	aligned_free((void*)ptr);
	if ( ptr != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, ptrAddress, ptr, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_Stdlib_naligned_1free___3J(jint ptr__length, jlong* ptr) {
	UNUSED_PARAM(ptr__length)
	aligned_free((void*)ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_naligned_1free___3F(JNIEnv *__env, jclass clazz, jfloatArray ptrAddress) {
	jfloat *ptr = ptrAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ptrAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	aligned_free((void*)ptr);
	if ( ptr != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, ptrAddress, ptr, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_Stdlib_naligned_1free___3F(jint ptr__length, jfloat* ptr) {
	UNUSED_PARAM(ptr__length)
	aligned_free((void*)ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_Stdlib_naligned_1free___3D(JNIEnv *__env, jclass clazz, jdoubleArray ptrAddress) {
	jdouble *ptr = ptrAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ptrAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	aligned_free((void*)ptr);
	if ( ptr != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, ptrAddress, ptr, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_Stdlib_naligned_1free___3D(jint ptr__length, jdouble* ptr) {
	UNUSED_PARAM(ptr__length)
	aligned_free((void*)ptr);
}

EXTERN_C_EXIT
