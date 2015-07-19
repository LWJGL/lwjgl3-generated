/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBufferPageCommitmentARBPROC) (GLenum, GLintptr, GLsizeiptr, GLboolean);
typedef void (APIENTRY *glNamedBufferPageCommitmentEXTPROC) (GLuint, GLintptr, GLsizeiptr, GLboolean);
typedef void (APIENTRY *glNamedBufferPageCommitmentARBPROC) (GLuint, GLintptr, GLsizeiptr, GLboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSparseBuffer_nglBufferPageCommitmentARB(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jboolean commit, jlong __functionAddress) {
	glBufferPageCommitmentARBPROC glBufferPageCommitmentARB = (glBufferPageCommitmentARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBufferPageCommitmentARB(target, (GLintptr)offset, (GLsizeiptr)size, commit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSparseBuffer_nglNamedBufferPageCommitmentEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jboolean commit, jlong __functionAddress) {
	glNamedBufferPageCommitmentEXTPROC glNamedBufferPageCommitmentEXT = (glNamedBufferPageCommitmentEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedBufferPageCommitmentEXT(buffer, (GLintptr)offset, (GLsizeiptr)size, commit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSparseBuffer_nglNamedBufferPageCommitmentARB(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jboolean commit, jlong __functionAddress) {
	glNamedBufferPageCommitmentARBPROC glNamedBufferPageCommitmentARB = (glNamedBufferPageCommitmentARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedBufferPageCommitmentARB(buffer, (GLintptr)offset, (GLsizeiptr)size, commit);
}

EXTERN_C_EXIT
