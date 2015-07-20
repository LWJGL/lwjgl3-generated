/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glStencilOpValueAMDPROC) (GLenum, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDStencilOperationExtended_nglStencilOpValueAMD(JNIEnv *__env, jclass clazz, jint face, jint value, jlong __functionAddress) {
	glStencilOpValueAMDPROC glStencilOpValueAMD = (glStencilOpValueAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilOpValueAMD(face, value);
}

EXTERN_C_EXIT
