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

typedef EGLStreamKHR (APIENTRY *eglCreateStreamKHRPROC) (EGLDisplay, const EGLint *);
typedef EGLBoolean (APIENTRY *eglDestroyStreamKHRPROC) (EGLDisplay, EGLStreamKHR);
typedef EGLBoolean (APIENTRY *eglStreamAttribKHRPROC) (EGLDisplay, EGLStreamKHR, EGLenum, EGLint);
typedef EGLBoolean (APIENTRY *eglQueryStreamKHRPROC) (EGLDisplay, EGLStreamKHR, EGLenum, EGLint *);
typedef EGLBoolean (APIENTRY *eglQueryStreamu64KHRPROC) (EGLDisplay, EGLStreamKHR, EGLenum, EGLuint64KHR *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_KHRStream_neglCreateStreamKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreateStreamKHRPROC eglCreateStreamKHR = (eglCreateStreamKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateStreamKHR(dpy, attrib_list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRStream_neglDestroyStreamKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong streamAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	eglDestroyStreamKHRPROC eglDestroyStreamKHR = (eglDestroyStreamKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglDestroyStreamKHR(dpy, stream);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRStream_neglStreamAttribKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong streamAddress, jint attribute, jint value, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	eglStreamAttribKHRPROC eglStreamAttribKHR = (eglStreamAttribKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglStreamAttribKHR(dpy, stream, attribute, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRStream_neglQueryStreamKHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong streamAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	EGLint *value = (EGLint *)(intptr_t)valueAddress;
	eglQueryStreamKHRPROC eglQueryStreamKHR = (eglQueryStreamKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryStreamKHR(dpy, stream, attribute, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_KHRStream_neglQueryStreamu64KHR(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong streamAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	EGLuint64KHR *value = (EGLuint64KHR *)(intptr_t)valueAddress;
	eglQueryStreamu64KHRPROC eglQueryStreamu64KHR = (eglQueryStreamu64KHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryStreamu64KHR(dpy, stream, attribute, value);
}

EXTERN_C_EXIT
