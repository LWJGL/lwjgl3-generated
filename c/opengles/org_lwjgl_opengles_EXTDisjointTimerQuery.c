/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glGenQueriesEXTPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glDeleteQueriesEXTPROC) (GLsizei, const GLuint *);
typedef GLboolean (APIENTRY *glIsQueryEXTPROC) (GLuint);
typedef void (APIENTRY *glBeginQueryEXTPROC) (GLenum, GLuint);
typedef void (APIENTRY *glEndQueryEXTPROC) (GLenum);
typedef void (APIENTRY *glQueryCounterEXTPROC) (GLuint, GLenum);
typedef void (APIENTRY *glGetQueryivEXTPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetQueryObjectivEXTPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetQueryObjectuivEXTPROC) (GLuint, GLenum, GLuint *);
typedef void (APIENTRY *glGetQueryObjecti64vEXTPROC) (GLuint, GLenum, GLint64 *);
typedef void (APIENTRY *glGetQueryObjectui64vEXTPROC) (GLuint, GLenum, GLuint64 *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGenQueriesEXT(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	glGenQueriesEXTPROC glGenQueriesEXT = (glGenQueriesEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenQueriesEXT(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglDeleteQueriesEXT(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDeleteQueriesEXTPROC glDeleteQueriesEXT = (glDeleteQueriesEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteQueriesEXT(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglIsQueryEXT(JNIEnv *__env, jclass clazz, jint id, jlong __functionAddress) {
	glIsQueryEXTPROC glIsQueryEXT = (glIsQueryEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsQueryEXT(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglBeginQueryEXT(JNIEnv *__env, jclass clazz, jint target, jint id, jlong __functionAddress) {
	glBeginQueryEXTPROC glBeginQueryEXT = (glBeginQueryEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginQueryEXT(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglEndQueryEXT(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glEndQueryEXTPROC glEndQueryEXT = (glEndQueryEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndQueryEXT(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglQueryCounterEXT(JNIEnv *__env, jclass clazz, jint id, jint target, jlong __functionAddress) {
	glQueryCounterEXTPROC glQueryCounterEXT = (glQueryCounterEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glQueryCounterEXT(id, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryivEXT(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetQueryivEXTPROC glGetQueryivEXT = (glGetQueryivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryObjectivEXT(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetQueryObjectivEXTPROC glGetQueryObjectivEXT = (glGetQueryObjectivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjectivEXT(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryObjectuivEXT(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetQueryObjectuivEXTPROC glGetQueryObjectuivEXT = (glGetQueryObjectuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjectuivEXT(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryObjecti64vEXT(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint64 *params = (GLint64 *)(intptr_t)paramsAddress;
	glGetQueryObjecti64vEXTPROC glGetQueryObjecti64vEXT = (glGetQueryObjecti64vEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjecti64vEXT(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryObjectui64vEXT(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint64 *params = (GLuint64 *)(intptr_t)paramsAddress;
	glGetQueryObjectui64vEXTPROC glGetQueryObjectui64vEXT = (glGetQueryObjectui64vEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjectui64vEXT(id, pname, params);
}

EXTERN_C_EXIT
