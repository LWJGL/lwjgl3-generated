/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glBeginConditionalRenderNVXPROC) (GLuint);
typedef GLvoid (APIENTRY *glEndConditionalRenderNVXPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVXConditionalRender_nglBeginConditionalRenderNVX(JNIEnv *__env, jclass clazz, jint id, jlong __functionAddress) {
	glBeginConditionalRenderNVXPROC glBeginConditionalRenderNVX = (glBeginConditionalRenderNVXPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginConditionalRenderNVX(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVXConditionalRender_nglEndConditionalRenderNVX(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glEndConditionalRenderNVXPROC glEndConditionalRenderNVX = (glEndConditionalRenderNVXPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndConditionalRenderNVX();
}

EXTERN_C_EXIT
