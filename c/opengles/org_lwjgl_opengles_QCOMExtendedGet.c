/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glExtGetTexturesQCOMPROC) (GLuint *, GLint, GLint *);
typedef void (APIENTRY *glExtGetBuffersQCOMPROC) (GLuint *, GLint, GLint *);
typedef void (APIENTRY *glExtGetRenderbuffersQCOMPROC) (GLuint *, GLint, GLint *);
typedef void (APIENTRY *glExtGetFramebuffersQCOMPROC) (GLuint *, GLint, GLint *);
typedef void (APIENTRY *glExtGetTexLevelParameterivQCOMPROC) (GLuint, GLenum, GLint, GLenum, GLint *);
typedef void (APIENTRY *glExtTexObjectStateOverrideiQCOMPROC) (GLenum, GLenum, GLint);
typedef void (APIENTRY *glExtGetTexSubImageQCOMPROC) (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, void *);
typedef void (APIENTRY *glExtGetBufferPointervQCOMPROC) (GLenum, void **);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetTexturesQCOM(JNIEnv *__env, jclass clazz, jlong texturesAddress, jint maxTextures, jlong numTexturesAddress, jlong __functionAddress) {
	GLuint *textures = (GLuint *)(intptr_t)texturesAddress;
	GLint *numTextures = (GLint *)(intptr_t)numTexturesAddress;
	glExtGetTexturesQCOMPROC glExtGetTexturesQCOM = (glExtGetTexturesQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glExtGetTexturesQCOM(textures, maxTextures, numTextures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetBuffersQCOM(JNIEnv *__env, jclass clazz, jlong buffersAddress, jint maxBuffers, jlong numBuffersAddress, jlong __functionAddress) {
	GLuint *buffers = (GLuint *)(intptr_t)buffersAddress;
	GLint *numBuffers = (GLint *)(intptr_t)numBuffersAddress;
	glExtGetBuffersQCOMPROC glExtGetBuffersQCOM = (glExtGetBuffersQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glExtGetBuffersQCOM(buffers, maxBuffers, numBuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetRenderbuffersQCOM(JNIEnv *__env, jclass clazz, jlong renderbuffersAddress, jint maxRenderbuffers, jlong numRenderbuffersAddress, jlong __functionAddress) {
	GLuint *renderbuffers = (GLuint *)(intptr_t)renderbuffersAddress;
	GLint *numRenderbuffers = (GLint *)(intptr_t)numRenderbuffersAddress;
	glExtGetRenderbuffersQCOMPROC glExtGetRenderbuffersQCOM = (glExtGetRenderbuffersQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glExtGetRenderbuffersQCOM(renderbuffers, maxRenderbuffers, numRenderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetFramebuffersQCOM(JNIEnv *__env, jclass clazz, jlong framebuffersAddress, jint maxFramebuffers, jlong numFramebuffersAddress, jlong __functionAddress) {
	GLuint *framebuffers = (GLuint *)(intptr_t)framebuffersAddress;
	GLint *numFramebuffers = (GLint *)(intptr_t)numFramebuffersAddress;
	glExtGetFramebuffersQCOMPROC glExtGetFramebuffersQCOM = (glExtGetFramebuffersQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glExtGetFramebuffersQCOM(framebuffers, maxFramebuffers, numFramebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetTexLevelParameterivQCOM(JNIEnv *__env, jclass clazz, jint texture, jint face, jint level, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glExtGetTexLevelParameterivQCOMPROC glExtGetTexLevelParameterivQCOM = (glExtGetTexLevelParameterivQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glExtGetTexLevelParameterivQCOM(texture, face, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtTexObjectStateOverrideiQCOM(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param, jlong __functionAddress) {
	glExtTexObjectStateOverrideiQCOMPROC glExtTexObjectStateOverrideiQCOM = (glExtTexObjectStateOverrideiQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glExtTexObjectStateOverrideiQCOM(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetTexSubImageQCOM(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong texelsAddress, jlong __functionAddress) {
	void *texels = (void *)(intptr_t)texelsAddress;
	glExtGetTexSubImageQCOMPROC glExtGetTexSubImageQCOM = (glExtGetTexSubImageQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glExtGetTexSubImageQCOM(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, texels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetBufferPointervQCOM(JNIEnv *__env, jclass clazz, jint target, jlong paramsAddress, jlong __functionAddress) {
	void **params = (void **)(intptr_t)paramsAddress;
	glExtGetBufferPointervQCOMPROC glExtGetBufferPointervQCOM = (glExtGetBufferPointervQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glExtGetBufferPointervQCOM(target, params);
}

EXTERN_C_EXIT
