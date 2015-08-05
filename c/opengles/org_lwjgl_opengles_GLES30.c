/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glReadBufferPROC) (GLenum);
typedef void (APIENTRY *glDrawRangeElementsPROC) (GLenum, GLuint, GLuint, GLsizei, GLenum, const void *);
typedef void (APIENTRY *glTexImage3DPROC) (GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, const void *);
typedef void (APIENTRY *glTexSubImage3DPROC) (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glCopyTexSubImage3DPROC) (GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glCompressedTexImage3DPROC) (GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTexSubImage3DPROC) (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glGenQueriesPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glDeleteQueriesPROC) (GLsizei, const GLuint *);
typedef GLboolean (APIENTRY *glIsQueryPROC) (GLuint);
typedef void (APIENTRY *glBeginQueryPROC) (GLenum, GLuint);
typedef void (APIENTRY *glEndQueryPROC) (GLenum);
typedef void (APIENTRY *glGetQueryivPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetQueryObjectuivPROC) (GLuint, GLenum, GLuint *);
typedef GLboolean (APIENTRY *glUnmapBufferPROC) (GLenum);
typedef void (APIENTRY *glGetBufferPointervPROC) (GLenum, GLenum, void **);
typedef void (APIENTRY *glDrawBuffersPROC) (GLsizei, const GLenum *);
typedef void (APIENTRY *glUniformMatrix2x3fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix3x2fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix2x4fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix4x2fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix3x4fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix4x3fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glBlitFramebufferPROC) (GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum);
typedef void (APIENTRY *glRenderbufferStorageMultisamplePROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glFramebufferTextureLayerPROC) (GLenum, GLenum, GLuint, GLint, GLint);
typedef void * (APIENTRY *glMapBufferRangePROC) (GLenum, GLintptr, GLsizeiptr, GLbitfield);
typedef void (APIENTRY *glFlushMappedBufferRangePROC) (GLenum, GLintptr, GLsizeiptr);
typedef void (APIENTRY *glBindVertexArrayPROC) (GLuint);
typedef void (APIENTRY *glDeleteVertexArraysPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glGenVertexArraysPROC) (GLsizei, GLuint *);
typedef GLboolean (APIENTRY *glIsVertexArrayPROC) (GLuint);
typedef void (APIENTRY *glGetIntegeri_vPROC) (GLenum, GLuint, GLint *);
typedef void (APIENTRY *glBeginTransformFeedbackPROC) (GLenum);
typedef void (APIENTRY *glEndTransformFeedbackPROC) (void);
typedef void (APIENTRY *glBindBufferRangePROC) (GLenum, GLuint, GLuint, GLintptr, GLsizeiptr);
typedef void (APIENTRY *glBindBufferBasePROC) (GLenum, GLuint, GLuint);
typedef void (APIENTRY *glTransformFeedbackVaryingsPROC) (GLuint, GLsizei, const GLchar * const *, GLenum);
typedef void (APIENTRY *glGetTransformFeedbackVaryingPROC) (GLuint, GLuint, GLsizei, GLsizei *, GLsizei *, GLenum *, GLchar *);
typedef void (APIENTRY *glVertexAttribIPointerPROC) (GLuint, GLint, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glGetVertexAttribIivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetVertexAttribIuivPROC) (GLuint, GLenum, GLuint *);
typedef void (APIENTRY *glVertexAttribI4iPROC) (GLuint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glVertexAttribI4uiPROC) (GLuint, GLuint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glVertexAttribI4ivPROC) (GLuint, const GLint *);
typedef void (APIENTRY *glVertexAttribI4uivPROC) (GLuint, const GLuint *);
typedef void (APIENTRY *glGetUniformuivPROC) (GLuint, GLint, GLuint *);
typedef GLint (APIENTRY *glGetFragDataLocationPROC) (GLuint, const GLchar *);
typedef void (APIENTRY *glUniform1uiPROC) (GLint, GLuint);
typedef void (APIENTRY *glUniform2uiPROC) (GLint, GLuint, GLuint);
typedef void (APIENTRY *glUniform3uiPROC) (GLint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glUniform4uiPROC) (GLint, GLuint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glUniform1uivPROC) (GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glUniform2uivPROC) (GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glUniform3uivPROC) (GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glUniform4uivPROC) (GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glClearBufferivPROC) (GLenum, GLint, const GLint *);
typedef void (APIENTRY *glClearBufferuivPROC) (GLenum, GLint, const GLuint *);
typedef void (APIENTRY *glClearBufferfvPROC) (GLenum, GLint, const GLfloat *);
typedef void (APIENTRY *glClearBufferfiPROC) (GLenum, GLint, GLfloat, GLint);
typedef GLubyte * (APIENTRY *glGetStringiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glCopyBufferSubDataPROC) (GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr);
typedef void (APIENTRY *glGetUniformIndicesPROC) (GLuint, GLsizei, const GLchar * const *, GLuint *);
typedef void (APIENTRY *glGetActiveUniformsivPROC) (GLuint, GLsizei, const GLuint *, GLenum, GLint *);
typedef GLuint (APIENTRY *glGetUniformBlockIndexPROC) (GLuint, const GLchar *);
typedef void (APIENTRY *glGetActiveUniformBlockivPROC) (GLuint, GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetActiveUniformBlockNamePROC) (GLuint, GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glUniformBlockBindingPROC) (GLuint, GLuint, GLuint);
typedef void (APIENTRY *glDrawArraysInstancedPROC) (GLenum, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glDrawElementsInstancedPROC) (GLenum, GLsizei, GLenum, const void *, GLsizei);
typedef GLsync (APIENTRY *glFenceSyncPROC) (GLenum, GLbitfield);
typedef GLboolean (APIENTRY *glIsSyncPROC) (GLsync);
typedef void (APIENTRY *glDeleteSyncPROC) (GLsync);
typedef GLenum (APIENTRY *glClientWaitSyncPROC) (GLsync, GLbitfield, GLuint64);
typedef void (APIENTRY *glWaitSyncPROC) (GLsync, GLbitfield, GLuint64);
typedef void (APIENTRY *glGetInteger64vPROC) (GLenum, GLint64 *);
typedef void (APIENTRY *glGetSyncivPROC) (GLsync, GLenum, GLsizei, GLsizei *, GLint *);
typedef void (APIENTRY *glGetInteger64i_vPROC) (GLenum, GLuint, GLint64 *);
typedef void (APIENTRY *glGetBufferParameteri64vPROC) (GLenum, GLenum, GLint64 *);
typedef void (APIENTRY *glGenSamplersPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glDeleteSamplersPROC) (GLsizei, const GLuint *);
typedef GLboolean (APIENTRY *glIsSamplerPROC) (GLuint);
typedef void (APIENTRY *glBindSamplerPROC) (GLuint, GLuint);
typedef void (APIENTRY *glSamplerParameteriPROC) (GLuint, GLenum, GLint);
typedef void (APIENTRY *glSamplerParameterivPROC) (GLuint, GLenum, const GLint *);
typedef void (APIENTRY *glSamplerParameterfPROC) (GLuint, GLenum, GLfloat);
typedef void (APIENTRY *glSamplerParameterfvPROC) (GLuint, GLenum, const GLfloat *);
typedef void (APIENTRY *glGetSamplerParameterivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetSamplerParameterfvPROC) (GLuint, GLenum, GLfloat *);
typedef void (APIENTRY *glVertexAttribDivisorPROC) (GLuint, GLuint);
typedef void (APIENTRY *glBindTransformFeedbackPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDeleteTransformFeedbacksPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glGenTransformFeedbacksPROC) (GLsizei, GLuint *);
typedef GLboolean (APIENTRY *glIsTransformFeedbackPROC) (GLuint);
typedef void (APIENTRY *glPauseTransformFeedbackPROC) (void);
typedef void (APIENTRY *glResumeTransformFeedbackPROC) (void);
typedef void (APIENTRY *glGetProgramBinaryPROC) (GLuint, GLsizei, GLsizei *, GLenum *, void *);
typedef void (APIENTRY *glProgramBinaryPROC) (GLuint, GLenum, const void *, GLsizei);
typedef void (APIENTRY *glProgramParameteriPROC) (GLuint, GLenum, GLint);
typedef void (APIENTRY *glInvalidateFramebufferPROC) (GLenum, GLsizei, const GLenum *);
typedef void (APIENTRY *glInvalidateSubFramebufferPROC) (GLenum, GLsizei, const GLenum *, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glTexStorage2DPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glTexStorage3DPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei);
typedef void (APIENTRY *glGetInternalformativPROC) (GLenum, GLenum, GLenum, GLsizei, GLint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglReadBuffer(JNIEnv *__env, jclass clazz, jint src, jlong __functionAddress) {
	glReadBufferPROC glReadBuffer = (glReadBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReadBuffer(src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDrawRangeElements(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawRangeElementsPROC glDrawRangeElements = (glDrawRangeElementsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawRangeElements(mode, start, end, count, type, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglTexImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTexImage3DPROC glTexImage3D = (glTexImage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglTexSubImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTexSubImage3DPROC glTexSubImage3D = (glTexSubImage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglCopyTexSubImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyTexSubImage3DPROC glCopyTexSubImage3D = (glCopyTexSubImage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglCompressedTexImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexImage3DPROC glCompressedTexImage3D = (glCompressedTexImage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglCompressedTexSubImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexSubImage3DPROC glCompressedTexSubImage3D = (glCompressedTexSubImage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGenQueries(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	glGenQueriesPROC glGenQueries = (glGenQueriesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenQueries(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDeleteQueries(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDeleteQueriesPROC glDeleteQueries = (glDeleteQueriesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteQueries(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_nglIsQuery(JNIEnv *__env, jclass clazz, jint id, jlong __functionAddress) {
	glIsQueryPROC glIsQuery = (glIsQueryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsQuery(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglBeginQuery(JNIEnv *__env, jclass clazz, jint target, jint id, jlong __functionAddress) {
	glBeginQueryPROC glBeginQuery = (glBeginQueryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginQuery(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglEndQuery(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glEndQueryPROC glEndQuery = (glEndQueryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndQuery(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetQueryiv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetQueryivPROC glGetQueryiv = (glGetQueryivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetQueryObjectuiv(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetQueryObjectuivPROC glGetQueryObjectuiv = (glGetQueryObjectuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjectuiv(id, pname, params);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_nglUnmapBuffer(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glUnmapBufferPROC glUnmapBuffer = (glUnmapBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glUnmapBuffer(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetBufferPointerv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	void **params = (void **)(intptr_t)paramsAddress;
	glGetBufferPointervPROC glGetBufferPointerv = (glGetBufferPointervPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBufferPointerv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDrawBuffers(JNIEnv *__env, jclass clazz, jint n, jlong bufsAddress, jlong __functionAddress) {
	const GLenum *bufs = (const GLenum *)(intptr_t)bufsAddress;
	glDrawBuffersPROC glDrawBuffers = (glDrawBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawBuffers(n, bufs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix2x3fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix2x3fvPROC glUniformMatrix2x3fv = (glUniformMatrix2x3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2x3fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix3x2fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix3x2fvPROC glUniformMatrix3x2fv = (glUniformMatrix3x2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3x2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix2x4fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix2x4fvPROC glUniformMatrix2x4fv = (glUniformMatrix2x4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2x4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix4x2fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix4x2fvPROC glUniformMatrix4x2fv = (glUniformMatrix4x2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4x2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix3x4fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix3x4fvPROC glUniformMatrix3x4fv = (glUniformMatrix3x4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3x4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix4x3fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix4x3fvPROC glUniformMatrix4x3fv = (glUniformMatrix4x3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4x3fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglBlitFramebuffer(JNIEnv *__env, jclass clazz, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter, jlong __functionAddress) {
	glBlitFramebufferPROC glBlitFramebuffer = (glBlitFramebufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglRenderbufferStorageMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glRenderbufferStorageMultisamplePROC glRenderbufferStorageMultisample = (glRenderbufferStorageMultisamplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglFramebufferTextureLayer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer, jlong __functionAddress) {
	glFramebufferTextureLayerPROC glFramebufferTextureLayer = (glFramebufferTextureLayerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTextureLayer(target, attachment, texture, level, layer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_GLES30_nglMapBufferRange(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length, jint access, jlong __functionAddress) {
	glMapBufferRangePROC glMapBufferRange = (glMapBufferRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glMapBufferRange(target, (GLintptr)offset, (GLsizeiptr)length, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglFlushMappedBufferRange(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length, jlong __functionAddress) {
	glFlushMappedBufferRangePROC glFlushMappedBufferRange = (glFlushMappedBufferRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFlushMappedBufferRange(target, (GLintptr)offset, (GLsizeiptr)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglBindVertexArray(JNIEnv *__env, jclass clazz, jint array, jlong __functionAddress) {
	glBindVertexArrayPROC glBindVertexArray = (glBindVertexArrayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindVertexArray(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDeleteVertexArrays(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress, jlong __functionAddress) {
	const GLuint *arrays = (const GLuint *)(intptr_t)arraysAddress;
	glDeleteVertexArraysPROC glDeleteVertexArrays = (glDeleteVertexArraysPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteVertexArrays(n, arrays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGenVertexArrays(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress, jlong __functionAddress) {
	GLuint *arrays = (GLuint *)(intptr_t)arraysAddress;
	glGenVertexArraysPROC glGenVertexArrays = (glGenVertexArraysPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenVertexArrays(n, arrays);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_nglIsVertexArray(JNIEnv *__env, jclass clazz, jint array, jlong __functionAddress) {
	glIsVertexArrayPROC glIsVertexArray = (glIsVertexArrayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsVertexArray(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetIntegeri_1v(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetIntegeri_vPROC glGetIntegeri_v = (glGetIntegeri_vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetIntegeri_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglBeginTransformFeedback(JNIEnv *__env, jclass clazz, jint primitiveMode, jlong __functionAddress) {
	glBeginTransformFeedbackPROC glBeginTransformFeedback = (glBeginTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginTransformFeedback(primitiveMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglEndTransformFeedback(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glEndTransformFeedbackPROC glEndTransformFeedback = (glEndTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglBindBufferRange(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong size, jlong __functionAddress) {
	glBindBufferRangePROC glBindBufferRange = (glBindBufferRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBufferRange(target, index, buffer, (GLintptr)offset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglBindBufferBase(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong __functionAddress) {
	glBindBufferBasePROC glBindBufferBase = (glBindBufferBasePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBufferBase(target, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglTransformFeedbackVaryings(JNIEnv *__env, jclass clazz, jint program, jint count, jlong varyingsAddress, jint bufferMode, jlong __functionAddress) {
	const GLchar * const *varyings = (const GLchar * const *)(intptr_t)varyingsAddress;
	glTransformFeedbackVaryingsPROC glTransformFeedbackVaryings = (glTransformFeedbackVaryingsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTransformFeedbackVaryings(program, count, varyings, bufferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetTransformFeedbackVarying(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLsizei *size = (GLsizei *)(intptr_t)sizeAddress;
	GLenum *type = (GLenum *)(intptr_t)typeAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetTransformFeedbackVaryingPROC glGetTransformFeedbackVarying = (glGetTransformFeedbackVaryingPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglVertexAttribIPointer(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const void *pointer = (const void *)(intptr_t)pointerAddress;
	glVertexAttribIPointerPROC glVertexAttribIPointer = (glVertexAttribIPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribIPointer(index, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetVertexAttribIiv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetVertexAttribIivPROC glGetVertexAttribIiv = (glGetVertexAttribIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribIiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetVertexAttribIuiv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetVertexAttribIuivPROC glGetVertexAttribIuiv = (glGetVertexAttribIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribIuiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglVertexAttribI4i(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glVertexAttribI4iPROC glVertexAttribI4i = (glVertexAttribI4iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4i(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglVertexAttribI4ui(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glVertexAttribI4uiPROC glVertexAttribI4ui = (glVertexAttribI4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4ui(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglVertexAttribI4iv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttribI4ivPROC glVertexAttribI4iv = (glVertexAttribI4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglVertexAttribI4uiv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttribI4uivPROC glVertexAttribI4uiv = (glVertexAttribI4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribI4uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetUniformuiv(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetUniformuivPROC glGetUniformuiv = (glGetUniformuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformuiv(program, location, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES30_nglGetFragDataLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetFragDataLocationPROC glGetFragDataLocation = (glGetFragDataLocationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetFragDataLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform1ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jlong __functionAddress) {
	glUniform1uiPROC glUniform1ui = (glUniform1uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1ui(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform2ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jlong __functionAddress) {
	glUniform2uiPROC glUniform2ui = (glUniform2uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2ui(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform3ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glUniform3uiPROC glUniform3ui = (glUniform3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3ui(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform4ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glUniform4uiPROC glUniform4ui = (glUniform4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4ui(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform1uiv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform1uivPROC glUniform1uiv = (glUniform1uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform2uiv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform2uivPROC glUniform2uiv = (glUniform2uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform3uiv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform3uivPROC glUniform3uiv = (glUniform3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform4uiv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glUniform4uivPROC glUniform4uiv = (glUniform4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglClearBufferiv(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glClearBufferivPROC glClearBufferiv = (glClearBufferivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearBufferiv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglClearBufferuiv(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glClearBufferuivPROC glClearBufferuiv = (glClearBufferuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearBufferuiv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglClearBufferfv(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glClearBufferfvPROC glClearBufferfv = (glClearBufferfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearBufferfv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglClearBufferfi(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jfloat depth, jint stencil, jlong __functionAddress) {
	glClearBufferfiPROC glClearBufferfi = (glClearBufferfiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearBufferfi(buffer, drawbuffer, depth, stencil);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_GLES30_nglGetStringi(JNIEnv *__env, jclass clazz, jint name, jint index, jlong __functionAddress) {
	glGetStringiPROC glGetStringi = (glGetStringiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glGetStringi(name, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglCopyBufferSubData(JNIEnv *__env, jclass clazz, jint readTarget, jint writeTarget, jlong readOffset, jlong writeOffset, jlong size, jlong __functionAddress) {
	glCopyBufferSubDataPROC glCopyBufferSubData = (glCopyBufferSubDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyBufferSubData(readTarget, writeTarget, (GLintptr)readOffset, (GLintptr)writeOffset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetUniformIndices(JNIEnv *__env, jclass clazz, jint program, jint uniformCount, jlong uniformNamesAddress, jlong uniformIndicesAddress, jlong __functionAddress) {
	const GLchar * const *uniformNames = (const GLchar * const *)(intptr_t)uniformNamesAddress;
	GLuint *uniformIndices = (GLuint *)(intptr_t)uniformIndicesAddress;
	glGetUniformIndicesPROC glGetUniformIndices = (glGetUniformIndicesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformIndices(program, uniformCount, uniformNames, uniformIndices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetActiveUniformsiv(JNIEnv *__env, jclass clazz, jint program, jint uniformCount, jlong uniformIndicesAddress, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *uniformIndices = (const GLuint *)(intptr_t)uniformIndicesAddress;
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetActiveUniformsivPROC glGetActiveUniformsiv = (glGetActiveUniformsivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES30_nglGetUniformBlockIndex(JNIEnv *__env, jclass clazz, jint program, jlong uniformBlockNameAddress, jlong __functionAddress) {
	const GLchar *uniformBlockName = (const GLchar *)(intptr_t)uniformBlockNameAddress;
	glGetUniformBlockIndexPROC glGetUniformBlockIndex = (glGetUniformBlockIndexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetUniformBlockIndex(program, uniformBlockName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetActiveUniformBlockiv(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetActiveUniformBlockivPROC glGetActiveUniformBlockiv = (glGetActiveUniformBlockivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetActiveUniformBlockName(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint bufSize, jlong lengthAddress, jlong uniformBlockNameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *uniformBlockName = (GLchar *)(intptr_t)uniformBlockNameAddress;
	glGetActiveUniformBlockNamePROC glGetActiveUniformBlockName = (glGetActiveUniformBlockNamePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformBlockBinding(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint uniformBlockBinding, jlong __functionAddress) {
	glUniformBlockBindingPROC glUniformBlockBinding = (glUniformBlockBindingPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDrawArraysInstanced(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint instancecount, jlong __functionAddress) {
	glDrawArraysInstancedPROC glDrawArraysInstanced = (glDrawArraysInstancedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArraysInstanced(mode, first, count, instancecount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDrawElementsInstanced(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedPROC glDrawElementsInstanced = (glDrawElementsInstancedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstanced(mode, count, type, indices, instancecount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_GLES30_nglFenceSync(JNIEnv *__env, jclass clazz, jint condition, jint flags, jlong __functionAddress) {
	glFenceSyncPROC glFenceSync = (glFenceSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glFenceSync(condition, flags);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_nglIsSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glIsSyncPROC glIsSync = (glIsSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsSync(sync);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDeleteSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glDeleteSyncPROC glDeleteSync = (glDeleteSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteSync(sync);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES30_nglClientWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glClientWaitSyncPROC glClientWaitSync = (glClientWaitSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glClientWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	glWaitSyncPROC glWaitSync = (glWaitSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetInteger64v(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLint64 *data = (GLint64 *)(intptr_t)dataAddress;
	glGetInteger64vPROC glGetInteger64v = (glGetInteger64vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetInteger64v(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetSynciv(JNIEnv *__env, jclass clazz, jlong syncAddress, jint pname, jint bufSize, jlong lengthAddress, jlong valuesAddress, jlong __functionAddress) {
	GLsync sync = (GLsync)(intptr_t)syncAddress;
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLint *values = (GLint *)(intptr_t)valuesAddress;
	glGetSyncivPROC glGetSynciv = (glGetSyncivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSynciv(sync, pname, bufSize, length, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetInteger64i_1v(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress, jlong __functionAddress) {
	GLint64 *data = (GLint64 *)(intptr_t)dataAddress;
	glGetInteger64i_vPROC glGetInteger64i_v = (glGetInteger64i_vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetInteger64i_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetBufferParameteri64v(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint64 *params = (GLint64 *)(intptr_t)paramsAddress;
	glGetBufferParameteri64vPROC glGetBufferParameteri64v = (glGetBufferParameteri64vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBufferParameteri64v(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGenSamplers(JNIEnv *__env, jclass clazz, jint count, jlong samplersAddress, jlong __functionAddress) {
	GLuint *samplers = (GLuint *)(intptr_t)samplersAddress;
	glGenSamplersPROC glGenSamplers = (glGenSamplersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenSamplers(count, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDeleteSamplers(JNIEnv *__env, jclass clazz, jint count, jlong samplersAddress, jlong __functionAddress) {
	const GLuint *samplers = (const GLuint *)(intptr_t)samplersAddress;
	glDeleteSamplersPROC glDeleteSamplers = (glDeleteSamplersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteSamplers(count, samplers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_nglIsSampler(JNIEnv *__env, jclass clazz, jint sampler, jlong __functionAddress) {
	glIsSamplerPROC glIsSampler = (glIsSamplerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsSampler(sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglBindSampler(JNIEnv *__env, jclass clazz, jint unit, jint sampler, jlong __functionAddress) {
	glBindSamplerPROC glBindSampler = (glBindSamplerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindSampler(unit, sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglSamplerParameteri(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jint param, jlong __functionAddress) {
	glSamplerParameteriPROC glSamplerParameteri = (glSamplerParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameteri(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglSamplerParameteriv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramAddress, jlong __functionAddress) {
	const GLint *param = (const GLint *)(intptr_t)paramAddress;
	glSamplerParameterivPROC glSamplerParameteriv = (glSamplerParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameteriv(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglSamplerParameterf(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jfloat param, jlong __functionAddress) {
	glSamplerParameterfPROC glSamplerParameterf = (glSamplerParameterfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterf(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglSamplerParameterfv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramAddress, jlong __functionAddress) {
	const GLfloat *param = (const GLfloat *)(intptr_t)paramAddress;
	glSamplerParameterfvPROC glSamplerParameterfv = (glSamplerParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterfv(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetSamplerParameteriv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetSamplerParameterivPROC glGetSamplerParameteriv = (glGetSamplerParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameteriv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetSamplerParameterfv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetSamplerParameterfvPROC glGetSamplerParameterfv = (glGetSamplerParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameterfv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglVertexAttribDivisor(JNIEnv *__env, jclass clazz, jint index, jint divisor, jlong __functionAddress) {
	glVertexAttribDivisorPROC glVertexAttribDivisor = (glVertexAttribDivisorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribDivisor(index, divisor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglBindTransformFeedback(JNIEnv *__env, jclass clazz, jint target, jint id, jlong __functionAddress) {
	glBindTransformFeedbackPROC glBindTransformFeedback = (glBindTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindTransformFeedback(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDeleteTransformFeedbacks(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDeleteTransformFeedbacksPROC glDeleteTransformFeedbacks = (glDeleteTransformFeedbacksPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteTransformFeedbacks(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGenTransformFeedbacks(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	glGenTransformFeedbacksPROC glGenTransformFeedbacks = (glGenTransformFeedbacksPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenTransformFeedbacks(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_nglIsTransformFeedback(JNIEnv *__env, jclass clazz, jint id, jlong __functionAddress) {
	glIsTransformFeedbackPROC glIsTransformFeedback = (glIsTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsTransformFeedback(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglPauseTransformFeedback(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPauseTransformFeedbackPROC glPauseTransformFeedback = (glPauseTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPauseTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglResumeTransformFeedback(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glResumeTransformFeedbackPROC glResumeTransformFeedback = (glResumeTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glResumeTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetProgramBinary(JNIEnv *__env, jclass clazz, jint program, jint bufSize, jlong lengthAddress, jlong binaryFormatAddress, jlong binaryAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLenum *binaryFormat = (GLenum *)(intptr_t)binaryFormatAddress;
	void *binary = (void *)(intptr_t)binaryAddress;
	glGetProgramBinaryPROC glGetProgramBinary = (glGetProgramBinaryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramBinary(program, bufSize, length, binaryFormat, binary);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglProgramBinary(JNIEnv *__env, jclass clazz, jint program, jint binaryFormat, jlong binaryAddress, jint length, jlong __functionAddress) {
	const void *binary = (const void *)(intptr_t)binaryAddress;
	glProgramBinaryPROC glProgramBinary = (glProgramBinaryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramBinary(program, binaryFormat, binary, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglProgramParameteri(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value, jlong __functionAddress) {
	glProgramParameteriPROC glProgramParameteri = (glProgramParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramParameteri(program, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglInvalidateFramebuffer(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress, jlong __functionAddress) {
	const GLenum *attachments = (const GLenum *)(intptr_t)attachmentsAddress;
	glInvalidateFramebufferPROC glInvalidateFramebuffer = (glInvalidateFramebufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glInvalidateFramebuffer(target, numAttachments, attachments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglInvalidateSubFramebuffer(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	const GLenum *attachments = (const GLenum *)(intptr_t)attachmentsAddress;
	glInvalidateSubFramebufferPROC glInvalidateSubFramebuffer = (glInvalidateSubFramebufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglTexStorage2D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glTexStorage2DPROC glTexStorage2D = (glTexStorage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorage2D(target, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglTexStorage3D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jint depth, jlong __functionAddress) {
	glTexStorage3DPROC glTexStorage3D = (glTexStorage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorage3D(target, levels, internalformat, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetInternalformativ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint pname, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetInternalformativPROC glGetInternalformativ = (glGetInternalformativPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetInternalformativ(target, internalformat, pname, bufSize, params);
}

EXTERN_C_EXIT
