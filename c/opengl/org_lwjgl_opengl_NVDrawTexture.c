/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glDrawTextureNVPROC) (GLuint, GLuint, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDrawTexture_nglDrawTextureNV(JNIEnv *__env, jclass clazz, jint texture, jint sampler, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat z, jfloat s0, jfloat t0, jfloat s1, jfloat t1, jlong __functionAddress) {
	glDrawTextureNVPROC glDrawTextureNV = (glDrawTextureNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawTextureNV(texture, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1);
}

EXTERN_C_EXIT
