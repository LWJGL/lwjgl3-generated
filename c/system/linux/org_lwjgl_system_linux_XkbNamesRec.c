/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <X11/XKBlib.h>

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XkbNamesRec_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(XkbNamesRec, keycodes);
	buffer[1] = (jint)offsetof(XkbNamesRec, geometry);
	buffer[2] = (jint)offsetof(XkbNamesRec, symbols);
	buffer[3] = (jint)offsetof(XkbNamesRec, types);
	buffer[4] = (jint)offsetof(XkbNamesRec, compat);
	buffer[5] = (jint)offsetof(XkbNamesRec, vmods);
	buffer[6] = (jint)offsetof(XkbNamesRec, indicators);
	buffer[7] = (jint)offsetof(XkbNamesRec, groups);
	buffer[8] = (jint)offsetof(XkbNamesRec, keys);
	buffer[9] = (jint)offsetof(XkbNamesRec, key_aliases);
	buffer[10] = (jint)offsetof(XkbNamesRec, radio_groups);
	buffer[11] = (jint)offsetof(XkbNamesRec, phys_symbols);
	buffer[12] = (jint)offsetof(XkbNamesRec, num_keys);
	buffer[13] = (jint)offsetof(XkbNamesRec, num_key_aliases);
	buffer[14] = (jint)offsetof(XkbNamesRec, num_rg);

	return sizeof(XkbNamesRec);
}

EXTERN_C_EXIT
