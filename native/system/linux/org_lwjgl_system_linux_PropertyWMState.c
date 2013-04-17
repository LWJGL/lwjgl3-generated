/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <X11/Xmd.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_PropertyWMState_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	typedef struct PropertyWMState {
		CARD32 state;
		Window icon;
	} PropertyWMState;

	buffer[0] = (jint)(offsetof(PropertyWMState, state));
	buffer[1] = (jint)(offsetof(PropertyWMState, icon));

	return sizeof(PropertyWMState);
}