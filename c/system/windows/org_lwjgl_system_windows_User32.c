/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

typedef BOOL (APIENTRY *SetProcessDPIAwarePROC) (void);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetProcessDPIAware(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	SetProcessDPIAwarePROC SetProcessDPIAware = (SetProcessDPIAwarePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)SetProcessDPIAware();
}

EXTERN_C_EXIT
