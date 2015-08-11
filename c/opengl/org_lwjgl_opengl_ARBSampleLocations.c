/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glFramebufferSampleLocationsfvARBPROC) (GLenum, GLuint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glNamedFramebufferSampleLocationsfvARBPROC) (GLuint, GLuint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glEvaluateDepthValuesARBPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSampleLocations_nglFramebufferSampleLocationsfvARB(JNIEnv *__env, jclass clazz, jint target, jint start, jint count, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glFramebufferSampleLocationsfvARBPROC glFramebufferSampleLocationsfvARB = (glFramebufferSampleLocationsfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferSampleLocationsfvARB(target, start, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSampleLocations_nglNamedFramebufferSampleLocationsfvARB(JNIEnv *__env, jclass clazz, jint framebuffer, jint start, jint count, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glNamedFramebufferSampleLocationsfvARBPROC glNamedFramebufferSampleLocationsfvARB = (glNamedFramebufferSampleLocationsfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferSampleLocationsfvARB(framebuffer, start, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSampleLocations_nglEvaluateDepthValuesARB(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glEvaluateDepthValuesARBPROC glEvaluateDepthValuesARB = (glEvaluateDepthValuesARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvaluateDepthValuesARB();
}

EXTERN_C_EXIT
