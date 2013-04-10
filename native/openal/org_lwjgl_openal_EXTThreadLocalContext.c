/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenAL.h"

typedef ALCboolean (APIENTRY *alcSetThreadContextPROC) (ALCcontext *);
typedef ALCcontext * (APIENTRY *alcGetThreadContextPROC) (void);

JNIEXPORT jboolean JNICALL Java_org_lwjgl_openal_EXTThreadLocalContext_nalcSetThreadContext(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
	ALCcontext *context = (ALCcontext *)(intptr_t)contextAddress;
	alcSetThreadContextPROC alcSetThreadContext = (alcSetThreadContextPROC)(intptr_t)__functionAddress;
	return (jboolean)alcSetThreadContext(context);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_openal_EXTThreadLocalContext_nalcGetThreadContext(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	alcGetThreadContextPROC alcGetThreadContext = (alcGetThreadContextPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)alcGetThreadContext();
}