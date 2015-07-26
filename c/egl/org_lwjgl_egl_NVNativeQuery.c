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

typedef EGLBoolean (APIENTRY *eglQueryNativeDisplayNVPROC) (EGLDisplay, EGLNativeDisplayType *);
typedef EGLBoolean (APIENTRY *eglQueryNativeWindowNVPROC) (EGLDisplay, EGLSurface, EGLNativeWindowType *);
typedef EGLBoolean (APIENTRY *eglQueryNativePixmapNVPROC) (EGLDisplay, EGLSurface, EGLNativePixmapType *);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_NVNativeQuery_neglQueryNativeDisplayNV(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong display_idAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLNativeDisplayType *display_id = (EGLNativeDisplayType *)(intptr_t)display_idAddress;
	eglQueryNativeDisplayNVPROC eglQueryNativeDisplayNV = (eglQueryNativeDisplayNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryNativeDisplayNV(dpy, display_id);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_NVNativeQuery_neglQueryNativeWindowNV(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfAddress, jlong windowAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surf = (EGLSurface)(intptr_t)surfAddress;
	EGLNativeWindowType *window = (EGLNativeWindowType *)(intptr_t)windowAddress;
	eglQueryNativeWindowNVPROC eglQueryNativeWindowNV = (eglQueryNativeWindowNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryNativeWindowNV(dpy, surf, window);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_NVNativeQuery_neglQueryNativePixmapNV(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfAddress, jlong pixmapAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surf = (EGLSurface)(intptr_t)surfAddress;
	EGLNativePixmapType *pixmap = (EGLNativePixmapType *)(intptr_t)pixmapAddress;
	eglQueryNativePixmapNVPROC eglQueryNativePixmapNV = (eglQueryNativePixmapNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryNativePixmapNV(dpy, surf, pixmap);
}

EXTERN_C_EXIT
