/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "WindowsLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GLYPHMETRICSFLOAT_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(GLYPHMETRICSFLOAT, gmfBlackBoxX));
	buffer[1] = (jint)(offsetof(GLYPHMETRICSFLOAT, gmfBlackBoxY));
	buffer[2] = (jint)(offsetof(GLYPHMETRICSFLOAT, gmfptGlyphOrigin));
	buffer[3] = (jint)(offsetof(GLYPHMETRICSFLOAT, gmfCellIncX));
	buffer[4] = (jint)(offsetof(GLYPHMETRICSFLOAT, gmfCellIncY));

	return sizeof(GLYPHMETRICSFLOAT);
}

EXTERN_C_EXIT
