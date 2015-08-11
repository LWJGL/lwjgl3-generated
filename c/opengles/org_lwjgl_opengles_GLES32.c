/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glBlendBarrierPROC) (void);
typedef void (APIENTRY *glCopyImageSubDataPROC) (GLuint, GLenum, GLint, GLint, GLint, GLint, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei);
typedef void (APIENTRY *glDebugMessageControlPROC) (GLenum, GLenum, GLenum, GLsizei, const GLuint *, GLboolean);
typedef void (APIENTRY *glDebugMessageInsertPROC) (GLenum, GLenum, GLuint, GLenum, GLsizei, const GLchar *);
typedef void (APIENTRY *glDebugMessageCallbackPROC) (GLDEBUGPROC, const void *);
typedef GLuint (APIENTRY *glGetDebugMessageLogPROC) (GLuint, GLsizei, GLenum *, GLenum *, GLuint *, GLenum *, GLsizei *, GLchar *);
typedef void (APIENTRY *glGetPointervPROC) (GLenum, void **);
typedef void (APIENTRY *glPushDebugGroupPROC) (GLenum, GLuint, GLsizei, const GLchar *);
typedef void (APIENTRY *glPopDebugGroupPROC) (void);
typedef void (APIENTRY *glObjectLabelPROC) (GLenum, GLuint, GLsizei, const GLchar *);
typedef void (APIENTRY *glGetObjectLabelPROC) (GLenum, GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glObjectPtrLabelPROC) (void *, GLsizei, const GLchar *);
typedef void (APIENTRY *glGetObjectPtrLabelPROC) (void *, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glEnableiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDisableiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glBlendEquationiPROC) (GLuint, GLenum);
typedef void (APIENTRY *glBlendEquationSeparateiPROC) (GLuint, GLenum, GLenum);
typedef void (APIENTRY *glBlendFunciPROC) (GLuint, GLenum, GLenum);
typedef void (APIENTRY *glBlendFuncSeparateiPROC) (GLuint, GLenum, GLenum, GLenum, GLenum);
typedef void (APIENTRY *glColorMaskiPROC) (GLuint, GLboolean, GLboolean, GLboolean, GLboolean);
typedef GLboolean (APIENTRY *glIsEnablediPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDrawElementsBaseVertexPROC) (GLenum, GLsizei, GLenum, const void *, GLint);
typedef void (APIENTRY *glDrawRangeElementsBaseVertexPROC) (GLenum, GLuint, GLuint, GLsizei, GLenum, const void *, GLint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexPROC) (GLenum, GLsizei, GLenum, const void *, GLsizei, GLint);
typedef void (APIENTRY *glFramebufferTexturePROC) (GLenum, GLenum, GLuint, GLint);
typedef void (APIENTRY *glPrimitiveBoundingBoxPROC) (GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLenum (APIENTRY *glGetGraphicsResetStatusPROC) (void);
typedef void (APIENTRY *glReadnPixelsPROC) (GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLsizei, void *);
typedef void (APIENTRY *glGetnUniformfvPROC) (GLuint, GLint, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnUniformivPROC) (GLuint, GLint, GLsizei, GLfloat *);
typedef void (APIENTRY *glGetnUniformuivPROC) (GLuint, GLint, GLsizei, GLfloat *);
typedef void (APIENTRY *glMinSampleShadingPROC) (GLfloat);
typedef void (APIENTRY *glPatchParameteriPROC) (GLenum, GLint);
typedef void (APIENTRY *glTexParameterIivPROC) (GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glTexParameterIuivPROC) (GLenum, GLenum, const GLuint *);
typedef void (APIENTRY *glGetTexParameterIivPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetTexParameterIuivPROC) (GLenum, GLenum, GLuint *);
typedef void (APIENTRY *glSamplerParameterIivPROC) (GLuint, GLenum, const GLint *);
typedef void (APIENTRY *glSamplerParameterIuivPROC) (GLuint, GLenum, const GLuint *);
typedef void (APIENTRY *glGetSamplerParameterIivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetSamplerParameterIuivPROC) (GLuint, GLenum, GLuint *);
typedef void (APIENTRY *glTexBufferPROC) (GLenum, GLenum, GLuint);
typedef void (APIENTRY *glTexBufferRangePROC) (GLenum, GLenum, GLuint, GLintptr, GLsizeiptr);
typedef void (APIENTRY *glTexStorage3DMultisamplePROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglBlendBarrier(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glBlendBarrierPROC glBlendBarrier = (glBlendBarrierPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendBarrier();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglCopyImageSubData(JNIEnv *__env, jclass clazz, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srcY, jint srcZ, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint srcWidth, jint srcHeight, jint srcDepth, jlong __functionAddress) {
	glCopyImageSubDataPROC glCopyImageSubData = (glCopyImageSubDataPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageControl(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDebugMessageControlPROC glDebugMessageControl = (glDebugMessageControlPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageControl(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageInsert(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong messageAddress, jlong __functionAddress) {
	const GLchar *message = (const GLchar *)(intptr_t)messageAddress;
	glDebugMessageInsertPROC glDebugMessageInsert = (glDebugMessageInsertPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageInsert(source, type, id, severity, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageCallback(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress, jlong __functionAddress) {
	GLDEBUGPROC callback = (GLDEBUGPROC)(intptr_t)callbackAddress;
	const void *userParam = (const void *)(intptr_t)userParamAddress;
	glDebugMessageCallbackPROC glDebugMessageCallback = (glDebugMessageCallbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDebugMessageCallback(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES32_nglGetDebugMessageLog(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress, jlong __functionAddress) {
	GLenum *sources = (GLenum *)(intptr_t)sourcesAddress;
	GLenum *types = (GLenum *)(intptr_t)typesAddress;
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	GLenum *severities = (GLenum *)(intptr_t)severitiesAddress;
	GLsizei *lengths = (GLsizei *)(intptr_t)lengthsAddress;
	GLchar *messageLog = (GLchar *)(intptr_t)messageLogAddress;
	glGetDebugMessageLogPROC glGetDebugMessageLog = (glGetDebugMessageLogPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetPointerv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	void **params = (void **)(intptr_t)paramsAddress;
	glGetPointervPROC glGetPointerv = (glGetPointervPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPointerv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglPushDebugGroup(JNIEnv *__env, jclass clazz, jint source, jint id, jint length, jlong messageAddress, jlong __functionAddress) {
	const GLchar *message = (const GLchar *)(intptr_t)messageAddress;
	glPushDebugGroupPROC glPushDebugGroup = (glPushDebugGroupPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPushDebugGroup(source, id, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglPopDebugGroup(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPopDebugGroupPROC glPopDebugGroup = (glPopDebugGroupPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPopDebugGroup();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglObjectLabel(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint length, jlong labelAddress, jlong __functionAddress) {
	const GLchar *label = (const GLchar *)(intptr_t)labelAddress;
	glObjectLabelPROC glObjectLabel = (glObjectLabelPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glObjectLabel(identifier, name, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetObjectLabel(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint bufSize, jlong lengthAddress, jlong labelAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *label = (GLchar *)(intptr_t)labelAddress;
	glGetObjectLabelPROC glGetObjectLabel = (glGetObjectLabelPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetObjectLabel(identifier, name, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglObjectPtrLabel(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint length, jlong labelAddress, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	const GLchar *label = (const GLchar *)(intptr_t)labelAddress;
	glObjectPtrLabelPROC glObjectPtrLabel = (glObjectPtrLabelPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glObjectPtrLabel(ptr, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetObjectPtrLabel(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint bufSize, jlong lengthAddress, jlong labelAddress, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *label = (GLchar *)(intptr_t)labelAddress;
	glGetObjectPtrLabelPROC glGetObjectPtrLabel = (glGetObjectPtrLabelPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetObjectPtrLabel(ptr, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglEnablei(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glEnableiPROC glEnablei = (glEnableiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnablei(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDisablei(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glDisableiPROC glDisablei = (glDisableiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisablei(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglBlendEquationi(JNIEnv *__env, jclass clazz, jint buf, jint mode, jlong __functionAddress) {
	glBlendEquationiPROC glBlendEquationi = (glBlendEquationiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationi(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglBlendEquationSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha, jlong __functionAddress) {
	glBlendEquationSeparateiPROC glBlendEquationSeparatei = (glBlendEquationSeparateiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglBlendFunci(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst, jlong __functionAddress) {
	glBlendFunciPROC glBlendFunci = (glBlendFunciPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFunci(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglBlendFuncSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha, jlong __functionAddress) {
	glBlendFuncSeparateiPROC glBlendFuncSeparatei = (glBlendFuncSeparateiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglColorMaski(JNIEnv *__env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a, jlong __functionAddress) {
	glColorMaskiPROC glColorMaski = (glColorMaskiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorMaski(index, r, g, b, a);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES32_nglIsEnabledi(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glIsEnablediPROC glIsEnabledi = (glIsEnablediPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsEnabledi(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsBaseVertexPROC glDrawElementsBaseVertex = (glDrawElementsBaseVertexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawRangeElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawRangeElementsBaseVertexPROC glDrawRangeElementsBaseVertex = (glDrawRangeElementsBaseVertexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawElementsInstancedBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint basevertex, jlong __functionAddress) {
	const void *indices = (const void *)(intptr_t)indicesAddress;
	glDrawElementsInstancedBaseVertexPROC glDrawElementsInstancedBaseVertex = (glDrawElementsInstancedBaseVertexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsInstancedBaseVertex(mode, count, type, indices, instancecount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglFramebufferTexture(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jlong __functionAddress) {
	glFramebufferTexturePROC glFramebufferTexture = (glFramebufferTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferTexture(target, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglPrimitiveBoundingBox(JNIEnv *__env, jclass clazz, jfloat minX, jfloat minY, jfloat minZ, jfloat minW, jfloat maxX, jfloat maxY, jfloat maxZ, jfloat maxW, jlong __functionAddress) {
	glPrimitiveBoundingBoxPROC glPrimitiveBoundingBox = (glPrimitiveBoundingBoxPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPrimitiveBoundingBox(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES32_nglGetGraphicsResetStatus(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glGetGraphicsResetStatusPROC glGetGraphicsResetStatus = (glGetGraphicsResetStatusPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetGraphicsResetStatus();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglReadnPixels(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong pixelsAddress, jlong __functionAddress) {
	void *pixels = (void *)(intptr_t)pixelsAddress;
	glReadnPixelsPROC glReadnPixels = (glReadnPixelsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformfv(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetnUniformfvPROC glGetnUniformfv = (glGetnUniformfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformfv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetnUniformivPROC glGetnUniformiv = (glGetnUniformivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformiv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformuiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetnUniformuivPROC glGetnUniformuiv = (glGetnUniformuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetnUniformuiv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglMinSampleShading(JNIEnv *__env, jclass clazz, jfloat value, jlong __functionAddress) {
	glMinSampleShadingPROC glMinSampleShading = (glMinSampleShadingPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMinSampleShading(value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglPatchParameteri(JNIEnv *__env, jclass clazz, jint pname, jint value, jlong __functionAddress) {
	glPatchParameteriPROC glPatchParameteri = (glPatchParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPatchParameteri(pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexParameterIiv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glTexParameterIivPROC glTexParameterIiv = (glTexParameterIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexParameterIuiv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *params = (const GLuint *)(intptr_t)paramsAddress;
	glTexParameterIuivPROC glTexParameterIuiv = (glTexParameterIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetTexParameterIiv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTexParameterIivPROC glGetTexParameterIiv = (glGetTexParameterIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetTexParameterIuiv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetTexParameterIuivPROC glGetTexParameterIuiv = (glGetTexParameterIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglSamplerParameterIiv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glSamplerParameterIivPROC glSamplerParameterIiv = (glSamplerParameterIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglSamplerParameterIuiv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *params = (const GLuint *)(intptr_t)paramsAddress;
	glSamplerParameterIuivPROC glSamplerParameterIuiv = (glSamplerParameterIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetSamplerParameterIiv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetSamplerParameterIivPROC glGetSamplerParameterIiv = (glGetSamplerParameterIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetSamplerParameterIuiv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetSamplerParameterIuivPROC glGetSamplerParameterIuiv = (glGetSamplerParameterIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexBuffer(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong __functionAddress) {
	glTexBufferPROC glTexBuffer = (glTexBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexBuffer(target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexBufferRange(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong offset, jlong size, jlong __functionAddress) {
	glTexBufferRangePROC glTexBufferRange = (glTexBufferRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexBufferRange(target, internalformat, buffer, (GLintptr)offset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexStorage3DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations, jlong __functionAddress) {
	glTexStorage3DMultisamplePROC glTexStorage3DMultisample = (glTexStorage3DMultisamplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

EXTERN_C_EXIT
