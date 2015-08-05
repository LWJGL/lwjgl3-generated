/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glDebugMessageControlKHRPROC) (GLenum, GLenum, GLenum, GLsizei, const GLuint *, GLboolean);
typedef void (APIENTRY *glDebugMessageInsertKHRPROC) (GLenum, GLenum, GLuint, GLenum, GLsizei, const GLchar *);
typedef void (APIENTRY *glDebugMessageCallbackKHRPROC) (GLDEBUGPROCKHR, const void *);
typedef GLuint (APIENTRY *glGetDebugMessageLogKHRPROC) (GLuint, GLsizei, GLenum *, GLenum *, GLuint *, GLenum *, GLsizei *, GLchar *);
typedef void (APIENTRY *glGetPointervKHRPROC) (GLenum, void **);
typedef void (APIENTRY *glPushDebugGroupKHRPROC) (GLenum, GLuint, GLsizei, const GLchar *);
typedef void (APIENTRY *glPopDebugGroupKHRPROC) (void);
typedef void (APIENTRY *glObjectLabelKHRPROC) (GLenum, GLuint, GLsizei, const GLchar *);
typedef void (APIENTRY *glGetObjectLabelKHRPROC) (GLenum, GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glObjectPtrLabelKHRPROC) (void *, GLsizei, const GLchar *);
typedef void (APIENTRY *glGetObjectPtrLabelKHRPROC) (void *, GLsizei, GLsizei *, GLchar *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglDebugMessageControlKHR(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDebugMessageControlKHRPROC glDebugMessageControlKHR = (glDebugMessageControlKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageControlKHR(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglDebugMessageInsertKHR(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong messageAddress, jlong __functionAddress) {
	const GLchar *message = (const GLchar *)(intptr_t)messageAddress;
	glDebugMessageInsertKHRPROC glDebugMessageInsertKHR = (glDebugMessageInsertKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageInsertKHR(source, type, id, severity, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglDebugMessageCallbackKHR(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress, jlong __functionAddress) {
	GLDEBUGPROCKHR callback = (GLDEBUGPROCKHR)(intptr_t)callbackAddress;
	const void *userParam = (const void *)(intptr_t)userParamAddress;
	glDebugMessageCallbackKHRPROC glDebugMessageCallbackKHR = (glDebugMessageCallbackKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageCallbackKHR(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetDebugMessageLogKHR(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress, jlong __functionAddress) {
	GLenum *sources = (GLenum *)(intptr_t)sourcesAddress;
	GLenum *types = (GLenum *)(intptr_t)typesAddress;
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	GLenum *severities = (GLenum *)(intptr_t)severitiesAddress;
	GLsizei *lengths = (GLsizei *)(intptr_t)lengthsAddress;
	GLchar *messageLog = (GLchar *)(intptr_t)messageLogAddress;
	glGetDebugMessageLogKHRPROC glGetDebugMessageLogKHR = (glGetDebugMessageLogKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetDebugMessageLogKHR(count, bufsize, sources, types, ids, severities, lengths, messageLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetPointervKHR(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	void **params = (void **)(intptr_t)paramsAddress;
	glGetPointervKHRPROC glGetPointervKHR = (glGetPointervKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPointervKHR(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglPushDebugGroupKHR(JNIEnv *__env, jclass clazz, jint source, jint id, jint length, jlong messageAddress, jlong __functionAddress) {
	const GLchar *message = (const GLchar *)(intptr_t)messageAddress;
	glPushDebugGroupKHRPROC glPushDebugGroupKHR = (glPushDebugGroupKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPushDebugGroupKHR(source, id, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglPopDebugGroupKHR(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPopDebugGroupKHRPROC glPopDebugGroupKHR = (glPopDebugGroupKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPopDebugGroupKHR();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglObjectLabelKHR(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint length, jlong labelAddress, jlong __functionAddress) {
	const GLchar *label = (const GLchar *)(intptr_t)labelAddress;
	glObjectLabelKHRPROC glObjectLabelKHR = (glObjectLabelKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glObjectLabelKHR(identifier, name, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetObjectLabelKHR(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint bufSize, jlong lengthAddress, jlong labelAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *label = (GLchar *)(intptr_t)labelAddress;
	glGetObjectLabelKHRPROC glGetObjectLabelKHR = (glGetObjectLabelKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetObjectLabelKHR(identifier, name, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglObjectPtrLabelKHR(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint length, jlong labelAddress, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	const GLchar *label = (const GLchar *)(intptr_t)labelAddress;
	glObjectPtrLabelKHRPROC glObjectPtrLabelKHR = (glObjectPtrLabelKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glObjectPtrLabelKHR(ptr, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetObjectPtrLabelKHR(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint bufSize, jlong lengthAddress, jlong labelAddress, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *label = (GLchar *)(intptr_t)labelAddress;
	glGetObjectPtrLabelKHRPROC glGetObjectPtrLabelKHR = (glGetObjectPtrLabelKHRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetObjectPtrLabelKHR(ptr, bufSize, length, label);
}

EXTERN_C_EXIT
