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

typedef EGLSyncKHR (APIENTRY *eglCreateSync64KHRPROC) (EGLDisplay, EGLenum, const EGLAttribKHR *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_KHRCLEvent2_neglCreateSync64KHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jint type, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	const EGLAttribKHR *attrib_list = (const EGLAttribKHR *)(intptr_t)attrib_listAddress;
	eglCreateSync64KHRPROC eglCreateSync64KHR = (eglCreateSync64KHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateSync64KHR(dpy, type, attrib_list);
}

EXTERN_C_EXIT
