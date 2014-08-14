/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef const GLubyte * (APIENTRY *glGetStringiPROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glClearBufferivPROC) (GLenum, GLint, GLint *);
typedef GLvoid (APIENTRY *glClearBufferuivPROC) (GLenum, GLint, GLint *);
typedef GLvoid (APIENTRY *glClearBufferfvPROC) (GLenum, GLint, GLfloat *);
typedef GLvoid (APIENTRY *glClearBufferfiPROC) (GLenum, GLint, GLfloat, GLint);
typedef GLvoid (APIENTRY *glVertexAttribI1iPROC) (GLuint, GLint);
typedef GLvoid (APIENTRY *glVertexAttribI2iPROC) (GLuint, GLint, GLint);
typedef GLvoid (APIENTRY *glVertexAttribI3iPROC) (GLuint, GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glVertexAttribI4iPROC) (GLuint, GLint, GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glVertexAttribI1uiPROC) (GLuint, GLuint);
typedef GLvoid (APIENTRY *glVertexAttribI2uiPROC) (GLuint, GLuint, GLuint);
typedef GLvoid (APIENTRY *glVertexAttribI3uiPROC) (GLuint, GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glVertexAttribI4uiPROC) (GLuint, GLint, GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glVertexAttribI1ivPROC) (GLuint, const GLint *);
typedef GLvoid (APIENTRY *glVertexAttribI2ivPROC) (GLuint, const GLint *);
typedef GLvoid (APIENTRY *glVertexAttribI3ivPROC) (GLuint, const GLint *);
typedef GLvoid (APIENTRY *glVertexAttribI4ivPROC) (GLuint, const GLint *);
typedef GLvoid (APIENTRY *glVertexAttribI1uivPROC) (GLuint, const GLuint *);
typedef GLvoid (APIENTRY *glVertexAttribI2uivPROC) (GLuint, const GLuint *);
typedef GLvoid (APIENTRY *glVertexAttribI3uivPROC) (GLuint, const GLuint *);
typedef GLvoid (APIENTRY *glVertexAttribI4uivPROC) (GLuint, const GLuint *);
typedef GLvoid (APIENTRY *glVertexAttribI4bvPROC) (GLuint, const GLbyte *);
typedef GLvoid (APIENTRY *glVertexAttribI4svPROC) (GLuint, const GLshort *);
typedef GLvoid (APIENTRY *glVertexAttribI4ubvPROC) (GLuint, const GLbyte *);
typedef GLvoid (APIENTRY *glVertexAttribI4usvPROC) (GLuint, const GLshort *);
typedef GLvoid (APIENTRY *glVertexAttribIPointerPROC) (GLuint, GLint, GLenum, GLsizei, const GLvoid *);
typedef GLvoid (APIENTRY *glGetVertexAttribIivPROC) (GLuint, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetVertexAttribIuivPROC) (GLuint, GLenum, GLuint *);
typedef GLvoid (APIENTRY *glUniform1uiPROC) (GLint, GLuint);
typedef GLvoid (APIENTRY *glUniform2uiPROC) (GLint, GLuint, GLuint);
typedef GLvoid (APIENTRY *glUniform3uiPROC) (GLint, GLuint, GLuint, GLuint);
typedef GLvoid (APIENTRY *glUniform4uiPROC) (GLint, GLuint, GLuint, GLuint, GLuint);
typedef GLvoid (APIENTRY *glUniform1uivPROC) (GLint, GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glUniform2uivPROC) (GLint, GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glUniform3uivPROC) (GLint, GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glUniform4uivPROC) (GLint, GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glGetUniformuivPROC) (GLuint, GLint, GLuint *);
typedef GLvoid (APIENTRY *glBindFragDataLocationPROC) (GLuint, GLuint, const GLchar *);
typedef GLint (APIENTRY *glGetFragDataLocationPROC) (GLuint, const GLchar *);
typedef GLvoid (APIENTRY *glBeginConditionalRenderPROC) (GLuint, GLenum);
typedef GLvoid (APIENTRY *glEndConditionalRenderPROC) (void);
typedef GLvoid * (APIENTRY *glMapBufferRangePROC) (GLenum, GLintptr, GLsizeiptr, GLbitfield);
typedef GLvoid (APIENTRY *glFlushMappedBufferRangePROC) (GLenum, GLintptr, GLsizeiptr);
typedef GLvoid (APIENTRY *glClampColorPROC) (GLenum, GLenum);
typedef GLboolean (APIENTRY *glIsRenderbufferPROC) (GLuint);
typedef GLvoid (APIENTRY *glBindRenderbufferPROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glDeleteRenderbuffersPROC) (GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glGenRenderbuffersPROC) (GLsizei, GLuint *);
typedef GLvoid (APIENTRY *glRenderbufferStoragePROC) (GLenum, GLenum, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glRenderbufferStorageMultisamplePROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glGetRenderbufferParameterivPROC) (GLenum, GLenum, GLint *);
typedef GLboolean (APIENTRY *glIsFramebufferPROC) (GLuint);
typedef GLvoid (APIENTRY *glBindFramebufferPROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glDeleteFramebuffersPROC) (GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glGenFramebuffersPROC) (GLsizei, GLuint *);
typedef GLenum (APIENTRY *glCheckFramebufferStatusPROC) (GLenum);
typedef GLvoid (APIENTRY *glFramebufferTexture1DPROC) (GLenum, GLenum, GLenum, GLuint, GLint);
typedef GLvoid (APIENTRY *glFramebufferTexture2DPROC) (GLenum, GLenum, GLenum, GLuint, GLint);
typedef GLvoid (APIENTRY *glFramebufferTexture3DPROC) (GLenum, GLenum, GLenum, GLuint, GLint, GLint);
typedef GLvoid (APIENTRY *glFramebufferTextureLayerPROC) (GLenum, GLenum, GLuint, GLint, GLint);
typedef GLvoid (APIENTRY *glFramebufferRenderbufferPROC) (GLenum, GLenum, GLenum, GLuint);
typedef GLvoid (APIENTRY *glGetFramebufferAttachmentParameterivPROC) (GLenum, GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glBlitFramebufferPROC) (GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum);
typedef GLvoid (APIENTRY *glGenerateMipmapPROC) (GLenum);
typedef GLvoid (APIENTRY *glTexParameterIivPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glTexParameterIuivPROC) (GLenum, GLenum, GLuint *);
typedef GLvoid (APIENTRY *glGetTexParameterIivPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetTexParameterIuivPROC) (GLenum, GLenum, GLuint *);
typedef GLvoid (APIENTRY *glColorMaskiPROC) (GLuint, GLboolean, GLboolean, GLboolean, GLboolean);
typedef GLvoid (APIENTRY *glGetBooleani_vPROC) (GLenum, GLuint, GLboolean *);
typedef GLvoid (APIENTRY *glGetIntegeri_vPROC) (GLenum, GLuint, GLint *);
typedef GLvoid (APIENTRY *glEnableiPROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glDisableiPROC) (GLenum, GLuint);
typedef GLboolean (APIENTRY *glIsEnablediPROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glBindBufferRangePROC) (GLenum, GLuint, GLuint, GLintptr, GLsizeiptr);
typedef GLvoid (APIENTRY *glBindBufferBasePROC) (GLenum, GLuint, GLuint);
typedef GLvoid (APIENTRY *glBeginTransformFeedbackPROC) (GLenum);
typedef GLvoid (APIENTRY *glEndTransformFeedbackPROC) (void);
typedef GLvoid (APIENTRY *glTransformFeedbackVaryingsPROC) (GLuint, GLsizei, const GLchar **, GLenum);
typedef GLvoid (APIENTRY *glGetTransformFeedbackVaryingPROC) (GLuint, GLuint, GLsizei, GLsizei *, GLsizei *, GLenum *, GLchar *);
typedef GLvoid (APIENTRY *glBindVertexArrayPROC) (GLuint);
typedef GLvoid (APIENTRY *glDeleteVertexArraysPROC) (GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glGenVertexArraysPROC) (GLsizei, GLuint *);
typedef GLboolean (APIENTRY *glIsVertexArrayPROC) (GLuint);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL30_nglGetStringi(JNIEnv *__env, jclass clazz, jint name, jint index, jlong __functionAddress) {
	glGetStringiPROC glGetStringi = (glGetStringiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glGetStringi(name, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglClearBufferiv(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress, jlong __functionAddress) {
	GLint *value = (GLint *)(intptr_t)valueAddress;
	glClearBufferivPROC glClearBufferiv = (glClearBufferivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearBufferiv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglClearBufferuiv(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress, jlong __functionAddress) {
	GLint *value = (GLint *)(intptr_t)valueAddress;
	glClearBufferuivPROC glClearBufferuiv = (glClearBufferuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearBufferuiv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglClearBufferfv(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress, jlong __functionAddress) {
	GLfloat *value = (GLfloat *)(intptr_t)valueAddress;
	glClearBufferfvPROC glClearBufferfv = (glClearBufferfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearBufferfv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglClearBufferfi(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jfloat depth, jint stencil, jlong __functionAddress) {
	glClearBufferfiPROC glClearBufferfi = (glClearBufferfiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearBufferfi(buffer, drawbuffer, depth, stencil);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI1i(JNIEnv *__env, jclass clazz, jint index, jint x, jlong __functionAddress) {
	glVertexAttribI1iPROC glVertexAttribI1i = (glVertexAttribI1iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI1i(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI2i(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jlong __functionAddress) {
	glVertexAttribI2iPROC glVertexAttribI2i = (glVertexAttribI2iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI2i(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI3i(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jlong __functionAddress) {
	glVertexAttribI3iPROC glVertexAttribI3i = (glVertexAttribI3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI3i(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI4i(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glVertexAttribI4iPROC glVertexAttribI4i = (glVertexAttribI4iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4i(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI1ui(JNIEnv *__env, jclass clazz, jint index, jint x, jlong __functionAddress) {
	glVertexAttribI1uiPROC glVertexAttribI1ui = (glVertexAttribI1uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI1ui(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI2ui(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jlong __functionAddress) {
	glVertexAttribI2uiPROC glVertexAttribI2ui = (glVertexAttribI2uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI2ui(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI3ui(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jlong __functionAddress) {
	glVertexAttribI3uiPROC glVertexAttribI3ui = (glVertexAttribI3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI3ui(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI4ui(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glVertexAttribI4uiPROC glVertexAttribI4ui = (glVertexAttribI4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4ui(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI1iv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttribI1ivPROC glVertexAttribI1iv = (glVertexAttribI1ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI1iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI2iv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttribI2ivPROC glVertexAttribI2iv = (glVertexAttribI2ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI2iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI3iv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttribI3ivPROC glVertexAttribI3iv = (glVertexAttribI3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI3iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI4iv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttribI4ivPROC glVertexAttribI4iv = (glVertexAttribI4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI1uiv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttribI1uivPROC glVertexAttribI1uiv = (glVertexAttribI1uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI1uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI2uiv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttribI2uivPROC glVertexAttribI2uiv = (glVertexAttribI2uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI2uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI3uiv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttribI3uivPROC glVertexAttribI3uiv = (glVertexAttribI3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI3uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI4uiv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttribI4uivPROC glVertexAttribI4uiv = (glVertexAttribI4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI4bv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glVertexAttribI4bvPROC glVertexAttribI4bv = (glVertexAttribI4bvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4bv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI4sv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttribI4svPROC glVertexAttribI4sv = (glVertexAttribI4svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4sv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI4ubv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glVertexAttribI4ubvPROC glVertexAttribI4ubv = (glVertexAttribI4ubvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4ubv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribI4usv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttribI4usvPROC glVertexAttribI4usv = (glVertexAttribI4usvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4usv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglVertexAttribIPointer(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const GLvoid *pointer = (const GLvoid *)(intptr_t)pointerAddress;
	glVertexAttribIPointerPROC glVertexAttribIPointer = (glVertexAttribIPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribIPointer(index, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGetVertexAttribIiv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetVertexAttribIivPROC glGetVertexAttribIiv = (glGetVertexAttribIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribIiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGetVertexAttribIuiv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetVertexAttribIuivPROC glGetVertexAttribIuiv = (glGetVertexAttribIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribIuiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglUniform1ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jlong __functionAddress) {
	glUniform1uiPROC glUniform1ui = (glUniform1uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1ui(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglUniform2ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jlong __functionAddress) {
	glUniform2uiPROC glUniform2ui = (glUniform2uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2ui(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglUniform3ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glUniform3uiPROC glUniform3ui = (glUniform3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3ui(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglUniform4ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glUniform4uiPROC glUniform4ui = (glUniform4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4ui(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglUniform1uiv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform1uivPROC glUniform1uiv = (glUniform1uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglUniform2uiv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform2uivPROC glUniform2uiv = (glUniform2uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglUniform3uiv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform3uivPROC glUniform3uiv = (glUniform3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglUniform4uiv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform4uivPROC glUniform4uiv = (glUniform4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGetUniformuiv(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetUniformuivPROC glGetUniformuiv = (glGetUniformuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformuiv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglBindFragDataLocation(JNIEnv *__env, jclass clazz, jint program, jint colorNumber, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glBindFragDataLocationPROC glBindFragDataLocation = (glBindFragDataLocationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindFragDataLocation(program, colorNumber, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL30_nglGetFragDataLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetFragDataLocationPROC glGetFragDataLocation = (glGetFragDataLocationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetFragDataLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglBeginConditionalRender(JNIEnv *__env, jclass clazz, jint id, jint mode, jlong __functionAddress) {
	glBeginConditionalRenderPROC glBeginConditionalRender = (glBeginConditionalRenderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginConditionalRender(id, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglEndConditionalRender(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glEndConditionalRenderPROC glEndConditionalRender = (glEndConditionalRenderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndConditionalRender();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL30_nglMapBufferRange(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length, jint access, jlong __functionAddress) {
	glMapBufferRangePROC glMapBufferRange = (glMapBufferRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glMapBufferRange(target, (GLintptr)offset, (GLsizeiptr)length, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglFlushMappedBufferRange(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length, jlong __functionAddress) {
	glFlushMappedBufferRangePROC glFlushMappedBufferRange = (glFlushMappedBufferRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFlushMappedBufferRange(target, (GLintptr)offset, (GLsizeiptr)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglClampColor(JNIEnv *__env, jclass clazz, jint target, jint clamp, jlong __functionAddress) {
	glClampColorPROC glClampColor = (glClampColorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClampColor(target, clamp);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL30_nglIsRenderbuffer(JNIEnv *__env, jclass clazz, jint renderbuffer, jlong __functionAddress) {
	glIsRenderbufferPROC glIsRenderbuffer = (glIsRenderbufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsRenderbuffer(renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglBindRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer, jlong __functionAddress) {
	glBindRenderbufferPROC glBindRenderbuffer = (glBindRenderbufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindRenderbuffer(target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglDeleteRenderbuffers(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress, jlong __functionAddress) {
	const GLuint *renderbuffers = (const GLuint *)(intptr_t)renderbuffersAddress;
	glDeleteRenderbuffersPROC glDeleteRenderbuffers = (glDeleteRenderbuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGenRenderbuffers(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress, jlong __functionAddress) {
	GLuint *renderbuffers = (GLuint *)(intptr_t)renderbuffersAddress;
	glGenRenderbuffersPROC glGenRenderbuffers = (glGenRenderbuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglRenderbufferStorage(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glRenderbufferStoragePROC glRenderbufferStorage = (glRenderbufferStoragePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRenderbufferStorage(target, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglRenderbufferStorageMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glRenderbufferStorageMultisamplePROC glRenderbufferStorageMultisample = (glRenderbufferStorageMultisamplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGetRenderbufferParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetRenderbufferParameterivPROC glGetRenderbufferParameteriv = (glGetRenderbufferParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetRenderbufferParameteriv(target, pname, params);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL30_nglIsFramebuffer(JNIEnv *__env, jclass clazz, jint framebuffer, jlong __functionAddress) {
	glIsFramebufferPROC glIsFramebuffer = (glIsFramebufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsFramebuffer(framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglBindFramebuffer(JNIEnv *__env, jclass clazz, jint target, jint framebuffer, jlong __functionAddress) {
	glBindFramebufferPROC glBindFramebuffer = (glBindFramebufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindFramebuffer(target, framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglDeleteFramebuffers(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress, jlong __functionAddress) {
	const GLuint *framebuffers = (const GLuint *)(intptr_t)framebuffersAddress;
	glDeleteFramebuffersPROC glDeleteFramebuffers = (glDeleteFramebuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGenFramebuffers(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress, jlong __functionAddress) {
	GLuint *framebuffers = (GLuint *)(intptr_t)framebuffersAddress;
	glGenFramebuffersPROC glGenFramebuffers = (glGenFramebuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenFramebuffers(n, framebuffers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL30_nglCheckFramebufferStatus(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glCheckFramebufferStatusPROC glCheckFramebufferStatus = (glCheckFramebufferStatusPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCheckFramebufferStatus(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglFramebufferTexture1D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jlong __functionAddress) {
	glFramebufferTexture1DPROC glFramebufferTexture1D = (glFramebufferTexture1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture1D(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglFramebufferTexture2D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jlong __functionAddress) {
	glFramebufferTexture2DPROC glFramebufferTexture2D = (glFramebufferTexture2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture2D(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglFramebufferTexture3D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint layer, jlong __functionAddress) {
	glFramebufferTexture3DPROC glFramebufferTexture3D = (glFramebufferTexture3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglFramebufferTextureLayer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer, jlong __functionAddress) {
	glFramebufferTextureLayerPROC glFramebufferTextureLayer = (glFramebufferTextureLayerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureLayer(target, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglFramebufferRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer, jlong __functionAddress) {
	glFramebufferRenderbufferPROC glFramebufferRenderbuffer = (glFramebufferRenderbufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGetFramebufferAttachmentParameteriv(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetFramebufferAttachmentParameterivPROC glGetFramebufferAttachmentParameteriv = (glGetFramebufferAttachmentParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglBlitFramebuffer(JNIEnv *__env, jclass clazz, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter, jlong __functionAddress) {
	glBlitFramebufferPROC glBlitFramebuffer = (glBlitFramebufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGenerateMipmap(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glGenerateMipmapPROC glGenerateMipmap = (glGenerateMipmapPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenerateMipmap(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglTexParameterIiv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glTexParameterIivPROC glTexParameterIiv = (glTexParameterIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglTexParameterIuiv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glTexParameterIuivPROC glTexParameterIuiv = (glTexParameterIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGetTexParameterIiv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTexParameterIivPROC glGetTexParameterIiv = (glGetTexParameterIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGetTexParameterIuiv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetTexParameterIuivPROC glGetTexParameterIuiv = (glGetTexParameterIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglColorMaski(JNIEnv *__env, jclass clazz, jint buf, jboolean r, jboolean g, jboolean b, jboolean a, jlong __functionAddress) {
	glColorMaskiPROC glColorMaski = (glColorMaskiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorMaski(buf, r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGetBooleani_1v(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress, jlong __functionAddress) {
	GLboolean *data = (GLboolean *)(intptr_t)dataAddress;
	glGetBooleani_vPROC glGetBooleani_v = (glGetBooleani_vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBooleani_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGetIntegeri_1v(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetIntegeri_vPROC glGetIntegeri_v = (glGetIntegeri_vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetIntegeri_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglEnablei(JNIEnv *__env, jclass clazz, jint cap, jint index, jlong __functionAddress) {
	glEnableiPROC glEnablei = (glEnableiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnablei(cap, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglDisablei(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glDisableiPROC glDisablei = (glDisableiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisablei(target, index);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL30_nglIsEnabledi(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glIsEnablediPROC glIsEnabledi = (glIsEnablediPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsEnabledi(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglBindBufferRange(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong size, jlong __functionAddress) {
	glBindBufferRangePROC glBindBufferRange = (glBindBufferRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBufferRange(target, index, buffer, (GLintptr)offset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglBindBufferBase(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong __functionAddress) {
	glBindBufferBasePROC glBindBufferBase = (glBindBufferBasePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBufferBase(target, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglBeginTransformFeedback(JNIEnv *__env, jclass clazz, jint primitiveMode, jlong __functionAddress) {
	glBeginTransformFeedbackPROC glBeginTransformFeedback = (glBeginTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginTransformFeedback(primitiveMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglEndTransformFeedback(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glEndTransformFeedbackPROC glEndTransformFeedback = (glEndTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglTransformFeedbackVaryings(JNIEnv *__env, jclass clazz, jint program, jint count, jlong varyingsAddress, jint bufferMode, jlong __functionAddress) {
	const GLchar **varyings = (const GLchar **)(intptr_t)varyingsAddress;
	glTransformFeedbackVaryingsPROC glTransformFeedbackVaryings = (glTransformFeedbackVaryingsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTransformFeedbackVaryings(program, count, varyings, bufferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGetTransformFeedbackVarying(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLsizei *size = (GLsizei *)(intptr_t)sizeAddress;
	GLenum *type = (GLenum *)(intptr_t)typeAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetTransformFeedbackVaryingPROC glGetTransformFeedbackVarying = (glGetTransformFeedbackVaryingPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglBindVertexArray(JNIEnv *__env, jclass clazz, jint array, jlong __functionAddress) {
	glBindVertexArrayPROC glBindVertexArray = (glBindVertexArrayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindVertexArray(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglDeleteVertexArrays(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress, jlong __functionAddress) {
	const GLuint *arrays = (const GLuint *)(intptr_t)arraysAddress;
	glDeleteVertexArraysPROC glDeleteVertexArrays = (glDeleteVertexArraysPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteVertexArrays(n, arrays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30_nglGenVertexArrays(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress, jlong __functionAddress) {
	GLuint *arrays = (GLuint *)(intptr_t)arraysAddress;
	glGenVertexArraysPROC glGenVertexArrays = (glGenVertexArraysPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenVertexArrays(n, arrays);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL30_nglIsVertexArray(JNIEnv *__env, jclass clazz, jint array, jlong __functionAddress) {
	glIsVertexArrayPROC glIsVertexArray = (glIsVertexArrayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsVertexArray(array);
}

EXTERN_C_EXIT
