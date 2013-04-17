/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <fcntl.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Fcntl_nopen(JNIEnv *__env, jclass clazz, jlong pathnameAddress, jint flags) {
	const char *pathname = (const char *)(intptr_t)pathnameAddress;
	return (jint)open(pathname, flags);
}