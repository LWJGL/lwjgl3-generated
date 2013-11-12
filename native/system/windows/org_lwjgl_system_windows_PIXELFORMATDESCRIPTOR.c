/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "WindowsLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_PIXELFORMATDESCRIPTOR_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, nSize));
	buffer[1] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, nVersion));
	buffer[2] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, dwFlags));
	buffer[3] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, iPixelType));
	buffer[4] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cColorBits));
	buffer[5] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cRedBits));
	buffer[6] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cRedShift));
	buffer[7] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cGreenBits));
	buffer[8] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cGreenShift));
	buffer[9] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cBlueBits));
	buffer[10] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cBlueShift));
	buffer[11] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cAlphaBits));
	buffer[12] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cAlphaShift));
	buffer[13] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cAccumBits));
	buffer[14] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cAccumRedBits));
	buffer[15] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cAccumGreenBits));
	buffer[16] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cAccumBlueBits));
	buffer[17] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cAccumAlphaBits));
	buffer[18] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cDepthBits));
	buffer[19] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cStencilBits));
	buffer[20] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, cAuxBuffers));
	buffer[21] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, iLayerType));
	buffer[22] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, bReserved));
	buffer[23] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, dwLayerMask));
	buffer[24] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, dwVisibleMask));
	buffer[25] = (jint)(offsetof(PIXELFORMATDESCRIPTOR, dwDamageMask));

	return sizeof(PIXELFORMATDESCRIPTOR);
}

EXTERN_C_EXIT
