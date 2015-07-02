/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef const char * (APIENTRY *wglGetExtensionsStringEXTPROC) (void);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLEXTExtensionsString_nwglGetExtensionsStringEXT(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	wglGetExtensionsStringEXTPROC wglGetExtensionsStringEXT = (wglGetExtensionsStringEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)wglGetExtensionsStringEXT();
}

EXTERN_C_EXIT
