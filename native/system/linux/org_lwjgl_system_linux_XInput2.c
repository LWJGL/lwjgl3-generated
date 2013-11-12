/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <X11/extensions/XInput2.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XInput2_nXIQueryVersion(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong major_version_inoutAddress, jlong minor_version_inoutAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *major_version_inout = (int *)(intptr_t)major_version_inoutAddress;
	int *minor_version_inout = (int *)(intptr_t)minor_version_inoutAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XIQueryVersion(display, major_version_inout, minor_version_inout);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XInput2_nXISelectEvents(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong masksAddress, jint num_masks) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XIEventMask *masks = (XIEventMask *)(intptr_t)masksAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XISelectEvents(display, (Window)w, masks, num_masks);
}

EXTERN_C_EXIT
