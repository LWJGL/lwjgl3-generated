/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "LinuxLWJGL.h"

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_SysSelect_nFD_1CLR(JNIEnv *__env, jclass clazz, jint fd, jlong setAddress) {
	fd_set *set = (fd_set *)(intptr_t)setAddress;
	FD_CLR(fd, set);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_SysSelect_nFD_1ISSET(JNIEnv *__env, jclass clazz, jint fd, jlong setAddress) {
	fd_set *set = (fd_set *)(intptr_t)setAddress;
	return (jint)FD_ISSET(fd, set);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_SysSelect_nFD_1SET(JNIEnv *__env, jclass clazz, jint fd, jlong setAddress) {
	fd_set *set = (fd_set *)(intptr_t)setAddress;
	FD_SET(fd, set);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_SysSelect_nFD_1ZERO(JNIEnv *__env, jclass clazz, jlong setAddress) {
	fd_set *set = (fd_set *)(intptr_t)setAddress;
	FD_ZERO(set);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_SysSelect_nselect(JNIEnv *__env, jclass clazz, jint nfds, jlong readfdsAddress, jlong writefdsAddress, jlong exceptfdsAddress, jlong timeoutAddress) {
	fd_set *readfds = (fd_set *)(intptr_t)readfdsAddress;
	fd_set *writefds = (fd_set *)(intptr_t)writefdsAddress;
	fd_set *exceptfds = (fd_set *)(intptr_t)exceptfdsAddress;
	timeval *timeout = (timeval *)(intptr_t)timeoutAddress;
	return (jint)select(nfds, readfds, writefds, exceptfds, timeout);
}