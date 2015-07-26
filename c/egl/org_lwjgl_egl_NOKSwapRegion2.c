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

typedef EGLBoolean (APIENTRY *eglSwapBuffersRegion2NOKPROC) (EGLDisplay, EGLSurface, EGLint, const EGLint *);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_NOKSwapRegion2_neglSwapBuffersRegion2NOK(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jint numRects, jlong rectsAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	const EGLint *rects = (const EGLint *)(intptr_t)rectsAddress;
	eglSwapBuffersRegion2NOKPROC eglSwapBuffersRegion2NOK = (eglSwapBuffersRegion2NOKPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglSwapBuffersRegion2NOK(dpy, surface, numRects, rects);
}

EXTERN_C_EXIT
