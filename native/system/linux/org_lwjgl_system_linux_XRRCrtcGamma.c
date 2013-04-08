/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XRRCrtcGamma_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XRRCrtcGamma, size));
	buffer[1] = (jint)(offsetof(XRRCrtcGamma, red));
	buffer[2] = (jint)(offsetof(XRRCrtcGamma, green));
	buffer[3] = (jint)(offsetof(XRRCrtcGamma, blue));

	return sizeof(XRRCrtcGamma);
}