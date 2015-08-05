/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glPatchParameteriOESPROC) (GLenum, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTessellationShader_nglPatchParameteriOES(JNIEnv *__env, jclass clazz, jint pname, jint value, jlong __functionAddress) {
	glPatchParameteriOESPROC glPatchParameteriOES = (glPatchParameteriOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPatchParameteriOES(pname, value);
}

EXTERN_C_EXIT
