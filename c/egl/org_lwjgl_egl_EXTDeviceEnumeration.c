/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "EGL/egl.h"
#include "EGL/eglext.h"
ENABLE_WARNINGS()

typedef EGLBoolean (APIENTRY *eglQueryDevicesEXTPROC) (EGLint, EGLDeviceEXT *, EGLint *);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EXTDeviceEnumeration_neglQueryDevicesEXT(JNIEnv *__env, jclass clazz, jint max_devices, jlong devicesAddress, jlong num_devicesAddress, jlong __functionAddress) {
	EGLDeviceEXT *devices = (EGLDeviceEXT *)(intptr_t)devicesAddress;
	EGLint *num_devices = (EGLint *)(intptr_t)num_devicesAddress;
	eglQueryDevicesEXTPROC eglQueryDevicesEXT = (eglQueryDevicesEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryDevicesEXT(max_devices, devices, num_devices);
}

EXTERN_C_EXIT
