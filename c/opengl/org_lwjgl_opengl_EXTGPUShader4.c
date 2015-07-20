/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glVertexAttribI1iEXTPROC) (GLuint, GLint);
typedef void (APIENTRY *glVertexAttribI2iEXTPROC) (GLuint, GLint, GLint);
typedef void (APIENTRY *glVertexAttribI3iEXTPROC) (GLuint, GLint, GLint, GLint);
typedef void (APIENTRY *glVertexAttribI4iEXTPROC) (GLuint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glVertexAttribI1uiEXTPROC) (GLuint, GLuint);
typedef void (APIENTRY *glVertexAttribI2uiEXTPROC) (GLuint, GLuint, GLuint);
typedef void (APIENTRY *glVertexAttribI3uiEXTPROC) (GLuint, GLint, GLint, GLint);
typedef void (APIENTRY *glVertexAttribI4uiEXTPROC) (GLuint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glVertexAttribI1ivEXTPROC) (GLuint, const GLint *);
typedef void (APIENTRY *glVertexAttribI2ivEXTPROC) (GLuint, const GLint *);
typedef void (APIENTRY *glVertexAttribI3ivEXTPROC) (GLuint, const GLint *);
typedef void (APIENTRY *glVertexAttribI4ivEXTPROC) (GLuint, const GLint *);
typedef void (APIENTRY *glVertexAttribI1uivEXTPROC) (GLuint, const GLuint *);
typedef void (APIENTRY *glVertexAttribI2uivEXTPROC) (GLuint, const GLuint *);
typedef void (APIENTRY *glVertexAttribI3uivEXTPROC) (GLuint, const GLuint *);
typedef void (APIENTRY *glVertexAttribI4uivEXTPROC) (GLuint, const GLuint *);
typedef void (APIENTRY *glVertexAttribI4bvEXTPROC) (GLuint, const GLbyte *);
typedef void (APIENTRY *glVertexAttribI4svEXTPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttribI4ubvEXTPROC) (GLuint, const GLbyte *);
typedef void (APIENTRY *glVertexAttribI4usvEXTPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttribIPointerEXTPROC) (GLuint, GLint, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glGetVertexAttribIivEXTPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetVertexAttribIuivEXTPROC) (GLuint, GLenum, GLuint *);
typedef void (APIENTRY *glGetUniformuivEXTPROC) (GLuint, GLint, GLuint *);
typedef void (APIENTRY *glBindFragDataLocationEXTPROC) (GLuint, GLuint, const GLchar *);
typedef GLint (APIENTRY *glGetFragDataLocationEXTPROC) (GLuint, const GLchar *);
typedef void (APIENTRY *glUniform1uiEXTPROC) (GLint, GLuint);
typedef void (APIENTRY *glUniform2uiEXTPROC) (GLint, GLuint, GLuint);
typedef void (APIENTRY *glUniform3uiEXTPROC) (GLint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glUniform4uiEXTPROC) (GLint, GLuint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glUniform1uivEXTPROC) (GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glUniform2uivEXTPROC) (GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glUniform3uivEXTPROC) (GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glUniform4uivEXTPROC) (GLint, GLsizei, const GLuint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI1iEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jlong __functionAddress) {
	glVertexAttribI1iEXTPROC glVertexAttribI1iEXT = (glVertexAttribI1iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI1iEXT(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI2iEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jlong __functionAddress) {
	glVertexAttribI2iEXTPROC glVertexAttribI2iEXT = (glVertexAttribI2iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI2iEXT(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI3iEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jlong __functionAddress) {
	glVertexAttribI3iEXTPROC glVertexAttribI3iEXT = (glVertexAttribI3iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI3iEXT(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4iEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glVertexAttribI4iEXTPROC glVertexAttribI4iEXT = (glVertexAttribI4iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4iEXT(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI1uiEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jlong __functionAddress) {
	glVertexAttribI1uiEXTPROC glVertexAttribI1uiEXT = (glVertexAttribI1uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI1uiEXT(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI2uiEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jlong __functionAddress) {
	glVertexAttribI2uiEXTPROC glVertexAttribI2uiEXT = (glVertexAttribI2uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI2uiEXT(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI3uiEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jlong __functionAddress) {
	glVertexAttribI3uiEXTPROC glVertexAttribI3uiEXT = (glVertexAttribI3uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI3uiEXT(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4uiEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glVertexAttribI4uiEXTPROC glVertexAttribI4uiEXT = (glVertexAttribI4uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4uiEXT(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI1ivEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttribI1ivEXTPROC glVertexAttribI1ivEXT = (glVertexAttribI1ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI1ivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI2ivEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttribI2ivEXTPROC glVertexAttribI2ivEXT = (glVertexAttribI2ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI2ivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI3ivEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttribI3ivEXTPROC glVertexAttribI3ivEXT = (glVertexAttribI3ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI3ivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4ivEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttribI4ivEXTPROC glVertexAttribI4ivEXT = (glVertexAttribI4ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4ivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI1uivEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttribI1uivEXTPROC glVertexAttribI1uivEXT = (glVertexAttribI1uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI1uivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI2uivEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttribI2uivEXTPROC glVertexAttribI2uivEXT = (glVertexAttribI2uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI2uivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI3uivEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttribI3uivEXTPROC glVertexAttribI3uivEXT = (glVertexAttribI3uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI3uivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4uivEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttribI4uivEXTPROC glVertexAttribI4uivEXT = (glVertexAttribI4uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4uivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4bvEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glVertexAttribI4bvEXTPROC glVertexAttribI4bvEXT = (glVertexAttribI4bvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4bvEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4svEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttribI4svEXTPROC glVertexAttribI4svEXT = (glVertexAttribI4svEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4svEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4ubvEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glVertexAttribI4ubvEXTPROC glVertexAttribI4ubvEXT = (glVertexAttribI4ubvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4ubvEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4usvEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttribI4usvEXTPROC glVertexAttribI4usvEXT = (glVertexAttribI4usvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4usvEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribIPointerEXT(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const void *pointer = (const void *)(intptr_t)pointerAddress;
	glVertexAttribIPointerEXTPROC glVertexAttribIPointerEXT = (glVertexAttribIPointerEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribIPointerEXT(index, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglGetVertexAttribIivEXT(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetVertexAttribIivEXTPROC glGetVertexAttribIivEXT = (glGetVertexAttribIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribIivEXT(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglGetVertexAttribIuivEXT(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetVertexAttribIuivEXTPROC glGetVertexAttribIuivEXT = (glGetVertexAttribIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribIuivEXT(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglGetUniformuivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetUniformuivEXTPROC glGetUniformuivEXT = (glGetUniformuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformuivEXT(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglBindFragDataLocationEXT(JNIEnv *__env, jclass clazz, jint program, jint color, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glBindFragDataLocationEXTPROC glBindFragDataLocationEXT = (glBindFragDataLocationEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindFragDataLocationEXT(program, color, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglGetFragDataLocationEXT(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetFragDataLocationEXTPROC glGetFragDataLocationEXT = (glGetFragDataLocationEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetFragDataLocationEXT(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform1uiEXT(JNIEnv *__env, jclass clazz, jint location, jint v0, jlong __functionAddress) {
	glUniform1uiEXTPROC glUniform1uiEXT = (glUniform1uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1uiEXT(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform2uiEXT(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jlong __functionAddress) {
	glUniform2uiEXTPROC glUniform2uiEXT = (glUniform2uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2uiEXT(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform3uiEXT(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glUniform3uiEXTPROC glUniform3uiEXT = (glUniform3uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3uiEXT(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform4uiEXT(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glUniform4uiEXTPROC glUniform4uiEXT = (glUniform4uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4uiEXT(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform1uivEXT(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform1uivEXTPROC glUniform1uivEXT = (glUniform1uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1uivEXT(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform2uivEXT(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform2uivEXTPROC glUniform2uivEXT = (glUniform2uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2uivEXT(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform3uivEXT(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform3uivEXTPROC glUniform3uivEXT = (glUniform3uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3uivEXT(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform4uivEXT(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform4uivEXTPROC glUniform4uivEXT = (glUniform4uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4uivEXT(location, count, value);
}

EXTERN_C_EXIT
