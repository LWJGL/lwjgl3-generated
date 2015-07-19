/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glPolygonOffsetClampEXTPROC) (GLfloat, GLfloat, GLfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTPolygonOffsetClamp_nglPolygonOffsetClampEXT(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units, jfloat clamp, jlong __functionAddress) {
	glPolygonOffsetClampEXTPROC glPolygonOffsetClampEXT = (glPolygonOffsetClampEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPolygonOffsetClampEXT(factor, units, clamp);
}

EXTERN_C_EXIT
