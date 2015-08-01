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

typedef EGLBoolean (APIENTRY *eglStreamConsumerOutputEXTPROC) (EGLDisplay, EGLStreamKHR, EGLOutputLayerEXT);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EXTStreamConsumerEGLOutput_neglStreamConsumerOutputEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong streamAddress, jlong layerAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLStreamKHR stream = (EGLStreamKHR)(intptr_t)streamAddress;
	EGLOutputLayerEXT layer = (EGLOutputLayerEXT)(intptr_t)layerAddress;
	eglStreamConsumerOutputEXTPROC eglStreamConsumerOutputEXT = (eglStreamConsumerOutputEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglStreamConsumerOutputEXT(dpy, stream, layer);
}

EXTERN_C_EXIT
