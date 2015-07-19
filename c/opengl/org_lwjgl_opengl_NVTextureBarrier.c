/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glTextureBarrierNVPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureBarrier_nglTextureBarrierNV(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glTextureBarrierNVPROC glTextureBarrierNV = (glTextureBarrierNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureBarrierNV();
}

EXTERN_C_EXIT
