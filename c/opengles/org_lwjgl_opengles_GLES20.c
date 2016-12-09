/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glActiveTexturePROC) (jint);
typedef void (APIENTRY *glAttachShaderPROC) (jint, jint);
typedef void (APIENTRY *glBindAttribLocationPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glBindBufferPROC) (jint, jint);
typedef void (APIENTRY *glBindFramebufferPROC) (jint, jint);
typedef void (APIENTRY *glBindRenderbufferPROC) (jint, jint);
typedef void (APIENTRY *glBindTexturePROC) (jint, jint);
typedef void (APIENTRY *glBlendColorPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glBlendEquationPROC) (jint);
typedef void (APIENTRY *glBlendEquationSeparatePROC) (jint, jint);
typedef void (APIENTRY *glBlendFuncPROC) (jint, jint);
typedef void (APIENTRY *glBlendFuncSeparatePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glBufferDataPROC) (jint, intptr_t, const intptr_t, jint);
typedef void (APIENTRY *glBufferSubDataPROC) (jint, intptr_t, intptr_t, const intptr_t);
typedef jint (APIENTRY *glCheckFramebufferStatusPROC) (jint);
typedef void (APIENTRY *glClearPROC) (jint);
typedef void (APIENTRY *glClearColorPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glClearDepthfPROC) (jfloat);
typedef void (APIENTRY *glClearStencilPROC) (jint);
typedef void (APIENTRY *glColorMaskPROC) (jboolean, jboolean, jboolean, jboolean);
typedef void (APIENTRY *glCompileShaderPROC) (jint);
typedef void (APIENTRY *glCompressedTexImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedTexSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCopyTexImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTexSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef jint (APIENTRY *glCreateProgramPROC) (void);
typedef jint (APIENTRY *glCreateShaderPROC) (jint);
typedef void (APIENTRY *glCullFacePROC) (jint);
typedef void (APIENTRY *glDeleteBuffersPROC) (jint, const intptr_t);
typedef void (APIENTRY *glDeleteFramebuffersPROC) (jint, const intptr_t);
typedef void (APIENTRY *glDeleteProgramPROC) (jint);
typedef void (APIENTRY *glDeleteRenderbuffersPROC) (jint, const intptr_t);
typedef void (APIENTRY *glDeleteShaderPROC) (jint);
typedef void (APIENTRY *glDeleteTexturesPROC) (jint, const intptr_t);
typedef void (APIENTRY *glDepthFuncPROC) (jint);
typedef void (APIENTRY *glDepthMaskPROC) (jboolean);
typedef void (APIENTRY *glDepthRangefPROC) (jfloat, jfloat);
typedef void (APIENTRY *glDetachShaderPROC) (jint, jint);
typedef void (APIENTRY *glDisablePROC) (jint);
typedef void (APIENTRY *glDisableVertexAttribArrayPROC) (jint);
typedef void (APIENTRY *glDrawArraysPROC) (jint, jint, jint);
typedef void (APIENTRY *glDrawElementsPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glEnablePROC) (jint);
typedef void (APIENTRY *glEnableVertexAttribArrayPROC) (jint);
typedef void (APIENTRY *glFinishPROC) (void);
typedef void (APIENTRY *glFlushPROC) (void);
typedef void (APIENTRY *glFramebufferRenderbufferPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTexture2DPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFrontFacePROC) (jint);
typedef void (APIENTRY *glGenBuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenerateMipmapPROC) (jint);
typedef void (APIENTRY *glGenFramebuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenRenderbuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenTexturesPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetActiveAttribPROC) (jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glGetActiveUniformPROC) (jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glGetAttachedShadersPROC) (jint, jint, intptr_t, intptr_t);
typedef jint (APIENTRY *glGetAttribLocationPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGetBooleanvPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetBufferParameterivPROC) (jint, jint, intptr_t);
typedef jint (APIENTRY *glGetErrorPROC) (void);
typedef void (APIENTRY *glGetFloatvPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetFramebufferAttachmentParameterivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetIntegervPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetProgramivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetProgramInfoLogPROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetRenderbufferParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetShaderivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetShaderInfoLogPROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetShaderPrecisionFormatPROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetShaderSourcePROC) (jint, jint, intptr_t, intptr_t);
typedef intptr_t (APIENTRY *glGetStringPROC) (jint);
typedef void (APIENTRY *glGetTexParameterfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetUniformfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetUniformivPROC) (jint, jint, intptr_t);
typedef jint (APIENTRY *glGetUniformLocationPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGetVertexAttribfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribPointervPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glHintPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsBufferPROC) (jint);
typedef jboolean (APIENTRY *glIsEnabledPROC) (jint);
typedef jboolean (APIENTRY *glIsFramebufferPROC) (jint);
typedef jboolean (APIENTRY *glIsProgramPROC) (jint);
typedef jboolean (APIENTRY *glIsRenderbufferPROC) (jint);
typedef jboolean (APIENTRY *glIsShaderPROC) (jint);
typedef jboolean (APIENTRY *glIsTexturePROC) (jint);
typedef void (APIENTRY *glLineWidthPROC) (jfloat);
typedef void (APIENTRY *glLinkProgramPROC) (jint);
typedef void (APIENTRY *glPixelStoreiPROC) (jint, jint);
typedef void (APIENTRY *glPolygonOffsetPROC) (jfloat, jfloat);
typedef void (APIENTRY *glReadPixelsPROC) (jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glReleaseShaderCompilerPROC) (void);
typedef void (APIENTRY *glRenderbufferStoragePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glSampleCoveragePROC) (jfloat, jboolean);
typedef void (APIENTRY *glScissorPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glShaderBinaryPROC) (jint, const intptr_t, jint, const intptr_t, jint);
typedef void (APIENTRY *glShaderSourcePROC) (jint, jint, const intptr_t, const intptr_t);
typedef void (APIENTRY *glStencilFuncPROC) (jint, jint, jint);
typedef void (APIENTRY *glStencilFuncSeparatePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glStencilMaskPROC) (jint);
typedef void (APIENTRY *glStencilMaskSeparatePROC) (jint, jint);
typedef void (APIENTRY *glStencilOpPROC) (jint, jint, jint);
typedef void (APIENTRY *glStencilOpSeparatePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTexImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTexParameterfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glTexParameterfvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glTexParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexParameterivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glTexSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform1fPROC) (jint, jfloat);
typedef void (APIENTRY *glUniform1fvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform1iPROC) (jint, jint);
typedef void (APIENTRY *glUniform1ivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform2fPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glUniform2fvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform2iPROC) (jint, jint, jint);
typedef void (APIENTRY *glUniform2ivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform3fPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glUniform3fvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform3iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glUniform3ivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform4fPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glUniform4fvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform4iPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glUniform4ivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniformMatrix2fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix3fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix4fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUseProgramPROC) (jint);
typedef void (APIENTRY *glValidateProgramPROC) (jint);
typedef void (APIENTRY *glVertexAttrib1fPROC) (jint, jfloat);
typedef void (APIENTRY *glVertexAttrib1fvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib2fPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib2fvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib3fPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib3fvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4fPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib4fvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribPointerPROC) (jint, jint, jint, jboolean, jint, const intptr_t);
typedef void (APIENTRY *glViewportPROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglActiveTexture(JNIEnv *__env, jclass clazz, jint texture) {
	glActiveTexturePROC glActiveTexture = (glActiveTexturePROC)tlsGetFunction(2);
	UNUSED_PARAM(clazz)
	glActiveTexture(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglAttachShader(JNIEnv *__env, jclass clazz, jint program, jint shader) {
	glAttachShaderPROC glAttachShader = (glAttachShaderPROC)tlsGetFunction(5);
	UNUSED_PARAM(clazz)
	glAttachShader(program, shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBindAttribLocation(JNIEnv *__env, jclass clazz, jint program, jint index, jlong nameAddress) {
	glBindAttribLocationPROC glBindAttribLocation = (glBindAttribLocationPROC)tlsGetFunction(12);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	glBindAttribLocation(program, index, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBindBuffer(JNIEnv *__env, jclass clazz, jint target, jint buffer) {
	glBindBufferPROC glBindBuffer = (glBindBufferPROC)tlsGetFunction(13);
	UNUSED_PARAM(clazz)
	glBindBuffer(target, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBindFramebuffer(JNIEnv *__env, jclass clazz, jint target, jint framebuffer) {
	glBindFramebufferPROC glBindFramebuffer = (glBindFramebufferPROC)tlsGetFunction(18);
	UNUSED_PARAM(clazz)
	glBindFramebuffer(target, framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBindRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer) {
	glBindRenderbufferPROC glBindRenderbuffer = (glBindRenderbufferPROC)tlsGetFunction(22);
	UNUSED_PARAM(clazz)
	glBindRenderbuffer(target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBindTexture(JNIEnv *__env, jclass clazz, jint target, jint texture) {
	glBindTexturePROC glBindTexture = (glBindTexturePROC)tlsGetFunction(24);
	UNUSED_PARAM(clazz)
	glBindTexture(target, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBlendColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
	glBlendColorPROC glBlendColor = (glBlendColorPROC)tlsGetFunction(32);
	UNUSED_PARAM(clazz)
	glBlendColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBlendEquation(JNIEnv *__env, jclass clazz, jint mode) {
	glBlendEquationPROC glBlendEquation = (glBlendEquationPROC)tlsGetFunction(33);
	UNUSED_PARAM(clazz)
	glBlendEquation(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBlendEquationSeparate(JNIEnv *__env, jclass clazz, jint modeRGB, jint modeAlpha) {
	glBlendEquationSeparatePROC glBlendEquationSeparate = (glBlendEquationSeparatePROC)tlsGetFunction(34);
	UNUSED_PARAM(clazz)
	glBlendEquationSeparate(modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBlendFunc(JNIEnv *__env, jclass clazz, jint sfactor, jint dfactor) {
	glBlendFuncPROC glBlendFunc = (glBlendFuncPROC)tlsGetFunction(41);
	UNUSED_PARAM(clazz)
	glBlendFunc(sfactor, dfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBlendFuncSeparate(JNIEnv *__env, jclass clazz, jint sfactorRGB, jint dfactorRGB, jint sfactorAlpha, jint dfactorAlpha) {
	glBlendFuncSeparatePROC glBlendFuncSeparate = (glBlendFuncSeparatePROC)tlsGetFunction(42);
	UNUSED_PARAM(clazz)
	glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBufferData__IJJI(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint usage) {
	glBufferDataPROC glBufferData = (glBufferDataPROC)tlsGetFunction(53);
	const intptr_t data = (const intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glBufferData(target, (intptr_t)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBufferSubData__IJJJ(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress) {
	glBufferSubDataPROC glBufferSubData = (glBufferSubDataPROC)tlsGetFunction(55);
	const intptr_t data = (const intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glBufferSubData(target, (intptr_t)offset, (intptr_t)size, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglCheckFramebufferStatus(JNIEnv *__env, jclass clazz, jint target) {
	glCheckFramebufferStatusPROC glCheckFramebufferStatus = (glCheckFramebufferStatusPROC)tlsGetFunction(56);
	UNUSED_PARAM(clazz)
	return (jint)glCheckFramebufferStatus(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglClear(JNIEnv *__env, jclass clazz, jint mask) {
	glClearPROC glClear = (glClearPROC)tlsGetFunction(57);
	UNUSED_PARAM(clazz)
	glClear(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglClearColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
	glClearColorPROC glClearColor = (glClearColorPROC)tlsGetFunction(62);
	UNUSED_PARAM(clazz)
	glClearColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglClearDepthf(JNIEnv *__env, jclass clazz, jfloat d) {
	glClearDepthfPROC glClearDepthf = (glClearDepthfPROC)tlsGetFunction(63);
	UNUSED_PARAM(clazz)
	glClearDepthf(d);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglClearStencil(JNIEnv *__env, jclass clazz, jint s) {
	glClearStencilPROC glClearStencil = (glClearStencilPROC)tlsGetFunction(65);
	UNUSED_PARAM(clazz)
	glClearStencil(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglColorMask(JNIEnv *__env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {
	glColorMaskPROC glColorMask = (glColorMaskPROC)tlsGetFunction(70);
	UNUSED_PARAM(clazz)
	glColorMask(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCompileShader(JNIEnv *__env, jclass clazz, jint shader) {
	glCompileShaderPROC glCompileShader = (glCompileShaderPROC)tlsGetFunction(74);
	UNUSED_PARAM(clazz)
	glCompileShader(shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCompressedTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jlong dataAddress) {
	glCompressedTexImage2DPROC glCompressedTexImage2D = (glCompressedTexImage2DPROC)tlsGetFunction(75);
	const intptr_t data = (const intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCompressedTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress) {
	glCompressedTexSubImage2DPROC glCompressedTexSubImage2D = (glCompressedTexSubImage2DPROC)tlsGetFunction(79);
	const intptr_t data = (const intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCopyTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {
	glCopyTexImage2DPROC glCopyTexImage2D = (glCopyTexImage2DPROC)tlsGetFunction(90);
	UNUSED_PARAM(clazz)
	glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCopyTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
	glCopyTexSubImage2DPROC glCopyTexSubImage2D = (glCopyTexSubImage2DPROC)tlsGetFunction(91);
	UNUSED_PARAM(clazz)
	glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglCreateProgram(JNIEnv *__env, jclass clazz) {
	glCreateProgramPROC glCreateProgram = (glCreateProgramPROC)tlsGetFunction(105);
	UNUSED_PARAM(clazz)
	return (jint)glCreateProgram();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglCreateShader(JNIEnv *__env, jclass clazz, jint type) {
	glCreateShaderPROC glCreateShader = (glCreateShaderPROC)tlsGetFunction(106);
	UNUSED_PARAM(clazz)
	return (jint)glCreateShader(type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCullFace(JNIEnv *__env, jclass clazz, jint mode) {
	glCullFacePROC glCullFace = (glCullFacePROC)tlsGetFunction(109);
	UNUSED_PARAM(clazz)
	glCullFace(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteBuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress) {
	glDeleteBuffersPROC glDeleteBuffers = (glDeleteBuffersPROC)tlsGetFunction(116);
	const intptr_t buffers = (const intptr_t)buffersAddress;
	UNUSED_PARAM(clazz)
	glDeleteBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
	glDeleteFramebuffersPROC glDeleteFramebuffers = (glDeleteFramebuffersPROC)tlsGetFunction(118);
	const intptr_t framebuffers = (const intptr_t)framebuffersAddress;
	UNUSED_PARAM(clazz)
	glDeleteFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteProgram(JNIEnv *__env, jclass clazz, jint program) {
	glDeleteProgramPROC glDeleteProgram = (glDeleteProgramPROC)tlsGetFunction(122);
	UNUSED_PARAM(clazz)
	glDeleteProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
	glDeleteRenderbuffersPROC glDeleteRenderbuffers = (glDeleteRenderbuffersPROC)tlsGetFunction(127);
	const intptr_t renderbuffers = (const intptr_t)renderbuffersAddress;
	UNUSED_PARAM(clazz)
	glDeleteRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteShader(JNIEnv *__env, jclass clazz, jint shader) {
	glDeleteShaderPROC glDeleteShader = (glDeleteShaderPROC)tlsGetFunction(129);
	UNUSED_PARAM(clazz)
	glDeleteShader(shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteTextures__IJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress) {
	glDeleteTexturesPROC glDeleteTextures = (glDeleteTexturesPROC)tlsGetFunction(132);
	const intptr_t textures = (const intptr_t)texturesAddress;
	UNUSED_PARAM(clazz)
	glDeleteTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDepthFunc(JNIEnv *__env, jclass clazz, jint func) {
	glDepthFuncPROC glDepthFunc = (glDepthFuncPROC)tlsGetFunction(136);
	UNUSED_PARAM(clazz)
	glDepthFunc(func);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDepthMask(JNIEnv *__env, jclass clazz, jboolean flag) {
	glDepthMaskPROC glDepthMask = (glDepthMaskPROC)tlsGetFunction(137);
	UNUSED_PARAM(clazz)
	glDepthMask(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDepthRangef(JNIEnv *__env, jclass clazz, jfloat n, jfloat f) {
	glDepthRangefPROC glDepthRangef = (glDepthRangefPROC)tlsGetFunction(142);
	UNUSED_PARAM(clazz)
	glDepthRangef(n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDetachShader(JNIEnv *__env, jclass clazz, jint program, jint shader) {
	glDetachShaderPROC glDetachShader = (glDetachShaderPROC)tlsGetFunction(143);
	UNUSED_PARAM(clazz)
	glDetachShader(program, shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDisable(JNIEnv *__env, jclass clazz, jint cap) {
	glDisablePROC glDisable = (glDisablePROC)tlsGetFunction(144);
	UNUSED_PARAM(clazz)
	glDisable(cap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDisableVertexAttribArray(JNIEnv *__env, jclass clazz, jint index) {
	glDisableVertexAttribArrayPROC glDisableVertexAttribArray = (glDisableVertexAttribArrayPROC)tlsGetFunction(146);
	UNUSED_PARAM(clazz)
	glDisableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDrawArrays(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count) {
	glDrawArraysPROC glDrawArrays = (glDrawArraysPROC)tlsGetFunction(154);
	UNUSED_PARAM(clazz)
	glDrawArrays(mode, first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDrawElements(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress) {
	glDrawElementsPROC glDrawElements = (glDrawElementsPROC)tlsGetFunction(165);
	const intptr_t indices = (const intptr_t)indicesAddress;
	UNUSED_PARAM(clazz)
	glDrawElements(mode, count, type, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglEnable(JNIEnv *__env, jclass clazz, jint cap) {
	glEnablePROC glEnable = (glEnablePROC)tlsGetFunction(185);
	UNUSED_PARAM(clazz)
	glEnable(cap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglEnableVertexAttribArray(JNIEnv *__env, jclass clazz, jint index) {
	glEnableVertexAttribArrayPROC glEnableVertexAttribArray = (glEnableVertexAttribArrayPROC)tlsGetFunction(187);
	UNUSED_PARAM(clazz)
	glEnableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglFinish(JNIEnv *__env, jclass clazz) {
	glFinishPROC glFinish = (glFinishPROC)tlsGetFunction(213);
	UNUSED_PARAM(clazz)
	glFinish();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglFlush(JNIEnv *__env, jclass clazz) {
	glFlushPROC glFlush = (glFlushPROC)tlsGetFunction(215);
	UNUSED_PARAM(clazz)
	glFlush();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglFramebufferRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer) {
	glFramebufferRenderbufferPROC glFramebufferRenderbuffer = (glFramebufferRenderbufferPROC)tlsGetFunction(221);
	UNUSED_PARAM(clazz)
	glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglFramebufferTexture2D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
	glFramebufferTexture2DPROC glFramebufferTexture2D = (glFramebufferTexture2DPROC)tlsGetFunction(224);
	UNUSED_PARAM(clazz)
	glFramebufferTexture2D(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglFrontFace(JNIEnv *__env, jclass clazz, jint mode) {
	glFrontFacePROC glFrontFace = (glFrontFacePROC)tlsGetFunction(236);
	UNUSED_PARAM(clazz)
	glFrontFace(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenBuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress) {
	glGenBuffersPROC glGenBuffers = (glGenBuffersPROC)tlsGetFunction(237);
	intptr_t buffers = (intptr_t)buffersAddress;
	UNUSED_PARAM(clazz)
	glGenBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenerateMipmap(JNIEnv *__env, jclass clazz, jint target) {
	glGenerateMipmapPROC glGenerateMipmap = (glGenerateMipmapPROC)tlsGetFunction(252);
	UNUSED_PARAM(clazz)
	glGenerateMipmap(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
	glGenFramebuffersPROC glGenFramebuffers = (glGenFramebuffersPROC)tlsGetFunction(239);
	intptr_t framebuffers = (intptr_t)framebuffersAddress;
	UNUSED_PARAM(clazz)
	glGenFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
	glGenRenderbuffersPROC glGenRenderbuffers = (glGenRenderbuffersPROC)tlsGetFunction(246);
	intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
	UNUSED_PARAM(clazz)
	glGenRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenTextures__IJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress) {
	glGenTexturesPROC glGenTextures = (glGenTexturesPROC)tlsGetFunction(248);
	intptr_t textures = (intptr_t)texturesAddress;
	UNUSED_PARAM(clazz)
	glGenTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetActiveAttrib__IIIJJJJ(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
	glGetActiveAttribPROC glGetActiveAttrib = (glGetActiveAttribPROC)tlsGetFunction(253);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t size = (intptr_t)sizeAddress;
	intptr_t type = (intptr_t)typeAddress;
	intptr_t name = (intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	glGetActiveAttrib(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetActiveUniform__IIIJJJJ(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
	glGetActiveUniformPROC glGetActiveUniform = (glGetActiveUniformPROC)tlsGetFunction(254);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t size = (intptr_t)sizeAddress;
	intptr_t type = (intptr_t)typeAddress;
	intptr_t name = (intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	glGetActiveUniform(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetAttachedShaders__IIJJ(JNIEnv *__env, jclass clazz, jint program, jint maxCount, jlong countAddress, jlong shadersAddress) {
	glGetAttachedShadersPROC glGetAttachedShaders = (glGetAttachedShadersPROC)tlsGetFunction(258);
	intptr_t count = (intptr_t)countAddress;
	intptr_t shaders = (intptr_t)shadersAddress;
	UNUSED_PARAM(clazz)
	glGetAttachedShaders(program, maxCount, count, shaders);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglGetAttribLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
	glGetAttribLocationPROC glGetAttribLocation = (glGetAttribLocationPROC)tlsGetFunction(259);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetAttribLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetBooleanv(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress) {
	glGetBooleanvPROC glGetBooleanv = (glGetBooleanvPROC)tlsGetFunction(261);
	intptr_t data = (intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glGetBooleanv(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetBufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetBufferParameterivPROC glGetBufferParameteriv = (glGetBufferParameterivPROC)tlsGetFunction(263);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetBufferParameteriv(target, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglGetError(JNIEnv *__env, jclass clazz) {
	glGetErrorPROC glGetError = (glGetErrorPROC)tlsGetFunction(271);
	UNUSED_PARAM(clazz)
	return (jint)glGetError();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetFloatv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress) {
	glGetFloatvPROC glGetFloatv = (glGetFloatvPROC)tlsGetFunction(276);
	intptr_t data = (intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glGetFloatv(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetFramebufferAttachmentParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint pname, jlong paramsAddress) {
	glGetFramebufferAttachmentParameterivPROC glGetFramebufferAttachmentParameteriv = (glGetFramebufferAttachmentParameterivPROC)tlsGetFunction(279);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetIntegerv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress) {
	glGetIntegervPROC glGetIntegerv = (glGetIntegervPROC)tlsGetFunction(291);
	intptr_t data = (intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glGetIntegerv(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetProgramiv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint pname, jlong paramsAddress) {
	glGetProgramivPROC glGetProgramiv = (glGetProgramivPROC)tlsGetFunction(336);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetProgramiv(program, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetProgramInfoLog__IIJJ(JNIEnv *__env, jclass clazz, jint program, jint bufSize, jlong lengthAddress, jlong infoLogAddress) {
	glGetProgramInfoLogPROC glGetProgramInfoLog = (glGetProgramInfoLogPROC)tlsGetFunction(324);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t infoLog = (intptr_t)infoLogAddress;
	UNUSED_PARAM(clazz)
	glGetProgramInfoLog(program, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetRenderbufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetRenderbufferParameterivPROC glGetRenderbufferParameteriv = (glGetRenderbufferParameterivPROC)tlsGetFunction(344);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetRenderbufferParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderiv__IIJ(JNIEnv *__env, jclass clazz, jint shader, jint pname, jlong paramsAddress) {
	glGetShaderivPROC glGetShaderiv = (glGetShaderivPROC)tlsGetFunction(356);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetShaderiv(shader, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderInfoLog__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint bufSize, jlong lengthAddress, jlong infoLogAddress) {
	glGetShaderInfoLogPROC glGetShaderInfoLog = (glGetShaderInfoLogPROC)tlsGetFunction(353);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t infoLog = (intptr_t)infoLogAddress;
	UNUSED_PARAM(clazz)
	glGetShaderInfoLog(shader, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderPrecisionFormat__IIJJ(JNIEnv *__env, jclass clazz, jint shadertype, jint precisiontype, jlong rangeAddress, jlong precisionAddress) {
	glGetShaderPrecisionFormatPROC glGetShaderPrecisionFormat = (glGetShaderPrecisionFormatPROC)tlsGetFunction(354);
	intptr_t range = (intptr_t)rangeAddress;
	intptr_t precision = (intptr_t)precisionAddress;
	UNUSED_PARAM(clazz)
	glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderSource__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint bufSize, jlong lengthAddress, jlong sourceAddress) {
	glGetShaderSourcePROC glGetShaderSource = (glGetShaderSourcePROC)tlsGetFunction(355);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t source = (intptr_t)sourceAddress;
	UNUSED_PARAM(clazz)
	glGetShaderSource(shader, bufSize, length, source);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_GLES20_nglGetString(JNIEnv *__env, jclass clazz, jint name) {
	glGetStringPROC glGetString = (glGetStringPROC)tlsGetFunction(357);
	UNUSED_PARAM(clazz)
	return (jlong)glGetString(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetTexParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetTexParameterfvPROC glGetTexParameterfv = (glGetTexParameterfvPROC)tlsGetFunction(369);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetTexParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetTexParameterivPROC glGetTexParameteriv = (glGetTexParameterivPROC)tlsGetFunction(370);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetUniformfv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
	glGetUniformfvPROC glGetUniformfv = (glGetUniformfvPROC)tlsGetFunction(378);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetUniformfv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetUniformiv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
	glGetUniformivPROC glGetUniformiv = (glGetUniformivPROC)tlsGetFunction(380);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetUniformiv(program, location, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglGetUniformLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
	glGetUniformLocationPROC glGetUniformLocation = (glGetUniformLocationPROC)tlsGetFunction(377);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetUniformLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetVertexAttribfv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
	glGetVertexAttribfvPROC glGetVertexAttribfv = (glGetVertexAttribfvPROC)tlsGetFunction(386);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetVertexAttribfv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetVertexAttribiv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
	glGetVertexAttribivPROC glGetVertexAttribiv = (glGetVertexAttribivPROC)tlsGetFunction(387);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetVertexAttribiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetVertexAttribPointerv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong pointerAddress) {
	glGetVertexAttribPointervPROC glGetVertexAttribPointerv = (glGetVertexAttribPointervPROC)tlsGetFunction(385);
	intptr_t pointer = (intptr_t)pointerAddress;
	UNUSED_PARAM(clazz)
	glGetVertexAttribPointerv(index, pname, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglHint(JNIEnv *__env, jclass clazz, jint target, jint mode) {
	glHintPROC glHint = (glHintPROC)tlsGetFunction(396);
	UNUSED_PARAM(clazz)
	glHint(target, mode);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsBuffer(JNIEnv *__env, jclass clazz, jint buffer) {
	glIsBufferPROC glIsBuffer = (glIsBufferPROC)tlsGetFunction(401);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsBuffer(buffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsEnabled(JNIEnv *__env, jclass clazz, jint cap) {
	glIsEnabledPROC glIsEnabled = (glIsEnabledPROC)tlsGetFunction(402);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsEnabled(cap);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsFramebuffer(JNIEnv *__env, jclass clazz, jint framebuffer) {
	glIsFramebufferPROC glIsFramebuffer = (glIsFramebufferPROC)tlsGetFunction(408);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsFramebuffer(framebuffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsProgram(JNIEnv *__env, jclass clazz, jint program) {
	glIsProgramPROC glIsProgram = (glIsProgramPROC)tlsGetFunction(413);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsProgram(program);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsRenderbuffer(JNIEnv *__env, jclass clazz, jint renderbuffer) {
	glIsRenderbufferPROC glIsRenderbuffer = (glIsRenderbufferPROC)tlsGetFunction(418);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsRenderbuffer(renderbuffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsShader(JNIEnv *__env, jclass clazz, jint shader) {
	glIsShaderPROC glIsShader = (glIsShaderPROC)tlsGetFunction(420);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsShader(shader);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_nglIsTexture(JNIEnv *__env, jclass clazz, jint texture) {
	glIsTexturePROC glIsTexture = (glIsTexturePROC)tlsGetFunction(423);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsTexture(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglLineWidth(JNIEnv *__env, jclass clazz, jfloat width) {
	glLineWidthPROC glLineWidth = (glLineWidthPROC)tlsGetFunction(429);
	UNUSED_PARAM(clazz)
	glLineWidth(width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglLinkProgram(JNIEnv *__env, jclass clazz, jint program) {
	glLinkProgramPROC glLinkProgram = (glLinkProgramPROC)tlsGetFunction(430);
	UNUSED_PARAM(clazz)
	glLinkProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglPixelStorei(JNIEnv *__env, jclass clazz, jint pname, jint param) {
	glPixelStoreiPROC glPixelStorei = (glPixelStoreiPROC)tlsGetFunction(481);
	UNUSED_PARAM(clazz)
	glPixelStorei(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglPolygonOffset(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units) {
	glPolygonOffsetPROC glPolygonOffset = (glPolygonOffsetPROC)tlsGetFunction(484);
	UNUSED_PARAM(clazz)
	glPolygonOffset(factor, units);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglReadPixels__IIIIIIJ(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
	glReadPixelsPROC glReadPixels = (glReadPixelsPROC)tlsGetFunction(589);
	intptr_t pixels = (intptr_t)pixelsAddress;
	UNUSED_PARAM(clazz)
	glReadPixels(x, y, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglReleaseShaderCompiler(JNIEnv *__env, jclass clazz) {
	glReleaseShaderCompilerPROC glReleaseShaderCompiler = (glReleaseShaderCompilerPROC)tlsGetFunction(593);
	UNUSED_PARAM(clazz)
	glReleaseShaderCompiler();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglRenderbufferStorage(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height) {
	glRenderbufferStoragePROC glRenderbufferStorage = (glRenderbufferStoragePROC)tlsGetFunction(594);
	UNUSED_PARAM(clazz)
	glRenderbufferStorage(target, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglSampleCoverage(JNIEnv *__env, jclass clazz, jfloat value, jboolean invert) {
	glSampleCoveragePROC glSampleCoverage = (glSampleCoveragePROC)tlsGetFunction(604);
	UNUSED_PARAM(clazz)
	glSampleCoverage(value, invert);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglScissor(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height) {
	glScissorPROC glScissor = (glScissorPROC)tlsGetFunction(616);
	UNUSED_PARAM(clazz)
	glScissor(x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglShaderBinary__IJIJI(JNIEnv *__env, jclass clazz, jint count, jlong shadersAddress, jint binaryformat, jlong binaryAddress, jint length) {
	glShaderBinaryPROC glShaderBinary = (glShaderBinaryPROC)tlsGetFunction(625);
	const intptr_t shaders = (const intptr_t)shadersAddress;
	const intptr_t binary = (const intptr_t)binaryAddress;
	UNUSED_PARAM(clazz)
	glShaderBinary(count, shaders, binaryformat, binary, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglShaderSource__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint count, jlong stringAddress, jlong lengthAddress) {
	glShaderSourcePROC glShaderSource = (glShaderSourcePROC)tlsGetFunction(626);
	const intptr_t string = (const intptr_t)stringAddress;
	const intptr_t length = (const intptr_t)lengthAddress;
	UNUSED_PARAM(clazz)
	glShaderSource(shader, count, string, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilFunc(JNIEnv *__env, jclass clazz, jint func, jint ref, jint mask) {
	glStencilFuncPROC glStencilFunc = (glStencilFuncPROC)tlsGetFunction(630);
	UNUSED_PARAM(clazz)
	glStencilFunc(func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilFuncSeparate(JNIEnv *__env, jclass clazz, jint face, jint func, jint ref, jint mask) {
	glStencilFuncSeparatePROC glStencilFuncSeparate = (glStencilFuncSeparatePROC)tlsGetFunction(631);
	UNUSED_PARAM(clazz)
	glStencilFuncSeparate(face, func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilMask(JNIEnv *__env, jclass clazz, jint mask) {
	glStencilMaskPROC glStencilMask = (glStencilMaskPROC)tlsGetFunction(632);
	UNUSED_PARAM(clazz)
	glStencilMask(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilMaskSeparate(JNIEnv *__env, jclass clazz, jint face, jint mask) {
	glStencilMaskSeparatePROC glStencilMaskSeparate = (glStencilMaskSeparatePROC)tlsGetFunction(633);
	UNUSED_PARAM(clazz)
	glStencilMaskSeparate(face, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilOp(JNIEnv *__env, jclass clazz, jint fail, jint zfail, jint zpass) {
	glStencilOpPROC glStencilOp = (glStencilOpPROC)tlsGetFunction(634);
	UNUSED_PARAM(clazz)
	glStencilOp(fail, zfail, zpass);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglStencilOpSeparate(JNIEnv *__env, jclass clazz, jint face, jint sfail, jint dpfail, jint dppass) {
	glStencilOpSeparatePROC glStencilOpSeparate = (glStencilOpSeparatePROC)tlsGetFunction(635);
	UNUSED_PARAM(clazz)
	glStencilOpSeparate(face, sfail, dpfail, dppass);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexImage2D__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress) {
	glTexImage2DPROC glTexImage2D = (glTexImage2DPROC)tlsGetFunction(650);
	const intptr_t pixels = (const intptr_t)pixelsAddress;
	UNUSED_PARAM(clazz)
	glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexParameterf(JNIEnv *__env, jclass clazz, jint target, jint pname, jfloat param) {
	glTexParameterfPROC glTexParameterf = (glTexParameterfPROC)tlsGetFunction(661);
	UNUSED_PARAM(clazz)
	glTexParameterf(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glTexParameterfvPROC glTexParameterfv = (glTexParameterfvPROC)tlsGetFunction(662);
	const intptr_t params = (const intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
	glTexParameteriPROC glTexParameteri = (glTexParameteriPROC)tlsGetFunction(663);
	UNUSED_PARAM(clazz)
	glTexParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glTexParameterivPROC glTexParameteriv = (glTexParameterivPROC)tlsGetFunction(664);
	const intptr_t params = (const intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexSubImage2D__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
	glTexSubImage2DPROC glTexSubImage2D = (glTexSubImage2DPROC)tlsGetFunction(673);
	const intptr_t pixels = (const intptr_t)pixelsAddress;
	UNUSED_PARAM(clazz)
	glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform1f(JNIEnv *__env, jclass clazz, jint location, jfloat v0) {
	glUniform1fPROC glUniform1f = (glUniform1fPROC)tlsGetFunction(685);
	UNUSED_PARAM(clazz)
	glUniform1f(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform1fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform1fvPROC glUniform1fv = (glUniform1fvPROC)tlsGetFunction(686);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform1fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform1i(JNIEnv *__env, jclass clazz, jint location, jint v0) {
	glUniform1iPROC glUniform1i = (glUniform1iPROC)tlsGetFunction(687);
	UNUSED_PARAM(clazz)
	glUniform1i(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform1iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform1ivPROC glUniform1iv = (glUniform1ivPROC)tlsGetFunction(690);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform1iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform2f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1) {
	glUniform2fPROC glUniform2f = (glUniform2fPROC)tlsGetFunction(695);
	UNUSED_PARAM(clazz)
	glUniform2f(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform2fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform2fvPROC glUniform2fv = (glUniform2fvPROC)tlsGetFunction(696);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform2fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform2i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1) {
	glUniform2iPROC glUniform2i = (glUniform2iPROC)tlsGetFunction(697);
	UNUSED_PARAM(clazz)
	glUniform2i(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform2iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform2ivPROC glUniform2iv = (glUniform2ivPROC)tlsGetFunction(700);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform2iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform3f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2) {
	glUniform3fPROC glUniform3f = (glUniform3fPROC)tlsGetFunction(705);
	UNUSED_PARAM(clazz)
	glUniform3f(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform3fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform3fvPROC glUniform3fv = (glUniform3fvPROC)tlsGetFunction(706);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform3fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform3i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2) {
	glUniform3iPROC glUniform3i = (glUniform3iPROC)tlsGetFunction(707);
	UNUSED_PARAM(clazz)
	glUniform3i(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform3iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform3ivPROC glUniform3iv = (glUniform3ivPROC)tlsGetFunction(710);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform3iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform4f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
	glUniform4fPROC glUniform4f = (glUniform4fPROC)tlsGetFunction(715);
	UNUSED_PARAM(clazz)
	glUniform4f(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform4fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform4fvPROC glUniform4fv = (glUniform4fvPROC)tlsGetFunction(716);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform4fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform4i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3) {
	glUniform4iPROC glUniform4i = (glUniform4iPROC)tlsGetFunction(717);
	UNUSED_PARAM(clazz)
	glUniform4i(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform4iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform4ivPROC glUniform4iv = (glUniform4ivPROC)tlsGetFunction(720);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform4iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniformMatrix2fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix2fvPROC glUniformMatrix2fv = (glUniformMatrix2fvPROC)tlsGetFunction(728);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniformMatrix3fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix3fvPROC glUniformMatrix3fv = (glUniformMatrix3fvPROC)tlsGetFunction(733);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix3fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniformMatrix4fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix4fvPROC glUniformMatrix4fv = (glUniformMatrix4fvPROC)tlsGetFunction(738);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUseProgram(JNIEnv *__env, jclass clazz, jint program) {
	glUseProgramPROC glUseProgram = (glUseProgramPROC)tlsGetFunction(745);
	UNUSED_PARAM(clazz)
	glUseProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglValidateProgram(JNIEnv *__env, jclass clazz, jint program) {
	glValidateProgramPROC glValidateProgram = (glValidateProgramPROC)tlsGetFunction(748);
	UNUSED_PARAM(clazz)
	glValidateProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib1f(JNIEnv *__env, jclass clazz, jint index, jfloat x) {
	glVertexAttrib1fPROC glVertexAttrib1f = (glVertexAttrib1fPROC)tlsGetFunction(751);
	UNUSED_PARAM(clazz)
	glVertexAttrib1f(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib1fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib1fvPROC glVertexAttrib1fv = (glVertexAttrib1fvPROC)tlsGetFunction(752);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib1fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib2f(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y) {
	glVertexAttrib2fPROC glVertexAttrib2f = (glVertexAttrib2fPROC)tlsGetFunction(753);
	UNUSED_PARAM(clazz)
	glVertexAttrib2f(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib2fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib2fvPROC glVertexAttrib2fv = (glVertexAttrib2fvPROC)tlsGetFunction(754);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib2fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib3f(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat z) {
	glVertexAttrib3fPROC glVertexAttrib3f = (glVertexAttrib3fPROC)tlsGetFunction(755);
	UNUSED_PARAM(clazz)
	glVertexAttrib3f(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib3fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib3fvPROC glVertexAttrib3fv = (glVertexAttrib3fvPROC)tlsGetFunction(756);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib3fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib4f(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat z, jfloat w) {
	glVertexAttrib4fPROC glVertexAttrib4f = (glVertexAttrib4fPROC)tlsGetFunction(757);
	UNUSED_PARAM(clazz)
	glVertexAttrib4f(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib4fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4fvPROC glVertexAttrib4fv = (glVertexAttrib4fvPROC)tlsGetFunction(758);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttribPointer__IIIZIJ(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jboolean normalized, jint stride, jlong pointerAddress) {
	glVertexAttribPointerPROC glVertexAttribPointer = (glVertexAttribPointerPROC)tlsGetFunction(771);
	const intptr_t pointer = (const intptr_t)pointerAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribPointer(index, size, type, normalized, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglViewport(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height) {
	glViewportPROC glViewport = (glViewportPROC)tlsGetFunction(773);
	UNUSED_PARAM(clazz)
	glViewport(x, y, width, height);
}

EXTERN_C_EXIT
