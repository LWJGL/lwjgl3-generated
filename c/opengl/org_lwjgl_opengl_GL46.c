/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glMultiDrawArraysIndirectCountPROC) (jint, const intptr_t, intptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsIndirectCountPROC) (jint, jint, const intptr_t, intptr_t, jint, jint);
typedef void (APIENTRY *glPolygonOffsetClampPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glSpecializeShaderPROC) (jint, const intptr_t, jint, const intptr_t, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL46_nglMultiDrawArraysIndirectCount__IJJII(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jlong drawcount, jint maxdrawcount, jint stride) {
    glMultiDrawArraysIndirectCountPROC glMultiDrawArraysIndirectCount = (glMultiDrawArraysIndirectCountPROC)tlsGetFunction(1015);
    const intptr_t indirect = (const intptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArraysIndirectCount(mode, indirect, (intptr_t)drawcount, maxdrawcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL46_nglMultiDrawElementsIndirectCount__IIJJII(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jlong drawcount, jint maxdrawcount, jint stride) {
    glMultiDrawElementsIndirectCountPROC glMultiDrawElementsIndirectCount = (glMultiDrawElementsIndirectCountPROC)tlsGetFunction(1022);
    const intptr_t indirect = (const intptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsIndirectCount(mode, type, indirect, (intptr_t)drawcount, maxdrawcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL46_glPolygonOffsetClamp(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units, jfloat clamp) {
    glPolygonOffsetClampPROC glPolygonOffsetClamp = (glPolygonOffsetClampPROC)tlsGetFunction(1255);
    UNUSED_PARAM(clazz)
    glPolygonOffsetClamp(factor, units, clamp);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL46_nglSpecializeShader__IJIJJ(JNIEnv *__env, jclass clazz, jint shader, jlong pEntryPointAddress, jint numSpecializationConstants, jlong pConstantIndexAddress, jlong pConstantValueAddress) {
    glSpecializeShaderPROC glSpecializeShader = (glSpecializeShaderPROC)tlsGetFunction(1556);
    const intptr_t pEntryPoint = (const intptr_t)pEntryPointAddress;
    const intptr_t pConstantIndex = (const intptr_t)pConstantIndexAddress;
    const intptr_t pConstantValue = (const intptr_t)pConstantValueAddress;
    UNUSED_PARAM(clazz)
    glSpecializeShader(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
}

EXTERN_C_EXIT
