/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glPolygonModeNVPROC) (GLenum, GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPolygonMode_nglPolygonModeNV(JNIEnv *__env, jclass clazz, jint face, jint mode, jlong __functionAddress) {
	glPolygonModeNVPROC glPolygonModeNV = (glPolygonModeNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPolygonModeNV(face, mode);
}

EXTERN_C_EXIT
