/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glClampColorARBPROC) (GLenum, GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBColorBufferFloat_nglClampColorARB(JNIEnv *__env, jclass clazz, jint target, jint clamp, jlong __functionAddress) {
	glClampColorARBPROC glClampColorARB = (glClampColorARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClampColorARB(target, clamp);
}

EXTERN_C_EXIT
