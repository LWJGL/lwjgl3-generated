/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glLabelObjectEXTPROC) (GLenum, GLuint, GLsizei, const GLchar *);
typedef void (APIENTRY *glGetObjectLabelEXTPROC) (GLenum, GLuint, GLsizei, GLsizei *, GLchar *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDebugLabel_nglLabelObjectEXT(JNIEnv *__env, jclass clazz, jint type, jint object, jint length, jlong labelAddress, jlong __functionAddress) {
	const GLchar *label = (const GLchar *)(intptr_t)labelAddress;
	glLabelObjectEXTPROC glLabelObjectEXT = (glLabelObjectEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLabelObjectEXT(type, object, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDebugLabel_nglGetObjectLabelEXT(JNIEnv *__env, jclass clazz, jint type, jint object, jint bufSize, jlong lengthAddress, jlong labelAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *label = (GLchar *)(intptr_t)labelAddress;
	glGetObjectLabelEXTPROC glGetObjectLabelEXT = (glGetObjectLabelEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetObjectLabelEXT(type, object, bufSize, length, label);
}

EXTERN_C_EXIT
