/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glBindBufferRangeEXTPROC) (GLenum, GLuint, GLuint, GLintptr, GLsizeiptr);
typedef GLvoid (APIENTRY *glBindBufferOffsetEXTPROC) (GLenum, GLuint, GLuint, GLintptr);
typedef GLvoid (APIENTRY *glBindBufferBaseEXTPROC) (GLenum, GLuint, GLuint);
typedef GLvoid (APIENTRY *glBeginTransformFeedbackEXTPROC) (GLenum);
typedef GLvoid (APIENTRY *glEndTransformFeedbackEXTPROC) (void);
typedef GLvoid (APIENTRY *glTransformFeedbackVaryingsEXTPROC) (GLuint, GLsizei, const GLchar * const *, GLenum);
typedef GLvoid (APIENTRY *glGetTransformFeedbackVaryingEXTPROC) (GLuint, GLuint, GLsizei, GLsizei *, GLsizei *, GLenum *, GLchar *);
typedef GLvoid (APIENTRY *glGetIntegerIndexedvEXTPROC) (GLenum, GLuint, GLint *);
typedef GLvoid (APIENTRY *glGetBooleanIndexedvEXTPROC) (GLenum, GLuint, GLboolean *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglBindBufferRangeEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong size, jlong __functionAddress) {
	glBindBufferRangeEXTPROC glBindBufferRangeEXT = (glBindBufferRangeEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBufferRangeEXT(target, index, buffer, (GLintptr)offset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglBindBufferOffsetEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong __functionAddress) {
	glBindBufferOffsetEXTPROC glBindBufferOffsetEXT = (glBindBufferOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBufferOffsetEXT(target, index, buffer, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglBindBufferBaseEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong __functionAddress) {
	glBindBufferBaseEXTPROC glBindBufferBaseEXT = (glBindBufferBaseEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBufferBaseEXT(target, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglBeginTransformFeedbackEXT(JNIEnv *__env, jclass clazz, jint primitiveMode, jlong __functionAddress) {
	glBeginTransformFeedbackEXTPROC glBeginTransformFeedbackEXT = (glBeginTransformFeedbackEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginTransformFeedbackEXT(primitiveMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglEndTransformFeedbackEXT(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glEndTransformFeedbackEXTPROC glEndTransformFeedbackEXT = (glEndTransformFeedbackEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndTransformFeedbackEXT();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglTransformFeedbackVaryingsEXT(JNIEnv *__env, jclass clazz, jint program, jint count, jlong varyingsAddress, jint bufferMode, jlong __functionAddress) {
	const GLchar * const *varyings = (const GLchar * const *)(intptr_t)varyingsAddress;
	glTransformFeedbackVaryingsEXTPROC glTransformFeedbackVaryingsEXT = (glTransformFeedbackVaryingsEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTransformFeedbackVaryingsEXT(program, count, varyings, bufferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglGetTransformFeedbackVaryingEXT(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLsizei *size = (GLsizei *)(intptr_t)sizeAddress;
	GLenum *type = (GLenum *)(intptr_t)typeAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetTransformFeedbackVaryingEXTPROC glGetTransformFeedbackVaryingEXT = (glGetTransformFeedbackVaryingEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTransformFeedbackVaryingEXT(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglGetIntegerIndexedvEXT(JNIEnv *__env, jclass clazz, jint param, jint index, jlong valuesAddress, jlong __functionAddress) {
	GLint *values = (GLint *)(intptr_t)valuesAddress;
	glGetIntegerIndexedvEXTPROC glGetIntegerIndexedvEXT = (glGetIntegerIndexedvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetIntegerIndexedvEXT(param, index, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglGetBooleanIndexedvEXT(JNIEnv *__env, jclass clazz, jint param, jint index, jlong valuesAddress, jlong __functionAddress) {
	GLboolean *values = (GLboolean *)(intptr_t)valuesAddress;
	glGetBooleanIndexedvEXTPROC glGetBooleanIndexedvEXT = (glGetBooleanIndexedvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBooleanIndexedvEXT(param, index, values);
}

EXTERN_C_EXIT
