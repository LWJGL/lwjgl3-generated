/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glActiveTextureARBPROC) (GLenum);
typedef void (APIENTRY *glClientActiveTextureARBPROC) (GLenum);
typedef void (APIENTRY *glMultiTexCoord1fARBPROC) (GLenum, GLfloat);
typedef void (APIENTRY *glMultiTexCoord1sARBPROC) (GLenum, GLshort);
typedef void (APIENTRY *glMultiTexCoord1iARBPROC) (GLenum, GLint);
typedef void (APIENTRY *glMultiTexCoord1dARBPROC) (GLenum, GLdouble);
typedef void (APIENTRY *glMultiTexCoord1fvARBPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMultiTexCoord1svARBPROC) (GLenum, const GLshort *);
typedef void (APIENTRY *glMultiTexCoord1ivARBPROC) (GLenum, const GLint *);
typedef void (APIENTRY *glMultiTexCoord1dvARBPROC) (GLenum, const GLdouble *);
typedef void (APIENTRY *glMultiTexCoord2fARBPROC) (GLenum, GLfloat, GLfloat);
typedef void (APIENTRY *glMultiTexCoord2sARBPROC) (GLenum, GLshort, GLshort);
typedef void (APIENTRY *glMultiTexCoord2iARBPROC) (GLenum, GLint, GLint);
typedef void (APIENTRY *glMultiTexCoord2dARBPROC) (GLenum, GLdouble, GLdouble);
typedef void (APIENTRY *glMultiTexCoord2fvARBPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMultiTexCoord2svARBPROC) (GLenum, const GLshort *);
typedef void (APIENTRY *glMultiTexCoord2ivARBPROC) (GLenum, const GLint *);
typedef void (APIENTRY *glMultiTexCoord2dvARBPROC) (GLenum, const GLdouble *);
typedef void (APIENTRY *glMultiTexCoord3fARBPROC) (GLenum, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glMultiTexCoord3sARBPROC) (GLenum, GLshort, GLshort, GLshort);
typedef void (APIENTRY *glMultiTexCoord3iARBPROC) (GLenum, GLint, GLint, GLint);
typedef void (APIENTRY *glMultiTexCoord3dARBPROC) (GLenum, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glMultiTexCoord3fvARBPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMultiTexCoord3svARBPROC) (GLenum, const GLshort *);
typedef void (APIENTRY *glMultiTexCoord3ivARBPROC) (GLenum, const GLint *);
typedef void (APIENTRY *glMultiTexCoord3dvARBPROC) (GLenum, const GLdouble *);
typedef void (APIENTRY *glMultiTexCoord4fARBPROC) (GLenum, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glMultiTexCoord4sARBPROC) (GLenum, GLshort, GLshort, GLshort, GLshort);
typedef void (APIENTRY *glMultiTexCoord4iARBPROC) (GLenum, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glMultiTexCoord4dARBPROC) (GLenum, GLdouble, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glMultiTexCoord4fvARBPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMultiTexCoord4svARBPROC) (GLenum, const GLshort *);
typedef void (APIENTRY *glMultiTexCoord4ivARBPROC) (GLenum, const GLint *);
typedef void (APIENTRY *glMultiTexCoord4dvARBPROC) (GLenum, const GLdouble *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglActiveTextureARB(JNIEnv *__env, jclass clazz, jint texture, jlong __functionAddress) {
	glActiveTextureARBPROC glActiveTextureARB = (glActiveTextureARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glActiveTextureARB(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglClientActiveTextureARB(JNIEnv *__env, jclass clazz, jint texture, jlong __functionAddress) {
	glClientActiveTextureARBPROC glClientActiveTextureARB = (glClientActiveTextureARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClientActiveTextureARB(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1fARB(JNIEnv *__env, jclass clazz, jint texture, jfloat s, jlong __functionAddress) {
	glMultiTexCoord1fARBPROC glMultiTexCoord1fARB = (glMultiTexCoord1fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1fARB(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1sARB(JNIEnv *__env, jclass clazz, jint texture, jshort s, jlong __functionAddress) {
	glMultiTexCoord1sARBPROC glMultiTexCoord1sARB = (glMultiTexCoord1sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1sARB(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1iARB(JNIEnv *__env, jclass clazz, jint texture, jint s, jlong __functionAddress) {
	glMultiTexCoord1iARBPROC glMultiTexCoord1iARB = (glMultiTexCoord1iARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1iARB(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1dARB(JNIEnv *__env, jclass clazz, jint texture, jdouble s, jlong __functionAddress) {
	glMultiTexCoord1dARBPROC glMultiTexCoord1dARB = (glMultiTexCoord1dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1dARB(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1fvARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glMultiTexCoord1fvARBPROC glMultiTexCoord1fvARB = (glMultiTexCoord1fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1fvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1svARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glMultiTexCoord1svARBPROC glMultiTexCoord1svARB = (glMultiTexCoord1svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1svARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1ivARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glMultiTexCoord1ivARBPROC glMultiTexCoord1ivARB = (glMultiTexCoord1ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1ivARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1dvARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glMultiTexCoord1dvARBPROC glMultiTexCoord1dvARB = (glMultiTexCoord1dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1dvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2fARB(JNIEnv *__env, jclass clazz, jint texture, jfloat s, jfloat t, jlong __functionAddress) {
	glMultiTexCoord2fARBPROC glMultiTexCoord2fARB = (glMultiTexCoord2fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2fARB(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2sARB(JNIEnv *__env, jclass clazz, jint texture, jshort s, jshort t, jlong __functionAddress) {
	glMultiTexCoord2sARBPROC glMultiTexCoord2sARB = (glMultiTexCoord2sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2sARB(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2iARB(JNIEnv *__env, jclass clazz, jint texture, jint s, jint t, jlong __functionAddress) {
	glMultiTexCoord2iARBPROC glMultiTexCoord2iARB = (glMultiTexCoord2iARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2iARB(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2dARB(JNIEnv *__env, jclass clazz, jint texture, jdouble s, jdouble t, jlong __functionAddress) {
	glMultiTexCoord2dARBPROC glMultiTexCoord2dARB = (glMultiTexCoord2dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2dARB(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2fvARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glMultiTexCoord2fvARBPROC glMultiTexCoord2fvARB = (glMultiTexCoord2fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2fvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2svARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glMultiTexCoord2svARBPROC glMultiTexCoord2svARB = (glMultiTexCoord2svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2svARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2ivARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glMultiTexCoord2ivARBPROC glMultiTexCoord2ivARB = (glMultiTexCoord2ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2ivARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2dvARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glMultiTexCoord2dvARBPROC glMultiTexCoord2dvARB = (glMultiTexCoord2dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2dvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3fARB(JNIEnv *__env, jclass clazz, jint texture, jfloat s, jfloat t, jfloat r, jlong __functionAddress) {
	glMultiTexCoord3fARBPROC glMultiTexCoord3fARB = (glMultiTexCoord3fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3fARB(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3sARB(JNIEnv *__env, jclass clazz, jint texture, jshort s, jshort t, jshort r, jlong __functionAddress) {
	glMultiTexCoord3sARBPROC glMultiTexCoord3sARB = (glMultiTexCoord3sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3sARB(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3iARB(JNIEnv *__env, jclass clazz, jint texture, jint s, jint t, jint r, jlong __functionAddress) {
	glMultiTexCoord3iARBPROC glMultiTexCoord3iARB = (glMultiTexCoord3iARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3iARB(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3dARB(JNIEnv *__env, jclass clazz, jint texture, jdouble s, jdouble t, jdouble r, jlong __functionAddress) {
	glMultiTexCoord3dARBPROC glMultiTexCoord3dARB = (glMultiTexCoord3dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3dARB(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3fvARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glMultiTexCoord3fvARBPROC glMultiTexCoord3fvARB = (glMultiTexCoord3fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3fvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3svARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glMultiTexCoord3svARBPROC glMultiTexCoord3svARB = (glMultiTexCoord3svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3svARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3ivARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glMultiTexCoord3ivARBPROC glMultiTexCoord3ivARB = (glMultiTexCoord3ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3ivARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3dvARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glMultiTexCoord3dvARBPROC glMultiTexCoord3dvARB = (glMultiTexCoord3dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3dvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4fARB(JNIEnv *__env, jclass clazz, jint texture, jfloat s, jfloat t, jfloat r, jfloat q, jlong __functionAddress) {
	glMultiTexCoord4fARBPROC glMultiTexCoord4fARB = (glMultiTexCoord4fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4fARB(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4sARB(JNIEnv *__env, jclass clazz, jint texture, jshort s, jshort t, jshort r, jshort q, jlong __functionAddress) {
	glMultiTexCoord4sARBPROC glMultiTexCoord4sARB = (glMultiTexCoord4sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4sARB(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4iARB(JNIEnv *__env, jclass clazz, jint texture, jint s, jint t, jint r, jint q, jlong __functionAddress) {
	glMultiTexCoord4iARBPROC glMultiTexCoord4iARB = (glMultiTexCoord4iARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4iARB(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4dARB(JNIEnv *__env, jclass clazz, jint texture, jdouble s, jdouble t, jdouble r, jdouble q, jlong __functionAddress) {
	glMultiTexCoord4dARBPROC glMultiTexCoord4dARB = (glMultiTexCoord4dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4dARB(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4fvARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glMultiTexCoord4fvARBPROC glMultiTexCoord4fvARB = (glMultiTexCoord4fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4fvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4svARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glMultiTexCoord4svARBPROC glMultiTexCoord4svARB = (glMultiTexCoord4svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4svARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4ivARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glMultiTexCoord4ivARBPROC glMultiTexCoord4ivARB = (glMultiTexCoord4ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4ivARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4dvARB(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glMultiTexCoord4dvARBPROC glMultiTexCoord4dvARB = (glMultiTexCoord4dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4dvARB(texture, v);
}

EXTERN_C_EXIT
