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

typedef EGLBoolean (APIENTRY *eglExportDMABUFImageQueryMESAPROC) (EGLDisplay, EGLImageKHR, int *, int *, EGLuint64KHR *);
typedef EGLBoolean (APIENTRY *eglExportDMABUFImageMESAPROC) (EGLDisplay, EGLImageKHR, int *, EGLint *, EGLint *);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_MESAImageDMABufExport_neglExportDMABUFImageQueryMESA(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong imageAddress, jlong fourccAddress, jlong num_planesAddress, jlong modifiersAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLImageKHR image = (EGLImageKHR)(intptr_t)imageAddress;
	int *fourcc = (int *)(intptr_t)fourccAddress;
	int *num_planes = (int *)(intptr_t)num_planesAddress;
	EGLuint64KHR *modifiers = (EGLuint64KHR *)(intptr_t)modifiersAddress;
	eglExportDMABUFImageQueryMESAPROC eglExportDMABUFImageQueryMESA = (eglExportDMABUFImageQueryMESAPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglExportDMABUFImageQueryMESA(dpy, image, fourcc, num_planes, modifiers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_MESAImageDMABufExport_neglExportDMABUFImageMESA(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong imageAddress, jlong fdsAddress, jlong stridesAddress, jlong offsetsAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLImageKHR image = (EGLImageKHR)(intptr_t)imageAddress;
	int *fds = (int *)(intptr_t)fdsAddress;
	EGLint *strides = (EGLint *)(intptr_t)stridesAddress;
	EGLint *offsets = (EGLint *)(intptr_t)offsetsAddress;
	eglExportDMABUFImageMESAPROC eglExportDMABUFImageMESA = (eglExportDMABUFImageMESAPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglExportDMABUFImageMESA(dpy, image, fds, strides, offsets);
}

EXTERN_C_EXIT
