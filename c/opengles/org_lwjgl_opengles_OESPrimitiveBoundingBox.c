/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glPrimitiveBoundingBoxOESPROC) (GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESPrimitiveBoundingBox_nglPrimitiveBoundingBoxOES(JNIEnv *__env, jclass clazz, jfloat minX, jfloat minY, jfloat minZ, jfloat minW, jfloat maxX, jfloat maxY, jfloat maxZ, jfloat maxW, jlong __functionAddress) {
	glPrimitiveBoundingBoxOESPROC glPrimitiveBoundingBoxOES = (glPrimitiveBoundingBoxOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPrimitiveBoundingBoxOES(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
}

EXTERN_C_EXIT
