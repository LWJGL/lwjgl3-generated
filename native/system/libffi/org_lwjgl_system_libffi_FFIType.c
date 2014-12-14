/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "ffi.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_FFIType_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(ffi_type, size));
	buffer[1] = (jint)(offsetof(ffi_type, alignment));
	buffer[2] = (jint)(offsetof(ffi_type, type));
	buffer[3] = (jint)(offsetof(ffi_type, elements));

	return sizeof(ffi_type);
}

EXTERN_C_EXIT
