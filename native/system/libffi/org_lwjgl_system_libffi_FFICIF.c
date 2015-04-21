/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "ffi.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_FFICIF_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ffi_cif, abi);
	buffer[1] = (jint)offsetof(ffi_cif, nargs);
	buffer[2] = (jint)offsetof(ffi_cif, arg_types);
	buffer[3] = (jint)offsetof(ffi_cif, rtype);
	buffer[4] = (jint)offsetof(ffi_cif, bytes);
	buffer[5] = (jint)offsetof(ffi_cif, flags);

	return sizeof(ffi_cif);
}

EXTERN_C_EXIT
