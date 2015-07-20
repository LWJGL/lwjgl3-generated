/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glClipControlPROC) (GLenum, GLenum);
typedef void (APIENTRY *glCreateTransformFeedbacksPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glTransformFeedbackBufferBasePROC) (GLuint, GLuint, GLuint);
typedef void (APIENTRY *glTransformFeedbackBufferRangePROC) (GLuint, GLuint, GLuint, GLintptr, GLsizeiptr);
typedef void (APIENTRY *glGetTransformFeedbackivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetTransformFeedbacki_vPROC) (GLuint, GLenum, GLuint, GLint *);
typedef void (APIENTRY *glGetTransformFeedbacki64_vPROC) (GLuint, GLenum, GLuint, GLint64 *);
typedef void (APIENTRY *glCreateBuffersPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glNamedBufferStoragePROC) (GLuint, GLsizeiptr, const void *, GLbitfield);
typedef void (APIENTRY *glNamedBufferDataPROC) (GLuint, GLsizeiptr, const void *, GLenum);
typedef void (APIENTRY *glNamedBufferSubDataPROC) (GLuint, GLintptr, GLsizeiptr, const void *);
typedef void (APIENTRY *glCopyNamedBufferSubDataPROC) (GLuint, GLuint, GLintptr, GLintptr, GLsizeiptr);
typedef void (APIENTRY *glClearNamedBufferDataPROC) (GLuint, GLenum, GLenum, GLenum, const void *);
typedef void (APIENTRY *glClearNamedBufferSubDataPROC) (GLuint, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, const void *);
typedef void * (APIENTRY *glMapNamedBufferPROC) (GLuint, GLenum);
typedef void * (APIENTRY *glMapNamedBufferRangePROC) (GLuint, GLintptr, GLsizeiptr, GLbitfield);
typedef GLboolean (APIENTRY *glUnmapNamedBufferPROC) (GLuint);
typedef void (APIENTRY *glFlushMappedNamedBufferRangePROC) (GLuint, GLintptr, GLsizeiptr);
typedef void (APIENTRY *glGetNamedBufferParameterivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetNamedBufferParameteri64vPROC) (GLuint, GLenum, GLint64 *);
typedef void (APIENTRY *glGetNamedBufferPointervPROC) (GLuint, GLenum, void **);
typedef void (APIENTRY *glGetNamedBufferSubDataPROC) (GLuint, GLintptr, GLsizeiptr, void *);
typedef void (APIENTRY *glCreateFramebuffersPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glNamedFramebufferRenderbufferPROC) (GLuint, GLenum, GLenum, GLuint);
typedef void (APIENTRY *glNamedFramebufferParameteriPROC) (GLuint, GLenum, GLint);
typedef void (APIENTRY *glNamedFramebufferTexturePROC) (GLuint, GLenum, GLuint, GLint);
typedef void (APIENTRY *glNamedFramebufferTextureLayerPROC) (GLuint, GLenum, GLuint, GLint, GLint);
typedef void (APIENTRY *glNamedFramebufferDrawBufferPROC) (GLuint, GLenum);
typedef void (APIENTRY *glNamedFramebufferDrawBuffersPROC) (GLuint, GLsizei, const GLenum *);
typedef void (APIENTRY *glNamedFramebufferReadBufferPROC) (GLuint, GLenum);
typedef void (APIENTRY *glInvalidateNamedFramebufferDataPROC) (GLuint, GLsizei, const GLenum *);
typedef void (APIENTRY *glInvalidateNamedFramebufferSubDataPROC) (GLuint, GLsizei, const GLenum *, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glClearNamedFramebufferivPROC) (GLuint, GLenum, GLint, GLint *);
typedef void (APIENTRY *glClearNamedFramebufferuivPROC) (GLuint, GLenum, GLint, GLint *);
typedef void (APIENTRY *glClearNamedFramebufferfvPROC) (GLuint, GLenum, GLint, GLfloat *);
typedef void (APIENTRY *glClearNamedFramebufferfiPROC) (GLuint, GLenum, GLfloat, GLint);
typedef void (APIENTRY *glBlitNamedFramebufferPROC) (GLuint, GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum);
typedef GLenum (APIENTRY *glCheckNamedFramebufferStatusPROC) (GLuint, GLenum);
typedef void (APIENTRY *glGetNamedFramebufferParameterivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetNamedFramebufferAttachmentParameterivPROC) (GLuint, GLenum, GLenum, GLint *);
typedef void (APIENTRY *glCreateRenderbuffersPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glNamedRenderbufferStoragePROC) (GLuint, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glNamedRenderbufferStorageMultisamplePROC) (GLuint, GLsizei, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glGetNamedRenderbufferParameterivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glCreateTexturesPROC) (GLenum, GLsizei, GLuint *);
typedef void (APIENTRY *glTextureBufferPROC) (GLuint, GLenum, GLuint);
typedef void (APIENTRY *glTextureBufferRangePROC) (GLuint, GLenum, GLuint, GLintptr, GLsizeiptr);
typedef void (APIENTRY *glTextureStorage1DPROC) (GLuint, GLsizei, GLenum, GLsizei);
typedef void (APIENTRY *glTextureStorage2DPROC) (GLuint, GLsizei, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glTextureStorage3DPROC) (GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei);
typedef void (APIENTRY *glTextureStorage2DMultisamplePROC) (GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLboolean);
typedef void (APIENTRY *glTextureStorage3DMultisamplePROC) (GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean);
typedef void (APIENTRY *glTextureSubImage1DPROC) (GLuint, GLint, GLint, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glTextureSubImage2DPROC) (GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glTextureSubImage3DPROC) (GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glCompressedTextureSubImage1DPROC) (GLuint, GLint, GLint, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTextureSubImage2DPROC) (GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTextureSubImage3DPROC) (GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glCopyTextureSubImage1DPROC) (GLuint, GLint, GLint, GLint, GLint, GLsizei);
typedef void (APIENTRY *glCopyTextureSubImage2DPROC) (GLuint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glCopyTextureSubImage3DPROC) (GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glTextureParameterfPROC) (GLuint, GLenum, GLfloat);
typedef void (APIENTRY *glTextureParameterfvPROC) (GLuint, GLenum, const GLfloat *);
typedef void (APIENTRY *glTextureParameteriPROC) (GLuint, GLenum, GLint);
typedef void (APIENTRY *glTextureParameterIivPROC) (GLuint, GLenum, const GLint *);
typedef void (APIENTRY *glTextureParameterIuivPROC) (GLuint, GLenum, const GLuint *);
typedef void (APIENTRY *glTextureParameterivPROC) (GLuint, GLenum, const GLint *);
typedef void (APIENTRY *glGenerateTextureMipmapPROC) (GLuint);
typedef void (APIENTRY *glBindTextureUnitPROC) (GLuint, GLuint);
typedef void (APIENTRY *glGetTextureImagePROC) (GLuint, GLint, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetCompressedTextureImagePROC) (GLuint, GLint, GLsizei, void *);
typedef void (APIENTRY *glGetTextureLevelParameterfvPROC) (GLuint, GLint, GLenum, GLfloat *);
typedef void (APIENTRY *glGetTextureLevelParameterivPROC) (GLuint, GLint, GLenum, GLint *);
typedef void (APIENTRY *glGetTextureParameterfvPROC) (GLuint, GLenum, GLfloat *);
typedef void (APIENTRY *glGetTextureParameterIivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetTextureParameterIuivPROC) (GLuint, GLenum, GLuint *);
typedef void (APIENTRY *glGetTextureParameterivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glCreateVertexArraysPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glDisableVertexArrayAttribPROC) (GLuint, GLuint);
typedef void (APIENTRY *glEnableVertexArrayAttribPROC) (GLuint, GLuint);
typedef void (APIENTRY *glVertexArrayElementBufferPROC) (GLuint, GLuint);
typedef void (APIENTRY *glVertexArrayVertexBufferPROC) (GLuint, GLuint, GLuint, GLintptr, GLsizei);
typedef void (APIENTRY *glVertexArrayVertexBuffersPROC) (GLuint, GLuint, GLsizei, const GLuint *, const GLintptr *, const GLsizei *);
typedef void (APIENTRY *glVertexArrayAttribFormatPROC) (GLuint, GLuint, GLint, GLenum, GLboolean, GLuint);
typedef void (APIENTRY *glVertexArrayAttribIFormatPROC) (GLuint, GLuint, GLint, GLenum, GLuint);
typedef void (APIENTRY *glVertexArrayAttribLFormatPROC) (GLuint, GLuint, GLint, GLenum, GLuint);
typedef void (APIENTRY *glVertexArrayAttribBindingPROC) (GLuint, GLuint, GLuint);
typedef void (APIENTRY *glVertexArrayBindingDivisorPROC) (GLuint, GLuint, GLuint);
typedef void (APIENTRY *glGetVertexArrayivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetVertexArrayIndexedivPROC) (GLuint, GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetVertexArrayIndexed64ivPROC) (GLuint, GLuint, GLenum, GLint64 *);
typedef void (APIENTRY *glCreateSamplersPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glCreateProgramPipelinesPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glCreateQueriesPROC) (GLenum, GLsizei, GLuint *);
typedef void (APIENTRY *glGetQueryBufferObjectivPROC) (GLuint, GLuint, GLenum, GLintptr);
typedef void (APIENTRY *glGetQueryBufferObjectuivPROC) (GLuint, GLuint, GLenum, GLintptr);
typedef void (APIENTRY *glGetQueryBufferObjecti64vPROC) (GLuint, GLuint, GLenum, GLintptr);
typedef void (APIENTRY *glGetQueryBufferObjectui64vPROC) (GLuint, GLuint, GLenum, GLintptr);
typedef void (APIENTRY *glMemoryBarrierByRegionPROC) (GLbitfield);
typedef void (APIENTRY *glGetTextureSubImagePROC) (GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetCompressedTextureSubImagePROC) (GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLsizei, void *);
typedef void (APIENTRY *glTextureBarrierPROC) (void);
typedef GLenum (APIENTRY *glGetGraphicsResetStatusPROC) (void);
typedef void (APIENTRY *glGetnMapdvPROC) (GLenum, GLenum, GLsizei, GLdouble *);
typedef void (APIENTRY *glGetnMapfvPROC) (GLenum, GLenum, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnMapivPROC) (GLenum, GLenum, GLsizei, GLint *);
typedef void (APIENTRY *glGetnPixelMapfvPROC) (GLenum, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnPixelMapuivPROC) (GLenum, GLsizei, GLuint *);
typedef void (APIENTRY *glGetnPixelMapusvPROC) (GLenum, GLsizei, GLushort *);
typedef void (APIENTRY *glGetnPolygonStipplePROC) (GLsizei, GLubyte *);
typedef void (APIENTRY *glGetnTexImagePROC) (GLenum, GLint, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glReadnPixelsPROC) (GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnColorTablePROC) (GLenum, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnConvolutionFilterPROC) (GLenum, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnSeparableFilterPROC) (GLenum, GLenum, GLenum, GLsizei, void *, GLsizei, void *, void *);
typedef void (APIENTRY *glGetnHistogramPROC) (GLenum, GLboolean, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnMinmaxPROC) (GLenum, GLboolean, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnCompressedTexImagePROC) (GLenum, GLint, GLsizei, void *);
typedef void (APIENTRY *glGetnUniformfvPROC) (GLuint, GLint, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnUniformdvPROC) (GLuint, GLint, GLsizei, GLdouble *);
typedef void (APIENTRY *glGetnUniformivPROC) (GLuint, GLint, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnUniformuivPROC) (GLuint, GLint, GLsizei, GLfloat *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglClipControl(JNIEnv *__env, jclass clazz, jint origin, jint depth, jlong __functionAddress) {
	glClipControlPROC glClipControl = (glClipControlPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClipControl(origin, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCreateTransformFeedbacks(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	glCreateTransformFeedbacksPROC glCreateTransformFeedbacks = (glCreateTransformFeedbacksPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreateTransformFeedbacks(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTransformFeedbackBufferBase(JNIEnv *__env, jclass clazz, jint xfb, jint index, jint buffer, jlong __functionAddress) {
	glTransformFeedbackBufferBasePROC glTransformFeedbackBufferBase = (glTransformFeedbackBufferBasePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTransformFeedbackBufferBase(xfb, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTransformFeedbackBufferRange(JNIEnv *__env, jclass clazz, jint xfb, jint index, jint buffer, jlong offset, jlong size, jlong __functionAddress) {
	glTransformFeedbackBufferRangePROC glTransformFeedbackBufferRange = (glTransformFeedbackBufferRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTransformFeedbackBufferRange(xfb, index, buffer, (GLintptr)offset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetTransformFeedbackiv(JNIEnv *__env, jclass clazz, jint xfb, jint pname, jlong paramAddress, jlong __functionAddress) {
	GLint *param = (GLint *)(intptr_t)paramAddress;
	glGetTransformFeedbackivPROC glGetTransformFeedbackiv = (glGetTransformFeedbackivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTransformFeedbackiv(xfb, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetTransformFeedbacki_1v(JNIEnv *__env, jclass clazz, jint xfb, jint pname, jint index, jlong paramAddress, jlong __functionAddress) {
	GLint *param = (GLint *)(intptr_t)paramAddress;
	glGetTransformFeedbacki_vPROC glGetTransformFeedbacki_v = (glGetTransformFeedbacki_vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTransformFeedbacki_v(xfb, pname, index, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetTransformFeedbacki64_1v(JNIEnv *__env, jclass clazz, jint xfb, jint pname, jint index, jlong paramAddress, jlong __functionAddress) {
	GLint64 *param = (GLint64 *)(intptr_t)paramAddress;
	glGetTransformFeedbacki64_vPROC glGetTransformFeedbacki64_v = (glGetTransformFeedbacki64_vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTransformFeedbacki64_v(xfb, pname, index, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCreateBuffers(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress, jlong __functionAddress) {
	GLuint *buffers = (GLuint *)(intptr_t)buffersAddress;
	glCreateBuffersPROC glCreateBuffers = (glCreateBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreateBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedBufferStorage(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint flags, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glNamedBufferStoragePROC glNamedBufferStorage = (glNamedBufferStoragePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedBufferStorage(buffer, (GLsizeiptr)size, data, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedBufferData(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint usage, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glNamedBufferDataPROC glNamedBufferData = (glNamedBufferDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedBufferData(buffer, (GLsizeiptr)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedBufferSubData(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glNamedBufferSubDataPROC glNamedBufferSubData = (glNamedBufferSubDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedBufferSubData(buffer, (GLintptr)offset, (GLsizeiptr)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCopyNamedBufferSubData(JNIEnv *__env, jclass clazz, jint readBuffer, jint writeBuffer, jlong readOffset, jlong writeOffset, jlong size, jlong __functionAddress) {
	glCopyNamedBufferSubDataPROC glCopyNamedBufferSubData = (glCopyNamedBufferSubDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyNamedBufferSubData(readBuffer, writeBuffer, (GLintptr)readOffset, (GLintptr)writeOffset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglClearNamedBufferData(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jint format, jint type, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glClearNamedBufferDataPROC glClearNamedBufferData = (glClearNamedBufferDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearNamedBufferData(buffer, internalformat, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglClearNamedBufferSubData(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jlong offset, jlong size, jint format, jint type, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glClearNamedBufferSubDataPROC glClearNamedBufferSubData = (glClearNamedBufferSubDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearNamedBufferSubData(buffer, internalformat, (GLintptr)offset, (GLsizeiptr)size, format, type, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL45_nglMapNamedBuffer(JNIEnv *__env, jclass clazz, jint buffer, jint access, jlong __functionAddress) {
	glMapNamedBufferPROC glMapNamedBuffer = (glMapNamedBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glMapNamedBuffer(buffer, access);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL45_nglMapNamedBufferRange(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length, jint access, jlong __functionAddress) {
	glMapNamedBufferRangePROC glMapNamedBufferRange = (glMapNamedBufferRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glMapNamedBufferRange(buffer, (GLintptr)offset, (GLsizeiptr)length, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL45_nglUnmapNamedBuffer(JNIEnv *__env, jclass clazz, jint buffer, jlong __functionAddress) {
	glUnmapNamedBufferPROC glUnmapNamedBuffer = (glUnmapNamedBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glUnmapNamedBuffer(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglFlushMappedNamedBufferRange(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length, jlong __functionAddress) {
	glFlushMappedNamedBufferRangePROC glFlushMappedNamedBufferRange = (glFlushMappedNamedBufferRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFlushMappedNamedBufferRange(buffer, (GLintptr)offset, (GLsizeiptr)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetNamedBufferParameteriv(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetNamedBufferParameterivPROC glGetNamedBufferParameteriv = (glGetNamedBufferParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedBufferParameteriv(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetNamedBufferParameteri64v(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint64 *params = (GLint64 *)(intptr_t)paramsAddress;
	glGetNamedBufferParameteri64vPROC glGetNamedBufferParameteri64v = (glGetNamedBufferParameteri64vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedBufferParameteri64v(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetNamedBufferPointerv(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress, jlong __functionAddress) {
	void **params = (void **)(intptr_t)paramsAddress;
	glGetNamedBufferPointervPROC glGetNamedBufferPointerv = (glGetNamedBufferPointervPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedBufferPointerv(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetNamedBufferSubData(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress, jlong __functionAddress) {
	void *data = (void *)(intptr_t)dataAddress;
	glGetNamedBufferSubDataPROC glGetNamedBufferSubData = (glGetNamedBufferSubDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedBufferSubData(buffer, (GLintptr)offset, (GLsizeiptr)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCreateFramebuffers(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress, jlong __functionAddress) {
	GLuint *framebuffers = (GLuint *)(intptr_t)framebuffersAddress;
	glCreateFramebuffersPROC glCreateFramebuffers = (glCreateFramebuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreateFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedFramebufferRenderbuffer(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint renderbuffertarget, jint renderbuffer, jlong __functionAddress) {
	glNamedFramebufferRenderbufferPROC glNamedFramebufferRenderbuffer = (glNamedFramebufferRenderbufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedFramebufferParameteri(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jint param, jlong __functionAddress) {
	glNamedFramebufferParameteriPROC glNamedFramebufferParameteri = (glNamedFramebufferParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferParameteri(framebuffer, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedFramebufferTexture(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level, jlong __functionAddress) {
	glNamedFramebufferTexturePROC glNamedFramebufferTexture = (glNamedFramebufferTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferTexture(framebuffer, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedFramebufferTextureLayer(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level, jint layer, jlong __functionAddress) {
	glNamedFramebufferTextureLayerPROC glNamedFramebufferTextureLayer = (glNamedFramebufferTextureLayerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedFramebufferDrawBuffer(JNIEnv *__env, jclass clazz, jint framebuffer, jint buf, jlong __functionAddress) {
	glNamedFramebufferDrawBufferPROC glNamedFramebufferDrawBuffer = (glNamedFramebufferDrawBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferDrawBuffer(framebuffer, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedFramebufferDrawBuffers(JNIEnv *__env, jclass clazz, jint framebuffer, jint n, jlong bufsAddress, jlong __functionAddress) {
	const GLenum *bufs = (const GLenum *)(intptr_t)bufsAddress;
	glNamedFramebufferDrawBuffersPROC glNamedFramebufferDrawBuffers = (glNamedFramebufferDrawBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferDrawBuffers(framebuffer, n, bufs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedFramebufferReadBuffer(JNIEnv *__env, jclass clazz, jint framebuffer, jint src, jlong __functionAddress) {
	glNamedFramebufferReadBufferPROC glNamedFramebufferReadBuffer = (glNamedFramebufferReadBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferReadBuffer(framebuffer, src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglInvalidateNamedFramebufferData(JNIEnv *__env, jclass clazz, jint framebuffer, jint numAttachments, jlong attachmentsAddress, jlong __functionAddress) {
	const GLenum *attachments = (const GLenum *)(intptr_t)attachmentsAddress;
	glInvalidateNamedFramebufferDataPROC glInvalidateNamedFramebufferData = (glInvalidateNamedFramebufferDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glInvalidateNamedFramebufferData(framebuffer, numAttachments, attachments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglInvalidateNamedFramebufferSubData(JNIEnv *__env, jclass clazz, jint framebuffer, jint numAttachments, jlong attachmentsAddress, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	const GLenum *attachments = (const GLenum *)(intptr_t)attachmentsAddress;
	glInvalidateNamedFramebufferSubDataPROC glInvalidateNamedFramebufferSubData = (glInvalidateNamedFramebufferSubDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glInvalidateNamedFramebufferSubData(framebuffer, numAttachments, attachments, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglClearNamedFramebufferiv(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jint drawbuffer, jlong valueAddress, jlong __functionAddress) {
	GLint *value = (GLint *)(intptr_t)valueAddress;
	glClearNamedFramebufferivPROC glClearNamedFramebufferiv = (glClearNamedFramebufferivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglClearNamedFramebufferuiv(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jint drawbuffer, jlong valueAddress, jlong __functionAddress) {
	GLint *value = (GLint *)(intptr_t)valueAddress;
	glClearNamedFramebufferuivPROC glClearNamedFramebufferuiv = (glClearNamedFramebufferuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglClearNamedFramebufferfv(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jint drawbuffer, jlong valueAddress, jlong __functionAddress) {
	GLfloat *value = (GLfloat *)(intptr_t)valueAddress;
	glClearNamedFramebufferfvPROC glClearNamedFramebufferfv = (glClearNamedFramebufferfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglClearNamedFramebufferfi(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jfloat depth, jint stencil, jlong __functionAddress) {
	glClearNamedFramebufferfiPROC glClearNamedFramebufferfi = (glClearNamedFramebufferfiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearNamedFramebufferfi(framebuffer, buffer, depth, stencil);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglBlitNamedFramebuffer(JNIEnv *__env, jclass clazz, jint readFramebuffer, jint drawFramebuffer, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter, jlong __functionAddress) {
	glBlitNamedFramebufferPROC glBlitNamedFramebuffer = (glBlitNamedFramebufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL45_nglCheckNamedFramebufferStatus(JNIEnv *__env, jclass clazz, jint framebuffer, jint target, jlong __functionAddress) {
	glCheckNamedFramebufferStatusPROC glCheckNamedFramebufferStatus = (glCheckNamedFramebufferStatusPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCheckNamedFramebufferStatus(framebuffer, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetNamedFramebufferParameteriv(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetNamedFramebufferParameterivPROC glGetNamedFramebufferParameteriv = (glGetNamedFramebufferParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedFramebufferParameteriv(framebuffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetNamedFramebufferAttachmentParameteriv(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetNamedFramebufferAttachmentParameterivPROC glGetNamedFramebufferAttachmentParameteriv = (glGetNamedFramebufferAttachmentParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCreateRenderbuffers(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress, jlong __functionAddress) {
	GLuint *renderbuffers = (GLuint *)(intptr_t)renderbuffersAddress;
	glCreateRenderbuffersPROC glCreateRenderbuffers = (glCreateRenderbuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreateRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedRenderbufferStorage(JNIEnv *__env, jclass clazz, jint renderbuffer, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glNamedRenderbufferStoragePROC glNamedRenderbufferStorage = (glNamedRenderbufferStoragePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedRenderbufferStorage(renderbuffer, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglNamedRenderbufferStorageMultisample(JNIEnv *__env, jclass clazz, jint renderbuffer, jint samples, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glNamedRenderbufferStorageMultisamplePROC glNamedRenderbufferStorageMultisample = (glNamedRenderbufferStorageMultisamplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetNamedRenderbufferParameteriv(JNIEnv *__env, jclass clazz, jint renderbuffer, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetNamedRenderbufferParameterivPROC glGetNamedRenderbufferParameteriv = (glGetNamedRenderbufferParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCreateTextures(JNIEnv *__env, jclass clazz, jint target, jint n, jlong texturesAddress, jlong __functionAddress) {
	GLuint *textures = (GLuint *)(intptr_t)texturesAddress;
	glCreateTexturesPROC glCreateTextures = (glCreateTexturesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreateTextures(target, n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureBuffer(JNIEnv *__env, jclass clazz, jint texture, jint internalformat, jint buffer, jlong __functionAddress) {
	glTextureBufferPROC glTextureBuffer = (glTextureBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureBuffer(texture, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureBufferRange(JNIEnv *__env, jclass clazz, jint texture, jint internalformat, jint buffer, jlong offset, jlong size, jlong __functionAddress) {
	glTextureBufferRangePROC glTextureBufferRange = (glTextureBufferRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureBufferRange(texture, internalformat, buffer, (GLintptr)offset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureStorage1D(JNIEnv *__env, jclass clazz, jint texture, jint levels, jint internalformat, jint width, jlong __functionAddress) {
	glTextureStorage1DPROC glTextureStorage1D = (glTextureStorage1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureStorage1D(texture, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureStorage2D(JNIEnv *__env, jclass clazz, jint texture, jint levels, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glTextureStorage2DPROC glTextureStorage2D = (glTextureStorage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureStorage2D(texture, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureStorage3D(JNIEnv *__env, jclass clazz, jint texture, jint levels, jint internalformat, jint width, jint height, jint depth, jlong __functionAddress) {
	glTextureStorage3DPROC glTextureStorage3D = (glTextureStorage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureStorage3D(texture, levels, internalformat, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureStorage2DMultisample(JNIEnv *__env, jclass clazz, jint texture, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations, jlong __functionAddress) {
	glTextureStorage2DMultisamplePROC glTextureStorage2DMultisample = (glTextureStorage2DMultisamplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureStorage3DMultisample(JNIEnv *__env, jclass clazz, jint texture, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations, jlong __functionAddress) {
	glTextureStorage3DMultisamplePROC glTextureStorage3DMultisample = (glTextureStorage3DMultisamplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureSubImage1D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTextureSubImage1DPROC glTextureSubImage1D = (glTextureSubImage1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureSubImage2D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTextureSubImage2DPROC glTextureSubImage2D = (glTextureSubImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureSubImage3D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTextureSubImage3DPROC glTextureSubImage3D = (glTextureSubImage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCompressedTextureSubImage1D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint width, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTextureSubImage1DPROC glCompressedTextureSubImage1D = (glCompressedTextureSubImage1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCompressedTextureSubImage2D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTextureSubImage2DPROC glCompressedTextureSubImage2D = (glCompressedTextureSubImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCompressedTextureSubImage3D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTextureSubImage3DPROC glCompressedTextureSubImage3D = (glCompressedTextureSubImage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCopyTextureSubImage1D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint x, jint y, jint width, jlong __functionAddress) {
	glCopyTextureSubImage1DPROC glCopyTextureSubImage1D = (glCopyTextureSubImage1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTextureSubImage1D(texture, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCopyTextureSubImage2D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyTextureSubImage2DPROC glCopyTextureSubImage2D = (glCopyTextureSubImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCopyTextureSubImage3D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyTextureSubImage3DPROC glCopyTextureSubImage3D = (glCopyTextureSubImage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureParameterf(JNIEnv *__env, jclass clazz, jint texture, jint pname, jfloat param, jlong __functionAddress) {
	glTextureParameterfPROC glTextureParameterf = (glTextureParameterfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameterf(texture, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureParameterfv(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glTextureParameterfvPROC glTextureParameterfv = (glTextureParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameterfv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureParameteri(JNIEnv *__env, jclass clazz, jint texture, jint pname, jint param, jlong __functionAddress) {
	glTextureParameteriPROC glTextureParameteri = (glTextureParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameteri(texture, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureParameterIiv(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glTextureParameterIivPROC glTextureParameterIiv = (glTextureParameterIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameterIiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureParameterIuiv(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *params = (const GLuint *)(intptr_t)paramsAddress;
	glTextureParameterIuivPROC glTextureParameterIuiv = (glTextureParameterIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameterIuiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureParameteriv(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glTextureParameterivPROC glTextureParameteriv = (glTextureParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameteriv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGenerateTextureMipmap(JNIEnv *__env, jclass clazz, jint texture, jlong __functionAddress) {
	glGenerateTextureMipmapPROC glGenerateTextureMipmap = (glGenerateTextureMipmapPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenerateTextureMipmap(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglBindTextureUnit(JNIEnv *__env, jclass clazz, jint unit, jint texture, jlong __functionAddress) {
	glBindTextureUnitPROC glBindTextureUnit = (glBindTextureUnitPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindTextureUnit(unit, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetTextureImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jint format, jint type, jint bufSize, jlong pixelsAddress, jlong __functionAddress) {
	void *pixels = (void *)(intptr_t)pixelsAddress;
	glGetTextureImagePROC glGetTextureImage = (glGetTextureImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureImage(texture, level, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetCompressedTextureImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jint bufSize, jlong pixelsAddress, jlong __functionAddress) {
	void *pixels = (void *)(intptr_t)pixelsAddress;
	glGetCompressedTextureImagePROC glGetCompressedTextureImage = (glGetCompressedTextureImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetCompressedTextureImage(texture, level, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetTextureLevelParameterfv(JNIEnv *__env, jclass clazz, jint texture, jint level, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetTextureLevelParameterfvPROC glGetTextureLevelParameterfv = (glGetTextureLevelParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureLevelParameterfv(texture, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetTextureLevelParameteriv(JNIEnv *__env, jclass clazz, jint texture, jint level, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTextureLevelParameterivPROC glGetTextureLevelParameteriv = (glGetTextureLevelParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureLevelParameteriv(texture, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetTextureParameterfv(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetTextureParameterfvPROC glGetTextureParameterfv = (glGetTextureParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureParameterfv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetTextureParameterIiv(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTextureParameterIivPROC glGetTextureParameterIiv = (glGetTextureParameterIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureParameterIiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetTextureParameterIuiv(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetTextureParameterIuivPROC glGetTextureParameterIuiv = (glGetTextureParameterIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureParameterIuiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetTextureParameteriv(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTextureParameterivPROC glGetTextureParameteriv = (glGetTextureParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureParameteriv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCreateVertexArrays(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress, jlong __functionAddress) {
	GLuint *arrays = (GLuint *)(intptr_t)arraysAddress;
	glCreateVertexArraysPROC glCreateVertexArrays = (glCreateVertexArraysPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreateVertexArrays(n, arrays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglDisableVertexArrayAttrib(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jlong __functionAddress) {
	glDisableVertexArrayAttribPROC glDisableVertexArrayAttrib = (glDisableVertexArrayAttribPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableVertexArrayAttrib(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglEnableVertexArrayAttrib(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jlong __functionAddress) {
	glEnableVertexArrayAttribPROC glEnableVertexArrayAttrib = (glEnableVertexArrayAttribPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableVertexArrayAttrib(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglVertexArrayElementBuffer(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jlong __functionAddress) {
	glVertexArrayElementBufferPROC glVertexArrayElementBuffer = (glVertexArrayElementBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayElementBuffer(vaobj, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglVertexArrayVertexBuffer(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint buffer, jlong offset, jint stride, jlong __functionAddress) {
	glVertexArrayVertexBufferPROC glVertexArrayVertexBuffer = (glVertexArrayVertexBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexBuffer(vaobj, bindingindex, buffer, (GLintptr)offset, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglVertexArrayVertexBuffers(JNIEnv *__env, jclass clazz, jint vaobj, jint first, jint count, jlong buffersAddress, jlong offsetsAddress, jlong stridesAddress, jlong __functionAddress) {
	const GLuint *buffers = (const GLuint *)(intptr_t)buffersAddress;
	const GLintptr *offsets = (const GLintptr *)(intptr_t)offsetsAddress;
	const GLsizei *strides = (const GLsizei *)(intptr_t)stridesAddress;
	glVertexArrayVertexBuffersPROC glVertexArrayVertexBuffers = (glVertexArrayVertexBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexBuffers(vaobj, first, count, buffers, offsets, strides);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglVertexArrayAttribFormat(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset, jlong __functionAddress) {
	glVertexArrayAttribFormatPROC glVertexArrayAttribFormat = (glVertexArrayAttribFormatPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglVertexArrayAttribIFormat(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset, jlong __functionAddress) {
	glVertexArrayAttribIFormatPROC glVertexArrayAttribIFormat = (glVertexArrayAttribIFormatPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglVertexArrayAttribLFormat(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset, jlong __functionAddress) {
	glVertexArrayAttribLFormatPROC glVertexArrayAttribLFormat = (glVertexArrayAttribLFormatPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglVertexArrayAttribBinding(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint bindingindex, jlong __functionAddress) {
	glVertexArrayAttribBindingPROC glVertexArrayAttribBinding = (glVertexArrayAttribBindingPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayAttribBinding(vaobj, attribindex, bindingindex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglVertexArrayBindingDivisor(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint divisor, jlong __functionAddress) {
	glVertexArrayBindingDivisorPROC glVertexArrayBindingDivisor = (glVertexArrayBindingDivisorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayBindingDivisor(vaobj, bindingindex, divisor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetVertexArrayiv(JNIEnv *__env, jclass clazz, jint vaobj, jint pname, jlong paramAddress, jlong __functionAddress) {
	GLint *param = (GLint *)(intptr_t)paramAddress;
	glGetVertexArrayivPROC glGetVertexArrayiv = (glGetVertexArrayivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexArrayiv(vaobj, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetVertexArrayIndexediv(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress, jlong __functionAddress) {
	GLint *param = (GLint *)(intptr_t)paramAddress;
	glGetVertexArrayIndexedivPROC glGetVertexArrayIndexediv = (glGetVertexArrayIndexedivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexArrayIndexediv(vaobj, index, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetVertexArrayIndexed64iv(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress, jlong __functionAddress) {
	GLint64 *param = (GLint64 *)(intptr_t)paramAddress;
	glGetVertexArrayIndexed64ivPROC glGetVertexArrayIndexed64iv = (glGetVertexArrayIndexed64ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCreateSamplers(JNIEnv *__env, jclass clazz, jint n, jlong samplersAddress, jlong __functionAddress) {
	GLuint *samplers = (GLuint *)(intptr_t)samplersAddress;
	glCreateSamplersPROC glCreateSamplers = (glCreateSamplersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreateSamplers(n, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCreateProgramPipelines(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress, jlong __functionAddress) {
	GLuint *pipelines = (GLuint *)(intptr_t)pipelinesAddress;
	glCreateProgramPipelinesPROC glCreateProgramPipelines = (glCreateProgramPipelinesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreateProgramPipelines(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglCreateQueries(JNIEnv *__env, jclass clazz, jint target, jint n, jlong idsAddress, jlong __functionAddress) {
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	glCreateQueriesPROC glCreateQueries = (glCreateQueriesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreateQueries(target, n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetQueryBufferObjectiv(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset, jlong __functionAddress) {
	glGetQueryBufferObjectivPROC glGetQueryBufferObjectiv = (glGetQueryBufferObjectivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryBufferObjectiv(id, buffer, pname, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetQueryBufferObjectuiv(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset, jlong __functionAddress) {
	glGetQueryBufferObjectuivPROC glGetQueryBufferObjectuiv = (glGetQueryBufferObjectuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryBufferObjectuiv(id, buffer, pname, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetQueryBufferObjecti64v(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset, jlong __functionAddress) {
	glGetQueryBufferObjecti64vPROC glGetQueryBufferObjecti64v = (glGetQueryBufferObjecti64vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryBufferObjecti64v(id, buffer, pname, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetQueryBufferObjectui64v(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset, jlong __functionAddress) {
	glGetQueryBufferObjectui64vPROC glGetQueryBufferObjectui64v = (glGetQueryBufferObjectui64vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryBufferObjectui64v(id, buffer, pname, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglMemoryBarrierByRegion(JNIEnv *__env, jclass clazz, jint barriers, jlong __functionAddress) {
	glMemoryBarrierByRegionPROC glMemoryBarrierByRegion = (glMemoryBarrierByRegionPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMemoryBarrierByRegion(barriers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetTextureSubImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jint bufSize, jlong pixelsAddress, jlong __functionAddress) {
	void *pixels = (void *)(intptr_t)pixelsAddress;
	glGetTextureSubImagePROC glGetTextureSubImage = (glGetTextureSubImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetCompressedTextureSubImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint bufSize, jlong pixelsAddress, jlong __functionAddress) {
	void *pixels = (void *)(intptr_t)pixelsAddress;
	glGetCompressedTextureSubImagePROC glGetCompressedTextureSubImage = (glGetCompressedTextureSubImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglTextureBarrier(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glTextureBarrierPROC glTextureBarrier = (glTextureBarrierPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureBarrier();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL45_nglGetGraphicsResetStatus(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glGetGraphicsResetStatusPROC glGetGraphicsResetStatus = (glGetGraphicsResetStatusPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetGraphicsResetStatus();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMapdv(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLdouble *data = (GLdouble *)(intptr_t)dataAddress;
	glGetnMapdvPROC glGetnMapdv = (glGetnMapdvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnMapdv(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMapfv(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetnMapfvPROC glGetnMapfv = (glGetnMapfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnMapfv(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMapiv(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetnMapivPROC glGetnMapiv = (glGetnMapivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnMapiv(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPixelMapfv(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetnPixelMapfvPROC glGetnPixelMapfv = (glGetnPixelMapfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnPixelMapfv(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPixelMapuiv(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLuint *data = (GLuint *)(intptr_t)dataAddress;
	glGetnPixelMapuivPROC glGetnPixelMapuiv = (glGetnPixelMapuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnPixelMapuiv(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPixelMapusv(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress, jlong __functionAddress) {
	GLushort *data = (GLushort *)(intptr_t)dataAddress;
	glGetnPixelMapusvPROC glGetnPixelMapusv = (glGetnPixelMapusvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnPixelMapusv(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPolygonStipple(JNIEnv *__env, jclass clazz, jint bufSize, jlong patternAddress, jlong __functionAddress) {
	GLubyte *pattern = (GLubyte *)(intptr_t)patternAddress;
	glGetnPolygonStipplePROC glGetnPolygonStipple = (glGetnPolygonStipplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnPolygonStipple(bufSize, pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnTexImage(JNIEnv *__env, jclass clazz, jint tex, jint level, jint format, jint type, jint bufSize, jlong imgAddress, jlong __functionAddress) {
	void *img = (void *)(intptr_t)imgAddress;
	glGetnTexImagePROC glGetnTexImage = (glGetnTexImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnTexImage(tex, level, format, type, bufSize, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglReadnPixels(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong pixelsAddress, jlong __functionAddress) {
	void *pixels = (void *)(intptr_t)pixelsAddress;
	glReadnPixelsPROC glReadnPixels = (glReadnPixelsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnColorTable(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint bufSize, jlong tableAddress, jlong __functionAddress) {
	void *table = (void *)(intptr_t)tableAddress;
	glGetnColorTablePROC glGetnColorTable = (glGetnColorTablePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnColorTable(target, format, type, bufSize, table);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnConvolutionFilter(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint bufSize, jlong imageAddress, jlong __functionAddress) {
	void *image = (void *)(intptr_t)imageAddress;
	glGetnConvolutionFilterPROC glGetnConvolutionFilter = (glGetnConvolutionFilterPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnConvolutionFilter(target, format, type, bufSize, image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnSeparableFilter(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint rowBufSize, jlong rowAddress, jint columnBufSize, jlong columnAddress, jlong spanAddress, jlong __functionAddress) {
	void *row = (void *)(intptr_t)rowAddress;
	void *column = (void *)(intptr_t)columnAddress;
	void *span = (void *)(intptr_t)spanAddress;
	glGetnSeparableFilterPROC glGetnSeparableFilter = (glGetnSeparableFilterPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnSeparableFilter(target, format, type, rowBufSize, row, columnBufSize, column, span);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnHistogram(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jint bufSize, jlong valuesAddress, jlong __functionAddress) {
	void *values = (void *)(intptr_t)valuesAddress;
	glGetnHistogramPROC glGetnHistogram = (glGetnHistogramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnHistogram(target, reset, format, type, bufSize, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMinmax(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jint bufSize, jlong valuesAddress, jlong __functionAddress) {
	void *values = (void *)(intptr_t)valuesAddress;
	glGetnMinmaxPROC glGetnMinmax = (glGetnMinmaxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnMinmax(target, reset, format, type, bufSize, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnCompressedTexImage(JNIEnv *__env, jclass clazz, jint target, jint level, jint bufSize, jlong imgAddress, jlong __functionAddress) {
	void *img = (void *)(intptr_t)imgAddress;
	glGetnCompressedTexImagePROC glGetnCompressedTexImage = (glGetnCompressedTexImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnCompressedTexImage(target, level, bufSize, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnUniformfv(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetnUniformfvPROC glGetnUniformfv = (glGetnUniformfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformfv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnUniformdv(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetnUniformdvPROC glGetnUniformdv = (glGetnUniformdvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformdv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnUniformiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetnUniformivPROC glGetnUniformiv = (glGetnUniformivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformiv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnUniformuiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetnUniformuivPROC glGetnUniformuiv = (glGetnUniformuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformuiv(program, location, bufSize, params);
}

EXTERN_C_EXIT
