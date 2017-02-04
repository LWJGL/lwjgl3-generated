/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferSampleLocationsfvNVPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glNamedFramebufferSampleLocationsfvNVPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glResolveDepthValuesNVPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVSampleLocations_nglFramebufferSampleLocationsfvNV__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint start, jint count, jlong vAddress) {
	glFramebufferSampleLocationsfvNVPROC glFramebufferSampleLocationsfvNV = (glFramebufferSampleLocationsfvNVPROC)tlsGetFunction(222);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glFramebufferSampleLocationsfvNV(target, start, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVSampleLocations_nglNamedFramebufferSampleLocationsfvNV__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint start, jint count, jlong vAddress) {
	glNamedFramebufferSampleLocationsfvNVPROC glNamedFramebufferSampleLocationsfvNV = (glNamedFramebufferSampleLocationsfvNVPROC)tlsGetFunction(454);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glNamedFramebufferSampleLocationsfvNV(framebuffer, start, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVSampleLocations_glResolveDepthValuesNV(JNIEnv *__env, jclass clazz) {
	glResolveDepthValuesNVPROC glResolveDepthValuesNV = (glResolveDepthValuesNVPROC)tlsGetFunction(601);
	UNUSED_PARAM(clazz)
	glResolveDepthValuesNV();
}

EXTERN_C_EXIT
