/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDispatchComputePROC) (jint, jint, jint);
typedef void (APIENTRY *glDispatchComputeIndirectPROC) (intptr_t);
typedef void (APIENTRY *glDrawArraysIndirectPROC) (jint, const intptr_t);
typedef void (APIENTRY *glDrawElementsIndirectPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glFramebufferParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glGetFramebufferParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetProgramInterfaceivPROC) (jint, jint, jint, intptr_t);
typedef jint (APIENTRY *glGetProgramResourceIndexPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetProgramResourceNamePROC) (jint, jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetProgramResourceivPROC) (jint, jint, jint, jint, const intptr_t, jint, intptr_t, intptr_t);
typedef jint (APIENTRY *glGetProgramResourceLocationPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUseProgramStagesPROC) (jint, jint, jint);
typedef void (APIENTRY *glActiveShaderProgramPROC) (jint, jint);
typedef jint (APIENTRY *glCreateShaderProgramvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glBindProgramPipelinePROC) (jint);
typedef void (APIENTRY *glDeleteProgramPipelinesPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGenProgramPipelinesPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsProgramPipelinePROC) (jint);
typedef void (APIENTRY *glGetProgramPipelineivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform1iPROC) (jint, jint, jint);
typedef void (APIENTRY *glProgramUniform2iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform3iPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform4iPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform1uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glProgramUniform2uiPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform3uiPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform4uiPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform1fPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glProgramUniform2fPROC) (jint, jint, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform3fPROC) (jint, jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform4fPROC) (jint, jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform1ivPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform2ivPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform3ivPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform4ivPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform1uivPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform2uivPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform3uivPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform4uivPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform1fvPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform2fvPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform3fvPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform4fvPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2fvPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3fvPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4fvPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x3fvPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x2fvPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x4fvPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x2fvPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x4fvPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x3fvPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glValidateProgramPipelinePROC) (jint);
typedef void (APIENTRY *glGetProgramPipelineInfoLogPROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glBindImageTexturePROC) (jint, jint, jint, jboolean, jint, jint, jint);
typedef void (APIENTRY *glGetBooleani_vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glMemoryBarrierPROC) (jint);
typedef void (APIENTRY *glMemoryBarrierByRegionPROC) (jint);
typedef void (APIENTRY *glTexStorage2DMultisamplePROC) (jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glGetMultisamplefvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSampleMaskiPROC) (jint, jint);
typedef void (APIENTRY *glGetTexLevelParameterivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexLevelParameterfvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glBindVertexBufferPROC) (jint, jint, intptr_t, jint);
typedef void (APIENTRY *glVertexAttribFormatPROC) (jint, jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexAttribIFormatPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribBindingPROC) (jint, jint);
typedef void (APIENTRY *glVertexBindingDivisorPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glDispatchCompute(JNIEnv *__env, jclass clazz, jint num_groups_x, jint num_groups_y, jint num_groups_z) {
    glDispatchComputePROC glDispatchCompute = (glDispatchComputePROC)tlsGetFunction(160);
    UNUSED_PARAM(clazz)
    glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glDispatchComputeIndirect(JNIEnv *__env, jclass clazz, jlong indirect) {
    glDispatchComputeIndirectPROC glDispatchComputeIndirect = (glDispatchComputeIndirectPROC)tlsGetFunction(161);
    UNUSED_PARAM(clazz)
    glDispatchComputeIndirect((intptr_t)indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglDrawArraysIndirect__IJ(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress) {
    glDrawArraysIndirectPROC glDrawArraysIndirect = (glDrawArraysIndirectPROC)tlsGetFunction(163);
    const intptr_t indirect = (const intptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glDrawArraysIndirect(mode, indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglDrawElementsIndirect__IIJ(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress) {
    glDrawElementsIndirectPROC glDrawElementsIndirect = (glDrawElementsIndirectPROC)tlsGetFunction(177);
    const intptr_t indirect = (const intptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsIndirect(mode, type, indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glFramebufferParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glFramebufferParameteriPROC glFramebufferParameteri = (glFramebufferParameteriPROC)tlsGetFunction(233);
    UNUSED_PARAM(clazz)
    glFramebufferParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetFramebufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetFramebufferParameterivPROC glGetFramebufferParameteriv = (glGetFramebufferParameterivPROC)tlsGetFunction(295);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFramebufferParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramInterfaceiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint pname, jlong paramsAddress) {
    glGetProgramInterfaceivPROC glGetProgramInterfaceiv = (glGetProgramInterfaceivPROC)tlsGetFunction(341);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramInterfaceiv(program, programInterface, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramResourceIndex(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress) {
    glGetProgramResourceIndexPROC glGetProgramResourceIndex = (glGetProgramResourceIndexPROC)tlsGetFunction(346);
    const intptr_t name = (const intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetProgramResourceIndex(program, programInterface, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramResourceName__IIIIJJ(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint bufSize, jlong lengthAddress, jlong nameAddress) {
    glGetProgramResourceNamePROC glGetProgramResourceName = (glGetProgramResourceNamePROC)tlsGetFunction(349);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetProgramResourceName(program, programInterface, index, bufSize, length, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramResourceiv__IIIIJIJJ(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint propCount, jlong propsAddress, jint bufSize, jlong lengthAddress, jlong paramsAddress) {
    glGetProgramResourceivPROC glGetProgramResourceiv = (glGetProgramResourceivPROC)tlsGetFunction(351);
    const intptr_t props = (const intptr_t)propsAddress;
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramResourceLocation(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress) {
    glGetProgramResourceLocationPROC glGetProgramResourceLocation = (glGetProgramResourceLocationPROC)tlsGetFunction(347);
    const intptr_t name = (const intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetProgramResourceLocation(program, programInterface, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glUseProgramStages(JNIEnv *__env, jclass clazz, jint pipeline, jint stages, jint program) {
    glUseProgramStagesPROC glUseProgramStages = (glUseProgramStagesPROC)tlsGetFunction(793);
    UNUSED_PARAM(clazz)
    glUseProgramStages(pipeline, stages, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glActiveShaderProgram(JNIEnv *__env, jclass clazz, jint pipeline, jint program) {
    glActiveShaderProgramPROC glActiveShaderProgram = (glActiveShaderProgramPROC)tlsGetFunction(1);
    UNUSED_PARAM(clazz)
    glActiveShaderProgram(pipeline, program);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES31_nglCreateShaderProgramv(JNIEnv *__env, jclass clazz, jint type, jint count, jlong stringsAddress) {
    glCreateShaderProgramvPROC glCreateShaderProgramv = (glCreateShaderProgramvPROC)tlsGetFunction(113);
    const intptr_t strings = (const intptr_t)stringsAddress;
    UNUSED_PARAM(clazz)
    return (jint)glCreateShaderProgramv(type, count, strings);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glBindProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline) {
    glBindProgramPipelinePROC glBindProgramPipeline = (glBindProgramPipelinePROC)tlsGetFunction(22);
    UNUSED_PARAM(clazz)
    glBindProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglDeleteProgramPipelines__IJ(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress) {
    glDeleteProgramPipelinesPROC glDeleteProgramPipelines = (glDeleteProgramPipelinesPROC)tlsGetFunction(130);
    const intptr_t pipelines = (const intptr_t)pipelinesAddress;
    UNUSED_PARAM(clazz)
    glDeleteProgramPipelines(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGenProgramPipelines__IJ(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress) {
    glGenProgramPipelinesPROC glGenProgramPipelines = (glGenProgramPipelinesPROC)tlsGetFunction(256);
    intptr_t pipelines = (intptr_t)pipelinesAddress;
    UNUSED_PARAM(clazz)
    glGenProgramPipelines(n, pipelines);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES31_glIsProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline) {
    glIsProgramPipelinePROC glIsProgramPipeline = (glIsProgramPipelinePROC)tlsGetFunction(441);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramPipelineiv__IIJ(JNIEnv *__env, jclass clazz, jint pipeline, jint pname, jlong paramsAddress) {
    glGetProgramPipelineivPROC glGetProgramPipelineiv = (glGetProgramPipelineivPROC)tlsGetFunction(344);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramPipelineiv(pipeline, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform1i(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0) {
    glProgramUniform1iPROC glProgramUniform1i = (glProgramUniform1iPROC)tlsGetFunction(534);
    UNUSED_PARAM(clazz)
    glProgramUniform1i(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform2i(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1) {
    glProgramUniform2iPROC glProgramUniform2i = (glProgramUniform2iPROC)tlsGetFunction(550);
    UNUSED_PARAM(clazz)
    glProgramUniform2i(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform3i(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {
    glProgramUniform3iPROC glProgramUniform3i = (glProgramUniform3iPROC)tlsGetFunction(566);
    UNUSED_PARAM(clazz)
    glProgramUniform3i(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform4i(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {
    glProgramUniform4iPROC glProgramUniform4i = (glProgramUniform4iPROC)tlsGetFunction(582);
    UNUSED_PARAM(clazz)
    glProgramUniform4i(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform1ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0) {
    glProgramUniform1uiPROC glProgramUniform1ui = (glProgramUniform1uiPROC)tlsGetFunction(540);
    UNUSED_PARAM(clazz)
    glProgramUniform1ui(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform2ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1) {
    glProgramUniform2uiPROC glProgramUniform2ui = (glProgramUniform2uiPROC)tlsGetFunction(556);
    UNUSED_PARAM(clazz)
    glProgramUniform2ui(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform3ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {
    glProgramUniform3uiPROC glProgramUniform3ui = (glProgramUniform3uiPROC)tlsGetFunction(572);
    UNUSED_PARAM(clazz)
    glProgramUniform3ui(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform4ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {
    glProgramUniform4uiPROC glProgramUniform4ui = (glProgramUniform4uiPROC)tlsGetFunction(588);
    UNUSED_PARAM(clazz)
    glProgramUniform4ui(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform1f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0) {
    glProgramUniform1fPROC glProgramUniform1f = (glProgramUniform1fPROC)tlsGetFunction(530);
    UNUSED_PARAM(clazz)
    glProgramUniform1f(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform2f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1) {
    glProgramUniform2fPROC glProgramUniform2f = (glProgramUniform2fPROC)tlsGetFunction(546);
    UNUSED_PARAM(clazz)
    glProgramUniform2f(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform3f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2) {
    glProgramUniform3fPROC glProgramUniform3f = (glProgramUniform3fPROC)tlsGetFunction(562);
    UNUSED_PARAM(clazz)
    glProgramUniform3f(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glProgramUniform4f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
    glProgramUniform4fPROC glProgramUniform4f = (glProgramUniform4fPROC)tlsGetFunction(578);
    UNUSED_PARAM(clazz)
    glProgramUniform4f(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform1iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1ivPROC glProgramUniform1iv = (glProgramUniform1ivPROC)tlsGetFunction(538);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform2iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2ivPROC glProgramUniform2iv = (glProgramUniform2ivPROC)tlsGetFunction(554);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform3iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3ivPROC glProgramUniform3iv = (glProgramUniform3ivPROC)tlsGetFunction(570);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform4iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4ivPROC glProgramUniform4iv = (glProgramUniform4ivPROC)tlsGetFunction(586);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform1uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1uivPROC glProgramUniform1uiv = (glProgramUniform1uivPROC)tlsGetFunction(544);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform2uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2uivPROC glProgramUniform2uiv = (glProgramUniform2uivPROC)tlsGetFunction(560);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform3uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3uivPROC glProgramUniform3uiv = (glProgramUniform3uivPROC)tlsGetFunction(576);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform4uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4uivPROC glProgramUniform4uiv = (glProgramUniform4uivPROC)tlsGetFunction(592);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform1fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1fvPROC glProgramUniform1fv = (glProgramUniform1fvPROC)tlsGetFunction(532);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform2fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2fvPROC glProgramUniform2fv = (glProgramUniform2fvPROC)tlsGetFunction(548);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform3fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3fvPROC glProgramUniform3fv = (glProgramUniform3fvPROC)tlsGetFunction(564);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform4fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4fvPROC glProgramUniform4fv = (glProgramUniform4fvPROC)tlsGetFunction(580);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix2fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2fvPROC glProgramUniformMatrix2fv = (glProgramUniformMatrix2fvPROC)tlsGetFunction(596);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix3fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3fvPROC glProgramUniformMatrix3fv = (glProgramUniformMatrix3fvPROC)tlsGetFunction(602);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix4fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4fvPROC glProgramUniformMatrix4fv = (glProgramUniformMatrix4fvPROC)tlsGetFunction(608);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix2x3fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x3fvPROC glProgramUniformMatrix2x3fv = (glProgramUniformMatrix2x3fvPROC)tlsGetFunction(598);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix3x2fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x2fvPROC glProgramUniformMatrix3x2fv = (glProgramUniformMatrix3x2fvPROC)tlsGetFunction(604);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix2x4fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x4fvPROC glProgramUniformMatrix2x4fv = (glProgramUniformMatrix2x4fvPROC)tlsGetFunction(600);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix4x2fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x2fvPROC glProgramUniformMatrix4x2fv = (glProgramUniformMatrix4x2fvPROC)tlsGetFunction(610);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix3x4fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x4fvPROC glProgramUniformMatrix3x4fv = (glProgramUniformMatrix3x4fvPROC)tlsGetFunction(606);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix4x3fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x3fvPROC glProgramUniformMatrix4x3fv = (glProgramUniformMatrix4x3fvPROC)tlsGetFunction(612);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glValidateProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline) {
    glValidateProgramPipelinePROC glValidateProgramPipeline = (glValidateProgramPipelinePROC)tlsGetFunction(796);
    UNUSED_PARAM(clazz)
    glValidateProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramPipelineInfoLog__IIJJ(JNIEnv *__env, jclass clazz, jint pipeline, jint bufSize, jlong lengthAddress, jlong infoLogAddress) {
    glGetProgramPipelineInfoLogPROC glGetProgramPipelineInfoLog = (glGetProgramPipelineInfoLogPROC)tlsGetFunction(342);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t infoLog = (intptr_t)infoLogAddress;
    UNUSED_PARAM(clazz)
    glGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glBindImageTexture(JNIEnv *__env, jclass clazz, jint unit, jint texture, jint level, jboolean layered, jint layer, jint access, jint format) {
    glBindImageTexturePROC glBindImageTexture = (glBindImageTexturePROC)tlsGetFunction(21);
    UNUSED_PARAM(clazz)
    glBindImageTexture(unit, texture, level, layered, layer, access, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetBooleani_1v(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetBooleani_vPROC glGetBooleani_v = (glGetBooleani_vPROC)tlsGetFunction(275);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetBooleani_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glMemoryBarrier(JNIEnv *__env, jclass clazz, jint barriers) {
    glMemoryBarrierPROC glMemoryBarrier = (glMemoryBarrierPROC)tlsGetFunction(473);
    UNUSED_PARAM(clazz)
    glMemoryBarrier(barriers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glMemoryBarrierByRegion(JNIEnv *__env, jclass clazz, jint barriers) {
    glMemoryBarrierByRegionPROC glMemoryBarrierByRegion = (glMemoryBarrierByRegionPROC)tlsGetFunction(474);
    UNUSED_PARAM(clazz)
    glMemoryBarrierByRegion(barriers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glTexStorage2DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations) {
    glTexStorage2DMultisamplePROC glTexStorage2DMultisample = (glTexStorage2DMultisamplePROC)tlsGetFunction(706);
    UNUSED_PARAM(clazz)
    glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetMultisamplefv__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong valAddress) {
    glGetMultisamplefvPROC glGetMultisamplefv = (glGetMultisamplefvPROC)tlsGetFunction(310);
    intptr_t val = (intptr_t)valAddress;
    UNUSED_PARAM(clazz)
    glGetMultisamplefv(pname, index, val);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glSampleMaski(JNIEnv *__env, jclass clazz, jint maskNumber, jint mask) {
    glSampleMaskiPROC glSampleMaski = (glSampleMaskiPROC)tlsGetFunction(639);
    UNUSED_PARAM(clazz)
    glSampleMaski(maskNumber, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetTexLevelParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetTexLevelParameterivPROC glGetTexLevelParameteriv = (glGetTexLevelParameterivPROC)tlsGetFunction(379);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexLevelParameteriv(target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetTexLevelParameterfv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetTexLevelParameterfvPROC glGetTexLevelParameterfv = (glGetTexLevelParameterfvPROC)tlsGetFunction(378);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexLevelParameterfv(target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glBindVertexBuffer(JNIEnv *__env, jclass clazz, jint bindingindex, jint buffer, jlong offset, jint stride) {
    glBindVertexBufferPROC glBindVertexBuffer = (glBindVertexBufferPROC)tlsGetFunction(30);
    UNUSED_PARAM(clazz)
    glBindVertexBuffer(bindingindex, buffer, (intptr_t)offset, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glVertexAttribFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset) {
    glVertexAttribFormatPROC glVertexAttribFormat = (glVertexAttribFormatPROC)tlsGetFunction(811);
    UNUSED_PARAM(clazz)
    glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glVertexAttribIFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jint relativeoffset) {
    glVertexAttribIFormatPROC glVertexAttribIFormat = (glVertexAttribIFormatPROC)tlsGetFunction(816);
    UNUSED_PARAM(clazz)
    glVertexAttribIFormat(attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glVertexAttribBinding(JNIEnv *__env, jclass clazz, jint attribindex, jint bindingindex) {
    glVertexAttribBindingPROC glVertexAttribBinding = (glVertexAttribBindingPROC)tlsGetFunction(806);
    UNUSED_PARAM(clazz)
    glVertexAttribBinding(attribindex, bindingindex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_glVertexBindingDivisor(JNIEnv *__env, jclass clazz, jint bindingindex, jint divisor) {
    glVertexBindingDivisorPROC glVertexBindingDivisor = (glVertexBindingDivisorPROC)tlsGetFunction(819);
    UNUSED_PARAM(clazz)
    glVertexBindingDivisor(bindingindex, divisor);
}

EXTERN_C_EXIT
