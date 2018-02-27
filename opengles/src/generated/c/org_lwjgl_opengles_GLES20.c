/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glActiveTexturePROC) (jint);
typedef void (APIENTRY *glAttachShaderPROC) (jint, jint);
typedef void (APIENTRY *glBindAttribLocationPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glBindBufferPROC) (jint, jint);
typedef void (APIENTRY *glBindFramebufferPROC) (jint, jint);
typedef void (APIENTRY *glBindRenderbufferPROC) (jint, jint);
typedef void (APIENTRY *glBindTexturePROC) (jint, jint);
typedef void (APIENTRY *glBlendColorPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glBlendEquationPROC) (jint);
typedef void (APIENTRY *glBlendEquationSeparatePROC) (jint, jint);
typedef void (APIENTRY *glBlendFuncPROC) (jint, jint);
typedef void (APIENTRY *glBlendFuncSeparatePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glBufferDataPROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glBufferSubDataPROC) (jint, intptr_t, intptr_t, intptr_t);
typedef jint (APIENTRY *glCheckFramebufferStatusPROC) (jint);
typedef void (APIENTRY *glClearPROC) (jint);
typedef void (APIENTRY *glClearColorPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glClearDepthfPROC) (jfloat);
typedef void (APIENTRY *glClearStencilPROC) (jint);
typedef void (APIENTRY *glColorMaskPROC) (jboolean, jboolean, jboolean, jboolean);
typedef void (APIENTRY *glCompileShaderPROC) (jint);
typedef void (APIENTRY *glCompressedTexImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCompressedTexSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCopyTexImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTexSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef jint (APIENTRY *glCreateProgramPROC) (void);
typedef jint (APIENTRY *glCreateShaderPROC) (jint);
typedef void (APIENTRY *glCullFacePROC) (jint);
typedef void (APIENTRY *glDeleteBuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteFramebuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteProgramPROC) (jint);
typedef void (APIENTRY *glDeleteRenderbuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteShaderPROC) (jint);
typedef void (APIENTRY *glDeleteTexturesPROC) (jint, intptr_t);
typedef void (APIENTRY *glDepthFuncPROC) (jint);
typedef void (APIENTRY *glDepthMaskPROC) (jboolean);
typedef void (APIENTRY *glDepthRangefPROC) (jfloat, jfloat);
typedef void (APIENTRY *glDetachShaderPROC) (jint, jint);
typedef void (APIENTRY *glDisablePROC) (jint);
typedef void (APIENTRY *glDisableVertexAttribArrayPROC) (jint);
typedef void (APIENTRY *glDrawArraysPROC) (jint, jint, jint);
typedef void (APIENTRY *glDrawElementsPROC) (jint, jint, jint, intptr_t);
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
typedef jint (APIENTRY *glGetAttribLocationPROC) (jint, intptr_t);
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
typedef jint (APIENTRY *glGetUniformLocationPROC) (jint, intptr_t);
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
typedef void (APIENTRY *glShaderBinaryPROC) (jint, intptr_t, jint, intptr_t, jint);
typedef void (APIENTRY *glShaderSourcePROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glStencilFuncPROC) (jint, jint, jint);
typedef void (APIENTRY *glStencilFuncSeparatePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glStencilMaskPROC) (jint);
typedef void (APIENTRY *glStencilMaskSeparatePROC) (jint, jint);
typedef void (APIENTRY *glStencilOpPROC) (jint, jint, jint);
typedef void (APIENTRY *glStencilOpSeparatePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTexImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glTexParameterfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glTexParameterfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTexParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTexSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glUniform1fPROC) (jint, jfloat);
typedef void (APIENTRY *glUniform1fvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform1iPROC) (jint, jint);
typedef void (APIENTRY *glUniform1ivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform2fPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glUniform2fvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform2iPROC) (jint, jint, jint);
typedef void (APIENTRY *glUniform2ivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform3fPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glUniform3fvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform3iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glUniform3ivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform4fPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glUniform4fvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform4iPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glUniform4ivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniformMatrix2fvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix3fvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix4fvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUseProgramPROC) (jint);
typedef void (APIENTRY *glValidateProgramPROC) (jint);
typedef void (APIENTRY *glVertexAttrib1fPROC) (jint, jfloat);
typedef void (APIENTRY *glVertexAttrib1fvPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttrib2fPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib2fvPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttrib3fPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib3fvPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttrib4fPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib4fvPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribPointerPROC) (jint, jint, jint, jboolean, jint, intptr_t);
typedef void (APIENTRY *glViewportPROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glActiveTexture(JNIEnv *__env, jclass clazz, jint texture) {
    glActiveTexturePROC glActiveTexture = (glActiveTexturePROC)tlsGetFunction(3);
    UNUSED_PARAM(clazz)
    glActiveTexture(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glAttachShader(JNIEnv *__env, jclass clazz, jint program, jint shader) {
    glAttachShaderPROC glAttachShader = (glAttachShaderPROC)tlsGetFunction(7);
    UNUSED_PARAM(clazz)
    glAttachShader(program, shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBindAttribLocation(JNIEnv *__env, jclass clazz, jint program, jint index, jlong nameAddress) {
    glBindAttribLocationPROC glBindAttribLocation = (glBindAttribLocationPROC)tlsGetFunction(14);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glBindAttribLocation(program, index, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glBindBuffer(JNIEnv *__env, jclass clazz, jint target, jint buffer) {
    glBindBufferPROC glBindBuffer = (glBindBufferPROC)tlsGetFunction(15);
    UNUSED_PARAM(clazz)
    glBindBuffer(target, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glBindFramebuffer(JNIEnv *__env, jclass clazz, jint target, jint framebuffer) {
    glBindFramebufferPROC glBindFramebuffer = (glBindFramebufferPROC)tlsGetFunction(20);
    UNUSED_PARAM(clazz)
    glBindFramebuffer(target, framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glBindRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer) {
    glBindRenderbufferPROC glBindRenderbuffer = (glBindRenderbufferPROC)tlsGetFunction(24);
    UNUSED_PARAM(clazz)
    glBindRenderbuffer(target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glBindTexture(JNIEnv *__env, jclass clazz, jint target, jint texture) {
    glBindTexturePROC glBindTexture = (glBindTexturePROC)tlsGetFunction(26);
    UNUSED_PARAM(clazz)
    glBindTexture(target, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glBlendColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    glBlendColorPROC glBlendColor = (glBlendColorPROC)tlsGetFunction(34);
    UNUSED_PARAM(clazz)
    glBlendColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glBlendEquation(JNIEnv *__env, jclass clazz, jint mode) {
    glBlendEquationPROC glBlendEquation = (glBlendEquationPROC)tlsGetFunction(35);
    UNUSED_PARAM(clazz)
    glBlendEquation(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glBlendEquationSeparate(JNIEnv *__env, jclass clazz, jint modeRGB, jint modeAlpha) {
    glBlendEquationSeparatePROC glBlendEquationSeparate = (glBlendEquationSeparatePROC)tlsGetFunction(36);
    UNUSED_PARAM(clazz)
    glBlendEquationSeparate(modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glBlendFunc(JNIEnv *__env, jclass clazz, jint sfactor, jint dfactor) {
    glBlendFuncPROC glBlendFunc = (glBlendFuncPROC)tlsGetFunction(43);
    UNUSED_PARAM(clazz)
    glBlendFunc(sfactor, dfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glBlendFuncSeparate(JNIEnv *__env, jclass clazz, jint sfactorRGB, jint dfactorRGB, jint sfactorAlpha, jint dfactorAlpha) {
    glBlendFuncSeparatePROC glBlendFuncSeparate = (glBlendFuncSeparatePROC)tlsGetFunction(44);
    UNUSED_PARAM(clazz)
    glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBufferData__IJJI(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint usage) {
    glBufferDataPROC glBufferData = (glBufferDataPROC)tlsGetFunction(55);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glBufferData(target, (intptr_t)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglBufferSubData__IJJJ(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress) {
    glBufferSubDataPROC glBufferSubData = (glBufferSubDataPROC)tlsGetFunction(59);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glBufferSubData(target, (intptr_t)offset, (intptr_t)size, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_glCheckFramebufferStatus(JNIEnv *__env, jclass clazz, jint target) {
    glCheckFramebufferStatusPROC glCheckFramebufferStatus = (glCheckFramebufferStatusPROC)tlsGetFunction(60);
    UNUSED_PARAM(clazz)
    return (jint)glCheckFramebufferStatus(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glClear(JNIEnv *__env, jclass clazz, jint mask) {
    glClearPROC glClear = (glClearPROC)tlsGetFunction(61);
    UNUSED_PARAM(clazz)
    glClear(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glClearColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    glClearColorPROC glClearColor = (glClearColorPROC)tlsGetFunction(66);
    UNUSED_PARAM(clazz)
    glClearColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glClearDepthf(JNIEnv *__env, jclass clazz, jfloat d) {
    glClearDepthfPROC glClearDepthf = (glClearDepthfPROC)tlsGetFunction(67);
    UNUSED_PARAM(clazz)
    glClearDepthf(d);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glClearStencil(JNIEnv *__env, jclass clazz, jint s) {
    glClearStencilPROC glClearStencil = (glClearStencilPROC)tlsGetFunction(69);
    UNUSED_PARAM(clazz)
    glClearStencil(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glColorMask(JNIEnv *__env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {
    glColorMaskPROC glColorMask = (glColorMaskPROC)tlsGetFunction(75);
    UNUSED_PARAM(clazz)
    glColorMask(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glCompileShader(JNIEnv *__env, jclass clazz, jint shader) {
    glCompileShaderPROC glCompileShader = (glCompileShaderPROC)tlsGetFunction(79);
    UNUSED_PARAM(clazz)
    glCompileShader(shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCompressedTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTexImage2DPROC glCompressedTexImage2D = (glCompressedTexImage2DPROC)tlsGetFunction(80);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglCompressedTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTexSubImage2DPROC glCompressedTexSubImage2D = (glCompressedTexSubImage2DPROC)tlsGetFunction(84);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glCopyTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {
    glCopyTexImage2DPROC glCopyTexImage2D = (glCopyTexImage2DPROC)tlsGetFunction(95);
    UNUSED_PARAM(clazz)
    glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glCopyTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
    glCopyTexSubImage2DPROC glCopyTexSubImage2D = (glCopyTexSubImage2DPROC)tlsGetFunction(96);
    UNUSED_PARAM(clazz)
    glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_glCreateProgram(JNIEnv *__env, jclass clazz) {
    glCreateProgramPROC glCreateProgram = (glCreateProgramPROC)tlsGetFunction(111);
    UNUSED_PARAM(clazz)
    return (jint)glCreateProgram();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_glCreateShader(JNIEnv *__env, jclass clazz, jint type) {
    glCreateShaderPROC glCreateShader = (glCreateShaderPROC)tlsGetFunction(112);
    UNUSED_PARAM(clazz)
    return (jint)glCreateShader(type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glCullFace(JNIEnv *__env, jclass clazz, jint mode) {
    glCullFacePROC glCullFace = (glCullFacePROC)tlsGetFunction(115);
    UNUSED_PARAM(clazz)
    glCullFace(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteBuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress) {
    glDeleteBuffersPROC glDeleteBuffers = (glDeleteBuffersPROC)tlsGetFunction(122);
    intptr_t buffers = (intptr_t)buffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glDeleteFramebuffersPROC glDeleteFramebuffers = (glDeleteFramebuffersPROC)tlsGetFunction(124);
    intptr_t framebuffers = (intptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glDeleteProgram(JNIEnv *__env, jclass clazz, jint program) {
    glDeleteProgramPROC glDeleteProgram = (glDeleteProgramPROC)tlsGetFunction(129);
    UNUSED_PARAM(clazz)
    glDeleteProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glDeleteRenderbuffersPROC glDeleteRenderbuffers = (glDeleteRenderbuffersPROC)tlsGetFunction(134);
    intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glDeleteShader(JNIEnv *__env, jclass clazz, jint shader) {
    glDeleteShaderPROC glDeleteShader = (glDeleteShaderPROC)tlsGetFunction(137);
    UNUSED_PARAM(clazz)
    glDeleteShader(shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDeleteTextures__IJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress) {
    glDeleteTexturesPROC glDeleteTextures = (glDeleteTexturesPROC)tlsGetFunction(140);
    intptr_t textures = (intptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glDeleteTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glDepthFunc(JNIEnv *__env, jclass clazz, jint func) {
    glDepthFuncPROC glDepthFunc = (glDepthFuncPROC)tlsGetFunction(144);
    UNUSED_PARAM(clazz)
    glDepthFunc(func);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glDepthMask(JNIEnv *__env, jclass clazz, jboolean flag) {
    glDepthMaskPROC glDepthMask = (glDepthMaskPROC)tlsGetFunction(145);
    UNUSED_PARAM(clazz)
    glDepthMask(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glDepthRangef(JNIEnv *__env, jclass clazz, jfloat n, jfloat f) {
    glDepthRangefPROC glDepthRangef = (glDepthRangefPROC)tlsGetFunction(150);
    UNUSED_PARAM(clazz)
    glDepthRangef(n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glDetachShader(JNIEnv *__env, jclass clazz, jint program, jint shader) {
    glDetachShaderPROC glDetachShader = (glDetachShaderPROC)tlsGetFunction(151);
    UNUSED_PARAM(clazz)
    glDetachShader(program, shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glDisable(JNIEnv *__env, jclass clazz, jint cap) {
    glDisablePROC glDisable = (glDisablePROC)tlsGetFunction(152);
    UNUSED_PARAM(clazz)
    glDisable(cap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glDisableVertexAttribArray(JNIEnv *__env, jclass clazz, jint index) {
    glDisableVertexAttribArrayPROC glDisableVertexAttribArray = (glDisableVertexAttribArrayPROC)tlsGetFunction(154);
    UNUSED_PARAM(clazz)
    glDisableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glDrawArrays(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count) {
    glDrawArraysPROC glDrawArrays = (glDrawArraysPROC)tlsGetFunction(162);
    UNUSED_PARAM(clazz)
    glDrawArrays(mode, first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglDrawElements(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress) {
    glDrawElementsPROC glDrawElements = (glDrawElementsPROC)tlsGetFunction(173);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElements(mode, count, type, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glEnable(JNIEnv *__env, jclass clazz, jint cap) {
    glEnablePROC glEnable = (glEnablePROC)tlsGetFunction(196);
    UNUSED_PARAM(clazz)
    glEnable(cap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glEnableVertexAttribArray(JNIEnv *__env, jclass clazz, jint index) {
    glEnableVertexAttribArrayPROC glEnableVertexAttribArray = (glEnableVertexAttribArrayPROC)tlsGetFunction(198);
    UNUSED_PARAM(clazz)
    glEnableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glFinish(JNIEnv *__env, jclass clazz) {
    glFinishPROC glFinish = (glFinishPROC)tlsGetFunction(224);
    UNUSED_PARAM(clazz)
    glFinish();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glFlush(JNIEnv *__env, jclass clazz) {
    glFlushPROC glFlush = (glFlushPROC)tlsGetFunction(226);
    UNUSED_PARAM(clazz)
    glFlush();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glFramebufferRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer) {
    glFramebufferRenderbufferPROC glFramebufferRenderbuffer = (glFramebufferRenderbufferPROC)tlsGetFunction(235);
    UNUSED_PARAM(clazz)
    glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glFramebufferTexture2D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
    glFramebufferTexture2DPROC glFramebufferTexture2D = (glFramebufferTexture2DPROC)tlsGetFunction(238);
    UNUSED_PARAM(clazz)
    glFramebufferTexture2D(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glFrontFace(JNIEnv *__env, jclass clazz, jint mode) {
    glFrontFacePROC glFrontFace = (glFrontFacePROC)tlsGetFunction(250);
    UNUSED_PARAM(clazz)
    glFrontFace(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenBuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress) {
    glGenBuffersPROC glGenBuffers = (glGenBuffersPROC)tlsGetFunction(251);
    intptr_t buffers = (intptr_t)buffersAddress;
    UNUSED_PARAM(clazz)
    glGenBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glGenerateMipmap(JNIEnv *__env, jclass clazz, jint target) {
    glGenerateMipmapPROC glGenerateMipmap = (glGenerateMipmapPROC)tlsGetFunction(267);
    UNUSED_PARAM(clazz)
    glGenerateMipmap(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glGenFramebuffersPROC glGenFramebuffers = (glGenFramebuffersPROC)tlsGetFunction(253);
    intptr_t framebuffers = (intptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glGenFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glGenRenderbuffersPROC glGenRenderbuffers = (glGenRenderbuffersPROC)tlsGetFunction(260);
    intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glGenRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGenTextures__IJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress) {
    glGenTexturesPROC glGenTextures = (glGenTexturesPROC)tlsGetFunction(263);
    intptr_t textures = (intptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glGenTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetActiveAttrib__IIIJJJJ(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
    glGetActiveAttribPROC glGetActiveAttrib = (glGetActiveAttribPROC)tlsGetFunction(268);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t size = (intptr_t)sizeAddress;
    intptr_t type = (intptr_t)typeAddress;
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetActiveAttrib(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetActiveUniform__IIIJJJJ(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
    glGetActiveUniformPROC glGetActiveUniform = (glGetActiveUniformPROC)tlsGetFunction(269);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t size = (intptr_t)sizeAddress;
    intptr_t type = (intptr_t)typeAddress;
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetActiveUniform(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetAttachedShaders__IIJJ(JNIEnv *__env, jclass clazz, jint program, jint maxCount, jlong countAddress, jlong shadersAddress) {
    glGetAttachedShadersPROC glGetAttachedShaders = (glGetAttachedShadersPROC)tlsGetFunction(273);
    intptr_t count = (intptr_t)countAddress;
    intptr_t shaders = (intptr_t)shadersAddress;
    UNUSED_PARAM(clazz)
    glGetAttachedShaders(program, maxCount, count, shaders);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglGetAttribLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
    glGetAttribLocationPROC glGetAttribLocation = (glGetAttribLocationPROC)tlsGetFunction(274);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetAttribLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetBooleanv(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress) {
    glGetBooleanvPROC glGetBooleanv = (glGetBooleanvPROC)tlsGetFunction(276);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetBooleanv(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetBufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetBufferParameterivPROC glGetBufferParameteriv = (glGetBufferParameterivPROC)tlsGetFunction(278);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetBufferParameteriv(target, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_glGetError(JNIEnv *__env, jclass clazz) {
    glGetErrorPROC glGetError = (glGetErrorPROC)tlsGetFunction(286);
    UNUSED_PARAM(clazz)
    return (jint)glGetError();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetFloatv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress) {
    glGetFloatvPROC glGetFloatv = (glGetFloatvPROC)tlsGetFunction(291);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetFloatv(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetFramebufferAttachmentParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint pname, jlong paramsAddress) {
    glGetFramebufferAttachmentParameterivPROC glGetFramebufferAttachmentParameteriv = (glGetFramebufferAttachmentParameterivPROC)tlsGetFunction(294);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetIntegerv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress) {
    glGetIntegervPROC glGetIntegerv = (glGetIntegervPROC)tlsGetFunction(306);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetIntegerv(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetProgramiv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint pname, jlong paramsAddress) {
    glGetProgramivPROC glGetProgramiv = (glGetProgramivPROC)tlsGetFunction(352);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramiv(program, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetProgramInfoLog__IIJJ(JNIEnv *__env, jclass clazz, jint program, jint bufSize, jlong lengthAddress, jlong infoLogAddress) {
    glGetProgramInfoLogPROC glGetProgramInfoLog = (glGetProgramInfoLogPROC)tlsGetFunction(340);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t infoLog = (intptr_t)infoLogAddress;
    UNUSED_PARAM(clazz)
    glGetProgramInfoLog(program, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetRenderbufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetRenderbufferParameterivPROC glGetRenderbufferParameteriv = (glGetRenderbufferParameterivPROC)tlsGetFunction(360);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetRenderbufferParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderiv__IIJ(JNIEnv *__env, jclass clazz, jint shader, jint pname, jlong paramsAddress) {
    glGetShaderivPROC glGetShaderiv = (glGetShaderivPROC)tlsGetFunction(373);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetShaderiv(shader, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderInfoLog__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint bufSize, jlong lengthAddress, jlong infoLogAddress) {
    glGetShaderInfoLogPROC glGetShaderInfoLog = (glGetShaderInfoLogPROC)tlsGetFunction(370);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t infoLog = (intptr_t)infoLogAddress;
    UNUSED_PARAM(clazz)
    glGetShaderInfoLog(shader, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderPrecisionFormat__IIJJ(JNIEnv *__env, jclass clazz, jint shadertype, jint precisiontype, jlong rangeAddress, jlong precisionAddress) {
    glGetShaderPrecisionFormatPROC glGetShaderPrecisionFormat = (glGetShaderPrecisionFormatPROC)tlsGetFunction(371);
    intptr_t range = (intptr_t)rangeAddress;
    intptr_t precision = (intptr_t)precisionAddress;
    UNUSED_PARAM(clazz)
    glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetShaderSource__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint bufSize, jlong lengthAddress, jlong sourceAddress) {
    glGetShaderSourcePROC glGetShaderSource = (glGetShaderSourcePROC)tlsGetFunction(372);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t source = (intptr_t)sourceAddress;
    UNUSED_PARAM(clazz)
    glGetShaderSource(shader, bufSize, length, source);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_GLES20_nglGetString(JNIEnv *__env, jclass clazz, jint name) {
    glGetStringPROC glGetString = (glGetStringPROC)tlsGetFunction(374);
    UNUSED_PARAM(clazz)
    return (jlong)glGetString(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetTexParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterfvPROC glGetTexParameterfv = (glGetTexParameterfvPROC)tlsGetFunction(386);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetTexParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterivPROC glGetTexParameteriv = (glGetTexParameterivPROC)tlsGetFunction(387);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetUniformfv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
    glGetUniformfvPROC glGetUniformfv = (glGetUniformfvPROC)tlsGetFunction(395);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformfv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetUniformiv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
    glGetUniformivPROC glGetUniformiv = (glGetUniformivPROC)tlsGetFunction(397);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformiv(program, location, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES20_nglGetUniformLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
    glGetUniformLocationPROC glGetUniformLocation = (glGetUniformLocationPROC)tlsGetFunction(394);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetUniformLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetVertexAttribfv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribfvPROC glGetVertexAttribfv = (glGetVertexAttribfvPROC)tlsGetFunction(405);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribfv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetVertexAttribiv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribivPROC glGetVertexAttribiv = (glGetVertexAttribivPROC)tlsGetFunction(406);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglGetVertexAttribPointerv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong pointerAddress) {
    glGetVertexAttribPointervPROC glGetVertexAttribPointerv = (glGetVertexAttribPointervPROC)tlsGetFunction(404);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribPointerv(index, pname, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glHint(JNIEnv *__env, jclass clazz, jint target, jint mode) {
    glHintPROC glHint = (glHintPROC)tlsGetFunction(416);
    UNUSED_PARAM(clazz)
    glHint(target, mode);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_glIsBuffer(JNIEnv *__env, jclass clazz, jint buffer) {
    glIsBufferPROC glIsBuffer = (glIsBufferPROC)tlsGetFunction(427);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsBuffer(buffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_glIsEnabled(JNIEnv *__env, jclass clazz, jint cap) {
    glIsEnabledPROC glIsEnabled = (glIsEnabledPROC)tlsGetFunction(428);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsEnabled(cap);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_glIsFramebuffer(JNIEnv *__env, jclass clazz, jint framebuffer) {
    glIsFramebufferPROC glIsFramebuffer = (glIsFramebufferPROC)tlsGetFunction(434);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsFramebuffer(framebuffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_glIsProgram(JNIEnv *__env, jclass clazz, jint program) {
    glIsProgramPROC glIsProgram = (glIsProgramPROC)tlsGetFunction(440);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsProgram(program);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_glIsRenderbuffer(JNIEnv *__env, jclass clazz, jint renderbuffer) {
    glIsRenderbufferPROC glIsRenderbuffer = (glIsRenderbufferPROC)tlsGetFunction(445);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsRenderbuffer(renderbuffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_glIsShader(JNIEnv *__env, jclass clazz, jint shader) {
    glIsShaderPROC glIsShader = (glIsShaderPROC)tlsGetFunction(448);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsShader(shader);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES20_glIsTexture(JNIEnv *__env, jclass clazz, jint texture) {
    glIsTexturePROC glIsTexture = (glIsTexturePROC)tlsGetFunction(451);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsTexture(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glLineWidth(JNIEnv *__env, jclass clazz, jfloat width) {
    glLineWidthPROC glLineWidth = (glLineWidthPROC)tlsGetFunction(457);
    UNUSED_PARAM(clazz)
    glLineWidth(width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glLinkProgram(JNIEnv *__env, jclass clazz, jint program) {
    glLinkProgramPROC glLinkProgram = (glLinkProgramPROC)tlsGetFunction(458);
    UNUSED_PARAM(clazz)
    glLinkProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glPixelStorei(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glPixelStoreiPROC glPixelStorei = (glPixelStoreiPROC)tlsGetFunction(514);
    UNUSED_PARAM(clazz)
    glPixelStorei(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glPolygonOffset(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units) {
    glPolygonOffsetPROC glPolygonOffset = (glPolygonOffsetPROC)tlsGetFunction(517);
    UNUSED_PARAM(clazz)
    glPolygonOffset(factor, units);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglReadPixels__IIIIIIJ(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glReadPixelsPROC glReadPixels = (glReadPixelsPROC)tlsGetFunction(622);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glReadPixels(x, y, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glReleaseShaderCompiler(JNIEnv *__env, jclass clazz) {
    glReleaseShaderCompilerPROC glReleaseShaderCompiler = (glReleaseShaderCompilerPROC)tlsGetFunction(627);
    UNUSED_PARAM(clazz)
    glReleaseShaderCompiler();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glRenderbufferStorage(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height) {
    glRenderbufferStoragePROC glRenderbufferStorage = (glRenderbufferStoragePROC)tlsGetFunction(628);
    UNUSED_PARAM(clazz)
    glRenderbufferStorage(target, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glSampleCoverage(JNIEnv *__env, jclass clazz, jfloat value, jboolean invert) {
    glSampleCoveragePROC glSampleCoverage = (glSampleCoveragePROC)tlsGetFunction(638);
    UNUSED_PARAM(clazz)
    glSampleCoverage(value, invert);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glScissor(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height) {
    glScissorPROC glScissor = (glScissorPROC)tlsGetFunction(650);
    UNUSED_PARAM(clazz)
    glScissor(x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglShaderBinary__IJIJI(JNIEnv *__env, jclass clazz, jint count, jlong shadersAddress, jint binaryformat, jlong binaryAddress, jint length) {
    glShaderBinaryPROC glShaderBinary = (glShaderBinaryPROC)tlsGetFunction(660);
    intptr_t shaders = (intptr_t)shadersAddress;
    intptr_t binary = (intptr_t)binaryAddress;
    UNUSED_PARAM(clazz)
    glShaderBinary(count, shaders, binaryformat, binary, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglShaderSource__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint count, jlong stringAddress, jlong lengthAddress) {
    glShaderSourcePROC glShaderSource = (glShaderSourcePROC)tlsGetFunction(661);
    intptr_t string = (intptr_t)stringAddress;
    intptr_t length = (intptr_t)lengthAddress;
    UNUSED_PARAM(clazz)
    glShaderSource(shader, count, string, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glStencilFunc(JNIEnv *__env, jclass clazz, jint func, jint ref, jint mask) {
    glStencilFuncPROC glStencilFunc = (glStencilFuncPROC)tlsGetFunction(668);
    UNUSED_PARAM(clazz)
    glStencilFunc(func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glStencilFuncSeparate(JNIEnv *__env, jclass clazz, jint face, jint func, jint ref, jint mask) {
    glStencilFuncSeparatePROC glStencilFuncSeparate = (glStencilFuncSeparatePROC)tlsGetFunction(669);
    UNUSED_PARAM(clazz)
    glStencilFuncSeparate(face, func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glStencilMask(JNIEnv *__env, jclass clazz, jint mask) {
    glStencilMaskPROC glStencilMask = (glStencilMaskPROC)tlsGetFunction(670);
    UNUSED_PARAM(clazz)
    glStencilMask(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glStencilMaskSeparate(JNIEnv *__env, jclass clazz, jint face, jint mask) {
    glStencilMaskSeparatePROC glStencilMaskSeparate = (glStencilMaskSeparatePROC)tlsGetFunction(671);
    UNUSED_PARAM(clazz)
    glStencilMaskSeparate(face, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glStencilOp(JNIEnv *__env, jclass clazz, jint fail, jint zfail, jint zpass) {
    glStencilOpPROC glStencilOp = (glStencilOpPROC)tlsGetFunction(672);
    UNUSED_PARAM(clazz)
    glStencilOp(fail, zfail, zpass);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glStencilOpSeparate(JNIEnv *__env, jclass clazz, jint face, jint sfail, jint dpfail, jint dppass) {
    glStencilOpSeparatePROC glStencilOpSeparate = (glStencilOpSeparatePROC)tlsGetFunction(673);
    UNUSED_PARAM(clazz)
    glStencilOpSeparate(face, sfail, dpfail, dppass);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexImage2D__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress) {
    glTexImage2DPROC glTexImage2D = (glTexImage2DPROC)tlsGetFunction(688);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glTexParameterf(JNIEnv *__env, jclass clazz, jint target, jint pname, jfloat param) {
    glTexParameterfPROC glTexParameterf = (glTexParameterfPROC)tlsGetFunction(699);
    UNUSED_PARAM(clazz)
    glTexParameterf(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterfvPROC glTexParameterfv = (glTexParameterfvPROC)tlsGetFunction(700);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glTexParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glTexParameteriPROC glTexParameteri = (glTexParameteriPROC)tlsGetFunction(701);
    UNUSED_PARAM(clazz)
    glTexParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterivPROC glTexParameteriv = (glTexParameterivPROC)tlsGetFunction(702);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglTexSubImage2D__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glTexSubImage2DPROC glTexSubImage2D = (glTexSubImage2DPROC)tlsGetFunction(715);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glUniform1f(JNIEnv *__env, jclass clazz, jint location, jfloat v0) {
    glUniform1fPROC glUniform1f = (glUniform1fPROC)tlsGetFunction(732);
    UNUSED_PARAM(clazz)
    glUniform1f(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform1fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform1fvPROC glUniform1fv = (glUniform1fvPROC)tlsGetFunction(733);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform1fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glUniform1i(JNIEnv *__env, jclass clazz, jint location, jint v0) {
    glUniform1iPROC glUniform1i = (glUniform1iPROC)tlsGetFunction(734);
    UNUSED_PARAM(clazz)
    glUniform1i(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform1iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform1ivPROC glUniform1iv = (glUniform1ivPROC)tlsGetFunction(737);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform1iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glUniform2f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1) {
    glUniform2fPROC glUniform2f = (glUniform2fPROC)tlsGetFunction(742);
    UNUSED_PARAM(clazz)
    glUniform2f(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform2fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform2fvPROC glUniform2fv = (glUniform2fvPROC)tlsGetFunction(743);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform2fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glUniform2i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1) {
    glUniform2iPROC glUniform2i = (glUniform2iPROC)tlsGetFunction(744);
    UNUSED_PARAM(clazz)
    glUniform2i(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform2iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform2ivPROC glUniform2iv = (glUniform2ivPROC)tlsGetFunction(747);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform2iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glUniform3f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2) {
    glUniform3fPROC glUniform3f = (glUniform3fPROC)tlsGetFunction(752);
    UNUSED_PARAM(clazz)
    glUniform3f(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform3fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform3fvPROC glUniform3fv = (glUniform3fvPROC)tlsGetFunction(753);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform3fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glUniform3i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2) {
    glUniform3iPROC glUniform3i = (glUniform3iPROC)tlsGetFunction(754);
    UNUSED_PARAM(clazz)
    glUniform3i(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform3iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform3ivPROC glUniform3iv = (glUniform3ivPROC)tlsGetFunction(757);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform3iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glUniform4f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
    glUniform4fPROC glUniform4f = (glUniform4fPROC)tlsGetFunction(762);
    UNUSED_PARAM(clazz)
    glUniform4f(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform4fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform4fvPROC glUniform4fv = (glUniform4fvPROC)tlsGetFunction(763);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform4fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glUniform4i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3) {
    glUniform4iPROC glUniform4i = (glUniform4iPROC)tlsGetFunction(764);
    UNUSED_PARAM(clazz)
    glUniform4i(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniform4iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform4ivPROC glUniform4iv = (glUniform4ivPROC)tlsGetFunction(767);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform4iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniformMatrix2fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix2fvPROC glUniformMatrix2fv = (glUniformMatrix2fvPROC)tlsGetFunction(775);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniformMatrix3fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix3fvPROC glUniformMatrix3fv = (glUniformMatrix3fvPROC)tlsGetFunction(780);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix3fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglUniformMatrix4fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix4fvPROC glUniformMatrix4fv = (glUniformMatrix4fvPROC)tlsGetFunction(785);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glUseProgram(JNIEnv *__env, jclass clazz, jint program) {
    glUseProgramPROC glUseProgram = (glUseProgramPROC)tlsGetFunction(792);
    UNUSED_PARAM(clazz)
    glUseProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glValidateProgram(JNIEnv *__env, jclass clazz, jint program) {
    glValidateProgramPROC glValidateProgram = (glValidateProgramPROC)tlsGetFunction(795);
    UNUSED_PARAM(clazz)
    glValidateProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glVertexAttrib1f(JNIEnv *__env, jclass clazz, jint index, jfloat x) {
    glVertexAttrib1fPROC glVertexAttrib1f = (glVertexAttrib1fPROC)tlsGetFunction(798);
    UNUSED_PARAM(clazz)
    glVertexAttrib1f(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib1fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib1fvPROC glVertexAttrib1fv = (glVertexAttrib1fvPROC)tlsGetFunction(799);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib1fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glVertexAttrib2f(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y) {
    glVertexAttrib2fPROC glVertexAttrib2f = (glVertexAttrib2fPROC)tlsGetFunction(800);
    UNUSED_PARAM(clazz)
    glVertexAttrib2f(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib2fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib2fvPROC glVertexAttrib2fv = (glVertexAttrib2fvPROC)tlsGetFunction(801);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib2fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glVertexAttrib3f(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat z) {
    glVertexAttrib3fPROC glVertexAttrib3f = (glVertexAttrib3fPROC)tlsGetFunction(802);
    UNUSED_PARAM(clazz)
    glVertexAttrib3f(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib3fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib3fvPROC glVertexAttrib3fv = (glVertexAttrib3fvPROC)tlsGetFunction(803);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib3fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glVertexAttrib4f(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat z, jfloat w) {
    glVertexAttrib4fPROC glVertexAttrib4f = (glVertexAttrib4fPROC)tlsGetFunction(804);
    UNUSED_PARAM(clazz)
    glVertexAttrib4f(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttrib4fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4fvPROC glVertexAttrib4fv = (glVertexAttrib4fvPROC)tlsGetFunction(805);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_nglVertexAttribPointer(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jboolean normalized, jint stride, jlong pointerAddress) {
    glVertexAttribPointerPROC glVertexAttribPointer = (glVertexAttribPointerPROC)tlsGetFunction(818);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribPointer(index, size, type, normalized, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES20_glViewport(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height) {
    glViewportPROC glViewport = (glViewportPROC)tlsGetFunction(820);
    UNUSED_PARAM(clazz)
    glViewport(x, y, width, height);
}

EXTERN_C_EXIT
