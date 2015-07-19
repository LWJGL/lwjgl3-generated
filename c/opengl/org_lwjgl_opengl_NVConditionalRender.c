/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBeginConditionalRenderNVPROC) (GLuint, GLenum);
typedef void (APIENTRY *glEndConditionalRenderNVPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVConditionalRender_nglBeginConditionalRenderNV(JNIEnv *__env, jclass clazz, jint id, jint mode, jlong __functionAddress) {
	glBeginConditionalRenderNVPROC glBeginConditionalRenderNV = (glBeginConditionalRenderNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginConditionalRenderNV(id, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVConditionalRender_nglEndConditionalRenderNV(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glEndConditionalRenderNVPROC glEndConditionalRenderNV = (glEndConditionalRenderNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndConditionalRenderNV();
}

EXTERN_C_EXIT
