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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1CreateTextureSwapChainGL(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong descAddress, jlong out_TextureSwapChainAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const ovrTextureSwapChainDesc *desc = (const ovrTextureSwapChainDesc *)(intptr_t)descAddress;
	ovrTextureSwapChain *out_TextureSwapChain = (ovrTextureSwapChain *)(intptr_t)out_TextureSwapChainAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_CreateTextureSwapChainGL(session, desc, out_TextureSwapChain);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1GetTextureSwapChainBufferGL__JJIJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jint index, jlong out_TexIdAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
	unsigned int *out_TexId = (unsigned int *)(intptr_t)out_TexIdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetTextureSwapChainBufferGL(session, chain, index, out_TexId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1CreateMirrorTextureGL(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong descAddress, jlong out_MirrorTextureAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	const ovrMirrorTextureDesc *desc = (const ovrMirrorTextureDesc *)(intptr_t)descAddress;
	ovrMirrorTexture *out_MirrorTexture = (ovrMirrorTexture *)(intptr_t)out_MirrorTextureAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_CreateMirrorTextureGL(session, desc, out_MirrorTexture);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1GetMirrorTextureBufferGL__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong mirrorTextureAddress, jlong out_TexIdAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrMirrorTexture mirrorTexture = (ovrMirrorTexture)(intptr_t)mirrorTextureAddress;
	unsigned int *out_TexId = (unsigned int *)(intptr_t)out_TexIdAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ovr_GetMirrorTextureBufferGL(session, mirrorTexture, out_TexId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1GetTextureSwapChainBufferGL__JJI_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jint index, jintArray out_TexIdAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
	jint __result;
	jint *out_TexId = (*__env)->GetPrimitiveArrayCritical(__env, out_TexIdAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)ovr_GetTextureSwapChainBufferGL(session, chain, index, (unsigned int*)out_TexId);
	(*__env)->ReleasePrimitiveArrayCritical(__env, out_TexIdAddress, out_TexId, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetTextureSwapChainBufferGL__JJI_3I(jlong sessionAddress, jlong chainAddress, jint index, jint out_TexId__length, jint* out_TexId) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
	UNUSED_PARAM(out_TexId__length)
	return (jint)ovr_GetTextureSwapChainBufferGL(session, chain, index, (unsigned int*)out_TexId);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1GetMirrorTextureBufferGL__JJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong mirrorTextureAddress, jintArray out_TexIdAddress) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrMirrorTexture mirrorTexture = (ovrMirrorTexture)(intptr_t)mirrorTextureAddress;
	jint __result;
	jint *out_TexId = (*__env)->GetPrimitiveArrayCritical(__env, out_TexIdAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)ovr_GetMirrorTextureBufferGL(session, mirrorTexture, (unsigned int*)out_TexId);
	(*__env)->ReleasePrimitiveArrayCritical(__env, out_TexIdAddress, out_TexId, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetMirrorTextureBufferGL__JJ_3I(jlong sessionAddress, jlong mirrorTextureAddress, jint out_TexId__length, jint* out_TexId) {
	ovrSession session = (ovrSession)(intptr_t)sessionAddress;
	ovrMirrorTexture mirrorTexture = (ovrMirrorTexture)(intptr_t)mirrorTextureAddress;
	UNUSED_PARAM(out_TexId__length)
	return (jint)ovr_GetMirrorTextureBufferGL(session, mirrorTexture, (unsigned int*)out_TexId);
}

EXTERN_C_EXIT
