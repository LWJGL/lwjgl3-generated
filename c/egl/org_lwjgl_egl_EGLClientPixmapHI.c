/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
DISABLE_WARNINGS()
#include "EGL/egl.h"
#include "EGL/eglext.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_egl_EGLClientPixmapHI_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(struct EGLClientPixmapHI, pData);
	buffer[1] = (jint)offsetof(struct EGLClientPixmapHI, iWidth);
	buffer[2] = (jint)offsetof(struct EGLClientPixmapHI, iHeight);
	buffer[3] = (jint)offsetof(struct EGLClientPixmapHI, iStride);

	return sizeof(struct EGLClientPixmapHI);
}

EXTERN_C_EXIT
