/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glFramebufferSampleLocationsfvNVPROC) (GLenum, GLuint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glNamedFramebufferSampleLocationsfvNVPROC) (GLuint, GLuint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glResolveDepthValuesNVPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVSampleLocations_nglFramebufferSampleLocationsfvNV(JNIEnv *__env, jclass clazz, jint target, jint start, jint count, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glFramebufferSampleLocationsfvNVPROC glFramebufferSampleLocationsfvNV = (glFramebufferSampleLocationsfvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferSampleLocationsfvNV(target, start, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVSampleLocations_nglNamedFramebufferSampleLocationsfvNV(JNIEnv *__env, jclass clazz, jint framebuffer, jint start, jint count, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glNamedFramebufferSampleLocationsfvNVPROC glNamedFramebufferSampleLocationsfvNV = (glNamedFramebufferSampleLocationsfvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferSampleLocationsfvNV(framebuffer, start, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVSampleLocations_nglResolveDepthValuesNV(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glResolveDepthValuesNVPROC glResolveDepthValuesNV = (glResolveDepthValuesNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glResolveDepthValuesNV();
}

EXTERN_C_EXIT
