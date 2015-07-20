/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glVertex2hNVPROC) (GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glVertex2hvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glVertex3hNVPROC) (GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glVertex3hvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glVertex4hNVPROC) (GLhalfNV, GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glVertex4hvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glNormal3hNVPROC) (GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glNormal3hvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glColor3hNVPROC) (GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glColor3hvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glColor4hNVPROC) (GLhalfNV, GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glColor4hvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glTexCoord1hNVPROC) (GLhalfNV);
typedef void (APIENTRY *glTexCoord1hvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glTexCoord2hNVPROC) (GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glTexCoord2hvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glTexCoord3hNVPROC) (GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glTexCoord3hvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glTexCoord4hNVPROC) (GLhalfNV, GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glTexCoord4hvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glMultiTexCoord1hNVPROC) (GLenum, GLhalfNV);
typedef void (APIENTRY *glMultiTexCoord1hvNVPROC) (GLenum, const GLhalfNV *);
typedef void (APIENTRY *glMultiTexCoord2hNVPROC) (GLenum, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glMultiTexCoord2hvNVPROC) (GLenum, const GLhalfNV *);
typedef void (APIENTRY *glMultiTexCoord3hNVPROC) (GLenum, GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glMultiTexCoord3hvNVPROC) (GLenum, const GLhalfNV *);
typedef void (APIENTRY *glMultiTexCoord4hNVPROC) (GLenum, GLhalfNV, GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glMultiTexCoord4hvNVPROC) (GLenum, const GLhalfNV *);
typedef void (APIENTRY *glFogCoordhNVPROC) (GLhalfNV);
typedef void (APIENTRY *glFogCoordhvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glSecondaryColor3hNVPROC) (GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glSecondaryColor3hvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glVertexWeighthNVPROC) (GLhalfNV);
typedef void (APIENTRY *glVertexWeighthvNVPROC) (const GLhalfNV *);
typedef void (APIENTRY *glVertexAttrib1hNVPROC) (GLuint, GLhalfNV);
typedef void (APIENTRY *glVertexAttrib1hvNVPROC) (GLuint, const GLhalfNV *);
typedef void (APIENTRY *glVertexAttrib2hNVPROC) (GLuint, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glVertexAttrib2hvNVPROC) (GLuint, const GLhalfNV *);
typedef void (APIENTRY *glVertexAttrib3hNVPROC) (GLuint, GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glVertexAttrib3hvNVPROC) (GLuint, const GLhalfNV *);
typedef void (APIENTRY *glVertexAttrib4hNVPROC) (GLuint, GLhalfNV, GLhalfNV, GLhalfNV, GLhalfNV);
typedef void (APIENTRY *glVertexAttrib4hvNVPROC) (GLuint, const GLhalfNV *);
typedef void (APIENTRY *glVertexAttribs1hvNVPROC) (GLuint, GLsizei, const GLhalfNV *);
typedef void (APIENTRY *glVertexAttribs2hvNVPROC) (GLuint, GLsizei, const GLhalfNV *);
typedef void (APIENTRY *glVertexAttribs3hvNVPROC) (GLuint, GLsizei, const GLhalfNV *);
typedef void (APIENTRY *glVertexAttribs4hvNVPROC) (GLuint, GLsizei, const GLhalfNV *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertex2hNV(JNIEnv *__env, jclass clazz, jshort x, jshort y, jlong __functionAddress) {
	glVertex2hNVPROC glVertex2hNV = (glVertex2hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex2hNV(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertex2hvNV(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glVertex2hvNVPROC glVertex2hvNV = (glVertex2hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex2hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertex3hNV(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jlong __functionAddress) {
	glVertex3hNVPROC glVertex3hNV = (glVertex3hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex3hNV(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertex3hvNV(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glVertex3hvNVPROC glVertex3hvNV = (glVertex3hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex3hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertex4hNV(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jshort w, jlong __functionAddress) {
	glVertex4hNVPROC glVertex4hNV = (glVertex4hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex4hNV(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertex4hvNV(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glVertex4hvNVPROC glVertex4hvNV = (glVertex4hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex4hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglNormal3hNV(JNIEnv *__env, jclass clazz, jshort nx, jshort ny, jshort nz, jlong __functionAddress) {
	glNormal3hNVPROC glNormal3hNV = (glNormal3hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3hNV(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglNormal3hvNV(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glNormal3hvNVPROC glNormal3hvNV = (glNormal3hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglColor3hNV(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jlong __functionAddress) {
	glColor3hNVPROC glColor3hNV = (glColor3hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3hNV(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglColor3hvNV(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glColor3hvNVPROC glColor3hvNV = (glColor3hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglColor4hNV(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha, jlong __functionAddress) {
	glColor4hNVPROC glColor4hNV = (glColor4hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4hNV(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglColor4hvNV(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glColor4hvNVPROC glColor4hvNV = (glColor4hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord1hNV(JNIEnv *__env, jclass clazz, jshort s, jlong __functionAddress) {
	glTexCoord1hNVPROC glTexCoord1hNV = (glTexCoord1hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord1hNV(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord1hvNV(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glTexCoord1hvNVPROC glTexCoord1hvNV = (glTexCoord1hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord1hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord2hNV(JNIEnv *__env, jclass clazz, jshort s, jshort t, jlong __functionAddress) {
	glTexCoord2hNVPROC glTexCoord2hNV = (glTexCoord2hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord2hNV(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord2hvNV(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glTexCoord2hvNVPROC glTexCoord2hvNV = (glTexCoord2hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord2hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord3hNV(JNIEnv *__env, jclass clazz, jshort s, jshort t, jshort r, jlong __functionAddress) {
	glTexCoord3hNVPROC glTexCoord3hNV = (glTexCoord3hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord3hNV(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord3hvNV(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glTexCoord3hvNVPROC glTexCoord3hvNV = (glTexCoord3hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord3hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord4hNV(JNIEnv *__env, jclass clazz, jshort s, jshort t, jshort r, jshort q, jlong __functionAddress) {
	glTexCoord4hNVPROC glTexCoord4hNV = (glTexCoord4hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord4hNV(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord4hvNV(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glTexCoord4hvNVPROC glTexCoord4hvNV = (glTexCoord4hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord4hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord1hNV(JNIEnv *__env, jclass clazz, jint target, jshort s, jlong __functionAddress) {
	glMultiTexCoord1hNVPROC glMultiTexCoord1hNV = (glMultiTexCoord1hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1hNV(target, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord1hvNV(JNIEnv *__env, jclass clazz, jint target, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glMultiTexCoord1hvNVPROC glMultiTexCoord1hvNV = (glMultiTexCoord1hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord1hvNV(target, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord2hNV(JNIEnv *__env, jclass clazz, jint target, jshort s, jshort t, jlong __functionAddress) {
	glMultiTexCoord2hNVPROC glMultiTexCoord2hNV = (glMultiTexCoord2hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2hNV(target, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord2hvNV(JNIEnv *__env, jclass clazz, jint target, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glMultiTexCoord2hvNVPROC glMultiTexCoord2hvNV = (glMultiTexCoord2hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord2hvNV(target, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord3hNV(JNIEnv *__env, jclass clazz, jint target, jshort s, jshort t, jshort r, jlong __functionAddress) {
	glMultiTexCoord3hNVPROC glMultiTexCoord3hNV = (glMultiTexCoord3hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3hNV(target, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord3hvNV(JNIEnv *__env, jclass clazz, jint target, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glMultiTexCoord3hvNVPROC glMultiTexCoord3hvNV = (glMultiTexCoord3hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord3hvNV(target, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord4hNV(JNIEnv *__env, jclass clazz, jint target, jshort s, jshort t, jshort r, jshort q, jlong __functionAddress) {
	glMultiTexCoord4hNVPROC glMultiTexCoord4hNV = (glMultiTexCoord4hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4hNV(target, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord4hvNV(JNIEnv *__env, jclass clazz, jint target, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glMultiTexCoord4hvNVPROC glMultiTexCoord4hvNV = (glMultiTexCoord4hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoord4hvNV(target, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglFogCoordhNV(JNIEnv *__env, jclass clazz, jshort fog, jlong __functionAddress) {
	glFogCoordhNVPROC glFogCoordhNV = (glFogCoordhNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogCoordhNV(fog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglFogCoordhvNV(JNIEnv *__env, jclass clazz, jlong fogAddress, jlong __functionAddress) {
	const GLhalfNV *fog = (const GLhalfNV *)(intptr_t)fogAddress;
	glFogCoordhvNVPROC glFogCoordhvNV = (glFogCoordhvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogCoordhvNV(fog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglSecondaryColor3hNV(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jlong __functionAddress) {
	glSecondaryColor3hNVPROC glSecondaryColor3hNV = (glSecondaryColor3hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3hNV(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglSecondaryColor3hvNV(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glSecondaryColor3hvNVPROC glSecondaryColor3hvNV = (glSecondaryColor3hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexWeighthNV(JNIEnv *__env, jclass clazz, jshort weight, jlong __functionAddress) {
	glVertexWeighthNVPROC glVertexWeighthNV = (glVertexWeighthNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexWeighthNV(weight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexWeighthvNV(JNIEnv *__env, jclass clazz, jlong weightAddress, jlong __functionAddress) {
	const GLhalfNV *weight = (const GLhalfNV *)(intptr_t)weightAddress;
	glVertexWeighthvNVPROC glVertexWeighthvNV = (glVertexWeighthvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexWeighthvNV(weight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib1hNV(JNIEnv *__env, jclass clazz, jint index, jshort x, jlong __functionAddress) {
	glVertexAttrib1hNVPROC glVertexAttrib1hNV = (glVertexAttrib1hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1hNV(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib1hvNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glVertexAttrib1hvNVPROC glVertexAttrib1hvNV = (glVertexAttrib1hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1hvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib2hNV(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y, jlong __functionAddress) {
	glVertexAttrib2hNVPROC glVertexAttrib2hNV = (glVertexAttrib2hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2hNV(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib2hvNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glVertexAttrib2hvNVPROC glVertexAttrib2hvNV = (glVertexAttrib2hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2hvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib3hNV(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y, jshort z, jlong __functionAddress) {
	glVertexAttrib3hNVPROC glVertexAttrib3hNV = (glVertexAttrib3hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3hNV(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib3hvNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glVertexAttrib3hvNVPROC glVertexAttrib3hvNV = (glVertexAttrib3hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3hvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib4hNV(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y, jshort z, jshort w, jlong __functionAddress) {
	glVertexAttrib4hNVPROC glVertexAttrib4hNV = (glVertexAttrib4hNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4hNV(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib4hvNV(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glVertexAttrib4hvNVPROC glVertexAttrib4hvNV = (glVertexAttrib4hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4hvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttribs1hvNV(JNIEnv *__env, jclass clazz, jint index, jint n, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glVertexAttribs1hvNVPROC glVertexAttribs1hvNV = (glVertexAttribs1hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribs1hvNV(index, n, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttribs2hvNV(JNIEnv *__env, jclass clazz, jint index, jint n, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glVertexAttribs2hvNVPROC glVertexAttribs2hvNV = (glVertexAttribs2hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribs2hvNV(index, n, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttribs3hvNV(JNIEnv *__env, jclass clazz, jint index, jint n, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glVertexAttribs3hvNVPROC glVertexAttribs3hvNV = (glVertexAttribs3hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribs3hvNV(index, n, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttribs4hvNV(JNIEnv *__env, jclass clazz, jint index, jint n, jlong vAddress, jlong __functionAddress) {
	const GLhalfNV *v = (const GLhalfNV *)(intptr_t)vAddress;
	glVertexAttribs4hvNVPROC glVertexAttribs4hvNV = (glVertexAttribs4hvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribs4hvNV(index, n, v);
}

EXTERN_C_EXIT
