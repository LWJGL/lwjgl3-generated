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

typedef EGLBoolean (APIENTRY *eglSwapBuffersWithDamageEXTPROC) (EGLDisplay, EGLSurface, EGLint *, EGLint);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EXTSwapBuffersWithDamage_neglSwapBuffersWithDamageEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jlong rectsAddress, jint n_rects, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	EGLint *rects = (EGLint *)(intptr_t)rectsAddress;
	eglSwapBuffersWithDamageEXTPROC eglSwapBuffersWithDamageEXT = (eglSwapBuffersWithDamageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglSwapBuffersWithDamageEXT(dpy, surface, rects, n_rects);
}

EXTERN_C_EXIT
