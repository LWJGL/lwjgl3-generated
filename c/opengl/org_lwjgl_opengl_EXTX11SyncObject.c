/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLsync (APIENTRY *glImportSyncEXTPROC) (GLenum, GLintptr, GLbitfield);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_EXTX11SyncObject_nglImportSyncEXT(JNIEnv *__env, jclass clazz, jint external_sync_type, jlong external_sync, jint flags, jlong __functionAddress) {
	glImportSyncEXTPROC glImportSyncEXT = (glImportSyncEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glImportSyncEXT(external_sync_type, (GLintptr)external_sync, flags);
}

EXTERN_C_EXIT
