/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glVertexArrayRangeNVPROC) (GLsizei, void *);
typedef void (APIENTRY *glFlushVertexArrayRangeNVPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexArrayRange_nglVertexArrayRangeNV(JNIEnv *__env, jclass clazz, jint length, jlong pointerAddress, jlong __functionAddress) {
	void *pointer = (void *)(intptr_t)pointerAddress;
	glVertexArrayRangeNVPROC glVertexArrayRangeNV = (glVertexArrayRangeNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayRangeNV(length, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexArrayRange_nglFlushVertexArrayRangeNV(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glFlushVertexArrayRangeNVPROC glFlushVertexArrayRangeNV = (glFlushVertexArrayRangeNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFlushVertexArrayRangeNV();
}

EXTERN_C_EXIT
