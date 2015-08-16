/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <stddef.h>
#include "common_tools.h"
#include "OpenCL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CLMotionEstimationDescINTEL_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(cl_motion_estimation_desc_intel, mb_block_type);
	buffer[1] = (jint)offsetof(cl_motion_estimation_desc_intel, subpixel_mode);
	buffer[2] = (jint)offsetof(cl_motion_estimation_desc_intel, sad_adjust_mode);
	buffer[3] = (jint)offsetof(cl_motion_estimation_desc_intel, search_path_type);

	return sizeof(cl_motion_estimation_desc_intel);
}

EXTERN_C_EXIT
