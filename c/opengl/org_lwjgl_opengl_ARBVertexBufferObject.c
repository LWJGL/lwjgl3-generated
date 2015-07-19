/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBindBufferARBPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDeleteBuffersARBPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glGenBuffersARBPROC) (GLsizei, GLuint *);
typedef GLboolean (APIENTRY *glIsBufferARBPROC) (GLuint);
typedef void (APIENTRY *glBufferDataARBPROC) (GLenum, GLsizeiptrARB, const void *, GLenum);
typedef void (APIENTRY *glBufferSubDataARBPROC) (GLenum, GLintptrARB, GLsizeiptrARB, const void *);
typedef void (APIENTRY *glGetBufferSubDataARBPROC) (GLenum, GLintptrARB, GLsizeiptrARB, void *);
typedef void * (APIENTRY *glMapBufferARBPROC) (GLenum, GLenum);
typedef GLboolean (APIENTRY *glUnmapBufferARBPROC) (GLenum);
typedef void (APIENTRY *glGetBufferParameterivARBPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetBufferPointervARBPROC) (GLenum, GLenum, void **);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglBindBufferARB(JNIEnv *__env, jclass clazz, jint target, jint buffer, jlong __functionAddress) {
	glBindBufferARBPROC glBindBufferARB = (glBindBufferARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBufferARB(target, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglDeleteBuffersARB(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress, jlong __functionAddress) {
	const GLuint *buffers = (const GLuint *)(intptr_t)buffersAddress;
	glDeleteBuffersARBPROC glDeleteBuffersARB = (glDeleteBuffersARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteBuffersARB(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglGenBuffersARB(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress, jlong __functionAddress) {
	GLuint *buffers = (GLuint *)(intptr_t)buffersAddress;
	glGenBuffersARBPROC glGenBuffersARB = (glGenBuffersARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenBuffersARB(n, buffers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglIsBufferARB(JNIEnv *__env, jclass clazz, jint buffer, jlong __functionAddress) {
	glIsBufferARBPROC glIsBufferARB = (glIsBufferARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsBufferARB(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglBufferDataARB(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint usage, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glBufferDataARBPROC glBufferDataARB = (glBufferDataARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBufferDataARB(target, (GLsizeiptrARB)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglBufferSubDataARB(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glBufferSubDataARBPROC glBufferSubDataARB = (glBufferSubDataARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBufferSubDataARB(target, (GLintptrARB)offset, (GLsizeiptrARB)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglGetBufferSubDataARB(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress, jlong __functionAddress) {
	void *data = (void *)(intptr_t)dataAddress;
	glGetBufferSubDataARBPROC glGetBufferSubDataARB = (glGetBufferSubDataARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBufferSubDataARB(target, (GLintptrARB)offset, (GLsizeiptrARB)size, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglMapBufferARB(JNIEnv *__env, jclass clazz, jint target, jint access, jlong __functionAddress) {
	glMapBufferARBPROC glMapBufferARB = (glMapBufferARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glMapBufferARB(target, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglUnmapBufferARB(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glUnmapBufferARBPROC glUnmapBufferARB = (glUnmapBufferARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glUnmapBufferARB(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglGetBufferParameterivARB(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetBufferParameterivARBPROC glGetBufferParameterivARB = (glGetBufferParameterivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBufferParameterivARB(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglGetBufferPointervARB(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	void **params = (void **)(intptr_t)paramsAddress;
	glGetBufferPointervARBPROC glGetBufferPointervARB = (glGetBufferPointervARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBufferPointervARB(target, pname, params);
}

EXTERN_C_EXIT
