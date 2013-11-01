/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "OpenCL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_cl_1buffer_1region_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(cl_buffer_region, origin));
	buffer[1] = (jint)(offsetof(cl_buffer_region, size));

	return sizeof(cl_buffer_region);
}
