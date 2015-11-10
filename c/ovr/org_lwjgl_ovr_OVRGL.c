/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "OVR_CAPI_GL.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1CreateSwapTextureSetGL(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint format, jint width, jint height, jlong outTextureSetAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrSwapTextureSet **outTextureSet = (ovrSwapTextureSet **)(intptr_t)outTextureSetAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_CreateSwapTextureSetGL(session, format, width, height, outTextureSet);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1CreateMirrorTextureGL(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint format, jint width, jint height, jlong outMirrorTextureAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrTexture **outMirrorTexture = (ovrTexture **)(intptr_t)outMirrorTextureAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_CreateMirrorTextureGL(session, format, width, height, outMirrorTexture);
}

EXTERN_C_EXIT
