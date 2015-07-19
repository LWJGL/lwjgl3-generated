/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBlendColorPROC) (GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glBlendEquationPROC) (GLenum);
typedef void (APIENTRY *glFogCoordfPROC) (GLfloat);
typedef void (APIENTRY *glFogCoorddPROC) (GLdouble);
typedef void (APIENTRY *glFogCoordfvPROC) (const GLfloat *);
typedef void (APIENTRY *glFogCoorddvPROC) (const GLdouble *);
typedef void (APIENTRY *glFogCoordPointerPROC) (GLenum, GLsizei, const void *);
typedef void (APIENTRY *glMultiDrawArraysPROC) (GLenum, const GLint *, const GLsizei *, GLsizei);
typedef void (APIENTRY *glMultiDrawElementsPROC) (GLenum, GLsizei *, GLenum, const void **, GLsizei);
typedef void (APIENTRY *glPointParameterfPROC) (GLenum, GLfloat);
typedef void (APIENTRY *glPointParameteriPROC) (GLenum, GLint);
typedef void (APIENTRY *glPointParameterfvPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glPointParameterivPROC) (GLenum, const GLint *);
typedef void (APIENTRY *glSecondaryColor3bPROC) (GLbyte, GLbyte, GLbyte);
typedef void (APIENTRY *glSecondaryColor3sPROC) (GLshort, GLshort, GLshort);
typedef void (APIENTRY *glSecondaryColor3iPROC) (GLint, GLint, GLint);
typedef void (APIENTRY *glSecondaryColor3fPROC) (GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glSecondaryColor3dPROC) (GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glSecondaryColor3ubPROC) (GLubyte, GLubyte, GLubyte);
typedef void (APIENTRY *glSecondaryColor3usPROC) (GLushort, GLushort, GLushort);
typedef void (APIENTRY *glSecondaryColor3uiPROC) (GLint, GLint, GLint);
typedef void (APIENTRY *glSecondaryColor3bvPROC) (const GLbyte *);
typedef void (APIENTRY *glSecondaryColor3svPROC) (const GLshort *);
typedef void (APIENTRY *glSecondaryColor3ivPROC) (const GLint *);
typedef void (APIENTRY *glSecondaryColor3fvPROC) (const GLfloat *);
typedef void (APIENTRY *glSecondaryColor3dvPROC) (const GLdouble *);
typedef void (APIENTRY *glSecondaryColor3ubvPROC) (const GLubyte *);
typedef void (APIENTRY *glSecondaryColor3usvPROC) (const GLushort *);
typedef void (APIENTRY *glSecondaryColor3uivPROC) (const GLuint *);
typedef void (APIENTRY *glSecondaryColorPointerPROC) (GLint, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glBlendFuncSeparatePROC) (GLenum, GLenum, GLenum, GLenum);
typedef void (APIENTRY *glWindowPos2iPROC) (GLint, GLint);
typedef void (APIENTRY *glWindowPos2sPROC) (GLshort, GLshort);
typedef void (APIENTRY *glWindowPos2fPROC) (GLfloat, GLfloat);
typedef void (APIENTRY *glWindowPos2dPROC) (GLdouble, GLdouble);
typedef void (APIENTRY *glWindowPos2ivPROC) (const GLint *);
typedef void (APIENTRY *glWindowPos2svPROC) (const GLshort *);
typedef void (APIENTRY *glWindowPos2fvPROC) (const GLfloat *);
typedef void (APIENTRY *glWindowPos2dvPROC) (const GLdouble *);
typedef void (APIENTRY *glWindowPos3iPROC) (GLint, GLint, GLint);
typedef void (APIENTRY *glWindowPos3sPROC) (GLshort, GLshort, GLshort);
typedef void (APIENTRY *glWindowPos3fPROC) (GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glWindowPos3dPROC) (GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glWindowPos3ivPROC) (const GLint *);
typedef void (APIENTRY *glWindowPos3svPROC) (const GLshort *);
typedef void (APIENTRY *glWindowPos3fvPROC) (const GLfloat *);
typedef void (APIENTRY *glWindowPos3dvPROC) (const GLdouble *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglBlendColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha, jlong __functionAddress) {
	glBlendColorPROC glBlendColor = (glBlendColorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglBlendEquation(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glBlendEquationPROC glBlendEquation = (glBlendEquationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquation(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglFogCoordf(JNIEnv *__env, jclass clazz, jfloat coord, jlong __functionAddress) {
	glFogCoordfPROC glFogCoordf = (glFogCoordfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogCoordf(coord);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglFogCoordd(JNIEnv *__env, jclass clazz, jdouble coord, jlong __functionAddress) {
	glFogCoorddPROC glFogCoordd = (glFogCoorddPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogCoordd(coord);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglFogCoordfv(JNIEnv *__env, jclass clazz, jlong coordAddress, jlong __functionAddress) {
	const GLfloat *coord = (const GLfloat *)(intptr_t)coordAddress;
	glFogCoordfvPROC glFogCoordfv = (glFogCoordfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogCoordfv(coord);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglFogCoorddv(JNIEnv *__env, jclass clazz, jlong coordAddress, jlong __functionAddress) {
	const GLdouble *coord = (const GLdouble *)(intptr_t)coordAddress;
	glFogCoorddvPROC glFogCoorddv = (glFogCoorddvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogCoorddv(coord);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglFogCoordPointer(JNIEnv *__env, jclass clazz, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const void *pointer = (const void *)(intptr_t)pointerAddress;
	glFogCoordPointerPROC glFogCoordPointer = (glFogCoordPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogCoordPointer(type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglMultiDrawArrays(JNIEnv *__env, jclass clazz, jint mode, jlong firstAddress, jlong countAddress, jint primcount, jlong __functionAddress) {
	const GLint *first = (const GLint *)(intptr_t)firstAddress;
	const GLsizei *count = (const GLsizei *)(intptr_t)countAddress;
	glMultiDrawArraysPROC glMultiDrawArrays = (glMultiDrawArraysPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawArrays(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglMultiDrawElements(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint primcount, jlong __functionAddress) {
	GLsizei *count = (GLsizei *)(intptr_t)countAddress;
	const void **indices = (const void **)(intptr_t)indicesAddress;
	glMultiDrawElementsPROC glMultiDrawElements = (glMultiDrawElementsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiDrawElements(mode, count, type, indices, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglPointParameterf(JNIEnv *__env, jclass clazz, jint pname, jfloat param, jlong __functionAddress) {
	glPointParameterfPROC glPointParameterf = (glPointParameterfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPointParameterf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglPointParameteri(JNIEnv *__env, jclass clazz, jint pname, jint param, jlong __functionAddress) {
	glPointParameteriPROC glPointParameteri = (glPointParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPointParameteri(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglPointParameterfv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glPointParameterfvPROC glPointParameterfv = (glPointParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPointParameterfv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglPointParameteriv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glPointParameterivPROC glPointParameteriv = (glPointParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPointParameteriv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3b(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jlong __functionAddress) {
	glSecondaryColor3bPROC glSecondaryColor3b = (glSecondaryColor3bPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3b(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3s(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jlong __functionAddress) {
	glSecondaryColor3sPROC glSecondaryColor3s = (glSecondaryColor3sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3s(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3i(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jlong __functionAddress) {
	glSecondaryColor3iPROC glSecondaryColor3i = (glSecondaryColor3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3i(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3f(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jlong __functionAddress) {
	glSecondaryColor3fPROC glSecondaryColor3f = (glSecondaryColor3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3f(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3d(JNIEnv *__env, jclass clazz, jdouble red, jdouble green, jdouble blue, jlong __functionAddress) {
	glSecondaryColor3dPROC glSecondaryColor3d = (glSecondaryColor3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3d(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3ub(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jlong __functionAddress) {
	glSecondaryColor3ubPROC glSecondaryColor3ub = (glSecondaryColor3ubPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3ub(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3us(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jlong __functionAddress) {
	glSecondaryColor3usPROC glSecondaryColor3us = (glSecondaryColor3usPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3us(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3ui(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jlong __functionAddress) {
	glSecondaryColor3uiPROC glSecondaryColor3ui = (glSecondaryColor3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3ui(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3bv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glSecondaryColor3bvPROC glSecondaryColor3bv = (glSecondaryColor3bvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3bv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3sv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glSecondaryColor3svPROC glSecondaryColor3sv = (glSecondaryColor3svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3iv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glSecondaryColor3ivPROC glSecondaryColor3iv = (glSecondaryColor3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3fv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glSecondaryColor3fvPROC glSecondaryColor3fv = (glSecondaryColor3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3dv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glSecondaryColor3dvPROC glSecondaryColor3dv = (glSecondaryColor3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3ubv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLubyte *v = (const GLubyte *)(intptr_t)vAddress;
	glSecondaryColor3ubvPROC glSecondaryColor3ubv = (glSecondaryColor3ubvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3ubv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3usv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLushort *v = (const GLushort *)(intptr_t)vAddress;
	glSecondaryColor3usvPROC glSecondaryColor3usv = (glSecondaryColor3usvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3usv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3uiv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glSecondaryColor3uivPROC glSecondaryColor3uiv = (glSecondaryColor3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColor3uiv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColorPointer(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const void *pointer = (const void *)(intptr_t)pointerAddress;
	glSecondaryColorPointerPROC glSecondaryColorPointer = (glSecondaryColorPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColorPointer(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglBlendFuncSeparate(JNIEnv *__env, jclass clazz, jint sfactorRGB, jint dfactorRGB, jint sfactorAlpha, jint dfactorAlpha, jlong __functionAddress) {
	glBlendFuncSeparatePROC glBlendFuncSeparate = (glBlendFuncSeparatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2i(JNIEnv *__env, jclass clazz, jint x, jint y, jlong __functionAddress) {
	glWindowPos2iPROC glWindowPos2i = (glWindowPos2iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2i(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jlong __functionAddress) {
	glWindowPos2sPROC glWindowPos2s = (glWindowPos2sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2s(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jlong __functionAddress) {
	glWindowPos2fPROC glWindowPos2f = (glWindowPos2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2f(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jlong __functionAddress) {
	glWindowPos2dPROC glWindowPos2d = (glWindowPos2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2d(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2iv(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLint *p = (const GLint *)(intptr_t)pAddress;
	glWindowPos2ivPROC glWindowPos2iv = (glWindowPos2ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2iv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2sv(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLshort *p = (const GLshort *)(intptr_t)pAddress;
	glWindowPos2svPROC glWindowPos2sv = (glWindowPos2svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2sv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2fv(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLfloat *p = (const GLfloat *)(intptr_t)pAddress;
	glWindowPos2fvPROC glWindowPos2fv = (glWindowPos2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2fv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2dv(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLdouble *p = (const GLdouble *)(intptr_t)pAddress;
	glWindowPos2dvPROC glWindowPos2dv = (glWindowPos2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos2dv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z, jlong __functionAddress) {
	glWindowPos3iPROC glWindowPos3i = (glWindowPos3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3i(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jlong __functionAddress) {
	glWindowPos3sPROC glWindowPos3s = (glWindowPos3sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3s(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glWindowPos3fPROC glWindowPos3f = (glWindowPos3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3f(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glWindowPos3dPROC glWindowPos3d = (glWindowPos3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3d(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3iv(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLint *p = (const GLint *)(intptr_t)pAddress;
	glWindowPos3ivPROC glWindowPos3iv = (glWindowPos3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3iv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3sv(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLshort *p = (const GLshort *)(intptr_t)pAddress;
	glWindowPos3svPROC glWindowPos3sv = (glWindowPos3svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3sv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3fv(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLfloat *p = (const GLfloat *)(intptr_t)pAddress;
	glWindowPos3fvPROC glWindowPos3fv = (glWindowPos3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3fv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3dv(JNIEnv *__env, jclass clazz, jlong pAddress, jlong __functionAddress) {
	const GLdouble *p = (const GLdouble *)(intptr_t)pAddress;
	glWindowPos3dvPROC glWindowPos3dv = (glWindowPos3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWindowPos3dv(p);
}

EXTERN_C_EXIT
