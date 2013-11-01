/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glDrawElementsBaseVertexPROC) (GLenum, GLsizei, GLenum, const GLvoid *, GLint);
typedef GLvoid (APIENTRY *glDrawRangeElementsBaseVertexPROC) (GLenum, GLuint, GLuint, GLsizei, GLenum, const GLvoid *, GLint);
typedef GLvoid (APIENTRY *glDrawElementsInstancedBaseVertexPROC) (GLenum, GLsizei, GLenum, const GLvoid *, GLsizei, GLint);
typedef GLvoid (APIENTRY *glMultiDrawElementsBaseVertexPROC) (GLenum, const GLsizei *, GLenum, const GLvoid **, GLsizei, GLint *);
typedef GLvoid (APIENTRY *glProvokingVertexPROC) (GLenum);
typedef GLvoid (APIENTRY *glTexImage2DMultisamplePROC) (GLenum, GLsizei, GLint, GLsizei, GLsizei, GLboolean);
typedef GLvoid (APIENTRY *glTexImage3DMultisamplePROC) (GLenum, GLsizei, GLint, GLsizei, GLsizei, GLsizei, GLboolean);
typedef GLvoid (APIENTRY *glGetMultisamplefvPROC) (GLenum, GLuint, GLfloat *);
typedef GLvoid (APIENTRY *glSampleMaskiPROC) (GLuint, GLbitfield);
typedef GLvoid (APIENTRY *glFramebufferTexturePROC) (GLenum, GLenum, GLuint, GLint);
typedef GLsync (APIENTRY *glFenceSyncPROC) (GLenum, GLbitfield);
typedef GLboolean (APIENTRY *glIsSyncPROC) (GLsync);
typedef GLvoid (APIENTRY *glDeleteSyncPROC) (GLsync);
typedef GLenum (APIENTRY *glClientWaitSyncPROC) (GLsync, GLbitfield, GLuint64);
typedef GLvoid (APIENTRY *glWaitSyncPROC) (GLsync, GLbitfield, GLuint64);
typedef GLvoid (APIENTRY *glGetInteger64vPROC) (GLenum, GLint64 *);
typedef GLvoid (APIENTRY *glGetSyncivPROC) (GLsync, GLenum, GLsizei, GLsizei *, GLint *);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglDrawElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex, jlong __functionAddress) {
	const GLvoid *indices = (const GLvoid *)(intptr_t)indicesAddress;
	glDrawElementsBaseVertexPROC glDrawElementsBaseVertex = (glDrawElementsBaseVertexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglDrawRangeElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex, jlong __functionAddress) {
	const GLvoid *indices = (const GLvoid *)(intptr_t)indicesAddress;
	glDrawRangeElementsBaseVertexPROC glDrawRangeElementsBaseVertex = (glDrawRangeElementsBaseVertexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglDrawElementsInstancedBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint basevertex, jlong __functionAddress) {
	const GLvoid *indices = (const GLvoid *)(intptr_t)indicesAddress;
	glDrawElementsInstancedBaseVertexPROC glDrawElementsInstancedBaseVertex = (glDrawElementsInstancedBaseVertexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglMultiDrawElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint primcount, jlong basevertexAddress, jlong __functionAddress) {
	const GLsizei *count = (const GLsizei *)(intptr_t)countAddress;
	const GLvoid **indices = (const GLvoid **)(intptr_t)indicesAddress;
	GLint *basevertex = (GLint *)(intptr_t)basevertexAddress;
	glMultiDrawElementsBaseVertexPROC glMultiDrawElementsBaseVertex = (glMultiDrawElementsBaseVertexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawElementsBaseVertex(mode, count, type, indices, primcount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglProvokingVertex(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glProvokingVertexPROC glProvokingVertex = (glProvokingVertexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProvokingVertex(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglTexImage2DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations, jlong __functionAddress) {
	glTexImage2DMultisamplePROC glTexImage2DMultisample = (glTexImage2DMultisamplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglTexImage3DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations, jlong __functionAddress) {
	glTexImage3DMultisamplePROC glTexImage3DMultisample = (glTexImage3DMultisamplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglGetMultisamplefv(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong valAddress, jlong __functionAddress) {
	GLfloat *val = (GLfloat *)(intptr_t)valAddress;
	glGetMultisamplefvPROC glGetMultisamplefv = (glGetMultisamplefvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultisamplefv(pname, index, val);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglSampleMaski(JNIEnv *__env, jclass clazz, jint index, jint mask, jlong __functionAddress) {
	glSampleMaskiPROC glSampleMaski = (glSampleMaskiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSampleMaski(index, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglFramebufferTexture(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jlong __functionAddress) {
	glFramebufferTexturePROC glFramebufferTexture = (glFramebufferTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture(target, attachment, texture, level);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL32_nglFenceSync(JNIEnv *__env, jclass clazz, jint condition, jint flags, jlong __functionAddress) {
	glFenceSyncPROC glFenceSync = (glFenceSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glFenceSync(condition, flags);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL32_nglIsSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glIsSyncPROC glIsSync = (glIsSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsSync(sync);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglDeleteSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glDeleteSyncPROC glDeleteSync = (glDeleteSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteSync(sync);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL32_nglClientWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glClientWaitSyncPROC glClientWaitSync = (glClientWaitSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glClientWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glWaitSyncPROC glWaitSync = (glWaitSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglGetInteger64v(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint64 *params = (GLint64 *)(intptr_t)paramsAddress;
	glGetInteger64vPROC glGetInteger64v = (glGetInteger64vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetInteger64v(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglGetSynciv(JNIEnv *__env, jclass clazz, jlong syncAddress, jint pname, jint bufSize, jlong lengthAddress, jlong valuesAddress, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLint *values = (GLint *)(intptr_t)valuesAddress;
	glGetSyncivPROC glGetSynciv = (glGetSyncivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSynciv(sync, pname, bufSize, length, values);
}
