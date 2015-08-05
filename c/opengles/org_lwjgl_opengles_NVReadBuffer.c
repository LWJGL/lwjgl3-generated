/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glReadBufferNVPROC) (GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVReadBuffer_nglReadBufferNV(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glReadBufferNVPROC glReadBufferNV = (glReadBufferNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReadBufferNV(mode);
}

EXTERN_C_EXIT
