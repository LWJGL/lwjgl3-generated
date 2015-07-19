/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glVertexAttrib1fARBPROC) (GLuint, GLfloat);
typedef void (APIENTRY *glVertexAttrib1sARBPROC) (GLuint, GLshort);
typedef void (APIENTRY *glVertexAttrib1dARBPROC) (GLuint, GLdouble);
typedef void (APIENTRY *glVertexAttrib2fARBPROC) (GLuint, GLfloat, GLfloat);
typedef void (APIENTRY *glVertexAttrib2sARBPROC) (GLuint, GLshort, GLshort);
typedef void (APIENTRY *glVertexAttrib2dARBPROC) (GLuint, GLdouble, GLdouble);
typedef void (APIENTRY *glVertexAttrib3fARBPROC) (GLuint, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glVertexAttrib3sARBPROC) (GLuint, GLshort, GLshort, GLshort);
typedef void (APIENTRY *glVertexAttrib3dARBPROC) (GLuint, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glVertexAttrib4fARBPROC) (GLuint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glVertexAttrib4sARBPROC) (GLuint, GLshort, GLshort, GLshort, GLshort);
typedef void (APIENTRY *glVertexAttrib4dARBPROC) (GLuint, GLdouble, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glVertexAttrib4NubARBPROC) (GLuint, GLubyte, GLubyte, GLubyte, GLubyte);
typedef void (APIENTRY *glVertexAttrib1fvARBPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttrib1svARBPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttrib1dvARBPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttrib2fvARBPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttrib2svARBPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttrib2dvARBPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttrib3fvARBPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttrib3svARBPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttrib3dvARBPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttrib4fvARBPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttrib4svARBPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttrib4dvARBPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttrib4ivARBPROC) (GLuint, const GLint *);
typedef void (APIENTRY *glVertexAttrib4bvARBPROC) (GLuint, const GLbyte *);
typedef void (APIENTRY *glVertexAttrib4ubvARBPROC) (GLuint, const GLubyte *);
typedef void (APIENTRY *glVertexAttrib4usvARBPROC) (GLuint, const GLushort *);
typedef void (APIENTRY *glVertexAttrib4uivARBPROC) (GLuint, const GLuint *);
typedef void (APIENTRY *glVertexAttrib4NbvARBPROC) (GLuint, const GLbyte *);
typedef void (APIENTRY *glVertexAttrib4NsvARBPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttrib4NivARBPROC) (GLuint, const GLint *);
typedef void (APIENTRY *glVertexAttrib4NubvARBPROC) (GLuint, const GLubyte *);
typedef void (APIENTRY *glVertexAttrib4NusvARBPROC) (GLuint, const GLushort *);
typedef void (APIENTRY *glVertexAttrib4NuivARBPROC) (GLuint, const GLuint *);
typedef void (APIENTRY *glVertexAttribPointerARBPROC) (GLuint, GLint, GLenum, GLboolean, GLsizei, const void *);
typedef void (APIENTRY *glEnableVertexAttribArrayARBPROC) (GLuint);
typedef void (APIENTRY *glDisableVertexAttribArrayARBPROC) (GLuint);
typedef void (APIENTRY *glBindAttribLocationARBPROC) (GLhandleARB, GLuint, const GLchar *);
typedef void (APIENTRY *glGetActiveAttribARBPROC) (GLhandleARB, GLuint, GLsizei, GLsizei *, GLint *, GLenum *, GLchar *);
typedef GLint (APIENTRY *glGetAttribLocationARBPROC) (GLhandleARB, const GLchar *);
typedef void (APIENTRY *glGetVertexAttribivARBPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetVertexAttribfvARBPROC) (GLuint, GLenum, GLfloat *);
typedef void (APIENTRY *glGetVertexAttribdvARBPROC) (GLuint, GLenum, GLdouble *);
typedef void (APIENTRY *glGetVertexAttribPointervARBPROC) (GLuint, GLenum, void **);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1fARB(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jlong __functionAddress) {
	glVertexAttrib1fARBPROC glVertexAttrib1fARB = (glVertexAttrib1fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1fARB(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1sARB(JNIEnv *__env, jclass clazz, jint index, jshort v0, jlong __functionAddress) {
	glVertexAttrib1sARBPROC glVertexAttrib1sARB = (glVertexAttrib1sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1sARB(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1dARB(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jlong __functionAddress) {
	glVertexAttrib1dARBPROC glVertexAttrib1dARB = (glVertexAttrib1dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1dARB(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2fARB(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1, jlong __functionAddress) {
	glVertexAttrib2fARBPROC glVertexAttrib2fARB = (glVertexAttrib2fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2fARB(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2sARB(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1, jlong __functionAddress) {
	glVertexAttrib2sARBPROC glVertexAttrib2sARB = (glVertexAttrib2sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2sARB(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2dARB(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1, jlong __functionAddress) {
	glVertexAttrib2dARBPROC glVertexAttrib2dARB = (glVertexAttrib2dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2dARB(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3fARB(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1, jfloat v2, jlong __functionAddress) {
	glVertexAttrib3fARBPROC glVertexAttrib3fARB = (glVertexAttrib3fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3fARB(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3sARB(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1, jshort v2, jlong __functionAddress) {
	glVertexAttrib3sARBPROC glVertexAttrib3sARB = (glVertexAttrib3sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3sARB(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3dARB(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1, jdouble v2, jlong __functionAddress) {
	glVertexAttrib3dARBPROC glVertexAttrib3dARB = (glVertexAttrib3dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3dARB(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4fARB(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1, jfloat v2, jfloat v3, jlong __functionAddress) {
	glVertexAttrib4fARBPROC glVertexAttrib4fARB = (glVertexAttrib4fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4fARB(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4sARB(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1, jshort v2, jshort v3, jlong __functionAddress) {
	glVertexAttrib4sARBPROC glVertexAttrib4sARB = (glVertexAttrib4sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4sARB(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4dARB(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1, jdouble v2, jdouble v3, jlong __functionAddress) {
	glVertexAttrib4dARBPROC glVertexAttrib4dARB = (glVertexAttrib4dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4dARB(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NubARB(JNIEnv *__env, jclass clazz, jint index, jbyte x, jbyte y, jbyte z, jbyte w, jlong __functionAddress) {
	glVertexAttrib4NubARBPROC glVertexAttrib4NubARB = (glVertexAttrib4NubARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NubARB(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1fvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib1fvARBPROC glVertexAttrib1fvARB = (glVertexAttrib1fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1svARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib1svARBPROC glVertexAttrib1svARB = (glVertexAttrib1svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1dvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib1dvARBPROC glVertexAttrib1dvARB = (glVertexAttrib1dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2fvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib2fvARBPROC glVertexAttrib2fvARB = (glVertexAttrib2fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2svARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib2svARBPROC glVertexAttrib2svARB = (glVertexAttrib2svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2dvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib2dvARBPROC glVertexAttrib2dvARB = (glVertexAttrib2dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3fvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib3fvARBPROC glVertexAttrib3fvARB = (glVertexAttrib3fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3svARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib3svARBPROC glVertexAttrib3svARB = (glVertexAttrib3svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3dvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib3dvARBPROC glVertexAttrib3dvARB = (glVertexAttrib3dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4fvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib4fvARBPROC glVertexAttrib4fvARB = (glVertexAttrib4fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4svARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib4svARBPROC glVertexAttrib4svARB = (glVertexAttrib4svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4dvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib4dvARBPROC glVertexAttrib4dvARB = (glVertexAttrib4dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4ivARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttrib4ivARBPROC glVertexAttrib4ivARB = (glVertexAttrib4ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4ivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4bvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glVertexAttrib4bvARBPROC glVertexAttrib4bvARB = (glVertexAttrib4bvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4bvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4ubvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLubyte *v = (const GLubyte *)(intptr_t)vAddress;
	glVertexAttrib4ubvARBPROC glVertexAttrib4ubvARB = (glVertexAttrib4ubvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4ubvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4usvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLushort *v = (const GLushort *)(intptr_t)vAddress;
	glVertexAttrib4usvARBPROC glVertexAttrib4usvARB = (glVertexAttrib4usvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4usvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4uivARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttrib4uivARBPROC glVertexAttrib4uivARB = (glVertexAttrib4uivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4uivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NbvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glVertexAttrib4NbvARBPROC glVertexAttrib4NbvARB = (glVertexAttrib4NbvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NbvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NsvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib4NsvARBPROC glVertexAttrib4NsvARB = (glVertexAttrib4NsvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NsvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NivARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttrib4NivARBPROC glVertexAttrib4NivARB = (glVertexAttrib4NivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NubvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLubyte *v = (const GLubyte *)(intptr_t)vAddress;
	glVertexAttrib4NubvARBPROC glVertexAttrib4NubvARB = (glVertexAttrib4NubvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NubvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NusvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLushort *v = (const GLushort *)(intptr_t)vAddress;
	glVertexAttrib4NusvARBPROC glVertexAttrib4NusvARB = (glVertexAttrib4NusvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NusvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NuivARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttrib4NuivARBPROC glVertexAttrib4NuivARB = (glVertexAttrib4NuivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NuivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttribPointerARB(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jboolean normalized, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const void *pointer = (const void *)(intptr_t)pointerAddress;
	glVertexAttribPointerARBPROC glVertexAttribPointerARB = (glVertexAttribPointerARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglEnableVertexAttribArrayARB(JNIEnv *__env, jclass clazz, jint index, jlong __functionAddress) {
	glEnableVertexAttribArrayARBPROC glEnableVertexAttribArrayARB = (glEnableVertexAttribArrayARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableVertexAttribArrayARB(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglDisableVertexAttribArrayARB(JNIEnv *__env, jclass clazz, jint index, jlong __functionAddress) {
	glDisableVertexAttribArrayARBPROC glDisableVertexAttribArrayARB = (glDisableVertexAttribArrayARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableVertexAttribArrayARB(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglBindAttribLocationARB(JNIEnv *__env, jclass clazz, jint programObj, jint index, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glBindAttribLocationARBPROC glBindAttribLocationARB = (glBindAttribLocationARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindAttribLocationARB(programObj, index, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetActiveAttribARB(JNIEnv *__env, jclass clazz, jint programObj, jint index, jint maxLength, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLint *size = (GLint *)(intptr_t)sizeAddress;
	GLenum *type = (GLenum *)(intptr_t)typeAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetActiveAttribARBPROC glGetActiveAttribARB = (glGetActiveAttribARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveAttribARB(programObj, index, maxLength, length, size, type, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetAttribLocationARB(JNIEnv *__env, jclass clazz, jint programObj, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetAttribLocationARBPROC glGetAttribLocationARB = (glGetAttribLocationARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetAttribLocationARB(programObj, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetVertexAttribivARB(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetVertexAttribivARBPROC glGetVertexAttribivARB = (glGetVertexAttribivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribivARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetVertexAttribfvARB(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetVertexAttribfvARBPROC glGetVertexAttribfvARB = (glGetVertexAttribfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribfvARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetVertexAttribdvARB(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetVertexAttribdvARBPROC glGetVertexAttribdvARB = (glGetVertexAttribdvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribdvARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetVertexAttribPointervARB(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong pointerAddress, jlong __functionAddress) {
	void **pointer = (void **)(intptr_t)pointerAddress;
	glGetVertexAttribPointervARBPROC glGetVertexAttribPointervARB = (glGetVertexAttribPointervARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribPointervARB(index, pname, pointer);
}

EXTERN_C_EXIT
