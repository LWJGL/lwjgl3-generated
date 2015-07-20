/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glVertexAttribParameteriAMDPROC) (GLuint, GLenum, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDInterleavedElements_nglVertexAttribParameteriAMD(JNIEnv *__env, jclass clazz, jint index, jint pname, jint param, jlong __functionAddress) {
	glVertexAttribParameteriAMDPROC glVertexAttribParameteriAMD = (glVertexAttribParameteriAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribParameteriAMD(index, pname, param);
}

EXTERN_C_EXIT
