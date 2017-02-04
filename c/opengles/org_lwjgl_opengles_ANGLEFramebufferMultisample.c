/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleANGLEPROC) (jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ANGLEFramebufferMultisample_glRenderbufferStorageMultisampleANGLE(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height) {
	glRenderbufferStorageMultisampleANGLEPROC glRenderbufferStorageMultisampleANGLE = (glRenderbufferStorageMultisampleANGLEPROC)tlsGetFunction(596);
	UNUSED_PARAM(clazz)
	glRenderbufferStorageMultisampleANGLE(target, samples, internalformat, width, height);
}

EXTERN_C_EXIT
