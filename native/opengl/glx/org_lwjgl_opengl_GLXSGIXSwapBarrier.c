/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef void (APIENTRY *glXBindSwapBarrierSGIXPROC) (Display *, GLXDrawable, int);
typedef Bool (APIENTRY *glXQueryMaxSwapBarriersSGIXPROC) (Display *, int, int *);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXSGIXSwapBarrier_nglXBindSwapBarrierSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawableAddress, jint barrier, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable drawable = (GLXDrawable)(intptr_t)drawableAddress;
	glXBindSwapBarrierSGIXPROC glXBindSwapBarrierSGIX = (glXBindSwapBarrierSGIXPROC)(intptr_t)__functionAddress;
	glXBindSwapBarrierSGIX(display, drawable, barrier);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXSGIXSwapBarrier_nglXQueryMaxSwapBarriersSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jlong maxAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *max = (int *)(intptr_t)maxAddress;
	glXQueryMaxSwapBarriersSGIXPROC glXQueryMaxSwapBarriersSGIX = (glXQueryMaxSwapBarriersSGIXPROC)(intptr_t)__functionAddress;
	return (jint)glXQueryMaxSwapBarriersSGIX(display, screen, max);
}