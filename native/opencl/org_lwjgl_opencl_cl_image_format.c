/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "opencl.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_cl_1image_1format_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(cl_image_format, image_channel_order));
	buffer[1] = (jint)(offsetof(cl_image_format, image_channel_data_type));

	return sizeof(cl_image_format);
}