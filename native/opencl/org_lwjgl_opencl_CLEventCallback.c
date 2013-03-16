/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opencl.h"

static jmethodID CLEventCallbackInvoke;

static void CALLBACK CLEventCallback(cl_event event, cl_int event_command_exec_status, void *user_data) {
	JNIEnv *env = getThreadEnv();
	(*env)->CallVoidMethod(env, (jobject)user_data, CLEventCallbackInvoke, (jlong)(intptr_t)event, event_command_exec_status);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CLEventCallback_setup(JNIEnv *env, jclass clazz, jobject method) {
	CLEventCallbackInvoke = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&CLEventCallback;
}