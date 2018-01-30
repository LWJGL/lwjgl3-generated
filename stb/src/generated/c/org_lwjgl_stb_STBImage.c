/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4701 4702 4738))
#endif
#include "lwjgl_malloc.h"
#define STBI_MALLOC(sz)    org_lwjgl_malloc(sz)
#define STBI_REALLOC(p,sz) org_lwjgl_realloc(p,sz)
#define STBI_FREE(p)       org_lwjgl_free(p)
#define STBI_FAILURE_USERMSG
#define STBI_ASSERT(x)
#define STB_IMAGE_IMPLEMENTATION
#define STB_IMAGE_STATIC
#include "stb_image.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load__JJJJI(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong xAddress, jlong yAddress, jlong channels_in_fileAddress, jint desired_channels) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *channels_in_file = (int *)(intptr_t)channels_in_fileAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbi_load(filename, x, y, channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_1from_1memory__JIJJJI(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jlong xAddress, jlong yAddress, jlong channels_in_fileAddress, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *channels_in_file = (int *)(intptr_t)channels_in_fileAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbi_load_from_memory(buffer, len, x, y, channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_1from_1callbacks__JJJJJI(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress, jlong xAddress, jlong yAddress, jlong channels_in_fileAddress, jint desired_channels) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *channels_in_file = (int *)(intptr_t)channels_in_fileAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbi_load_from_callbacks(clbk, user, x, y, channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_1gif_1from_1memory__JIJJJJJI(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jlong delaysAddress, jlong xAddress, jlong yAddress, jlong zAddress, jlong channels_in_fileAddress, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    int **delays = (int **)(intptr_t)delaysAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *z = (int *)(intptr_t)zAddress;
    int *channels_in_file = (int *)(intptr_t)channels_in_fileAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbi_load_gif_from_memory(buffer, len, delays, x, y, z, channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_116__JJJJI(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong xAddress, jlong yAddress, jlong channels_in_fileAddress, jint desired_channels) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *channels_in_file = (int *)(intptr_t)channels_in_fileAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbi_load_16(filename, x, y, channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_116_1from_1memory__JIJJJI(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jlong xAddress, jlong yAddress, jlong channels_in_fileAddress, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *channels_in_file = (int *)(intptr_t)channels_in_fileAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbi_load_16_from_memory(buffer, len, x, y, channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_116_1from_1callbacks__JJJJJI(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress, jlong xAddress, jlong yAddress, jlong channels_in_fileAddress, jint desired_channels) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *channels_in_file = (int *)(intptr_t)channels_in_fileAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbi_load_16_from_callbacks(clbk, user, x, y, channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1loadf__JJJJI(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong xAddress, jlong yAddress, jlong channels_in_fileAddress, jint desired_channels) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *channels_in_file = (int *)(intptr_t)channels_in_fileAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbi_loadf(filename, x, y, channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1loadf_1from_1memory__JIJJJI(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jlong xAddress, jlong yAddress, jlong channels_in_fileAddress, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *channels_in_file = (int *)(intptr_t)channels_in_fileAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbi_loadf_from_memory(buffer, len, x, y, channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1loadf_1from_1callbacks__JJJJJI(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress, jlong xAddress, jlong yAddress, jlong channels_in_fileAddress, jint desired_channels) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *channels_in_file = (int *)(intptr_t)channels_in_fileAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbi_loadf_from_callbacks(clbk, user, x, y, channels_in_file, desired_channels);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1info__JJJJ(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong xAddress, jlong yAddress, jlong compAddress) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *comp = (int *)(intptr_t)compAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_info(filename, x, y, comp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1info_1from_1memory__JIJJJ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jlong xAddress, jlong yAddress, jlong compAddress) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *comp = (int *)(intptr_t)compAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_info_from_memory(buffer, len, x, y, comp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1info_1from_1callbacks__JJJJJ(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress, jlong xAddress, jlong yAddress, jlong compAddress) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    int *x = (int *)(intptr_t)xAddress;
    int *y = (int *)(intptr_t)yAddress;
    int *comp = (int *)(intptr_t)compAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_info_from_callbacks(clbk, user, x, y, comp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1is_116_1bit(JNIEnv *__env, jclass clazz, jlong filenameAddress) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_is_16_bit(filename);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1is_116_1bit_1from_1memory(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_is_16_bit_from_memory(buffer, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1is_116_1bit_1from_1callbacks(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_is_16_bit_from_callbacks(clbk, user);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1set_1unpremultiply_1on_1load(JNIEnv *__env, jclass clazz, jint flag_true_if_should_unpremultiply) {
    UNUSED_PARAMS(__env, clazz)
    stbi_set_unpremultiply_on_load(flag_true_if_should_unpremultiply);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1convert_1iphone_1png_1to_1rgb(JNIEnv *__env, jclass clazz, jint flag_true_if_should_convert) {
    UNUSED_PARAMS(__env, clazz)
    stbi_convert_iphone_png_to_rgb(flag_true_if_should_convert);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1set_1flip_1vertically_1on_1load(JNIEnv *__env, jclass clazz, jint flag_true_if_should_flip) {
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

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load__J_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong filenameAddress, jintArray xAddress, jintArray yAddress, jintArray channels_in_fileAddress, jint desired_channels) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    jlong __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *channels_in_file = (*__env)->GetPrimitiveArrayCritical(__env, channels_in_fileAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbi_load(filename, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
    (*__env)->ReleasePrimitiveArrayCritical(__env, channels_in_fileAddress, channels_in_file, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1load__J_3I_3I_3II(jlong filenameAddress, jint x__length, jint* x, jint y__length, jint* y, jint channels_in_file__length, jint* channels_in_file, jint desired_channels) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(channels_in_file__length)
    return (jlong)(intptr_t)stbi_load(filename, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_1from_1memory__JI_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jintArray xAddress, jintArray yAddress, jintArray channels_in_fileAddress, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    jlong __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *channels_in_file = (*__env)->GetPrimitiveArrayCritical(__env, channels_in_fileAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbi_load_from_memory(buffer, len, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
    (*__env)->ReleasePrimitiveArrayCritical(__env, channels_in_fileAddress, channels_in_file, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1load_1from_1memory__JI_3I_3I_3II(jlong bufferAddress, jint len, jint x__length, jint* x, jint y__length, jint* y, jint channels_in_file__length, jint* channels_in_file, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(channels_in_file__length)
    return (jlong)(intptr_t)stbi_load_from_memory(buffer, len, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_1from_1callbacks__JJ_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress, jintArray xAddress, jintArray yAddress, jintArray channels_in_fileAddress, jint desired_channels) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    jlong __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *channels_in_file = (*__env)->GetPrimitiveArrayCritical(__env, channels_in_fileAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbi_load_from_callbacks(clbk, user, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
    (*__env)->ReleasePrimitiveArrayCritical(__env, channels_in_fileAddress, channels_in_file, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1load_1from_1callbacks__JJ_3I_3I_3II(jlong clbkAddress, jlong userAddress, jint x__length, jint* x, jint y__length, jint* y, jint channels_in_file__length, jint* channels_in_file, jint desired_channels) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(channels_in_file__length)
    return (jlong)(intptr_t)stbi_load_from_callbacks(clbk, user, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_1gif_1from_1memory__JIJ_3I_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jlong delaysAddress, jintArray xAddress, jintArray yAddress, jintArray zAddress, jintArray channels_in_fileAddress, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    int **delays = (int **)(intptr_t)delaysAddress;
    jlong __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *z = (*__env)->GetPrimitiveArrayCritical(__env, zAddress, 0);
    jint *channels_in_file = (*__env)->GetPrimitiveArrayCritical(__env, channels_in_fileAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbi_load_gif_from_memory(buffer, len, delays, (int *)x, (int *)y, (int *)z, (int *)channels_in_file, desired_channels);
    (*__env)->ReleasePrimitiveArrayCritical(__env, channels_in_fileAddress, channels_in_file, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, zAddress, z, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1load_1gif_1from_1memory__JIJ_3I_3I_3I_3II(jlong bufferAddress, jint len, jlong delaysAddress, jint x__length, jint* x, jint y__length, jint* y, jint z__length, jint* z, jint channels_in_file__length, jint* channels_in_file, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    int **delays = (int **)(intptr_t)delaysAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(z__length)
    UNUSED_PARAM(channels_in_file__length)
    return (jlong)(intptr_t)stbi_load_gif_from_memory(buffer, len, delays, (int *)x, (int *)y, (int *)z, (int *)channels_in_file, desired_channels);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_116__J_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong filenameAddress, jintArray xAddress, jintArray yAddress, jintArray channels_in_fileAddress, jint desired_channels) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    jlong __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *channels_in_file = (*__env)->GetPrimitiveArrayCritical(__env, channels_in_fileAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbi_load_16(filename, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
    (*__env)->ReleasePrimitiveArrayCritical(__env, channels_in_fileAddress, channels_in_file, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1load_116__J_3I_3I_3II(jlong filenameAddress, jint x__length, jint* x, jint y__length, jint* y, jint channels_in_file__length, jint* channels_in_file, jint desired_channels) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(channels_in_file__length)
    return (jlong)(intptr_t)stbi_load_16(filename, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_116_1from_1memory__JI_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jintArray xAddress, jintArray yAddress, jintArray channels_in_fileAddress, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    jlong __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *channels_in_file = (*__env)->GetPrimitiveArrayCritical(__env, channels_in_fileAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbi_load_16_from_memory(buffer, len, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
    (*__env)->ReleasePrimitiveArrayCritical(__env, channels_in_fileAddress, channels_in_file, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1load_116_1from_1memory__JI_3I_3I_3II(jlong bufferAddress, jint len, jint x__length, jint* x, jint y__length, jint* y, jint channels_in_file__length, jint* channels_in_file, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(channels_in_file__length)
    return (jlong)(intptr_t)stbi_load_16_from_memory(buffer, len, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1load_116_1from_1callbacks__JJ_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress, jintArray xAddress, jintArray yAddress, jintArray channels_in_fileAddress, jint desired_channels) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    jlong __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *channels_in_file = (*__env)->GetPrimitiveArrayCritical(__env, channels_in_fileAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbi_load_16_from_callbacks(clbk, user, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
    (*__env)->ReleasePrimitiveArrayCritical(__env, channels_in_fileAddress, channels_in_file, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1load_116_1from_1callbacks__JJ_3I_3I_3II(jlong clbkAddress, jlong userAddress, jint x__length, jint* x, jint y__length, jint* y, jint channels_in_file__length, jint* channels_in_file, jint desired_channels) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(channels_in_file__length)
    return (jlong)(intptr_t)stbi_load_16_from_callbacks(clbk, user, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1loadf__J_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong filenameAddress, jintArray xAddress, jintArray yAddress, jintArray channels_in_fileAddress, jint desired_channels) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    jlong __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *channels_in_file = (*__env)->GetPrimitiveArrayCritical(__env, channels_in_fileAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbi_loadf(filename, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
    (*__env)->ReleasePrimitiveArrayCritical(__env, channels_in_fileAddress, channels_in_file, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1loadf__J_3I_3I_3II(jlong filenameAddress, jint x__length, jint* x, jint y__length, jint* y, jint channels_in_file__length, jint* channels_in_file, jint desired_channels) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(channels_in_file__length)
    return (jlong)(intptr_t)stbi_loadf(filename, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1loadf_1from_1memory__JI_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jintArray xAddress, jintArray yAddress, jintArray channels_in_fileAddress, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    jlong __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *channels_in_file = (*__env)->GetPrimitiveArrayCritical(__env, channels_in_fileAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbi_loadf_from_memory(buffer, len, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
    (*__env)->ReleasePrimitiveArrayCritical(__env, channels_in_fileAddress, channels_in_file, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1loadf_1from_1memory__JI_3I_3I_3II(jlong bufferAddress, jint len, jint x__length, jint* x, jint y__length, jint* y, jint channels_in_file__length, jint* channels_in_file, jint desired_channels) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(channels_in_file__length)
    return (jlong)(intptr_t)stbi_loadf_from_memory(buffer, len, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1loadf_1from_1callbacks__JJ_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress, jintArray xAddress, jintArray yAddress, jintArray channels_in_fileAddress, jint desired_channels) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    jlong __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *channels_in_file = (*__env)->GetPrimitiveArrayCritical(__env, channels_in_fileAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbi_loadf_from_callbacks(clbk, user, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
    (*__env)->ReleasePrimitiveArrayCritical(__env, channels_in_fileAddress, channels_in_file, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1loadf_1from_1callbacks__JJ_3I_3I_3II(jlong clbkAddress, jlong userAddress, jint x__length, jint* x, jint y__length, jint* y, jint channels_in_file__length, jint* channels_in_file, jint desired_channels) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(channels_in_file__length)
    return (jlong)(intptr_t)stbi_loadf_from_callbacks(clbk, user, (int *)x, (int *)y, (int *)channels_in_file, desired_channels);
}
#endif

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1info__J_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong filenameAddress, jintArray xAddress, jintArray yAddress, jintArray compAddress) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    jint __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *comp = (*__env)->GetPrimitiveArrayCritical(__env, compAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbi_info(filename, (int *)x, (int *)y, (int *)comp);
    (*__env)->ReleasePrimitiveArrayCritical(__env, compAddress, comp, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1info__J_3I_3I_3I(jlong filenameAddress, jint x__length, jint* x, jint y__length, jint* y, jint comp__length, jint* comp) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(comp__length)
    return (jint)stbi_info(filename, (int *)x, (int *)y, (int *)comp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1info_1from_1memory__JI_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint len, jintArray xAddress, jintArray yAddress, jintArray compAddress) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    jint __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *comp = (*__env)->GetPrimitiveArrayCritical(__env, compAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbi_info_from_memory(buffer, len, (int *)x, (int *)y, (int *)comp);
    (*__env)->ReleasePrimitiveArrayCritical(__env, compAddress, comp, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1info_1from_1memory__JI_3I_3I_3I(jlong bufferAddress, jint len, jint x__length, jint* x, jint y__length, jint* y, jint comp__length, jint* comp) {
    const stbi_uc *buffer = (const stbi_uc *)(intptr_t)bufferAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(comp__length)
    return (jint)stbi_info_from_memory(buffer, len, (int *)x, (int *)y, (int *)comp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImage_nstbi_1info_1from_1callbacks__JJ_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong clbkAddress, jlong userAddress, jintArray xAddress, jintArray yAddress, jintArray compAddress) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    jint __result;
    jint *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jint *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jint *comp = (*__env)->GetPrimitiveArrayCritical(__env, compAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbi_info_from_callbacks(clbk, user, (int *)x, (int *)y, (int *)comp);
    (*__env)->ReleasePrimitiveArrayCritical(__env, compAddress, comp, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBImage_nstbi_1info_1from_1callbacks__JJ_3I_3I_3I(jlong clbkAddress, jlong userAddress, jint x__length, jint* x, jint y__length, jint* y, jint comp__length, jint* comp) {
    const stbi_io_callbacks *clbk = (const stbi_io_callbacks *)(intptr_t)clbkAddress;
    void *user = (void *)(intptr_t)userAddress;
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(comp__length)
    return (jint)stbi_info_from_callbacks(clbk, user, (int *)x, (int *)y, (int *)comp);
}

EXTERN_C_EXIT
