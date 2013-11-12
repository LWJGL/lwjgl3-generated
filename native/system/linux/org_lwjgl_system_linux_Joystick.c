/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <linux/joystick.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Joystick_JSIOCGVERSION(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)JSIOCGVERSION;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Joystick_JSIOCGAXES(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)JSIOCGAXES;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Joystick_JSIOCGBUTTONS(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)JSIOCGBUTTONS;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Joystick_JSIOCGNAME(JNIEnv *__env, jclass clazz, jint len) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)JSIOCGNAME(len);
}

EXTERN_C_EXIT
