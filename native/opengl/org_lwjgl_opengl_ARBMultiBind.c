/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glBindBuffersBasePROC) (GLenum, GLuint, GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glBindBuffersRangePROC) (GLenum, GLuint, GLsizei, const GLuint *, const GLintptr *, const GLsizeiptr *);
typedef GLvoid (APIENTRY *glBindTexturesPROC) (GLuint, GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glBindSamplersPROC) (GLuint, GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glBindImageTexturesPROC) (GLuint, GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glBindVertexBuffersPROC) (GLuint, GLsizei, const GLuint *, const GLintptr *, const GLsizei *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindBuffersBase(JNIEnv *__env, jclass clazz, jint target, jint first, jint count, jlong buffersAddress, jlong __functionAddress) {
	const GLuint *buffers = (const GLuint *)(intptr_t)buffersAddress;
	glBindBuffersBasePROC glBindBuffersBase = (glBindBuffersBasePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBuffersBase(target, first, count, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindBuffersRange(JNIEnv *__env, jclass clazz, jint target, jint first, jint count, jlong buffersAddress, jlong offsetsAddress, jlong sizesAddress, jlong __functionAddress) {
	const GLuint *buffers = (const GLuint *)(intptr_t)buffersAddress;
	const GLintptr *offsets = (const GLintptr *)(intptr_t)offsetsAddress;
	const GLsizeiptr *sizes = (const GLsizeiptr *)(intptr_t)sizesAddress;
	glBindBuffersRangePROC glBindBuffersRange = (glBindBuffersRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBuffersRange(target, first, count, buffers, offsets, sizes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindTextures(JNIEnv *__env, jclass clazz, jint first, jint count, jlong texturesAddress, jlong __functionAddress) {
	const GLuint *textures = (const GLuint *)(intptr_t)texturesAddress;
	glBindTexturesPROC glBindTextures = (glBindTexturesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindTextures(first, count, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindSamplers(JNIEnv *__env, jclass clazz, jint first, jint count, jlong samplersAddress, jlong __functionAddress) {
	const GLuint *samplers = (const GLuint *)(intptr_t)samplersAddress;
	glBindSamplersPROC glBindSamplers = (glBindSamplersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindSamplers(first, count, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindImageTextures(JNIEnv *__env, jclass clazz, jint first, jint count, jlong texturesAddress, jlong __functionAddress) {
	const GLuint *textures = (const GLuint *)(intptr_t)texturesAddress;
	glBindImageTexturesPROC glBindImageTextures = (glBindImageTexturesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindImageTextures(first, count, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindVertexBuffers(JNIEnv *__env, jclass clazz, jint first, jint count, jlong buffersAddress, jlong offsetsAddress, jlong stridesAddress, jlong __functionAddress) {
	const GLuint *buffers = (const GLuint *)(intptr_t)buffersAddress;
	const GLintptr *offsets = (const GLintptr *)(intptr_t)offsetsAddress;
	const GLsizei *strides = (const GLsizei *)(intptr_t)stridesAddress;
	glBindVertexBuffersPROC glBindVertexBuffers = (glBindVertexBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindVertexBuffers(first, count, buffers, offsets, strides);
}

EXTERN_C_EXIT
