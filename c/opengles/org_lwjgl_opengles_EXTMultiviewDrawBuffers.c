/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glReadBufferIndexedEXTPROC) (GLenum, GLint);
typedef void (APIENTRY *glDrawBuffersIndexedEXTPROC) (GLint, const GLenum *, const GLint *);
typedef void (APIENTRY *glGetIntegeri_vEXTPROC) (GLenum, GLuint, GLint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiviewDrawBuffers_nglReadBufferIndexedEXT(JNIEnv *__env, jclass clazz, jint src, jint index, jlong __functionAddress) {
	glReadBufferIndexedEXTPROC glReadBufferIndexedEXT = (glReadBufferIndexedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReadBufferIndexedEXT(src, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiviewDrawBuffers_nglDrawBuffersIndexedEXT(JNIEnv *__env, jclass clazz, jint n, jlong locationAddress, jlong indicesAddress, jlong __functionAddress) {
	const GLenum *location = (const GLenum *)(intptr_t)locationAddress;
	const GLint *indices = (const GLint *)(intptr_t)indicesAddress;
	glDrawBuffersIndexedEXTPROC glDrawBuffersIndexedEXT = (glDrawBuffersIndexedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawBuffersIndexedEXT(n, location, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiviewDrawBuffers_nglGetIntegeri_1vEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetIntegeri_vEXTPROC glGetIntegeri_vEXT = (glGetIntegeri_vEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetIntegeri_vEXT(target, index, data);
}

EXTERN_C_EXIT
