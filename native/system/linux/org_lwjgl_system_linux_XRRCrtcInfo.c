/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <X11/extensions/Xrandr.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XRRCrtcInfo_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(XRRCrtcInfo, timestamp));
	buffer[1] = (jint)(offsetof(XRRCrtcInfo, x));
	buffer[2] = (jint)(offsetof(XRRCrtcInfo, y));
	buffer[3] = (jint)(offsetof(XRRCrtcInfo, width));
	buffer[4] = (jint)(offsetof(XRRCrtcInfo, height));
	buffer[5] = (jint)(offsetof(XRRCrtcInfo, mode));
	buffer[6] = (jint)(offsetof(XRRCrtcInfo, rotation));
	buffer[7] = (jint)(offsetof(XRRCrtcInfo, noutput));
	buffer[8] = (jint)(offsetof(XRRCrtcInfo, outputs));
	buffer[9] = (jint)(offsetof(XRRCrtcInfo, rotations));
	buffer[10] = (jint)(offsetof(XRRCrtcInfo, npossible));
	buffer[11] = (jint)(offsetof(XRRCrtcInfo, possible));

	return sizeof(XRRCrtcInfo);
}
