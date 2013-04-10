/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glUniformMatrix2x3fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef GLvoid (APIENTRY *glUniformMatrix3x2fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef GLvoid (APIENTRY *glUniformMatrix2x4fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef GLvoid (APIENTRY *glUniformMatrix4x2fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef GLvoid (APIENTRY *glUniformMatrix3x4fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef GLvoid (APIENTRY *glUniformMatrix4x3fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21_nglUniformMatrix2x3fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix2x3fvPROC glUniformMatrix2x3fv = (glUniformMatrix2x3fvPROC)(intptr_t)__functionAddress;
	glUniformMatrix2x3fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21_nglUniformMatrix3x2fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix3x2fvPROC glUniformMatrix3x2fv = (glUniformMatrix3x2fvPROC)(intptr_t)__functionAddress;
	glUniformMatrix3x2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21_nglUniformMatrix2x4fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix2x4fvPROC glUniformMatrix2x4fv = (glUniformMatrix2x4fvPROC)(intptr_t)__functionAddress;
	glUniformMatrix2x4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21_nglUniformMatrix4x2fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix4x2fvPROC glUniformMatrix4x2fv = (glUniformMatrix4x2fvPROC)(intptr_t)__functionAddress;
	glUniformMatrix4x2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21_nglUniformMatrix3x4fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix3x4fvPROC glUniformMatrix3x4fv = (glUniformMatrix3x4fvPROC)(intptr_t)__functionAddress;
	glUniformMatrix3x4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21_nglUniformMatrix4x3fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix4x3fvPROC glUniformMatrix4x3fv = (glUniformMatrix4x3fvPROC)(intptr_t)__functionAddress;
	glUniformMatrix4x3fv(location, count, transpose, value);
}