/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <X11/extensions/xf86vmode.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xf86vmode_nXF86VidModeQueryExtension(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong event_baseAddress, jlong error_baseAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *event_base = (int *)(intptr_t)event_baseAddress;
	int *error_base = (int *)(intptr_t)error_baseAddress;
	return (jint)XF86VidModeQueryExtension(display, event_base, error_base);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xf86vmode_nXF86VidModeGetGammaRampSize(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jlong sizeAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *size = (int *)(intptr_t)sizeAddress;
	return (jint)XF86VidModeGetGammaRampSize(display, screen, size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xf86vmode_nXF86VidModeGetGammaRamp(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jint size, jlong red_arrayAddress, jlong green_arrayAddress, jlong blue_arrayAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	unsigned short *red_array = (unsigned short *)(intptr_t)red_arrayAddress;
	unsigned short *green_array = (unsigned short *)(intptr_t)green_arrayAddress;
	unsigned short *blue_array = (unsigned short *)(intptr_t)blue_arrayAddress;
	return (jint)XF86VidModeGetGammaRamp(display, screen, size, red_array, green_array, blue_array);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xf86vmode_nXF86VidModeSetGammaRamp(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jint size, jlong red_arrayAddress, jlong green_arrayAddress, jlong blue_arrayAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	unsigned short *red_array = (unsigned short *)(intptr_t)red_arrayAddress;
	unsigned short *green_array = (unsigned short *)(intptr_t)green_arrayAddress;
	unsigned short *blue_array = (unsigned short *)(intptr_t)blue_arrayAddress;
	return (jint)XF86VidModeSetGammaRamp(display, screen, size, red_array, green_array, blue_array);
}