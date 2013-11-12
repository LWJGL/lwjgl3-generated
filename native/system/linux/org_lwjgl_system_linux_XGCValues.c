/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XGCValues_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(XGCValues, function));
	buffer[1] = (jint)(offsetof(XGCValues, plane_mask));
	buffer[2] = (jint)(offsetof(XGCValues, foreground));
	buffer[3] = (jint)(offsetof(XGCValues, background));
	buffer[4] = (jint)(offsetof(XGCValues, line_width));
	buffer[5] = (jint)(offsetof(XGCValues, line_style));
	buffer[6] = (jint)(offsetof(XGCValues, cap_style));
	buffer[7] = (jint)(offsetof(XGCValues, join_style));
	buffer[8] = (jint)(offsetof(XGCValues, fill_style));
	buffer[9] = (jint)(offsetof(XGCValues, fill_rule));
	buffer[10] = (jint)(offsetof(XGCValues, arc_mode));
	buffer[11] = (jint)(offsetof(XGCValues, tile));
	buffer[12] = (jint)(offsetof(XGCValues, stipple));
	buffer[13] = (jint)(offsetof(XGCValues, ts_x_origin));
	buffer[14] = (jint)(offsetof(XGCValues, ts_y_origin));
	buffer[15] = (jint)(offsetof(XGCValues, font));
	buffer[16] = (jint)(offsetof(XGCValues, subwindow_mode));
	buffer[17] = (jint)(offsetof(XGCValues, graphics_exposures));
	buffer[18] = (jint)(offsetof(XGCValues, clip_x_origin));
	buffer[19] = (jint)(offsetof(XGCValues, clip_y_origin));
	buffer[20] = (jint)(offsetof(XGCValues, clip_mask));
	buffer[21] = (jint)(offsetof(XGCValues, dash_offset));
	buffer[22] = (jint)(offsetof(XGCValues, dashes));

	return sizeof(XGCValues);
}

EXTERN_C_EXIT
