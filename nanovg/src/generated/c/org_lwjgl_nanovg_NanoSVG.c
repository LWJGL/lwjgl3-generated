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
#define NANOSVG_IMPLEMENTATION
#include "nanosvg.h"
#define NANOSVGRAST_IMPLEMENTATION
#include "nanosvgrast.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_NanoSVG_nnsvgParseFromFile(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong unitsAddress, jfloat dpi) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    char const *units = (char const *)(intptr_t)unitsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nsvgParseFromFile(filename, units, dpi);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_NanoSVG_nnsvgParse(JNIEnv *__env, jclass clazz, jlong inputAddress, jlong unitsAddress, jfloat dpi) {
    char *input = (char *)(intptr_t)inputAddress;
    char const *units = (char const *)(intptr_t)unitsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nsvgParse(input, units, dpi);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoSVG_nnsvgDelete(JNIEnv *__env, jclass clazz, jlong imageAddress) {
    NSVGimage *image = (NSVGimage *)(intptr_t)imageAddress;
    UNUSED_PARAMS(__env, clazz)
    nsvgDelete(image);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_NanoSVG_nsvgCreateRasterizer(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nsvgCreateRasterizer();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoSVG_nnsvgRasterize(JNIEnv *__env, jclass clazz, jlong rAddress, jlong imageAddress, jfloat tx, jfloat ty, jfloat scale, jlong dstAddress, jint w, jint h, jint stride) {
    NSVGrasterizer *r = (NSVGrasterizer *)(intptr_t)rAddress;
    NSVGimage *image = (NSVGimage *)(intptr_t)imageAddress;
    unsigned char *dst = (unsigned char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    nsvgRasterize(r, image, tx, ty, scale, dst, w, h, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoSVG_nnsvgDeleteRasterizer(JNIEnv *__env, jclass clazz, jlong rasterizerAddress) {
    NSVGrasterizer *rasterizer = (NSVGrasterizer *)(intptr_t)rasterizerAddress;
    UNUSED_PARAMS(__env, clazz)
    nsvgDeleteRasterizer(rasterizer);
}

EXTERN_C_EXIT
