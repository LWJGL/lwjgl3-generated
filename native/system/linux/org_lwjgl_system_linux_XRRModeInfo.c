/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <X11/extensions/Xrandr.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XRRModeInfo_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(XRRModeInfo, id));
	buffer[1] = (jint)(offsetof(XRRModeInfo, width));
	buffer[2] = (jint)(offsetof(XRRModeInfo, height));
	buffer[3] = (jint)(offsetof(XRRModeInfo, dotClock));
	buffer[4] = (jint)(offsetof(XRRModeInfo, hSyncStart));
	buffer[5] = (jint)(offsetof(XRRModeInfo, hSyncEnd));
	buffer[6] = (jint)(offsetof(XRRModeInfo, hTotal));
	buffer[7] = (jint)(offsetof(XRRModeInfo, hSkew));
	buffer[8] = (jint)(offsetof(XRRModeInfo, vSyncStart));
	buffer[9] = (jint)(offsetof(XRRModeInfo, vSyncEnd));
	buffer[10] = (jint)(offsetof(XRRModeInfo, vTotal));
	buffer[11] = (jint)(offsetof(XRRModeInfo, name));
	buffer[12] = (jint)(offsetof(XRRModeInfo, nameLength));
	buffer[13] = (jint)(offsetof(XRRModeInfo, modeFlags));

	return sizeof(XRRModeInfo);
}
