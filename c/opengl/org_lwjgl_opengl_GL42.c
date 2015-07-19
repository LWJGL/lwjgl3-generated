/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glGetActiveAtomicCounterBufferivPROC) (GLuint, GLuint, GLenum, GLint *);
typedef void (APIENTRY *glTexStorage1DPROC) (GLenum, GLsizei, GLenum, GLsizei);
typedef void (APIENTRY *glTexStorage2DPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glTexStorage3DPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei);
typedef void (APIENTRY *glDrawTransformFeedbackInstancedPROC) (GLenum, GLuint, GLsizei);
typedef void (APIENTRY *glDrawTransformFeedbackStreamInstancedPROC) (GLenum, GLuint, GLuint, GLsizei);
typedef void (APIENTRY *glDrawArraysInstancedBaseInstancePROC) (GLenum, GLint, GLsizei, GLsizei, GLuint);
typedef void (APIENTRY *glDrawElementsInstancedBaseInstancePROC) (GLenum, GLsizei, GLenum, const void *, GLsizei, GLuint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexBaseInstancePROC) (GLenum, GLsizei, GLenum, const void *, GLsizei, GLint, GLuint);
typedef void (APIENTRY *glBindImageTexturePROC) (GLuint, GLuint, GLint, GLboolean, GLint, GLenum, GLenum);
typedef void (APIENTRY *glMemoryBarrierPROC) (GLbitfield);
typedef void (APIENTRY *glGetInternalformativPROC) (GLenum, GLenum, GLenum, GLsizei, GLint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglGetActiveAtomicCounterBufferiv(JNIEnv *__env, jclass clazz, jint program, jint bufferIndex, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetActiveAtomicCounterBufferivPROC glGetActiveAtomicCounterBufferiv = (glGetActiveAtomicCounterBufferivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglTexStorage1D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jlong __functionAddress) {
	glTexStorage1DPROC glTexStorage1D = (glTexStorage1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorage1D(target, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglTexStorage2D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glTexStorage2DPROC glTexStorage2D = (glTexStorage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorage2D(target, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglTexStorage3D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jint depth, jlong __functionAddress) {
	glTexStorage3DPROC glTexStorage3D = (glTexStorage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorage3D(target, levels, internalformat, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglDrawTransformFeedbackInstanced(JNIEnv *__env, jclass clazz, jint mode, jint id, jint primcount, jlong __functionAddress) {
	glDrawTransformFeedbackInstancedPROC glDrawTransformFeedbackInstanced = (glDrawTransformFeedbackInstancedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawTransformFeedbackInstanced(mode, id, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglDrawTransformFeedbackStreamInstanced(JNIEnv *__env, jclass clazz, jint mode, jint id, jint stream, jint primcount, jlong __functionAddress) {
	glDrawTransformFeedbackStreamInstancedPROC glDrawTransformFeedbackStreamInstanced = (glDrawTransformFeedbackStreamInstancedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglDrawArraysInstancedBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount, jint baseinstance, jlong __functionAddress) {
	glDrawArraysInstancedBaseInstancePROC glDrawArraysInstancedBaseInstance = (glDrawArraysInstancedBaseInstancePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglDrawElementsInstancedBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint baseinstance, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedBaseInstancePROC glDrawElementsInstancedBaseInstance = (glDrawElementsInstancedBaseInstancePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglDrawElementsInstancedBaseVertexBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint basevertex, jint baseinstance, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedBaseVertexBaseInstancePROC glDrawElementsInstancedBaseVertexBaseInstance = (glDrawElementsInstancedBaseVertexBaseInstancePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglBindImageTexture(JNIEnv *__env, jclass clazz, jint unit, jint texture, jint level, jboolean layered, jint layer, jint access, jint format, jlong __functionAddress) {
	glBindImageTexturePROC glBindImageTexture = (glBindImageTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindImageTexture(unit, texture, level, layered, layer, access, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglMemoryBarrier(JNIEnv *__env, jclass clazz, jint barriers, jlong __functionAddress) {
	glMemoryBarrierPROC glMemoryBarrier = (glMemoryBarrierPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMemoryBarrier(barriers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglGetInternalformativ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint pname, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetInternalformativPROC glGetInternalformativ = (glGetInternalformativPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetInternalformativ(target, internalformat, pname, bufSize, params);
}

EXTERN_C_EXIT
