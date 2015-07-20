/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glSetMultisamplefvAMDPROC) (GLenum, GLuint, const GLfloat *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDSamplePositions_nglSetMultisamplefvAMD(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong valAddress, jlong __functionAddress) {
	const GLfloat *val = (const GLfloat *)(intptr_t)valAddress;
	glSetMultisamplefvAMDPROC glSetMultisamplefvAMD = (glSetMultisamplefvAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSetMultisamplefvAMD(pname, index, val);
}

EXTERN_C_EXIT
