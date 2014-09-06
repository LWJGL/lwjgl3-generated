/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"
#include <GL/glx.h>

typedef Bool (APIENTRY *glXDelayBeforeSwapNVPROC) (Display *, GLXDrawable, GLfloat);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXNVDelayBeforeSwap_nglXDelayBeforeSwapNV(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawableAddress, jfloat seconds, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable drawable = (GLXDrawable)(intptr_t)drawableAddress;
	glXDelayBeforeSwapNVPROC glXDelayBeforeSwapNV = (glXDelayBeforeSwapNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXDelayBeforeSwapNV(display, drawable, seconds);
}

EXTERN_C_EXIT
