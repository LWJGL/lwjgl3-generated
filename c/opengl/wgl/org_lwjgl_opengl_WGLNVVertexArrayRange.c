/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void * (APIENTRY *wglAllocateMemoryNVPROC) (GLsizei, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *wglFreeMemoryNVPROC) (void *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLNVVertexArrayRange_nwglAllocateMemoryNV(JNIEnv *__env, jclass clazz, jint size, jfloat readfreq, jfloat writefreq, jfloat priority, jlong __functionAddress) {
	wglAllocateMemoryNVPROC wglAllocateMemoryNV = (wglAllocateMemoryNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)wglAllocateMemoryNV(size, readfreq, writefreq, priority);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_WGLNVVertexArrayRange_nwglFreeMemoryNV(JNIEnv *__env, jclass clazz, jlong pointerAddress, jlong __functionAddress) {
	void *pointer = (void *)(intptr_t)pointerAddress;
	wglFreeMemoryNVPROC wglFreeMemoryNV = (wglFreeMemoryNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	wglFreeMemoryNV(pointer);
}

EXTERN_C_EXIT
