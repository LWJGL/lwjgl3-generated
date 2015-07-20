/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef BOOL (APIENTRY *wglJoinSwapGroupNVPROC) (HDC, GLuint);
typedef BOOL (APIENTRY *wglBindSwapBarrierNVPROC) (GLuint, GLuint);
typedef BOOL (APIENTRY *wglQuerySwapGroupNVPROC) (HDC, GLuint *, GLuint *);
typedef BOOL (APIENTRY *wglQueryMaxSwapGroupsNVPROC) (HDC, GLuint *, GLuint *);
typedef BOOL (APIENTRY *wglQueryFrameCountNVPROC) (HDC, GLuint *);
typedef BOOL (APIENTRY *wglResetFrameCountNVPROC) (HDC);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVSwapGroup_nwglJoinSwapGroupNV(JNIEnv *__env, jclass clazz, jlong hDCAddress, jint group, jlong __functionAddress) {
	HDC hDC = (HDC)(intptr_t)hDCAddress;
	wglJoinSwapGroupNVPROC wglJoinSwapGroupNV = (wglJoinSwapGroupNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglJoinSwapGroupNV(hDC, group);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVSwapGroup_nwglBindSwapBarrierNV(JNIEnv *__env, jclass clazz, jint group, jint barrier, jlong __functionAddress) {
	wglBindSwapBarrierNVPROC wglBindSwapBarrierNV = (wglBindSwapBarrierNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglBindSwapBarrierNV(group, barrier);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVSwapGroup_nwglQuerySwapGroupNV(JNIEnv *__env, jclass clazz, jlong hDCAddress, jlong groupAddress, jlong barrierAddress, jlong __functionAddress) {
	HDC hDC = (HDC)(intptr_t)hDCAddress;
	GLuint *group = (GLuint *)(intptr_t)groupAddress;
	GLuint *barrier = (GLuint *)(intptr_t)barrierAddress;
	wglQuerySwapGroupNVPROC wglQuerySwapGroupNV = (wglQuerySwapGroupNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglQuerySwapGroupNV(hDC, group, barrier);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVSwapGroup_nwglQueryMaxSwapGroupsNV(JNIEnv *__env, jclass clazz, jlong hDCAddress, jlong maxGroupsAddress, jlong maxBarriersAddress, jlong __functionAddress) {
	HDC hDC = (HDC)(intptr_t)hDCAddress;
	GLuint *maxGroups = (GLuint *)(intptr_t)maxGroupsAddress;
	GLuint *maxBarriers = (GLuint *)(intptr_t)maxBarriersAddress;
	wglQueryMaxSwapGroupsNVPROC wglQueryMaxSwapGroupsNV = (wglQueryMaxSwapGroupsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglQueryMaxSwapGroupsNV(hDC, maxGroups, maxBarriers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVSwapGroup_nwglQueryFrameCountNV(JNIEnv *__env, jclass clazz, jlong hDCAddress, jlong countAddress, jlong __functionAddress) {
	HDC hDC = (HDC)(intptr_t)hDCAddress;
	GLuint *count = (GLuint *)(intptr_t)countAddress;
	wglQueryFrameCountNVPROC wglQueryFrameCountNV = (wglQueryFrameCountNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglQueryFrameCountNV(hDC, count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVSwapGroup_nwglResetFrameCountNV(JNIEnv *__env, jclass clazz, jlong hDCAddress, jlong __functionAddress) {
	HDC hDC = (HDC)(intptr_t)hDCAddress;
	wglResetFrameCountNVPROC wglResetFrameCountNV = (wglResetFrameCountNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglResetFrameCountNV(hDC);
}

EXTERN_C_EXIT
