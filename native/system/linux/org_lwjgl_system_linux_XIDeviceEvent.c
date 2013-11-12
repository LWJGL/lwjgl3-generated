/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <X11/extensions/XInput2.h>

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_XIDeviceEvent_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)(offsetof(XIDeviceEvent, type));
	buffer[1] = (jint)(offsetof(XIDeviceEvent, serial));
	buffer[2] = (jint)(offsetof(XIDeviceEvent, send_event));
	buffer[3] = (jint)(offsetof(XIDeviceEvent, display));
	buffer[4] = (jint)(offsetof(XIDeviceEvent, extension));
	buffer[5] = (jint)(offsetof(XIDeviceEvent, evtype));
	buffer[6] = (jint)(offsetof(XIDeviceEvent, time));
	buffer[7] = (jint)(offsetof(XIDeviceEvent, deviceid));
	buffer[8] = (jint)(offsetof(XIDeviceEvent, sourceid));
	buffer[9] = (jint)(offsetof(XIDeviceEvent, detail));
	buffer[10] = (jint)(offsetof(XIDeviceEvent, root));
	buffer[11] = (jint)(offsetof(XIDeviceEvent, event));
	buffer[12] = (jint)(offsetof(XIDeviceEvent, child));
	buffer[13] = (jint)(offsetof(XIDeviceEvent, root_x));
	buffer[14] = (jint)(offsetof(XIDeviceEvent, root_y));
	buffer[15] = (jint)(offsetof(XIDeviceEvent, event_x));
	buffer[16] = (jint)(offsetof(XIDeviceEvent, event_y));
	buffer[17] = (jint)(offsetof(XIDeviceEvent, flags));
	buffer[18] = (jint)(offsetof(XIDeviceEvent, buttons));
	buffer[19] = (jint)(offsetof(XIDeviceEvent, valuators));
	buffer[20] = (jint)(offsetof(XIDeviceEvent, mods));
	buffer[21] = (jint)(offsetof(XIDeviceEvent, group));

	return sizeof(XIDeviceEvent);
}

EXTERN_C_EXIT
