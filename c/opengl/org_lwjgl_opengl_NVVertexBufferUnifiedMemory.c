/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glBufferAddressRangeNVPROC) (GLenum, GLuint, GLuint64EXT, GLsizeiptr);
typedef GLvoid (APIENTRY *glVertexFormatNVPROC) (GLint, GLenum, GLsizei);
typedef GLvoid (APIENTRY *glNormalFormatNVPROC) (GLenum, GLsizei);
typedef GLvoid (APIENTRY *glColorFormatNVPROC) (GLint, GLenum, GLsizei);
typedef GLvoid (APIENTRY *glIndexFormatNVPROC) (GLenum, GLsizei);
typedef GLvoid (APIENTRY *glTexCoordFormatNVPROC) (GLint, GLenum, GLsizei);
typedef GLvoid (APIENTRY *glEdgeFlagFormatNVPROC) (GLsizei);
typedef GLvoid (APIENTRY *glSecondaryColorFormatNVPROC) (GLint, GLenum, GLsizei);
typedef GLvoid (APIENTRY *glFogCoordFormatNVPROC) (GLenum, GLsizei);
typedef GLvoid (APIENTRY *glVertexAttribFormatNVPROC) (GLuint, GLint, GLenum, GLboolean, GLsizei);
typedef GLvoid (APIENTRY *glVertexAttribIFormatNVPROC) (GLuint, GLint, GLenum, GLsizei);
typedef GLvoid (APIENTRY *glGetIntegerui64i_vNVPROC) (GLenum, GLuint, GLuint64EXT *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglBufferAddressRangeNV(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong address, jlong length, jlong __functionAddress) {
	glBufferAddressRangeNVPROC glBufferAddressRangeNV = (glBufferAddressRangeNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBufferAddressRangeNV(pname, index, address, (GLsizeiptr)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglVertexFormatNV(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong __functionAddress) {
	glVertexFormatNVPROC glVertexFormatNV = (glVertexFormatNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexFormatNV(size, type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglNormalFormatNV(JNIEnv *__env, jclass clazz, jint type, jint stride, jlong __functionAddress) {
	glNormalFormatNVPROC glNormalFormatNV = (glNormalFormatNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormalFormatNV(type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglColorFormatNV(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong __functionAddress) {
	glColorFormatNVPROC glColorFormatNV = (glColorFormatNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorFormatNV(size, type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglIndexFormatNV(JNIEnv *__env, jclass clazz, jint type, jint stride, jlong __functionAddress) {
	glIndexFormatNVPROC glIndexFormatNV = (glIndexFormatNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glIndexFormatNV(type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglTexCoordFormatNV(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong __functionAddress) {
	glTexCoordFormatNVPROC glTexCoordFormatNV = (glTexCoordFormatNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoordFormatNV(size, type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglEdgeFlagFormatNV(JNIEnv *__env, jclass clazz, jint stride, jlong __functionAddress) {
	glEdgeFlagFormatNVPROC glEdgeFlagFormatNV = (glEdgeFlagFormatNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEdgeFlagFormatNV(stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglSecondaryColorFormatNV(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong __functionAddress) {
	glSecondaryColorFormatNVPROC glSecondaryColorFormatNV = (glSecondaryColorFormatNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColorFormatNV(size, type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglFogCoordFormatNV(JNIEnv *__env, jclass clazz, jint type, jint stride, jlong __functionAddress) {
	glFogCoordFormatNVPROC glFogCoordFormatNV = (glFogCoordFormatNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogCoordFormatNV(type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglVertexAttribFormatNV(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jboolean normalized, jint stride, jlong __functionAddress) {
	glVertexAttribFormatNVPROC glVertexAttribFormatNV = (glVertexAttribFormatNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribFormatNV(index, size, type, normalized, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglVertexAttribIFormatNV(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong __functionAddress) {
	glVertexAttribIFormatNVPROC glVertexAttribIFormatNV = (glVertexAttribIFormatNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribIFormatNV(index, size, type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglGetIntegerui64i_1vNV(JNIEnv *__env, jclass clazz, jint value, jint index, jlong resultAddress, jlong __functionAddress) {
	GLuint64EXT *result = (GLuint64EXT *)(intptr_t)resultAddress;
	glGetIntegerui64i_vNVPROC glGetIntegerui64i_vNV = (glGetIntegerui64i_vNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetIntegerui64i_vNV(value, index, result);
}

EXTERN_C_EXIT
