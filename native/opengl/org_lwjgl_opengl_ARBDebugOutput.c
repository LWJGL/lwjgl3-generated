/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glDebugMessageControlARBPROC) (GLenum, GLenum, GLenum, GLsizei, const GLuint *, GLboolean);
typedef GLvoid (APIENTRY *glDebugMessageInsertARBPROC) (GLenum, GLenum, GLuint, GLenum, GLsizei, const GLchar *);
typedef GLvoid (APIENTRY *glDebugMessageCallbackARBPROC) (GLDEBUGPROCARB, const void *);
typedef GLuint (APIENTRY *glGetDebugMessageLogARBPROC) (GLuint, GLsizei, GLenum *, GLenum *, GLuint *, GLenum *, GLsizei *, GLchar *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglDebugMessageControlARB(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDebugMessageControlARBPROC glDebugMessageControlARB = (glDebugMessageControlARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageControlARB(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglDebugMessageInsertARB(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong bufAddress, jlong __functionAddress) {
	const GLchar *buf = (const GLchar *)(intptr_t)bufAddress;
	glDebugMessageInsertARBPROC glDebugMessageInsertARB = (glDebugMessageInsertARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageInsertARB(source, type, id, severity, length, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglDebugMessageCallbackARB(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress, jlong __functionAddress) {
	GLDEBUGPROCARB callback = (GLDEBUGPROCARB)(intptr_t)callbackAddress;
	const void *userParam = (const void *)(intptr_t)userParamAddress;
	glDebugMessageCallbackARBPROC glDebugMessageCallbackARB = (glDebugMessageCallbackARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageCallbackARB(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglGetDebugMessageLogARB(JNIEnv *__env, jclass clazz, jint count, jint bufSize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress, jlong __functionAddress) {
	GLenum *sources = (GLenum *)(intptr_t)sourcesAddress;
	GLenum *types = (GLenum *)(intptr_t)typesAddress;
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	GLenum *severities = (GLenum *)(intptr_t)severitiesAddress;
	GLsizei *lengths = (GLsizei *)(intptr_t)lengthsAddress;
	GLchar *messageLog = (GLchar *)(intptr_t)messageLogAddress;
	glGetDebugMessageLogARBPROC glGetDebugMessageLogARB = (glGetDebugMessageLogARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetDebugMessageLogARB(count, bufSize, sources, types, ids, severities, lengths, messageLog);
}

EXTERN_C_EXIT
