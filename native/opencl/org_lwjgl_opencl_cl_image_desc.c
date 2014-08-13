/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "OpenCL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_cl_1image_1desc_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(cl_image_desc, image_type));
	buffer[1] = (jint)(offsetof(cl_image_desc, image_width));
	buffer[2] = (jint)(offsetof(cl_image_desc, image_height));
	buffer[3] = (jint)(offsetof(cl_image_desc, image_depth));
	buffer[4] = (jint)(offsetof(cl_image_desc, image_array_size));
	buffer[5] = (jint)(offsetof(cl_image_desc, image_row_pitch));
	buffer[6] = (jint)(offsetof(cl_image_desc, image_slice_pitch));
	buffer[7] = (jint)(offsetof(cl_image_desc, num_mip_levels));
	buffer[8] = (jint)(offsetof(cl_image_desc, num_samples));
	buffer[9] = (jint)(offsetof(cl_image_desc, buffer));
	buffer[10] = (jint)(offsetof(cl_image_desc, mem_object));

	return sizeof(cl_image_desc);
}

EXTERN_C_EXIT
