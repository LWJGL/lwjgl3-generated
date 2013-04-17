/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <X11/extensions/XInput2.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XIModifierState_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XIModifierState, base));
	buffer[1] = (jint)(offsetof(XIModifierState, latched));
	buffer[2] = (jint)(offsetof(XIModifierState, locked));
	buffer[3] = (jint)(offsetof(XIModifierState, effective));

	return sizeof(XIModifierState);
}