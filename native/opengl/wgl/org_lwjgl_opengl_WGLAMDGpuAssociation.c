/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"
#include "WGL.h"

typedef UINT (APIENTRY *wglGetGPUIDsAMDPROC) (UINT, UINT *);
typedef int (APIENTRY *wglGetGPUInfoAMDPROC) (UINT, int, GLenum, UINT, GLvoid *);
typedef UINT (APIENTRY *wglGetContextGPUIDAMDPROC) (HGLRC);
typedef HGLRC (APIENTRY *wglCreateAssociatedContextAMDPROC) (UINT);
typedef HGLRC (APIENTRY *wglCreateAssociatedContextAttribsAMDPROC) (UINT, HGLRC, const int *);
typedef BOOL (APIENTRY *wglDeleteAssociatedContextAMDPROC) (HGLRC);
typedef BOOL (APIENTRY *wglMakeAssociatedContextCurrentAMDPROC) (HGLRC);
typedef HGLRC (APIENTRY *wglGetCurrentAssociatedContextAMDPROC) (void);
typedef VOID (APIENTRY *wglBlitContextFramebufferAMDPROC) (HGLRC, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum);

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLAMDGPUAssociation_nwglGetGPUIDsAMD(JNIEnv *__env, jclass clazz, jint maxCount, jlong idsAddress, jlong __functionAddress) {
	UINT *ids = (UINT *)(intptr_t)idsAddress;
	wglGetGPUIDsAMDPROC wglGetGPUIDsAMD = (wglGetGPUIDsAMDPROC)(intptr_t)__functionAddress;
	return (jint)wglGetGPUIDsAMD(maxCount, ids);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLAMDGPUAssociation_nwglGetGPUInfoAMD(JNIEnv *__env, jclass clazz, jint id, jint property, jint dataType, jint size, jlong dataAddress, jlong __functionAddress) {
	GLvoid *data = (GLvoid *)(intptr_t)dataAddress;
	wglGetGPUInfoAMDPROC wglGetGPUInfoAMD = (wglGetGPUInfoAMDPROC)(intptr_t)__functionAddress;
	return (jint)wglGetGPUInfoAMD(id, property, dataType, size, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLAMDGPUAssociation_nwglGetContextGPUIDAMD(JNIEnv *__env, jclass clazz, jlong hglrcAddress, jlong __functionAddress) {
	HGLRC hglrc = (HGLRC)(intptr_t)hglrcAddress;
	wglGetContextGPUIDAMDPROC wglGetContextGPUIDAMD = (wglGetContextGPUIDAMDPROC)(intptr_t)__functionAddress;
	return (jint)wglGetContextGPUIDAMD(hglrc);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLAMDGPUAssociation_nwglCreateAssociatedContextAMD(JNIEnv *__env, jclass clazz, jint id, jlong __functionAddress) {
	wglCreateAssociatedContextAMDPROC wglCreateAssociatedContextAMD = (wglCreateAssociatedContextAMDPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)wglCreateAssociatedContextAMD(id);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLAMDGPUAssociation_nwglCreateAssociatedContextAttribsAMD(JNIEnv *__env, jclass clazz, jint id, jlong shareContextAddress, jlong attribListAddress, jlong __functionAddress) {
	HGLRC shareContext = (HGLRC)(intptr_t)shareContextAddress;
	const int *attribList = (const int *)(intptr_t)attribListAddress;
	wglCreateAssociatedContextAttribsAMDPROC wglCreateAssociatedContextAttribsAMD = (wglCreateAssociatedContextAttribsAMDPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)wglCreateAssociatedContextAttribsAMD(id, shareContext, attribList);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLAMDGPUAssociation_nwglDeleteAssociatedContextAMD(JNIEnv *__env, jclass clazz, jlong hglrcAddress, jlong __functionAddress) {
	HGLRC hglrc = (HGLRC)(intptr_t)hglrcAddress;
	wglDeleteAssociatedContextAMDPROC wglDeleteAssociatedContextAMD = (wglDeleteAssociatedContextAMDPROC)(intptr_t)__functionAddress;
	return (jint)wglDeleteAssociatedContextAMD(hglrc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLAMDGPUAssociation_nwglMakeAssociatedContextCurrentAMD(JNIEnv *__env, jclass clazz, jlong hglrcAddress, jlong __functionAddress) {
	HGLRC hglrc = (HGLRC)(intptr_t)hglrcAddress;
	wglMakeAssociatedContextCurrentAMDPROC wglMakeAssociatedContextCurrentAMD = (wglMakeAssociatedContextCurrentAMDPROC)(intptr_t)__functionAddress;
	return (jint)wglMakeAssociatedContextCurrentAMD(hglrc);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLAMDGPUAssociation_nwglGetCurrentAssociatedContextAMD(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	wglGetCurrentAssociatedContextAMDPROC wglGetCurrentAssociatedContextAMD = (wglGetCurrentAssociatedContextAMDPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)wglGetCurrentAssociatedContextAMD();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_WGLAMDGPUAssociation_nwglBlitContextFramebufferAMD(JNIEnv *__env, jclass clazz, jlong dstCtxAddress, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter, jlong __functionAddress) {
	HGLRC dstCtx = (HGLRC)(intptr_t)dstCtxAddress;
	wglBlitContextFramebufferAMDPROC wglBlitContextFramebufferAMD = (wglBlitContextFramebufferAMDPROC)(intptr_t)__functionAddress;
	wglBlitContextFramebufferAMD(dstCtx, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}