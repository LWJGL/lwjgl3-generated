/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glDrawArraysInstancedBaseInstanceEXTPROC) (GLenum, GLint, GLsizei, GLsizei, GLuint);
typedef void (APIENTRY *glDrawElementsInstancedBaseInstanceEXTPROC) (GLenum, GLsizei, GLenum, const void *, GLsizei, GLuint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexBaseInstanceEXTPROC) (GLenum, GLsizei, GLenum, const void *, GLsizei, GLint, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTBaseInstance_nglDrawArraysInstancedBaseInstanceEXT(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint instancecount, jint baseinstance, jlong __functionAddress) {
	glDrawArraysInstancedBaseInstanceEXTPROC glDrawArraysInstancedBaseInstanceEXT = (glDrawArraysInstancedBaseInstanceEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArraysInstancedBaseInstanceEXT(mode, first, count, instancecount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTBaseInstance_nglDrawElementsInstancedBaseInstanceEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint baseinstance, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedBaseInstanceEXTPROC glDrawElementsInstancedBaseInstanceEXT = (glDrawElementsInstancedBaseInstanceEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedBaseInstanceEXT(mode, count, type, indices, instancecount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTBaseInstance_nglDrawElementsInstancedBaseVertexBaseInstanceEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint basevertex, jint baseinstance, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedBaseVertexBaseInstanceEXTPROC glDrawElementsInstancedBaseVertexBaseInstanceEXT = (glDrawElementsInstancedBaseVertexBaseInstanceEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, count, type, indices, instancecount, basevertex, baseinstance);
}

EXTERN_C_EXIT
