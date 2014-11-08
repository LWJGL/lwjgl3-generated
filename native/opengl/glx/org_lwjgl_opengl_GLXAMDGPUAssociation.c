/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef void (APIENTRY *glXBlitContextFramebufferAMDPROC) (GLXContext, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum);
typedef GLXContext (APIENTRY *glXCreateAssociatedContextAMDPROC) (unsigned int, GLXContext);
typedef GLXContext (APIENTRY *glXCreateAssociatedContextAttribsAMDPROC) (unsigned int, GLXContext, const int *);
typedef Bool (APIENTRY *glXDeleteAssociatedContextAMDPROC) (GLXContext);
typedef unsigned int (APIENTRY *glXGetContextGPUIDAMDPROC) (GLXContext);
typedef GLXContext (APIENTRY *glXGetCurrentAssociatedContextAMDPROC) (void);
typedef unsigned int (APIENTRY *glXGetGPUIDsAMDPROC) (unsigned int, unsigned int);
typedef int (APIENTRY *glXGetGPUInfoAMDPROC) (unsigned int, int, GLenum, unsigned int, void *);
typedef Bool (APIENTRY *glXMakeAssociatedContextCurrentAMDPROC) (GLXContext);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXAMDGPUAssociation_nglXBlitContextFramebufferAMD(JNIEnv *__env, jclass clazz, jlong dstCtxAddress, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter, jlong __functionAddress) {
	GLXContext dstCtx = (GLXContext)(intptr_t)dstCtxAddress;
	glXBlitContextFramebufferAMDPROC glXBlitContextFramebufferAMD = (glXBlitContextFramebufferAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glXBlitContextFramebufferAMD(dstCtx, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXAMDGPUAssociation_nglXCreateAssociatedContextAMD(JNIEnv *__env, jclass clazz, jint id, jlong share_listAddress, jlong __functionAddress) {
	GLXContext share_list = (GLXContext)(intptr_t)share_listAddress;
	glXCreateAssociatedContextAMDPROC glXCreateAssociatedContextAMD = (glXCreateAssociatedContextAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glXCreateAssociatedContextAMD(id, share_list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXAMDGPUAssociation_nglXCreateAssociatedContextAttribsAMD(JNIEnv *__env, jclass clazz, jint id, jlong share_contextAddress, jlong attribListAddress, jlong __functionAddress) {
	GLXContext share_context = (GLXContext)(intptr_t)share_contextAddress;
	const int *attribList = (const int *)(intptr_t)attribListAddress;
	glXCreateAssociatedContextAttribsAMDPROC glXCreateAssociatedContextAttribsAMD = (glXCreateAssociatedContextAttribsAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glXCreateAssociatedContextAttribsAMD(id, share_context, attribList);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXAMDGPUAssociation_nglXDeleteAssociatedContextAMD(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __functionAddress) {
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	glXDeleteAssociatedContextAMDPROC glXDeleteAssociatedContextAMD = (glXDeleteAssociatedContextAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXDeleteAssociatedContextAMD(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXAMDGPUAssociation_nglXGetContextGPUIDAMD(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __functionAddress) {
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	glXGetContextGPUIDAMDPROC glXGetContextGPUIDAMD = (glXGetContextGPUIDAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXGetContextGPUIDAMD(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXAMDGPUAssociation_nglXGetCurrentAssociatedContextAMD(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glXGetCurrentAssociatedContextAMDPROC glXGetCurrentAssociatedContextAMD = (glXGetCurrentAssociatedContextAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glXGetCurrentAssociatedContextAMD();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXAMDGPUAssociation_nglXGetGPUIDsAMD(JNIEnv *__env, jclass clazz, jint maxCount, jint ids, jlong __functionAddress) {
	glXGetGPUIDsAMDPROC glXGetGPUIDsAMD = (glXGetGPUIDsAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXGetGPUIDsAMD(maxCount, ids);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXAMDGPUAssociation_nglXGetGPUInfoAMD(JNIEnv *__env, jclass clazz, jint id, jint property, jint dataType, jint size, jlong dataAddress, jlong __functionAddress) {
	void *data = (void *)(intptr_t)dataAddress;
	glXGetGPUInfoAMDPROC glXGetGPUInfoAMD = (glXGetGPUInfoAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXGetGPUInfoAMD(id, property, dataType, size, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXAMDGPUAssociation_nglXMakeAssociatedContextCurrentAMD(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __functionAddress) {
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	glXMakeAssociatedContextCurrentAMDPROC glXMakeAssociatedContextCurrentAMD = (glXMakeAssociatedContextCurrentAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXMakeAssociatedContextCurrentAMD(ctx);
}

EXTERN_C_EXIT
