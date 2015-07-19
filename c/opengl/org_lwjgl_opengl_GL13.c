/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glCompressedTexImage3DPROC) (GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTexImage2DPROC) (GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTexImage1DPROC) (GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTexSubImage3DPROC) (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTexSubImage2DPROC) (GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTexSubImage1DPROC) (GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glGetCompressedTexImagePROC) (GLenum, GLint, void *);
typedef void (APIENTRY *glSampleCoveragePROC) (GLfloat, GLboolean);
typedef void (APIENTRY *glActiveTexturePROC) (GLenum);
typedef void (APIENTRY *glClientActiveTexturePROC) (GLenum);
typedef void (APIENTRY *glMultiTexCoord1fPROC) (GLenum, GLfloat);
typedef void (APIENTRY *glMultiTexCoord1sPROC) (GLenum, GLshort);
typedef void (APIENTRY *glMultiTexCoord1iPROC) (GLenum, GLint);
typedef void (APIENTRY *glMultiTexCoord1dPROC) (GLenum, GLdouble);
typedef void (APIENTRY *glMultiTexCoord1fvPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMultiTexCoord1svPROC) (GLenum, const GLshort *);
typedef void (APIENTRY *glMultiTexCoord1ivPROC) (GLenum, const GLint *);
typedef void (APIENTRY *glMultiTexCoord1dvPROC) (GLenum, const GLdouble *);
typedef void (APIENTRY *glMultiTexCoord2fPROC) (GLenum, GLfloat, GLfloat);
typedef void (APIENTRY *glMultiTexCoord2sPROC) (GLenum, GLshort, GLshort);
typedef void (APIENTRY *glMultiTexCoord2iPROC) (GLenum, GLint, GLint);
typedef void (APIENTRY *glMultiTexCoord2dPROC) (GLenum, GLdouble, GLdouble);
typedef void (APIENTRY *glMultiTexCoord2fvPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMultiTexCoord2svPROC) (GLenum, const GLshort *);
typedef void (APIENTRY *glMultiTexCoord2ivPROC) (GLenum, const GLint *);
typedef void (APIENTRY *glMultiTexCoord2dvPROC) (GLenum, const GLdouble *);
typedef void (APIENTRY *glMultiTexCoord3fPROC) (GLenum, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glMultiTexCoord3sPROC) (GLenum, GLshort, GLshort, GLshort);
typedef void (APIENTRY *glMultiTexCoord3iPROC) (GLenum, GLint, GLint, GLint);
typedef void (APIENTRY *glMultiTexCoord3dPROC) (GLenum, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glMultiTexCoord3fvPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMultiTexCoord3svPROC) (GLenum, const GLshort *);
typedef void (APIENTRY *glMultiTexCoord3ivPROC) (GLenum, const GLint *);
typedef void (APIENTRY *glMultiTexCoord3dvPROC) (GLenum, const GLdouble *);
typedef void (APIENTRY *glMultiTexCoord4fPROC) (GLenum, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glMultiTexCoord4sPROC) (GLenum, GLshort, GLshort, GLshort, GLshort);
typedef void (APIENTRY *glMultiTexCoord4iPROC) (GLenum, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glMultiTexCoord4dPROC) (GLenum, GLdouble, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glMultiTexCoord4fvPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMultiTexCoord4svPROC) (GLenum, const GLshort *);
typedef void (APIENTRY *glMultiTexCoord4ivPROC) (GLenum, const GLint *);
typedef void (APIENTRY *glMultiTexCoord4dvPROC) (GLenum, const GLdouble *);
typedef void (APIENTRY *glLoadTransposeMatrixfPROC) (const GLfloat *);
typedef void (APIENTRY *glLoadTransposeMatrixdPROC) (const GLdouble *);
typedef void (APIENTRY *glMultTransposeMatrixfPROC) (const GLfloat *);
typedef void (APIENTRY *glMultTransposeMatrixdPROC) (const GLdouble *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglCompressedTexImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexImage3DPROC glCompressedTexImage3D = (glCompressedTexImage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglCompressedTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexImage2DPROC glCompressedTexImage2D = (glCompressedTexImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglCompressedTexImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexImage1DPROC glCompressedTexImage1D = (glCompressedTexImage1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexImage1D(target, level, internalformat, width, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglCompressedTexSubImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexSubImage3DPROC glCompressedTexSubImage3D = (glCompressedTexSubImage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglCompressedTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexSubImage2DPROC glCompressedTexSubImage2D = (glCompressedTexSubImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglCompressedTexSubImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint width, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexSubImage1DPROC glCompressedTexSubImage1D = (glCompressedTexSubImage1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglGetCompressedTexImage(JNIEnv *__env, jclass clazz, jint target, jint level, jlong pixelsAddress, jlong __functionAddress) {
	void *pixels = (void *)(intptr_t)pixelsAddress;
	glGetCompressedTexImagePROC glGetCompressedTexImage = (glGetCompressedTexImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetCompressedTexImage(target, level, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglSampleCoverage(JNIEnv *__env, jclass clazz, jfloat value, jboolean invert, jlong __functionAddress) {
	glSampleCoveragePROC glSampleCoverage = (glSampleCoveragePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSampleCoverage(value, invert);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglActiveTexture(JNIEnv *__env, jclass clazz, jint texture, jlong __functionAddress) {
	glActiveTexturePROC glActiveTexture = (glActiveTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glActiveTexture(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglClientActiveTexture(JNIEnv *__env, jclass clazz, jint texture, jlong __functionAddress) {
	glClientActiveTexturePROC glClientActiveTexture = (glClientActiveTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClientActiveTexture(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord1f(JNIEnv *__env, jclass clazz, jint texture, jfloat s, jlong __functionAddress) {
	glMultiTexCoord1fPROC glMultiTexCoord1f = (glMultiTexCoord1fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1f(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord1s(JNIEnv *__env, jclass clazz, jint texture, jshort s, jlong __functionAddress) {
	glMultiTexCoord1sPROC glMultiTexCoord1s = (glMultiTexCoord1sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1s(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord1i(JNIEnv *__env, jclass clazz, jint texture, jint s, jlong __functionAddress) {
	glMultiTexCoord1iPROC glMultiTexCoord1i = (glMultiTexCoord1iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1i(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord1d(JNIEnv *__env, jclass clazz, jint texture, jdouble s, jlong __functionAddress) {
	glMultiTexCoord1dPROC glMultiTexCoord1d = (glMultiTexCoord1dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1d(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord1fv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glMultiTexCoord1fvPROC glMultiTexCoord1fv = (glMultiTexCoord1fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1fv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord1sv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glMultiTexCoord1svPROC glMultiTexCoord1sv = (glMultiTexCoord1svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1sv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord1iv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glMultiTexCoord1ivPROC glMultiTexCoord1iv = (glMultiTexCoord1ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1iv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord1dv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glMultiTexCoord1dvPROC glMultiTexCoord1dv = (glMultiTexCoord1dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1dv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord2f(JNIEnv *__env, jclass clazz, jint texture, jfloat s, jfloat t, jlong __functionAddress) {
	glMultiTexCoord2fPROC glMultiTexCoord2f = (glMultiTexCoord2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2f(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord2s(JNIEnv *__env, jclass clazz, jint texture, jshort s, jshort t, jlong __functionAddress) {
	glMultiTexCoord2sPROC glMultiTexCoord2s = (glMultiTexCoord2sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2s(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord2i(JNIEnv *__env, jclass clazz, jint texture, jint s, jint t, jlong __functionAddress) {
	glMultiTexCoord2iPROC glMultiTexCoord2i = (glMultiTexCoord2iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2i(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord2d(JNIEnv *__env, jclass clazz, jint texture, jdouble s, jdouble t, jlong __functionAddress) {
	glMultiTexCoord2dPROC glMultiTexCoord2d = (glMultiTexCoord2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2d(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord2fv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glMultiTexCoord2fvPROC glMultiTexCoord2fv = (glMultiTexCoord2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2fv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord2sv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glMultiTexCoord2svPROC glMultiTexCoord2sv = (glMultiTexCoord2svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2sv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord2iv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glMultiTexCoord2ivPROC glMultiTexCoord2iv = (glMultiTexCoord2ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2iv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord2dv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glMultiTexCoord2dvPROC glMultiTexCoord2dv = (glMultiTexCoord2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2dv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord3f(JNIEnv *__env, jclass clazz, jint texture, jfloat s, jfloat t, jfloat r, jlong __functionAddress) {
	glMultiTexCoord3fPROC glMultiTexCoord3f = (glMultiTexCoord3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3f(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord3s(JNIEnv *__env, jclass clazz, jint texture, jshort s, jshort t, jshort r, jlong __functionAddress) {
	glMultiTexCoord3sPROC glMultiTexCoord3s = (glMultiTexCoord3sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3s(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord3i(JNIEnv *__env, jclass clazz, jint texture, jint s, jint t, jint r, jlong __functionAddress) {
	glMultiTexCoord3iPROC glMultiTexCoord3i = (glMultiTexCoord3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3i(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord3d(JNIEnv *__env, jclass clazz, jint texture, jdouble s, jdouble t, jdouble r, jlong __functionAddress) {
	glMultiTexCoord3dPROC glMultiTexCoord3d = (glMultiTexCoord3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3d(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord3fv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glMultiTexCoord3fvPROC glMultiTexCoord3fv = (glMultiTexCoord3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3fv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord3sv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glMultiTexCoord3svPROC glMultiTexCoord3sv = (glMultiTexCoord3svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3sv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord3iv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glMultiTexCoord3ivPROC glMultiTexCoord3iv = (glMultiTexCoord3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3iv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord3dv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glMultiTexCoord3dvPROC glMultiTexCoord3dv = (glMultiTexCoord3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3dv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord4f(JNIEnv *__env, jclass clazz, jint texture, jfloat s, jfloat t, jfloat r, jfloat q, jlong __functionAddress) {
	glMultiTexCoord4fPROC glMultiTexCoord4f = (glMultiTexCoord4fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4f(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord4s(JNIEnv *__env, jclass clazz, jint texture, jshort s, jshort t, jshort r, jshort q, jlong __functionAddress) {
	glMultiTexCoord4sPROC glMultiTexCoord4s = (glMultiTexCoord4sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4s(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord4i(JNIEnv *__env, jclass clazz, jint texture, jint s, jint t, jint r, jint q, jlong __functionAddress) {
	glMultiTexCoord4iPROC glMultiTexCoord4i = (glMultiTexCoord4iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4i(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord4d(JNIEnv *__env, jclass clazz, jint texture, jdouble s, jdouble t, jdouble r, jdouble q, jlong __functionAddress) {
	glMultiTexCoord4dPROC glMultiTexCoord4d = (glMultiTexCoord4dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4d(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord4fv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glMultiTexCoord4fvPROC glMultiTexCoord4fv = (glMultiTexCoord4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4fv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord4sv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glMultiTexCoord4svPROC glMultiTexCoord4sv = (glMultiTexCoord4svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4sv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord4iv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glMultiTexCoord4ivPROC glMultiTexCoord4iv = (glMultiTexCoord4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4iv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultiTexCoord4dv(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glMultiTexCoord4dvPROC glMultiTexCoord4dv = (glMultiTexCoord4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4dv(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglLoadTransposeMatrixf(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glLoadTransposeMatrixfPROC glLoadTransposeMatrixf = (glLoadTransposeMatrixfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLoadTransposeMatrixf(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglLoadTransposeMatrixd(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLdouble *m = (const GLdouble *)(intptr_t)mAddress;
	glLoadTransposeMatrixdPROC glLoadTransposeMatrixd = (glLoadTransposeMatrixdPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLoadTransposeMatrixd(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultTransposeMatrixf(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMultTransposeMatrixfPROC glMultTransposeMatrixf = (glMultTransposeMatrixfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultTransposeMatrixf(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13_nglMultTransposeMatrixd(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLdouble *m = (const GLdouble *)(intptr_t)mAddress;
	glMultTransposeMatrixdPROC glMultTransposeMatrixd = (glMultTransposeMatrixdPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultTransposeMatrixd(m);
}

EXTERN_C_EXIT
