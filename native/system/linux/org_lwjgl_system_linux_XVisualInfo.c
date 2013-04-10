/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <X11/Xutil.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XVisualInfo_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XVisualInfo, visual));
	buffer[1] = (jint)(offsetof(XVisualInfo, visualid));
	buffer[2] = (jint)(offsetof(XVisualInfo, screen));
	buffer[3] = (jint)(offsetof(XVisualInfo, depth));
	buffer[4] = (jint)(offsetof(XVisualInfo, class));
	buffer[5] = (jint)(offsetof(XVisualInfo, red_mask));
	buffer[6] = (jint)(offsetof(XVisualInfo, green_mask));
	buffer[7] = (jint)(offsetof(XVisualInfo, blue_mask));
	buffer[8] = (jint)(offsetof(XVisualInfo, colormap_size));
	buffer[9] = (jint)(offsetof(XVisualInfo, bits_per_rgb));

	return sizeof(XVisualInfo);
}