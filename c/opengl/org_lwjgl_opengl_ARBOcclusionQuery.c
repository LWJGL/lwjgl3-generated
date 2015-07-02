/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glGenQueriesARBPROC) (GLsizei, GLuint *);
typedef GLvoid (APIENTRY *glDeleteQueriesARBPROC) (GLsizei, const GLuint *);
typedef GLboolean (APIENTRY *glIsQueryARBPROC) (GLuint);
typedef GLvoid (APIENTRY *glBeginQueryARBPROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glEndQueryARBPROC) (GLenum);
typedef GLvoid (APIENTRY *glGetQueryivARBPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetQueryObjectivARBPROC) (GLuint, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetQueryObjectuivARBPROC) (GLuint, GLenum, GLuint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBOcclusionQuery_nglGenQueriesARB(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	glGenQueriesARBPROC glGenQueriesARB = (glGenQueriesARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenQueriesARB(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBOcclusionQuery_nglDeleteQueriesARB(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDeleteQueriesARBPROC glDeleteQueriesARB = (glDeleteQueriesARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteQueriesARB(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBOcclusionQuery_nglIsQueryARB(JNIEnv *__env, jclass clazz, jint id, jlong __functionAddress) {
	glIsQueryARBPROC glIsQueryARB = (glIsQueryARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsQueryARB(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBOcclusionQuery_nglBeginQueryARB(JNIEnv *__env, jclass clazz, jint target, jint id, jlong __functionAddress) {
	glBeginQueryARBPROC glBeginQueryARB = (glBeginQueryARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginQueryARB(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBOcclusionQuery_nglEndQueryARB(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glEndQueryARBPROC glEndQueryARB = (glEndQueryARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndQueryARB(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBOcclusionQuery_nglGetQueryivARB(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetQueryivARBPROC glGetQueryivARB = (glGetQueryivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryivARB(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBOcclusionQuery_nglGetQueryObjectivARB(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetQueryObjectivARBPROC glGetQueryObjectivARB = (glGetQueryObjectivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjectivARB(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBOcclusionQuery_nglGetQueryObjectuivARB(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetQueryObjectuivARBPROC glGetQueryObjectuivARB = (glGetQueryObjectuivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjectuivARB(id, pname, params);
}

EXTERN_C_EXIT
