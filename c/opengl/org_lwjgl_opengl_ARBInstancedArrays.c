/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glVertexAttribDivisorARBPROC) (GLuint, GLuint);
typedef GLvoid (APIENTRY *glVertexArrayVertexAttribDivisorEXTPROC) (GLuint, GLuint, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInstancedArrays_nglVertexAttribDivisorARB(JNIEnv *__env, jclass clazz, jint index, jint divisor, jlong __functionAddress) {
	glVertexAttribDivisorARBPROC glVertexAttribDivisorARB = (glVertexAttribDivisorARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribDivisorARB(index, divisor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInstancedArrays_nglVertexArrayVertexAttribDivisorEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint divisor, jlong __functionAddress) {
	glVertexArrayVertexAttribDivisorEXTPROC glVertexArrayVertexAttribDivisorEXT = (glVertexArrayVertexAttribDivisorEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexAttribDivisorEXT(vaobj, index, divisor);
}

EXTERN_C_EXIT
