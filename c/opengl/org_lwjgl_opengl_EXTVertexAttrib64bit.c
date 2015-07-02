/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glVertexAttribL1dEXTPROC) (GLuint, GLdouble);
typedef GLvoid (APIENTRY *glVertexAttribL2dEXTPROC) (GLuint, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glVertexAttribL3dEXTPROC) (GLuint, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glVertexAttribL4dEXTPROC) (GLuint, GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glVertexAttribL1dvEXTPROC) (GLuint, const GLdouble *);
typedef GLvoid (APIENTRY *glVertexAttribL2dvEXTPROC) (GLuint, const GLdouble *);
typedef GLvoid (APIENTRY *glVertexAttribL3dvEXTPROC) (GLuint, const GLdouble *);
typedef GLvoid (APIENTRY *glVertexAttribL4dvEXTPROC) (GLuint, const GLdouble *);
typedef GLvoid (APIENTRY *glVertexAttribLPointerEXTPROC) (GLuint, GLint, GLenum, GLsizei, const GLvoid *);
typedef GLvoid (APIENTRY *glGetVertexAttribLdvEXTPROC) (GLuint, GLenum, GLdouble *);
typedef GLvoid (APIENTRY *glVertexArrayVertexAttribLOffsetEXTPROC) (GLuint, GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTVertexAttrib64bit_nglVertexAttribL1dEXT(JNIEnv *__env, jclass clazz, jint index, jdouble x, jlong __functionAddress) {
	glVertexAttribL1dEXTPROC glVertexAttribL1dEXT = (glVertexAttribL1dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL1dEXT(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTVertexAttrib64bit_nglVertexAttribL2dEXT(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jlong __functionAddress) {
	glVertexAttribL2dEXTPROC glVertexAttribL2dEXT = (glVertexAttribL2dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL2dEXT(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTVertexAttrib64bit_nglVertexAttribL3dEXT(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glVertexAttribL3dEXTPROC glVertexAttribL3dEXT = (glVertexAttribL3dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL3dEXT(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTVertexAttrib64bit_nglVertexAttribL4dEXT(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glVertexAttribL4dEXTPROC glVertexAttribL4dEXT = (glVertexAttribL4dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL4dEXT(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTVertexAttrib64bit_nglVertexAttribL1dvEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttribL1dvEXTPROC glVertexAttribL1dvEXT = (glVertexAttribL1dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL1dvEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTVertexAttrib64bit_nglVertexAttribL2dvEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttribL2dvEXTPROC glVertexAttribL2dvEXT = (glVertexAttribL2dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL2dvEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTVertexAttrib64bit_nglVertexAttribL3dvEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttribL3dvEXTPROC glVertexAttribL3dvEXT = (glVertexAttribL3dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL3dvEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTVertexAttrib64bit_nglVertexAttribL4dvEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttribL4dvEXTPROC glVertexAttribL4dvEXT = (glVertexAttribL4dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL4dvEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTVertexAttrib64bit_nglVertexAttribLPointerEXT(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const GLvoid *pointer = (const GLvoid *)(intptr_t)pointerAddress;
	glVertexAttribLPointerEXTPROC glVertexAttribLPointerEXT = (glVertexAttribLPointerEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribLPointerEXT(index, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTVertexAttrib64bit_nglGetVertexAttribLdvEXT(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetVertexAttribLdvEXTPROC glGetVertexAttribLdvEXT = (glGetVertexAttribLdvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribLdvEXT(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTVertexAttrib64bit_nglVertexArrayVertexAttribLOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint index, jint size, jint type, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayVertexAttribLOffsetEXTPROC glVertexArrayVertexAttribLOffsetEXT = (glVertexArrayVertexAttribLOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexAttribLOffsetEXT(vaobj, buffer, index, size, type, stride, (GLintptr)offset);
}

EXTERN_C_EXIT
