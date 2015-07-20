/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glVertexAttribL1i64NVPROC) (GLuint, GLint64EXT);
typedef void (APIENTRY *glVertexAttribL2i64NVPROC) (GLuint, GLint64EXT, GLint64EXT);
typedef void (APIENTRY *glVertexAttribL3i64NVPROC) (GLuint, GLint64EXT, GLint64EXT, GLint64EXT);
typedef void (APIENTRY *glVertexAttribL4i64NVPROC) (GLuint, GLint64EXT, GLint64EXT, GLint64EXT, GLint64EXT);
typedef void (APIENTRY *glVertexAttribL1i64vNVPROC) (GLuint, const GLint64EXT *);
typedef void (APIENTRY *glVertexAttribL2i64vNVPROC) (GLuint, const GLint64EXT *);
typedef void (APIENTRY *glVertexAttribL3i64vNVPROC) (GLuint, const GLint64EXT *);
typedef void (APIENTRY *glVertexAttribL4i64vNVPROC) (GLuint, const GLint64EXT *);
typedef void (APIENTRY *glVertexAttribL1ui64NVPROC) (GLuint, GLuint64EXT);
typedef void (APIENTRY *glVertexAttribL2ui64NVPROC) (GLuint, GLuint64EXT, GLuint64EXT);
typedef void (APIENTRY *glVertexAttribL3ui64NVPROC) (GLuint, GLuint64EXT, GLuint64EXT, GLuint64EXT);
typedef void (APIENTRY *glVertexAttribL4ui64NVPROC) (GLuint, GLuint64EXT, GLuint64EXT, GLuint64EXT, GLuint64EXT);
typedef void (APIENTRY *glVertexAttribL1ui64vNVPROC) (GLuint, const GLuint64EXT *);
typedef void (APIENTRY *glVertexAttribL2ui64vNVPROC) (GLuint, const GLuint64EXT *);
typedef void (APIENTRY *glVertexAttribL3ui64vNVPROC) (GLuint, const GLuint64EXT *);
typedef void (APIENTRY *glVertexAttribL4ui64vNVPROC) (GLuint, const GLuint64EXT *);
typedef void (APIENTRY *glGetVertexAttribLi64vNVPROC) (GLuint, GLenum, GLint64EXT *);
typedef void (APIENTRY *glGetVertexAttribLui64vNVPROC) (GLuint, GLenum, GLuint64EXT *);
typedef void (APIENTRY *glVertexAttribLFormatNVPROC) (GLuint, GLint, GLenum, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL1i64NV(JNIEnv *__env, jclass clazz, jint index, jlong x, jlong __functionAddress) {
	glVertexAttribL1i64NVPROC glVertexAttribL1i64NV = (glVertexAttribL1i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL1i64NV(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL2i64NV(JNIEnv *__env, jclass clazz, jint index, jlong x, jlong y, jlong __functionAddress) {
	glVertexAttribL2i64NVPROC glVertexAttribL2i64NV = (glVertexAttribL2i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL2i64NV(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL3i64NV(JNIEnv *__env, jclass clazz, jint index, jlong x, jlong y, jlong z, jlong __functionAddress) {
	glVertexAttribL3i64NVPROC glVertexAttribL3i64NV = (glVertexAttribL3i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL3i64NV(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL4i64NV(JNIEnv *__env, jclass clazz, jint index, jlong x, jlong y, jlong z, jlong w, jlong __functionAddress) {
	glVertexAttribL4i64NVPROC glVertexAttribL4i64NV = (glVertexAttribL4i64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL4i64NV(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL1i64vNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint64EXT *v = (const GLint64EXT *)(intptr_t)vAddress;
	glVertexAttribL1i64vNVPROC glVertexAttribL1i64vNV = (glVertexAttribL1i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL1i64vNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL2i64vNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint64EXT *v = (const GLint64EXT *)(intptr_t)vAddress;
	glVertexAttribL2i64vNVPROC glVertexAttribL2i64vNV = (glVertexAttribL2i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL2i64vNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL3i64vNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint64EXT *v = (const GLint64EXT *)(intptr_t)vAddress;
	glVertexAttribL3i64vNVPROC glVertexAttribL3i64vNV = (glVertexAttribL3i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL3i64vNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL4i64vNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint64EXT *v = (const GLint64EXT *)(intptr_t)vAddress;
	glVertexAttribL4i64vNVPROC glVertexAttribL4i64vNV = (glVertexAttribL4i64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL4i64vNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL1ui64NV(JNIEnv *__env, jclass clazz, jint index, jlong x, jlong __functionAddress) {
	glVertexAttribL1ui64NVPROC glVertexAttribL1ui64NV = (glVertexAttribL1ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL1ui64NV(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL2ui64NV(JNIEnv *__env, jclass clazz, jint index, jlong x, jlong y, jlong __functionAddress) {
	glVertexAttribL2ui64NVPROC glVertexAttribL2ui64NV = (glVertexAttribL2ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL2ui64NV(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL3ui64NV(JNIEnv *__env, jclass clazz, jint index, jlong x, jlong y, jlong z, jlong __functionAddress) {
	glVertexAttribL3ui64NVPROC glVertexAttribL3ui64NV = (glVertexAttribL3ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL3ui64NV(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL4ui64NV(JNIEnv *__env, jclass clazz, jint index, jlong x, jlong y, jlong z, jlong w, jlong __functionAddress) {
	glVertexAttribL4ui64NVPROC glVertexAttribL4ui64NV = (glVertexAttribL4ui64NVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL4ui64NV(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL1ui64vNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint64EXT *v = (const GLuint64EXT *)(intptr_t)vAddress;
	glVertexAttribL1ui64vNVPROC glVertexAttribL1ui64vNV = (glVertexAttribL1ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL1ui64vNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL2ui64vNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint64EXT *v = (const GLuint64EXT *)(intptr_t)vAddress;
	glVertexAttribL2ui64vNVPROC glVertexAttribL2ui64vNV = (glVertexAttribL2ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL2ui64vNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL3ui64vNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint64EXT *v = (const GLuint64EXT *)(intptr_t)vAddress;
	glVertexAttribL3ui64vNVPROC glVertexAttribL3ui64vNV = (glVertexAttribL3ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL3ui64vNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribL4ui64vNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint64EXT *v = (const GLuint64EXT *)(intptr_t)vAddress;
	glVertexAttribL4ui64vNVPROC glVertexAttribL4ui64vNV = (glVertexAttribL4ui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL4ui64vNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglGetVertexAttribLi64vNV(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint64EXT *params = (GLint64EXT *)(intptr_t)paramsAddress;
	glGetVertexAttribLi64vNVPROC glGetVertexAttribLi64vNV = (glGetVertexAttribLi64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribLi64vNV(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglGetVertexAttribLui64vNV(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint64EXT *params = (GLuint64EXT *)(intptr_t)paramsAddress;
	glGetVertexAttribLui64vNVPROC glGetVertexAttribLui64vNV = (glGetVertexAttribLui64vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribLui64vNV(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexAttribInteger64bit_nglVertexAttribLFormatNV(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong __functionAddress) {
	glVertexAttribLFormatNVPROC glVertexAttribLFormatNV = (glVertexAttribLFormatNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribLFormatNV(index, size, type, stride);
}

EXTERN_C_EXIT
