/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XWindowAttributes_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XWindowAttributes, x));
	buffer[1] = (jint)(offsetof(XWindowAttributes, y));
	buffer[2] = (jint)(offsetof(XWindowAttributes, width));
	buffer[3] = (jint)(offsetof(XWindowAttributes, height));
	buffer[4] = (jint)(offsetof(XWindowAttributes, border_width));
	buffer[5] = (jint)(offsetof(XWindowAttributes, depth));
	buffer[6] = (jint)(offsetof(XWindowAttributes, visual));
	buffer[7] = (jint)(offsetof(XWindowAttributes, root));
	buffer[8] = (jint)(offsetof(XWindowAttributes, class));
	buffer[9] = (jint)(offsetof(XWindowAttributes, bit_gravity));
	buffer[10] = (jint)(offsetof(XWindowAttributes, win_gravity));
	buffer[11] = (jint)(offsetof(XWindowAttributes, backing_store));
	buffer[12] = (jint)(offsetof(XWindowAttributes, backing_planes));
	buffer[13] = (jint)(offsetof(XWindowAttributes, backing_pixel));
	buffer[14] = (jint)(offsetof(XWindowAttributes, save_under));
	buffer[15] = (jint)(offsetof(XWindowAttributes, colormap));
	buffer[16] = (jint)(offsetof(XWindowAttributes, map_installed));
	buffer[17] = (jint)(offsetof(XWindowAttributes, map_state));
	buffer[18] = (jint)(offsetof(XWindowAttributes, all_event_masks));
	buffer[19] = (jint)(offsetof(XWindowAttributes, your_event_mask));
	buffer[20] = (jint)(offsetof(XWindowAttributes, do_not_propagate_mask));
	buffer[21] = (jint)(offsetof(XWindowAttributes, override_redirect));
	buffer[22] = (jint)(offsetof(XWindowAttributes, screen));

	return sizeof(XWindowAttributes);
}