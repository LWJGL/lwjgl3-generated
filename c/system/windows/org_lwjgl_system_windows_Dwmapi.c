/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

typedef HRESULT (APIENTRY *DwmIsCompositionEnabledPROC) (BOOL *);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_Dwmapi_nDwmIsCompositionEnabled(JNIEnv *__env, jclass clazz, jlong enabledAddress, jlong __functionAddress) {
	BOOL *enabled = (BOOL *)(intptr_t)enabledAddress;
	DwmIsCompositionEnabledPROC DwmIsCompositionEnabled = (DwmIsCompositionEnabledPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)DwmIsCompositionEnabled(enabled);
}

EXTERN_C_EXIT
