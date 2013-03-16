/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "WindowsLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_DEVMODE_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(DEVMODE, dmDeviceName));
	buffer[1] = (jint)(offsetof(DEVMODE, dmSpecVersion));
	buffer[2] = (jint)(offsetof(DEVMODE, dmDriverVersion));
	buffer[3] = (jint)(offsetof(DEVMODE, dmSize));
	buffer[4] = (jint)(offsetof(DEVMODE, dmDriverExtra));
	buffer[5] = (jint)(offsetof(DEVMODE, dmFields));
	buffer[6] = (jint)(offsetof(DEVMODE, dmPosition));
	buffer[7] = (jint)(offsetof(DEVMODE, dmLogPixels));
	buffer[8] = (jint)(offsetof(DEVMODE, dmBitsPerPel));
	buffer[9] = (jint)(offsetof(DEVMODE, dmPelsWidth));
	buffer[10] = (jint)(offsetof(DEVMODE, dmPelsHeight));
	buffer[11] = (jint)(offsetof(DEVMODE, dmDisplayFlags));
	buffer[12] = (jint)(offsetof(DEVMODE, dmDisplayFrequency));

	return sizeof(DEVMODE);
}