/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opencl.h"

static jmethodID CLMemObjectDestructorCallbackInvoke;

static void CALLBACK CLMemObjectDestructorCallback(cl_mem memobj, void *user_data) {
	JNIEnv *env = getThreadEnv();
	(*env)->CallVoidMethod(env, (jobject)user_data, CLMemObjectDestructorCallbackInvoke, (jlong)(intptr_t)memobj);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CLMemObjectDestructorCallback_setup(JNIEnv *env, jclass clazz, jobject method) {
	CLMemObjectDestructorCallbackInvoke = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&CLMemObjectDestructorCallback;
}