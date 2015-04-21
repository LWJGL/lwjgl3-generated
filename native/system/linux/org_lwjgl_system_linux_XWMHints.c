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

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XWMHints_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(XWMHints, flags);
	buffer[1] = (jint)offsetof(XWMHints, input);
	buffer[2] = (jint)offsetof(XWMHints, initial_state);
	buffer[3] = (jint)offsetof(XWMHints, icon_pixmap);
	buffer[4] = (jint)offsetof(XWMHints, icon_window);
	buffer[5] = (jint)offsetof(XWMHints, icon_x);
	buffer[6] = (jint)offsetof(XWMHints, icon_y);
	buffer[7] = (jint)offsetof(XWMHints, icon_mask);
	buffer[8] = (jint)offsetof(XWMHints, window_group);

	return sizeof(XWMHints);
}

EXTERN_C_EXIT
