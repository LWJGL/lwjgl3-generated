/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XSetWindowAttributes_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(XSetWindowAttributes, background_pixmap));
	buffer[1] = (jint)(offsetof(XSetWindowAttributes, background_pixel));
	buffer[2] = (jint)(offsetof(XSetWindowAttributes, border_pixmap));
	buffer[3] = (jint)(offsetof(XSetWindowAttributes, border_pixel));
	buffer[4] = (jint)(offsetof(XSetWindowAttributes, bit_gravity));
	buffer[5] = (jint)(offsetof(XSetWindowAttributes, win_gravity));
	buffer[6] = (jint)(offsetof(XSetWindowAttributes, backing_store));
	buffer[7] = (jint)(offsetof(XSetWindowAttributes, backing_planes));
	buffer[8] = (jint)(offsetof(XSetWindowAttributes, backing_pixel));
	buffer[9] = (jint)(offsetof(XSetWindowAttributes, save_under));
	buffer[10] = (jint)(offsetof(XSetWindowAttributes, event_mask));
	buffer[11] = (jint)(offsetof(XSetWindowAttributes, do_not_propagate_mask));
	buffer[12] = (jint)(offsetof(XSetWindowAttributes, override_redirect));
	buffer[13] = (jint)(offsetof(XSetWindowAttributes, colormap));
	buffer[14] = (jint)(offsetof(XSetWindowAttributes, cursor));

	return sizeof(XSetWindowAttributes);
}
