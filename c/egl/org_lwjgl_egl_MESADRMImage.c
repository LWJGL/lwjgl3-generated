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

typedef EGLImageKHR (APIENTRY *eglCreateDRMImageMESAPROC) (EGLDisplay, const EGLint *);
typedef EGLBoolean (APIENTRY *eglExportDRMImageMESAPROC) (EGLDisplay, EGLImageKHR, EGLint *, EGLint *, EGLint *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_MESADRMImage_neglCreateDRMImageMESA(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreateDRMImageMESAPROC eglCreateDRMImageMESA = (eglCreateDRMImageMESAPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateDRMImageMESA(dpy, attrib_list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_MESADRMImage_neglExportDRMImageMESA(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong imageAddress, jlong nameAddress, jlong handleAddress, jlong strideAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLImageKHR image = (EGLImageKHR)(intptr_t)imageAddress;
	EGLint *name = (EGLint *)(intptr_t)nameAddress;
	EGLint *handle = (EGLint *)(intptr_t)handleAddress;
	EGLint *stride = (EGLint *)(intptr_t)strideAddress;
	eglExportDRMImageMESAPROC eglExportDRMImageMESA = (eglExportDRMImageMESAPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglExportDRMImageMESA(dpy, image, name, handle, stride);
}

EXTERN_C_EXIT
