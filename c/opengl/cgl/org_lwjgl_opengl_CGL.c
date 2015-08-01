/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "MacOSXLWJGL.h"
#include <OpenGL/OpenGL.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_CGL_CGLGetCurrentContext(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)CGLGetCurrentContext();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLSetCurrentContext(JNIEnv *__env, jclass clazz, jlong contextAddress) {
	CGLContextObj context = (CGLContextObj)(intptr_t)contextAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLSetCurrentContext(context);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_CGL_nCGLGetShareGroup(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)CGLGetShareGroup(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLChoosePixelFormat(JNIEnv *__env, jclass clazz, jlong attribsAddress, jlong pixAddress, jlong npixAddress) {
	const CGLPixelFormatAttribute *attribs = (const CGLPixelFormatAttribute *)(intptr_t)attribsAddress;
	CGLPixelFormatObj *pix = (CGLPixelFormatObj *)(intptr_t)pixAddress;
	GLint *npix = (GLint *)(intptr_t)npixAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLChoosePixelFormat(attribs, pix, npix);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLDestroyPixelFormat(JNIEnv *__env, jclass clazz, jlong pixAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLDestroyPixelFormat(pix);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLDescribePixelFormat(JNIEnv *__env, jclass clazz, jlong pixAddress, jint pix_num, jint attrib, jlong valueAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	GLint *value = (GLint *)(intptr_t)valueAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLDescribePixelFormat(pix, pix_num, attrib, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_CGL_nCGLReleasePixelFormat(JNIEnv *__env, jclass clazz, jlong pixAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	UNUSED_PARAMS(__env, clazz)
	CGLReleasePixelFormat(pix);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_CGL_nCGLRetainPixelFormat(JNIEnv *__env, jclass clazz, jlong pixAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)CGLRetainPixelFormat(pix);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLGetPixelFormatRetainCount(JNIEnv *__env, jclass clazz, jlong pixAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLGetPixelFormatRetainCount(pix);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLQueryRendererInfo(JNIEnv *__env, jclass clazz, jint display_mask, jlong rendAddress, jlong nrendAddress) {
	CGLRendererInfoObj *rend = (CGLRendererInfoObj *)(intptr_t)rendAddress;
	GLint *nrend = (GLint *)(intptr_t)nrendAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLQueryRendererInfo(display_mask, rend, nrend);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLDestroyRendererInfo(JNIEnv *__env, jclass clazz, jlong rendAddress) {
	CGLRendererInfoObj rend = (CGLRendererInfoObj)(intptr_t)rendAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLDestroyRendererInfo(rend);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLDescribeRenderer(JNIEnv *__env, jclass clazz, jlong rendAddress, jint rend_num, jint prop, jlong valueAddress) {
	CGLRendererInfoObj rend = (CGLRendererInfoObj)(intptr_t)rendAddress;
	GLint *value = (GLint *)(intptr_t)valueAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLDescribeRenderer(rend, rend_num, prop, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLCreateContext(JNIEnv *__env, jclass clazz, jlong pixAddress, jlong shareAddress, jlong ctxAddress) {
	CGLPixelFormatObj pix = (CGLPixelFormatObj)(intptr_t)pixAddress;
	CGLContextObj share = (CGLContextObj)(intptr_t)shareAddress;
	CGLContextObj *ctx = (CGLContextObj *)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLCreateContext(pix, share, ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLDestroyContext(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLDestroyContext(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLCopyContext(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint mask) {
	CGLContextObj src = (CGLContextObj)(intptr_t)srcAddress;
	CGLContextObj dst = (CGLContextObj)(intptr_t)dstAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLCopyContext(src, dst, mask);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_CGL_nCGLRetainContext(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)CGLRetainContext(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_CGL_nCGLReleaseContext(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	CGLReleaseContext(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLGetContextRetainCount(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLGetContextRetainCount(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_CGL_nCGLGetPixelFormat(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)CGLGetPixelFormat(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLCreatePBuffer(JNIEnv *__env, jclass clazz, jint width, jint height, jint target, jint internalFormat, jint max_level, jlong pbufferAddress) {
	CGLPBufferObj *pbuffer = (CGLPBufferObj *)(intptr_t)pbufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLCreatePBuffer(width, height, target, internalFormat, max_level, pbuffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLDestroyPBuffer(JNIEnv *__env, jclass clazz, jlong pbufferAddress) {
	CGLPBufferObj pbuffer = (CGLPBufferObj)(intptr_t)pbufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLDestroyPBuffer(pbuffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLDescribePBuffer(JNIEnv *__env, jclass clazz, jlong objAddress, jlong widthAddress, jlong heightAddress, jlong targetAddress, jlong internalFormatAddress, jlong mipmapAddress) {
	CGLPBufferObj obj = (CGLPBufferObj)(intptr_t)objAddress;
	GLsizei *width = (GLsizei *)(intptr_t)widthAddress;
	GLsizei *height = (GLsizei *)(intptr_t)heightAddress;
	GLenum *target = (GLenum *)(intptr_t)targetAddress;
	GLenum *internalFormat = (GLenum *)(intptr_t)internalFormatAddress;
	GLint *mipmap = (GLint *)(intptr_t)mipmapAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLDescribePBuffer(obj, width, height, target, internalFormat, mipmap);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLTexImagePBuffer(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong pbufferAddress, jint source) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	CGLPBufferObj pbuffer = (CGLPBufferObj)(intptr_t)pbufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLTexImagePBuffer(ctx, pbuffer, source);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_CGL_nCGLRetainPBuffer(JNIEnv *__env, jclass clazz, jlong pbufferAddress) {
	CGLPBufferObj pbuffer = (CGLPBufferObj)(intptr_t)pbufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)CGLRetainPBuffer(pbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_CGL_nCGLReleasePBuffer(JNIEnv *__env, jclass clazz, jlong pbufferAddress) {
	CGLPBufferObj pbuffer = (CGLPBufferObj)(intptr_t)pbufferAddress;
	UNUSED_PARAMS(__env, clazz)
	CGLReleasePBuffer(pbuffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLGetPBufferRetainCount(JNIEnv *__env, jclass clazz, jlong pbufferAddress) {
	CGLPBufferObj pbuffer = (CGLPBufferObj)(intptr_t)pbufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLGetPBufferRetainCount(pbuffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLSetOffScreen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint width, jint height, jint rowbytes, jlong baseaddrAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	void *baseaddr = (void *)(intptr_t)baseaddrAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLSetOffScreen(ctx, width, height, rowbytes, baseaddr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLGetOffScreen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong widthAddress, jlong heightAddress, jlong rowbytesAddress, jlong baseaddrAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	GLsizei *width = (GLsizei *)(intptr_t)widthAddress;
	GLsizei *height = (GLsizei *)(intptr_t)heightAddress;
	GLint *rowbytes = (GLint *)(intptr_t)rowbytesAddress;
	void **baseaddr = (void **)(intptr_t)baseaddrAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLGetOffScreen(ctx, width, height, rowbytes, baseaddr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLSetFullScreen(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLSetFullScreen(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLSetFullScreenOnDisplay(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint display_mask) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLSetFullScreenOnDisplay(ctx, display_mask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLSetPBuffer(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong pbufferAddress, jint face, jint level, jint screen) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	CGLPBufferObj pbuffer = (CGLPBufferObj)(intptr_t)pbufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLSetPBuffer(ctx, pbuffer, face, level, screen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLGetPBuffer(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong pbufferAddress, jlong faceAddress, jlong levelAddress, jlong screenAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	CGLPBufferObj *pbuffer = (CGLPBufferObj *)(intptr_t)pbufferAddress;
	GLenum *face = (GLenum *)(intptr_t)faceAddress;
	GLint *level = (GLint *)(intptr_t)levelAddress;
	GLint *screen = (GLint *)(intptr_t)screenAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLGetPBuffer(ctx, pbuffer, face, level, screen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLClearDrawable(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLClearDrawable(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLFlushDrawable(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLFlushDrawable(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLEnable(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint pname) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLEnable(ctx, pname);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLDisable(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint pname) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLDisable(ctx, pname);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLIsEnabled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint pname, jlong enableAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	GLint *enable = (GLint *)(intptr_t)enableAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLIsEnabled(ctx, pname, enable);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLSetParameter(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint pname, jlong paramsAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLSetParameter(ctx, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLGetParameter(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint pname, jlong paramsAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLGetParameter(ctx, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLSetVirtualScreen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint screen) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLSetVirtualScreen(ctx, screen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLGetVirtualScreen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong screenAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	GLint *screen = (GLint *)(intptr_t)screenAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLGetVirtualScreen(ctx, screen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLUpdateContext(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
	CGLContextObj ctx = (CGLContextObj)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLUpdateContext(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLSetGlobalOption(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLSetGlobalOption(pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLGetGlobalOption(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLGetGlobalOption(pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLLockContext(JNIEnv *__env, jclass clazz, jlong contextAddress) {
	CGLContextObj context = (CGLContextObj)(intptr_t)contextAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLLockContext(context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_CGL_nCGLUnlockContext(JNIEnv *__env, jclass clazz, jlong contextAddress) {
	CGLContextObj context = (CGLContextObj)(intptr_t)contextAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)CGLUnlockContext(context);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_CGL_nCGLGetVersion(JNIEnv *__env, jclass clazz, jlong majorversAddress, jlong minorversAddress) {
	GLint *majorvers = (GLint *)(intptr_t)majorversAddress;
	GLint *minorvers = (GLint *)(intptr_t)minorversAddress;
	UNUSED_PARAMS(__env, clazz)
	CGLGetVersion(majorvers, minorvers);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_CGL_nCGLErrorString(JNIEnv *__env, jclass clazz, jint error) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)CGLErrorString(error);
}

EXTERN_C_EXIT
