/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glActiveTexturePROC) (GLenum);
typedef void (APIENTRY *glAttachShaderPROC) (GLuint, GLuint);
typedef void (APIENTRY *glBindAttribLocationPROC) (GLuint, GLuint, const GLchar *);
typedef void (APIENTRY *glBindBufferPROC) (GLenum, GLuint);
typedef void (APIENTRY *glBindFramebufferPROC) (GLenum, GLuint);
typedef void (APIENTRY *glBindRenderbufferPROC) (GLenum, GLuint);
typedef void (APIENTRY *glBindTexturePROC) (GLenum, GLuint);
typedef void (APIENTRY *glBlendColorPROC) (GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glBlendEquationPROC) (GLenum);
typedef void (APIENTRY *glBlendEquationSeparatePROC) (GLenum, GLenum);
typedef void (APIENTRY *glBlendFuncPROC) (GLenum, GLenum);
typedef void (APIENTRY *glBlendFuncSeparatePROC) (GLenum, GLenum, GLenum, GLenum);
typedef void (APIENTRY *glBufferDataPROC) (GLenum, GLsizeiptr, const void *, GLenum);
typedef void (APIENTRY *glBufferSubDataPROC) (GLenum, GLintptr, GLsizeiptr, const void *);
typedef GLenum (APIENTRY *glCheckFramebufferStatusPROC) (GLenum);
typedef void (APIENTRY *glClearPROC) (GLbitfield);
typedef void (APIENTRY *glClearColorPROC) (GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glClearDepthfPROC) (GLfloat);
typedef void (APIENTRY *glClearStencilPROC) (GLint);
typedef void (APIENTRY *glColorMaskPROC) (GLboolean, GLboolean, GLboolean, GLboolean);
typedef void (APIENTRY *glCompileShaderPROC) (GLuint);
typedef void (APIENTRY *glCompressedTexImage2DPROC) (GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTexSubImage2DPROC) (GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glCopyTexImage2DPROC) (GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint);
typedef void (APIENTRY *glCopyTexSubImage2DPROC) (GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef GLuint (APIENTRY *glCreateProgramPROC) (void);
typedef GLuint (APIENTRY *glCreateShaderPROC) (GLenum);
typedef void (APIENTRY *glCullFacePROC) (GLenum);
typedef void (APIENTRY *glDeleteBuffersPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glDeleteFramebuffersPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glDeleteProgramPROC) (GLuint);
typedef void (APIENTRY *glDeleteRenderbuffersPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glDeleteShaderPROC) (GLuint);
typedef void (APIENTRY *glDeleteTexturesPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glDepthFuncPROC) (GLenum);
typedef void (APIENTRY *glDepthMaskPROC) (GLboolean);
typedef void (APIENTRY *glDepthRangefPROC) (GLfloat, GLfloat);
typedef void (APIENTRY *glDetachShaderPROC) (GLuint, GLuint);
typedef void (APIENTRY *glDisablePROC) (GLenum);
typedef void (APIENTRY *glDisableVertexAttribArrayPROC) (GLuint);
typedef void (APIENTRY *glDrawArraysPROC) (GLenum, GLint, GLsizei);
typedef void (APIENTRY *glDrawElementsPROC) (GLenum, GLsizei, GLenum, const void *);
typedef void (APIENTRY *glEnablePROC) (GLenum);
typedef void (APIENTRY *glEnableVertexAttribArrayPROC) (GLuint);
typedef void (APIENTRY *glFinishPROC) (void);
typedef void (APIENTRY *glFlushPROC) (void);
typedef void (APIENTRY *glFramebufferRenderbufferPROC) (GLenum, GLenum, GLenum, GLuint);
typedef void (APIENTRY *glFramebufferTexture2DPROC) (GLenum, GLenum, GLenum, GLuint, GLint);
typedef void (APIENTRY *glFrontFacePROC) (GLenum);
typedef void (APIENTRY *glGenBuffersPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glGenerateMipmapPROC) (GLenum);
typedef void (APIENTRY *glGenFramebuffersPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glGenRenderbuffersPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glGenTexturesPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glGetActiveAttribPROC) (GLuint, GLuint, GLsizei, GLsizei *, GLint *, GLenum *, GLchar *);
typedef void (APIENTRY *glGetActiveUniformPROC) (GLuint, GLuint, GLsizei, GLsizei *, GLint *, GLenum *, GLchar *);
typedef void (APIENTRY *glGetAttachedShadersPROC) (GLuint, GLsizei, GLsizei *, GLuint *);
typedef GLint (APIENTRY *glGetAttribLocationPROC) (GLuint, const GLchar *);
typedef void (APIENTRY *glGetBooleanvPROC) (GLenum, GLboolean *);
typedef void (APIENTRY *glGetBufferParameterivPROC) (GLenum, GLenum, GLint *);
typedef GLenum (APIENTRY *glGetErrorPROC) (void);
typedef void (APIENTRY *glGetFloatvPROC) (GLenum, GLfloat *);
typedef void (APIENTRY *glGetFramebufferAttachmentParameterivPROC) (GLenum, GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetIntegervPROC) (GLenum, GLint *);
typedef void (APIENTRY *glGetProgramivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetProgramInfoLogPROC) (GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glGetRenderbufferParameterivPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetShaderivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetShaderInfoLogPROC) (GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glGetShaderPrecisionFormatPROC) (GLenum, GLenum, GLint *, GLint *);
typedef void (APIENTRY *glGetShaderSourcePROC) (GLuint, GLsizei, GLsizei *, GLchar *);
typedef GLubyte * (APIENTRY *glGetStringPROC) (GLenum);
typedef void (APIENTRY *glGetTexParameterfvPROC) (GLenum, GLenum, GLfloat *);
typedef void (APIENTRY *glGetTexParameterivPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetUniformfvPROC) (GLuint, GLint, GLfloat *);
typedef void (APIENTRY *glGetUniformivPROC) (GLuint, GLint, GLint *);
typedef GLint (APIENTRY *glGetUniformLocationPROC) (GLuint, const GLchar *);
typedef void (APIENTRY *glGetVertexAttribfvPROC) (GLuint, GLenum, GLfloat *);
typedef void (APIENTRY *glGetVertexAttribivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetVertexAttribPointervPROC) (GLuint, GLenum, void **);
typedef void (APIENTRY *glHintPROC) (GLenum, GLenum);
typedef GLboolean (APIENTRY *glIsBufferPROC) (GLuint);
typedef GLboolean (APIENTRY *glIsEnabledPROC) (GLenum);
typedef GLboolean (APIENTRY *glIsFramebufferPROC) (GLuint);
typedef GLboolean (APIENTRY *glIsProgramPROC) (GLuint);
typedef GLboolean (APIENTRY *glIsRenderbufferPROC) (GLuint);
typedef GLboolean (APIENTRY *glIsShaderPROC) (GLuint);
typedef GLboolean (APIENTRY *glIsTexturePROC) (GLuint);
typedef void (APIENTRY *glLineWidthPROC) (GLfloat);
typedef void (APIENTRY *glLinkProgramPROC) (GLuint);
typedef void (APIENTRY *glPixelStoreiPROC) (GLenum, GLint);
typedef void (APIENTRY *glPolygonOffsetPROC) (GLfloat, GLfloat);
typedef void (APIENTRY *glReadPixelsPROC) (GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, void *);
typedef void (APIENTRY *glReleaseShaderCompilerPROC) (void);
typedef void (APIENTRY *glRenderbufferStoragePROC) (GLenum, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glSampleCoveragePROC) (GLfloat, GLboolean);
typedef void (APIENTRY *glScissorPROC) (GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glShaderBinaryPROC) (GLsizei, const GLuint *, GLenum, const void *, GLsizei);
typedef void (APIENTRY *glShaderSourcePROC) (GLuint, GLsizei, const GLchar * const *, const GLint *);
typedef void (APIENTRY *glStencilFuncPROC) (GLenum, GLint, GLuint);
typedef void (APIENTRY *glStencilFuncSeparatePROC) (GLenum, GLenum, GLint, GLuint);
typedef void (APIENTRY *glStencilMaskPROC) (GLuint);
typedef void (APIENTRY *glStencilMaskSeparatePROC) (GLenum, GLuint);
typedef void (APIENTRY *glStencilOpPROC) (GLenum, GLenum, GLenum);
typedef void (APIENTRY *glStencilOpSeparatePROC) (GLenum, GLenum, GLenum, GLenum);
typedef void (APIENTRY *glTexImage2DPROC) (GLenum, GLint, GLint, GLsizei, GLsizei, GLint, GLenum, GLenum, const void *);
typedef void (APIENTRY *glTexParameterfPROC) (GLenum, GLenum, GLfloat);
typedef void (APIENTRY *glTexParameterfvPROC) (GLenum, GLenum, const GLfloat *);
typedef void (APIENTRY *glTexParameteriPROC) (GLenum, GLenum, GLint);
typedef void (APIENTRY *glTexParameterivPROC) (GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glTexSubImage2DPROC) (GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glUniform1fPROC) (GLint, GLfloat);
typedef void (APIENTRY *glUniform1fvPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform1iPROC) (GLint, GLint);
typedef void (APIENTRY *glUniform1ivPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniform2fPROC) (GLint, GLfloat, GLfloat);
typedef void (APIENTRY *glUniform2fvPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform2iPROC) (GLint, GLint, GLint);
typedef void (APIENTRY *glUniform2ivPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniform3fPROC) (GLint, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glUniform3fvPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform3iPROC) (GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glUniform3ivPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniform4fPROC) (GLint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glUniform4fvPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform4iPROC) (GLint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glUniform4ivPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniformMatrix2fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix3fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix4fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUseProgramPROC) (GLuint);
typedef void (APIENTRY *glValidateProgramPROC) (GLuint);
typedef void (APIENTRY *glVertexAttrib1fPROC) (GLuint, GLfloat);
typedef void (APIENTRY *glVertexAttrib1fvPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttrib2fPROC) (GLuint, GLfloat, GLfloat);
typedef void (APIENTRY *glVertexAttrib2fvPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttrib3fPROC) (GLuint, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glVertexAttrib3fvPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttrib4fPROC) (GLuint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glVertexAttrib4fvPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttribPointerPROC) (GLuint, GLint, GLenum, GLboolean, GLsizei, const void *);
typedef void (APIENTRY *glViewportPROC) (GLint, GLint, GLsizei, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglActiveTexture(JNIEnv *__env, jclass clazz, jint texture, jlong __functionAddress) {
	glActiveTexturePROC glActiveTexture = (glActiveTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glActiveTexture(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglAttachShader(JNIEnv *__env, jclass clazz, jint program, jint shader, jlong __functionAddress) {
	glAttachShaderPROC glAttachShader = (glAttachShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glAttachShader(program, shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBindAttribLocation(JNIEnv *__env, jclass clazz, jint program, jint index, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glBindAttribLocationPROC glBindAttribLocation = (glBindAttribLocationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindAttribLocation(program, index, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBindBuffer(JNIEnv *__env, jclass clazz, jint target, jint buffer, jlong __functionAddress) {
	glBindBufferPROC glBindBuffer = (glBindBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindBuffer(target, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBindFramebuffer(JNIEnv *__env, jclass clazz, jint target, jint framebuffer, jlong __functionAddress) {
	glBindFramebufferPROC glBindFramebuffer = (glBindFramebufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindFramebuffer(target, framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBindRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer, jlong __functionAddress) {
	glBindRenderbufferPROC glBindRenderbuffer = (glBindRenderbufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindRenderbuffer(target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBindTexture(JNIEnv *__env, jclass clazz, jint target, jint texture, jlong __functionAddress) {
	glBindTexturePROC glBindTexture = (glBindTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindTexture(target, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBlendColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha, jlong __functionAddress) {
	glBlendColorPROC glBlendColor = (glBlendColorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBlendEquation(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glBlendEquationPROC glBlendEquation = (glBlendEquationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquation(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBlendEquationSeparate(JNIEnv *__env, jclass clazz, jint modeRGB, jint modeAlpha, jlong __functionAddress) {
	glBlendEquationSeparatePROC glBlendEquationSeparate = (glBlendEquationSeparatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationSeparate(modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBlendFunc(JNIEnv *__env, jclass clazz, jint sfactor, jint dfactor, jlong __functionAddress) {
	glBlendFuncPROC glBlendFunc = (glBlendFuncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFunc(sfactor, dfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBlendFuncSeparate(JNIEnv *__env, jclass clazz, jint sfactorRGB, jint dfactorRGB, jint sfactorAlpha, jint dfactorAlpha, jlong __functionAddress) {
	glBlendFuncSeparatePROC glBlendFuncSeparate = (glBlendFuncSeparatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBufferData(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint usage, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glBufferDataPROC glBufferData = (glBufferDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBufferData(target, (GLsizeiptr)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBufferSubData(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glBufferSubDataPROC glBufferSubData = (glBufferSubDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBufferSubData(target, (GLintptr)offset, (GLsizeiptr)size, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglCheckFramebufferStatus(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glCheckFramebufferStatusPROC glCheckFramebufferStatus = (glCheckFramebufferStatusPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCheckFramebufferStatus(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglClear(JNIEnv *__env, jclass clazz, jint mask, jlong __functionAddress) {
	glClearPROC glClear = (glClearPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClear(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglClearColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha, jlong __functionAddress) {
	glClearColorPROC glClearColor = (glClearColorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglClearDepthf(JNIEnv *__env, jclass clazz, jfloat d, jlong __functionAddress) {
	glClearDepthfPROC glClearDepthf = (glClearDepthfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearDepthf(d);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglClearStencil(JNIEnv *__env, jclass clazz, jint s, jlong __functionAddress) {
	glClearStencilPROC glClearStencil = (glClearStencilPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearStencil(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglColorMask(JNIEnv *__env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha, jlong __functionAddress) {
	glColorMaskPROC glColorMask = (glColorMaskPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorMask(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCompileShader(JNIEnv *__env, jclass clazz, jint shader, jlong __functionAddress) {
	glCompileShaderPROC glCompileShader = (glCompileShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompileShader(shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCompressedTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexImage2DPROC glCompressedTexImage2D = (glCompressedTexImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCompressedTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTexSubImage2DPROC glCompressedTexSubImage2D = (glCompressedTexSubImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCopyTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border, jlong __functionAddress) {
	glCopyTexImage2DPROC glCopyTexImage2D = (glCopyTexImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCopyTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyTexSubImage2DPROC glCopyTexSubImage2D = (glCopyTexSubImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglCreateProgram(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glCreateProgramPROC glCreateProgram = (glCreateProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCreateProgram();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglCreateShader(JNIEnv *__env, jclass clazz, jint type, jlong __functionAddress) {
	glCreateShaderPROC glCreateShader = (glCreateShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCreateShader(type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCullFace(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glCullFacePROC glCullFace = (glCullFacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCullFace(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteBuffers(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress, jlong __functionAddress) {
	const GLuint *buffers = (const GLuint *)(intptr_t)buffersAddress;
	glDeleteBuffersPROC glDeleteBuffers = (glDeleteBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteFramebuffers(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress, jlong __functionAddress) {
	const GLuint *framebuffers = (const GLuint *)(intptr_t)framebuffersAddress;
	glDeleteFramebuffersPROC glDeleteFramebuffers = (glDeleteFramebuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteProgram(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glDeleteProgramPROC glDeleteProgram = (glDeleteProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteRenderbuffers(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress, jlong __functionAddress) {
	const GLuint *renderbuffers = (const GLuint *)(intptr_t)renderbuffersAddress;
	glDeleteRenderbuffersPROC glDeleteRenderbuffers = (glDeleteRenderbuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteShader(JNIEnv *__env, jclass clazz, jint shader, jlong __functionAddress) {
	glDeleteShaderPROC glDeleteShader = (glDeleteShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteShader(shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteTextures(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress, jlong __functionAddress) {
	const GLuint *textures = (const GLuint *)(intptr_t)texturesAddress;
	glDeleteTexturesPROC glDeleteTextures = (glDeleteTexturesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDepthFunc(JNIEnv *__env, jclass clazz, jint func, jlong __functionAddress) {
	glDepthFuncPROC glDepthFunc = (glDepthFuncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthFunc(func);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDepthMask(JNIEnv *__env, jclass clazz, jboolean flag, jlong __functionAddress) {
	glDepthMaskPROC glDepthMask = (glDepthMaskPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthMask(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDepthRangef(JNIEnv *__env, jclass clazz, jfloat n, jfloat f, jlong __functionAddress) {
	glDepthRangefPROC glDepthRangef = (glDepthRangefPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthRangef(n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDetachShader(JNIEnv *__env, jclass clazz, jint program, jint shader, jlong __functionAddress) {
	glDetachShaderPROC glDetachShader = (glDetachShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDetachShader(program, shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDisable(JNIEnv *__env, jclass clazz, jint cap, jlong __functionAddress) {
	glDisablePROC glDisable = (glDisablePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisable(cap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDisableVertexAttribArray(JNIEnv *__env, jclass clazz, jint index, jlong __functionAddress) {
	glDisableVertexAttribArrayPROC glDisableVertexAttribArray = (glDisableVertexAttribArrayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDrawArrays(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jlong __functionAddress) {
	glDrawArraysPROC glDrawArrays = (glDrawArraysPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArrays(mode, first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDrawElements(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsPROC glDrawElements = (glDrawElementsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElements(mode, count, type, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglEnable(JNIEnv *__env, jclass clazz, jint cap, jlong __functionAddress) {
	glEnablePROC glEnable = (glEnablePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnable(cap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglEnableVertexAttribArray(JNIEnv *__env, jclass clazz, jint index, jlong __functionAddress) {
	glEnableVertexAttribArrayPROC glEnableVertexAttribArray = (glEnableVertexAttribArrayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglFinish(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glFinishPROC glFinish = (glFinishPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFinish();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglFlush(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glFlushPROC glFlush = (glFlushPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFlush();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglFramebufferRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer, jlong __functionAddress) {
	glFramebufferRenderbufferPROC glFramebufferRenderbuffer = (glFramebufferRenderbufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglFramebufferTexture2D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jlong __functionAddress) {
	glFramebufferTexture2DPROC glFramebufferTexture2D = (glFramebufferTexture2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture2D(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglFrontFace(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glFrontFacePROC glFrontFace = (glFrontFacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFrontFace(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenBuffers(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress, jlong __functionAddress) {
	GLuint *buffers = (GLuint *)(intptr_t)buffersAddress;
	glGenBuffersPROC glGenBuffers = (glGenBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenerateMipmap(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glGenerateMipmapPROC glGenerateMipmap = (glGenerateMipmapPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenerateMipmap(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenFramebuffers(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress, jlong __functionAddress) {
	GLuint *framebuffers = (GLuint *)(intptr_t)framebuffersAddress;
	glGenFramebuffersPROC glGenFramebuffers = (glGenFramebuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenRenderbuffers(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress, jlong __functionAddress) {
	GLuint *renderbuffers = (GLuint *)(intptr_t)renderbuffersAddress;
	glGenRenderbuffersPROC glGenRenderbuffers = (glGenRenderbuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenTextures(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress, jlong __functionAddress) {
	GLuint *textures = (GLuint *)(intptr_t)texturesAddress;
	glGenTexturesPROC glGenTextures = (glGenTexturesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetActiveAttrib(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLint *size = (GLint *)(intptr_t)sizeAddress;
	GLenum *type = (GLenum *)(intptr_t)typeAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetActiveAttribPROC glGetActiveAttrib = (glGetActiveAttribPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveAttrib(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetActiveUniform(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLint *size = (GLint *)(intptr_t)sizeAddress;
	GLenum *type = (GLenum *)(intptr_t)typeAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetActiveUniformPROC glGetActiveUniform = (glGetActiveUniformPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveUniform(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetAttachedShaders(JNIEnv *__env, jclass clazz, jint program, jint maxCount, jlong countAddress, jlong shadersAddress, jlong __functionAddress) {
	GLsizei *count = (GLsizei *)(intptr_t)countAddress;
	GLuint *shaders = (GLuint *)(intptr_t)shadersAddress;
	glGetAttachedShadersPROC glGetAttachedShaders = (glGetAttachedShadersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetAttachedShaders(program, maxCount, count, shaders);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglGetAttribLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetAttribLocationPROC glGetAttribLocation = (glGetAttribLocationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetAttribLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetBooleanv(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLboolean *data = (GLboolean *)(intptr_t)dataAddress;
	glGetBooleanvPROC glGetBooleanv = (glGetBooleanvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBooleanv(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetBufferParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetBufferParameterivPROC glGetBufferParameteriv = (glGetBufferParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBufferParameteriv(target, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglGetError(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glGetErrorPROC glGetError = (glGetErrorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetError();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetFloatv(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetFloatvPROC glGetFloatv = (glGetFloatvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFloatv(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetFramebufferAttachmentParameteriv(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetFramebufferAttachmentParameterivPROC glGetFramebufferAttachmentParameteriv = (glGetFramebufferAttachmentParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetIntegerv(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetIntegervPROC glGetIntegerv = (glGetIntegervPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetIntegerv(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetProgramiv(JNIEnv *__env, jclass clazz, jint program, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetProgramivPROC glGetProgramiv = (glGetProgramivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramiv(program, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetProgramInfoLog(JNIEnv *__env, jclass clazz, jint program, jint bufSize, jlong lengthAddress, jlong infoLogAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *infoLog = (GLchar *)(intptr_t)infoLogAddress;
	glGetProgramInfoLogPROC glGetProgramInfoLog = (glGetProgramInfoLogPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramInfoLog(program, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetRenderbufferParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetRenderbufferParameterivPROC glGetRenderbufferParameteriv = (glGetRenderbufferParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetRenderbufferParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderiv(JNIEnv *__env, jclass clazz, jint shader, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetShaderivPROC glGetShaderiv = (glGetShaderivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetShaderiv(shader, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderInfoLog(JNIEnv *__env, jclass clazz, jint shader, jint bufSize, jlong lengthAddress, jlong infoLogAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *infoLog = (GLchar *)(intptr_t)infoLogAddress;
	glGetShaderInfoLogPROC glGetShaderInfoLog = (glGetShaderInfoLogPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetShaderInfoLog(shader, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderPrecisionFormat(JNIEnv *__env, jclass clazz, jint shadertype, jint precisiontype, jlong rangeAddress, jlong precisionAddress, jlong __functionAddress) {
	GLint *range = (GLint *)(intptr_t)rangeAddress;
	GLint *precision = (GLint *)(intptr_t)precisionAddress;
	glGetShaderPrecisionFormatPROC glGetShaderPrecisionFormat = (glGetShaderPrecisionFormatPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderSource(JNIEnv *__env, jclass clazz, jint shader, jint bufSize, jlong lengthAddress, jlong sourceAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *source = (GLchar *)(intptr_t)sourceAddress;
	glGetShaderSourcePROC glGetShaderSource = (glGetShaderSourcePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetShaderSource(shader, bufSize, length, source);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_GLES20_nglGetString(JNIEnv *__env, jclass clazz, jint name, jlong __functionAddress) {
	glGetStringPROC glGetString = (glGetStringPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glGetString(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetTexParameterfv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetTexParameterfvPROC glGetTexParameterfv = (glGetTexParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetTexParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTexParameterivPROC glGetTexParameteriv = (glGetTexParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetUniformfv(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetUniformfvPROC glGetUniformfv = (glGetUniformfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformfv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetUniformiv(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetUniformivPROC glGetUniformiv = (glGetUniformivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformiv(program, location, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglGetUniformLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetUniformLocationPROC glGetUniformLocation = (glGetUniformLocationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetUniformLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetVertexAttribfv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetVertexAttribfvPROC glGetVertexAttribfv = (glGetVertexAttribfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribfv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetVertexAttribiv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetVertexAttribivPROC glGetVertexAttribiv = (glGetVertexAttribivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetVertexAttribPointerv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong pointerAddress, jlong __functionAddress) {
	void **pointer = (void **)(intptr_t)pointerAddress;
	glGetVertexAttribPointervPROC glGetVertexAttribPointerv = (glGetVertexAttribPointervPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribPointerv(index, pname, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglHint(JNIEnv *__env, jclass clazz, jint target, jint mode, jlong __functionAddress) {
	glHintPROC glHint = (glHintPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glHint(target, mode);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsBuffer(JNIEnv *__env, jclass clazz, jint buffer, jlong __functionAddress) {
	glIsBufferPROC glIsBuffer = (glIsBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsBuffer(buffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsEnabled(JNIEnv *__env, jclass clazz, jint cap, jlong __functionAddress) {
	glIsEnabledPROC glIsEnabled = (glIsEnabledPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsEnabled(cap);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsFramebuffer(JNIEnv *__env, jclass clazz, jint framebuffer, jlong __functionAddress) {
	glIsFramebufferPROC glIsFramebuffer = (glIsFramebufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsFramebuffer(framebuffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsProgram(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glIsProgramPROC glIsProgram = (glIsProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsProgram(program);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsRenderbuffer(JNIEnv *__env, jclass clazz, jint renderbuffer, jlong __functionAddress) {
	glIsRenderbufferPROC glIsRenderbuffer = (glIsRenderbufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsRenderbuffer(renderbuffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsShader(JNIEnv *__env, jclass clazz, jint shader, jlong __functionAddress) {
	glIsShaderPROC glIsShader = (glIsShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsShader(shader);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsTexture(JNIEnv *__env, jclass clazz, jint texture, jlong __functionAddress) {
	glIsTexturePROC glIsTexture = (glIsTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsTexture(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglLineWidth(JNIEnv *__env, jclass clazz, jfloat width, jlong __functionAddress) {
	glLineWidthPROC glLineWidth = (glLineWidthPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLineWidth(width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglLinkProgram(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glLinkProgramPROC glLinkProgram = (glLinkProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLinkProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglPixelStorei(JNIEnv *__env, jclass clazz, jint pname, jint param, jlong __functionAddress) {
	glPixelStoreiPROC glPixelStorei = (glPixelStoreiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPixelStorei(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglPolygonOffset(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units, jlong __functionAddress) {
	glPolygonOffsetPROC glPolygonOffset = (glPolygonOffsetPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPolygonOffset(factor, units);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglReadPixels(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	void *pixels = (void *)(intptr_t)pixelsAddress;
	glReadPixelsPROC glReadPixels = (glReadPixelsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReadPixels(x, y, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglReleaseShaderCompiler(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glReleaseShaderCompilerPROC glReleaseShaderCompiler = (glReleaseShaderCompilerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReleaseShaderCompiler();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglRenderbufferStorage(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glRenderbufferStoragePROC glRenderbufferStorage = (glRenderbufferStoragePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRenderbufferStorage(target, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglSampleCoverage(JNIEnv *__env, jclass clazz, jfloat value, jboolean invert, jlong __functionAddress) {
	glSampleCoveragePROC glSampleCoverage = (glSampleCoveragePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSampleCoverage(value, invert);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglScissor(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glScissorPROC glScissor = (glScissorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glScissor(x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglShaderBinary(JNIEnv *__env, jclass clazz, jint count, jlong shadersAddress, jint binaryformat, jlong binaryAddress, jint length, jlong __functionAddress) {
	const GLuint *shaders = (const GLuint *)(intptr_t)shadersAddress;
	const void *binary = (const void *)(intptr_t)binaryAddress;
	glShaderBinaryPROC glShaderBinary = (glShaderBinaryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glShaderBinary(count, shaders, binaryformat, binary, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglShaderSource(JNIEnv *__env, jclass clazz, jint shader, jint count, jlong stringAddress, jlong lengthAddress, jlong __functionAddress) {
	const GLchar * const *string = (const GLchar * const *)(intptr_t)stringAddress;
	const GLint *length = (const GLint *)(intptr_t)lengthAddress;
	glShaderSourcePROC glShaderSource = (glShaderSourcePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glShaderSource(shader, count, string, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilFunc(JNIEnv *__env, jclass clazz, jint func, jint ref, jint mask, jlong __functionAddress) {
	glStencilFuncPROC glStencilFunc = (glStencilFuncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilFunc(func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilFuncSeparate(JNIEnv *__env, jclass clazz, jint face, jint func, jint ref, jint mask, jlong __functionAddress) {
	glStencilFuncSeparatePROC glStencilFuncSeparate = (glStencilFuncSeparatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilFuncSeparate(face, func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilMask(JNIEnv *__env, jclass clazz, jint mask, jlong __functionAddress) {
	glStencilMaskPROC glStencilMask = (glStencilMaskPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilMask(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilMaskSeparate(JNIEnv *__env, jclass clazz, jint face, jint mask, jlong __functionAddress) {
	glStencilMaskSeparatePROC glStencilMaskSeparate = (glStencilMaskSeparatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilMaskSeparate(face, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilOp(JNIEnv *__env, jclass clazz, jint fail, jint zfail, jint zpass, jlong __functionAddress) {
	glStencilOpPROC glStencilOp = (glStencilOpPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilOp(fail, zfail, zpass);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilOpSeparate(JNIEnv *__env, jclass clazz, jint face, jint sfail, jint dpfail, jint dppass, jlong __functionAddress) {
	glStencilOpSeparatePROC glStencilOpSeparate = (glStencilOpSeparatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilOpSeparate(face, sfail, dpfail, dppass);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTexImage2DPROC glTexImage2D = (glTexImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexParameterf(JNIEnv *__env, jclass clazz, jint target, jint pname, jfloat param, jlong __functionAddress) {
	glTexParameterfPROC glTexParameterf = (glTexParameterfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterf(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexParameterfv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glTexParameterfvPROC glTexParameterfv = (glTexParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param, jlong __functionAddress) {
	glTexParameteriPROC glTexParameteri = (glTexParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glTexParameterivPROC glTexParameteriv = (glTexParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTexSubImage2DPROC glTexSubImage2D = (glTexSubImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform1f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jlong __functionAddress) {
	glUniform1fPROC glUniform1f = (glUniform1fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1f(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform1fv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform1fvPROC glUniform1fv = (glUniform1fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform1i(JNIEnv *__env, jclass clazz, jint location, jint v0, jlong __functionAddress) {
	glUniform1iPROC glUniform1i = (glUniform1iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1i(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform1iv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform1ivPROC glUniform1iv = (glUniform1ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform2f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jlong __functionAddress) {
	glUniform2fPROC glUniform2f = (glUniform2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2f(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform2fv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform2fvPROC glUniform2fv = (glUniform2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform2i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jlong __functionAddress) {
	glUniform2iPROC glUniform2i = (glUniform2iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2i(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform2iv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform2ivPROC glUniform2iv = (glUniform2ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform3f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2, jlong __functionAddress) {
	glUniform3fPROC glUniform3f = (glUniform3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3f(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform3fv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform3fvPROC glUniform3fv = (glUniform3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform3i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glUniform3iPROC glUniform3i = (glUniform3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3i(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform3iv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform3ivPROC glUniform3iv = (glUniform3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform4f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3, jlong __functionAddress) {
	glUniform4fPROC glUniform4f = (glUniform4fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4f(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform4fv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform4fvPROC glUniform4fv = (glUniform4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform4i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glUniform4iPROC glUniform4i = (glUniform4iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4i(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform4iv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform4ivPROC glUniform4iv = (glUniform4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniformMatrix2fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix2fvPROC glUniformMatrix2fv = (glUniformMatrix2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniformMatrix3fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix3fvPROC glUniformMatrix3fv = (glUniformMatrix3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniformMatrix4fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix4fvPROC glUniformMatrix4fv = (glUniformMatrix4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUseProgram(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glUseProgramPROC glUseProgram = (glUseProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUseProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglValidateProgram(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glValidateProgramPROC glValidateProgram = (glValidateProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glValidateProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib1f(JNIEnv *__env, jclass clazz, jint index, jfloat x, jlong __functionAddress) {
	glVertexAttrib1fPROC glVertexAttrib1f = (glVertexAttrib1fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1f(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib1fv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib1fvPROC glVertexAttrib1fv = (glVertexAttrib1fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib2f(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jlong __functionAddress) {
	glVertexAttrib2fPROC glVertexAttrib2f = (glVertexAttrib2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2f(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib2fv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib2fvPROC glVertexAttrib2fv = (glVertexAttrib2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib3f(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glVertexAttrib3fPROC glVertexAttrib3f = (glVertexAttrib3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3f(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib3fv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib3fvPROC glVertexAttrib3fv = (glVertexAttrib3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib4f(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat z, jfloat w, jlong __functionAddress) {
	glVertexAttrib4fPROC glVertexAttrib4f = (glVertexAttrib4fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4f(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib4fv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib4fvPROC glVertexAttrib4fv = (glVertexAttrib4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttribPointer(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jboolean normalized, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const void *pointer = (const void *)(intptr_t)pointerAddress;
	glVertexAttribPointerPROC glVertexAttribPointer = (glVertexAttribPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribPointer(index, size, type, normalized, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglViewport(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glViewportPROC glViewport = (glViewportPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glViewport(x, y, width, height);
}

EXTERN_C_EXIT
