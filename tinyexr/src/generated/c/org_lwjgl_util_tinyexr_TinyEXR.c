/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "tinyexr.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nInitEXRHeader(JNIEnv *__env, jclass clazz, jlong exr_headerAddress) {
    EXRHeader *exr_header = (EXRHeader *)(intptr_t)exr_headerAddress;
    UNUSED_PARAMS(__env, clazz)
    InitEXRHeader(exr_header);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nInitEXRImage(JNIEnv *__env, jclass clazz, jlong exr_imageAddress) {
    EXRImage *exr_image = (EXRImage *)(intptr_t)exr_imageAddress;
    UNUSED_PARAMS(__env, clazz)
    InitEXRImage(exr_image);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRHeader(JNIEnv *__env, jclass clazz, jlong exr_headerAddress) {
    EXRHeader *exr_header = (EXRHeader *)(intptr_t)exr_headerAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)FreeEXRHeader(exr_header);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRImage(JNIEnv *__env, jclass clazz, jlong exr_imageAddress) {
    EXRImage *exr_image = (EXRImage *)(intptr_t)exr_imageAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)FreeEXRImage(exr_image);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRVersionFromFile(JNIEnv *__env, jclass clazz, jlong versionAddress, jlong filenameAddress) {
    EXRVersion *version = (EXRVersion *)(intptr_t)versionAddress;
    const char *filename = (const char *)(intptr_t)filenameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRVersionFromFile(version, filename);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRVersionFromMemory(JNIEnv *__env, jclass clazz, jlong versionAddress, jlong memoryAddress, jlong size) {
    EXRVersion *version = (EXRVersion *)(intptr_t)versionAddress;
    const unsigned char *memory = (const unsigned char *)(intptr_t)memoryAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRVersionFromMemory(version, memory, (size_t)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRHeaderFromFile(JNIEnv *__env, jclass clazz, jlong headerAddress, jlong versionAddress, jlong filenameAddress, jlong errAddress) {
    EXRHeader *header = (EXRHeader *)(intptr_t)headerAddress;
    const EXRVersion *version = (const EXRVersion *)(intptr_t)versionAddress;
    const char *filename = (const char *)(intptr_t)filenameAddress;
    const char **err = (const char **)(intptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRHeaderFromFile(header, version, filename, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRHeaderFromMemory(JNIEnv *__env, jclass clazz, jlong headerAddress, jlong versionAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRHeader *header = (EXRHeader *)(intptr_t)headerAddress;
    const EXRVersion *version = (const EXRVersion *)(intptr_t)versionAddress;
    const unsigned char *memory = (const unsigned char *)(intptr_t)memoryAddress;
    const char **err = (const char **)(intptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRHeaderFromMemory(header, version, memory, (size_t)size, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRMultipartHeaderFromFile__JJJJJ(JNIEnv *__env, jclass clazz, jlong headersAddress, jlong num_headersAddress, jlong versionAddress, jlong filenameAddress, jlong errAddress) {
    EXRHeader ***headers = (EXRHeader ***)(intptr_t)headersAddress;
    int *num_headers = (int *)(intptr_t)num_headersAddress;
    const EXRVersion *version = (const EXRVersion *)(intptr_t)versionAddress;
    const char *filename = (const char *)(intptr_t)filenameAddress;
    const char **err = (const char **)(intptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRMultipartHeaderFromFile(headers, num_headers, version, filename, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRMultipartHeaderFromMemory__JJJJJJ(JNIEnv *__env, jclass clazz, jlong headersAddress, jlong num_headersAddress, jlong versionAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRHeader ***headers = (EXRHeader ***)(intptr_t)headersAddress;
    int *num_headers = (int *)(intptr_t)num_headersAddress;
    const EXRVersion *version = (const EXRVersion *)(intptr_t)versionAddress;
    const unsigned char *memory = (const unsigned char *)(intptr_t)memoryAddress;
    const char **err = (const char **)(intptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRMultipartHeaderFromMemory(headers, num_headers, version, memory, (size_t)size, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRImageFromFile(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong headerAddress, jlong filenameAddress, jlong errAddress) {
    EXRImage *image = (EXRImage *)(intptr_t)imageAddress;
    const EXRHeader *header = (const EXRHeader *)(intptr_t)headerAddress;
    const char *filename = (const char *)(intptr_t)filenameAddress;
    const char **err = (const char **)(intptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LoadEXRImageFromFile(image, header, filename, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRImageFromMemory(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong headerAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRImage *image = (EXRImage *)(intptr_t)imageAddress;
    const EXRHeader *header = (const EXRHeader *)(intptr_t)headerAddress;
    const unsigned char *memory = (const unsigned char *)(intptr_t)memoryAddress;
    const char **err = (const char **)(intptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LoadEXRImageFromMemory(image, header, memory, (size_t)size, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRMultipartImageFromFile(JNIEnv *__env, jclass clazz, jlong imagesAddress, jlong headersAddress, jint num_parts, jlong filenameAddress, jlong errAddress) {
    EXRImage *images = (EXRImage *)(intptr_t)imagesAddress;
    const EXRHeader **headers = (const EXRHeader **)(intptr_t)headersAddress;
    const char *filename = (const char *)(intptr_t)filenameAddress;
    const char **err = (const char **)(intptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LoadEXRMultipartImageFromFile(images, headers, (unsigned int)num_parts, filename, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRMultipartImageFromMemory(JNIEnv *__env, jclass clazz, jlong imagesAddress, jlong headersAddress, jint num_parts, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRImage *images = (EXRImage *)(intptr_t)imagesAddress;
    const EXRHeader **headers = (const EXRHeader **)(intptr_t)headersAddress;
    const unsigned char *memory = (const unsigned char *)(intptr_t)memoryAddress;
    const char **err = (const char **)(intptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LoadEXRMultipartImageFromMemory(images, headers, (unsigned int)num_parts, memory, (size_t)size, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRImageToFile(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong exr_headerAddress, jlong filenameAddress, jlong errAddress) {
    const EXRImage *image = (const EXRImage *)(intptr_t)imageAddress;
    const EXRHeader *exr_header = (const EXRHeader *)(intptr_t)exr_headerAddress;
    const char *filename = (const char *)(intptr_t)filenameAddress;
    const char **err = (const char **)(intptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)SaveEXRImageToFile(image, exr_header, filename, err);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRImageToMemory(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong exr_headerAddress, jlong memoryAddress, jlong errAddress) {
    const EXRImage *image = (const EXRImage *)(intptr_t)imageAddress;
    const EXRHeader *exr_header = (const EXRHeader *)(intptr_t)exr_headerAddress;
    unsigned char **memory = (unsigned char **)(intptr_t)memoryAddress;
    const char **err = (const char **)(intptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)SaveEXRImageToMemory(image, exr_header, memory, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadDeepEXR(JNIEnv *__env, jclass clazz, jlong out_imageAddress, jlong filenameAddress, jlong errAddress) {
    DeepImage *out_image = (DeepImage *)(intptr_t)out_imageAddress;
    const char *filename = (const char *)(intptr_t)filenameAddress;
    const char **err = (const char **)(intptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LoadDeepEXR(out_image, filename, err);
}

EXTERN_C_EXIT
