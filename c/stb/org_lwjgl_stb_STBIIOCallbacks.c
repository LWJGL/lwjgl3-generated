/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4242 4244 4702 4711 4738 4820 4996))
#endif
#include "stb_image.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBIIOCallbacks_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(stbi_io_callbacks, read);
	buffer[1] = (jint)offsetof(stbi_io_callbacks, skip);
	buffer[2] = (jint)offsetof(stbi_io_callbacks, eof);

	return sizeof(stbi_io_callbacks);
}

EXTERN_C_EXIT
