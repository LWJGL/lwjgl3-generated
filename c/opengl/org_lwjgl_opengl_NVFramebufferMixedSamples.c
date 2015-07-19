/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glRasterSamplesEXTPROC) (GLuint, GLboolean);
typedef void (APIENTRY *glCoverageModulationTableNVPROC) (GLsizei, const GLfloat *);
typedef void (APIENTRY *glGetCoverageModulationTableNVPROC) (GLsizei, GLfloat *);
typedef void (APIENTRY *glCoverageModulationNVPROC) (GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFramebufferMixedSamples_nglRasterSamplesEXT(JNIEnv *__env, jclass clazz, jint samples, jboolean fixedsamplelocations, jlong __functionAddress) {
	glRasterSamplesEXTPROC glRasterSamplesEXT = (glRasterSamplesEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterSamplesEXT(samples, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFramebufferMixedSamples_nglCoverageModulationTableNV(JNIEnv *__env, jclass clazz, jint n, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glCoverageModulationTableNVPROC glCoverageModulationTableNV = (glCoverageModulationTableNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCoverageModulationTableNV(n, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFramebufferMixedSamples_nglGetCoverageModulationTableNV(JNIEnv *__env, jclass clazz, jint bufsize, jlong vAddress, jlong __functionAddress) {
	GLfloat *v = (GLfloat *)(intptr_t)vAddress;
	glGetCoverageModulationTableNVPROC glGetCoverageModulationTableNV = (glGetCoverageModulationTableNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetCoverageModulationTableNV(bufsize, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFramebufferMixedSamples_nglCoverageModulationNV(JNIEnv *__env, jclass clazz, jint components, jlong __functionAddress) {
	glCoverageModulationNVPROC glCoverageModulationNV = (glCoverageModulationNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCoverageModulationNV(components);
}

EXTERN_C_EXIT
