/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glTextureViewOESPROC) (GLuint, GLenum, GLuint, GLenum, GLuint, GLuint, GLuint, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureView_nglTextureViewOES(JNIEnv *__env, jclass clazz, jint texture, jint target, jint origtexture, jint internalformat, jint minlevel, jint numlevels, jint minlayer, jint numlayers, jlong __functionAddress) {
	glTextureViewOESPROC glTextureViewOES = (glTextureViewOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureViewOES(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
}

EXTERN_C_EXIT
