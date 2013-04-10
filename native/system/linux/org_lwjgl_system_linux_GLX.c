/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <GL/glx.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_GLX_nglXQueryExtension(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong error_baseAddress, jlong event_baseAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *error_base = (int *)(intptr_t)error_baseAddress;
	int *event_base = (int *)(intptr_t)event_baseAddress;
	return (jint)glXQueryExtension(display, error_base, event_base);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_GLX_nglXQueryVersion(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong majorAddress, jlong minorAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *major = (int *)(intptr_t)majorAddress;
	int *minor = (int *)(intptr_t)minorAddress;
	return (jint)glXQueryVersion(display, major, minor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_GLX_nglXGetConfig(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong visualAddress, jint attribute, jlong valueAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XVisualInfo *visual = (XVisualInfo *)(intptr_t)visualAddress;
	int *value = (int *)(intptr_t)valueAddress;
	return (jint)glXGetConfig(display, visual, attribute, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLX_nglXChooseVisual(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jlong attrib_listAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *attrib_list = (int *)(intptr_t)attrib_listAddress;
	return (jlong)(intptr_t)glXChooseVisual(display, screen, attrib_list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLX_nglXCreateContext(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong visualAddress, jlong share_listAddress, jint direct) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XVisualInfo *visual = (XVisualInfo *)(intptr_t)visualAddress;
	GLXContext share_list = (GLXContext)(intptr_t)share_listAddress;
	return (jlong)(intptr_t)glXCreateContext(display, visual, share_list, direct);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_GLX_nglXMakeCurrent(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawAddress, jlong ctxAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable draw = (GLXDrawable)(intptr_t)drawAddress;
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	return (jint)glXMakeCurrent(display, draw, ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_nglXCopyContext(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong sourceAddress, jlong destAddress, jlong mask) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext source = (GLXContext)(intptr_t)sourceAddress;
	GLXContext dest = (GLXContext)(intptr_t)destAddress;
	glXCopyContext(display, source, dest, (unsigned long)mask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_GLX_nglXIsDirect(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong ctxAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	return (jint)glXIsDirect(display, ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_nglXDestroyContext(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong ctxAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	glXDestroyContext(display, ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLX_glXGetCurrentContext(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)glXGetCurrentContext();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLX_glXGetCurrentDrawable(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)glXGetCurrentDrawable();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_glXWaitGL(JNIEnv *__env, jclass clazz) {
	glXWaitGL();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_glXWaitX(JNIEnv *__env, jclass clazz) {
	glXWaitX();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_nglXSwapBuffers(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable draw = (GLXDrawable)(intptr_t)drawAddress;
	glXSwapBuffers(display, draw);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_glXUseXFont(JNIEnv *__env, jclass clazz, jlong font, jint first, jint count, jint list_base) {
	glXUseXFont((Font)font, first, count, list_base);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLX_nglXCreateGLXPixmap(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong visualAddress, jlong pixmap) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XVisualInfo *visual = (XVisualInfo *)(intptr_t)visualAddress;
	return (jlong)(intptr_t)glXCreateGLXPixmap(display, visual, (Pixmap)pixmap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_GLX_nglXDestroyGLXPixmap(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong pixmapAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXPixmap pixmap = (GLXPixmap)(intptr_t)pixmapAddress;
	glXDestroyGLXPixmap(display, pixmap);
}