/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glPrimitiveBoundingBoxEXTPROC) (GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTPrimitiveBoundingBox_nglPrimitiveBoundingBoxEXT(JNIEnv *__env, jclass clazz, jfloat minX, jfloat minY, jfloat minZ, jfloat minW, jfloat maxX, jfloat maxY, jfloat maxZ, jfloat maxW, jlong __functionAddress) {
	glPrimitiveBoundingBoxEXTPROC glPrimitiveBoundingBoxEXT = (glPrimitiveBoundingBoxEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPrimitiveBoundingBoxEXT(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
}

EXTERN_C_EXIT
