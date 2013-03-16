/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opencl.h"

static jmethodID CLProgramCallbackInvoke;

static void CALLBACK CLProgramCallback(cl_program program, void *user_data) {
	JNIEnv *env = getThreadEnv();
	(*env)->CallVoidMethod(env, (jobject)user_data, CLProgramCallbackInvoke, (jlong)(intptr_t)program);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CLProgramCallback_setup(JNIEnv *env, jclass clazz, jobject method) {
	CLProgramCallbackInvoke = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&CLProgramCallback;
}