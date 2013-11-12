/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenAL.h"

typedef ALCvoid (APIENTRY *alBufferSubDataSOFTPROC) (ALuint, ALenum, const ALCvoid *, ALCsizei, ALCsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_openal_SOFTBufferSubData_nalBufferSubDataSOFT(JNIEnv *__env, jclass clazz, jint buffer, jint format, jlong dataAddress, jint offset, jint length, jlong __functionAddress) {
	const ALCvoid *data = (const ALCvoid *)(intptr_t)dataAddress;
	alBufferSubDataSOFTPROC alBufferSubDataSOFT = (alBufferSubDataSOFTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	alBufferSubDataSOFT(buffer, format, data, offset, length);
}

EXTERN_C_EXIT
