/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "EGL/egl.h"
#include "EGL/eglext.h"
ENABLE_WARNINGS()

typedef EGLDisplay (APIENTRY *eglGetPlatformDisplayEXTPROC) (EGLenum, void *, const EGLint *);
typedef EGLSurface (APIENTRY *eglCreatePlatformWindowSurfaceEXTPROC) (EGLDisplay, EGLConfig, void *, const EGLint *);
typedef EGLSurface (APIENTRY *eglCreatePlatformPixmapSurfaceEXTPROC) (EGLDisplay, EGLConfig, void *, const EGLint *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EXTPlatformBase_neglGetPlatformDisplayEXT(JNIEnv *__env, jclass clazz, jint platform, jlong native_displayAddress, jlong attrib_listAddress, jlong __functionAddress) {
	void *native_display = (void *)(intptr_t)native_displayAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglGetPlatformDisplayEXTPROC eglGetPlatformDisplayEXT = (eglGetPlatformDisplayEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglGetPlatformDisplayEXT(platform, native_display, attrib_list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EXTPlatformBase_neglCreatePlatformWindowSurfaceEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configAddress, jlong native_windowAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	void *native_window = (void *)(intptr_t)native_windowAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreatePlatformWindowSurfaceEXTPROC eglCreatePlatformWindowSurfaceEXT = (eglCreatePlatformWindowSurfaceEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreatePlatformWindowSurfaceEXT(dpy, config, native_window, attrib_list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EXTPlatformBase_neglCreatePlatformPixmapSurfaceEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configAddress, jlong native_pixmapAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	void *native_pixmap = (void *)(intptr_t)native_pixmapAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreatePlatformPixmapSurfaceEXTPROC eglCreatePlatformPixmapSurfaceEXT = (eglCreatePlatformPixmapSurfaceEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreatePlatformPixmapSurfaceEXT(dpy, config, native_pixmap, attrib_list);
}

EXTERN_C_EXIT
