/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glTexStorage1DPROC) (GLenum, GLsizei, GLenum, GLsizei);
typedef GLvoid (APIENTRY *glTexStorage2DPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glTexStorage3DPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glDrawTransformFeedbackInstancedPROC) (GLenum, GLuint, GLsizei);
typedef GLvoid (APIENTRY *glDrawTransformFeedbackStreamInstancedPROC) (GLenum, GLuint, GLuint, GLsizei);
typedef GLvoid (APIENTRY *glDrawArraysInstancedBaseInstancePROC) (GLenum, GLint, GLsizei, GLsizei, GLuint);
typedef GLvoid (APIENTRY *glDrawElementsInstancedBaseInstancePROC) (GLenum, GLsizei, GLenum, const GLvoid *, GLsizei, GLuint);
typedef GLvoid (APIENTRY *glDrawElementsInstancedBaseVertexBaseInstancePROC) (GLenum, GLsizei, GLenum, const GLvoid *, GLsizei, GLint, GLuint);
typedef GLvoid (APIENTRY *glBindImageTexturePROC) (GLuint, GLuint, GLint, GLboolean, GLint, GLenum, GLenum);
typedef GLvoid (APIENTRY *glMemoryBarrierPROC) (GLbitfield);
typedef GLvoid (APIENTRY *glGetInternalformativPROC) (GLenum, GLenum, GLenum, GLsizei, GLint *);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglTexStorage1D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jlong __functionAddress) {
	glTexStorage1DPROC glTexStorage1D = (glTexStorage1DPROC)(intptr_t)__functionAddress;
	glTexStorage1D(target, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglTexStorage2D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glTexStorage2DPROC glTexStorage2D = (glTexStorage2DPROC)(intptr_t)__functionAddress;
	glTexStorage2D(target, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglTexStorage3D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jint depth, jlong __functionAddress) {
	glTexStorage3DPROC glTexStorage3D = (glTexStorage3DPROC)(intptr_t)__functionAddress;
	glTexStorage3D(target, levels, internalformat, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglDrawTransformFeedbackInstanced(JNIEnv *__env, jclass clazz, jint mode, jint id, jint primcount, jlong __functionAddress) {
	glDrawTransformFeedbackInstancedPROC glDrawTransformFeedbackInstanced = (glDrawTransformFeedbackInstancedPROC)(intptr_t)__functionAddress;
	glDrawTransformFeedbackInstanced(mode, id, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglDrawTransformFeedbackStreamInstanced(JNIEnv *__env, jclass clazz, jint mode, jint id, jint stream, jint primcount, jlong __functionAddress) {
	glDrawTransformFeedbackStreamInstancedPROC glDrawTransformFeedbackStreamInstanced = (glDrawTransformFeedbackStreamInstancedPROC)(intptr_t)__functionAddress;
	glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglDrawArraysInstancedBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount, jint baseinstance, jlong __functionAddress) {
	glDrawArraysInstancedBaseInstancePROC glDrawArraysInstancedBaseInstance = (glDrawArraysInstancedBaseInstancePROC)(intptr_t)__functionAddress;
	glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglDrawElementsInstancedBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint baseinstance, jlong __functionAddress) {
	const GLvoid *indices = (const GLvoid *)(intptr_t)indicesAddress;
	glDrawElementsInstancedBaseInstancePROC glDrawElementsInstancedBaseInstance = (glDrawElementsInstancedBaseInstancePROC)(intptr_t)__functionAddress;
	glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglDrawElementsInstancedBaseVertexBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint basevertex, jint baseinstance, jlong __functionAddress) {
	const GLvoid *indices = (const GLvoid *)(intptr_t)indicesAddress;
	glDrawElementsInstancedBaseVertexBaseInstancePROC glDrawElementsInstancedBaseVertexBaseInstance = (glDrawElementsInstancedBaseVertexBaseInstancePROC)(intptr_t)__functionAddress;
	glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglBindImageTexture(JNIEnv *__env, jclass clazz, jint unit, jint texture, jint level, jboolean layered, jint layer, jint access, jint format, jlong __functionAddress) {
	glBindImageTexturePROC glBindImageTexture = (glBindImageTexturePROC)(intptr_t)__functionAddress;
	glBindImageTexture(unit, texture, level, layered, layer, access, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglMemoryBarrier(JNIEnv *__env, jclass clazz, jint barriers, jlong __functionAddress) {
	glMemoryBarrierPROC glMemoryBarrier = (glMemoryBarrierPROC)(intptr_t)__functionAddress;
	glMemoryBarrier(barriers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42_nglGetInternalformativ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint pname, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetInternalformativPROC glGetInternalformativ = (glGetInternalformativPROC)(intptr_t)__functionAddress;
	glGetInternalformativ(target, internalformat, pname, bufSize, params);
}