/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glStartTilingQCOMPROC) (GLuint, GLuint, GLuint, GLuint, GLbitfield);
typedef void (APIENTRY *glEndTilingQCOMPROC) (GLbitfield);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMTiledRendering_nglStartTilingQCOM(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint preserveMask, jlong __functionAddress) {
	glStartTilingQCOMPROC glStartTilingQCOM = (glStartTilingQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStartTilingQCOM(x, y, width, height, preserveMask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMTiledRendering_nglEndTilingQCOM(JNIEnv *__env, jclass clazz, jint preserveMask, jlong __functionAddress) {
	glEndTilingQCOMPROC glEndTilingQCOM = (glEndTilingQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndTilingQCOM(preserveMask);
}

EXTERN_C_EXIT
