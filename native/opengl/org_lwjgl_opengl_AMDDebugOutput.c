/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glDebugMessageEnableAMDPROC) (GLenum, GLenum, GLsizei, const GLuint *, GLboolean);
typedef GLvoid (APIENTRY *glDebugMessageInsertAMDPROC) (GLenum, GLenum, GLuint, GLsizei, const GLchar *);
typedef GLvoid (APIENTRY *glDebugMessageCallbackAMDPROC) (GLDEBUGPROCAMD, void *);
typedef GLuint (APIENTRY *glGetDebugMessageLogAMDPROC) (GLuint, GLsizei, GLenum *, GLuint *, GLuint *, GLsizei *, GLchar *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglDebugMessageEnableAMD(JNIEnv *__env, jclass clazz, jint category, jint severity, jint count, jlong idsAddress, jboolean enabled, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDebugMessageEnableAMDPROC glDebugMessageEnableAMD = (glDebugMessageEnableAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageEnableAMD(category, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglDebugMessageInsertAMD(JNIEnv *__env, jclass clazz, jint category, jint severity, jint id, jint length, jlong bufAddress, jlong __functionAddress) {
	const GLchar *buf = (const GLchar *)(intptr_t)bufAddress;
	glDebugMessageInsertAMDPROC glDebugMessageInsertAMD = (glDebugMessageInsertAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageInsertAMD(category, severity, id, length, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglDebugMessageCallbackAMD(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress, jlong __functionAddress) {
	GLDEBUGPROCAMD callback = (GLDEBUGPROCAMD)(intptr_t)callbackAddress;
	void *userParam = (void *)(intptr_t)userParamAddress;
	glDebugMessageCallbackAMDPROC glDebugMessageCallbackAMD = (glDebugMessageCallbackAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageCallbackAMD(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglGetDebugMessageLogAMD(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong categoriesAddress, jlong severitiesAddress, jlong idsAddress, jlong lengthsAddress, jlong messageLogAddress, jlong __functionAddress) {
	GLenum *categories = (GLenum *)(intptr_t)categoriesAddress;
	GLuint *severities = (GLuint *)(intptr_t)severitiesAddress;
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	GLsizei *lengths = (GLsizei *)(intptr_t)lengthsAddress;
	GLchar *messageLog = (GLchar *)(intptr_t)messageLogAddress;
	glGetDebugMessageLogAMDPROC glGetDebugMessageLogAMD = (glGetDebugMessageLogAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetDebugMessageLogAMD(count, bufsize, categories, severities, ids, lengths, messageLog);
}

EXTERN_C_EXIT
