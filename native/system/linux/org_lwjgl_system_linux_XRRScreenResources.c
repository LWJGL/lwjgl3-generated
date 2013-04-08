/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XRRScreenResources_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XRRScreenResources, timestamp));
	buffer[1] = (jint)(offsetof(XRRScreenResources, configTimestamp));
	buffer[2] = (jint)(offsetof(XRRScreenResources, ncrtc));
	buffer[3] = (jint)(offsetof(XRRScreenResources, crtcs));
	buffer[4] = (jint)(offsetof(XRRScreenResources, noutput));
	buffer[5] = (jint)(offsetof(XRRScreenResources, outputs));
	buffer[6] = (jint)(offsetof(XRRScreenResources, nmode));
	buffer[7] = (jint)(offsetof(XRRScreenResources, modes));

	return sizeof(XRRScreenResources);
}