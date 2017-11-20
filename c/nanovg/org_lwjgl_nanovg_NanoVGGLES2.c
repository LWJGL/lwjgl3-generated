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
#define NANOVG_GLES2_IMPLEMENTATION
#include "nanovg.h"
#include "nanovg_gl.h"
#include "nanovg_gl_utils.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVGGLES2_nnvglCreateImageFromHandleGLES2(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint textureId, jint w, jint h, jint flags) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvglCreateImageFromHandleGLES2(ctx, (GLuint)textureId, w, h, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVGGLES2_nnvglImageHandleGLES2(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint image) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvglImageHandleGLES2(ctx, image);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_NanoVGGLES2_nnvgCreateGLES2(JNIEnv *__env, jclass clazz, jint flags) {
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)nvgCreateGLES2(__env, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVGGLES2_nnvgDeleteGLES2(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgDeleteGLES2(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_NanoVGGLES2_nnvgluCreateFramebufferGLES2(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint w, jint h, jint imageFlags) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nvgluCreateFramebufferGLES2(ctx, w, h, imageFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVGGLES2_nnvgluBindFramebufferGLES2(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fbAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGLUframebuffer *fb = (NVGLUframebuffer *)(intptr_t)fbAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgluBindFramebufferGLES2(ctx, fb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVGGLES2_nnvgluDeleteFramebufferGLES2(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fbAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGLUframebuffer *fb = (NVGLUframebuffer *)(intptr_t)fbAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgluDeleteFramebufferGLES2(ctx, fb);
}

EXTERN_C_EXIT
