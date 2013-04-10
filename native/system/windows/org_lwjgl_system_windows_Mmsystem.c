/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_Mmsystem_njoyGetDevCaps(JNIEnv *__env, jclass clazz, jlong joyID, jlong jcAddress, jint bjc) {
	LPJOYCAPS jc = (LPJOYCAPS)(intptr_t)jcAddress;
	return (jint)joyGetDevCaps((UINT_PTR)joyID, jc, bjc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_Mmsystem_njoyGetPos(JNIEnv *__env, jclass clazz, jint joyID, jlong jiAddress) {
	LPJOYINFO ji = (LPJOYINFO)(intptr_t)jiAddress;
	return (jint)joyGetPos(joyID, ji);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_Mmsystem_njoyGetPosEx(JNIEnv *__env, jclass clazz, jint joyID, jlong jiAddress) {
	LPJOYINFOEX ji = (LPJOYINFOEX)(intptr_t)jiAddress;
	return (jint)joyGetPosEx(joyID, ji);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_Mmsystem_timeGetTime(JNIEnv *__env, jclass clazz) {
	return (jint)timeGetTime();
}