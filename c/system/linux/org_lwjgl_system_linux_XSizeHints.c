/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <X11/Xutil.h>

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XSizeHints_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(XSizeHints, flags);
	buffer[1] = (jint)offsetof(XSizeHints, x);
	buffer[2] = (jint)offsetof(XSizeHints, y);
	buffer[3] = (jint)offsetof(XSizeHints, width);
	buffer[4] = (jint)offsetof(XSizeHints, height);
	buffer[5] = (jint)offsetof(XSizeHints, min_width);
	buffer[6] = (jint)offsetof(XSizeHints, min_height);
	buffer[7] = (jint)offsetof(XSizeHints, max_width);
	buffer[8] = (jint)offsetof(XSizeHints, max_height);
	buffer[9] = (jint)offsetof(XSizeHints, width_inc);
	buffer[10] = (jint)offsetof(XSizeHints, height_inc);
	buffer[11] = (jint)offsetof(XSizeHints, min_aspect);
	buffer[12] = (jint)offsetof(XSizeHints, min_aspect.x);
	buffer[13] = (jint)offsetof(XSizeHints, min_aspect.y);
	buffer[14] = (jint)offsetof(XSizeHints, max_aspect);
	buffer[15] = (jint)offsetof(XSizeHints, max_aspect.x);
	buffer[16] = (jint)offsetof(XSizeHints, max_aspect.y);
	buffer[17] = (jint)offsetof(XSizeHints, base_width);
	buffer[18] = (jint)offsetof(XSizeHints, base_height);
	buffer[19] = (jint)offsetof(XSizeHints, win_gravity);

	return sizeof(XSizeHints);
}

EXTERN_C_EXIT
