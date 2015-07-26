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

typedef EGLBoolean (APIENTRY *eglQueryDeviceAttribEXTPROC) (EGLDeviceEXT, EGLint, EGLAttrib *);
typedef char * (APIENTRY *eglQueryDeviceStringEXTPROC) (EGLDeviceEXT, EGLint);
typedef EGLBoolean (APIENTRY *eglQueryDisplayAttribEXTPROC) (EGLDisplay, EGLint, EGLAttrib *);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EXTDeviceQuery_neglQueryDeviceAttribEXT(JNIEnv *__env, jclass clazz, jlong deviceAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDeviceEXT device = (EGLDeviceEXT)(intptr_t)deviceAddress;
	EGLAttrib *value = (EGLAttrib *)(intptr_t)valueAddress;
	eglQueryDeviceAttribEXTPROC eglQueryDeviceAttribEXT = (eglQueryDeviceAttribEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryDeviceAttribEXT(device, attribute, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EXTDeviceQuery_neglQueryDeviceStringEXT(JNIEnv *__env, jclass clazz, jlong deviceAddress, jint name, jlong __functionAddress) {
	EGLDeviceEXT device = (EGLDeviceEXT)(intptr_t)deviceAddress;
	eglQueryDeviceStringEXTPROC eglQueryDeviceStringEXT = (eglQueryDeviceStringEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglQueryDeviceStringEXT(device, name);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EXTDeviceQuery_neglQueryDisplayAttribEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLAttrib *value = (EGLAttrib *)(intptr_t)valueAddress;
	eglQueryDisplayAttribEXTPROC eglQueryDisplayAttribEXT = (eglQueryDisplayAttribEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryDisplayAttribEXT(dpy, attribute, value);
}

EXTERN_C_EXIT
