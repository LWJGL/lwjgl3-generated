/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XEvent_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(XEvent, type));
	buffer[1] = (jint)(offsetof(XEvent, xany));
	buffer[2] = (jint)(offsetof(XEvent, xkey));
	buffer[3] = (jint)(offsetof(XEvent, xbutton));
	buffer[4] = (jint)(offsetof(XEvent, xmotion));
	buffer[5] = (jint)(offsetof(XEvent, xconfigure));
	buffer[6] = (jint)(offsetof(XEvent, xproperty));
	buffer[7] = (jint)(offsetof(XEvent, xselectionrequest));
	buffer[8] = (jint)(offsetof(XEvent, xselection));
	buffer[9] = (jint)(offsetof(XEvent, xclient));
	buffer[10] = (jint)(offsetof(XEvent, xerror));
	buffer[11] = (jint)(offsetof(XEvent, xcookie));

	return sizeof(XEvent);
}

EXTERN_C_EXIT
