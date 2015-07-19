/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glQueryObjectParameteruiAMDPROC) (GLenum, GLuint, GLenum, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDOcclusionQueryEvent_nglQueryObjectParameteruiAMD(JNIEnv *__env, jclass clazz, jint target, jint id, jint pname, jint param, jlong __functionAddress) {
	glQueryObjectParameteruiAMDPROC glQueryObjectParameteruiAMD = (glQueryObjectParameteruiAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glQueryObjectParameteruiAMD(target, id, pname, param);
}

EXTERN_C_EXIT
