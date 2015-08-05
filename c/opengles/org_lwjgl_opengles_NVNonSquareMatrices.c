/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glUniformMatrix2x3fvNVPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix3x2fvNVPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix2x4fvNVPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix4x2fvNVPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix3x4fvNVPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix4x3fvNVPROC) (GLint, GLsizei, GLboolean, const GLfloat *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix2x3fvNV(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix2x3fvNVPROC glUniformMatrix2x3fvNV = (glUniformMatrix2x3fvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2x3fvNV(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix3x2fvNV(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix3x2fvNVPROC glUniformMatrix3x2fvNV = (glUniformMatrix3x2fvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3x2fvNV(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix2x4fvNV(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix2x4fvNVPROC glUniformMatrix2x4fvNV = (glUniformMatrix2x4fvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2x4fvNV(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix4x2fvNV(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix4x2fvNVPROC glUniformMatrix4x2fvNV = (glUniformMatrix4x2fvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4x2fvNV(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix3x4fvNV(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix3x4fvNVPROC glUniformMatrix3x4fvNV = (glUniformMatrix3x4fvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3x4fvNV(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix4x3fvNV(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix4x3fvNVPROC glUniformMatrix4x3fvNV = (glUniformMatrix4x3fvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4x3fvNV(location, count, transpose, value);
}

EXTERN_C_EXIT
