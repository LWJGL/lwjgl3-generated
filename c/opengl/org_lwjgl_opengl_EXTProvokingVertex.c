/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glProvokingVertexEXTPROC) (GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTProvokingVertex_nglProvokingVertexEXT(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glProvokingVertexEXTPROC glProvokingVertexEXT = (glProvokingVertexEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProvokingVertexEXT(mode);
}

EXTERN_C_EXIT
