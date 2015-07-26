/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "EGL/egl.h"
ENABLE_WARNINGS()

typedef EGLContext (APIENTRY *eglGetCurrentContextPROC) (void);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL14_neglGetCurrentContext(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	eglGetCurrentContextPROC eglGetCurrentContext = (eglGetCurrentContextPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglGetCurrentContext();
}

EXTERN_C_EXIT
