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

typedef EGLSurface (APIENTRY *eglCreatePixmapSurfaceHIPROC) (EGLDisplay, EGLConfig, struct EGLClientPixmapHI *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_HIClientpixmap_neglCreatePixmapSurfaceHI(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configAddress, jlong pixmapAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	struct EGLClientPixmapHI *pixmap = (struct EGLClientPixmapHI *)(intptr_t)pixmapAddress;
	eglCreatePixmapSurfaceHIPROC eglCreatePixmapSurfaceHI = (eglCreatePixmapSurfaceHIPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreatePixmapSurfaceHI(dpy, config, pixmap);
}

EXTERN_C_EXIT
