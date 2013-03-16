/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opencl.h"

static jmethodID CLCreateContextCallbackInvoke;

static void CALLBACK CLCreateContextCallback(const cl_char *errinfo, const void *private_info, size_t cb, void *user_data) {
	JNIEnv *env = getThreadEnv();
	(*env)->CallVoidMethod(env, (jobject)user_data, CLCreateContextCallbackInvoke, (jlong)(intptr_t)errinfo, (jlong)(intptr_t)private_info, cb);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CLCreateContextCallback_setup(JNIEnv *env, jclass clazz, jobject method) {
	CLCreateContextCallbackInvoke = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&CLCreateContextCallback;
}