/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"
#include "GLX.h"

typedef GLvoid (APIENTRY *glXSwapIntervalEXTPROC) (Display *, GLXDrawable, GLint);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXEXTSwapControl_nglXSwapIntervalEXT(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawableAddress, jint interval, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable drawable = (GLXDrawable)(intptr_t)drawableAddress;
	glXSwapIntervalEXTPROC glXSwapIntervalEXT = (glXSwapIntervalEXTPROC)(intptr_t)__functionAddress;
	glXSwapIntervalEXT(display, drawable, interval);
}