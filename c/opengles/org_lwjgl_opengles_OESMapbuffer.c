/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void * (APIENTRY *glMapBufferOESPROC) (GLenum, GLenum);
typedef GLboolean (APIENTRY *glUnmapBufferOESPROC) (GLenum);
typedef void (APIENTRY *glGetBufferPointervOESPROC) (GLenum, GLenum, void **);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_OESMapbuffer_nglMapBufferOES(JNIEnv *__env, jclass clazz, jint target, jint access, jlong __functionAddress) {
	glMapBufferOESPROC glMapBufferOES = (glMapBufferOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glMapBufferOES(target, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_OESMapbuffer_nglUnmapBufferOES(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glUnmapBufferOESPROC glUnmapBufferOES = (glUnmapBufferOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glUnmapBufferOES(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESMapbuffer_nglGetBufferPointervOES(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	void **params = (void **)(intptr_t)paramsAddress;
	glGetBufferPointervOESPROC glGetBufferPointervOES = (glGetBufferPointervOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBufferPointervOES(target, pname, params);
}

EXTERN_C_EXIT
