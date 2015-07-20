/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef Bool (APIENTRY *glXJoinSwapGroupNVPROC) (Display *, GLXDrawable, GLuint);
typedef Bool (APIENTRY *glXBindSwapBarrierNVPROC) (Display *, GLuint, GLuint);
typedef Bool (APIENTRY *glXQuerySwapGroupNVPROC) (Display *, GLXDrawable, GLuint *, GLuint *);
typedef Bool (APIENTRY *glXQueryMaxSwapGroupsNVPROC) (Display *, int, GLuint *, GLuint *);
typedef Bool (APIENTRY *glXQueryFrameCountNVPROC) (Display *, int, GLuint *);
typedef Bool (APIENTRY *glXResetFrameCountNVPROC) (Display *, int);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXNVSwapGroup_nglXJoinSwapGroupNV(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawableAddress, jint group, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable drawable = (GLXDrawable)(intptr_t)drawableAddress;
	glXJoinSwapGroupNVPROC glXJoinSwapGroupNV = (glXJoinSwapGroupNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXJoinSwapGroupNV(display, drawable, group);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXNVSwapGroup_nglXBindSwapBarrierNV(JNIEnv *__env, jclass clazz, jlong displayAddress, jint group, jint barrier, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	glXBindSwapBarrierNVPROC glXBindSwapBarrierNV = (glXBindSwapBarrierNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXBindSwapBarrierNV(display, group, barrier);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXNVSwapGroup_nglXQuerySwapGroupNV(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawableAddress, jlong groupAddress, jlong barrierAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable drawable = (GLXDrawable)(intptr_t)drawableAddress;
	GLuint *group = (GLuint *)(intptr_t)groupAddress;
	GLuint *barrier = (GLuint *)(intptr_t)barrierAddress;
	glXQuerySwapGroupNVPROC glXQuerySwapGroupNV = (glXQuerySwapGroupNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXQuerySwapGroupNV(display, drawable, group, barrier);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXNVSwapGroup_nglXQueryMaxSwapGroupsNV(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jlong maxGroupsAddress, jlong maxBarriersAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLuint *maxGroups = (GLuint *)(intptr_t)maxGroupsAddress;
	GLuint *maxBarriers = (GLuint *)(intptr_t)maxBarriersAddress;
	glXQueryMaxSwapGroupsNVPROC glXQueryMaxSwapGroupsNV = (glXQueryMaxSwapGroupsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXQueryMaxSwapGroupsNV(display, screen, maxGroups, maxBarriers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXNVSwapGroup_nglXQueryFrameCountNV(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jlong countAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLuint *count = (GLuint *)(intptr_t)countAddress;
	glXQueryFrameCountNVPROC glXQueryFrameCountNV = (glXQueryFrameCountNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXQueryFrameCountNV(display, screen, count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXNVSwapGroup_nglXResetFrameCountNV(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	glXResetFrameCountNVPROC glXResetFrameCountNV = (glXResetFrameCountNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXResetFrameCountNV(display, screen);
}

EXTERN_C_EXIT
