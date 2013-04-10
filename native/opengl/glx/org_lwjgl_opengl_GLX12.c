/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef Display * (APIENTRY *glXGetCurrentDisplayPROC) (void);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX12_nglXGetCurrentDisplay(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glXGetCurrentDisplayPROC glXGetCurrentDisplay = (glXGetCurrentDisplayPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXGetCurrentDisplay();
}