/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "LinuxLWJGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XGenericEventCookie_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(XGenericEventCookie, type));
	buffer[1] = (jint)(offsetof(XGenericEventCookie, serial));
	buffer[2] = (jint)(offsetof(XGenericEventCookie, send_event));
	buffer[3] = (jint)(offsetof(XGenericEventCookie, display));
	buffer[4] = (jint)(offsetof(XGenericEventCookie, extension));
	buffer[5] = (jint)(offsetof(XGenericEventCookie, evtype));
	buffer[6] = (jint)(offsetof(XGenericEventCookie, cookie));
	buffer[7] = (jint)(offsetof(XGenericEventCookie, data));

	return sizeof(XGenericEventCookie);
}