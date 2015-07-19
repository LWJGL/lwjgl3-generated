/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBindImageTextureEXTPROC) (GLuint, GLuint, GLint, GLboolean, GLint, GLenum, GLint);
typedef void (APIENTRY *glMemoryBarrierEXTPROC) (GLbitfield);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTShaderImageLoadStore_nglBindImageTextureEXT(JNIEnv *__env, jclass clazz, jint index, jint texture, jint level, jboolean layered, jint layer, jint access, jint format, jlong __functionAddress) {
	glBindImageTextureEXTPROC glBindImageTextureEXT = (glBindImageTextureEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindImageTextureEXT(index, texture, level, layered, layer, access, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTShaderImageLoadStore_nglMemoryBarrierEXT(JNIEnv *__env, jclass clazz, jint barriers, jlong __functionAddress) {
	glMemoryBarrierEXTPROC glMemoryBarrierEXT = (glMemoryBarrierEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMemoryBarrierEXT(barriers);
}

EXTERN_C_EXIT
