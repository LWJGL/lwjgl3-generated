/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glVertexAttribDivisorNVPROC) (GLuint, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVInstancedArrays_nglVertexAttribDivisorNV(JNIEnv *__env, jclass clazz, jint index, jint divisor, jlong __functionAddress) {
	glVertexAttribDivisorNVPROC glVertexAttribDivisorNV = (glVertexAttribDivisorNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribDivisorNV(index, divisor);
}

EXTERN_C_EXIT
