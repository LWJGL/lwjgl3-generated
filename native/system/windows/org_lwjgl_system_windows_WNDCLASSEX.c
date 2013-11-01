/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "WindowsLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WNDCLASSEX_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(WNDCLASSEX, cbSize));
	buffer[1] = (jint)(offsetof(WNDCLASSEX, style));
	buffer[2] = (jint)(offsetof(WNDCLASSEX, lpfnWndProc));
	buffer[3] = (jint)(offsetof(WNDCLASSEX, cbClsExtra));
	buffer[4] = (jint)(offsetof(WNDCLASSEX, cbWndExtra));
	buffer[5] = (jint)(offsetof(WNDCLASSEX, hInstance));
	buffer[6] = (jint)(offsetof(WNDCLASSEX, hIcon));
	buffer[7] = (jint)(offsetof(WNDCLASSEX, hCursor));
	buffer[8] = (jint)(offsetof(WNDCLASSEX, hbrBackground));
	buffer[9] = (jint)(offsetof(WNDCLASSEX, lpszMenuName));
	buffer[10] = (jint)(offsetof(WNDCLASSEX, lpszClassName));
	buffer[11] = (jint)(offsetof(WNDCLASSEX, hIconSm));

	return sizeof(WNDCLASSEX);
}
