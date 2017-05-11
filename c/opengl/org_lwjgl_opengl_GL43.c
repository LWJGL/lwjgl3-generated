/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glClearBufferDataPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glClearBufferSubDataPROC) (jint, jint, intptr_t, intptr_t, jint, jint, const intptr_t);
typedef void (APIENTRY *glDispatchComputePROC) (jint, jint, jint);
typedef void (APIENTRY *glDispatchComputeIndirectPROC) (intptr_t);
typedef void (APIENTRY *glCopyImageSubDataPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glDebugMessageControlPROC) (jint, jint, jint, jint, const intptr_t, jboolean);
typedef void (APIENTRY *glDebugMessageInsertPROC) (jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glDebugMessageCallbackPROC) (intptr_t, const intptr_t);
typedef jint (APIENTRY *glGetDebugMessageLogPROC) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glPushDebugGroupPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glPopDebugGroupPROC) (void);
typedef void (APIENTRY *glObjectLabelPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetObjectLabelPROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glObjectPtrLabelPROC) (intptr_t, jint, const intptr_t);
typedef void (APIENTRY *glGetObjectPtrLabelPROC) (intptr_t, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glFramebufferParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glGetFramebufferParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetInternalformati64vPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glInvalidateTexSubImagePROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glInvalidateTexImagePROC) (jint, jint);
typedef void (APIENTRY *glInvalidateBufferSubDataPROC) (jint, intptr_t, intptr_t);
typedef void (APIENTRY *glInvalidateBufferDataPROC) (jint);
typedef void (APIENTRY *glInvalidateFramebufferPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glInvalidateSubFramebufferPROC) (jint, jint, const intptr_t, jint, jint, jint, jint);
typedef void (APIENTRY *glMultiDrawArraysIndirectPROC) (jint, const intptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsIndirectPROC) (jint, jint, const intptr_t, jint, jint);
typedef void (APIENTRY *glGetProgramInterfaceivPROC) (jint, jint, jint, intptr_t);
typedef jint (APIENTRY *glGetProgramResourceIndexPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetProgramResourceNamePROC) (jint, jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetProgramResourceivPROC) (jint, jint, jint, jint, const intptr_t, jint, intptr_t, intptr_t);
typedef jint (APIENTRY *glGetProgramResourceLocationPROC) (jint, jint, const intptr_t);
typedef jint (APIENTRY *glGetProgramResourceLocationIndexPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glShaderStorageBlockBindingPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexBufferRangePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glTexStorage2DMultisamplePROC) (jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTexStorage3DMultisamplePROC) (jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTextureViewPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glBindVertexBufferPROC) (jint, jint, intptr_t, jint);
typedef void (APIENTRY *glVertexAttribFormatPROC) (jint, jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexAttribIFormatPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribLFormatPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribBindingPROC) (jint, jint);
typedef void (APIENTRY *glVertexBindingDivisorPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglClearBufferData__IIIIJ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint format, jint type, jlong dataAddress) {
    glClearBufferDataPROC glClearBufferData = (glClearBufferDataPROC)tlsGetFunction(108);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearBufferData(target, internalformat, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglClearBufferSubData__IIJJIIJ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jlong offset, jlong size, jint format, jint type, jlong dataAddress) {
    glClearBufferSubDataPROC glClearBufferSubData = (glClearBufferSubDataPROC)tlsGetFunction(109);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearBufferSubData(target, internalformat, (intptr_t)offset, (intptr_t)size, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glDispatchCompute(JNIEnv *__env, jclass clazz, jint num_groups_x, jint num_groups_y, jint num_groups_z) {
    glDispatchComputePROC glDispatchCompute = (glDispatchComputePROC)tlsGetFunction(341);
    UNUSED_PARAM(clazz)
    glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglDispatchComputeIndirect(JNIEnv *__env, jclass clazz, jlong indirect) {
    glDispatchComputeIndirectPROC glDispatchComputeIndirect = (glDispatchComputeIndirectPROC)tlsGetFunction(343);
    UNUSED_PARAM(clazz)
    glDispatchComputeIndirect((intptr_t)indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glCopyImageSubData(JNIEnv *__env, jclass clazz, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srcY, jint srcZ, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint srcWidth, jint srcHeight, jint srcDepth) {
    glCopyImageSubDataPROC glCopyImageSubData = (glCopyImageSubDataPROC)tlsGetFunction(233);
    UNUSED_PARAM(clazz)
    glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglDebugMessageControl__IIIIJZ(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled) {
    glDebugMessageControlPROC glDebugMessageControl = (glDebugMessageControlPROC)tlsGetFunction(286);
    const intptr_t ids = (const intptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageControl(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglDebugMessageInsert(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong messageAddress) {
    glDebugMessageInsertPROC glDebugMessageInsert = (glDebugMessageInsertPROC)tlsGetFunction(289);
    const intptr_t message = (const intptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageInsert(source, type, id, severity, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglDebugMessageCallback(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress) {
    glDebugMessageCallbackPROC glDebugMessageCallback = (glDebugMessageCallbackPROC)tlsGetFunction(283);
    intptr_t callback = (intptr_t)callbackAddress;
    const intptr_t userParam = (const intptr_t)userParamAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageCallback(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL43_nglGetDebugMessageLog__IIJJJJJJ(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress) {
    glGetDebugMessageLogPROC glGetDebugMessageLog = (glGetDebugMessageLogPROC)tlsGetFunction(532);
    intptr_t sources = (intptr_t)sourcesAddress;
    intptr_t types = (intptr_t)typesAddress;
    intptr_t ids = (intptr_t)idsAddress;
    intptr_t severities = (intptr_t)severitiesAddress;
    intptr_t lengths = (intptr_t)lengthsAddress;
    intptr_t messageLog = (intptr_t)messageLogAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglPushDebugGroup(JNIEnv *__env, jclass clazz, jint source, jint id, jint length, jlong messageAddress) {
    glPushDebugGroupPROC glPushDebugGroup = (glPushDebugGroupPROC)tlsGetFunction(1401);
    const intptr_t message = (const intptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glPushDebugGroup(source, id, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glPopDebugGroup(JNIEnv *__env, jclass clazz) {
    glPopDebugGroupPROC glPopDebugGroup = (glPopDebugGroupPROC)tlsGetFunction(1233);
    UNUSED_PARAM(clazz)
    glPopDebugGroup();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglObjectLabel(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint length, jlong labelAddress) {
    glObjectLabelPROC glObjectLabel = (glObjectLabelPROC)tlsGetFunction(1177);
    const intptr_t label = (const intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectLabel(identifier, name, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetObjectLabel__IIIJJ(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectLabelPROC glGetObjectLabel = (glGetObjectLabelPROC)tlsGetFunction(618);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectLabel(identifier, name, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglObjectPtrLabel(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint length, jlong labelAddress) {
    glObjectPtrLabelPROC glObjectPtrLabel = (glObjectPtrLabelPROC)tlsGetFunction(1178);
    intptr_t ptr = (intptr_t)ptrAddress;
    const intptr_t label = (const intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectPtrLabel(ptr, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetObjectPtrLabel__JIJJ(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectPtrLabelPROC glGetObjectPtrLabel = (glGetObjectPtrLabelPROC)tlsGetFunction(622);
    intptr_t ptr = (intptr_t)ptrAddress;
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectPtrLabel(ptr, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glFramebufferParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glFramebufferParameteriPROC glFramebufferParameteri = (glFramebufferParameteriPROC)tlsGetFunction(442);
    UNUSED_PARAM(clazz)
    glFramebufferParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetFramebufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetFramebufferParameterivPROC glGetFramebufferParameteriv = (glGetFramebufferParameterivPROC)tlsGetFunction(551);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFramebufferParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetInternalformati64v__IIIIJ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint pname, jint bufSize, jlong paramsAddress) {
    glGetInternalformati64vPROC glGetInternalformati64v = (glGetInternalformati64vPROC)tlsGetFunction(570);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetInternalformati64v(target, internalformat, pname, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glInvalidateTexSubImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth) {
    glInvalidateTexSubImagePROC glInvalidateTexSubImage = (glInvalidateTexSubImagePROC)tlsGetFunction(853);
    UNUSED_PARAM(clazz)
    glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glInvalidateTexImage(JNIEnv *__env, jclass clazz, jint texture, jint level) {
    glInvalidateTexImagePROC glInvalidateTexImage = (glInvalidateTexImagePROC)tlsGetFunction(852);
    UNUSED_PARAM(clazz)
    glInvalidateTexImage(texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glInvalidateBufferSubData(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length) {
    glInvalidateBufferSubDataPROC glInvalidateBufferSubData = (glInvalidateBufferSubDataPROC)tlsGetFunction(847);
    UNUSED_PARAM(clazz)
    glInvalidateBufferSubData(buffer, (intptr_t)offset, (intptr_t)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glInvalidateBufferData(JNIEnv *__env, jclass clazz, jint buffer) {
    glInvalidateBufferDataPROC glInvalidateBufferData = (glInvalidateBufferDataPROC)tlsGetFunction(846);
    UNUSED_PARAM(clazz)
    glInvalidateBufferData(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglInvalidateFramebuffer__IIJ(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress) {
    glInvalidateFramebufferPROC glInvalidateFramebuffer = (glInvalidateFramebufferPROC)tlsGetFunction(848);
    const intptr_t attachments = (const intptr_t)attachmentsAddress;
    UNUSED_PARAM(clazz)
    glInvalidateFramebuffer(target, numAttachments, attachments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglInvalidateSubFramebuffer__IIJIIII(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress, jint x, jint y, jint width, jint height) {
    glInvalidateSubFramebufferPROC glInvalidateSubFramebuffer = (glInvalidateSubFramebufferPROC)tlsGetFunction(851);
    const intptr_t attachments = (const intptr_t)attachmentsAddress;
    UNUSED_PARAM(clazz)
    glInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglMultiDrawArraysIndirect__IJII(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jint primcount, jint stride) {
    glMultiDrawArraysIndirectPROC glMultiDrawArraysIndirect = (glMultiDrawArraysIndirectPROC)tlsGetFunction(990);
    const intptr_t indirect = (const intptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArraysIndirect(mode, indirect, primcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglMultiDrawElementsIndirect__IIJII(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jint primcount, jint stride) {
    glMultiDrawElementsIndirectPROC glMultiDrawElementsIndirect = (glMultiDrawElementsIndirectPROC)tlsGetFunction(996);
    const intptr_t indirect = (const intptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsIndirect(mode, type, indirect, primcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramInterfaceiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint pname, jlong paramsAddress) {
    glGetProgramInterfaceivPROC glGetProgramInterfaceiv = (glGetProgramInterfaceivPROC)tlsGetFunction(657);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramInterfaceiv(program, programInterface, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramResourceIndex(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress) {
    glGetProgramResourceIndexPROC glGetProgramResourceIndex = (glGetProgramResourceIndexPROC)tlsGetFunction(662);
    const intptr_t name = (const intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetProgramResourceIndex(program, programInterface, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramResourceName__IIIIJJ(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint bufSize, jlong lengthAddress, jlong nameAddress) {
    glGetProgramResourceNamePROC glGetProgramResourceName = (glGetProgramResourceNamePROC)tlsGetFunction(665);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetProgramResourceName(program, programInterface, index, bufSize, length, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramResourceiv__IIIIJIJJ(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint propCount, jlong propsAddress, jint bufSize, jlong lengthAddress, jlong paramsAddress) {
    glGetProgramResourceivPROC glGetProgramResourceiv = (glGetProgramResourceivPROC)tlsGetFunction(667);
    const intptr_t props = (const intptr_t)propsAddress;
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramResourceLocation(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress) {
    glGetProgramResourceLocationPROC glGetProgramResourceLocation = (glGetProgramResourceLocationPROC)tlsGetFunction(663);
    const intptr_t name = (const intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetProgramResourceLocation(program, programInterface, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramResourceLocationIndex(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress) {
    glGetProgramResourceLocationIndexPROC glGetProgramResourceLocationIndex = (glGetProgramResourceLocationIndexPROC)tlsGetFunction(664);
    const intptr_t name = (const intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetProgramResourceLocationIndex(program, programInterface, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glShaderStorageBlockBinding(JNIEnv *__env, jclass clazz, jint program, jint storageBlockIndex, jint storageBlockBinding) {
    glShaderStorageBlockBindingPROC glShaderStorageBlockBinding = (glShaderStorageBlockBindingPROC)tlsGetFunction(1523);
    UNUSED_PARAM(clazz)
    glShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glTexBufferRange(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong offset, jlong size) {
    glTexBufferRangePROC glTexBufferRange = (glTexBufferRangePROC)tlsGetFunction(1552);
    UNUSED_PARAM(clazz)
    glTexBufferRange(target, internalformat, buffer, (intptr_t)offset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glTexStorage2DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations) {
    glTexStorage2DMultisamplePROC glTexStorage2DMultisample = (glTexStorage2DMultisamplePROC)tlsGetFunction(1632);
    UNUSED_PARAM(clazz)
    glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glTexStorage3DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
    glTexStorage3DMultisamplePROC glTexStorage3DMultisample = (glTexStorage3DMultisamplePROC)tlsGetFunction(1634);
    UNUSED_PARAM(clazz)
    glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glTextureView(JNIEnv *__env, jclass clazz, jint texture, jint target, jint origtexture, jint internalformat, jint minlevel, jint numlevels, jint minlayer, jint numlayers) {
    glTextureViewPROC glTextureView = (glTextureViewPROC)tlsGetFunction(1683);
    UNUSED_PARAM(clazz)
    glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glBindVertexBuffer(JNIEnv *__env, jclass clazz, jint bindingindex, jint buffer, jlong offset, jint stride) {
    glBindVertexBufferPROC glBindVertexBuffer = (glBindVertexBufferPROC)tlsGetFunction(60);
    UNUSED_PARAM(clazz)
    glBindVertexBuffer(bindingindex, buffer, (intptr_t)offset, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glVertexAttribFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset) {
    glVertexAttribFormatPROC glVertexAttribFormat = (glVertexAttribFormatPROC)tlsGetFunction(1966);
    UNUSED_PARAM(clazz)
    glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glVertexAttribIFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jint relativeoffset) {
    glVertexAttribIFormatPROC glVertexAttribIFormat = (glVertexAttribIFormatPROC)tlsGetFunction(2008);
    UNUSED_PARAM(clazz)
    glVertexAttribIFormat(attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glVertexAttribLFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jint relativeoffset) {
    glVertexAttribLFormatPROC glVertexAttribLFormat = (glVertexAttribLFormatPROC)tlsGetFunction(2046);
    UNUSED_PARAM(clazz)
    glVertexAttribLFormat(attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glVertexAttribBinding(JNIEnv *__env, jclass clazz, jint attribindex, jint bindingindex) {
    glVertexAttribBindingPROC glVertexAttribBinding = (glVertexAttribBindingPROC)tlsGetFunction(1963);
    UNUSED_PARAM(clazz)
    glVertexAttribBinding(attribindex, bindingindex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_glVertexBindingDivisor(JNIEnv *__env, jclass clazz, jint bindingindex, jint divisor) {
    glVertexBindingDivisorPROC glVertexBindingDivisor = (glVertexBindingDivisorPROC)tlsGetFunction(2065);
    UNUSED_PARAM(clazz)
    glVertexBindingDivisor(bindingindex, divisor);
}

EXTERN_C_EXIT
