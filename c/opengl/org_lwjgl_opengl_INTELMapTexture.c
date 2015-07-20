/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glSyncTextureINTELPROC) (GLuint);
typedef void (APIENTRY *glUnmapTexture2DINTELPROC) (GLuint, GLint);
typedef void * (APIENTRY *glMapTexture2DINTELPROC) (GLuint, GLint, GLbitfield, GLint *, GLenum *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELMapTexture_nglSyncTextureINTEL(JNIEnv *__env, jclass clazz, jint texture, jlong __functionAddress) {
	glSyncTextureINTELPROC glSyncTextureINTEL = (glSyncTextureINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSyncTextureINTEL(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELMapTexture_nglUnmapTexture2DINTEL(JNIEnv *__env, jclass clazz, jint texture, jint level, jlong __functionAddress) {
	glUnmapTexture2DINTELPROC glUnmapTexture2DINTEL = (glUnmapTexture2DINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUnmapTexture2DINTEL(texture, level);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_INTELMapTexture_nglMapTexture2DINTEL(JNIEnv *__env, jclass clazz, jint texture, jint level, jint access, jlong strideAddress, jlong layoutAddress, jlong __functionAddress) {
	GLint *stride = (GLint *)(intptr_t)strideAddress;
	GLenum *layout = (GLenum *)(intptr_t)layoutAddress;
	glMapTexture2DINTELPROC glMapTexture2DINTEL = (glMapTexture2DINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glMapTexture2DINTEL(texture, level, access, stride, layout);
}

EXTERN_C_EXIT
