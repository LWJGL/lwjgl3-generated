/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4242 4244 4701 4702 4711 4996))
#endif
#define STB_IMAGE_IMPLEMENTATION
#define STB_IMAGE_STATIC
#define STBI_FAILURE_USERMSG
#include "stb_image.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong xAddress, jlong yAddress, jlong compAddress, jint req_comp) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	int *x = (int *)(intptr_t)xAddress;
	int *y = (int *)(intptr_t)yAddress;
	int *comp = (int *)(intptr_t)compAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbi_load(filename, x, y, comp, req_comp);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_1from_1memory(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jlong xAddress, jlong yAddress, jlong compAddress, jint req_comp) {
	const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
	int *x = (int *)(intptr_t)xAddress;
	int *y = (int *)(intptr_t)yAddress;
	int *comp = (int *)(intptr_t)compAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbi_load_from_memory(buffer, len, x, y, comp, req_comp);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_1from_1callbacks(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress, jlong xAddress, jlong yAddress, jlong compAddress, jint req_comp) {
	const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
	void *user = (void *)(intptr_t)userAddress;
	int *x = (int *)(intptr_t)xAddress;
	int *y = (int *)(intptr_t)yAddress;
	int *comp = (int *)(intptr_t)compAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbi_load_from_callbacks(clbk, user, x, y, comp, req_comp);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1loadf(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong xAddress, jlong yAddress, jlong compAddress, jint req_comp) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	int *x = (int *)(intptr_t)xAddress;
	int *y = (int *)(intptr_t)yAddress;
	int *comp = (int *)(intptr_t)compAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbi_loadf(filename, x, y, comp, req_comp);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1loadf_1from_1memory(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jlong xAddress, jlong yAddress, jlong compAddress, jint req_comp) {
	const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
	int *x = (int *)(intptr_t)xAddress;
	int *y = (int *)(intptr_t)yAddress;
	int *comp = (int *)(intptr_t)compAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbi_loadf_from_memory(buffer, len, x, y, comp, req_comp);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1loadf_1from_1callbacks(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress, jlong xAddress, jlong yAddress, jlong compAddress, jint req_comp) {
	const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
	void *user = (void *)(intptr_t)userAddress;
	int *x = (int *)(intptr_t)xAddress;
	int *y = (int *)(intptr_t)yAddress;
	int *comp = (int *)(intptr_t)compAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbi_loadf_from_callbacks(clbk, user, x, y, comp, req_comp);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImage_stbi_1hdr_1to_1ldr_1gamma(JNIEnv *__env, jclass clazz, jfloat gamma) {
	UNUSED_PARAMS(__env, clazz)
	stbi_hdr_to_ldr_gamma(gamma);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImage_stbi_1hdr_1to_1ldr_1scale(JNIEnv *__env, jclass clazz, jfloat scale) {
	UNUSED_PARAMS(__env, clazz)
	stbi_hdr_to_ldr_scale(scale);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImage_stbi_1ldr_1to_1hdr_1gamma(JNIEnv *__env, jclass clazz, jfloat gamma) {
	UNUSED_PARAMS(__env, clazz)
	stbi_ldr_to_hdr_gamma(gamma);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImage_stbi_1ldr_1to_1hdr_1scale(JNIEnv *__env, jclass clazz, jfloat scale) {
	UNUSED_PARAMS(__env, clazz)
	stbi_ldr_to_hdr_scale(scale);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1is_1hdr(JNIEnv *__env, jclass clazz, jlong filenameAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_is_hdr(filename);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1is_1hdr_1from_1memory(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len) {
	const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_is_hdr_from_memory(buffer, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1is_1hdr_1from_1callbacks(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress) {
	const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
	void *user = (void *)(intptr_t)userAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_is_hdr_from_callbacks(clbk, user);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1failure_1reason(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbi_failure_reason();
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1image_1free(JNIEnv *__env, jclass clazz, jlong retval_from_stbi_loadAddress) {
	void *retval_from_stbi_load = (void *)(intptr_t)retval_from_stbi_loadAddress;
	UNUSED_PARAMS(__env, clazz)
	stbi_image_free(retval_from_stbi_load);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1info(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong xAddress, jlong yAddress, jlong compAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	int *x = (int *)(intptr_t)xAddress;
	int *y = (int *)(intptr_t)yAddress;
	int *comp = (int *)(intptr_t)compAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_info(filename, x, y, comp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1info_1from_1memory(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jlong xAddress, jlong yAddress, jlong compAddress) {
	const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
	int *x = (int *)(intptr_t)xAddress;
	int *y = (int *)(intptr_t)yAddress;
	int *comp = (int *)(intptr_t)compAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_info_from_memory(buffer, len, x, y, comp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1info_1from_1callbacks(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress, jlong xAddress, jlong yAddress, jlong compAddress) {
	const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
	void *user = (void *)(intptr_t)userAddress;
	int *x = (int *)(intptr_t)xAddress;
	int *y = (int *)(intptr_t)yAddress;
	int *comp = (int *)(intptr_t)compAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_info_from_callbacks(clbk, user, x, y, comp);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImage_stbi_1set_1unpremultiply_1on_1load(JNIEnv *__env, jclass clazz, jint flag_true_if_should_unpremultiply) {
	UNUSED_PARAMS(__env, clazz)
	stbi_set_unpremultiply_on_load(flag_true_if_should_unpremultiply);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImage_stbi_1convert_1iphone_1png_1to_1rgb(JNIEnv *__env, jclass clazz, jint flag_true_if_should_convert) {
	UNUSED_PARAMS(__env, clazz)
	stbi_convert_iphone_png_to_rgb(flag_true_if_should_convert);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImage_stbi_1set_1flip_1vertically_1on_1load(JNIEnv *__env, jclass clazz, jint flag_true_if_should_flip) {
	UNUSED_PARAMS(__env, clazz)
	stbi_set_flip_vertically_on_load(flag_true_if_should_flip);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1zlib_1decode_1malloc_1guesssize(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jint initial_size, jlong outlenAddress) {
	const char *buffer = (const char *)(intptr_t)bufferAddress;
	int *outlen = (int *)(intptr_t)outlenAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbi_zlib_decode_malloc_guesssize(buffer, len, initial_size, outlen);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1zlib_1decode_1malloc_1guesssize_1headerflag(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jint initial_size, jlong outlenAddress, jint parse_header) {
	const char *buffer = (const char *)(intptr_t)bufferAddress;
	int *outlen = (int *)(intptr_t)outlenAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbi_zlib_decode_malloc_guesssize_headerflag(buffer, len, initial_size, outlen, parse_header);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1zlib_1decode_1malloc(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jlong outlenAddress) {
	const char *buffer = (const char *)(intptr_t)bufferAddress;
	int *outlen = (int *)(intptr_t)outlenAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbi_zlib_decode_malloc(buffer, len, outlen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1zlib_1decode_1buffer(JNIEnv *__env, jclass clazz, jlong obufferAddress, jint olen, jlong ibufferAddress, jint ilen) {
	char *obuffer = (char *)(intptr_t)obufferAddress;
	const char *ibuffer = (const char *)(intptr_t)ibufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_zlib_decode_buffer(obuffer, olen, ibuffer, ilen);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1zlib_1decode_1noheader_1malloc(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jlong outlenAddress) {
	const char *buffer = (const char *)(intptr_t)bufferAddress;
	int *outlen = (int *)(intptr_t)outlenAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbi_zlib_decode_noheader_malloc(buffer, len, outlen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1zlib_1decode_1noheader_1buffer(JNIEnv *__env, jclass clazz, jlong obufferAddress, jint olen, jlong ibufferAddress, jint ilen) {
	char *obuffer = (char *)(intptr_t)obufferAddress;
	const char *ibuffer = (const char *)(intptr_t)ibufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbi_zlib_decode_noheader_buffer(obuffer, olen, ibuffer, ilen);
}

EXTERN_C_EXIT
