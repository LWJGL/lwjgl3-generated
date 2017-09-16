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

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glBlendBarrier(JNIEnv *__env, jclass clazz) {
    glBlendBarrierPROC glBlendBarrier = (glBlendBarrierPROC)tlsGetFunction(31);
    UNUSED_PARAM(clazz)
    glBlendBarrier();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glCopyImageSubData(JNIEnv *__env, jclass clazz, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srcY, jint srcZ, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint srcWidth, jint srcHeight, jint srcDepth) {
    glCopyImageSubDataPROC glCopyImageSubData = (glCopyImageSubDataPROC)tlsGetFunction(91);
    UNUSED_PARAM(clazz)
    glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageControl__IIIIJZ(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled) {
    glDebugMessageControlPROC glDebugMessageControl = (glDebugMessageControlPROC)tlsGetFunction(118);
    const intptr_t ids = (const intptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageControl(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageInsert(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong messageAddress) {
    glDebugMessageInsertPROC glDebugMessageInsert = (glDebugMessageInsertPROC)tlsGetFunction(120);
    const intptr_t message = (const intptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageInsert(source, type, id, severity, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageCallback(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress) {
    glDebugMessageCallbackPROC glDebugMessageCallback = (glDebugMessageCallbackPROC)tlsGetFunction(116);
    intptr_t callback = (intptr_t)callbackAddress;
    const intptr_t userParam = (const intptr_t)userParamAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageCallback(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES32_nglGetDebugMessageLog__IIJJJJJJ(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress) {
    glGetDebugMessageLogPROC glGetDebugMessageLog = (glGetDebugMessageLogPROC)tlsGetFunction(282);
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
    glGetPointervPROC glGetPointerv = (glGetPointervPROC)tlsGetFunction(336);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetPointerv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglPushDebugGroup(JNIEnv *__env, jclass clazz, jint source, jint id, jint length, jlong messageAddress) {
    glPushDebugGroupPROC glPushDebugGroup = (glPushDebugGroupPROC)tlsGetFunction(614);
    const intptr_t message = (const intptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glPushDebugGroup(source, id, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glPopDebugGroup(JNIEnv *__env, jclass clazz) {
    glPopDebugGroupPROC glPopDebugGroup = (glPopDebugGroupPROC)tlsGetFunction(519);
    UNUSED_PARAM(clazz)
    glPopDebugGroup();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglObjectLabel(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint length, jlong labelAddress) {
    glObjectLabelPROC glObjectLabel = (glObjectLabelPROC)tlsGetFunction(488);
    const intptr_t label = (const intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectLabel(identifier, name, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetObjectLabel__IIIJJ(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectLabelPROC glGetObjectLabel = (glGetObjectLabelPROC)tlsGetFunction(312);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectLabel(identifier, name, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglObjectPtrLabel(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint length, jlong labelAddress) {
    glObjectPtrLabelPROC glObjectPtrLabel = (glObjectPtrLabelPROC)tlsGetFunction(490);
    intptr_t ptr = (intptr_t)ptrAddress;
    const intptr_t label = (const intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectPtrLabel(ptr, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetObjectPtrLabel__JIJJ(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectPtrLabelPROC glGetObjectPtrLabel = (glGetObjectPtrLabelPROC)tlsGetFunction(315);
    intptr_t ptr = (intptr_t)ptrAddress;
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectPtrLabel(ptr, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glEnablei(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glEnableiPROC glEnablei = (glEnableiPROC)tlsGetFunction(199);
    UNUSED_PARAM(clazz)
    glEnablei(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glDisablei(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glDisableiPROC glDisablei = (glDisableiPROC)tlsGetFunction(155);
    UNUSED_PARAM(clazz)
    glDisablei(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glBlendEquationi(JNIEnv *__env, jclass clazz, jint buf, jint mode) {
    glBlendEquationiPROC glBlendEquationi = (glBlendEquationiPROC)tlsGetFunction(40);
    UNUSED_PARAM(clazz)
    glBlendEquationi(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glBlendEquationSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha) {
    glBlendEquationSeparateiPROC glBlendEquationSeparatei = (glBlendEquationSeparateiPROC)tlsGetFunction(37);
    UNUSED_PARAM(clazz)
    glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glBlendFunci(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst) {
    glBlendFunciPROC glBlendFunci = (glBlendFunciPROC)tlsGetFunction(48);
    UNUSED_PARAM(clazz)
    glBlendFunci(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glBlendFuncSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
    glBlendFuncSeparateiPROC glBlendFuncSeparatei = (glBlendFuncSeparateiPROC)tlsGetFunction(45);
    UNUSED_PARAM(clazz)
    glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glColorMaski(JNIEnv *__env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a) {
    glColorMaskiPROC glColorMaski = (glColorMaskiPROC)tlsGetFunction(76);
    UNUSED_PARAM(clazz)
    glColorMaski(index, r, g, b, a);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES32_glIsEnabledi(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glIsEnablediPROC glIsEnabledi = (glIsEnablediPROC)tlsGetFunction(429);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsEnabledi(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawElementsBaseVertexPROC glDrawElementsBaseVertex = (glDrawElementsBaseVertexPROC)tlsGetFunction(174);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawRangeElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawRangeElementsBaseVertexPROC glDrawRangeElementsBaseVertex = (glDrawRangeElementsBaseVertexPROC)tlsGetFunction(188);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawElementsInstancedBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint basevertex) {
    glDrawElementsInstancedBaseVertexPROC glDrawElementsInstancedBaseVertex = (glDrawElementsInstancedBaseVertexPROC)tlsGetFunction(181);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseVertex(mode, count, type, indices, instancecount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glFramebufferTexture(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level) {
    glFramebufferTexturePROC glFramebufferTexture = (glFramebufferTexturePROC)tlsGetFunction(237);
    UNUSED_PARAM(clazz)
    glFramebufferTexture(target, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glPrimitiveBoundingBox(JNIEnv *__env, jclass clazz, jfloat minX, jfloat minY, jfloat minZ, jfloat minW, jfloat maxX, jfloat maxY, jfloat maxZ, jfloat maxW) {
    glPrimitiveBoundingBoxPROC glPrimitiveBoundingBox = (glPrimitiveBoundingBoxPROC)tlsGetFunction(522);
    UNUSED_PARAM(clazz)
    glPrimitiveBoundingBox(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES32_glGetGraphicsResetStatus(JNIEnv *__env, jclass clazz) {
    glGetGraphicsResetStatusPROC glGetGraphicsResetStatus = (glGetGraphicsResetStatusPROC)tlsGetFunction(297);
    UNUSED_PARAM(clazz)
    return (jint)glGetGraphicsResetStatus();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglReadnPixels__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong pixelsAddress) {
    glReadnPixelsPROC glReadnPixels = (glReadnPixelsPROC)tlsGetFunction(623);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformfv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformfvPROC glGetnUniformfv = (glGetnUniformfvPROC)tlsGetFunction(408);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformfv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformivPROC glGetnUniformiv = (glGetnUniformivPROC)tlsGetFunction(411);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformiv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformuiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformuivPROC glGetnUniformuiv = (glGetnUniformuivPROC)tlsGetFunction(414);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformuiv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glMinSampleShading(JNIEnv *__env, jclass clazz, jfloat value) {
    glMinSampleShadingPROC glMinSampleShading = (glMinSampleShadingPROC)tlsGetFunction(476);
    UNUSED_PARAM(clazz)
    glMinSampleShading(value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glPatchParameteri(JNIEnv *__env, jclass clazz, jint pname, jint value) {
    glPatchParameteriPROC glPatchParameteri = (glPatchParameteriPROC)tlsGetFunction(492);
    UNUSED_PARAM(clazz)
    glPatchParameteri(pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIivPROC glTexParameterIiv = (glTexParameterIivPROC)tlsGetFunction(693);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIuivPROC glTexParameterIuiv = (glTexParameterIuivPROC)tlsGetFunction(696);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetTexParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIivPROC glGetTexParameterIiv = (glGetTexParameterIivPROC)tlsGetFunction(380);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetTexParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIuivPROC glGetTexParameterIuiv = (glGetTexParameterIuivPROC)tlsGetFunction(383);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglSamplerParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterIivPROC glSamplerParameterIiv = (glSamplerParameterIivPROC)tlsGetFunction(640);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglSamplerParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterIuivPROC glSamplerParameterIuiv = (glSamplerParameterIuivPROC)tlsGetFunction(643);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetSamplerParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIivPROC glGetSamplerParameterIiv = (glGetSamplerParameterIivPROC)tlsGetFunction(361);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetSamplerParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIuivPROC glGetSamplerParameterIuiv = (glGetSamplerParameterIuivPROC)tlsGetFunction(364);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glTexBuffer(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer) {
    glTexBufferPROC glTexBuffer = (glTexBufferPROC)tlsGetFunction(682);
    UNUSED_PARAM(clazz)
    glTexBuffer(target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glTexBufferRange(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong offset, jlong size) {
    glTexBufferRangePROC glTexBufferRange = (glTexBufferRangePROC)tlsGetFunction(685);
    UNUSED_PARAM(clazz)
    glTexBufferRange(target, internalformat, buffer, (intptr_t)offset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glTexStorage3DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
    glTexStorage3DMultisamplePROC glTexStorage3DMultisample = (glTexStorage3DMultisamplePROC)tlsGetFunction(709);
    UNUSED_PARAM(clazz)
    glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

EXTERN_C_EXIT
