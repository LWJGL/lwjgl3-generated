/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glPatchParameteriEXTPROC) (GLenum, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTessellationShader_nglPatchParameteriEXT(JNIEnv *__env, jclass clazz, jint pname, jint value, jlong __functionAddress) {
	glPatchParameteriEXTPROC glPatchParameteriEXT = (glPatchParameteriEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPatchParameteriEXT(pname, value);
}

EXTERN_C_EXIT
