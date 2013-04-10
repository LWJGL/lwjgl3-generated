/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <sys/time.h>
#include <time.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Time_nclock_1getres(JNIEnv *__env, jclass clazz, jint clk_id, jlong resAddress) {
	struct timespec *res = (struct timespec *)(intptr_t)resAddress;
	return (jint)clock_getres(clk_id, res);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Time_nclock_1gettime(JNIEnv *__env, jclass clazz, jint clk_id, jlong tpAddress) {
	struct timespec *tp = (struct timespec *)(intptr_t)tpAddress;
	return (jint)clock_gettime(clk_id, tp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Time_ngettimeofday(JNIEnv *__env, jclass clazz, jlong tvAddress, jlong tzAddress) {
	struct timeval *tv = (struct timeval *)(intptr_t)tvAddress;
	struct timezone *tz = (struct timezone *)(intptr_t)tzAddress;
	return (jint)gettimeofday(tv, tz);
}