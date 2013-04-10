/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "OpenCL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_cl_1bus_1address_1amd_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(cl_bus_address_amd, surface_bus_address));
	buffer[1] = (jint)(offsetof(cl_bus_address_amd, marker_bus_address));

	return sizeof(cl_bus_address_amd);
}