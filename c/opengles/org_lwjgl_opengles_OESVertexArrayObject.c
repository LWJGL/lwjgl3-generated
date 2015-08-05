/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glBindVertexArrayOESPROC) (GLuint);
typedef void (APIENTRY *glDeleteVertexArraysOESPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glGenVertexArraysOESPROC) (GLsizei, GLuint *);
typedef GLboolean (APIENTRY *glIsVertexArrayOESPROC) (GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESVertexArrayObject_nglBindVertexArrayOES(JNIEnv *__env, jclass clazz, jint array, jlong __functionAddress) {
	glBindVertexArrayOESPROC glBindVertexArrayOES = (glBindVertexArrayOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindVertexArrayOES(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESVertexArrayObject_nglDeleteVertexArraysOES(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress, jlong __functionAddress) {
	const GLuint *arrays = (const GLuint *)(intptr_t)arraysAddress;
	glDeleteVertexArraysOESPROC glDeleteVertexArraysOES = (glDeleteVertexArraysOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteVertexArraysOES(n, arrays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESVertexArrayObject_nglGenVertexArraysOES(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress, jlong __functionAddress) {
	GLuint *arrays = (GLuint *)(intptr_t)arraysAddress;
	glGenVertexArraysOESPROC glGenVertexArraysOES = (glGenVertexArraysOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenVertexArraysOES(n, arrays);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_OESVertexArrayObject_nglIsVertexArrayOES(JNIEnv *__env, jclass clazz, jint array, jlong __functionAddress) {
	glIsVertexArrayOESPROC glIsVertexArrayOES = (glIsVertexArrayOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsVertexArrayOES(array);
}

EXTERN_C_EXIT
