/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glCopyTextureLevelsAPPLEPROC) (GLuint, GLuint, GLint, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLECopyTextureLevels_nglCopyTextureLevelsAPPLE(JNIEnv *__env, jclass clazz, jint destinationTexture, jint sourceTexture, jint sourceBaseLevel, jint sourceLevelCount, jlong __functionAddress) {
	glCopyTextureLevelsAPPLEPROC glCopyTextureLevelsAPPLE = (glCopyTextureLevelsAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTextureLevelsAPPLE(destinationTexture, sourceTexture, sourceBaseLevel, sourceLevelCount);
}

EXTERN_C_EXIT
