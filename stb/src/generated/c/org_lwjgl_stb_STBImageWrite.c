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
    __pragma(warning(disable : 4701 4702 4738))
#endif
#include "lwjgl_malloc.h"
#define STBIW_MALLOC(sz)    org_lwjgl_malloc(sz)
#define STBIW_REALLOC(p,sz) org_lwjgl_realloc(p,sz)
#define STBIW_FREE(p)       org_lwjgl_free(p)
#define STBIW_ASSERT(x)
#define STB_IMAGE_WRITE_IMPLEMENTATION
#define STB_IMAGE_WRITE_STATIC
#ifdef LWJGL_WINDOWS
    #define STBI_MSC_SECURE_CRT
#endif
#include "stb_image_write.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1png(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress, jint stride_in_bytes) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    const void *data = (const void *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_png(filename, w, h, comp, data, stride_in_bytes);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1png_1compression_1level(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&stbi_write_png_compression_level;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1force_1png_1filter(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&stbi_write_force_png_filter;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1zlib_1compress(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&stbi_zlib_compress;
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

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1jpg__JIIIJI(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress, jint quality) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    const float *data = (const float *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_jpg(filename, w, h, comp, data, quality);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1jpg_1to_1func(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jlong dataAddress, jint quality) {
    stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
    void *context = (void *)(intptr_t)contextAddress;
    const void *data = (const void *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_jpg_to_func(func, context, w, h, comp, data, quality);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1flip_1vertically_1on_1write(JNIEnv *__env, jclass clazz, jint flip_boolean) {
    UNUSED_PARAMS(__env, clazz)
    stbi_flip_vertically_on_write(flip_boolean);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr__JIII_3F(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jfloatArray dataAddress) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    jint __result;
    jfloat *data = (*__env)->GetPrimitiveArrayCritical(__env, dataAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbi_write_hdr(filename, w, h, comp, (const float *)data);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dataAddress, data, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr__JIII_3F(jlong filenameAddress, jint w, jint h, jint comp, jint data__length, jfloat* data) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    UNUSED_PARAM(data__length)
    return (jint)stbi_write_hdr(filename, w, h, comp, (const float *)data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1jpg__JIII_3FI(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jfloatArray dataAddress, jint quality) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    jint __result;
    jfloat *data = (*__env)->GetPrimitiveArrayCritical(__env, dataAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbi_write_jpg(filename, w, h, comp, (const float *)data, quality);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dataAddress, data, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBImageWrite_nstbi_1write_1jpg__JIII_3FI(jlong filenameAddress, jint w, jint h, jint comp, jint data__length, jfloat* data, jint quality) {
    const char *filename = (const char *)(intptr_t)filenameAddress;
    UNUSED_PARAM(data__length)
    return (jint)stbi_write_jpg(filename, w, h, comp, (const float *)data, quality);
}
#endif

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr_1to_1func__JJIII_3F(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jfloatArray dataAddress) {
    stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
    void *context = (void *)(intptr_t)contextAddress;
    jint __result;
    jfloat *data = (*__env)->GetPrimitiveArrayCritical(__env, dataAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbi_write_hdr_to_func(func, context, w, h, comp, (const float *)data);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dataAddress, data, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr_1to_1func__JJIII_3F(jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jint data__length, jfloat* data) {
    stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
    void *context = (void *)(intptr_t)contextAddress;
    UNUSED_PARAM(data__length)
    return (jint)stbi_write_hdr_to_func(func, context, w, h, comp, (const float *)data);
}
#endif

EXTERN_C_EXIT
