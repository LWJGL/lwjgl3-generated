/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4242 4244 4702 4711 4738 4820 4996))
#endif
#define STB_IMAGE_WRITE_IMPLEMENTATION
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

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	const float *data = (const float *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_write_hdr(filename, w, h, comp, data);
}

EXTERN_C_EXIT
