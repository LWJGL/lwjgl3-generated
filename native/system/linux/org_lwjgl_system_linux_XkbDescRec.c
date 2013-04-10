/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <X11/XKBlib.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XkbDescRec_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XkbDescRec, dpy));
	buffer[1] = (jint)(offsetof(XkbDescRec, device_spec));
	buffer[2] = (jint)(offsetof(XkbDescRec, min_key_code));
	buffer[3] = (jint)(offsetof(XkbDescRec, max_key_code));

	return sizeof(XkbDescRec);
}