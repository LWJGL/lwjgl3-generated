/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_GLX_nQueryExtension(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong error_baseAddress, jlong event_baseAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *error_base = (int *)(intptr_t)error_baseAddress;
	int *event_base = (int *)(intptr_t)event_baseAddress;
	return (jint)QueryExtension(display, error_base, event_base);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_GLX_nQueryVersion(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong majorAddress, jlong minorAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *major = (int *)(intptr_t)majorAddress;
	int *minor = (int *)(intptr_t)minorAddress;
	return (jint)QueryVersion(display, major, minor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_GLX_nGetConfig(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong visualAddress, jint attribute, jlong valueAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XVisualInfo *visual = (XVisualInfo *)(intptr_t)visualAddress;
	int *value = (int *)(intptr_t)valueAddress;
	return (jint)GetConfig(display, visual, attribute, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLX_nChooseVisual(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jlong attrib_listAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *attrib_list = (int *)(intptr_t)attrib_listAddress;
	return (jlong)(intptr_t)ChooseVisual(display, screen, attrib_list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLX_nCreateContext(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong visualAddress, jlong share_listAddress, jint direct) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XVisualInfo *visual = (XVisualInfo *)(intptr_t)visualAddress;
	GLXContext share_list = (GLXContext)(intptr_t)share_listAddress;
	return (jlong)(intptr_t)CreateContext(display, visual, share_list, direct);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_GLX_nMakeCurrent(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawAddress, jlong ctxAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable draw = (GLXDrawable)(intptr_t)drawAddress;
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	return (jint)MakeCurrent(display, draw, ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_nCopyContext(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong sourceAddress, jlong destAddress, jlong mask) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext source = (GLXContext)(intptr_t)sourceAddress;
	GLXContext dest = (GLXContext)(intptr_t)destAddress;
	CopyContext(display, source, dest, (unsigned long)mask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_GLX_nIsDirect(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong ctxAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	return (jint)IsDirect(display, ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_nDestroyContext(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong ctxAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	DestroyContext(display, ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLX_GetCurrentContext(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)GetCurrentContext();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLX_GetCurrentDrawable(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)GetCurrentDrawable();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_WaitGL(JNIEnv *__env, jclass clazz) {
	WaitGL();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_WaitX(JNIEnv *__env, jclass clazz) {
	WaitX();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_nSwapBuffers(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable draw = (GLXDrawable)(intptr_t)drawAddress;
	SwapBuffers(display, draw);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_UseXFont(JNIEnv *__env, jclass clazz, jlong font, jint first, jint count, jint list_base) {
	UseXFont((Font)font, first, count, list_base);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLX_nCreateGLXPixmap(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong visualAddress, jlong pixmap) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XVisualInfo *visual = (XVisualInfo *)(intptr_t)visualAddress;
	return (jlong)(intptr_t)CreateGLXPixmap(display, visual, (Pixmap)pixmap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_nDestroyGLXPixmap(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong pixmapAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXPixmap pixmap = (GLXPixmap)(intptr_t)pixmapAddress;
	DestroyGLXPixmap(display, pixmap);
}