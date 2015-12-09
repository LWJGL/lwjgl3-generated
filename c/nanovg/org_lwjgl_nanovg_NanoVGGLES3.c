/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4244 4710 4711))
#endif
#include "common_tools.h"
DISABLE_WARNINGS()
#define NANOVG_GLES3_IMPLEMENTATION
#include "nanovg.h"
#include "nanovg_gl.h"
#include "nanovg_gl_utils.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvglCreateImageFromHandle(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint textureId, jint w, jint h, jint flags) {
	NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)nvglCreateImageFromHandle(ctx, textureId, w, h, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvglImageHandle(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint image) {
	NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)nvglImageHandle(ctx, image);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nvgCreateGLES3(JNIEnv *__env, jclass clazz, jint flags) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)nvgCreateGLES3(__env, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvgDeleteGLES3(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	nvgDeleteGLES3(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvgluBindFramebuffer(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fbAddress) {
	NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
	NVGLUframebuffer *fb = (NVGLUframebuffer *)(intptr_t)fbAddress;
	UNUSED_PARAMS(__env, clazz)
	nvgluBindFramebuffer(ctx, fb);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvgluCreateFramebuffer(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint w, jint h, jint imageFlags) {
	NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)nvgluCreateFramebuffer(ctx, w, h, imageFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVGGLES3_nnvgluDeleteFramebuffer(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fbAddress) {
	NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
	NVGLUframebuffer *fb = (NVGLUframebuffer *)(intptr_t)fbAddress;
	UNUSED_PARAMS(__env, clazz)
	nvgluDeleteFramebuffer(ctx, fb);
}

EXTERN_C_EXIT
