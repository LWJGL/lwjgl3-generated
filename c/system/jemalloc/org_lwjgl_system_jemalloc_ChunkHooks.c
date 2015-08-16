/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <stddef.h>
#include "common_tools.h"
DISABLE_WARNINGS()
#include "jemalloc.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jemalloc_ChunkHooks_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(chunk_hooks_t, alloc);
	buffer[1] = (jint)offsetof(chunk_hooks_t, dalloc);
	buffer[2] = (jint)offsetof(chunk_hooks_t, commit);
	buffer[3] = (jint)offsetof(chunk_hooks_t, decommit);
	buffer[4] = (jint)offsetof(chunk_hooks_t, purge);
	buffer[5] = (jint)offsetof(chunk_hooks_t, split);
	buffer[6] = (jint)offsetof(chunk_hooks_t, merge);

	return sizeof(chunk_hooks_t);
}

EXTERN_C_EXIT
