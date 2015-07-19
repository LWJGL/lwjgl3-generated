/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBindBufferPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDeleteBuffersPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glGenBuffersPROC) (GLsizei, GLuint *);
typedef GLboolean (APIENTRY *glIsBufferPROC) (GLuint);
typedef void (APIENTRY *glBufferDataPROC) (GLenum, GLsizeiptr, const void *, GLenum);
typedef void (APIENTRY *glBufferSubDataPROC) (GLenum, GLintptr, GLsizeiptr, const void *);
typedef void (APIENTRY *glGetBufferSubDataPROC) (GLenum, GLintptr, GLsizeiptr, void *);
typedef void * (APIENTRY *glMapBufferPROC) (GLenum, GLenum);
typedef GLboolean (APIENTRY *glUnmapBufferPROC) (GLenum);
typedef void (APIENTRY *glGetBufferParameterivPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetBufferPointervPROC) (GLenum, GLenum, void **);
typedef void (APIENTRY *glGenQueriesPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glDeleteQueriesPROC) (GLsizei, const GLuint *);
typedef GLboolean (APIENTRY *glIsQueryPROC) (GLuint);
typedef void (APIENTRY *glBeginQueryPROC) (GLenum, GLuint);
typedef void (APIENTRY *glEndQueryPROC) (GLenum);
typedef void (APIENTRY *glGetQueryivPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetQueryObjectivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetQueryObjectuivPROC) (GLuint, GLenum, GLuint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBindBuffer(JNIEnv *__env, jclass clazz, jint target, jint buffer, jlong __functionAddress) {
	glBindBufferPROC glBindBuffer = (glBindBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBuffer(target, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglDeleteBuffers(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress, jlong __functionAddress) {
	const GLuint *buffers = (const GLuint *)(intptr_t)buffersAddress;
	glDeleteBuffersPROC glDeleteBuffers = (glDeleteBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGenBuffers(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress, jlong __functionAddress) {
	GLuint *buffers = (GLuint *)(intptr_t)buffersAddress;
	glGenBuffersPROC glGenBuffers = (glGenBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenBuffers(n, buffers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL15_nglIsBuffer(JNIEnv *__env, jclass clazz, jint buffer, jlong __functionAddress) {
	glIsBufferPROC glIsBuffer = (glIsBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsBuffer(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBufferData(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint usage, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glBufferDataPROC glBufferData = (glBufferDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBufferData(target, (GLsizeiptr)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBufferSubData(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glBufferSubDataPROC glBufferSubData = (glBufferSubDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBufferSubData(target, (GLintptr)offset, (GLsizeiptr)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetBufferSubData(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress, jlong __functionAddress) {
	void *data = (void *)(intptr_t)dataAddress;
	glGetBufferSubDataPROC glGetBufferSubData = (glGetBufferSubDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBufferSubData(target, (GLintptr)offset, (GLsizeiptr)size, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL15_nglMapBuffer(JNIEnv *__env, jclass clazz, jint target, jint access, jlong __functionAddress) {
	glMapBufferPROC glMapBuffer = (glMapBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glMapBuffer(target, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL15_nglUnmapBuffer(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glUnmapBufferPROC glUnmapBuffer = (glUnmapBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glUnmapBuffer(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetBufferParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetBufferParameterivPROC glGetBufferParameteriv = (glGetBufferParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBufferParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetBufferPointerv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	void **params = (void **)(intptr_t)paramsAddress;
	glGetBufferPointervPROC glGetBufferPointerv = (glGetBufferPointervPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBufferPointerv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGenQueries(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	glGenQueriesPROC glGenQueries = (glGenQueriesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenQueries(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglDeleteQueries(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDeleteQueriesPROC glDeleteQueries = (glDeleteQueriesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteQueries(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL15_nglIsQuery(JNIEnv *__env, jclass clazz, jint id, jlong __functionAddress) {
	glIsQueryPROC glIsQuery = (glIsQueryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsQuery(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBeginQuery(JNIEnv *__env, jclass clazz, jint target, jint id, jlong __functionAddress) {
	glBeginQueryPROC glBeginQuery = (glBeginQueryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginQuery(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglEndQuery(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glEndQueryPROC glEndQuery = (glEndQueryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndQuery(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetQueryiv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetQueryivPROC glGetQueryiv = (glGetQueryivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetQueryObjectiv(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetQueryObjectivPROC glGetQueryObjectiv = (glGetQueryObjectivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjectiv(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetQueryObjectuiv(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetQueryObjectuivPROC glGetQueryObjectuiv = (glGetQueryObjectuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjectuiv(id, pname, params);
}

EXTERN_C_EXIT
