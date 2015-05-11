/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glFramebufferTextureMultiviewOVRPROC) (GLenum, GLenum, GLuint, GLint, GLint, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_OVRMultiview_nglFramebufferTextureMultiviewOVR(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint baseViewIndex, jint numViews, jlong __functionAddress) {
	glFramebufferTextureMultiviewOVRPROC glFramebufferTextureMultiviewOVR = (glFramebufferTextureMultiviewOVRPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureMultiviewOVR(target, attachment, texture, level, baseViewIndex, numViews);
}

EXTERN_C_EXIT
