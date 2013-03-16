/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "WindowsLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GLYPHMETRICSFLOAT_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(GLYPHMETRICSFLOAT, gmfBlackBoxX));
	buffer[1] = (jint)(offsetof(GLYPHMETRICSFLOAT, gmfBlackBoxY));
	buffer[2] = (jint)(offsetof(GLYPHMETRICSFLOAT, gmfptGlyphOrigin));
	buffer[3] = (jint)(offsetof(GLYPHMETRICSFLOAT, gmfCellIncX));
	buffer[4] = (jint)(offsetof(GLYPHMETRICSFLOAT, gmfCellIncY));

	return sizeof(GLYPHMETRICSFLOAT);
}