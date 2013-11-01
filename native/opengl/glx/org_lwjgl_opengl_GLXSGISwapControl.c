/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef GLint (APIENTRY *glXSwapIntervalSGIPROC) (int);

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXSGISwapControl_nglXSwapIntervalSGI(JNIEnv *__env, jclass clazz, jint interval, jlong __functionAddress) {
	glXSwapIntervalSGIPROC glXSwapIntervalSGI = (glXSwapIntervalSGIPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXSwapIntervalSGI(interval);
}
