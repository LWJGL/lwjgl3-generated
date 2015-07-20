/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBeginTransformFeedbackNVPROC) (GLenum);
typedef void (APIENTRY *glEndTransformFeedbackNVPROC) (void);
typedef void (APIENTRY *glTransformFeedbackAttribsNVPROC) (GLsizei, const GLint *, GLenum);
typedef void (APIENTRY *glBindBufferRangeNVPROC) (GLenum, GLuint, GLuint, GLintptr, GLsizeiptr);
typedef void (APIENTRY *glBindBufferOffsetNVPROC) (GLenum, GLuint, GLuint, GLintptr);
typedef void (APIENTRY *glBindBufferBaseNVPROC) (GLenum, GLuint, GLuint);
typedef void (APIENTRY *glTransformFeedbackVaryingsNVPROC) (GLuint, GLsizei, const GLint *, GLenum);
typedef void (APIENTRY *glActiveVaryingNVPROC) (GLuint, const GLchar *);
typedef GLint (APIENTRY *glGetVaryingLocationNVPROC) (GLuint, const GLchar *);
typedef void (APIENTRY *glGetActiveVaryingNVPROC) (GLuint, GLuint, GLsizei, GLsizei *, GLsizei *, GLenum *, GLchar *);
typedef void (APIENTRY *glGetTransformFeedbackVaryingNVPROC) (GLuint, GLuint, GLint *);
typedef void (APIENTRY *glTransformFeedbackStreamAttribsNVPROC) (GLsizei, const GLint *, GLsizei, const GLint *, GLenum);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglBeginTransformFeedbackNV(JNIEnv *__env, jclass clazz, jint primitiveMode, jlong __functionAddress) {
	glBeginTransformFeedbackNVPROC glBeginTransformFeedbackNV = (glBeginTransformFeedbackNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginTransformFeedbackNV(primitiveMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglEndTransformFeedbackNV(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glEndTransformFeedbackNVPROC glEndTransformFeedbackNV = (glEndTransformFeedbackNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndTransformFeedbackNV();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglTransformFeedbackAttribsNV(JNIEnv *__env, jclass clazz, jint count, jlong attribsAddress, jint bufferMode, jlong __functionAddress) {
	const GLint *attribs = (const GLint *)(intptr_t)attribsAddress;
	glTransformFeedbackAttribsNVPROC glTransformFeedbackAttribsNV = (glTransformFeedbackAttribsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTransformFeedbackAttribsNV(count, attribs, bufferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglBindBufferRangeNV(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong size, jlong __functionAddress) {
	glBindBufferRangeNVPROC glBindBufferRangeNV = (glBindBufferRangeNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBufferRangeNV(target, index, buffer, (GLintptr)offset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglBindBufferOffsetNV(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong __functionAddress) {
	glBindBufferOffsetNVPROC glBindBufferOffsetNV = (glBindBufferOffsetNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBufferOffsetNV(target, index, buffer, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglBindBufferBaseNV(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong __functionAddress) {
	glBindBufferBaseNVPROC glBindBufferBaseNV = (glBindBufferBaseNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBufferBaseNV(target, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglTransformFeedbackVaryingsNV(JNIEnv *__env, jclass clazz, jint program, jint count, jlong locationsAddress, jint bufferMode, jlong __functionAddress) {
	const GLint *locations = (const GLint *)(intptr_t)locationsAddress;
	glTransformFeedbackVaryingsNVPROC glTransformFeedbackVaryingsNV = (glTransformFeedbackVaryingsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTransformFeedbackVaryingsNV(program, count, locations, bufferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglActiveVaryingNV(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glActiveVaryingNVPROC glActiveVaryingNV = (glActiveVaryingNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glActiveVaryingNV(program, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglGetVaryingLocationNV(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetVaryingLocationNVPROC glGetVaryingLocationNV = (glGetVaryingLocationNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetVaryingLocationNV(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglGetActiveVaryingNV(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLsizei *size = (GLsizei *)(intptr_t)sizeAddress;
	GLenum *type = (GLenum *)(intptr_t)typeAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetActiveVaryingNVPROC glGetActiveVaryingNV = (glGetActiveVaryingNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveVaryingNV(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglGetTransformFeedbackVaryingNV(JNIEnv *__env, jclass clazz, jint program, jint index, jlong locationAddress, jlong __functionAddress) {
	GLint *location = (GLint *)(intptr_t)locationAddress;
	glGetTransformFeedbackVaryingNVPROC glGetTransformFeedbackVaryingNV = (glGetTransformFeedbackVaryingNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTransformFeedbackVaryingNV(program, index, location);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglTransformFeedbackStreamAttribsNV(JNIEnv *__env, jclass clazz, jint count, jlong attribsAddress, jint nbuffers, jlong bufstreamsAddress, jint bufferMode, jlong __functionAddress) {
	const GLint *attribs = (const GLint *)(intptr_t)attribsAddress;
	const GLint *bufstreams = (const GLint *)(intptr_t)bufstreamsAddress;
	glTransformFeedbackStreamAttribsNVPROC glTransformFeedbackStreamAttribsNV = (glTransformFeedbackStreamAttribsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTransformFeedbackStreamAttribsNV(count, attribs, nbuffers, bufstreams, bufferMode);
}

EXTERN_C_EXIT
