/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <X11/XKBlib.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XKBlib_nXkbQueryExtension(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong opcodeReturnAddress, jlong eventBaseReturnAddress, jlong errorBaseReturnAddress, jlong majorRtrnAddress, jlong minorRtrnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *opcodeReturn = (int *)(intptr_t)opcodeReturnAddress;
	int *eventBaseReturn = (int *)(intptr_t)eventBaseReturnAddress;
	int *errorBaseReturn = (int *)(intptr_t)errorBaseReturnAddress;
	int *majorRtrn = (int *)(intptr_t)majorRtrnAddress;
	int *minorRtrn = (int *)(intptr_t)minorRtrnAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XkbQueryExtension(display, opcodeReturn, eventBaseReturn, errorBaseReturn, majorRtrn, minorRtrn);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XKBlib_nXkbSetDetectableAutoRepeat(JNIEnv *__env, jclass clazz, jlong displayAddress, jint detectable, jlong supportedAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	Bool *supported = (Bool *)(intptr_t)supportedAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XkbSetDetectableAutoRepeat(display, detectable, supported);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_XKBlib_nXkbKeycodeToKeysym(JNIEnv *__env, jclass clazz, jlong displayAddress, jint kc, jint group, jint level) {
	Display *display = (Display *)(intptr_t)displayAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)XkbKeycodeToKeysym(display, kc, group, level);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_XKBlib_nXkbGetKeyboard(JNIEnv *__env, jclass clazz, jlong displayAddress, jint which, jint deviceSpec) {
	Display *display = (Display *)(intptr_t)displayAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)XkbGetKeyboard(display, which, deviceSpec);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_XKBlib_nXkbFreeKeyboard(JNIEnv *__env, jclass clazz, jlong xkbAddress, jint which, jint freeDesc) {
	XkbDescRec *xkb = (XkbDescRec *)(intptr_t)xkbAddress;
	UNUSED_PARAMS(__env, clazz)
	XkbFreeKeyboard(xkb, which, freeDesc);
}
