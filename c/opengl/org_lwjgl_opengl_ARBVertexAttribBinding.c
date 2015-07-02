/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glVertexArrayBindVertexBufferEXTPROC) (GLuint, GLuint, GLuint, GLintptr, GLsizei);
typedef GLvoid (APIENTRY *glVertexArrayVertexAttribFormatEXTPROC) (GLuint, GLuint, GLint, GLenum, GLboolean, GLuint);
typedef GLvoid (APIENTRY *glVertexArrayVertexAttribIFormatEXTPROC) (GLuint, GLuint, GLint, GLenum, GLuint);
typedef GLvoid (APIENTRY *glVertexArrayVertexAttribLFormatEXTPROC) (GLuint, GLuint, GLint, GLenum, GLuint);
typedef GLvoid (APIENTRY *glVertexArrayVertexAttribBindingEXTPROC) (GLuint, GLuint, GLuint);
typedef GLvoid (APIENTRY *glVertexArrayVertexBindingDivisorEXTPROC) (GLuint, GLuint, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayBindVertexBufferEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint buffer, jlong offset, jint stride, jlong __functionAddress) {
	glVertexArrayBindVertexBufferEXTPROC glVertexArrayBindVertexBufferEXT = (glVertexArrayBindVertexBufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayBindVertexBufferEXT(vaobj, bindingindex, buffer, (GLintptr)offset, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayVertexAttribFormatEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset, jlong __functionAddress) {
	glVertexArrayVertexAttribFormatEXTPROC glVertexArrayVertexAttribFormatEXT = (glVertexArrayVertexAttribFormatEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexAttribFormatEXT(vaobj, attribindex, size, type, normalized, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayVertexAttribIFormatEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset, jlong __functionAddress) {
	glVertexArrayVertexAttribIFormatEXTPROC glVertexArrayVertexAttribIFormatEXT = (glVertexArrayVertexAttribIFormatEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexAttribIFormatEXT(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayVertexAttribLFormatEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset, jlong __functionAddress) {
	glVertexArrayVertexAttribLFormatEXTPROC glVertexArrayVertexAttribLFormatEXT = (glVertexArrayVertexAttribLFormatEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexAttribLFormatEXT(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayVertexAttribBindingEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint bindingindex, jlong __functionAddress) {
	glVertexArrayVertexAttribBindingEXTPROC glVertexArrayVertexAttribBindingEXT = (glVertexArrayVertexAttribBindingEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexAttribBindingEXT(vaobj, attribindex, bindingindex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayVertexBindingDivisorEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint divisor, jlong __functionAddress) {
	glVertexArrayVertexBindingDivisorEXTPROC glVertexArrayVertexBindingDivisorEXT = (glVertexArrayVertexBindingDivisorEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexBindingDivisorEXT(vaobj, bindingindex, divisor);
}

EXTERN_C_EXIT
