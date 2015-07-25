/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glProgramParameteriEXTPROC) (GLuint, GLenum, GLint);
typedef void (APIENTRY *glFramebufferTextureEXTPROC) (GLenum, GLenum, GLuint, GLint);
typedef void (APIENTRY *glFramebufferTextureLayerEXTPROC) (GLenum, GLenum, GLuint, GLint, GLint);
typedef void (APIENTRY *glFramebufferTextureFaceEXTPROC) (GLenum, GLenum, GLuint, GLint, GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGeometryShader4_nglProgramParameteriEXT(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value, jlong __functionAddress) {
	glProgramParameteriEXTPROC glProgramParameteriEXT = (glProgramParameteriEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramParameteriEXT(program, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGeometryShader4_nglFramebufferTextureEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jlong __functionAddress) {
	glFramebufferTextureEXTPROC glFramebufferTextureEXT = (glFramebufferTextureEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureEXT(target, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGeometryShader4_nglFramebufferTextureLayerEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer, jlong __functionAddress) {
	glFramebufferTextureLayerEXTPROC glFramebufferTextureLayerEXT = (glFramebufferTextureLayerEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureLayerEXT(target, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGeometryShader4_nglFramebufferTextureFaceEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint face, jlong __functionAddress) {
	glFramebufferTextureFaceEXTPROC glFramebufferTextureFaceEXT = (glFramebufferTextureFaceEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureFaceEXT(target, attachment, texture, level, face);
}

EXTERN_C_EXIT
