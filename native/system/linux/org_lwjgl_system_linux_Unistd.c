/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <unistd.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Unistd_close(JNIEnv *__env, jclass clazz, jint fd) {
	return (jint)close(fd);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Unistd_nread(JNIEnv *__env, jclass clazz, jint fd, jlong bufAddress, jlong count) {
	void *buf = (void *)(intptr_t)bufAddress;
	return (jlong)read(fd, buf, (size_t)count);
}