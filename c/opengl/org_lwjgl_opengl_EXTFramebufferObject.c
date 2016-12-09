/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jboolean (APIENTRY *glIsRenderbufferEXTPROC) (jint);
typedef void (APIENTRY *glBindRenderbufferEXTPROC) (jint, jint);
typedef void (APIENTRY *glDeleteRenderbuffersEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGenRenderbuffersEXTPROC) (jint, intptr_t);
typedef void (APIENTRY *glRenderbufferStorageEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glGetRenderbufferParameterivEXTPROC) (jint, jint, intptr_t);
typedef jboolean (APIENTRY *glIsFramebufferEXTPROC) (jint);
typedef void (APIENTRY *glBindFramebufferEXTPROC) (jint, jint);
typedef void (APIENTRY *glDeleteFramebuffersEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGenFramebuffersEXTPROC) (jint, intptr_t);
typedef jint (APIENTRY *glCheckFramebufferStatusEXTPROC) (jint);
typedef void (APIENTRY *glFramebufferTexture1DEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTexture2DEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTexture3DEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferRenderbufferEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glGetFramebufferAttachmentParameterivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGenerateMipmapEXTPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglIsRenderbufferEXT(JNIEnv *__env, jclass clazz, jint renderbuffer) {
	glIsRenderbufferEXTPROC glIsRenderbufferEXT = (glIsRenderbufferEXTPROC)tlsGetFunction(878);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsRenderbufferEXT(renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglBindRenderbufferEXT(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer) {
	glBindRenderbufferEXTPROC glBindRenderbufferEXT = (glBindRenderbufferEXTPROC)tlsGetFunction(51);
	UNUSED_PARAM(clazz)
	glBindRenderbufferEXT(target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglDeleteRenderbuffersEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
	glDeleteRenderbuffersEXTPROC glDeleteRenderbuffersEXT = (glDeleteRenderbuffersEXTPROC)tlsGetFunction(310);
	const intptr_t renderbuffers = (const intptr_t)renderbuffersAddress;
	UNUSED_PARAM(clazz)
	glDeleteRenderbuffersEXT(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGenRenderbuffersEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
	glGenRenderbuffersEXTPROC glGenRenderbuffersEXT = (glGenRenderbuffersEXTPROC)tlsGetFunction(478);
	intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
	UNUSED_PARAM(clazz)
	glGenRenderbuffersEXT(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglRenderbufferStorageEXT(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height) {
	glRenderbufferStorageEXTPROC glRenderbufferStorageEXT = (glRenderbufferStorageEXTPROC)tlsGetFunction(1448);
	UNUSED_PARAM(clazz)
	glRenderbufferStorageEXT(target, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGetRenderbufferParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetRenderbufferParameterivEXTPROC glGetRenderbufferParameterivEXT = (glGetRenderbufferParameterivEXTPROC)tlsGetFunction(688);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetRenderbufferParameterivEXT(target, pname, params);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglIsFramebufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer) {
	glIsFramebufferEXTPROC glIsFramebufferEXT = (glIsFramebufferEXTPROC)tlsGetFunction(863);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsFramebufferEXT(framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglBindFramebufferEXT(JNIEnv *__env, jclass clazz, jint target, jint framebuffer) {
	glBindFramebufferEXTPROC glBindFramebufferEXT = (glBindFramebufferEXTPROC)tlsGetFunction(43);
	UNUSED_PARAM(clazz)
	glBindFramebufferEXT(target, framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglDeleteFramebuffersEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
	glDeleteFramebuffersEXTPROC glDeleteFramebuffersEXT = (glDeleteFramebuffersEXTPROC)tlsGetFunction(297);
	const intptr_t framebuffers = (const intptr_t)framebuffersAddress;
	UNUSED_PARAM(clazz)
	glDeleteFramebuffersEXT(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGenFramebuffersEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
	glGenFramebuffersEXTPROC glGenFramebuffersEXT = (glGenFramebuffersEXTPROC)tlsGetFunction(469);
	intptr_t framebuffers = (intptr_t)framebuffersAddress;
	UNUSED_PARAM(clazz)
	glGenFramebuffersEXT(n, framebuffers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglCheckFramebufferStatusEXT(JNIEnv *__env, jclass clazz, jint target) {
	glCheckFramebufferStatusEXTPROC glCheckFramebufferStatusEXT = (glCheckFramebufferStatusEXTPROC)tlsGetFunction(101);
	UNUSED_PARAM(clazz)
	return (jint)glCheckFramebufferStatusEXT(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglFramebufferTexture1DEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
	glFramebufferTexture1DEXTPROC glFramebufferTexture1DEXT = (glFramebufferTexture1DEXTPROC)tlsGetFunction(450);
	UNUSED_PARAM(clazz)
	glFramebufferTexture1DEXT(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglFramebufferTexture2DEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
	glFramebufferTexture2DEXTPROC glFramebufferTexture2DEXT = (glFramebufferTexture2DEXTPROC)tlsGetFunction(452);
	UNUSED_PARAM(clazz)
	glFramebufferTexture2DEXT(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglFramebufferTexture3DEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint zoffset) {
	glFramebufferTexture3DEXTPROC glFramebufferTexture3DEXT = (glFramebufferTexture3DEXTPROC)tlsGetFunction(454);
	UNUSED_PARAM(clazz)
	glFramebufferTexture3DEXT(target, attachment, textarget, texture, level, zoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglFramebufferRenderbufferEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer) {
	glFramebufferRenderbufferEXTPROC glFramebufferRenderbufferEXT = (glFramebufferRenderbufferEXTPROC)tlsGetFunction(445);
	UNUSED_PARAM(clazz)
	glFramebufferRenderbufferEXT(target, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGetFramebufferAttachmentParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint pname, jlong paramsAddress) {
	glGetFramebufferAttachmentParameterivEXTPROC glGetFramebufferAttachmentParameterivEXT = (glGetFramebufferAttachmentParameterivEXTPROC)tlsGetFunction(550);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetFramebufferAttachmentParameterivEXT(target, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGenerateMipmapEXT(JNIEnv *__env, jclass clazz, jint target) {
	glGenerateMipmapEXTPROC glGenerateMipmapEXT = (glGenerateMipmapEXTPROC)tlsGetFunction(485);
	UNUSED_PARAM(clazz)
	glGenerateMipmapEXT(target);
}

EXTERN_C_EXIT
