/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawVkImageNVPROC) (jlong, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);
typedef intptr_t (APIENTRY *glGetVkProcAddrNVPROC) (const intptr_t);
typedef void (APIENTRY *glWaitVkSemaphoreNVPROC) (jlong);
typedef void (APIENTRY *glSignalVkSemaphoreNVPROC) (jlong);
typedef void (APIENTRY *glSignalVkFenceNVPROC) (jlong);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDrawVulkanImage_nglDrawVkImageNV(JNIEnv *__env, jclass clazz, jlong vkImage, jint sampler, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat z, jfloat s0, jfloat t0, jfloat s1, jfloat t1) {
	glDrawVkImageNVPROC glDrawVkImageNV = (glDrawVkImageNVPROC)tlsGetFunction(375);
	UNUSED_PARAM(clazz)
	glDrawVkImageNV(vkImage, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_NVDrawVulkanImage_nglGetVkProcAddrNV(JNIEnv *__env, jclass clazz, jlong nameAddress) {
	glGetVkProcAddrNVPROC glGetVkProcAddrNV = (glGetVkProcAddrNVPROC)tlsGetFunction(787);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	return (jlong)glGetVkProcAddrNV(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDrawVulkanImage_nglWaitVkSemaphoreNV(JNIEnv *__env, jclass clazz, jlong vkSemaphore) {
	glWaitVkSemaphoreNVPROC glWaitVkSemaphoreNV = (glWaitVkSemaphoreNVPROC)tlsGetFunction(2084);
	UNUSED_PARAM(clazz)
	glWaitVkSemaphoreNV(vkSemaphore);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDrawVulkanImage_nglSignalVkSemaphoreNV(JNIEnv *__env, jclass clazz, jlong vkSemaphore) {
	glSignalVkSemaphoreNVPROC glSignalVkSemaphoreNV = (glSignalVkSemaphoreNVPROC)tlsGetFunction(1525);
	UNUSED_PARAM(clazz)
	glSignalVkSemaphoreNV(vkSemaphore);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDrawVulkanImage_nglSignalVkFenceNV(JNIEnv *__env, jclass clazz, jlong vkFence) {
	glSignalVkFenceNVPROC glSignalVkFenceNV = (glSignalVkFenceNVPROC)tlsGetFunction(1524);
	UNUSED_PARAM(clazz)
	glSignalVkFenceNV(vkFence);
}

EXTERN_C_EXIT
