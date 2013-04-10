/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glBindBufferPROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glDeleteBuffersPROC) (GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glGenBuffersPROC) (GLsizei, GLuint *);
typedef GLboolean (APIENTRY *glIsBufferPROC) (GLuint);
typedef GLvoid (APIENTRY *glBufferDataPROC) (GLenum, GLsizeiptr, const GLvoid *, GLenum);
typedef GLvoid (APIENTRY *glBufferSubDataPROC) (GLenum, GLintptr, GLsizeiptr, const GLvoid *);
typedef GLvoid (APIENTRY *glGetBufferSubDataPROC) (GLenum, GLintptr, GLsizeiptr, GLvoid *);
typedef GLvoid * (APIENTRY *glMapBufferPROC) (GLenum, GLenum);
typedef GLboolean (APIENTRY *glUnmapBufferPROC) (GLenum);
typedef GLvoid (APIENTRY *glGetBufferParameterivPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetBufferPointervPROC) (GLenum, GLenum, GLvoid **);
typedef GLvoid (APIENTRY *glGenQueriesPROC) (GLsizei, GLuint *);
typedef GLvoid (APIENTRY *glDeleteQueriesPROC) (GLsizei, const GLuint *);
typedef GLboolean (APIENTRY *glIsQueryPROC) (GLuint);
typedef GLvoid (APIENTRY *glBeginQueryPROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glEndQueryPROC) (GLenum);
typedef GLvoid (APIENTRY *glGetQueryivPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetQueryObjectivPROC) (GLuint, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetQueryObjectuivPROC) (GLuint, GLenum, GLuint *);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBindBuffer(JNIEnv *__env, jclass clazz, jint target, jint buffer, jlong __functionAddress) {
	glBindBufferPROC glBindBuffer = (glBindBufferPROC)(intptr_t)__functionAddress;
	glBindBuffer(target, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglDeleteBuffers(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress, jlong __functionAddress) {
	const GLuint *buffers = (const GLuint *)(intptr_t)buffersAddress;
	glDeleteBuffersPROC glDeleteBuffers = (glDeleteBuffersPROC)(intptr_t)__functionAddress;
	glDeleteBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGenBuffers(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress, jlong __functionAddress) {
	GLuint *buffers = (GLuint *)(intptr_t)buffersAddress;
	glGenBuffersPROC glGenBuffers = (glGenBuffersPROC)(intptr_t)__functionAddress;
	glGenBuffers(n, buffers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL15_nglIsBuffer(JNIEnv *__env, jclass clazz, jint buffer, jlong __functionAddress) {
	glIsBufferPROC glIsBuffer = (glIsBufferPROC)(intptr_t)__functionAddress;
	return (jboolean)glIsBuffer(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBufferData(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint usage, jlong __functionAddress) {
	const GLvoid *data = (const GLvoid *)(intptr_t)dataAddress;
	glBufferDataPROC glBufferData = (glBufferDataPROC)(intptr_t)__functionAddress;
	glBufferData(target, (GLsizeiptr)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBufferSubData(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress, jlong __functionAddress) {
	const GLvoid *data = (const GLvoid *)(intptr_t)dataAddress;
	glBufferSubDataPROC glBufferSubData = (glBufferSubDataPROC)(intptr_t)__functionAddress;
	glBufferSubData(target, (GLintptr)offset, (GLsizeiptr)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetBufferSubData(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress, jlong __functionAddress) {
	GLvoid *data = (GLvoid *)(intptr_t)dataAddress;
	glGetBufferSubDataPROC glGetBufferSubData = (glGetBufferSubDataPROC)(intptr_t)__functionAddress;
	glGetBufferSubData(target, (GLintptr)offset, (GLsizeiptr)size, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL15_nglMapBuffer(JNIEnv *__env, jclass clazz, jint target, jint access, jlong __functionAddress) {
	glMapBufferPROC glMapBuffer = (glMapBufferPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glMapBuffer(target, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL15_nglUnmapBuffer(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glUnmapBufferPROC glUnmapBuffer = (glUnmapBufferPROC)(intptr_t)__functionAddress;
	return (jboolean)glUnmapBuffer(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetBufferParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetBufferParameterivPROC glGetBufferParameteriv = (glGetBufferParameterivPROC)(intptr_t)__functionAddress;
	glGetBufferParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetBufferPointerv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLvoid **params = (GLvoid **)(intptr_t)paramsAddress;
	glGetBufferPointervPROC glGetBufferPointerv = (glGetBufferPointervPROC)(intptr_t)__functionAddress;
	glGetBufferPointerv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGenQueries(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	glGenQueriesPROC glGenQueries = (glGenQueriesPROC)(intptr_t)__functionAddress;
	glGenQueries(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglDeleteQueries(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDeleteQueriesPROC glDeleteQueries = (glDeleteQueriesPROC)(intptr_t)__functionAddress;
	glDeleteQueries(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL15_nglIsQuery(JNIEnv *__env, jclass clazz, jint id, jlong __functionAddress) {
	glIsQueryPROC glIsQuery = (glIsQueryPROC)(intptr_t)__functionAddress;
	return (jboolean)glIsQuery(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBeginQuery(JNIEnv *__env, jclass clazz, jint target, jint id, jlong __functionAddress) {
	glBeginQueryPROC glBeginQuery = (glBeginQueryPROC)(intptr_t)__functionAddress;
	glBeginQuery(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglEndQuery(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glEndQueryPROC glEndQuery = (glEndQueryPROC)(intptr_t)__functionAddress;
	glEndQuery(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetQueryiv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetQueryivPROC glGetQueryiv = (glGetQueryivPROC)(intptr_t)__functionAddress;
	glGetQueryiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetQueryObjectiv(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetQueryObjectivPROC glGetQueryObjectiv = (glGetQueryObjectivPROC)(intptr_t)__functionAddress;
	glGetQueryObjectiv(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetQueryObjectuiv(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetQueryObjectuivPROC glGetQueryObjectuiv = (glGetQueryObjectuivPROC)(intptr_t)__functionAddress;
	glGetQueryObjectuiv(id, pname, params);
}