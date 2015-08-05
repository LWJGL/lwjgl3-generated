/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glAlphaFuncQCOMPROC) (GLenum, GLfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMAlphaTest_nglAlphaFuncQCOM(JNIEnv *__env, jclass clazz, jint func, jfloat ref, jlong __functionAddress) {
	glAlphaFuncQCOMPROC glAlphaFuncQCOM = (glAlphaFuncQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glAlphaFuncQCOM(func, ref);
}

EXTERN_C_EXIT
