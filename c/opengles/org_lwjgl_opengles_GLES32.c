/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glBlendBarrierPROC) (void);
typedef void (APIENTRY *glCopyImageSubDataPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glDebugMessageControlPROC) (jint, jint, jint, jint, const intptr_t, jboolean);
typedef void (APIENTRY *glDebugMessageInsertPROC) (jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glDebugMessageCallbackPROC) (intptr_t, const intptr_t);
typedef jint (APIENTRY *glGetDebugMessageLogPROC) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glGetPointervPROC) (jint, intptr_t);
typedef void (APIENTRY *glPushDebugGroupPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glPopDebugGroupPROC) (void);
typedef void (APIENTRY *glObjectLabelPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetObjectLabelPROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glObjectPtrLabelPROC) (intptr_t, jint, const intptr_t);
typedef void (APIENTRY *glGetObjectPtrLabelPROC) (intptr_t, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glEnableiPROC) (jint, jint);
typedef void (APIENTRY *glDisableiPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationiPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationSeparateiPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFunciPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFuncSeparateiPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glColorMaskiPROC) (jint, jboolean, jboolean, jboolean, jboolean);
typedef jboolean (APIENTRY *glIsEnablediPROC) (jint, jint);
typedef void (APIENTRY *glDrawElementsBaseVertexPROC) (jint, jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glDrawRangeElementsBaseVertexPROC) (jint, jint, jint, jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexPROC) (jint, jint, jint, const intptr_t, jint, jint);
typedef void (APIENTRY *glFramebufferTexturePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glPrimitiveBoundingBoxPROC) (jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);
typedef jint (APIENTRY *glGetGraphicsResetStatusPROC) (void);
typedef void (APIENTRY *glReadnPixelsPROC) (jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnUniformfvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnUniformivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnUniformuivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glMinSampleShadingPROC) (jfloat);
typedef void (APIENTRY *glPatchParameteriPROC) (jint, jint);
typedef void (APIENTRY *glTexParameterIivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glTexParameterIuivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetTexParameterIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexParameterIuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSamplerParameterIivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glSamplerParameterIuivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetSamplerParameterIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSamplerParameterIuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTexBufferPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexBufferRangePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glTexStorage3DMultisamplePROC) (jint, jint, jint, jint, jint, jint, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglBlendBarrier(JNIEnv *__env, jclass clazz) {
	glBlendBarrierPROC glBlendBarrier = (glBlendBarrierPROC)tlsGetFunction(29);
	UNUSED_PARAM(clazz)
	glBlendBarrier();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglCopyImageSubData(JNIEnv *__env, jclass clazz, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srcY, jint srcZ, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint srcWidth, jint srcHeight, jint srcDepth) {
	glCopyImageSubDataPROC glCopyImageSubData = (glCopyImageSubDataPROC)tlsGetFunction(86);
	UNUSED_PARAM(clazz)
	glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageControl__IIIIJZ(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled) {
	glDebugMessageControlPROC glDebugMessageControl = (glDebugMessageControlPROC)tlsGetFunction(112);
	const intptr_t ids = (const intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glDebugMessageControl(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageInsert(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong messageAddress) {
	glDebugMessageInsertPROC glDebugMessageInsert = (glDebugMessageInsertPROC)tlsGetFunction(114);
	const intptr_t message = (const intptr_t)messageAddress;
	UNUSED_PARAM(clazz)
	glDebugMessageInsert(source, type, id, severity, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageCallback(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress) {
	glDebugMessageCallbackPROC glDebugMessageCallback = (glDebugMessageCallbackPROC)tlsGetFunction(110);
	intptr_t callback = (intptr_t)callbackAddress;
	const intptr_t userParam = (const intptr_t)userParamAddress;
	UNUSED_PARAM(clazz)
	glDebugMessageCallback(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES32_nglGetDebugMessageLog__IIJJJJJJ(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress) {
	glGetDebugMessageLogPROC glGetDebugMessageLog = (glGetDebugMessageLogPROC)tlsGetFunction(267);
	intptr_t sources = (intptr_t)sourcesAddress;
	intptr_t types = (intptr_t)typesAddress;
	intptr_t ids = (intptr_t)idsAddress;
	intptr_t severities = (intptr_t)severitiesAddress;
	intptr_t lengths = (intptr_t)lengthsAddress;
	intptr_t messageLog = (intptr_t)messageLogAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetPointerv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
	glGetPointervPROC glGetPointerv = (glGetPointervPROC)tlsGetFunction(320);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetPointerv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglPushDebugGroup(JNIEnv *__env, jclass clazz, jint source, jint id, jint length, jlong messageAddress) {
	glPushDebugGroupPROC glPushDebugGroup = (glPushDebugGroupPROC)tlsGetFunction(581);
	const intptr_t message = (const intptr_t)messageAddress;
	UNUSED_PARAM(clazz)
	glPushDebugGroup(source, id, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglPopDebugGroup(JNIEnv *__env, jclass clazz) {
	glPopDebugGroupPROC glPopDebugGroup = (glPopDebugGroupPROC)tlsGetFunction(486);
	UNUSED_PARAM(clazz)
	glPopDebugGroup();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglObjectLabel(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint length, jlong labelAddress) {
	glObjectLabelPROC glObjectLabel = (glObjectLabelPROC)tlsGetFunction(455);
	const intptr_t label = (const intptr_t)labelAddress;
	UNUSED_PARAM(clazz)
	glObjectLabel(identifier, name, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetObjectLabel__IIIJJ(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint bufSize, jlong lengthAddress, jlong labelAddress) {
	glGetObjectLabelPROC glGetObjectLabel = (glGetObjectLabelPROC)tlsGetFunction(296);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t label = (intptr_t)labelAddress;
	UNUSED_PARAM(clazz)
	glGetObjectLabel(identifier, name, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglObjectPtrLabel(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint length, jlong labelAddress) {
	glObjectPtrLabelPROC glObjectPtrLabel = (glObjectPtrLabelPROC)tlsGetFunction(457);
	intptr_t ptr = (intptr_t)ptrAddress;
	const intptr_t label = (const intptr_t)labelAddress;
	UNUSED_PARAM(clazz)
	glObjectPtrLabel(ptr, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetObjectPtrLabel__JIJJ(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint bufSize, jlong lengthAddress, jlong labelAddress) {
	glGetObjectPtrLabelPROC glGetObjectPtrLabel = (glGetObjectPtrLabelPROC)tlsGetFunction(299);
	intptr_t ptr = (intptr_t)ptrAddress;
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t label = (intptr_t)labelAddress;
	UNUSED_PARAM(clazz)
	glGetObjectPtrLabel(ptr, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglEnablei(JNIEnv *__env, jclass clazz, jint target, jint index) {
	glEnableiPROC glEnablei = (glEnableiPROC)tlsGetFunction(188);
	UNUSED_PARAM(clazz)
	glEnablei(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDisablei(JNIEnv *__env, jclass clazz, jint target, jint index) {
	glDisableiPROC glDisablei = (glDisableiPROC)tlsGetFunction(147);
	UNUSED_PARAM(clazz)
	glDisablei(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglBlendEquationi(JNIEnv *__env, jclass clazz, jint buf, jint mode) {
	glBlendEquationiPROC glBlendEquationi = (glBlendEquationiPROC)tlsGetFunction(38);
	UNUSED_PARAM(clazz)
	glBlendEquationi(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglBlendEquationSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha) {
	glBlendEquationSeparateiPROC glBlendEquationSeparatei = (glBlendEquationSeparateiPROC)tlsGetFunction(35);
	UNUSED_PARAM(clazz)
	glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglBlendFunci(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst) {
	glBlendFunciPROC glBlendFunci = (glBlendFunciPROC)tlsGetFunction(46);
	UNUSED_PARAM(clazz)
	glBlendFunci(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglBlendFuncSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
	glBlendFuncSeparateiPROC glBlendFuncSeparatei = (glBlendFuncSeparateiPROC)tlsGetFunction(43);
	UNUSED_PARAM(clazz)
	glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglColorMaski(JNIEnv *__env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a) {
	glColorMaskiPROC glColorMaski = (glColorMaskiPROC)tlsGetFunction(71);
	UNUSED_PARAM(clazz)
	glColorMaski(index, r, g, b, a);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES32_nglIsEnabledi(JNIEnv *__env, jclass clazz, jint target, jint index) {
	glIsEnablediPROC glIsEnabledi = (glIsEnablediPROC)tlsGetFunction(403);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsEnabledi(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex) {
	glDrawElementsBaseVertexPROC glDrawElementsBaseVertex = (glDrawElementsBaseVertexPROC)tlsGetFunction(166);
	const intptr_t indices = (const intptr_t)indicesAddress;
	UNUSED_PARAM(clazz)
	glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawRangeElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex) {
	glDrawRangeElementsBaseVertexPROC glDrawRangeElementsBaseVertex = (glDrawRangeElementsBaseVertexPROC)tlsGetFunction(180);
	const intptr_t indices = (const intptr_t)indicesAddress;
	UNUSED_PARAM(clazz)
	glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawElementsInstancedBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint basevertex) {
	glDrawElementsInstancedBaseVertexPROC glDrawElementsInstancedBaseVertex = (glDrawElementsInstancedBaseVertexPROC)tlsGetFunction(173);
	const intptr_t indices = (const intptr_t)indicesAddress;
	UNUSED_PARAM(clazz)
	glDrawElementsInstancedBaseVertex(mode, count, type, indices, instancecount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglFramebufferTexture(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level) {
	glFramebufferTexturePROC glFramebufferTexture = (glFramebufferTexturePROC)tlsGetFunction(223);
	UNUSED_PARAM(clazz)
	glFramebufferTexture(target, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglPrimitiveBoundingBox(JNIEnv *__env, jclass clazz, jfloat minX, jfloat minY, jfloat minZ, jfloat minW, jfloat maxX, jfloat maxY, jfloat maxZ, jfloat maxW) {
	glPrimitiveBoundingBoxPROC glPrimitiveBoundingBox = (glPrimitiveBoundingBoxPROC)tlsGetFunction(489);
	UNUSED_PARAM(clazz)
	glPrimitiveBoundingBox(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES32_nglGetGraphicsResetStatus(JNIEnv *__env, jclass clazz) {
	glGetGraphicsResetStatusPROC glGetGraphicsResetStatus = (glGetGraphicsResetStatusPROC)tlsGetFunction(282);
	UNUSED_PARAM(clazz)
	return (jint)glGetGraphicsResetStatus();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglReadnPixels__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong pixelsAddress) {
	glReadnPixelsPROC glReadnPixels = (glReadnPixelsPROC)tlsGetFunction(590);
	intptr_t pixels = (intptr_t)pixelsAddress;
	UNUSED_PARAM(clazz)
	glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformfv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
	glGetnUniformfvPROC glGetnUniformfv = (glGetnUniformfvPROC)tlsGetFunction(388);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetnUniformfv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
	glGetnUniformivPROC glGetnUniformiv = (glGetnUniformivPROC)tlsGetFunction(391);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetnUniformiv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformuiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
	glGetnUniformuivPROC glGetnUniformuiv = (glGetnUniformuivPROC)tlsGetFunction(394);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetnUniformuiv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglMinSampleShading(JNIEnv *__env, jclass clazz, jfloat value) {
	glMinSampleShadingPROC glMinSampleShading = (glMinSampleShadingPROC)tlsGetFunction(446);
	UNUSED_PARAM(clazz)
	glMinSampleShading(value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglPatchParameteri(JNIEnv *__env, jclass clazz, jint pname, jint value) {
	glPatchParameteriPROC glPatchParameteri = (glPatchParameteriPROC)tlsGetFunction(459);
	UNUSED_PARAM(clazz)
	glPatchParameteri(pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glTexParameterIivPROC glTexParameterIiv = (glTexParameterIivPROC)tlsGetFunction(655);
	const intptr_t params = (const intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glTexParameterIuivPROC glTexParameterIuiv = (glTexParameterIuivPROC)tlsGetFunction(658);
	const intptr_t params = (const intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetTexParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetTexParameterIivPROC glGetTexParameterIiv = (glGetTexParameterIivPROC)tlsGetFunction(363);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetTexParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetTexParameterIuivPROC glGetTexParameterIuiv = (glGetTexParameterIuivPROC)tlsGetFunction(366);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglSamplerParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
	glSamplerParameterIivPROC glSamplerParameterIiv = (glSamplerParameterIivPROC)tlsGetFunction(606);
	const intptr_t params = (const intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglSamplerParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
	glSamplerParameterIuivPROC glSamplerParameterIuiv = (glSamplerParameterIuivPROC)tlsGetFunction(609);
	const intptr_t params = (const intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetSamplerParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
	glGetSamplerParameterIivPROC glGetSamplerParameterIiv = (glGetSamplerParameterIivPROC)tlsGetFunction(345);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetSamplerParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
	glGetSamplerParameterIuivPROC glGetSamplerParameterIuiv = (glGetSamplerParameterIuivPROC)tlsGetFunction(348);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexBuffer(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer) {
	glTexBufferPROC glTexBuffer = (glTexBufferPROC)tlsGetFunction(644);
	UNUSED_PARAM(clazz)
	glTexBuffer(target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexBufferRange(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong offset, jlong size) {
	glTexBufferRangePROC glTexBufferRange = (glTexBufferRangePROC)tlsGetFunction(647);
	UNUSED_PARAM(clazz)
	glTexBufferRange(target, internalformat, buffer, (intptr_t)offset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexStorage3DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
	glTexStorage3DMultisamplePROC glTexStorage3DMultisample = (glTexStorage3DMultisamplePROC)tlsGetFunction(671);
	UNUSED_PARAM(clazz)
	glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

EXTERN_C_EXIT
