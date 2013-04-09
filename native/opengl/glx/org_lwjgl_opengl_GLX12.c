/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"
#include "GLX.h"

typedef Display * (APIENTRY *glXGetCurrentDisplayPROC) ();

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX12_nglXGetCurrentDisplay(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glXGetCurrentDisplayPROC glXGetCurrentDisplay = (glXGetCurrentDisplayPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXGetCurrentDisplay();
}