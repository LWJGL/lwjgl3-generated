/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "MacOSXLWJGL.h"
#include <OpenGL/OpenGL.h>

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CGL_CGLGetCurrentContext(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)CGLGetCurrentContext();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLSetCurrentContext(JNIEnv *__env, jclass clazz, jlong contextAddress) {
	CGLContextObj context = (CGLContextObj)(intptr_t)contextAddress;
	return (jint)CGLSetCurrentContext(context);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLGetShareGroup(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	return (jlong)(intptr_t)CGLGetShareGroup(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLChoosePixelFormat(JNIEnv *__env, jclass clazz, jlong attribsAddress, jlong pixAddress, jlong npixAddress) {
	const CGLPixelFormatAttribute *attribs = (const CGLPixelFormatAttribute *)(intptr_t)attribsAddress;
	CGLPixelFormatObj *pix = (CGLPixelFormatObj *)(intptr_t)pixAddress;
	GLint *npix = (GLint *)(intptr_t)npixAddress;
	return (jint)CGLChoosePixelFormat(attribs, pix, npix);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLDestroyPixelFormat(JNIEnv *__env, jclass clazz, jlong pixAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	return (jint)CGLDestroyPixelFormat(pix);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLDescribePixelFormat(JNIEnv *__env, jclass clazz, jlong pixAddress, jint pix_num, jint attrib, jlong valueAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	GLint *value = (GLint *)(intptr_t)valueAddress;
	return (jint)CGLDescribePixelFormat(pix, pix_num, attrib, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLReleasePixelFormat(JNIEnv *__env, jclass clazz, jlong pixAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	CGLReleasePixelFormat(pix);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLRetainPixelFormat(JNIEnv *__env, jclass clazz, jlong pixAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	return (jlong)(intptr_t)CGLRetainPixelFormat(pix);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLGetPixelFormatRetainCount(JNIEnv *__env, jclass clazz, jlong pixAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	return (jint)CGLGetPixelFormatRetainCount(pix);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLQueryRendererInfo(JNIEnv *__env, jclass clazz, jint display_mask, jlong rendAddress, jlong nrendAddress) {
	CGLRendererInfoObj *rend = (CGLRendererInfoObj *)(intptr_t)rendAddress;
	GLint *nrend = (GLint *)(intptr_t)nrendAddress;
	return (jint)CGLQueryRendererInfo(display_mask, rend, nrend);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLDestroyRendererInfo(JNIEnv *__env, jclass clazz, jlong rendAddress) {
	CGLRendererInfoObj rend = (CGLRendererInfoObj)(intptr_t)rendAddress;
	return (jint)CGLDestroyRendererInfo(rend);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLDescribeRenderer(JNIEnv *__env, jclass clazz, jlong rendAddress, jint rend_num, jint prop, jlong valueAddress) {
	CGLRendererInfoObj rend = (CGLRendererInfoObj)(intptr_t)rendAddress;
	GLint *value = (GLint *)(intptr_t)valueAddress;
	return (jint)CGLDescribeRenderer(rend, rend_num, prop, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLCreateContext(JNIEnv *__env, jclass clazz, jlong pixAddress, jlong shareAddress, jlong ctxAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	CGLContextObj share = (CGLContextObj)(intptr_t)shareAddress;
	CGLContextObj *ctx = (CGLContextObj *)(intptr_t)ctxAddress;
	return (jint)CGLCreateContext(pix, share, ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLDestroyContext(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	return (jint)CGLDestroyContext(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLCopyContext(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint mask) {
	CGLContextObj src = (CGLContextObj)(intptr_t)srcAddress;
	CGLContextObj dst = (CGLContextObj)(intptr_t)dstAddress;
	return (jint)CGLCopyContext(src, dst, mask);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLRetainContext(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	return (jlong)(intptr_t)CGLRetainContext(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLReleaseContext(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	CGLReleaseContext(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLGetContextRetainCount(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	return (jint)CGLGetContextRetainCount(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLGetPixelFormat(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	return (jlong)(intptr_t)CGLGetPixelFormat(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLClearDrawable(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	return (jint)CGLClearDrawable(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLFlushDrawable(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	return (jint)CGLFlushDrawable(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLEnable(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint pname) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	return (jint)CGLEnable(ctx, pname);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLDisable(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint pname) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	return (jint)CGLDisable(ctx, pname);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLIsEnabled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint pname, jlong enableAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	GLint *enable = (GLint *)(intptr_t)enableAddress;
	return (jint)CGLIsEnabled(ctx, pname, enable);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLSetParameter(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint pname, jlong paramsAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	return (jint)CGLSetParameter(ctx, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLGetParameter(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint pname, jlong paramsAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	return (jint)CGLGetParameter(ctx, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLSetVirtualScreen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint screen) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	return (jint)CGLSetVirtualScreen(ctx, screen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLGetVirtualScreen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong screenAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	GLint *screen = (GLint *)(intptr_t)screenAddress;
	return (jint)CGLGetVirtualScreen(ctx, screen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLUpdateContext(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	return (jint)CGLUpdateContext(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLSetGlobalOption(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	return (jint)CGLSetGlobalOption(pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLGetGlobalOption(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	return (jint)CGLGetGlobalOption(pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLLockContext(JNIEnv *__env, jclass clazz, jlong contextAddress) {
	CGLContextObj context = (CGLContextObj)(intptr_t)contextAddress;
	return (jint)CGLLockContext(context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLUnlockContext(JNIEnv *__env, jclass clazz, jlong contextAddress) {
	CGLContextObj context = (CGLContextObj)(intptr_t)contextAddress;
	return (jint)CGLUnlockContext(context);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLGetVersion(JNIEnv *__env, jclass clazz, jlong majorversAddress, jlong minorversAddress) {
	GLint *majorvers = (GLint *)(intptr_t)majorversAddress;
	GLint *minorvers = (GLint *)(intptr_t)minorversAddress;
	CGLGetVersion(majorvers, minorvers);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CGL_nCGLErrorString(JNIEnv *__env, jclass clazz, jint error) {
	return (jlong)(intptr_t)CGLErrorString(error);
}