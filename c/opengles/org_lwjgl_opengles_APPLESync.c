/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef GLsync (APIENTRY *glFenceSyncAPPLEPROC) (GLenum, GLbitfield);
typedef GLboolean (APIENTRY *glIsSyncAPPLEPROC) (GLsync);
typedef void (APIENTRY *glDeleteSyncAPPLEPROC) (GLsync);
typedef GLenum (APIENTRY *glClientWaitSyncAPPLEPROC) (GLsync, GLbitfield, GLuint64);
typedef void (APIENTRY *glWaitSyncAPPLEPROC) (GLsync, GLbitfield, GLuint64);
typedef void (APIENTRY *glGetInteger64vAPPLEPROC) (GLenum, GLint64 *);
typedef void (APIENTRY *glGetSyncivAPPLEPROC) (GLsync, GLenum, GLsizei, GLsizei *, GLint *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_APPLESync_nglFenceSyncAPPLE(JNIEnv *__env, jclass clazz, jint condition, jint flags, jlong __functionAddress) {
	glFenceSyncAPPLEPROC glFenceSyncAPPLE = (glFenceSyncAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glFenceSyncAPPLE(condition, flags);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_APPLESync_nglIsSyncAPPLE(JNIEnv *__env, jclass clazz, jlong syncAddress, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glIsSyncAPPLEPROC glIsSyncAPPLE = (glIsSyncAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsSyncAPPLE(sync);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLESync_nglDeleteSyncAPPLE(JNIEnv *__env, jclass clazz, jlong syncAddress, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glDeleteSyncAPPLEPROC glDeleteSyncAPPLE = (glDeleteSyncAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteSyncAPPLE(sync);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_APPLESync_nglClientWaitSyncAPPLE(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glClientWaitSyncAPPLEPROC glClientWaitSyncAPPLE = (glClientWaitSyncAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glClientWaitSyncAPPLE(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLESync_nglWaitSyncAPPLE(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glWaitSyncAPPLEPROC glWaitSyncAPPLE = (glWaitSyncAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWaitSyncAPPLE(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLESync_nglGetInteger64vAPPLE(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint64 *params = (GLint64 *)(intptr_t)paramsAddress;
	glGetInteger64vAPPLEPROC glGetInteger64vAPPLE = (glGetInteger64vAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetInteger64vAPPLE(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLESync_nglGetSyncivAPPLE(JNIEnv *__env, jclass clazz, jlong syncAddress, jint pname, jint bufSize, jlong lengthAddress, jlong valuesAddress, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLint *values = (GLint *)(intptr_t)valuesAddress;
	glGetSyncivAPPLEPROC glGetSyncivAPPLE = (glGetSyncivAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSyncivAPPLE(sync, pname, bufSize, length, values);
}

EXTERN_C_EXIT
