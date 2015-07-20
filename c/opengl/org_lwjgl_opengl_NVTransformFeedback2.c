/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBindTransformFeedbackNVPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDeleteTransformFeedbacksNVPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glGenTransformFeedbacksNVPROC) (GLsizei, GLuint *);
typedef GLboolean (APIENTRY *glIsTransformFeedbackNVPROC) (GLuint);
typedef void (APIENTRY *glPauseTransformFeedbackNVPROC) (void);
typedef void (APIENTRY *glResumeTransformFeedbackNVPROC) (void);
typedef void (APIENTRY *glDrawTransformFeedbackNVPROC) (GLenum, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_nglBindTransformFeedbackNV(JNIEnv *__env, jclass clazz, jint target, jint id, jlong __functionAddress) {
	glBindTransformFeedbackNVPROC glBindTransformFeedbackNV = (glBindTransformFeedbackNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindTransformFeedbackNV(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_nglDeleteTransformFeedbacksNV(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDeleteTransformFeedbacksNVPROC glDeleteTransformFeedbacksNV = (glDeleteTransformFeedbacksNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteTransformFeedbacksNV(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_nglGenTransformFeedbacksNV(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	glGenTransformFeedbacksNVPROC glGenTransformFeedbacksNV = (glGenTransformFeedbacksNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenTransformFeedbacksNV(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_nglIsTransformFeedbackNV(JNIEnv *__env, jclass clazz, jint id, jlong __functionAddress) {
	glIsTransformFeedbackNVPROC glIsTransformFeedbackNV = (glIsTransformFeedbackNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsTransformFeedbackNV(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_nglPauseTransformFeedbackNV(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPauseTransformFeedbackNVPROC glPauseTransformFeedbackNV = (glPauseTransformFeedbackNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPauseTransformFeedbackNV();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_nglResumeTransformFeedbackNV(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glResumeTransformFeedbackNVPROC glResumeTransformFeedbackNV = (glResumeTransformFeedbackNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glResumeTransformFeedbackNV();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_nglDrawTransformFeedbackNV(JNIEnv *__env, jclass clazz, jint mode, jint id, jlong __functionAddress) {
	glDrawTransformFeedbackNVPROC glDrawTransformFeedbackNV = (glDrawTransformFeedbackNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawTransformFeedbackNV(mode, id);
}

EXTERN_C_EXIT
