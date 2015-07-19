/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glColorTablePROC) (GLenum, GLenum, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glCopyColorTablePROC) (GLenum, GLenum, GLint, GLint, GLsizei);
typedef void (APIENTRY *glColorTableParameterivPROC) (GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glColorTableParameterfvPROC) (GLenum, GLenum, const GLfloat *);
typedef void (APIENTRY *glGetColorTablePROC) (GLenum, GLenum, GLenum, void *);
typedef void (APIENTRY *glGetColorTableParameterivPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetColorTableParameterfvPROC) (GLenum, GLenum, GLfloat *);
typedef void (APIENTRY *glColorSubTablePROC) (GLenum, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glCopyColorSubTablePROC) (GLenum, GLsizei, GLint, GLint, GLsizei);
typedef void (APIENTRY *glConvolutionFilter1DPROC) (GLenum, GLenum, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glConvolutionFilter2DPROC) (GLenum, GLenum, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glCopyConvolutionFilter1DPROC) (GLenum, GLenum, GLint, GLint, GLsizei);
typedef void (APIENTRY *glCopyConvolutionFilter2DPROC) (GLenum, GLenum, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glGetConvolutionFilterPROC) (GLenum, GLenum, GLenum, void *);
typedef void (APIENTRY *glSeparableFilter2DPROC) (GLenum, GLenum, GLsizei, GLsizei, GLenum, GLenum, const void *, const void *);
typedef void (APIENTRY *glGetSeparableFilterPROC) (GLenum, GLenum, GLenum, void *, void *, void *);
typedef void (APIENTRY *glConvolutionParameteriPROC) (GLenum, GLenum, GLint);
typedef void (APIENTRY *glConvolutionParameterivPROC) (GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glConvolutionParameterfPROC) (GLenum, GLenum, GLfloat);
typedef void (APIENTRY *glConvolutionParameterfvPROC) (GLenum, GLenum, const GLfloat *);
typedef void (APIENTRY *glGetConvolutionParameterivPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetConvolutionParameterfvPROC) (GLenum, GLenum, GLfloat *);
typedef void (APIENTRY *glHistogramPROC) (GLenum, GLsizei, GLenum, GLboolean);
typedef void (APIENTRY *glResetHistogramPROC) (GLenum);
typedef void (APIENTRY *glGetHistogramPROC) (GLenum, GLboolean, GLenum, GLenum, void *);
typedef void (APIENTRY *glGetHistogramParameterivPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetHistogramParameterfvPROC) (GLenum, GLenum, GLfloat *);
typedef void (APIENTRY *glMinmaxPROC) (GLenum, GLenum, GLboolean);
typedef void (APIENTRY *glResetMinmaxPROC) (GLenum);
typedef void (APIENTRY *glGetMinmaxPROC) (GLenum, GLboolean, GLenum, GLenum, void *);
typedef void (APIENTRY *glGetMinmaxParameterivPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetMinmaxParameterfvPROC) (GLenum, GLenum, GLfloat *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglColorTable(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint format, jint type, jlong tableAddress, jlong __functionAddress) {
	const void *table = (const void *)(intptr_t)tableAddress;
	glColorTablePROC glColorTable = (glColorTablePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorTable(target, internalformat, width, format, type, table);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglCopyColorTable(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint x, jint y, jint width, jlong __functionAddress) {
	glCopyColorTablePROC glCopyColorTable = (glCopyColorTablePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyColorTable(target, internalformat, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglColorTableParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glColorTableParameterivPROC glColorTableParameteriv = (glColorTableParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorTableParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglColorTableParameterfv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glColorTableParameterfvPROC glColorTableParameterfv = (glColorTableParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorTableParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetColorTable(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jlong tableAddress, jlong __functionAddress) {
	void *table = (void *)(intptr_t)tableAddress;
	glGetColorTablePROC glGetColorTable = (glGetColorTablePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetColorTable(target, format, type, table);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetColorTableParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetColorTableParameterivPROC glGetColorTableParameteriv = (glGetColorTableParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetColorTableParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetColorTableParameterfv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetColorTableParameterfvPROC glGetColorTableParameterfv = (glGetColorTableParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetColorTableParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglColorSubTable(JNIEnv *__env, jclass clazz, jint target, jint start, jint count, jint format, jint type, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glColorSubTablePROC glColorSubTable = (glColorSubTablePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorSubTable(target, start, count, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglCopyColorSubTable(JNIEnv *__env, jclass clazz, jint target, jint start, jint x, jint y, jint width, jlong __functionAddress) {
	glCopyColorSubTablePROC glCopyColorSubTable = (glCopyColorSubTablePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyColorSubTable(target, start, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglConvolutionFilter1D(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint format, jint type, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glConvolutionFilter1DPROC glConvolutionFilter1D = (glConvolutionFilter1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glConvolutionFilter1D(target, internalformat, width, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglConvolutionFilter2D(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height, jint format, jint type, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glConvolutionFilter2DPROC glConvolutionFilter2D = (glConvolutionFilter2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glConvolutionFilter2D(target, internalformat, width, height, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglCopyConvolutionFilter1D(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint x, jint y, jint width, jlong __functionAddress) {
	glCopyConvolutionFilter1DPROC glCopyConvolutionFilter1D = (glCopyConvolutionFilter1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyConvolutionFilter1D(target, internalformat, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglCopyConvolutionFilter2D(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyConvolutionFilter2DPROC glCopyConvolutionFilter2D = (glCopyConvolutionFilter2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyConvolutionFilter2D(target, internalformat, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetConvolutionFilter(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jlong imageAddress, jlong __functionAddress) {
	void *image = (void *)(intptr_t)imageAddress;
	glGetConvolutionFilterPROC glGetConvolutionFilter = (glGetConvolutionFilterPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetConvolutionFilter(target, format, type, image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglSeparableFilter2D(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height, jint format, jint type, jlong rowAddress, jlong columnAddress, jlong __functionAddress) {
	const void *row = (const void *)(intptr_t)rowAddress;
	const void *column = (const void *)(intptr_t)columnAddress;
	glSeparableFilter2DPROC glSeparableFilter2D = (glSeparableFilter2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSeparableFilter2D(target, internalformat, width, height, format, type, row, column);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetSeparableFilter(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jlong rowAddress, jlong columnAddress, jlong spanAddress, jlong __functionAddress) {
	void *row = (void *)(intptr_t)rowAddress;
	void *column = (void *)(intptr_t)columnAddress;
	void *span = (void *)(intptr_t)spanAddress;
	glGetSeparableFilterPROC glGetSeparableFilter = (glGetSeparableFilterPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSeparableFilter(target, format, type, row, column, span);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglConvolutionParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param, jlong __functionAddress) {
	glConvolutionParameteriPROC glConvolutionParameteri = (glConvolutionParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glConvolutionParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglConvolutionParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glConvolutionParameterivPROC glConvolutionParameteriv = (glConvolutionParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glConvolutionParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglConvolutionParameterf(JNIEnv *__env, jclass clazz, jint target, jint pname, jfloat param, jlong __functionAddress) {
	glConvolutionParameterfPROC glConvolutionParameterf = (glConvolutionParameterfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glConvolutionParameterf(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglConvolutionParameterfv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glConvolutionParameterfvPROC glConvolutionParameterfv = (glConvolutionParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glConvolutionParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetConvolutionParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetConvolutionParameterivPROC glGetConvolutionParameteriv = (glGetConvolutionParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetConvolutionParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetConvolutionParameterfv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetConvolutionParameterfvPROC glGetConvolutionParameterfv = (glGetConvolutionParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetConvolutionParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglHistogram(JNIEnv *__env, jclass clazz, jint target, jint width, jint internalformat, jboolean sink, jlong __functionAddress) {
	glHistogramPROC glHistogram = (glHistogramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glHistogram(target, width, internalformat, sink);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglResetHistogram(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glResetHistogramPROC glResetHistogram = (glResetHistogramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glResetHistogram(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetHistogram(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jlong valuesAddress, jlong __functionAddress) {
	void *values = (void *)(intptr_t)valuesAddress;
	glGetHistogramPROC glGetHistogram = (glGetHistogramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetHistogram(target, reset, format, type, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetHistogramParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetHistogramParameterivPROC glGetHistogramParameteriv = (glGetHistogramParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetHistogramParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetHistogramParameterfv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetHistogramParameterfvPROC glGetHistogramParameterfv = (glGetHistogramParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetHistogramParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglMinmax(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jboolean sink, jlong __functionAddress) {
	glMinmaxPROC glMinmax = (glMinmaxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMinmax(target, internalformat, sink);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglResetMinmax(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glResetMinmaxPROC glResetMinmax = (glResetMinmaxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glResetMinmax(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetMinmax(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jlong valuesAddress, jlong __functionAddress) {
	void *values = (void *)(intptr_t)valuesAddress;
	glGetMinmaxPROC glGetMinmax = (glGetMinmaxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMinmax(target, reset, format, type, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetMinmaxParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetMinmaxParameterivPROC glGetMinmaxParameteriv = (glGetMinmaxParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMinmaxParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetMinmaxParameterfv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetMinmaxParameterfvPROC glGetMinmaxParameterfv = (glGetMinmaxParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMinmaxParameterfv(target, pname, params);
}

EXTERN_C_EXIT
