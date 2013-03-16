/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opencl.h"

static jmethodID CLNativeKernelFuncInvoke;

static void CALLBACK CLNativeKernelFunc(void *args) {
	JNIEnv *env = getThreadEnv();
	(*env)->CallVoidMethod(env, (jobject)args, CLNativeKernelFuncInvoke);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CLNativeKernelFunc_setup(JNIEnv *env, jclass clazz, jobject method) {
	CLNativeKernelFuncInvoke = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&CLNativeKernelFunc;
}