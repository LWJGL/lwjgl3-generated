/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XRROutputInfo_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XRROutputInfo, timestamp));
	buffer[1] = (jint)(offsetof(XRROutputInfo, crtc));
	buffer[2] = (jint)(offsetof(XRROutputInfo, name));
	buffer[3] = (jint)(offsetof(XRROutputInfo, nameLen));
	buffer[4] = (jint)(offsetof(XRROutputInfo, mm_width));
	buffer[5] = (jint)(offsetof(XRROutputInfo, mm_height));
	buffer[6] = (jint)(offsetof(XRROutputInfo, connection));
	buffer[7] = (jint)(offsetof(XRROutputInfo, subpixel_order));
	buffer[8] = (jint)(offsetof(XRROutputInfo, ncrtc));
	buffer[9] = (jint)(offsetof(XRROutputInfo, crtcs));
	buffer[10] = (jint)(offsetof(XRROutputInfo, nclone));
	buffer[11] = (jint)(offsetof(XRROutputInfo, clones));
	buffer[12] = (jint)(offsetof(XRROutputInfo, nmode));
	buffer[13] = (jint)(offsetof(XRROutputInfo, npreferred));

	return sizeof(XRROutputInfo);
}