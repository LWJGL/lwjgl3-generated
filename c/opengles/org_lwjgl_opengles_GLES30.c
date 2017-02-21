/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glReadBufferPROC) (jint);
typedef void (APIENTRY *glDrawRangeElementsPROC) (jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTexImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTexSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCopyTexSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCompressedTexImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedTexSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGenQueriesPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteQueriesPROC) (jint, const intptr_t);
typedef jboolean (APIENTRY *glIsQueryPROC) (jint);
typedef void (APIENTRY *glBeginQueryPROC) (jint, jint);
typedef void (APIENTRY *glEndQueryPROC) (jint);
typedef void (APIENTRY *glGetQueryivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryObjectuivPROC) (jint, jint, intptr_t);
typedef jboolean (APIENTRY *glUnmapBufferPROC) (jint);
typedef void (APIENTRY *glGetBufferPointervPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glDrawBuffersPROC) (jint, const intptr_t);
typedef void (APIENTRY *glUniformMatrix2x3fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix3x2fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix2x4fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix4x2fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix3x4fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix4x3fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glBlitFramebufferPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glRenderbufferStorageMultisamplePROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTextureLayerPROC) (jint, jint, jint, jint, jint);
typedef intptr_t (APIENTRY *glMapBufferRangePROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glFlushMappedBufferRangePROC) (jint, intptr_t, intptr_t);
typedef void (APIENTRY *glBindVertexArrayPROC) (jint);
typedef void (APIENTRY *glDeleteVertexArraysPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGenVertexArraysPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsVertexArrayPROC) (jint);
typedef void (APIENTRY *glGetIntegeri_vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glBeginTransformFeedbackPROC) (jint);
typedef void (APIENTRY *glEndTransformFeedbackPROC) (void);
typedef void (APIENTRY *glBindBufferRangePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glBindBufferBasePROC) (jint, jint, jint);
typedef void (APIENTRY *glTransformFeedbackVaryingsPROC) (jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glGetTransformFeedbackVaryingPROC) (jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glVertexAttribIPointerPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetVertexAttribIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribIuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI4iPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI4uiPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI4ivPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI4uivPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGetUniformuivPROC) (jint, jint, intptr_t);
typedef jint (APIENTRY *glGetFragDataLocationPROC) (jint, const intptr_t);
typedef void (APIENTRY *glUniform1uiPROC) (jint, jint);
typedef void (APIENTRY *glUniform2uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glUniform3uiPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glUniform4uiPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glUniform1uivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform2uivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform3uivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform4uivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glClearBufferivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glClearBufferuivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glClearBufferfvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glClearBufferfiPROC) (jint, jint, jfloat, jint);
typedef intptr_t (APIENTRY *glGetStringiPROC) (jint, jint);
typedef void (APIENTRY *glCopyBufferSubDataPROC) (jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glGetUniformIndicesPROC) (jint, jint, const intptr_t, intptr_t);
typedef void (APIENTRY *glGetActiveUniformsivPROC) (jint, jint, const intptr_t, jint, intptr_t);
typedef jint (APIENTRY *glGetUniformBlockIndexPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGetActiveUniformBlockivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetActiveUniformBlockNamePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glUniformBlockBindingPROC) (jint, jint, jint);
typedef void (APIENTRY *glDrawArraysInstancedPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedPROC) (jint, jint, jint, const intptr_t, jint);
typedef intptr_t (APIENTRY *glFenceSyncPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsSyncPROC) (intptr_t);
typedef void (APIENTRY *glDeleteSyncPROC) (intptr_t);
typedef jint (APIENTRY *glClientWaitSyncPROC) (intptr_t, jint, jlong);
typedef void (APIENTRY *glWaitSyncPROC) (intptr_t, jint, jlong);
typedef void (APIENTRY *glGetInteger64vPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetSyncivPROC) (intptr_t, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetInteger64i_vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetBufferParameteri64vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGenSamplersPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteSamplersPROC) (jint, const intptr_t);
typedef jboolean (APIENTRY *glIsSamplerPROC) (jint);
typedef void (APIENTRY *glBindSamplerPROC) (jint, jint);
typedef void (APIENTRY *glSamplerParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glSamplerParameterivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glSamplerParameterfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glSamplerParameterfvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetSamplerParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSamplerParameterfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glVertexAttribDivisorPROC) (jint, jint);
typedef void (APIENTRY *glBindTransformFeedbackPROC) (jint, jint);
typedef void (APIENTRY *glDeleteTransformFeedbacksPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGenTransformFeedbacksPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsTransformFeedbackPROC) (jint);
typedef void (APIENTRY *glPauseTransformFeedbackPROC) (void);
typedef void (APIENTRY *glResumeTransformFeedbackPROC) (void);
typedef void (APIENTRY *glGetProgramBinaryPROC) (jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glProgramBinaryPROC) (jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glProgramParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glInvalidateFramebufferPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glInvalidateSubFramebufferPROC) (jint, jint, const intptr_t, jint, jint, jint, jint);
typedef void (APIENTRY *glTexStorage2DPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTexStorage3DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGetInternalformativPROC) (jint, jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glReadBuffer(JNIEnv *__env, jclass clazz, jint src) {
	glReadBufferPROC glReadBuffer = (glReadBufferPROC)tlsGetFunction(586);
	UNUSED_PARAM(clazz)
	glReadBuffer(src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDrawRangeElements(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress) {
	glDrawRangeElementsPROC glDrawRangeElements = (glDrawRangeElementsPROC)tlsGetFunction(179);
	const intptr_t indices = (const intptr_t)indicesAddress;
	UNUSED_PARAM(clazz)
	glDrawRangeElements(mode, start, end, count, type, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglTexImage3D__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress) {
	glTexImage3DPROC glTexImage3D = (glTexImage3DPROC)tlsGetFunction(651);
	const intptr_t pixels = (const intptr_t)pixelsAddress;
	UNUSED_PARAM(clazz)
	glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglTexSubImage3D__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress) {
	glTexSubImage3DPROC glTexSubImage3D = (glTexSubImage3DPROC)tlsGetFunction(674);
	const intptr_t pixels = (const intptr_t)pixelsAddress;
	UNUSED_PARAM(clazz)
	glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glCopyTexSubImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height) {
	glCopyTexSubImage3DPROC glCopyTexSubImage3D = (glCopyTexSubImage3DPROC)tlsGetFunction(92);
	UNUSED_PARAM(clazz)
	glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglCompressedTexImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress) {
	glCompressedTexImage3DPROC glCompressedTexImage3D = (glCompressedTexImage3DPROC)tlsGetFunction(76);
	const intptr_t data = (const intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglCompressedTexSubImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress) {
	glCompressedTexSubImage3DPROC glCompressedTexSubImage3D = (glCompressedTexSubImage3DPROC)tlsGetFunction(80);
	const intptr_t data = (const intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGenQueries__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
	glGenQueriesPROC glGenQueries = (glGenQueriesPROC)tlsGetFunction(244);
	intptr_t ids = (intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glGenQueries(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDeleteQueries__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
	glDeleteQueriesPROC glDeleteQueries = (glDeleteQueriesPROC)tlsGetFunction(125);
	const intptr_t ids = (const intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glDeleteQueries(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_glIsQuery(JNIEnv *__env, jclass clazz, jint id) {
	glIsQueryPROC glIsQuery = (glIsQueryPROC)tlsGetFunction(416);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsQuery(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glBeginQuery(JNIEnv *__env, jclass clazz, jint target, jint id) {
	glBeginQueryPROC glBeginQuery = (glBeginQueryPROC)tlsGetFunction(9);
	UNUSED_PARAM(clazz)
	glBeginQuery(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glEndQuery(JNIEnv *__env, jclass clazz, jint target) {
	glEndQueryPROC glEndQuery = (glEndQueryPROC)tlsGetFunction(195);
	UNUSED_PARAM(clazz)
	glEndQuery(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetQueryiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetQueryivPROC glGetQueryiv = (glGetQueryivPROC)tlsGetFunction(342);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetQueryiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetQueryObjectuiv__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
	glGetQueryObjectuivPROC glGetQueryObjectuiv = (glGetQueryObjectuivPROC)tlsGetFunction(340);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetQueryObjectuiv(id, pname, params);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_glUnmapBuffer(JNIEnv *__env, jclass clazz, jint target) {
	glUnmapBufferPROC glUnmapBuffer = (glUnmapBufferPROC)tlsGetFunction(743);
	UNUSED_PARAM(clazz)
	return (jboolean)glUnmapBuffer(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetBufferPointerv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetBufferPointervPROC glGetBufferPointerv = (glGetBufferPointervPROC)tlsGetFunction(264);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetBufferPointerv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDrawBuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong bufsAddress) {
	glDrawBuffersPROC glDrawBuffers = (glDrawBuffersPROC)tlsGetFunction(161);
	const intptr_t bufs = (const intptr_t)bufsAddress;
	UNUSED_PARAM(clazz)
	glDrawBuffers(n, bufs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix2x3fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix2x3fvPROC glUniformMatrix2x3fv = (glUniformMatrix2x3fvPROC)tlsGetFunction(729);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix2x3fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix3x2fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix3x2fvPROC glUniformMatrix3x2fv = (glUniformMatrix3x2fvPROC)tlsGetFunction(734);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix3x2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix2x4fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix2x4fvPROC glUniformMatrix2x4fv = (glUniformMatrix2x4fvPROC)tlsGetFunction(731);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix2x4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix4x2fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix4x2fvPROC glUniformMatrix4x2fv = (glUniformMatrix4x2fvPROC)tlsGetFunction(739);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix4x2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix3x4fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix3x4fvPROC glUniformMatrix3x4fv = (glUniformMatrix3x4fvPROC)tlsGetFunction(736);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix3x4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniformMatrix4x3fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix4x3fvPROC glUniformMatrix4x3fv = (glUniformMatrix4x3fvPROC)tlsGetFunction(741);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix4x3fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glBlitFramebuffer(JNIEnv *__env, jclass clazz, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter) {
	glBlitFramebufferPROC glBlitFramebuffer = (glBlitFramebufferPROC)tlsGetFunction(50);
	UNUSED_PARAM(clazz)
	glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glRenderbufferStorageMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height) {
	glRenderbufferStorageMultisamplePROC glRenderbufferStorageMultisample = (glRenderbufferStorageMultisamplePROC)tlsGetFunction(595);
	UNUSED_PARAM(clazz)
	glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glFramebufferTextureLayer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer) {
	glFramebufferTextureLayerPROC glFramebufferTextureLayer = (glFramebufferTextureLayerPROC)tlsGetFunction(230);
	UNUSED_PARAM(clazz)
	glFramebufferTextureLayer(target, attachment, texture, level, layer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_GLES30_nglMapBufferRange(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length, jint access) {
	glMapBufferRangePROC glMapBufferRange = (glMapBufferRangePROC)tlsGetFunction(436);
	UNUSED_PARAM(clazz)
	return (jlong)glMapBufferRange(target, (intptr_t)offset, (intptr_t)length, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glFlushMappedBufferRange(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length) {
	glFlushMappedBufferRangePROC glFlushMappedBufferRange = (glFlushMappedBufferRangePROC)tlsGetFunction(216);
	UNUSED_PARAM(clazz)
	glFlushMappedBufferRange(target, (intptr_t)offset, (intptr_t)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glBindVertexArray(JNIEnv *__env, jclass clazz, jint array) {
	glBindVertexArrayPROC glBindVertexArray = (glBindVertexArrayPROC)tlsGetFunction(26);
	UNUSED_PARAM(clazz)
	glBindVertexArray(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDeleteVertexArrays__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
	glDeleteVertexArraysPROC glDeleteVertexArrays = (glDeleteVertexArraysPROC)tlsGetFunction(134);
	const intptr_t arrays = (const intptr_t)arraysAddress;
	UNUSED_PARAM(clazz)
	glDeleteVertexArrays(n, arrays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGenVertexArrays__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
	glGenVertexArraysPROC glGenVertexArrays = (glGenVertexArraysPROC)tlsGetFunction(250);
	intptr_t arrays = (intptr_t)arraysAddress;
	UNUSED_PARAM(clazz)
	glGenVertexArrays(n, arrays);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_glIsVertexArray(JNIEnv *__env, jclass clazz, jint array) {
	glIsVertexArrayPROC glIsVertexArray = (glIsVertexArrayPROC)tlsGetFunction(426);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsVertexArray(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetIntegeri_1v__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
	glGetIntegeri_vPROC glGetIntegeri_v = (glGetIntegeri_vPROC)tlsGetFunction(289);
	intptr_t data = (intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glGetIntegeri_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glBeginTransformFeedback(JNIEnv *__env, jclass clazz, jint primitiveMode) {
	glBeginTransformFeedbackPROC glBeginTransformFeedback = (glBeginTransformFeedbackPROC)tlsGetFunction(11);
	UNUSED_PARAM(clazz)
	glBeginTransformFeedback(primitiveMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glEndTransformFeedback(JNIEnv *__env, jclass clazz) {
	glEndTransformFeedbackPROC glEndTransformFeedback = (glEndTransformFeedbackPROC)tlsGetFunction(198);
	UNUSED_PARAM(clazz)
	glEndTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glBindBufferRange(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong size) {
	glBindBufferRangePROC glBindBufferRange = (glBindBufferRangePROC)tlsGetFunction(15);
	UNUSED_PARAM(clazz)
	glBindBufferRange(target, index, buffer, (intptr_t)offset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glBindBufferBase(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer) {
	glBindBufferBasePROC glBindBufferBase = (glBindBufferBasePROC)tlsGetFunction(14);
	UNUSED_PARAM(clazz)
	glBindBufferBase(target, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglTransformFeedbackVaryings(JNIEnv *__env, jclass clazz, jint program, jint count, jlong varyingsAddress, jint bufferMode) {
	glTransformFeedbackVaryingsPROC glTransformFeedbackVaryings = (glTransformFeedbackVaryingsPROC)tlsGetFunction(683);
	const intptr_t varyings = (const intptr_t)varyingsAddress;
	UNUSED_PARAM(clazz)
	glTransformFeedbackVaryings(program, count, varyings, bufferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetTransformFeedbackVarying__IIIJJJJ(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
	glGetTransformFeedbackVaryingPROC glGetTransformFeedbackVarying = (glGetTransformFeedbackVaryingPROC)tlsGetFunction(373);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t size = (intptr_t)sizeAddress;
	intptr_t type = (intptr_t)typeAddress;
	intptr_t name = (intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	glGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglVertexAttribIPointer(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong pointerAddress) {
	glVertexAttribIPointerPROC glVertexAttribIPointer = (glVertexAttribIPointerPROC)tlsGetFunction(770);
	const intptr_t pointer = (const intptr_t)pointerAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribIPointer(index, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetVertexAttribIiv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
	glGetVertexAttribIivPROC glGetVertexAttribIiv = (glGetVertexAttribIivPROC)tlsGetFunction(383);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetVertexAttribIiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetVertexAttribIuiv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
	glGetVertexAttribIuivPROC glGetVertexAttribIuiv = (glGetVertexAttribIuivPROC)tlsGetFunction(384);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetVertexAttribIuiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glVertexAttribI4i(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w) {
	glVertexAttribI4iPROC glVertexAttribI4i = (glVertexAttribI4iPROC)tlsGetFunction(765);
	UNUSED_PARAM(clazz)
	glVertexAttribI4i(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glVertexAttribI4ui(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w) {
	glVertexAttribI4uiPROC glVertexAttribI4ui = (glVertexAttribI4uiPROC)tlsGetFunction(767);
	UNUSED_PARAM(clazz)
	glVertexAttribI4ui(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglVertexAttribI4iv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI4ivPROC glVertexAttribI4iv = (glVertexAttribI4ivPROC)tlsGetFunction(766);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI4iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglVertexAttribI4uiv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI4uivPROC glVertexAttribI4uiv = (glVertexAttribI4uivPROC)tlsGetFunction(768);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI4uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetUniformuiv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
	glGetUniformuivPROC glGetUniformuiv = (glGetUniformuivPROC)tlsGetFunction(382);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetUniformuiv(program, location, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES30_nglGetFragDataLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
	glGetFragDataLocationPROC glGetFragDataLocation = (glGetFragDataLocationPROC)tlsGetFunction(278);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetFragDataLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glUniform1ui(JNIEnv *__env, jclass clazz, jint location, jint v0) {
	glUniform1uiPROC glUniform1ui = (glUniform1uiPROC)tlsGetFunction(691);
	UNUSED_PARAM(clazz)
	glUniform1ui(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glUniform2ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1) {
	glUniform2uiPROC glUniform2ui = (glUniform2uiPROC)tlsGetFunction(701);
	UNUSED_PARAM(clazz)
	glUniform2ui(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glUniform3ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2) {
	glUniform3uiPROC glUniform3ui = (glUniform3uiPROC)tlsGetFunction(711);
	UNUSED_PARAM(clazz)
	glUniform3ui(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glUniform4ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3) {
	glUniform4uiPROC glUniform4ui = (glUniform4uiPROC)tlsGetFunction(721);
	UNUSED_PARAM(clazz)
	glUniform4ui(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform1uiv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform1uivPROC glUniform1uiv = (glUniform1uivPROC)tlsGetFunction(694);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform1uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform2uiv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform2uivPROC glUniform2uiv = (glUniform2uivPROC)tlsGetFunction(704);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform2uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform3uiv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform3uivPROC glUniform3uiv = (glUniform3uivPROC)tlsGetFunction(714);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform3uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglUniform4uiv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform4uivPROC glUniform4uiv = (glUniform4uivPROC)tlsGetFunction(724);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform4uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglClearBufferiv__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress) {
	glClearBufferivPROC glClearBufferiv = (glClearBufferivPROC)tlsGetFunction(60);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glClearBufferiv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglClearBufferuiv__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress) {
	glClearBufferuivPROC glClearBufferuiv = (glClearBufferuivPROC)tlsGetFunction(61);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glClearBufferuiv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglClearBufferfv__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress) {
	glClearBufferfvPROC glClearBufferfv = (glClearBufferfvPROC)tlsGetFunction(59);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glClearBufferfv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glClearBufferfi(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jfloat depth, jint stencil) {
	glClearBufferfiPROC glClearBufferfi = (glClearBufferfiPROC)tlsGetFunction(58);
	UNUSED_PARAM(clazz)
	glClearBufferfi(buffer, drawbuffer, depth, stencil);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_GLES30_nglGetStringi(JNIEnv *__env, jclass clazz, jint name, jint index) {
	glGetStringiPROC glGetStringi = (glGetStringiPROC)tlsGetFunction(358);
	UNUSED_PARAM(clazz)
	return (jlong)glGetStringi(name, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glCopyBufferSubData(JNIEnv *__env, jclass clazz, jint readTarget, jint writeTarget, jlong readOffset, jlong writeOffset, jlong size) {
	glCopyBufferSubDataPROC glCopyBufferSubData = (glCopyBufferSubDataPROC)tlsGetFunction(84);
	UNUSED_PARAM(clazz)
	glCopyBufferSubData(readTarget, writeTarget, (intptr_t)readOffset, (intptr_t)writeOffset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetUniformIndices__IIJJ(JNIEnv *__env, jclass clazz, jint program, jint uniformCount, jlong uniformNamesAddress, jlong uniformIndicesAddress) {
	glGetUniformIndicesPROC glGetUniformIndices = (glGetUniformIndicesPROC)tlsGetFunction(376);
	const intptr_t uniformNames = (const intptr_t)uniformNamesAddress;
	intptr_t uniformIndices = (intptr_t)uniformIndicesAddress;
	UNUSED_PARAM(clazz)
	glGetUniformIndices(program, uniformCount, uniformNames, uniformIndices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetActiveUniformsiv__IIJIJ(JNIEnv *__env, jclass clazz, jint program, jint uniformCount, jlong uniformIndicesAddress, jint pname, jlong paramsAddress) {
	glGetActiveUniformsivPROC glGetActiveUniformsiv = (glGetActiveUniformsivPROC)tlsGetFunction(257);
	const intptr_t uniformIndices = (const intptr_t)uniformIndicesAddress;
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES30_nglGetUniformBlockIndex(JNIEnv *__env, jclass clazz, jint program, jlong uniformBlockNameAddress) {
	glGetUniformBlockIndexPROC glGetUniformBlockIndex = (glGetUniformBlockIndexPROC)tlsGetFunction(375);
	const intptr_t uniformBlockName = (const intptr_t)uniformBlockNameAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetUniformBlockIndex(program, uniformBlockName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetActiveUniformBlockiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint pname, jlong paramsAddress) {
	glGetActiveUniformBlockivPROC glGetActiveUniformBlockiv = (glGetActiveUniformBlockivPROC)tlsGetFunction(256);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetActiveUniformBlockName__IIIJJ(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint bufSize, jlong lengthAddress, jlong uniformBlockNameAddress) {
	glGetActiveUniformBlockNamePROC glGetActiveUniformBlockName = (glGetActiveUniformBlockNamePROC)tlsGetFunction(255);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t uniformBlockName = (intptr_t)uniformBlockNameAddress;
	UNUSED_PARAM(clazz)
	glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glUniformBlockBinding(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint uniformBlockBinding) {
	glUniformBlockBindingPROC glUniformBlockBinding = (glUniformBlockBindingPROC)tlsGetFunction(725);
	UNUSED_PARAM(clazz)
	glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glDrawArraysInstanced(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint instancecount) {
	glDrawArraysInstancedPROC glDrawArraysInstanced = (glDrawArraysInstancedPROC)tlsGetFunction(156);
	UNUSED_PARAM(clazz)
	glDrawArraysInstanced(mode, first, count, instancecount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDrawElementsInstanced(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount) {
	glDrawElementsInstancedPROC glDrawElementsInstanced = (glDrawElementsInstancedPROC)tlsGetFunction(170);
	const intptr_t indices = (const intptr_t)indicesAddress;
	UNUSED_PARAM(clazz)
	glDrawElementsInstanced(mode, count, type, indices, instancecount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_GLES30_glFenceSync(JNIEnv *__env, jclass clazz, jint condition, jint flags) {
	glFenceSyncPROC glFenceSync = (glFenceSyncPROC)tlsGetFunction(211);
	UNUSED_PARAM(clazz)
	return (jlong)glFenceSync(condition, flags);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_nglIsSync(JNIEnv *__env, jclass clazz, jlong syncAddress) {
	glIsSyncPROC glIsSync = (glIsSyncPROC)tlsGetFunction(421);
	intptr_t sync = (intptr_t)syncAddress;
	UNUSED_PARAM(clazz)
	return (jboolean)glIsSync(sync);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDeleteSync(JNIEnv *__env, jclass clazz, jlong syncAddress) {
	glDeleteSyncPROC glDeleteSync = (glDeleteSyncPROC)tlsGetFunction(130);
	intptr_t sync = (intptr_t)syncAddress;
	UNUSED_PARAM(clazz)
	glDeleteSync(sync);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES30_nglClientWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout) {
	glClientWaitSyncPROC glClientWaitSync = (glClientWaitSyncPROC)tlsGetFunction(68);
	intptr_t sync = (intptr_t)syncAddress;
	UNUSED_PARAM(clazz)
	return (jint)glClientWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout) {
	glWaitSyncPROC glWaitSync = (glWaitSyncPROC)tlsGetFunction(781);
	intptr_t sync = (intptr_t)syncAddress;
	UNUSED_PARAM(clazz)
	glWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetInteger64v__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress) {
	glGetInteger64vPROC glGetInteger64v = (glGetInteger64vPROC)tlsGetFunction(287);
	intptr_t data = (intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glGetInteger64v(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetSynciv__JIIJJ(JNIEnv *__env, jclass clazz, jlong syncAddress, jint pname, jint bufSize, jlong lengthAddress, jlong valuesAddress) {
	glGetSyncivPROC glGetSynciv = (glGetSyncivPROC)tlsGetFunction(359);
	intptr_t sync = (intptr_t)syncAddress;
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t values = (intptr_t)valuesAddress;
	UNUSED_PARAM(clazz)
	glGetSynciv(sync, pname, bufSize, length, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetInteger64i_1v__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
	glGetInteger64i_vPROC glGetInteger64i_v = (glGetInteger64i_vPROC)tlsGetFunction(286);
	intptr_t data = (intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glGetInteger64i_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetBufferParameteri64v__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetBufferParameteri64vPROC glGetBufferParameteri64v = (glGetBufferParameteri64vPROC)tlsGetFunction(262);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetBufferParameteri64v(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGenSamplers__IJ(JNIEnv *__env, jclass clazz, jint count, jlong samplersAddress) {
	glGenSamplersPROC glGenSamplers = (glGenSamplersPROC)tlsGetFunction(247);
	intptr_t samplers = (intptr_t)samplersAddress;
	UNUSED_PARAM(clazz)
	glGenSamplers(count, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDeleteSamplers__IJ(JNIEnv *__env, jclass clazz, jint count, jlong samplersAddress) {
	glDeleteSamplersPROC glDeleteSamplers = (glDeleteSamplersPROC)tlsGetFunction(128);
	const intptr_t samplers = (const intptr_t)samplersAddress;
	UNUSED_PARAM(clazz)
	glDeleteSamplers(count, samplers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_glIsSampler(JNIEnv *__env, jclass clazz, jint sampler) {
	glIsSamplerPROC glIsSampler = (glIsSamplerPROC)tlsGetFunction(419);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsSampler(sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glBindSampler(JNIEnv *__env, jclass clazz, jint unit, jint sampler) {
	glBindSamplerPROC glBindSampler = (glBindSamplerPROC)tlsGetFunction(23);
	UNUSED_PARAM(clazz)
	glBindSampler(unit, sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glSamplerParameteri(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jint param) {
	glSamplerParameteriPROC glSamplerParameteri = (glSamplerParameteriPROC)tlsGetFunction(614);
	UNUSED_PARAM(clazz)
	glSamplerParameteri(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglSamplerParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramAddress) {
	glSamplerParameterivPROC glSamplerParameteriv = (glSamplerParameterivPROC)tlsGetFunction(615);
	const intptr_t param = (const intptr_t)paramAddress;
	UNUSED_PARAM(clazz)
	glSamplerParameteriv(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glSamplerParameterf(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jfloat param) {
	glSamplerParameterfPROC glSamplerParameterf = (glSamplerParameterfPROC)tlsGetFunction(612);
	UNUSED_PARAM(clazz)
	glSamplerParameterf(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglSamplerParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramAddress) {
	glSamplerParameterfvPROC glSamplerParameterfv = (glSamplerParameterfvPROC)tlsGetFunction(613);
	const intptr_t param = (const intptr_t)paramAddress;
	UNUSED_PARAM(clazz)
	glSamplerParameterfv(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetSamplerParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
	glGetSamplerParameterivPROC glGetSamplerParameteriv = (glGetSamplerParameterivPROC)tlsGetFunction(352);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetSamplerParameteriv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetSamplerParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
	glGetSamplerParameterfvPROC glGetSamplerParameterfv = (glGetSamplerParameterfvPROC)tlsGetFunction(351);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetSamplerParameterfv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glVertexAttribDivisor(JNIEnv *__env, jclass clazz, jint index, jint divisor) {
	glVertexAttribDivisorPROC glVertexAttribDivisor = (glVertexAttribDivisorPROC)tlsGetFunction(760);
	UNUSED_PARAM(clazz)
	glVertexAttribDivisor(index, divisor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glBindTransformFeedback(JNIEnv *__env, jclass clazz, jint target, jint id) {
	glBindTransformFeedbackPROC glBindTransformFeedback = (glBindTransformFeedbackPROC)tlsGetFunction(25);
	UNUSED_PARAM(clazz)
	glBindTransformFeedback(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglDeleteTransformFeedbacks__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
	glDeleteTransformFeedbacksPROC glDeleteTransformFeedbacks = (glDeleteTransformFeedbacksPROC)tlsGetFunction(133);
	const intptr_t ids = (const intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glDeleteTransformFeedbacks(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGenTransformFeedbacks__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
	glGenTransformFeedbacksPROC glGenTransformFeedbacks = (glGenTransformFeedbacksPROC)tlsGetFunction(249);
	intptr_t ids = (intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glGenTransformFeedbacks(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES30_glIsTransformFeedback(JNIEnv *__env, jclass clazz, jint id) {
	glIsTransformFeedbackPROC glIsTransformFeedback = (glIsTransformFeedbackPROC)tlsGetFunction(425);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsTransformFeedback(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glPauseTransformFeedback(JNIEnv *__env, jclass clazz) {
	glPauseTransformFeedbackPROC glPauseTransformFeedback = (glPauseTransformFeedbackPROC)tlsGetFunction(480);
	UNUSED_PARAM(clazz)
	glPauseTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glResumeTransformFeedback(JNIEnv *__env, jclass clazz) {
	glResumeTransformFeedbackPROC glResumeTransformFeedback = (glResumeTransformFeedbackPROC)tlsGetFunction(603);
	UNUSED_PARAM(clazz)
	glResumeTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetProgramBinary__IIJJJ(JNIEnv *__env, jclass clazz, jint program, jint bufSize, jlong lengthAddress, jlong binaryFormatAddress, jlong binaryAddress) {
	glGetProgramBinaryPROC glGetProgramBinary = (glGetProgramBinaryPROC)tlsGetFunction(322);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t binaryFormat = (intptr_t)binaryFormatAddress;
	intptr_t binary = (intptr_t)binaryAddress;
	UNUSED_PARAM(clazz)
	glGetProgramBinary(program, bufSize, length, binaryFormat, binary);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglProgramBinary(JNIEnv *__env, jclass clazz, jint program, jint binaryFormat, jlong binaryAddress, jint length) {
	glProgramBinaryPROC glProgramBinary = (glProgramBinaryPROC)tlsGetFunction(492);
	const intptr_t binary = (const intptr_t)binaryAddress;
	UNUSED_PARAM(clazz)
	glProgramBinary(program, binaryFormat, binary, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glProgramParameteri(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value) {
	glProgramParameteriPROC glProgramParameteri = (glProgramParameteriPROC)tlsGetFunction(494);
	UNUSED_PARAM(clazz)
	glProgramParameteri(program, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglInvalidateFramebuffer__IIJ(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress) {
	glInvalidateFramebufferPROC glInvalidateFramebuffer = (glInvalidateFramebufferPROC)tlsGetFunction(399);
	const intptr_t attachments = (const intptr_t)attachmentsAddress;
	UNUSED_PARAM(clazz)
	glInvalidateFramebuffer(target, numAttachments, attachments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglInvalidateSubFramebuffer__IIJIIII(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress, jint x, jint y, jint width, jint height) {
	glInvalidateSubFramebufferPROC glInvalidateSubFramebuffer = (glInvalidateSubFramebufferPROC)tlsGetFunction(400);
	const intptr_t attachments = (const intptr_t)attachmentsAddress;
	UNUSED_PARAM(clazz)
	glInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glTexStorage2D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height) {
	glTexStorage2DPROC glTexStorage2D = (glTexStorage2DPROC)tlsGetFunction(666);
	UNUSED_PARAM(clazz)
	glTexStorage2D(target, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_glTexStorage3D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jint depth) {
	glTexStorage3DPROC glTexStorage3D = (glTexStorage3DPROC)tlsGetFunction(669);
	UNUSED_PARAM(clazz)
	glTexStorage3D(target, levels, internalformat, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES30_nglGetInternalformativ__IIIIJ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint pname, jint bufSize, jlong paramsAddress) {
	glGetInternalformativPROC glGetInternalformativ = (glGetInternalformativPROC)tlsGetFunction(293);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetInternalformativ(target, internalformat, pname, bufSize, params);
}

EXTERN_C_EXIT
