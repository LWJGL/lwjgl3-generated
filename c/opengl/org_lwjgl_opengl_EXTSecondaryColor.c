/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glSecondaryColor3bEXTPROC) (GLbyte, GLbyte, GLbyte);
typedef void (APIENTRY *glSecondaryColor3sEXTPROC) (GLshort, GLshort, GLshort);
typedef void (APIENTRY *glSecondaryColor3iEXTPROC) (GLint, GLint, GLint);
typedef void (APIENTRY *glSecondaryColor3fEXTPROC) (GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glSecondaryColor3dEXTPROC) (GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glSecondaryColor3ubEXTPROC) (GLubyte, GLubyte, GLubyte);
typedef void (APIENTRY *glSecondaryColor3usEXTPROC) (GLushort, GLushort, GLushort);
typedef void (APIENTRY *glSecondaryColor3uiEXTPROC) (GLint, GLint, GLint);
typedef void (APIENTRY *glSecondaryColor3bvEXTPROC) (const GLbyte *);
typedef void (APIENTRY *glSecondaryColor3svEXTPROC) (const GLshort *);
typedef void (APIENTRY *glSecondaryColor3ivEXTPROC) (const GLint *);
typedef void (APIENTRY *glSecondaryColor3fvEXTPROC) (const GLfloat *);
typedef void (APIENTRY *glSecondaryColor3dvEXTPROC) (const GLdouble *);
typedef void (APIENTRY *glSecondaryColor3ubvEXTPROC) (const GLubyte *);
typedef void (APIENTRY *glSecondaryColor3usvEXTPROC) (const GLushort *);
typedef void (APIENTRY *glSecondaryColor3uivEXTPROC) (const GLuint *);
typedef void (APIENTRY *glSecondaryColorPointerEXTPROC) (GLint, GLenum, GLsizei, const void *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3bEXT(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jlong __functionAddress) {
	glSecondaryColor3bEXTPROC glSecondaryColor3bEXT = (glSecondaryColor3bEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3bEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3sEXT(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jlong __functionAddress) {
	glSecondaryColor3sEXTPROC glSecondaryColor3sEXT = (glSecondaryColor3sEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3sEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3iEXT(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jlong __functionAddress) {
	glSecondaryColor3iEXTPROC glSecondaryColor3iEXT = (glSecondaryColor3iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3iEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3fEXT(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jlong __functionAddress) {
	glSecondaryColor3fEXTPROC glSecondaryColor3fEXT = (glSecondaryColor3fEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3fEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3dEXT(JNIEnv *__env, jclass clazz, jdouble red, jdouble green, jdouble blue, jlong __functionAddress) {
	glSecondaryColor3dEXTPROC glSecondaryColor3dEXT = (glSecondaryColor3dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3dEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3ubEXT(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jlong __functionAddress) {
	glSecondaryColor3ubEXTPROC glSecondaryColor3ubEXT = (glSecondaryColor3ubEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3ubEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3usEXT(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jlong __functionAddress) {
	glSecondaryColor3usEXTPROC glSecondaryColor3usEXT = (glSecondaryColor3usEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3usEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3uiEXT(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jlong __functionAddress) {
	glSecondaryColor3uiEXTPROC glSecondaryColor3uiEXT = (glSecondaryColor3uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3uiEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3bvEXT(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glSecondaryColor3bvEXTPROC glSecondaryColor3bvEXT = (glSecondaryColor3bvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3bvEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3svEXT(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glSecondaryColor3svEXTPROC glSecondaryColor3svEXT = (glSecondaryColor3svEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3svEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3ivEXT(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glSecondaryColor3ivEXTPROC glSecondaryColor3ivEXT = (glSecondaryColor3ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3ivEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3fvEXT(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glSecondaryColor3fvEXTPROC glSecondaryColor3fvEXT = (glSecondaryColor3fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3fvEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3dvEXT(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glSecondaryColor3dvEXTPROC glSecondaryColor3dvEXT = (glSecondaryColor3dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3dvEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3ubvEXT(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLubyte *v = (const GLubyte *)(intptr_t)vAddress;
	glSecondaryColor3ubvEXTPROC glSecondaryColor3ubvEXT = (glSecondaryColor3ubvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3ubvEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3usvEXT(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLushort *v = (const GLushort *)(intptr_t)vAddress;
	glSecondaryColor3usvEXTPROC glSecondaryColor3usvEXT = (glSecondaryColor3usvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3usvEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3uivEXT(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glSecondaryColor3uivEXTPROC glSecondaryColor3uivEXT = (glSecondaryColor3uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3uivEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColorPointerEXT(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const void *pointer = (const void *)(intptr_t)pointerAddress;
	glSecondaryColorPointerEXTPROC glSecondaryColorPointerEXT = (glSecondaryColorPointerEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColorPointerEXT(size, type, stride, pointer);
}

EXTERN_C_EXIT
