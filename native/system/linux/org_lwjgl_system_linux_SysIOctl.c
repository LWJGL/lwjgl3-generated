/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <sys/ioctl.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_SysIOctl_nioctl(JNIEnv *__env, jclass clazz, jint fd, jint request, jlong argAddress) {
	void *arg = (void *)(intptr_t)argAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ioctl(fd, request, arg);
}

EXTERN_C_EXIT
