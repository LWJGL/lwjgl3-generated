/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "WindowsLWJGL.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_JOYCAPS_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(JOYCAPS, wMid);
	buffer[1] = (jint)offsetof(JOYCAPS, wPid);
	buffer[2] = (jint)offsetof(JOYCAPS, szPname);
	buffer[3] = (jint)offsetof(JOYCAPS, wXmin);
	buffer[4] = (jint)offsetof(JOYCAPS, wXmax);
	buffer[5] = (jint)offsetof(JOYCAPS, wYmin);
	buffer[6] = (jint)offsetof(JOYCAPS, wYmax);
	buffer[7] = (jint)offsetof(JOYCAPS, wZmin);
	buffer[8] = (jint)offsetof(JOYCAPS, wZmax);
	buffer[9] = (jint)offsetof(JOYCAPS, wNumButtons);
	buffer[10] = (jint)offsetof(JOYCAPS, wPeriodMin);
	buffer[11] = (jint)offsetof(JOYCAPS, wPeriodMax);
	buffer[12] = (jint)offsetof(JOYCAPS, wRmin);
	buffer[13] = (jint)offsetof(JOYCAPS, wRmax);
	buffer[14] = (jint)offsetof(JOYCAPS, wUmin);
	buffer[15] = (jint)offsetof(JOYCAPS, wUmax);
	buffer[16] = (jint)offsetof(JOYCAPS, wVmin);
	buffer[17] = (jint)offsetof(JOYCAPS, wVmax);
	buffer[18] = (jint)offsetof(JOYCAPS, wCaps);
	buffer[19] = (jint)offsetof(JOYCAPS, wMaxAxes);
	buffer[20] = (jint)offsetof(JOYCAPS, wNumAxes);
	buffer[21] = (jint)offsetof(JOYCAPS, wMaxButtons);
	buffer[22] = (jint)offsetof(JOYCAPS, szRegKey);
	buffer[23] = (jint)offsetof(JOYCAPS, szOEMVxD);

	return sizeof(JOYCAPS);
}

EXTERN_C_EXIT
