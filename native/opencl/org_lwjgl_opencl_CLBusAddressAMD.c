/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "OpenCL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CLBusAddressAMD_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(cl_bus_address_amd, surface_bus_address);
	buffer[1] = (jint)offsetof(cl_bus_address_amd, marker_bus_address);

	return sizeof(cl_bus_address_amd);
}

EXTERN_C_EXIT
