/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLboolean (APIENTRY *glIsRenderbufferEXTPROC) (GLuint);
typedef GLvoid (APIENTRY *glBindRenderbufferEXTPROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glDeleteRenderbuffersEXTPROC) (GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glGenRenderbuffersEXTPROC) (GLsizei, GLuint *);
typedef GLvoid (APIENTRY *glRenderbufferStorageEXTPROC) (GLenum, GLenum, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glGetRenderbufferParameterivEXTPROC) (GLenum, GLenum, GLint *);
typedef GLboolean (APIENTRY *glIsFramebufferEXTPROC) (GLuint);
typedef GLvoid (APIENTRY *glBindFramebufferEXTPROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glDeleteFramebuffersEXTPROC) (GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glGenFramebuffersEXTPROC) (GLsizei, GLuint *);
typedef GLenum (APIENTRY *glCheckFramebufferStatusEXTPROC) (GLenum);
typedef GLvoid (APIENTRY *glFramebufferTexture1DEXTPROC) (GLenum, GLenum, GLenum, GLuint, GLint);
typedef GLvoid (APIENTRY *glFramebufferTexture2DEXTPROC) (GLenum, GLenum, GLenum, GLuint, GLint);
typedef GLvoid (APIENTRY *glFramebufferTexture3DEXTPROC) (GLenum, GLenum, GLenum, GLuint, GLint, GLint);
typedef GLvoid (APIENTRY *glFramebufferRenderbufferEXTPROC) (GLenum, GLenum, GLenum, GLuint);
typedef GLvoid (APIENTRY *glGetFramebufferAttachmentParameterivEXTPROC) (GLenum, GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGenerateMipmapEXTPROC) (GLenum);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglIsRenderbufferEXT(JNIEnv *__env, jclass clazz, jint renderbuffer, jlong __functionAddress) {
	glIsRenderbufferEXTPROC glIsRenderbufferEXT = (glIsRenderbufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsRenderbufferEXT(renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglBindRenderbufferEXT(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer, jlong __functionAddress) {
	glBindRenderbufferEXTPROC glBindRenderbufferEXT = (glBindRenderbufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindRenderbufferEXT(target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglDeleteRenderbuffersEXT(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress, jlong __functionAddress) {
	const GLuint *renderbuffers = (const GLuint *)(intptr_t)renderbuffersAddress;
	glDeleteRenderbuffersEXTPROC glDeleteRenderbuffersEXT = (glDeleteRenderbuffersEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteRenderbuffersEXT(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGenRenderbuffersEXT(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress, jlong __functionAddress) {
	GLuint *renderbuffers = (GLuint *)(intptr_t)renderbuffersAddress;
	glGenRenderbuffersEXTPROC glGenRenderbuffersEXT = (glGenRenderbuffersEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenRenderbuffersEXT(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglRenderbufferStorageEXT(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glRenderbufferStorageEXTPROC glRenderbufferStorageEXT = (glRenderbufferStorageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRenderbufferStorageEXT(target, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGetRenderbufferParameterivEXT(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetRenderbufferParameterivEXTPROC glGetRenderbufferParameterivEXT = (glGetRenderbufferParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetRenderbufferParameterivEXT(target, pname, params);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglIsFramebufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jlong __functionAddress) {
	glIsFramebufferEXTPROC glIsFramebufferEXT = (glIsFramebufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsFramebufferEXT(framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglBindFramebufferEXT(JNIEnv *__env, jclass clazz, jint target, jint framebuffer, jlong __functionAddress) {
	glBindFramebufferEXTPROC glBindFramebufferEXT = (glBindFramebufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindFramebufferEXT(target, framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglDeleteFramebuffersEXT(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress, jlong __functionAddress) {
	const GLuint *framebuffers = (const GLuint *)(intptr_t)framebuffersAddress;
	glDeleteFramebuffersEXTPROC glDeleteFramebuffersEXT = (glDeleteFramebuffersEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteFramebuffersEXT(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGenFramebuffersEXT(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress, jlong __functionAddress) {
	GLuint *framebuffers = (GLuint *)(intptr_t)framebuffersAddress;
	glGenFramebuffersEXTPROC glGenFramebuffersEXT = (glGenFramebuffersEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenFramebuffersEXT(n, framebuffers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglCheckFramebufferStatusEXT(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glCheckFramebufferStatusEXTPROC glCheckFramebufferStatusEXT = (glCheckFramebufferStatusEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCheckFramebufferStatusEXT(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglFramebufferTexture1DEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jlong __functionAddress) {
	glFramebufferTexture1DEXTPROC glFramebufferTexture1DEXT = (glFramebufferTexture1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture1DEXT(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglFramebufferTexture2DEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jlong __functionAddress) {
	glFramebufferTexture2DEXTPROC glFramebufferTexture2DEXT = (glFramebufferTexture2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture2DEXT(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglFramebufferTexture3DEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint zoffset, jlong __functionAddress) {
	glFramebufferTexture3DEXTPROC glFramebufferTexture3DEXT = (glFramebufferTexture3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture3DEXT(target, attachment, textarget, texture, level, zoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglFramebufferRenderbufferEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer, jlong __functionAddress) {
	glFramebufferRenderbufferEXTPROC glFramebufferRenderbufferEXT = (glFramebufferRenderbufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferRenderbufferEXT(target, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGetFramebufferAttachmentParameterivEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetFramebufferAttachmentParameterivEXTPROC glGetFramebufferAttachmentParameterivEXT = (glGetFramebufferAttachmentParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFramebufferAttachmentParameterivEXT(target, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGenerateMipmapEXT(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glGenerateMipmapEXTPROC glGenerateMipmapEXT = (glGenerateMipmapEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenerateMipmapEXT(target);
}

EXTERN_C_EXIT
