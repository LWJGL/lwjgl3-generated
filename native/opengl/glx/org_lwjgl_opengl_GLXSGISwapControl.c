/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"
#include "GLX.h"

typedef GLint (APIENTRY *glXSwapIntervalSGIPROC) (GLint);

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXSGISwapControl_nglXSwapIntervalSGI(JNIEnv *__env, jclass clazz, jint interval, jlong __functionAddress) {
	glXSwapIntervalSGIPROC glXSwapIntervalSGI = (glXSwapIntervalSGIPROC)(intptr_t)__functionAddress;
	return (jint)glXSwapIntervalSGI(interval);
}