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
#define NANOVG_GLES3_IMPLEMENTATION
#include "nanovg.h"
#include "nanovg_gl.h"
#include "nanovg_gl_utils.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvglCreateImageFromHandleGLES3(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint textureId, jint w, jint h, jint flags) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvglCreateImageFromHandleGLES3(ctx, (GLuint)textureId, w, h, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvglImageHandleGLES3(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint image) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvglImageHandleGLES3(ctx, image);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvgCreateGLES3(JNIEnv *__env, jclass clazz, jint flags) {
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)nvgCreateGLES3(__env, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvgDeleteGLES3(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgDeleteGLES3(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvgluCreateFramebufferGLES3(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint w, jint h, jint imageFlags) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nvgluCreateFramebufferGLES3(ctx, w, h, imageFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvgluBindFramebufferGLES3(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fbAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGLUframebuffer *fb = (NVGLUframebuffer *)(intptr_t)fbAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgluBindFramebufferGLES3(ctx, fb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvgluDeleteFramebufferGLES3(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fbAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGLUframebuffer *fb = (NVGLUframebuffer *)(intptr_t)fbAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgluDeleteFramebufferGLES3(ctx, fb);
}

EXTERN_C_EXIT
