/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_WINDOWS
	#define _CRT_SECURE_NO_WARNINGS
#endif
#include "common_tools.h"
#include <string.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_StringH_nstrerror(JNIEnv *__env, jclass clazz, jint errnum) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)strerror(errnum);
}

EXTERN_C_EXIT
