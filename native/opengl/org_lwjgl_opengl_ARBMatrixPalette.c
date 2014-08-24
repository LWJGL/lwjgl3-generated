/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glCurrentPaletteMatrixARBPROC) (GLint);
typedef GLvoid (APIENTRY *glMatrixIndexubvARBPROC) (GLint, GLubyte *);
typedef GLvoid (APIENTRY *glMatrixIndexusvARBPROC) (GLint, GLushort *);
typedef GLvoid (APIENTRY *glMatrixIndexuivARBPROC) (GLint, GLuint *);
typedef GLvoid (APIENTRY *glMatrixIndexPointerARBPROC) (GLint, GLenum, GLsizei, GLvoid *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMatrixPalette_nglCurrentPaletteMatrixARB(JNIEnv *__env, jclass clazz, jint index, jlong __functionAddress) {
	glCurrentPaletteMatrixARBPROC glCurrentPaletteMatrixARB = (glCurrentPaletteMatrixARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCurrentPaletteMatrixARB(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMatrixPalette_nglMatrixIndexubvARB(JNIEnv *__env, jclass clazz, jint size, jlong indicesAddress, jlong __functionAddress) {
	GLubyte *indices = (GLubyte *)(intptr_t)indicesAddress;
	glMatrixIndexubvARBPROC glMatrixIndexubvARB = (glMatrixIndexubvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixIndexubvARB(size, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMatrixPalette_nglMatrixIndexusvARB(JNIEnv *__env, jclass clazz, jint size, jlong indicesAddress, jlong __functionAddress) {
	GLushort *indices = (GLushort *)(intptr_t)indicesAddress;
	glMatrixIndexusvARBPROC glMatrixIndexusvARB = (glMatrixIndexusvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixIndexusvARB(size, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMatrixPalette_nglMatrixIndexuivARB(JNIEnv *__env, jclass clazz, jint size, jlong indicesAddress, jlong __functionAddress) {
	GLuint *indices = (GLuint *)(intptr_t)indicesAddress;
	glMatrixIndexuivARBPROC glMatrixIndexuivARB = (glMatrixIndexuivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixIndexuivARB(size, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMatrixPalette_nglMatrixIndexPointerARB(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	GLvoid *pointer = (GLvoid *)(intptr_t)pointerAddress;
	glMatrixIndexPointerARBPROC glMatrixIndexPointerARB = (glMatrixIndexPointerARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixIndexPointerARB(size, type, stride, pointer);
}

EXTERN_C_EXIT
