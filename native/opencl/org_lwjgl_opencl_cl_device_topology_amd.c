/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "OpenCL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_cl_1device_1topology_1amd_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(cl_device_topology_amd, raw));
	buffer[1] = (jint)(offsetof(cl_device_topology_amd, raw.type));
	buffer[2] = (jint)(offsetof(cl_device_topology_amd, raw.data));
	buffer[3] = (jint)(offsetof(cl_device_topology_amd, pcie));
	buffer[4] = (jint)(offsetof(cl_device_topology_amd, pcie.type));
	buffer[5] = (jint)(offsetof(cl_device_topology_amd, pcie.unused));
	buffer[6] = (jint)(offsetof(cl_device_topology_amd, pcie.bus));
	buffer[7] = (jint)(offsetof(cl_device_topology_amd, pcie.device));
	buffer[8] = (jint)(offsetof(cl_device_topology_amd, pcie.function));

	return sizeof(cl_device_topology_amd);
}

EXTERN_C_EXIT
