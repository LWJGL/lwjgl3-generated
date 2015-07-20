/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleCoverageNVPROC) (GLenum, GLsizei, GLsizei, GLenum, GLsizei, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFramebufferMultisampleCoverage_nglRenderbufferStorageMultisampleCoverageNV(JNIEnv *__env, jclass clazz, jint target, jint coverageSamples, jint colorSamples, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glRenderbufferStorageMultisampleCoverageNVPROC glRenderbufferStorageMultisampleCoverageNV = (glRenderbufferStorageMultisampleCoverageNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRenderbufferStorageMultisampleCoverageNV(target, coverageSamples, colorSamples, internalformat, width, height);
}

EXTERN_C_EXIT
