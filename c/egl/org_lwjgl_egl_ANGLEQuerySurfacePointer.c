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

typedef EGLBoolean (APIENTRY *eglQuerySurfacePointerANGLEPROC) (EGLDisplay, EGLSurface, EGLint, void **);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_ANGLEQuerySurfacePointer_neglQuerySurfacePointerANGLE(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	void **value = (void **)(intptr_t)valueAddress;
	eglQuerySurfacePointerANGLEPROC eglQuerySurfacePointerANGLE = (eglQuerySurfacePointerANGLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQuerySurfacePointerANGLE(dpy, surface, attribute, value);
}

EXTERN_C_EXIT
