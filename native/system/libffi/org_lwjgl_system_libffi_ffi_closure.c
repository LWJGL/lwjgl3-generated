/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "ffi.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_ffi_1closure_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(ffi_closure, cif));
	buffer[1] = (jint)(offsetof(ffi_closure, fun));
	buffer[2] = (jint)(offsetof(ffi_closure, user_data));

	return sizeof(ffi_closure);
}

EXTERN_C_EXIT
