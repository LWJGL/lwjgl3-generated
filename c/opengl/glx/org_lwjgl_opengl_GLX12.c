/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef Display * (APIENTRY *glXGetCurrentDisplayPROC) (void);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX12_nglXGetCurrentDisplay(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glXGetCurrentDisplayPROC glXGetCurrentDisplay = (glXGetCurrentDisplayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glXGetCurrentDisplay();
}

EXTERN_C_EXIT
