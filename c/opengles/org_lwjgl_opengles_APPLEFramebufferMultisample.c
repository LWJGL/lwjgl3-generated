/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleAPPLEPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glResolveMultisampleFramebufferAPPLEPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLEFramebufferMultisample_nglRenderbufferStorageMultisampleAPPLE(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glRenderbufferStorageMultisampleAPPLEPROC glRenderbufferStorageMultisampleAPPLE = (glRenderbufferStorageMultisampleAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRenderbufferStorageMultisampleAPPLE(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLEFramebufferMultisample_nglResolveMultisampleFramebufferAPPLE(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glResolveMultisampleFramebufferAPPLEPROC glResolveMultisampleFramebufferAPPLE = (glResolveMultisampleFramebufferAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glResolveMultisampleFramebufferAPPLE();
}

EXTERN_C_EXIT
