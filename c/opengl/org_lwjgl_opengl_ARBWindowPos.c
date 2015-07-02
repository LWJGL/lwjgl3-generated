/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glWindowPos2iARBPROC) (GLint, GLint);
typedef GLvoid (APIENTRY *glWindowPos2sARBPROC) (GLshort, GLshort);
typedef GLvoid (APIENTRY *glWindowPos2fARBPROC) (GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glWindowPos2dARBPROC) (GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glWindowPos2ivARBPROC) (const GLint *);
typedef GLvoid (APIENTRY *glWindowPos2svARBPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glWindowPos2fvARBPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glWindowPos2dvARBPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glWindowPos3iARBPROC) (GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glWindowPos3sARBPROC) (GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glWindowPos3fARBPROC) (GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glWindowPos3dARBPROC) (GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glWindowPos3ivARBPROC) (const GLint *);
typedef GLvoid (APIENTRY *glWindowPos3svARBPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glWindowPos3fvARBPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glWindowPos3dvARBPROC) (const GLdouble *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2iARB(JNIEnv *__env, jclass clazz, jint x, jint y, jlong __functionAddress) {
	glWindowPos2iARBPROC glWindowPos2iARB = (glWindowPos2iARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2iARB(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2sARB(JNIEnv *__env, jclass clazz, jshort x, jshort y, jlong __functionAddress) {
	glWindowPos2sARBPROC glWindowPos2sARB = (glWindowPos2sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2sARB(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2fARB(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jlong __functionAddress) {
	glWindowPos2fARBPROC glWindowPos2fARB = (glWindowPos2fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2fARB(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2dARB(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jlong __functionAddress) {
	glWindowPos2dARBPROC glWindowPos2dARB = (glWindowPos2dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2dARB(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2ivARB(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLint *p = (const GLint *)(intptr_t)pAddress;
	glWindowPos2ivARBPROC glWindowPos2ivARB = (glWindowPos2ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2ivARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2svARB(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLshort *p = (const GLshort *)(intptr_t)pAddress;
	glWindowPos2svARBPROC glWindowPos2svARB = (glWindowPos2svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2svARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2fvARB(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLfloat *p = (const GLfloat *)(intptr_t)pAddress;
	glWindowPos2fvARBPROC glWindowPos2fvARB = (glWindowPos2fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2fvARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2dvARB(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLdouble *p = (const GLdouble *)(intptr_t)pAddress;
	glWindowPos2dvARBPROC glWindowPos2dvARB = (glWindowPos2dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2dvARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3iARB(JNIEnv *__env, jclass clazz, jint x, jint y, jint z, jlong __functionAddress) {
	glWindowPos3iARBPROC glWindowPos3iARB = (glWindowPos3iARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3iARB(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3sARB(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jlong __functionAddress) {
	glWindowPos3sARBPROC glWindowPos3sARB = (glWindowPos3sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3sARB(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3fARB(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glWindowPos3fARBPROC glWindowPos3fARB = (glWindowPos3fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3fARB(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3dARB(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glWindowPos3dARBPROC glWindowPos3dARB = (glWindowPos3dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3dARB(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3ivARB(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLint *p = (const GLint *)(intptr_t)pAddress;
	glWindowPos3ivARBPROC glWindowPos3ivARB = (glWindowPos3ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3ivARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3svARB(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLshort *p = (const GLshort *)(intptr_t)pAddress;
	glWindowPos3svARBPROC glWindowPos3svARB = (glWindowPos3svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3svARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3fvARB(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLfloat *p = (const GLfloat *)(intptr_t)pAddress;
	glWindowPos3fvARBPROC glWindowPos3fvARB = (glWindowPos3fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3fvARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3dvARB(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLdouble *p = (const GLdouble *)(intptr_t)pAddress;
	glWindowPos3dvARBPROC glWindowPos3dvARB = (glWindowPos3dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3dvARB(p);
}

EXTERN_C_EXIT
