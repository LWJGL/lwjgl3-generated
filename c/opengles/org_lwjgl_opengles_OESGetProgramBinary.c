/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glGetProgramBinaryOESPROC) (GLuint, GLsizei, GLsizei *, GLenum *, void *);
typedef void (APIENTRY *glProgramBinaryOESPROC) (GLuint, GLenum, const void *, GLint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESGetProgramBinary_nglGetProgramBinaryOES(JNIEnv *__env, jclass clazz, jint program, jint bufSize, jlong lengthAddress, jlong binaryFormatAddress, jlong binaryAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLenum *binaryFormat = (GLenum *)(intptr_t)binaryFormatAddress;
	void *binary = (void *)(intptr_t)binaryAddress;
	glGetProgramBinaryOESPROC glGetProgramBinaryOES = (glGetProgramBinaryOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramBinaryOES(program, bufSize, length, binaryFormat, binary);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESGetProgramBinary_nglProgramBinaryOES(JNIEnv *__env, jclass clazz, jint program, jint binaryFormat, jlong binaryAddress, jint length, jlong __functionAddress) {
	const void *binary = (const void *)(intptr_t)binaryAddress;
	glProgramBinaryOESPROC glProgramBinaryOES = (glProgramBinaryOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramBinaryOES(program, binaryFormat, binary, length);
}

EXTERN_C_EXIT
