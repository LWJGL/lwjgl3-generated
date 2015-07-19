/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBlendParameteriNVPROC) (GLenum, GLint);
typedef void (APIENTRY *glBlendBarrierNVPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBlendEquationAdvanced_nglBlendParameteriNV(JNIEnv *__env, jclass clazz, jint pname, jint value, jlong __functionAddress) {
	glBlendParameteriNVPROC glBlendParameteriNV = (glBlendParameteriNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendParameteriNV(pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBlendEquationAdvanced_nglBlendBarrierNV(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glBlendBarrierNVPROC glBlendBarrierNV = (glBlendBarrierNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendBarrierNV();
}

EXTERN_C_EXIT
