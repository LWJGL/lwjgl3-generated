/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4710))
#endif
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4701 4702 4711 4738))
#endif
#include "lwjgl_malloc.h"
#define STBIW_MALLOC(sz)    lwjgl_malloc(sz)
#define STBIW_REALLOC(p,sz) lwjgl_realloc(p,sz)
#define STBIW_FREE(p)       lwjgl_free(p)
#define STBIW_ASSERT(x)
#define STB_IMAGE_WRITE_IMPLEMENTATION
#define STB_IMAGE_WRITE_STATIC
#include "stb_image_write.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1png(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress, jint stride_in_bytes) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	const void *data = (const void *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_write_png(filename, w, h, comp, data, stride_in_bytes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1bmp(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	const void *data = (const void *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_write_bmp(filename, w, h, comp, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1tga(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	const void *data = (const void *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_write_tga(filename, w, h, comp, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1tga_1with_1rle(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)&stbi_write_tga_with_rle;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr__JIIIJ(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	const float *data = (const float *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_write_hdr(filename, w, h, comp, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1png_1to_1func(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jlong dataAddress, jint stride_in_bytes) {
	stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
	void *context = (void *)(intptr_t)contextAddress;
	const void *data = (const void *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_write_png_to_func(func, context, w, h, comp, data, stride_in_bytes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1bmp_1to_1func(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jlong dataAddress) {
	stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
	void *context = (void *)(intptr_t)contextAddress;
	const void *data = (const void *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_write_bmp_to_func(func, context, w, h, comp, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1tga_1to_1func(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jlong dataAddress) {
	stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
	void *context = (void *)(intptr_t)contextAddress;
	const void *data = (const void *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_write_tga_to_func(func, context, w, h, comp, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr_1to_1func__JJIIIJ(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jlong dataAddress) {
	stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
	void *context = (void *)(intptr_t)contextAddress;
	const float *data = (const float *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_write_hdr_to_func(func, context, w, h, comp, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr__JIII_3F(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jfloatArray dataAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	jint __result;
	jfloat *data = (*__env)->GetPrimitiveArrayCritical(__env, dataAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)stbi_write_hdr(filename, w, h, comp, (float*)data);
	(*__env)->ReleasePrimitiveArrayCritical(__env, dataAddress, data, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr__JIII_3F(jlong filenameAddress, jint w, jint h, jint comp, jint data__length, jfloat* data) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	UNUSED_PARAM(data__length)
	return (jint)stbi_write_hdr(filename, w, h, comp, (float*)data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr_1to_1func__JJIII_3F(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jfloatArray dataAddress) {
	stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
	void *context = (void *)(intptr_t)contextAddress;
	jint __result;
	jfloat *data = (*__env)->GetPrimitiveArrayCritical(__env, dataAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)stbi_write_hdr_to_func(func, context, w, h, comp, (float*)data);
	(*__env)->ReleasePrimitiveArrayCritical(__env, dataAddress, data, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr_1to_1func__JJIII_3F(jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jint data__length, jfloat* data) {
	stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
	void *context = (void *)(intptr_t)contextAddress;
	UNUSED_PARAM(data__length)
	return (jint)stbi_write_hdr_to_func(func, context, w, h, comp, (float*)data);
}

EXTERN_C_EXIT
