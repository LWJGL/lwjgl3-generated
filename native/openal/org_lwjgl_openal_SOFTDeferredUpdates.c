/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenAL.h"

typedef ALvoid (APIENTRY *alDeferUpdatesSOFTPROC) (void);
typedef ALvoid (APIENTRY *alProcessUpdatesSOFTPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTDeferredUpdates_nalDeferUpdatesSOFT(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	alDeferUpdatesSOFTPROC alDeferUpdatesSOFT = (alDeferUpdatesSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alDeferUpdatesSOFT();
}

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTDeferredUpdates_nalProcessUpdatesSOFT(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	alProcessUpdatesSOFTPROC alProcessUpdatesSOFT = (alProcessUpdatesSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alProcessUpdatesSOFT();
}

EXTERN_C_EXIT
