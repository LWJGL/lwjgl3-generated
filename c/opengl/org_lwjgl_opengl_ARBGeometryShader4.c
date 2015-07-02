/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glProgramParameteriARBPROC) (GLuint, GLenum, GLint);
typedef GLvoid (APIENTRY *glFramebufferTextureARBPROC) (GLenum, GLenum, GLuint, GLint);
typedef GLvoid (APIENTRY *glFramebufferTextureLayerARBPROC) (GLenum, GLenum, GLuint, GLint, GLint);
typedef GLvoid (APIENTRY *glFramebufferTextureFaceARBPROC) (GLenum, GLenum, GLuint, GLint, GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGeometryShader4_nglProgramParameteriARB(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value, jlong __functionAddress) {
	glProgramParameteriARBPROC glProgramParameteriARB = (glProgramParameteriARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramParameteriARB(program, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGeometryShader4_nglFramebufferTextureARB(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jlong __functionAddress) {
	glFramebufferTextureARBPROC glFramebufferTextureARB = (glFramebufferTextureARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureARB(target, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGeometryShader4_nglFramebufferTextureLayerARB(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer, jlong __functionAddress) {
	glFramebufferTextureLayerARBPROC glFramebufferTextureLayerARB = (glFramebufferTextureLayerARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureLayerARB(target, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGeometryShader4_nglFramebufferTextureFaceARB(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint face, jlong __functionAddress) {
	glFramebufferTextureFaceARBPROC glFramebufferTextureFaceARB = (glFramebufferTextureFaceARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureFaceARB(target, attachment, texture, level, face);
}

EXTERN_C_EXIT
