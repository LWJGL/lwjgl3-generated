/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLenum (APIENTRY *glGetGraphicsResetStatusARBPROC) (void);
typedef void (APIENTRY *glGetnMapdvARBPROC) (GLenum, GLenum, GLsizei, GLdouble *);
typedef void (APIENTRY *glGetnMapfvARBPROC) (GLenum, GLenum, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnMapivARBPROC) (GLenum, GLenum, GLsizei, GLint *);
typedef void (APIENTRY *glGetnPixelMapfvARBPROC) (GLenum, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnPixelMapuivARBPROC) (GLenum, GLsizei, GLuint *);
typedef void (APIENTRY *glGetnPixelMapusvARBPROC) (GLenum, GLsizei, GLushort *);
typedef void (APIENTRY *glGetnPolygonStippleARBPROC) (GLsizei, GLubyte *);
typedef void (APIENTRY *glGetnTexImageARBPROC) (GLenum, GLint, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glReadnPixelsARBPROC) (GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnColorTableARBPROC) (GLenum, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnConvolutionFilterARBPROC) (GLenum, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnSeparableFilterARBPROC) (GLenum, GLenum, GLenum, GLsizei, void *, GLsizei, void *, void *);
typedef void (APIENTRY *glGetnHistogramARBPROC) (GLenum, GLboolean, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnMinmaxARBPROC) (GLenum, GLboolean, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnCompressedTexImageARBPROC) (GLenum, GLint, GLsizei, void *);
typedef void (APIENTRY *glGetnUniformfvARBPROC) (GLuint, GLint, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnUniformivARBPROC) (GLuint, GLint, GLsizei, GLint *);
typedef void (APIENTRY *glGetnUniformuivARBPROC) (GLuint, GLint, GLsizei, GLuint *);
typedef void (APIENTRY *glGetnUniformdvARBPROC) (GLuint, GLint, GLsizei, GLdouble *);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetGraphicsResetStatusARB(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glGetGraphicsResetStatusARBPROC glGetGraphicsResetStatusARB = (glGetGraphicsResetStatusARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetGraphicsResetStatusARB();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnMapdvARB(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLdouble *data = (GLdouble *)(intptr_t)dataAddress;
	glGetnMapdvARBPROC glGetnMapdvARB = (glGetnMapdvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnMapdvARB(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnMapfvARB(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetnMapfvARBPROC glGetnMapfvARB = (glGetnMapfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnMapfvARB(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnMapivARB(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetnMapivARBPROC glGetnMapivARB = (glGetnMapivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnMapivARB(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnPixelMapfvARB(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetnPixelMapfvARBPROC glGetnPixelMapfvARB = (glGetnPixelMapfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnPixelMapfvARB(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnPixelMapuivARB(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLuint *data = (GLuint *)(intptr_t)dataAddress;
	glGetnPixelMapuivARBPROC glGetnPixelMapuivARB = (glGetnPixelMapuivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnPixelMapuivARB(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnPixelMapusvARB(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLushort *data = (GLushort *)(intptr_t)dataAddress;
	glGetnPixelMapusvARBPROC glGetnPixelMapusvARB = (glGetnPixelMapusvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnPixelMapusvARB(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnPolygonStippleARB(JNIEnv *__env, jclass clazz, jint bufSize, jlong patternAddress, jlong __functionAddress) {
	GLubyte *pattern = (GLubyte *)(intptr_t)patternAddress;
	glGetnPolygonStippleARBPROC glGetnPolygonStippleARB = (glGetnPolygonStippleARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnPolygonStippleARB(bufSize, pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnTexImageARB(JNIEnv *__env, jclass clazz, jint tex, jint level, jint format, jint type, jint bufSize, jlong imgAddress, jlong __functionAddress) {
	void *img = (void *)(intptr_t)imgAddress;
	glGetnTexImageARBPROC glGetnTexImageARB = (glGetnTexImageARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnTexImageARB(tex, level, format, type, bufSize, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglReadnPixelsARB(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	void *data = (void *)(intptr_t)dataAddress;
	glReadnPixelsARBPROC glReadnPixelsARB = (glReadnPixelsARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReadnPixelsARB(x, y, width, height, format, type, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnColorTableARB(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint bufSize, jlong tableAddress, jlong __functionAddress) {
	void *table = (void *)(intptr_t)tableAddress;
	glGetnColorTableARBPROC glGetnColorTableARB = (glGetnColorTableARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnColorTableARB(target, format, type, bufSize, table);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnConvolutionFilterARB(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint bufSize, jlong imageAddress, jlong __functionAddress) {
	void *image = (void *)(intptr_t)imageAddress;
	glGetnConvolutionFilterARBPROC glGetnConvolutionFilterARB = (glGetnConvolutionFilterARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnConvolutionFilterARB(target, format, type, bufSize, image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnSeparableFilterARB(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint rowBufSize, jlong rowAddress, jint columnBufSize, jlong columnAddress, jlong spanAddress, jlong __functionAddress) {
	void *row = (void *)(intptr_t)rowAddress;
	void *column = (void *)(intptr_t)columnAddress;
	void *span = (void *)(intptr_t)spanAddress;
	glGetnSeparableFilterARBPROC glGetnSeparableFilterARB = (glGetnSeparableFilterARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnSeparableFilterARB(target, format, type, rowBufSize, row, columnBufSize, column, span);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnHistogramARB(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jint bufSize, jlong valuesAddress, jlong __functionAddress) {
	void *values = (void *)(intptr_t)valuesAddress;
	glGetnHistogramARBPROC glGetnHistogramARB = (glGetnHistogramARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnHistogramARB(target, reset, format, type, bufSize, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnMinmaxARB(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jint bufSize, jlong valuesAddress, jlong __functionAddress) {
	void *values = (void *)(intptr_t)valuesAddress;
	glGetnMinmaxARBPROC glGetnMinmaxARB = (glGetnMinmaxARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnMinmaxARB(target, reset, format, type, bufSize, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnCompressedTexImageARB(JNIEnv *__env, jclass clazz, jint target, jint level, jint bufSize, jlong imgAddress, jlong __functionAddress) {
	void *img = (void *)(intptr_t)imgAddress;
	glGetnCompressedTexImageARBPROC glGetnCompressedTexImageARB = (glGetnCompressedTexImageARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnCompressedTexImageARB(target, level, bufSize, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnUniformfvARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetnUniformfvARBPROC glGetnUniformfvARB = (glGetnUniformfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformfvARB(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnUniformivARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetnUniformivARBPROC glGetnUniformivARB = (glGetnUniformivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformivARB(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnUniformuivARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetnUniformuivARBPROC glGetnUniformuivARB = (glGetnUniformuivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformuivARB(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnUniformdvARB(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetnUniformdvARBPROC glGetnUniformdvARB = (glGetnUniformdvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformdvARB(program, location, bufSize, params);
}

EXTERN_C_EXIT
