/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef void (APIENTRY *glXSwapIntervalEXTPROC) (Display *, GLXDrawable, int);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXEXTSwapControl_nglXSwapIntervalEXT(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawableAddress, jint interval, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable drawable = (GLXDrawable)(intptr_t)drawableAddress;
	glXSwapIntervalEXTPROC glXSwapIntervalEXT = (glXSwapIntervalEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glXSwapIntervalEXT(display, drawable, interval);
}

EXTERN_C_EXIT
