/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <stddef.h>
#include "common_tools.h"
#include <GL/glx.h>
#include "GLX.h"

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXStereoNotifyEventEXT_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(GLXStereoNotifyEventEXT, type);
	buffer[1] = (jint)offsetof(GLXStereoNotifyEventEXT, serial);
	buffer[2] = (jint)offsetof(GLXStereoNotifyEventEXT, send_event);
	buffer[3] = (jint)offsetof(GLXStereoNotifyEventEXT, display);
	buffer[4] = (jint)offsetof(GLXStereoNotifyEventEXT, extension);
	buffer[5] = (jint)offsetof(GLXStereoNotifyEventEXT, evtype);
	buffer[6] = (jint)offsetof(GLXStereoNotifyEventEXT, window);
	buffer[7] = (jint)offsetof(GLXStereoNotifyEventEXT, stereo_tree);

	return sizeof(GLXStereoNotifyEventEXT);
}

EXTERN_C_EXIT
