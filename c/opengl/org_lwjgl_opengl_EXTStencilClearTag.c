/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glStencilClearTagEXTPROC) (GLsizei, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTStencilClearTag_nglStencilClearTagEXT(JNIEnv *__env, jclass clazz, jint stencilTagBits, jint stencilClearTag, jlong __functionAddress) {
	glStencilClearTagEXTPROC glStencilClearTagEXT = (glStencilClearTagEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilClearTagEXT(stencilTagBits, stencilClearTag);
}

EXTERN_C_EXIT
