/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glDrawElementsBaseVertexEXTPROC) (GLenum, GLsizei, GLenum, const void *, GLint);
typedef void (APIENTRY *glDrawRangeElementsBaseVertexEXTPROC) (GLenum, GLuint, GLuint, GLsizei, GLenum, const void *, GLint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexEXTPROC) (GLenum, GLsizei, GLenum, const void *, GLsizei, GLint);
typedef void (APIENTRY *glMultiDrawElementsBaseVertexEXTPROC) (GLenum, const GLsizei *, GLenum, const void * const *, GLsizei, const GLint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawElementsBaseVertex_nglDrawElementsBaseVertexEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsBaseVertexEXTPROC glDrawElementsBaseVertexEXT = (glDrawElementsBaseVertexEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsBaseVertexEXT(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawElementsBaseVertex_nglDrawRangeElementsBaseVertexEXT(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawRangeElementsBaseVertexEXTPROC glDrawRangeElementsBaseVertexEXT = (glDrawRangeElementsBaseVertexEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawRangeElementsBaseVertexEXT(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawElementsBaseVertex_nglDrawElementsInstancedBaseVertexEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint basevertex, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedBaseVertexEXTPROC glDrawElementsInstancedBaseVertexEXT = (glDrawElementsInstancedBaseVertexEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedBaseVertexEXT(mode, count, type, indices, instancecount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawElementsBaseVertex_nglMultiDrawElementsBaseVertexEXT(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint primcount, jlong basevertexAddress, jlong __functionAddress) {
	const GLsizei *count = (const GLsizei *)(intptr_t)countAddress;
	const void * const *indices = (const void * const *)(intptr_t)indicesAddress;
	const GLint *basevertex = (const GLint *)(intptr_t)basevertexAddress;
	glMultiDrawElementsBaseVertexEXTPROC glMultiDrawElementsBaseVertexEXT = (glMultiDrawElementsBaseVertexEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawElementsBaseVertexEXT(mode, count, type, indices, primcount, basevertex);
}

EXTERN_C_EXIT
