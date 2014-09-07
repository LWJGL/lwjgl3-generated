/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glTexBufferARBPROC) (GLenum, GLenum, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureBufferObject_nglTexBufferARB(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong __functionAddress) {
	glTexBufferARBPROC glTexBufferARB = (glTexBufferARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexBufferARB(target, internalformat, buffer);
}

EXTERN_C_EXIT
