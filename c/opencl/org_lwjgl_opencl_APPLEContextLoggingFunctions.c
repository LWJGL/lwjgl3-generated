/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"

typedef void (APIENTRY *clLogMessagesToSystemLogAPPLEPROC) (const char *, const void *, size_t, void *);
typedef void (APIENTRY *clLogMessagesToStdoutAPPLEPROC) (const char *, const void *, size_t, void *);
typedef void (APIENTRY *clLogMessagesToStderrAPPLEPROC) (const char *, const void *, size_t, void *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opencl_APPLEContextLoggingFunctions_nclLogMessagesToSystemLogAPPLE(JNIEnv *__env, jclass clazz, jlong errstrAddress, jlong private_infoAddress, jlong cb, jlong user_dataAddress, jlong __functionAddress) {
	const char *errstr = (const char *)(intptr_t)errstrAddress;
	const void *private_info = (const void *)(intptr_t)private_infoAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	clLogMessagesToSystemLogAPPLEPROC clLogMessagesToSystemLogAPPLE = (clLogMessagesToSystemLogAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	clLogMessagesToSystemLogAPPLE(errstr, private_info, (size_t)cb, user_data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opencl_APPLEContextLoggingFunctions_nclLogMessagesToStdoutAPPLE(JNIEnv *__env, jclass clazz, jlong errstrAddress, jlong private_infoAddress, jlong cb, jlong user_dataAddress, jlong __functionAddress) {
	const char *errstr = (const char *)(intptr_t)errstrAddress;
	const void *private_info = (const void *)(intptr_t)private_infoAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	clLogMessagesToStdoutAPPLEPROC clLogMessagesToStdoutAPPLE = (clLogMessagesToStdoutAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	clLogMessagesToStdoutAPPLE(errstr, private_info, (size_t)cb, user_data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opencl_APPLEContextLoggingFunctions_nclLogMessagesToStderrAPPLE(JNIEnv *__env, jclass clazz, jlong errstrAddress, jlong private_infoAddress, jlong cb, jlong user_dataAddress, jlong __functionAddress) {
	const char *errstr = (const char *)(intptr_t)errstrAddress;
	const void *private_info = (const void *)(intptr_t)private_infoAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	clLogMessagesToStderrAPPLEPROC clLogMessagesToStderrAPPLE = (clLogMessagesToStderrAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	clLogMessagesToStderrAPPLE(errstr, private_info, (size_t)cb, user_data);
}

EXTERN_C_EXIT
